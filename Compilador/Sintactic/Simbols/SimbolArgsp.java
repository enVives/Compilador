package Compilador.Sintactic.Simbols;

import java.util.Stack;

public class SimbolArgsp extends SimbolBase {
    private Stack<KeyValor> llista;

    public SimbolArgsp(){
        llista = new Stack<>();
    }

    public SimbolArgsp(Stack<KeyValor> llista){
        this.llista = llista;
    }
    
    public Stack<KeyValor> getLlista() {
        return llista;
    }

    //si no tenim id, id = null
    public void afegeix(String id,String tipus){
        llista.push(new KeyValor(id, tipus));
    }
    public class KeyValor{
        public String key;
        public String tipus;

        public KeyValor(String key,String tipus){
            this.tipus =tipus;
            this.key = key;
        }
    }
}
