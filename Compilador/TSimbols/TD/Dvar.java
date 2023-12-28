package Compilador.TSimbols.TD;
public class Dvar extends Descripcio {
    private static int nv =0;
    private String tipus;

    private String val = "";

    public Dvar(String t){
        super("dvar");
        nv++;
        tipus = t;
    }

    public int nv(){
        return nv;
    }

    public Dvar(){
        super("dvar");
        nv++;
    }

    public String tipus(){
        return tipus;
    }

    
}
