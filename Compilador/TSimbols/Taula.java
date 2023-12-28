package Compilador.TSimbols;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Compilador.TSimbols.TD.*;

public class Taula {

    // Mètodes que ha de tenir
    // buidar, entrabloc, posar, surtbloc, posarcamp, consultacamp,
    // posaindex,first,next,last,consulta.

    private int n;
    private ArrayList<Integer> ta; // taulad'ambits

    public ArrayList<Integer> getTa() {
        return ta;
    }

    private Integer idxe; // index

    /**
     *
     */
    private ArrayList<Dada2> te; // taula d'expansió

    public ArrayList<Dada2> getTe() {
        return te;
    }

    private Map<String, Dada1> td; // taula de descripció

    public Map<String, Dada1> getTd() {
        return td;
    }

    public Taula() {
        te = new ArrayList<Dada2>();
        td = new HashMap<>();
        ta = new ArrayList<Integer>();
        n = 0;
        idxe = n;
        ta.add(0, idxe);
        te.add(0, null);
    }

    public void entra_bloc() {
        n += 1;
        if (n >= ta.size()) {
            ta.add(n, ta.get(n - 1));
        } else {
            ta.set(n, ta.get(n - 1)); //sempre que posem un bloc serà a continuació del nivell anterior
        }

    }

    public Descripcio consulta(String id) {
        Dada1 dada = td.get(id);
        if(dada == null){
            return null;
        }else{
            return dada.td();
        }
    }

    public Dada1 consulta_tupla(String id){
        Dada1 dada = td.get(id);
        if(dada == null){
            return null;
        }else{
            return dada;
        }
    }

    public boolean posar(String id, Descripcio descripcio) {

        if (td.get(id) != null) { // si ja tenim una variable dins td amb el mateix id
            if (td.get(id).np() == n) {
                //System.out.println("Error, ja hi ha un identificador amb el nom: '"+id+"' dins el mateix àmbit");
                return false;
            }
            idxe = ta.get(n);
            idxe += 1;
            ta.add(n, idxe);
            if (idxe >= te.size()) {
                te.add(idxe, new Dada2(td.get(id).td(), td.get(id).np(), id));// ja hi ha un element a la posició
            } else {
                te.set(idxe, new Dada2(td.get(id).td(), td.get(id).np(), id)); // no hi ha cap element
            }

            td.get(id).set_np(n);
            td.get(id).set_td(descripcio);
            return true;
        } else {
            td.put(id, new Dada1(descripcio, n));
            return true;
        }
    }

    public boolean posarcamp(String idr, String idc, Descripcio dcamp) { // revisar

        Descripcio descripcio = td.get(idr).td();

        if (descripcio instanceof Dconst) {
            Dconst dconst = (Dconst) descripcio;
            Descripcio descripcio2 = td.get(dconst.tipus()).td();

            if (descripcio2 instanceof Dtipus) {
                Dtipus tipus = (Dtipus) descripcio2;
                if (tipus.dt().tipus_subjacent() != "ts_record") {
                    System.out.println("Error, l'identificador: '"+idr+"' no és una tupla");
                    return false;
                }
            }
        }

        Dada2 i = td.get(idr).first();

        while ((i != null) && (!i.idcamp().equals(idc))) {
            i = i.next();  
        }

        if (i != null) {
            //System.out.println("Error, el camp amb identificador: '"+idc+"' ja existeix");
            return false;
        }

        idxe = ta.get(n);
        idxe += 1;
        ta.add(n, idxe);
        if (idxe >= te.size()) {
            te.add(idxe, new Dada2(td.get(idr).first(), idc, -1, dcamp));
        } else {
            te.set(idxe, new Dada2(td.get(idr).first(), idc, -1, dcamp));
        }
        // hem afegit a la taula d'expansió el camp de la
        // tupla.
        td.get(idr).set_first(te.get(idxe)); // canviam el first de la tupla.
        return true;
    }

    public Descripcio consultacamp(String idr, String idc) {

        Descripcio descripcio = td.get(idr).td();

        if (descripcio instanceof Dconst) {
            Dconst dconst = (Dconst) descripcio;
            Descripcio descripcio2 = td.get(dconst.tipus()).td();

            if (descripcio2 instanceof Dtipus) {
                Dtipus tipus = (Dtipus) descripcio2;
                if (tipus.dt().tipus_subjacent() != "ts_record") {
                    System.out.println("Error, idr no és una tupla");
                    return null;
                }
            }else{
                System.out.println("No es dtipus");
            }
        } else {
            System.out.println("No es dconst");
            return null;
        }


        Dada2 i = td.get(idr).first();

        while ((i != null) && (i.idcamp().compareTo(idc)!=0)) {
            i = i.next();
        }

        if (i != null) {
            return i.td();
        } else {
            return null;
        }
    }

    public void surtbloc() {
        Integer idxi = ta.get(n);
        // antes de decrementar n, elmiminam totes les dades de td que tenen aquesta n

        n--;
        Integer idxf = ta.get(n);

        while (idxi > idxf) {
            if (te.get(idxi).np() != -1) {
                String id = te.get(idxi).idcamp();
                td.get(id).set_np(te.get(idxi).np());
                td.get(id).set_td(te.get(idxi).td());
                td.get(id).set_first(te.get(idxi).next());
            }
            idxi--;
        }

        ArrayList<String> llista = new ArrayList<>();

        td.forEach((key, value) -> {
            if (value.np() == n + 1) {
                llista.add(key);
            }
        });

        for (String element : llista) {
            td.remove(element);
        }

    }

    public Dada2 primer_parametre(String subprograma){
        return td.get(subprograma).first();
    }

    public boolean posarparam(String idpr, String idparam, Descripcio d) {
        Descripcio t = td.get(idpr).td();

        if (!(t instanceof Dproc)) {
            System.out.println("Error : l'dentificador '"+idpr+"' no és un subprograma");
            return false;
        }
        Dada2 dada = td.get(idpr).first();
        Dada2 idxe = null;

        while ((dada != null) && dada.idcamp() != idparam) {
            idxe = dada;
            dada = dada.next();
        }

        if (dada != null) {
            System.out.println("Error, ja hi ha un argument amb l'identificador '"+idparam+"'");
            return false;
        }

        Integer idx = ta.get(n);
        idx++;
        ta.set(n, idx); // hauria de ser set
        if (idx >= te.size()) {
            te.add(idx, new Dada2(null, idparam, -1, d));
        } else {
            te.set(idx, new Dada2(null, idparam, -1, d));
        }

        String tipus = "";

        if(d instanceof Darg){
            Darg arg = (Darg) d;
            tipus = arg.tipus();
        }

        String nou_nom = idpr + "_" + tipus;
        Dada2 first = td.get(idpr).first();
        td.remove(idpr);
        posar(nou_nom, new Dproc());
        td.get(nou_nom).set_first(first);

        if (idxe == null) {
            td.get(nou_nom).set_first(te.get(idx));
        } else {
            idxe.set_next(te.get(idx));
        }
        return true;
    }

    public void buidar() {
        n = 0;
        td = new HashMap<>();
        ta.set(n, 0);

        n = 1;
        ta.set(n, 0);
    }

}