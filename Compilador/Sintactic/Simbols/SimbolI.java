package Compilador.Sintactic.Simbols;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolI extends SimbolBase {
    //operacions si = += , as = ++ , ar = --, ri = -=, ig = =
    private String operacio;
    public String getOperacio() {
        return operacio;
    }
    private String tipus;
    public String getTipus() {
        return tipus;
    }
    private String tsb;

    public String getTsb() {
        return tsb;
    }

    private Location esquerre,dreta;

    public Location getDreta() {
        return dreta;
    }

    public Location getEsquerre() {
        return esquerre;
    }

    public SimbolI(String operacio,String tipus,String tsb,Location esquerre,Location dreta){
        this.operacio = operacio;
        this.tipus = tipus;
        this.tsb = tsb;
        this.esquerre = esquerre;
        this.dreta = dreta;
    }

    public SimbolI(String operacio,String tipus,String tsb){
        this.operacio = operacio;
        this.tipus = tipus;
        this.tsb = tsb;
        this.esquerre = esquerre;
        this.dreta = dreta;
    }

    public SimbolI(){
        operacio =null;
    }
}
