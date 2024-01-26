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

    private Integer r;

    public Integer getR() {
        return r;
    }

    public SimbolI(String operacio,String tipus,String tsb,Location esquerre,Location dreta,Integer r){
        this.operacio = operacio;
        this.tipus = tipus;
        this.tsb = tsb;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.r = r;
    }

    public SimbolI(String operacio,String tipus,String tsb,Location esquerre,Location dreta){
        this.operacio = operacio;
        this.tipus = tipus;
        this.tsb = tsb;
        this.esquerre = esquerre;
        this.dreta = dreta;
        r = null;
    }

    public SimbolI(){
        operacio =null;
    }
}
