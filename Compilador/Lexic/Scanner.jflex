/**
  Per poder compilar aquest fitxer s'ha d'haver instal·lat JFlex

  Lloc: https://www.jflex.de/download.html
  Compilar (ubuntu): jflex nom_archiu.jflex
  (windows) : ni idea


 **/  

package Compilador.Lexic;
import java.io.*;

import java_cup.runtime.*;


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
comess       = \"
diferent     = \!=
comp         = \==
menori       = \<=
majori       = \>=
menor        = \<
major        = \>

punt = \.
enter = {signe}{digit19}{digit10}*
decimal = {signe}{digit10}{punt}{digit10}+

zerodigit = 0
digit = [A-Za-z0-9_]

car = {comess}{digit}{comess}
cadena = {comess}{digit}*{comess}

veritat = [V][E][R]
mentida = [F][A][L][S]
logic = {veritat}|{mentida}

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

ws           = [' '|'\t']+
endline      = ['\r'|'\n'|"\r\n"]+

cmdLineEnd   = ['\r'|'\n'|"\r\n"]*;


//Funcions i Variables Pròpies

// El següent codi es copiarà també, dins de la classe. És a dir, si es posa res
// ha de ser en el format adient: mètodes, atributs, etc. 
%{
    public static void main(String[] args) {
      try{
        FileReader fitxer = new FileReader("/home/perejoan/Documentos/GitHub/Compilador/Compilador/Lexic/prova.txt");
        Scanner scanner = new Scanner(fitxer);
        scanner.next_token();
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

{suma}                    { System.out.println("SUMA: " + yytext());  }
{resta}                   { System.out.println("RESTA: " + yytext());    }
{mul}                     { System.out.println("MULTIPLICA: " + yytext());}
{div}                     { System.out.println("DIVIDIR: " + yytext());}
{mod}                     { System.out.println("MODUL: " + yytext());}
{autosuma}                { System.out.println("AUTOSUMA: " + yytext());}
{autoresta}               { System.out.println("AUTORESTA: " + yytext());}
{sumahi}                  { System.out.println("SUMAHI: " + yytext());}
{restahi}                 { System.out.println("RESTAHI: " + yytext());}
{dospunts}                { System.out.println("DOS PUNTS: " + yytext());}
{interrogant}             { System.out.println("INTERROGANT: " + yytext());}
{lparen}                  { System.out.println("PARENTESIS OBERT: " + yytext());}
{rparen}                  { System.out.println("PARENTESIS TANCAT: " + yytext());}
{punticoma}               { System.out.println("PUNTO I COMA: " + yytext());}
{assign}                  { System.out.println("ASIGNACION: " + yytext());}
{lcorch}                  { System.out.println("CORCHETE OBERT: "+yytext());}
{rcorch}                  { System.out.println("CORCHETE TANCAT: "+yytext());}
{lclaudat}                { System.out.println("CLAU OBERT: "+yytext());}
{rclaudat}                { System.out.println("CLAU TANCAT: "+yytext());}

{diferent}                { System.out.println("DIFERENT: "+yytext());}
{comp}                    { System.out.println("COMPARACIO: "+yytext());}
{menori}                  { System.out.println("MENORI: "+yytext());}
{majori}                  { System.out.println("MAJORI: "+yytext());}
{menor}                   { System.out.println("MENOR: "+yytext());}
{major}                   { System.out.println("MAJOR: "+yytext());}

{ent}                     { System.out.println("ENTER: "+yytext());}
{decimals}                { System.out.println("DECIMALS: "+yytext());}       
{caracter}                { System.out.println("CARACTER: "+yytext());}
{cad}                     { System.out.println("CADENA: "+yytext());}
{logic}                   { System.out.println("BOOLEAN: "+yytext());}
{zerodigit}               { System.out.println("ENTER 0: "+yytext());}

{tupla}                   { System.out.println("TUPLA: "+yytext());}
{si}                      { System.out.println("SI: "+yytext());}
{sino}                    { System.out.println("SINO: "+yytext());}
{seleccio}                { System.out.println("SELECCIO: "+yytext());}
{cas}                     { System.out.println("CAS: "+yytext());}
{pdefecte}                { System.out.println("PDEFECTE: "+yytext());}
{acaba}                   { System.out.println("ACABA: "+yytext());}
{mentres}                  { System.out.println("MENTRE: "+yytext());}
{fer}                     { System.out.println("FER: "+yytext());}
{per}                     { System.out.println("PER: "+yytext());}
{metode}                  { System.out.println("METODO: "+yytext());}
{return}                  { System.out.println("RETURN: "+yytext());}
{constant}                { System.out.println("CONSTANT: "+yytext());}

{car}                     { System.out.println("CARACTER: "+yytext());}
{cadena}                  { System.out.println("CADENA: "+yytext());}

{enter}                   { System.out.println("ENTER: "+yytext());}
{decimal}                 { System.out.println("DECIMAL: "+yytext());}
{logic}                   { System.out.println("BOOLEAN: "+yytext());}


{id}                      { System.out.println("ID: "+yytext());}


{cmdLineEnd}             {  }

{ws}                     { /* No fer res amb els espais */  }
{endline}                {  }

[^]                      { System.out.println("ERROR");  }
