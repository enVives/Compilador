package Compilador.Sintactic.Simbols;

import java.util.ArrayList;

import Compilador.Intermedi.TaulaIntermedi.Sentencia;

public class SimbolResta extends SimbolBase {
    private ArrayList<Sentencia> llista = new ArrayList<>();


    public ArrayList<Sentencia> getLlista() {
        return llista;
    }

    public SimbolResta(ArrayList<Sentencia>llista1){
        this.llista.addAll(llista1);
    }
}
