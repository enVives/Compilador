package Compilador.TSimbols.TD;

public class Dproc extends Descripcio {
    private static Integer np =0;
    private String tipus;


    public String getTipus() {
        return tipus;
    }

    public Dproc(){
        super("dproc");
        np++;
        tipus = "id_nula";
    }

     public Dproc(String tipus){
        super("dproc");
        np++;
        this.tipus = tipus;
    }

    public Integer np(){
        return np;
    }

}
