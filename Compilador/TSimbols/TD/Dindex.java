package Compilador.TSimbols.TD;

public class Dindex extends Descripcio {
    private String tipus;
    public Dindex(String tipus){
        super("dindex");
        this.tipus = tipus;
    }

    public String tipus(){
        return tipus;
    }
}
