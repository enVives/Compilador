package Compilador.TSimbols.TD;

public class Dproc extends Descripcio {
    private static Integer np =0;
    private Integer my_np = 0;
    private String tipus;


    public String getTipus() {
        return tipus;
    }

    public Dproc(){
        super("dproc");
        my_np = np++;
        tipus = "id_nula";
    }

     public Dproc(String tipus){
        super("dproc");
        my_np = np++;
        this.tipus = tipus;
    }

    public Dproc(Boolean canvi_nom){
        super("dproc");
        my_np = np-1;
        tipus = "id_nula";
    }

    public Dproc(Boolean canvi_nom,String tipus){
        super("dproc");
        my_np = np-1;
        this.tipus = tipus;
    }

    public Integer np(){
        return my_np;
    }

}
