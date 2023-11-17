package Compilador.TSimbols.DT;

public class Escalar extends DefinicioTipus {
    
    private Integer limit_inferior;
    private Integer limit_superior;

    public Escalar(String ts, Integer li, Integer ls){
        super(ts);
        limit_inferior = li;
        limit_superior = ls;
    }


    public Integer limit_inferior(){
        return limit_inferior;
    }

    public Integer limit_superior(){
        return limit_superior;
    }
}
