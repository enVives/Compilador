package Compilador.Sintactic.Simbols;

import java.util.ArrayList;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolA {
    private ArrayList<String> llista;
    private Location esquerre;
    public Location getEsquerre() {
        return esquerre;
    }

    private Location dreta;

    public Location getDreta() {
        return dreta;
    }
    public SimbolA(Location esquerre,Location dreta){
        llista = new ArrayList<>();
        this.esquerre = esquerre;
        this.dreta = dreta;
    }
    public SimbolA(ArrayList<String> llista,Location esquerre,Location dreta){
        this.llista = llista;
        this.esquerre = esquerre;
        this.dreta = dreta;
    }

    public void afegir_id(String id){
        llista.add(id);
    }

    public boolean conte(String id){
        return llista.contains(id);
    }

    public ArrayList<String> getLlista() {
        return llista;
    }

}
