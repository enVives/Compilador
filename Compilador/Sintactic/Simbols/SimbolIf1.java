package Compilador.Sintactic.Simbols;

public class SimbolIf1 extends SimbolBase {
    
    private Integer etiqueta;

    public Integer getEtiqueta() {
        return etiqueta;
    }

    public SimbolIf1 (Integer etiqueta){
        this.etiqueta = etiqueta;
    }

    public SimbolIf1 (){
        this.etiqueta = null;
    }
}
