package Compilador.Intermedi;

import java.util.ArrayList;

public class TaulaVariables {

    ArrayList<Entrada> files;

    public ArrayList<Entrada> getFiles() {
        return files;
    }

    public TaulaVariables() {
        files = new ArrayList<>();
    }

    public Integer n() {
        return files.size() - 1;
    }

    public void afegeix_variable(Integer subprograma, Boolean parametre, Integer ocupacio, Integer posicio) {
        files.add(new Entrada(subprograma, parametre, ocupacio, posicio));
    }

    public Entrada cerca_variable(Integer n) {
        if (n != null) {
            return files.get(n);
        }
        return null;
    }

    public void set_ocupacio(Integer n, Integer ocupacio) {
        files.get(n).setOcupacio(ocupacio);
    }

    public Integer get_ocupacio(Integer n) {
        return files.get(n).ocupacio();
    }

    public class Entrada {
        private Integer subprograma;

        public Integer getSubprograma() {
            return subprograma;
        }

        Integer ocupacio;

        public void setOcupacio(Integer ocupacio) {
            this.ocupacio = ocupacio;
        }

        public void afegeixOcupacio(Integer ocupacio) {
            this.ocupacio += ocupacio;
        }

        public Integer ocupacio() {
            return ocupacio;
        }

        private Boolean parametre;

        public Boolean getParametre() {
            return parametre;
        }

        private Integer posicio_pila;

        public void setPosicio_pila(Integer posicio_pila) {
            this.posicio_pila = posicio_pila;
        }

        public Integer getPosicio_pila() {
            return posicio_pila;
        }

        public Entrada(Integer subprograma, Boolean parametre, Integer ocupacio, Integer posicio_pila) {
            this.subprograma = subprograma;
            this.parametre = parametre;
            this.ocupacio = ocupacio;
            this.posicio_pila = posicio_pila;
        }
    }
}