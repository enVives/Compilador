/**
  Per poder compilar aquest fitxer s'ha d'haver instal·lat JFlex

  Lloc: https://www.jflex.de/download.html
  Compilar (ubuntu): jflex nom_archiu.jflex
  (windows) : ni idea


 **/  

package Compilador.Lexic;
import java.io.*;

import java_cup.runtime.*;

import java_cup.runtime.ComplexSymbolFactory.ComplexSymbol;
import java_cup.runtime.ComplexSymbolFactory.Location;

import Compilador.Sintactic.ParserSym;


%%
/** **
%standalone
 ** **/


%implements java_cup.runtime.Scanner
%function next_token
%type java_cup.runtime.Symbol

%public              // Per indicar que la classe és pública
%class Scanner       // El nom de la classe

%char
%line
%column


//Declaracions

//Tipus de dades

ent = [e][n][t]
decimals = [d][e][c][i][m][a][l]
caracter = [c][a][r]
cad = [c][a][d]
logic = [b][o][o][l]

id		= [A-Za-z_][A-Za-z0-9_]*
constant = [C][O][N][S][T][A][N][T]

//signe		= [+|-]?
digit19		= [1-9]
digit10		= [0-9]

suma         = \+
resta        = \-
mul          = \*
div          = \/
mod          = %
autosuma     = \++
autoresta    = \--
sumahi       = \+=
restahi      = \-=

dospunts     = \:
interrogant  = \?
lparen       = \(
rparen       = \)
punticoma    = \;
assign       = \=
lcorch       = \[
rcorch       = \]
lclaudat     = \{
rclaudat     = \}
comess       = \"
comes        = '
diferent     = \!=
comp         = \==
menori       = \<=
majori       = \>=
menor        = \<
major        = \>

punt = \.
coma = \,

enter = {digit19}{digit10}*
decimal = {digit10}{punt}{digit10}+

zerodigit = 0
digit = [A-Za-z0-9_]

car = {comes}{digit}{comes}
cadena = {comess}{digit}*{comess}

veritat = [V][E][R]
mentida = [F][A][L][S]
vlogic = {veritat}|{mentida}

tupla = [t][u][p][l][a]

si = [s][i]
sino = [s][i][n][o]

seleccio = [s][e][l][e][c][c][i][o]
cas = [c][a][s]
pdefecte = [p][d][e][f][e][c][t][e]
acaba = [a][c][a][b][a]

mentres = [m][e][n][t][r][e][s]
fer = [f][e][r]
per = [p][e][r]
metode = [m][e][t][o][d][e]
return = [R][E][T][O][R][N][A]
entradaS = [e][n][t][r][a][d][a][S]
sortidaS = [s][o][r][t][i][d][a][S]
main = [m][a][i][n]

ws           = [' '|'\t']+
endline      = ['\r'|'\n'|"\r\n"]+

cmdLineEnd   = ['\r'|'\n'|"\r\n"]*;


//Funcions i Variables Pròpies

// El següent codi es copiarà també, dins de la classe. És a dir, si es posa res
// ha de ser en el format adient: mètodes, atributs, etc. 
%{
    /*
    public static void main(String[] args) {
      try{
        FileReader fitxer = new FileReader("/home/perejoan/Documentos/GitHub/Compilador/Compilador/Lexic/prova.txt");
        Scanner scanner = new Scanner(fitxer);
        scanner.next_token();
      }catch(Exception e) {
            System.err.println("error: "+e);
            e.printStackTrace(System.err);
      }
    }*/


    private ComplexSymbol symbol(int type) {
        // Sumar 1 per a que la primera línia i columna no sigui 0.
        Location esquerra = new Location(yyline+1, yycolumn+1);
        Location dreta = new Location(yyline+1, yycolumn+yytext().length()+1);

        return new ComplexSymbol(ParserSym.terminalNames[type], type, esquerra, dreta);
    }
    
    /**
     Construcció d'un symbol amb un atribut associat.
     **/
    private Symbol symbol(int type, Object value) {
        // Sumar 1 per a que la primera línia i columna no sigui 0.
        Location esquerra = new Location(yyline+1, yycolumn+1);
        Location dreta = new Location(yyline+1, yycolumn+yytext().length()+1);

        return new ComplexSymbol(ParserSym.terminalNames[type], type, esquerra, dreta, value);
    }


%}


/****************************************************************************/
%%

// Regles/accions
// És molt important l'ordre de les regles!!!

{suma}                    { return symbol(ParserSym.ADD);  }
{resta}                   { return symbol(ParserSym.SUB);    }
{mul}                     { return symbol(ParserSym.MULT);}
{div}                     { return symbol(ParserSym.DIV);}
{mod}                     { return symbol(ParserSym.MOD);}
{autosuma}                { return symbol(ParserSym.AUTOSUM);}
{autoresta}               { return symbol(ParserSym.AUTOSUB);}
{sumahi}                  { return symbol(ParserSym.SUMAHI);}
{restahi}                 { return symbol(ParserSym.RESTAHI);}
{dospunts}                { return symbol(ParserSym.DOSPUNTS);}
{interrogant}             { return symbol(ParserSym.INTERROG);}
{lparen}                  { return symbol(ParserSym.LPAREN);}
{rparen}                  { return symbol(ParserSym.RPAREN);}
{punticoma}               { return symbol(ParserSym.PUNTICOMA);}
{assign}                  { return symbol(ParserSym.ASSIGN);}
{lcorch}                  { return symbol(ParserSym.LCORCH);}
{rcorch}                  { return symbol(ParserSym.RCORCH);}
{lclaudat}                { return symbol(ParserSym.LCLAUDAT);}
{rclaudat}                { return symbol(ParserSym.RCLAUDAT);}
{coma}                    { return symbol(ParserSym.COMA);}

{diferent}                { return symbol(ParserSym.DIF);}
{comp}                    { return symbol(ParserSym.IGIG);}
{menori}                  { return symbol(ParserSym.MENORI);}
{majori}                  { return symbol(ParserSym.MAJORI);}
{menor}                   { return symbol(ParserSym.MENOR);}
{major}                   { return symbol(ParserSym.MAJOR);}

{ent}                     { return symbol(ParserSym.enter);}
{decimals}                { return symbol(ParserSym.decimal);}       
{caracter}                { return symbol(ParserSym.caracter);}
{cad}                     { return symbol(ParserSym.cadena);}
{logic}                   { return symbol(ParserSym.logic);}
{zerodigit}               { return symbol(ParserSym.enter,0);}

{tupla}                   { return symbol(ParserSym.tupla);}
{si}                      { return symbol(ParserSym.si);}
{sino}                    { return symbol(ParserSym.sino);}
{seleccio}                { return symbol(ParserSym.seleccio);}
{cas}                     { return symbol(ParserSym.cas);}
{pdefecte}                { return symbol(ParserSym.pdefecte);}
{acaba}                   { return symbol(ParserSym.acaba);}
{mentres}                  { return symbol(ParserSym.mentres);}
{fer}                     { return symbol(ParserSym.fer);}
{per}                     { return symbol(ParserSym.per);}
{metode}                  { return symbol(ParserSym.metode);}
{return}                  { return symbol(ParserSym.retur);}
{constant}                { return symbol(ParserSym.constant,0);}

{car}                     { return symbol(ParserSym.vcaracter,this.yytext());}
{cadena}                  { return symbol(ParserSym.vcadena,this.yytext());}

{enter}                   { return symbol(ParserSym.venter,Integer.parseInt(this.yytext()));}
{decimal}                 { return symbol(ParserSym.vdecimal,Double.parseDouble(this.yytext()));}
{vlogic}                   { return symbol(ParserSym.vlogic,Boolean.parseBoolean(this.yytext()));}

{entradaS}    {return symbol(ParserSym.entradaS);}
{sortidaS}    { return symbol(ParserSym.sortidaS);}
{main}        { return symbol(ParserSym.main);}


{id}                      { return symbol(ParserSym.ID,this.yytext());}


{cmdLineEnd}             {  }

{ws}                     { /* No fer res amb els espais */  }
{endline}                {  }

[^]                      { System.out.println("ERROR");  }
