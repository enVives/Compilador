package Compilador.Sintactic.Simbols;

import java_cup.runtime.ComplexSymbolFactory.Location;


public class SimbolT extends SimbolBase {
    private String ts_heretat; //el tipus que heretam del F esquerre o la operació esquerre
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

    public SimbolT(String tsb, String tipus, String mode,Location esquerre,Location dreta,Integer r) { //alerta amb no afegir el tsb
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.idb = null;
        this.r = r;
    }
    
    public SimbolT(String idb,String tsb, String tipus, String mode,Location esquerre,Location dreta,Integer r) { //alerta amb no afegir el tsb
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.idb = idb;
        this.r = r;
    }
    public SimbolT(){
        tsb = "ts_nul";
        tipus = "id_nula";
    }

    private Integer r;

    public Integer getR() {
        return r;
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
