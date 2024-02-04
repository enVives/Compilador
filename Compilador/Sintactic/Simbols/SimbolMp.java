package Compilador.Sintactic.Simbols;

import Compilador.Sintactic.ParserSym;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolMp extends SimbolBase {
    private String tsb; // ts_sintetitzat
    private String tipus; // tipus -> revisar
    private Integer operacio;
    private Location dreta;

    public Location getDreta() {
        return dreta;
    }

    public Integer getOperacio() {
        return operacio;
    }

    private String mode;

    public SimbolMp(String tsb, String tipus, Integer operacio, String mode, Location dreta, Integer n) { // alerta amb
                                                                                                          // no afegir
                                                                                                          // el tsb
        super();
        this.tsb = tsb;
        this.operacio = operacio;
        this.tipus = tipus;
        this.mode = mode;
        this.dreta = dreta;
        this.r = n;
    }

    public SimbolMp() {
        tsb = "ts_nul";
        tipus = "id_nula";
        mode = null;
    }

    private Integer r;

    public Integer getR() {
        return r;
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
