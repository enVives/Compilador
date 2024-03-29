package Compilador.Sintactic.Simbols;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolF extends SimbolBase {
    private String tipus;
    private String tsb;
    private String mode;
    private String idb;

    public String getIdb() {
        return idb;
    }

    private Location esquerre;

    public Location getEsquerre() {
        return esquerre;
    }

    private Location dreta;

    public Location getDreta() {
        return dreta;
    }

    public SimbolF(String tsb, String tipus, String mode, Location esquerre, Location dreta, Integer r) {
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.idb = null;
        this.r = r;
    }

    public SimbolF(String idb, String tsb, String tipus, String mode, Location esquerre, Location dreta, Integer r) {
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.idb = idb;
        this.r = r;
    }

    // Atributs codi Intermedi

    private Integer r;

    public Integer getR() {
        return r;
    }

    private Integer d;

    public Integer getD() {
        return d;
    }

    public SimbolF() {
        super();
        tsb = "ts_nul";
        tipus = "id_nul";
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
