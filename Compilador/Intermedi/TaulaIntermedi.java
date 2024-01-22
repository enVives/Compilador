package Compilador.Intermedi; 
import java.util.ArrayList;

public class TaulaIntermedi {
    private ArrayList<Sentencia> llista;
    public TaulaIntermedi(){
        llista = new ArrayList<>();
    }

    public void genera(Integer mnemonic,Object op1, Integer op2,Integer desti){
        llista.add(new Sentencia(mnemonic, op1, op2, desti));
    }

    public ArrayList<Sentencia> get_Llista(){
        return llista;
    }

    public class Sentencia{
        private Integer operacio;
        public Integer getOperacio() {
            return operacio;
        }

        private Object op1;
        public Object getOp1() {
            return op1;
        }

        private Integer op2;
        public Integer getOp2() {
            return op2;
        }

        private Integer desti;

        public Integer getDesti() {
            return desti;
        }

        public Sentencia(Integer operacio,Object op1, Integer op2,Integer desti){
            this.operacio = operacio;
            this.op1 = op1;
            this.op2 = op2;
            this.desti = desti;
        }
    }
}
