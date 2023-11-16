package TD;

import DT.DefinicioTipus;

public class Dtipus extends Descripcio{

    private DefinicioTipus dt;

    public Dtipus(DefinicioTipus dt){
        super("dtipus");
        this.dt = dt;
    }

    public DefinicioTipus dt(){
        return dt;
    }
}