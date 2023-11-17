package Compilador.TSimbols.TD;
public class Darg extends Descripcio {
    private String tipus;
    private Integer mode;
    private String nom;

    public Darg(String tipus,String nom){
        super("darg");
        this.tipus = tipus;
        this.nom = nom;
    }

    public String tipus(){
        return tipus;
    }

    public String nom(){
        return nom;
    }
}
