package Compilador.Intermedi;
import java.util.ArrayList;

public class TaulaProcediments {
    
    private ArrayList<InfoProcediment> llista;

    public TaulaProcediments(){
        llista = new ArrayList<>();
    }

    public void afegeix_procediment(Integer n, Integer etiqueta,Integer ocupacio,Integer parametres){
        llista.add(new InfoProcediment(n, etiqueta, ocupacio, parametres));
    }

    public InfoProcediment get_procediment(Integer n){
        return llista.get(n);
    }


    public class InfoProcediment{
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


        public InfoProcediment(Integer n, Integer etiqueta, Integer ocupacio, Integer parametres){
            this.n = n;
            this.etiqueta = etiqueta;
            this.ocupacio = ocupacio;
            this.parametres = parametres;
        }
    }
}
