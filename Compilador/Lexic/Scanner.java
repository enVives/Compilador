/* The following code was generated by JFlex 1.7.0 */

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



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Scanner.jflex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\67\1\70\2\0\1\70\22\0\1\67\1\41\1\45\2\0"+
    "\1\26\1\0\1\71\1\32\1\33\1\24\1\22\1\47\1\23\1\46"+
    "\1\25\1\21\11\20\1\30\1\34\1\42\1\27\1\43\1\31\1\0"+
    "\1\54\3\15\1\51\1\53\5\15\1\55\1\15\1\64\1\63\2\15"+
    "\1\52\1\56\1\62\1\15\1\50\4\15\1\35\1\0\1\36\1\0"+
    "\1\16\1\0\1\10\1\13\1\5\1\4\1\1\1\61\1\65\1\15"+
    "\1\6\2\15\1\11\1\7\1\2\1\14\1\60\1\15\1\12\1\17"+
    "\1\3\1\57\2\15\1\66\2\15\1\37\1\71\1\40\71\0\1\44"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff58\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\5\2\1\3\4\2\1\4\1\2\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\2\1\1\31\1\32\5\2\3\33"+
    "\14\2\1\34\1\2\2\0\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\2\0\1\45\1\46\6\2"+
    "\1\47\1\50\2\2\1\51\1\52\1\53\13\2\1\54"+
    "\1\55\2\2\1\56\1\2\1\57\6\2\1\60\3\2"+
    "\1\61\1\2\1\62\4\2\1\63\4\2\1\64\1\2"+
    "\1\65\10\2\1\66\6\2\1\67\1\2\1\70\1\71"+
    "\2\2\1\72\1\2\1\73\1\74\1\75\1\76\1\77";

  private static int [] zzUnpackAction() {
    int [] result = new int[158];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\164\0\256\0\350\0\u0122\0\u015c\0\u0196"+
    "\0\u01d0\0\u020a\0\u0196\0\u0244\0\u0196\0\u027e\0\u02b8\0\u02f2"+
    "\0\u032c\0\u0366\0\72\0\72\0\72\0\u03a0\0\72\0\72"+
    "\0\72\0\72\0\72\0\72\0\72\0\72\0\72\0\u03da"+
    "\0\u0414\0\u044e\0\u0488\0\u04c2\0\u04fc\0\72\0\u0536\0\u0570"+
    "\0\u05aa\0\u05e4\0\u061e\0\u0658\0\u0692\0\u06cc\0\u0706\0\u0740"+
    "\0\u077a\0\u07b4\0\u07ee\0\u0828\0\u0862\0\u089c\0\u08d6\0\u0910"+
    "\0\u094a\0\u0984\0\u09be\0\u09f8\0\u04fc\0\u02f2\0\u0a32\0\72"+
    "\0\72\0\72\0\72\0\72\0\72\0\72\0\u0a6c\0\u04c2"+
    "\0\72\0\u04fc\0\u0aa6\0\u0ae0\0\u0b1a\0\u0b54\0\u0b8e\0\u0bc8"+
    "\0\u0c02\0\u0196\0\u0c3c\0\u0c76\0\u0196\0\u0196\0\u0196\0\u0cb0"+
    "\0\u0cea\0\u0d24\0\u0d5e\0\u0d98\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80"+
    "\0\u0eba\0\u0ef4\0\72\0\u0196\0\u0f2e\0\u0f68\0\u0196\0\u0fa2"+
    "\0\u0196\0\u0fdc\0\u1016\0\u1050\0\u108a\0\u10c4\0\u10fe\0\u0196"+
    "\0\u1138\0\u1172\0\u11ac\0\u0196\0\u11e6\0\u0196\0\u1220\0\u125a"+
    "\0\u1294\0\u12ce\0\u0196\0\u1308\0\u1342\0\u137c\0\u13b6\0\u0196"+
    "\0\u13f0\0\u0196\0\u142a\0\u1464\0\u149e\0\u14d8\0\u1512\0\u154c"+
    "\0\u1586\0\u15c0\0\u0196\0\u15fa\0\u1634\0\u166e\0\u16a8\0\u16e2"+
    "\0\u171c\0\u0196\0\u1756\0\u0196\0\u0196\0\u1790\0\u17ca\0\u0196"+
    "\0\u1804\0\u0196\0\u0196\0\u0196\0\u0196\0\u0196";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[158];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\2\13\1\14\1\15\1\13\1\2\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\13\1\50\1\51\4\13\1\52\1\53\5\13\1\54"+
    "\1\55\1\56\73\0\1\13\1\57\17\13\26\0\17\13"+
    "\4\0\13\13\1\60\5\13\26\0\17\13\4\0\21\13"+
    "\26\0\7\13\1\61\7\13\4\0\1\62\20\13\26\0"+
    "\17\13\4\0\7\13\1\63\3\13\1\64\5\13\26\0"+
    "\17\13\4\0\21\13\26\0\17\13\4\0\1\65\6\13"+
    "\1\66\11\13\26\0\17\13\4\0\4\13\1\67\14\13"+
    "\26\0\11\13\1\70\5\13\4\0\13\13\1\71\5\13"+
    "\26\0\17\13\4\0\1\72\4\13\1\73\5\13\1\74"+
    "\5\13\26\0\17\13\23\0\2\17\24\0\1\75\43\0"+
    "\2\76\24\0\1\75\45\0\1\77\4\0\1\100\65\0"+
    "\1\101\3\0\1\102\71\0\1\103\71\0\1\104\71\0"+
    "\1\105\71\0\1\106\43\0\15\107\1\0\3\107\26\0"+
    "\17\107\4\0\15\110\1\0\3\110\23\0\1\111\2\0"+
    "\17\110\23\0\2\112\51\0\21\13\26\0\1\13\1\113"+
    "\15\13\4\0\21\13\26\0\1\13\1\114\15\13\4\0"+
    "\21\13\26\0\4\13\1\115\12\13\4\0\1\116\2\13"+
    "\1\117\15\13\26\0\17\13\4\0\1\120\20\13\26\0"+
    "\17\13\72\0\1\54\1\0\1\54\70\0\2\55\67\0"+
    "\1\54\1\55\1\56\1\0\2\13\1\121\16\13\26\0"+
    "\17\13\4\0\21\13\26\0\7\13\1\122\7\13\4\0"+
    "\21\13\26\0\10\13\1\123\6\13\4\0\4\13\1\124"+
    "\14\13\26\0\17\13\4\0\3\13\1\125\5\13\1\126"+
    "\4\13\1\127\2\13\26\0\17\13\4\0\1\13\1\130"+
    "\17\13\26\0\17\13\4\0\1\13\1\131\1\132\16\13"+
    "\26\0\17\13\4\0\5\13\1\133\13\13\26\0\17\13"+
    "\4\0\7\13\1\134\11\13\26\0\17\13\4\0\1\135"+
    "\20\13\26\0\17\13\4\0\11\13\1\136\1\13\1\137"+
    "\5\13\26\0\17\13\4\0\10\13\1\140\10\13\26\0"+
    "\17\13\4\0\1\13\1\141\17\13\26\0\17\13\4\0"+
    "\11\13\1\142\7\13\26\0\17\13\25\0\1\77\113\0"+
    "\1\143\26\0\21\13\26\0\2\13\1\144\14\13\4\0"+
    "\21\13\26\0\12\13\1\145\4\13\4\0\21\13\26\0"+
    "\5\13\1\146\11\13\4\0\11\13\1\147\7\13\26\0"+
    "\17\13\4\0\1\150\20\13\26\0\17\13\4\0\11\13"+
    "\1\151\7\13\26\0\17\13\4\0\11\13\1\152\7\13"+
    "\26\0\17\13\4\0\10\13\1\153\10\13\26\0\17\13"+
    "\4\0\5\13\1\154\13\13\26\0\17\13\4\0\16\13"+
    "\1\155\2\13\26\0\17\13\4\0\2\13\1\156\16\13"+
    "\26\0\17\13\4\0\13\13\1\157\5\13\26\0\17\13"+
    "\4\0\1\13\1\160\17\13\26\0\17\13\4\0\12\13"+
    "\1\161\6\13\26\0\17\13\4\0\21\13\26\0\15\13"+
    "\1\162\1\13\4\0\11\13\1\163\7\13\26\0\17\13"+
    "\4\0\10\13\1\164\10\13\26\0\17\13\4\0\1\165"+
    "\20\13\26\0\17\13\4\0\13\13\1\166\5\13\26\0"+
    "\17\13\4\0\2\13\1\167\16\13\26\0\17\13\4\0"+
    "\21\13\26\0\13\13\1\170\3\13\4\0\21\13\26\0"+
    "\6\13\1\144\10\13\4\0\21\13\26\0\11\13\1\171"+
    "\5\13\4\0\7\13\1\172\11\13\26\0\17\13\4\0"+
    "\7\13\1\173\11\13\26\0\17\13\4\0\6\13\1\174"+
    "\12\13\26\0\17\13\4\0\2\13\1\175\16\13\26\0"+
    "\17\13\4\0\11\13\1\176\7\13\26\0\17\13\4\0"+
    "\3\13\1\177\15\13\26\0\17\13\4\0\7\13\1\200"+
    "\11\13\26\0\17\13\4\0\1\201\20\13\26\0\17\13"+
    "\4\0\7\13\1\202\11\13\26\0\17\13\4\0\4\13"+
    "\1\203\14\13\26\0\17\13\4\0\5\13\1\204\13\13"+
    "\26\0\17\13\4\0\21\13\26\0\2\13\1\205\14\13"+
    "\4\0\1\206\20\13\26\0\17\13\4\0\3\13\1\207"+
    "\15\13\26\0\17\13\4\0\7\13\1\210\11\13\26\0"+
    "\17\13\4\0\7\13\1\211\11\13\26\0\17\13\4\0"+
    "\1\212\20\13\26\0\17\13\4\0\1\213\20\13\26\0"+
    "\17\13\4\0\5\13\1\214\13\13\26\0\17\13\4\0"+
    "\4\13\1\215\14\13\26\0\17\13\4\0\3\13\1\216"+
    "\15\13\26\0\17\13\4\0\21\13\26\0\14\13\1\217"+
    "\2\13\4\0\4\13\1\220\14\13\26\0\17\13\4\0"+
    "\7\13\1\221\11\13\26\0\17\13\4\0\10\13\1\222"+
    "\10\13\26\0\17\13\4\0\1\13\1\223\17\13\26\0"+
    "\17\13\4\0\16\13\1\224\2\13\26\0\17\13\4\0"+
    "\21\13\26\0\16\13\1\225\4\0\5\13\1\226\13\13"+
    "\26\0\17\13\4\0\7\13\1\227\11\13\26\0\17\13"+
    "\4\0\21\13\26\0\4\13\1\230\12\13\4\0\2\13"+
    "\1\231\16\13\26\0\17\13\4\0\21\13\26\0\6\13"+
    "\1\232\10\13\4\0\2\13\1\233\16\13\26\0\17\13"+
    "\4\0\13\13\1\234\5\13\26\0\17\13\4\0\21\13"+
    "\26\0\6\13\1\235\10\13\4\0\1\236\20\13\26\0"+
    "\17\13\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6206];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\20\1\3\11\1\1\11\11\6\1\1\11"+
    "\26\1\2\0\1\1\7\11\2\0\1\11\31\1\1\11"+
    "\73\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[158];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    
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

    public class Token{
      public Location esquerre;
      public Location dreta;
      public Object valor;

      public Token(Object valor){
        this.valor = valor;
        esquerre = new Location(yyline+1, yycolumn+1);
        dreta = new Location(yyline+1, yycolumn+yytext().length()+1);
      }

      public Token(){
        esquerre = new Location(yyline+1, yycolumn+1);
        dreta = new Location(yyline+1, yycolumn+yytext().length()+1);
        valor = null;
      }
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

    private String tractar(String entrada){
      String str = "";
      char [] caracters = entrada.toCharArray();
      int i = 1;

      while(i<caracters.length -1){
        str += caracters[i];
        i++;
      }

      return str;
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Error Lèxic a la Línia "+(this.yyline+1)+" Columna "+(this.yycolumn+1));
            } 
            // fall through
          case 64: break;
          case 2: 
            { return symbol(ParserSym.ID,new Token(this.yytext()));
            } 
            // fall through
          case 65: break;
          case 3: 
            { return symbol(ParserSym.AND,new Token());
            } 
            // fall through
          case 66: break;
          case 4: 
            { return symbol(ParserSym.OR,new Token());
            } 
            // fall through
          case 67: break;
          case 5: 
            { return symbol(ParserSym.venter,new Token(Integer.parseInt(this.yytext())));
            } 
            // fall through
          case 68: break;
          case 6: 
            { return symbol(ParserSym.venter,new Token(0));
            } 
            // fall through
          case 69: break;
          case 7: 
            { return symbol(ParserSym.ADD,new Token());
            } 
            // fall through
          case 70: break;
          case 8: 
            { return symbol(ParserSym.SUB,new Token());
            } 
            // fall through
          case 71: break;
          case 9: 
            { return symbol(ParserSym.MULT,new Token());
            } 
            // fall through
          case 72: break;
          case 10: 
            { return symbol(ParserSym.DIV,new Token());
            } 
            // fall through
          case 73: break;
          case 11: 
            { return symbol(ParserSym.MOD,new Token());
            } 
            // fall through
          case 74: break;
          case 12: 
            { return symbol(ParserSym.ASSIGN,new Token());
            } 
            // fall through
          case 75: break;
          case 13: 
            { return symbol(ParserSym.DOSPUNTS);
            } 
            // fall through
          case 76: break;
          case 14: 
            { return symbol(ParserSym.INTERROG);
            } 
            // fall through
          case 77: break;
          case 15: 
            { return symbol(ParserSym.LPAREN,new Token());
            } 
            // fall through
          case 78: break;
          case 16: 
            { return symbol(ParserSym.RPAREN,new Token());
            } 
            // fall through
          case 79: break;
          case 17: 
            { return symbol(ParserSym.PUNTICOMA);
            } 
            // fall through
          case 80: break;
          case 18: 
            { return symbol(ParserSym.LCORCH);
            } 
            // fall through
          case 81: break;
          case 19: 
            { return symbol(ParserSym.RCORCH);
            } 
            // fall through
          case 82: break;
          case 20: 
            { return symbol(ParserSym.LCLAUDAT);
            } 
            // fall through
          case 83: break;
          case 21: 
            { return symbol(ParserSym.RCLAUDAT);
            } 
            // fall through
          case 84: break;
          case 22: 
            { return symbol(ParserSym.NOT,new Token());
            } 
            // fall through
          case 85: break;
          case 23: 
            { return symbol(ParserSym.MENOR,new Token());
            } 
            // fall through
          case 86: break;
          case 24: 
            { return symbol(ParserSym.MAJOR,new Token());
            } 
            // fall through
          case 87: break;
          case 25: 
            { return symbol(ParserSym.PUNT);
            } 
            // fall through
          case 88: break;
          case 26: 
            { return symbol(ParserSym.COMA);
            } 
            // fall through
          case 89: break;
          case 27: 
            { 
            } 
            // fall through
          case 90: break;
          case 28: 
            { return symbol(ParserSym.si);
            } 
            // fall through
          case 91: break;
          case 29: 
            { return symbol(ParserSym.AUTOSUM,new Token());
            } 
            // fall through
          case 92: break;
          case 30: 
            { return symbol(ParserSym.SUMAHI,new Token());
            } 
            // fall through
          case 93: break;
          case 31: 
            { return symbol(ParserSym.AUTOSUB,new Token());
            } 
            // fall through
          case 94: break;
          case 32: 
            { return symbol(ParserSym.RESTAHI,new Token());
            } 
            // fall through
          case 95: break;
          case 33: 
            { return symbol(ParserSym.IGIG,new Token());
            } 
            // fall through
          case 96: break;
          case 34: 
            { return symbol(ParserSym.DIF,new Token());
            } 
            // fall through
          case 97: break;
          case 35: 
            { return symbol(ParserSym.MENORI,new Token());
            } 
            // fall through
          case 98: break;
          case 36: 
            { return symbol(ParserSym.MAJORI,new Token());
            } 
            // fall through
          case 99: break;
          case 37: 
            { return symbol(ParserSym.vcadena,new Token(tractar(this.yytext())));
            } 
            // fall through
          case 100: break;
          case 38: 
            { return symbol(ParserSym.vdecimal,new Token(Double.parseDouble(this.yytext())));
            } 
            // fall through
          case 101: break;
          case 39: 
            { return symbol(ParserSym.enter);
            } 
            // fall through
          case 102: break;
          case 40: 
            { return symbol(ParserSym.nou);
            } 
            // fall through
          case 103: break;
          case 41: 
            { return symbol(ParserSym.cadena);
            } 
            // fall through
          case 104: break;
          case 42: 
            { return symbol(ParserSym.caracter);
            } 
            // fall through
          case 105: break;
          case 43: 
            { return symbol(ParserSym.cas);
            } 
            // fall through
          case 106: break;
          case 44: 
            { return symbol(ParserSym.vcaracter,new Token(tractar(this.yytext())));
            } 
            // fall through
          case 107: break;
          case 45: 
            { return symbol(ParserSym.vlogic,new Token(this.yytext()));
            } 
            // fall through
          case 108: break;
          case 46: 
            { return symbol(ParserSym.per);
            } 
            // fall through
          case 109: break;
          case 47: 
            { return symbol(ParserSym.fer);
            } 
            // fall through
          case 110: break;
          case 48: 
            { return symbol(ParserSym.main);
            } 
            // fall through
          case 111: break;
          case 49: 
            { return symbol(ParserSym.logic);
            } 
            // fall through
          case 112: break;
          case 50: 
            { return symbol(ParserSym.sino);
            } 
            // fall through
          case 113: break;
          case 51: 
            { return symbol(ParserSym.tupla);
            } 
            // fall through
          case 114: break;
          case 52: 
            { return symbol(ParserSym.acaba);
            } 
            // fall through
          case 115: break;
          case 53: 
            { return symbol(ParserSym.borra);
            } 
            // fall through
          case 116: break;
          case 54: 
            { return symbol(ParserSym.metode);
            } 
            // fall through
          case 117: break;
          case 55: 
            { return symbol(ParserSym.decimal);
            } 
            // fall through
          case 118: break;
          case 56: 
            { return symbol(ParserSym.mentres);
            } 
            // fall through
          case 119: break;
          case 57: 
            { return symbol(ParserSym.afegeix);
            } 
            // fall through
          case 120: break;
          case 58: 
            { return symbol(ParserSym.retorna);
            } 
            // fall through
          case 121: break;
          case 59: 
            { return symbol(ParserSym.entradaS);
            } 
            // fall through
          case 122: break;
          case 60: 
            { return symbol(ParserSym.constant);
            } 
            // fall through
          case 123: break;
          case 61: 
            { return symbol(ParserSym.seleccio);
            } 
            // fall through
          case 124: break;
          case 62: 
            { return symbol(ParserSym.sortidaS);
            } 
            // fall through
          case 125: break;
          case 63: 
            { return symbol(ParserSym.pdefecte);
            } 
            // fall through
          case 126: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
