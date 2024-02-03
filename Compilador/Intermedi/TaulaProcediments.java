package Compilador.Intermedi;

import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.MidiDevice.Info;

public class TaulaProcediments {

    private ArrayList<InfoProcediment> llista;

    public ArrayList<InfoProcediment> getLlista() {
        return llista;
    }

    public TaulaProcediments() {
        llista = new ArrayList<>();
    }

    public void afegeix_procediment(Integer n, Integer etiqueta, Integer ocupacio, Integer parametres) {
        llista.add(new InfoProcediment(n, etiqueta, ocupacio, parametres));
    }

    public InfoProcediment get_procediment(Integer n) {
        return llista.get(n);
    }

    public Boolean conte_etiqueta(Integer etiqueta) {
        Iterator<InfoProcediment> it = llista.iterator();
        while (it.hasNext()) {
            InfoProcediment i = (InfoProcediment) it.next();
            if (i.getEtiqueta() == etiqueta) {
                return true;
            }
        }

        return false;
    }

    public class InfoProcediment {
        private Integer n;

        public Integer getN() {
            return n;
        }

        private Integer etiqueta;

        public Integer getEtiqueta() {
            return etiqueta;
        }

        private Integer ocupacio;

        public Integer getOcupacio() {
            return ocupacio;
        }

        private Integer parametres;

        public Integer getParametres() {
            return parametres;
        }

        public InfoProcediment(Integer n, Integer etiqueta, Integer ocupacio, Integer parametres) {
            this.n = n;
            this.etiqueta = etiqueta;
            this.ocupacio = ocupacio;
            this.parametres = parametres;
        }
    }
}
