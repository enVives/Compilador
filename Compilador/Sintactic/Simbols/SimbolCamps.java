package Compilador.Sintactic.Simbols;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolCamps extends SimbolBase {
    private String idb;
    private String tsb;
    private String tipus;
    private Location esquerre;
    private Character mode; //mode d:darrer o n:no

    public Character getMode() {
        return mode;
    }

    public Location getEsquerre() {
        return esquerre;
    }

    private Location dreta;

    public Location getDreta() {
        return dreta;
    }
    
    //si id-id -> cercam el tsb del component i l'afegim aquí, també tipus si en té, mvp = constant
    //si id(a,b,c) -> cercam el tipus de retorn de subprograma i el posam com a tipus i tipus subjacent
    //id normal -> res
    public SimbolCamps(String idb, String tsb, String tipus,Location esquerre,Location dreta){
        this.tsb = tsb;
        this.idb = idb;
        this.tipus = tipus;
        this.esquerre = esquerre;
        this.dreta = dreta;
        this.mode = 'n';
    }

    public SimbolCamps(){
        idb = null;
        tsb = null;
        tipus = null;
    }

    public SimbolCamps(String idb){
        this.idb = idb;
        this.mode = 'd';
    }

    public String getTipus() {
        return tipus;
    }

    public String getTsb() {
        return tsb;
    }

    public String getIdb() {
        return idb;
    }
}
