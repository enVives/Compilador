package Compilador.Sintactic.Simbols;

public class SimbolModifTipus extends SimbolBase {
    private String tsb;
    public String getTsb() {
        return tsb;
    }


    private String tipus;


    public SimbolModifTipus(){
        tsb = "ts_nul";
        tipus = "id_nula";
    }


    public SimbolModifTipus(String tsb, String tipus){
        this.tsb = tsb;
        this.tipus = tipus;
    }


    public String getTipus() {
        return tipus;
    }
}
