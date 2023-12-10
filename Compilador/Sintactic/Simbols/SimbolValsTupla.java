package Compilador.Sintactic.Simbols;

import java.util.ArrayList;
import java.util.Stack;

public class SimbolValsTupla extends SimbolBase {
    
    private Stack<KeyValue> llista;

    public SimbolValsTupla(){
        llista = new Stack<>();
    }

    public SimbolValsTupla(Stack<KeyValue> llista){
        this.llista = llista;
    }
    
    public Stack<KeyValue> getLlista() {
        return llista;
    }

    //si no tenim id, id = null
    public void afegeix(String id,SimbolE value){
        llista.push(new KeyValue(id, value));
    }
    public class KeyValue{
        public String key;
        public SimbolE value;

        public KeyValue(String key,SimbolE value){
            this.value =value;
            this.key = key;
        }
    }
}
