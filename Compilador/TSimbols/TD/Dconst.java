package Compilador.TSimbols.TD;

public class Dconst extends Descripcio {

    private Object valor;
    private String tipus;
    private Integer temporal;

    public Integer getTemporal() {
        return temporal;
    }

    public Dconst(Object v, String t) {
        super("dconst");
        tipus = t;
        valor = v;
    }

    public Dconst(String t, Integer temporal) {
        super("dconst");
        tipus = t;
        this.temporal = temporal;
        valor = null;
    }

    public Object valor() {
        return valor;
    }

    public String tipus() {
        return tipus;
    }
}
