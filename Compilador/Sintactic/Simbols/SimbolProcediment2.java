package Compilador.Sintactic.Simbols;

public class SimbolProcediment2 extends SimbolBase {
    private String tipus;
    private Integer nivell;
    private Integer parametres;
    private Integer np;

    public Integer getNp() {
        return np;
    }

    public Integer getParametres() {
        return parametres;
    }

    public Integer getNivell() {
        return nivell;
    }

    private Integer etiqueta;

    public Integer getEtiqueta() {
        return etiqueta;
    }

    public String getTipus() {
        return tipus;
    }

    public SimbolProcediment2(String tipus,Integer nivell,Integer etiqueta,Integer parametres,Integer np){
        this.tipus = tipus;
        this.etiqueta = etiqueta;
        this.nivell = nivell;
        this.parametres = parametres;
        this.np = np;
    }

    public SimbolProcediment2(Integer nivell,Integer etiqueta,Integer parametres,Integer np){
        this.tipus = null;
        this.etiqueta = etiqueta;
        this.nivell = nivell;
        this.parametres = parametres;
        this.np =np;
    }
}
