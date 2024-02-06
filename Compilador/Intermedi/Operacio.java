package Compilador.Intermedi;

public class Operacio {

    public static final int copia = 0;
    public static final int suma = 1;
    public static final int resta = 2;
    public static final int producte = 3;
    public static final int menys = 4;

    public static final int and = 5;
    public static final int or = 6;
    public static final int not = 7;

    public static final int skip = 8;
    public static final int salt_incondicional = 9;
    public static final int salt_condicional_igual = 10;
    public static final int salt_condicional_diferent = 11;

    public static final int crida = 12;
    public static final int retorn = 13;
    public static final int param_simple = 14;
    public static final int copia_valor = 15;
    public static final int ind_param = 16;
    public static final int pmb = 17;
    public static final int console_read = 18;
    public static final int console_write = 19;
    public static final int ind_assign = 20;
    public static final int espai_retorn = 21;

    public static final String[] mnemonic = new String[] {
            "copia",
            "suma",
            "resta",
            "producte",
            "menys",
            "and",
            "or",
            "not",
            "skip",
            "salt_incondicional",
            "salt_condicional_igual",
            "salt_condicional_diferent",
            "crida",
            "retorn",
            "param_simple",
            "param_compost",
            "copia_valor",
            "ind_param",
            "pmb",
            "console_read",
            "console_write",
            "ind_assign",
            "espai_retorn"
    };

}
