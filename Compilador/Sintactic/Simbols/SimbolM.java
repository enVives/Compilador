package Compilador.Sintactic.Simbols;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolM extends SimbolBase {
    private String tsb;
    private String tipus;
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

    public SimbolM(String tsb, String tipus, String mode, Location esquerre, Location dreta, Integer r) { // alerta amb
                                                                                                          // no afegir
                                                                                                          // el tsb
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.idb = null;
        this.r = r;
    }

    public SimbolM(String idb, String tsb, String tipus, String mode, Location esquerre, Location dreta, Integer r) { // alerta
                                                                                                                      // amb
                                                                                                                      // no
                                                                                                                      // afegir
                                                                                                                      // el
                                                                                                                      // tsb
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.idb = idb;
        this.r = r;
    }

    private Integer r;

    public Integer getR() {
        return r;
    }

    public SimbolM() {
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
