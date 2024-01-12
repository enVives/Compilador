package Compilador.Intermedi;
import java.util.ArrayList;

public class TaulaVariables{

    ArrayList<Entrada> files;

    public TaulaVariables(){
        files = new ArrayList<>();
    }

    public Integer n(){
        return files.size();
    }

    public void afegeix_variable(String subprograma,Boolean parametre){
        files.add(new Entrada(subprograma, parametre));
    }

    public Entrada cerca_varaible(Integer n){
        return files.get(n);
    }


    public class Entrada{
        private String subprograma;
        public String getSubprograma() {
            return subprograma;
        }


        private Boolean parametre;


        public Boolean getParametre() {
            return parametre;
        }


        public Entrada(String subprograma,Boolean parametre){
            this.subprograma = subprograma;
            this.parametre = parametre;
        }
    }
}