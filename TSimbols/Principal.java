import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import DT.DefinicioTipus;
import DT.Escalar;
import DT.Tupla;
import TD.Dcamp;
import TD.Dproc;
import TD.Dtipus;
import TD.Dvar;

public class Principal {

    FileWriter td;
    BufferedWriter td_1;
    FileWriter te;
    BufferedWriter te_1;
    FileWriter ta;
    BufferedWriter ta_1;
    Taula taula;

    public static void main(String[] args) {
        new Principal().main();
    }

    public void main(){
        carrega_fitxers();


        //Proves de Taula de Simbols

        taula = new Taula();

        /*
        //int in = 1;

        taula.posar("in", new Dvar("int"));
        taula.entra_bloc();
        taula.posar("i", new Dvar("int"));
        taula.posar("i", new Dvar("int"));
        taula.surtbloc();*/
        
        //tupla t = nou tupla(1,2,3,4);
        //tupla = dtipus -> s'ha de mirar que tupla sigui un tipus dins la ts
        //t = dvar -> li afegirem el tipus de tupla
        //1,2,3,4,5 = dcamp.

        /*
        taula.posar("tupla", new Dtipus(new Tupla()));
        taula.posar("t",new Dvar("tupla"));
        taula.posarcamp("t","1",new Dcamp("Integer", 0));
        taula.posarcamp("t","2",new Dcamp("Integer", 1));
        taula.posarcamp("t","5",new Dcamp("Integer", 2));

        */


        //metode nom int (int a, int b)
        //Dargin -> només de lectura -> se pot fer
        //Darg -> in i out -> per jo sempre in
        
        taula.posar("int", new Dtipus(new Escalar("ts_enter", Integer.MIN_VALUE, Integer.MAX_VALUE)));
        taula.posar("nom", new Dproc());
        taula.posarparam("nom","a",new Dvar("int"));
        escriu_fitxers();
    }

    public void escriu_fitxers(){
        HashMap<String,Dada1> mapa = taula.getTd();

        for (Map.Entry<String, Dada1> entry : mapa.entrySet()) {
            String key = entry.getKey();
            Dada1 value = entry.getValue();
            try {
                td_1.write("Identificador: " + key + ", Descripció: np: " + value.np()+ " Descripció -> TD:  "+value.td().td());
                td_1.write("\n");
            } catch (IOException e) {
                System.out.println("error");
            }
            
        }

        ArrayList<Dada2> llista = taula.getTe();
        Iterator it = llista.iterator();

        Dada2 dada2 = (Dada2) it.next();

        while(it.hasNext()){
            dada2 = (Dada2) it.next();
            try {
                te_1.write("Identificador: "+dada2.idcamp()+ " np: "+ dada2.np()+" Descripció ->TD: "+dada2.td().td());
                te_1.write("\n");
            } catch (IOException e) {
                System.out.println("error");
            }
        }

        try {
            td_1.close();
            te_1.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void carrega_fitxers(){
        try{
            td = new FileWriter("td.txt");
            td_1 = new BufferedWriter(td);

            te = new FileWriter("te.txt");
            te_1 = new BufferedWriter(te);

            ta = new FileWriter("ta.txt");
            ta_1 = new BufferedWriter(ta);
        }catch(IOException error){
            System.out.println(error.toString());
        }
    }
}
