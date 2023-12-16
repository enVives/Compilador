package Compilador.TSimbols.TD;

public class Dcamp extends Descripcio {
    String tipus;
    String tsb;
    String idb;

    public String getIdb() {
        return idb;
    }

    public String getTsb() {
        return tsb;
    }

    Integer despl;
    public Integer getDespl() {
        return despl;
    }

    public Dcamp(String tipus, Integer despl,String tsb){
        super("dcamp");
        this.tipus = tipus;
        this.despl = despl;
        this.tsb = tsb;
    }

    public Dcamp(String idb,String tipus, Integer despl,String tsb){
        super("dcamp");
        this.tipus = tipus;
        this.despl = despl;
        this.tsb = tsb;
        this.idb = idb;
    }

    public Integer despl(){
        return despl;
    }

    public String tipus(){
        return tipus;
    }
}
