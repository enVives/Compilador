package TD;

public class Dargin extends Descripcio {
    private int nv;
    private String tipus;

    public Dargin(int n, String t){
        super("darg_in");
        nv = n;
        tipus = t;
    }

    public int nv(){
        return nv;
    }

    public String tipus(){
        return tipus;
    }
}
