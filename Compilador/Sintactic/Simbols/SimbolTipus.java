package Compilador.Sintactic.Simbols;

public class SimbolTipus extends SimbolBase {
    private String tipus;

    public String getTipus() {
        return tipus;
    }

    public SimbolTipus(String tipus){
        this.tipus = tipus;
    }
}
