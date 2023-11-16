import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import TD.Dconst;
import TD.Descripcio;
import TD.Dproc;
import TD.Dtipus;
import TD.Dvar;

public class Taula{

    //Mètodes que ha de tenir
    // buidar, entrabloc, posar, surtbloc, posarcamp, consultacamp, posaindex,first,next,last,consulta.

    private int n;
    private ArrayList<Integer> ta; //taulad'ambits
    
    public ArrayList<Integer> getTa() {
        return ta;
    }

    private Integer idxe; //index

    /**
     *
     */
    private ArrayList<Dada2> te; //taula d'expansió
    
    public ArrayList<Dada2> getTe() {
        return te;
    }

    private HashMap<String,Dada1> td; //taula de descripció

    public HashMap<String, Dada1> getTd() {
        return td;
    }


    public Taula(){
        te = new ArrayList<Dada2>();
        td = new HashMap<>();
        ta = new ArrayList<Integer>();
        n =0;
        idxe = n;
        ta.add(0,idxe);
        te.add(0,null);
    }


    public void entra_bloc(){
        n += 1;
        ta.add(n,ta.get(n-1));
    }

    public Descripcio consulta(String id){
        return td.get(id).td();
    }

    public void posar(String id, Descripcio descripcio){

        if(td.get(id) != null){ //si ja tenim una variable dins td amb el mateix id
            if(td.get(id).np() == n) {System.out.println("Error, ja hi ha una variable amb aquest nom dins el mateix àmbit"); return;}
            idxe = ta.get(n);
            idxe+=1;
            ta.add(n,idxe);
            te.add(idxe,new Dada2(td.get(id).td(),td.get(id).np(),id));//no podem afegir a un index que no existeix

            td.get(id).set_np(n);
            td.get(id).set_td(descripcio);

        }else{
            td.put(id, new Dada1(descripcio, n));
        }
    }

    public void posarcamp(String idr, String idc, Descripcio dcamp){ //revisar

        Descripcio descripcio = td.get(idr).td();

        if(descripcio instanceof Dvar){
            Dvar dvar = (Dvar) descripcio;
            Descripcio descripcio2 = td.get(dvar.tipus()).td();

            if(descripcio2 instanceof Dtipus){
                Dtipus tipus = (Dtipus) descripcio2;
                if(tipus.dt().tipus_subjacent() != "ts_tupla"){
                    System.out.println("Error, idr no és una tupla");
                }
            }
        }else if (descripcio instanceof  Dconst){
            Dconst dconst = (Dconst) descripcio;
            Descripcio descripcio2 = td.get(dconst.tipus()).td();

            if(descripcio2 instanceof Dtipus){
                Dtipus tipus = (Dtipus) descripcio2;
                if(tipus.dt().tipus_subjacent() != "ts_tupla"){
                    System.out.println("Error, idr no és una tupla");
                }
            }
        }

        Dada2 i = td.get(idr).first();
        while((i != null)&&(i.idcamp() != idc)){
            i = i.next();
        }

        if(i != null){System.out.println("Error, el camp ja existeix");}

        idxe = ta.get(n);
        idxe +=1;
        ta.add(n,idxe);
        te.add(idxe,new Dada2(td.get(idr).first(),idc,-1,dcamp)); //hem afegit a la taula d'expansió el camp de la tupla.
        td.get(idr).set_first(te.get(idxe)); //canviam el first de la tupla.
    }


    public Descripcio consultacamp(String idr, String idc){

        Descripcio descripcio = td.get(idr).td();

        if(descripcio instanceof Dvar){
            Dvar dvar = (Dvar) descripcio;
            Descripcio descripcio2 = td.get(dvar.tipus()).td();

            if(descripcio2 instanceof Dtipus){
                Dtipus tipus = (Dtipus) descripcio2;
                if(tipus.dt().tipus_subjacent() != "ts_tupla"){
                    System.out.println("Error, idr no és una tupla");
                }
            }
        }else if (descripcio instanceof  Dconst){
            Dconst dconst = (Dconst) descripcio;
            Descripcio descripcio2 = td.get(dconst.tipus()).td();

            if(descripcio2 instanceof Dtipus){
                Dtipus tipus = (Dtipus) descripcio2;
                if(tipus.dt().tipus_subjacent() != "ts_tupla"){
                    System.out.println("Error, idr no és una tupla");
                }
            }
        }

        Dada2 i = td.get(idr).first();
        while((i != null)&&(i.idcamp() != idc)){
            i = i.next();
        }

        if(i!=null){
            return i.td();
        }else{
            return null;
        }
    }

    public void surtbloc(){ 
        Integer idxi = ta.get(n);
        //antes de decrementar n, elmiminam totes les dades de td que tenen aquesta n
    
        n--;
        Integer idxf = ta.get(n);

        while(idxi > idxf){
            if(te.get(idxi).np() != -1){
                String id = te.get(idxi).idcamp();
                td.get(id).set_np(te.get(idxi).np());
                td.get(id).set_td(te.get(idxi).td());
                td.get(id).set_first(te.get(idxi).next());
            }
            idxi--;
        }

        //eliminam de la taula de dewscripció, tots els símbols que tenen np =  n+1;
        //És a dir, un nivell superior.
        for (Map.Entry<String, Dada1> entry : td.entrySet()) {
            String key = entry.getKey();
            Dada1 value = entry.getValue();
            if(value.np() == n+1){
                td.remove(key);
            }
        }
    }

    public void posarparam(String idpr,String idparam,Descripcio d){
        Descripcio t = td.get(idpr).td();

        if(!(t instanceof Dproc)){System.out.println("Error : idpr no és un subprograma");}
        Dada2 dada = td.get(idpr).first();
        Dada2 idxe = null;

        while((dada != null) && dada.idcamp() != idparam){
            idxe = dada;
            dada = dada.next();
        }

        if(dada!= null){System.out.println("Error, ja hi ha un argument amb el mateix identificador");}

        Integer idx = ta.get(n);
        idx++;
        ta.add(n,idx);
        te.add(idx,new Dada2(null,idparam,-1,d));

        if(idxe == null){
            td.get(idpr).set_first(null);
        }else{
            idxe.set_next(te.get(idx));
        }
    }

    public void buidar(){
        n = 0;
        td = new HashMap<>();
        ta.set(n, 0);

        n = 1;
        ta.set(n, 0);
    }
    
    
}