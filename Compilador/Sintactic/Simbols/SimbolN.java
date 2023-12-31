package Compilador.Sintactic.Simbols;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolN extends SimbolBase {
    private String ts_heretat; // el tipus que heretam del F esquerre o la operació esquerre
    private String tsb;
    private String tipus;
    private String mode;
    private Location esquerre;
    private String idb;

    public String getIdb() {
        return idb;
    }

    public Location getEsquerre() {
        return esquerre;
    }

    private Location dreta;

    public Location getDreta() {
        return dreta;
    }

    public SimbolN(String tsb, String tipus, String mode,Location esquerre,Location dreta) { // alerta amb no afegir el tsb
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.idb = null;
    }

    public SimbolN(String idb,String tsb, String tipus, String mode,Location esquerre,Location dreta) { // alerta amb no afegir el tsb
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.idb = idb;
    }

    public SimbolN() {
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
