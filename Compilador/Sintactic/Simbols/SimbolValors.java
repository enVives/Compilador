package Compilador.Sintactic.Simbols;

import java.util.ArrayList;
import java.util.Stack;

public class SimbolValors extends SimbolBase {
    private Stack<SimbolE> llista;

    public SimbolValors() {
        llista = new Stack<>();
    }

    public SimbolValors(Stack<SimbolE> llista) {
        this.llista = llista;
    }

    public void afegirE(SimbolE id) {
        llista.push(id);
    }

    public Stack<SimbolE> getLlista() {
        return llista;
    }

}