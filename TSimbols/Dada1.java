import TD.Descripcio;

public class Dada1 {
    
    private Dada2 first;
    private Descripcio descripcio;
    private Integer np;


    public Dada1(Dada2 first, Descripcio descripcio, Integer np){
        this.first = first;
        this.descripcio = descripcio;
        this.np = np;
    }


    public Dada1(Descripcio descripcio, Integer np){
        this.descripcio = descripcio;
        this.np = np;
        first = null;
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

    public Integer np(){
        return np;
    }

    public Dada2 first(){
        return first;
    }

    public void set_first(Dada2 d){
        this.first = d;
    }



}
