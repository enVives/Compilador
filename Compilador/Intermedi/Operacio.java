package Compilador.Intermedi;

public class Operacio {

    public static final int copia = 0;
    public static final int suma = 1;
    public static final int resta = 2;
    public static final int producte = 3;
    public static final int divisio = 4;
    public static final int modul = 5;
    public static final int menys = 6;

    public static final int and = 7;
    public static final int or = 8;
    public static final int not = 9;

    public static final int skip = 10;
    public static final int salt_incondicional = 11;
    public static final int salt_condicional_igual = 12;
    public static final int salt_condicional_diferent = 13;

    public static final int crida = 14;
    public static final int retorn = 15;
    public static final int param_simple = 16;
    public static final int param_compost = 17; // per tuples
    public static final int copia_valor = 18;
    public static final int ind_param = 19;
    public static final int pmb = 20;
    public static final int console_read = 21;
    public static final int console_write = 22;
    public static final int ind_assign = 23;

    public static final String[] mnemonic = new String[] {
            "copia",
            "suma",
            "resta",
            "producte",
            "divisio",
            "modul",
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
            "ind_assign"
    };

}
