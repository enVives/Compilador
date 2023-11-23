package Compilador.Sintactic.Simbols;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolE extends SimbolBase {
    private String tsb;
    private String tipus;
    private String mode;
    private Location esquerre,dreta;

    public Location getEsquerre() {
        return esquerre;
    }

    public Location getDreta() {
        return dreta;
    }

    public SimbolE(String tsb, String tipus, String mode,Location esquerre,Location dreta) {
        super();
        this.tsb = tsb;
        this.tipus = tipus;
        this.mode = mode;
        this.esquerre = esquerre;
        this.dreta = dreta;
    }

    public SimbolE(){
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
