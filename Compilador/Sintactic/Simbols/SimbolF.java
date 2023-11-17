package Compilador.Sintactic.Simbols;

public class SimbolF extends SimbolBase {
    private String tipus;
    private String tsb;
    private String mode;

    public SimbolF(String tsb, String tipus, String mode) {
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
    }

    public SimbolF(){
        super();
        tsb = "ts_nula";
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
