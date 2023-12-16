package Compilador.Sintactic.Simbols;

import java.util.Stack;
import Compilador.Sintactic.Simbols.SimbolArgsp.KeyValor;

public class SimbolArgs {
    private Stack<KeyValor> llista;

    public SimbolArgs(){
        llista = new Stack<>();
    }

    public SimbolArgs(Stack<KeyValor> llista){
        this.llista = llista;
    }
    
    public Stack<KeyValor> getLlista() {
        return llista;
    }
}
