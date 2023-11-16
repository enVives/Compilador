package TD;

public class Dproc extends Descripcio {
    private static Integer np =0;
    public Dproc(){
        super("dproc");
        np++;
    }

    public Integer np(){
        return np;
    }
}
