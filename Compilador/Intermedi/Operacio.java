package Compilador.Intermedi; 

public class Operacio {
    
    public static final int copia = 0;
    public static final int suma =1;
    public static final int resta = 2;
    public static final int producte = 3;
    public static final int divisio = 4;
    public static final int modul = 5;
    public static final int menys = 6;

    public static final int and = 7;
    public static final int or = 8;
    public static final int not =9;

    public static final int skip = 10;
    public static final int salt_incondicional = 11;
    public static final int salt_condicional_menor = 12;
    public static final int salt_condicional_menorigual = 13;
    public static final int salt_condicional_igual = 14;
    public static final int salt_condicional_diferent = 15;
    public static final int salt_condicional_majorigual = 16;
    public static final int salt_condicional_major = 17;


    public static final int menor = 18;
    public static final int menorigual = 19;
    public static final int igual = 20;
    public static final int diferent = 21;
    public static final int majorigual = 22;
    public static final int major = 23;

    public static final int inicialitzacio = 24;
    public static final int crida = 25;
    public static final int retorn = 26;
    public static final int param_simple = 27;
    public static final int param_compost = 28; // per tuples

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
        "salt_condicional_menor",
        "salt_condicional_menorigual",
        "salt_condicional_igual",
        "salt_condicional_diferent",
        "salt_condicional_majorigual",
        "salt_condicional_major",
        "menor",
        "menorigual",
        "igual",
        "diferent",
        "majorigual",
        "major",
        "inicialitzacio",
        "crida",
        "retorn",
        "param_simple",
        "param_compost"
    };

}
