package Compilador.Sintactic.Simbols;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolModifTipus extends SimbolBase {
    private String tsb;

    public String getTsb() {
        return tsb;
    }

    private String tipus;
    private Location esquerre;
    public Location getEsquerre() {
        return esquerre;
    }


    private Location dreta;

    public Location getDreta() {
        return dreta;
    }


    public SimbolModifTipus(){
        tsb = "ts_nul";
        tipus = "id_nula";
    }


    public SimbolModifTipus(String tsb, String tipus,Location esquerre,Location dreta,Integer r){
        this.tsb = tsb;
        this.tipus = tipus;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.r = r;
    }

    private Integer r;

    public Integer getR() {
        return r;
    }


    public String getTipus() {
        return tipus;
    }
}
