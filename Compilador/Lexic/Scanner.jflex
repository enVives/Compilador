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

%cup

%implements java_cup.runtime.Scanner
%function next_token
%type java_cup.runtime.Symbol

%public              // Per indicar que la classe és pública
%class Scanner       // El nom de la classe

%char
%line
%column

%eofval{
  return symbol(ParserSym.EOF);
%eofval}

//Declaracions

//Tipus de dades

ent = [ent]
decimals = [decimal]
caracter = [car]
cad = [cad]
logic = [bool]

id		= [A-Za-z_][A-Za-z0-9_]*
constant = [CONSTANT]

signe		= [+|-]?
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
comes        = \'

diferent     = \!=
comp         = \==
menori       = \<=
majori       = \>=
menor        = \<
major        = \>

enter = {signe}{digit19}{digit10}*
decimal = {signe}{digit10}.{digit10}+

car = [A-Za-z_]
cadena = [A-Za-z_]+
logic = [VERI|FALS]

tupla = [tupla]

si = [si]
sino = [sino]

seleccio = [seleccio]
cas = [cas]
pdefecte = [pdefecte]
acaba = [acaba]

mentres = [mentres]
fer = [fer]
per = [per]
metode = [metode]
return = [RETORNA]

ws           = [' '|'\t']+
endline      = ['\r'|'\n'|"\r\n"]+

cmdLineEnd   = ['\r'|'\n'|"\r\n"]*;


//Funcions i Variables Pròpies

// El següent codi es copiarà també, dins de la classe. És a dir, si es posa res
// ha de ser en el format adient: mètodes, atributs, etc. 
%{
    public static void main(String[] args) {
      try{
        FileReader fitxer = new FileReader("prova.txt");
        Scanner scanner = new Scanner(fitxer);
        next_token();
      }catch(Exception e) {
            System.err.println("error: "+e);
            e.printStackTrace(System.err);
      }
    }
%}


/****************************************************************************/
%%

// Regles/accions
// És molt important l'ordre de les regles!!!

{suma}                    { System.out.pritnln("SUMA: " + yytext());  }
{resta}                   { System.out.println("RESTA: " + yytext());    }
{mul}                     { System.out.pritnln("MULTIPLICA: " + yytext());}
{div}                     { System.out.pritnln("DIVIDIR: " + yytext());}
{mod}                     { System.out.pritnln("MODUL: " + yytext());}
{autosuma}                { System.out.pritnln("AUTOSUMA: " + yytext());}
{autoresta}               { System.out.pritnln("AUTORESTA: " + yytext());}
{sumahi}                  { System.out.pritnln("SUMAHI: " + yytext());}
{restahi}                 { System.out.pritnln("RESTAHI: " + yytext());}
{dospunts}                { System.out.pritnln("DOS PUNTS: " + yytext());}
{interrogant}             { System.out.pritnln("INTERROGANT: " + yytext());}
{lparen}                  { System.out.pritnln("PARENTESIS OBERT: " + yytext());}
{rparen}                  { System.out.pritnln("PARENTESIS TANCAT: " + yytext());}
{punticoma}               { System.out.pritnln("PUNTO I COMA: " + yytext());}
{assign}                  { System.out.pritnln("ASIGNACION: " + yytext());}
{lcorch}                  { System.out.pritnln("CORCHETE OBERT: "+yytext());}
{rcorch}                  { System.out.pritnln("CORCHETE TANCAT: "+yytext());}
{lclaudat}                { System.out.pritnln("CLAU OBERT: "+yytext());}
{rclaudat}                { System.out.pritnln("CLAU TANCAT: "+yytext());}
{comes}                   { System.out.pritnln("COMES: "+yytext());}

{diferent}                { System.out.pritnln("DIFERENT: "+yytext());}
{comp}                    { System.out.pritnln("COMPARACIO: "+yytext());}
{menori}                  { System.out.pritnln("MENORI: "+yytext());}
{majori}                  { System.out.pritnln("MAJORI: "+yytext());}
{menor}                   { System.out.pritnln("MENOR: "+yytext());}
{major}                   { System.out.pritnln("MAJOR: "+yytext());}


{ent}                     { System.out.pritnln("ENTER: "+yytext());}
{decimals}                { System.out.pritnln("DECIMALS: "+yytext());}       
{caracter}                { System.out.pritnln("CARACTER: "+yytext());}
{cad}                     { System.out.pritnln("CADENA: "+yytext());}
{logic}                   { System.out.pritnln("BOOLEAN: "+yytext());}

{tupla}                   { System.out.pritnln("TUPLA: "+yytext());}
{si}                      { System.out.pritnln("SI: "+yytext());}
{sino}                    { System.out.pritnln("SINO: "+yytext());}
{seleccio}                { System.out.pritnln("SELECCIO: "+yytext());}
{cas}                     { System.out.pritnln("CAS: "+yytext());}
{pdefecte}                { System.out.pritnln("PDEFECTE: "+yytext());}
{acaba}                   { System.out.pritnln("ACABA: "+yytext());}
{mentre}                  { System.out.pritnln("MENTRE: "+yytext());}
{fer}                     { System.out.pritnln("FER: "+yytext());}
{per}                     { System.out.pritnln("PER: "+yytext());}
{metode}                  { System.out.pritnln("METODO: "+yytext());}
{return}                  { System.out.pritnln("RETURN: "+yytext());}
{constant}                { System.out.pritnln("CONSTANT: "+yytext());}


{id}                      { System.out.pritnln("ID: "+yytext());}

{enter}                   { System.out.pritnln("ENTER: "+yytext());}
{decimal}                 { System.out.pritnln("DECIMAL: "+yytext());}
{car}                     { System.out.pritnln("CARACTER: "+yytext());}
{cadena}                  { System.out.pritnln("CADENA: "+yytext());}
{logic}                   { System.out.pritnln("BOOLEAN: "+yytext());}


{cmdLineEnd}             {  }

{ws}                     { /* No fer res amb els espais */  }
{endline}                {  }

[^]                      { System.out.println("ERROR");  }
