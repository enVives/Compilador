package Compilador.Sintactic.Simbols;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolEntrada {
    private String tipus;
    private Integer r;
    private String tsb;
    private Location esquerre, dreta;

    public Location getDreta() {
        return dreta;
    }

    public Location getEsquerre() {
        return esquerre;
    }

    public String getTsb() {
        return tsb;
    }

    public SimbolEntrada(String tipus, String tsb, Integer r, Location esquerre, Location dreta) {
        this.tipus = tipus;
        this.r = r;
        this.tsb = tsb;
        this.esquerre = esquerre;
        this.dreta = dreta;
    }

    public Integer getR() {
        return r;
    }

    public String getTipus() {
        return tipus;
    }
}
