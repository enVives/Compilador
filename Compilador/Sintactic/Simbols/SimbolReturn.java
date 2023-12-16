package Compilador.Sintactic.Simbols;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolReturn extends SimbolBase {
    private SimbolE expresio;
    private Location esquerre,dreta;

    public Location getDreta() {
        return dreta;
    }

    public Location getEsquerre() {
        return esquerre;
    }

    public SimbolE getExpresio() {
        return expresio;
    }

    public SimbolReturn(SimbolE expresio,Location esquerre,Location dreta){
        this.expresio = expresio;
        this.esquerre = esquerre;
        this.dreta = dreta;
    }
}
