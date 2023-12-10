package Compilador.TSimbols.TD;

public class Dcamp extends Descripcio {
    String tipus;
    String tsb;
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

    public Integer despl(){
        return despl;
    }

    public String tipus(){
        return tipus;
    }
}
