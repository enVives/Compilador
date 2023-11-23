package Compilador.Sintactic.Simbols;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolF extends SimbolBase {
    private String tipus;
    private String tsb;
    private String mode;
    private Location esquerre;
    
    public Location getEsquerre() {
        return esquerre;
    }

    private Location dreta;


    public Location getDreta() {
        return dreta;
    }

    public SimbolF(String tsb, String tipus, String mode,Location esquerre,Location dreta) {
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
        this.esquerre = esquerre;
        this.dreta = dreta;
    }

    public SimbolF(){
        super();
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
