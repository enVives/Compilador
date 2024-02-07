package Compilador.TSimbols.DT;

public class Escalar extends DefinicioTipus {

    private Integer limit_inferior;
    private Integer limit_superior;
    private Integer bytes;

    public Integer getBytes() {
        return bytes;
    }

    public Escalar(String ts, Integer li, Integer ls, Integer bytes) {
        super(ts);
        limit_inferior = li;
        limit_superior = ls;
        this.bytes = bytes;
    }

    public Integer limit_inferior() {
        return limit_inferior;
    }

    public Integer limit_superior() {
        return limit_superior;
    }
}
