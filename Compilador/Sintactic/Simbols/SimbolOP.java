package Compilador.Sintactic.Simbols;

public class SimbolOP extends SimbolBase {
    private String ts_heretat; //el tipus que heretam del F esquerre o la operació esquerre
    private String tsb;
    private String tipus;
    private String mode;

    public SimbolOP(String ts_heretat, String tsb, String tipus, String mode) {
        super();
        this.ts_heretat = ts_heretat;
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
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
