package Compilador.TSimbols.TD;
public class Dconst extends Descripcio {
    
    private Object valor;
    private String tipus;

    public Dconst(Object v, String t){
        super("dconst");
        tipus = t;
        valor = v;
    }

    public Dconst(String t){
        super("dconst");
        tipus = t;
        valor = null;
    }

    public Object valor(){
        return valor;
    }

    public String tipus(){
        return tipus;
    }
}
