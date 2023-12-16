package Compilador.Sintactic.Simbols;

public class SimbolArg extends SimbolBase {
    private String id;
    public String getId() {
        return id;
    }

    private String tipus;




    public String getTipus() {
        return tipus;
    }




    public SimbolArg(String id, String tipus){
        this.id = id;
        this.tipus = tipus;
    }
}
