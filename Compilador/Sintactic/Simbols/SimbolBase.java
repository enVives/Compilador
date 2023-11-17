package Compilador.Sintactic.Simbols;

import java_cup.runtime.ComplexSymbolFactory.ComplexSymbol;

public class SimbolBase extends ComplexSymbol{
    private static int idAutoIncrement = 0;
    protected boolean empty;

    public SimbolBase(){
        super("", idAutoIncrement++);
        empty = true;
    }

    public boolean isEmpty() {
        return empty;
    }
}
