import TD.Descripcio;

public class Dada2 {
    
    private Dada2 next;
    private String idcamp;
    private Integer np;
    private Descripcio descripcio;

    public Dada2(Dada2 next,String idcamp,Integer np, Descripcio descripcio){
        this.idcamp = idcamp;
        this.np = np;
        this.descripcio = descripcio;
        this.next = next;
    }

    public Dada2(Descripcio descripcio, Integer np, String idcamp){
        this.np = np;
        this.descripcio = descripcio;
        this.idcamp = idcamp;
    }

    public Descripcio td(){
        return descripcio;
    }

    public void set_td(Descripcio td){
        descripcio = td;
    }

    public void set_np(Integer np){
        this.np = np;
    }

    public void set_next(Dada2 next){
        this.next = next;
    }

    public Dada2 next(){
        return next;
    }

    public Integer np(){
        return np;
    }

    public String idcamp(){
        return idcamp;
    }
    
}
