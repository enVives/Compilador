package Compilador.Sintactic.Simbols;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class SimbolR {
    private String idb;
    private String tsb;
    private String tipus;
    private String mvp;
    private Location esquerre;

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
    public SimbolR(String idb, String tsb, String tipus, String mvp,Location esquerre,Location dreta){
        this.mvp = mvp;
        this.tsb = tsb;
        this.idb = idb;
        this.tipus = tipus;
        this.esquerre = esquerre;
        this.dreta = dreta;
    }

    public SimbolR(){
        idb = null;
        tsb = null;
        tipus = null;
        mvp = null;
    }
    public String getMvp() {
        return mvp;
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
