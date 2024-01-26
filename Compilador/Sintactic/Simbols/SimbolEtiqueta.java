package Compilador.Sintactic.Simbols;

import java.util.ArrayList;

import Compilador.Intermedi.TaulaIntermedi;
import Compilador.Intermedi.TaulaIntermedi.*;

public class SimbolEtiqueta extends SimbolBase {
    private ArrayList<Sentencia> llista;

    public ArrayList<Sentencia> getLlista() {
        return llista;
    }

    public SimbolEtiqueta(ArrayList<Sentencia>llista){
        this.llista = llista;
    }
    
}
