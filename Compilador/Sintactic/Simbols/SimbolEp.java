package Compilador.Sintactic.Simbols;

import Compilador.Sintactic.ParserSym;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolEp extends SimbolBase {
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

    private Integer r;

    public Integer getR() {
        return r;
    }

    public SimbolEp(String tsb, String tipus, Integer operacio, String mode, Location dreta, Integer r) { // alerta amb
                                                                                                          // no afegir
                                                                                                          // el tsb
        super();
        this.tsb = tsb;
        this.operacio = operacio;
        this.tipus = tipus;
        this.mode = mode;
        this.dreta = dreta;
        this.r = r;
    }

    public SimbolEp() {
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
