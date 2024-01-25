package Compilador.Sintactic.Simbols;

import Compilador.Sintactic.ParserSym;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolTp extends SimbolBase {
    private String ts_heretat; //el tipus que heretam del F esquerre o la operació esquerre
    private String tsb;
    private String tipus;
    private String mode;
    private Integer operacio;

    private Location dreta;


    public Location getDreta() {
        return dreta;
    }

    public Integer getOperacio() {
        return operacio;
    }

    public void setOperacio(Integer operacio) {
        this.operacio = operacio;
    }

    public SimbolTp(String tsb, String tipus, Integer operacio, String mode,Location dreta,Integer r) { // alerta amb no afegir el tsb
        super();
        this.tsb = tsb;
        this.operacio = operacio;
        this.tipus = tipus;
        this.mode = mode;
        this.ts_heretat = null;
        this.dreta = dreta;
        this.r = r;
    }
    private Integer r;


    public Integer getR() {
        return r;
    }

    public SimbolTp(){
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
