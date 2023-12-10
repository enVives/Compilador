package Compilador.Sintactic.Simbols;

import java.util.ArrayList;

public class SimbolValors extends SimbolBase {
    private ArrayList<SimbolE> llista;

    public SimbolValors(){
        llista = new ArrayList<>();
    }

    public SimbolValors(ArrayList<SimbolE> llista){
        this.llista = llista;
    }

    public void afegirE(SimbolE id){
        llista.add(id);
    }

    public ArrayList<SimbolE> getLlista() {
        return llista;
    }

}