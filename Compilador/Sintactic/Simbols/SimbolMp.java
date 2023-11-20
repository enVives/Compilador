package Compilador.Sintactic.Simbols;

import Compilador.Sintactic.ParserSym;

public class SimbolMp extends SimbolBase {
    private String ts_heretat; // el tipus que heretam del F esquerre o la operació esquerre
    private String tsb; // ts_sintetitzat
    private String tipus; // tipus -> revisar
    private Integer operacio;

    public Integer getOperacio() {
        return operacio;
    }

    private String mode;

    public SimbolMp(String tsb, String tipus, Integer operacio, String mode) { // alerta amb no afegir el tsb
        super();
        this.tsb = tsb;
        this.operacio = operacio;
        this.tipus = tipus;
        this.mode = mode;
        this.ts_heretat = null;
    }

    public SimbolMp() {
        tsb = "ts_nul";
        tipus = "id_nula";
        ts_heretat = null;
        mode = null;
    }

    public String getTs_heretat() {
        return ts_heretat;
    }

    public String obtenir_sintetitzat() {
        String str = "ts_nul";
        if (ts_heretat != null) { // assumim que tsb heretat i sintetitzat no son null
            switch (operacio) {
                case ParserSym.MULT:
                    if ((tsb == "ts_decimal") || (ts_heretat == "ts_decimal")) {
                        str = "ts_decimal";
                    } else {
                        str = "ts_enter";
                    }
                    break;
                case ParserSym.DIV:
                    if ((tsb == "ts_decimal") || (ts_heretat == "ts_decimal")) {
                        str = "ts_decimal";
                    } else {
                        str = "ts_enter";
                    }
                    break;
                case ParserSym.MOD:
                    if ((tsb == "ts_decimal") || (ts_heretat == "ts_decimal")) {
                        str = "ts_nul"; //error, no es pot fer mod de dos decimals o un
                    } else {
                        str = "ts_enter";
                    }
                    break;
            }
        }

        return str;
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
