package Compilador.Sintactic.Simbols;

public class SimbolE extends SimbolBase {
    private String tsb;
    private String tipus;
    private String mode;

    public SimbolE(String tsb, String tipus, String mode) {
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
    }

    public SimbolE(){
        tsb = "ts_nul";
        tipus = "id_nula";
    }

    public String getTsb() {
        return tsb;
    }

    public void setTsb(String tsb) {
        this.tsb = tsb;
    }

    public String getTipus() {
        return tipus;
    }

    public String getMode() {
        return mode;
    }

}
