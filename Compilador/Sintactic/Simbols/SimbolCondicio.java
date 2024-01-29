package Compilador.Sintactic.Simbols;

import java.util.ArrayList;

import Compilador.Intermedi.TaulaIntermedi.Sentencia;

public class SimbolCondicio extends SimbolBase {
    private ArrayList<Sentencia> llista = new ArrayList<>();
    private Integer r;


    public Integer getR() {
        return r;
    }

    public ArrayList<Sentencia> getLlista() {
        return llista;
    }

    public SimbolCondicio(ArrayList<Sentencia>llista1,Integer r){
        this.llista.addAll(llista1);
        this.r = r;
    }
}
