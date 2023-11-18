package Compilador.Sintactic.Simbols;

public class SimbolEp extends SimbolBase {
    private String ts_heretat; //el tipus que heretam del F esquerre o la operació esquerre
    private String tsb;
    private String tipus;
    private String mode;

    public SimbolEp(String tsb, String tipus, String mode) { //alerta amb no afegir el tsb
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
    }

    public SimbolEp(){
        tsb = "ts_nul";
        tipus = "id_nula";
    }

    public String getTs_heretat() {
        return ts_heretat;
    }

    public void setTs_heretat(String ts_heretat) {
        this.ts_heretat = ts_heretat;
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
