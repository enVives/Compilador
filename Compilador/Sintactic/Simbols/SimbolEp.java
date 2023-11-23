package Compilador.Sintactic.Simbols;

import Compilador.Sintactic.ParserSym;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolEp extends SimbolBase {
    private String ts_heretat; // el tipus que heretam del F esquerre o la operació esquerre
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

    public SimbolEp(String tsb, String tipus, Integer operacio, String mode,Location dreta) { // alerta amb no afegir el tsb
        super();
        this.tsb = tsb;
        this.operacio = operacio;
        this.tipus = tipus;
        this.mode = mode;
        this.ts_heretat = null;
        this.dreta = dreta;
    }

    public String obtenir_sintetitzat() {
        String str = "ts_nul";
        if (ts_heretat != null) { // assumim que tsb heretat i sintetitzat no son null
            switch (operacio) {
                case ParserSym.AND:
                break;
                case ParserSym.OR:
                break;
            }
        }

        return str;
    }


    public SimbolEp(){
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
