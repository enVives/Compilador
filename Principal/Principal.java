package Principal;

import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringReader;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.Symbol;
import java_cup.runtime.SymbolFactory;

import Compilador.Lexic.Scanner;
import Compilador.Sintactic.Parser;
public class Principal {
    /**
     * @param args arguments de línia de comanda
     */
    public static void main(String[] args) {
        Reader fitxer;
        boolean bol = 1+1<=1+1;
        Double b = 1 % 1 * 1.25;
        try {
            fitxer = new FileReader("/home/perejoan/Documentos/GitHub/Compilador/Principal/prova.txt");
            Scanner scanner = new Scanner(fitxer);
        
            SymbolFactory sf = new ComplexSymbolFactory();
            Parser parser = new Parser(scanner, sf);
            parser.parse();
        } catch(Exception e) {
            System.err.println("error: "+e);
            e.printStackTrace(System.err);
        }
    }
    
}