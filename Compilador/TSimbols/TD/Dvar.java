package Compilador.TSimbols.TD;
public class Dvar extends Descripcio {
    private static int nv =0;
    private int my_nv;
    public int getMy_nv() {
        return my_nv;
    }

    private String tipus;


    public Dvar(String t){
        super("dvar");
        my_nv = nv++;
        tipus = t;
    }

    public int nv(){
        return nv;
    }

    public Dvar(){
        super("dvar");
        my_nv = nv++;
    }

    public String tipus(){
        return tipus;
    }

    
}
