package TD;

public class Dcamp extends Descripcio {
    String tipus;
    Integer despl;
    public Dcamp(String tipus, Integer despl){
        super("dcamp");
        this.tipus = tipus;
        this.despl = despl;
    }

    public Integer despl(){
        return despl;
    }

    public String tipus(){
        return tipus;
    }
}
