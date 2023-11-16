package TD;
public class Dvar extends Descripcio {
    private static int nv =0;
    private String tipus;

    public Dvar(String t){
        super("dvar");
        nv++;
        tipus = t;
    }

    public int nv(){
        return nv;
    }

    public String tipus(){
        return tipus;
    }

    
}
