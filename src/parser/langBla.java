/* Generated By:JavaCC: Do not edit this line. langBla.java */
package parser;
import java.io.*;

public class langBla implements langBlaConstants {

  final static String Version = "B+- Compiler - Version 1.0 - 2018";
  boolean Menosshort = false; // saida resumida = falso
  //Define o metodo main da classe langBla  public static void main(String args []) throws ParseException {
            String filename = "/home/davi/Desktop/teste.txt";// nome do arquivo a ser analisado            langBla parser; //AL/AS                int i;
                boolean ms = false;

                System.out.println(Version);

                //parametros passados para o compilador                for (i=0; i < args.length - 1; i++) {
                        if (args[i].toLowerCase().equals("-short" )) {
                                ms = true;
                        } else {
                          System.out.println("Usa is: java langBla [-short] inputfile");
                          System.exit(0);
                        }
                }

                if(args[i].equals("-")) { //entrada padrao                        System.out.println("Reading from standard input . . .");
                        parser = new langBla(System.in);
                } else {
                        filename = args[args.length-1];
                        System.out.println("Reading from file " + filename + " . . .");
                        try {
                                parser = new langBla(new java.io.FileInputStream(filename));
                        } catch (java.io.FileNotFoundException ex) {
                                System.out.println("File " + filename + " not found");
                                return;
                        }
                }

                parser.Menosshort = ms;

                try {
                parser.program(); // caso de sucesso de parser                System.out.println("Sucesso!");
                } catch (ParseException e) {
                        System.out.println(e);
                } catch (TokenMgrError e) {
                        System.out.println(e);
                }

                //verifica se houve erro lexico                if(parser.token_source.foundLexError() != 0) {
                        System.out.println( parser.token_source.foundLexError() + " Erros lexicos encontrados ");
                } else {
                        System.out.println("Programa analizado");
                }
        }

        static public String im(int x) { // metodo auxiliar                int k;
                String s;
                s = tokenImage[x];
                k = s.lastIndexOf("\u005c"");
                try {
                        s = s.substring(1,k);
                } catch (StringIndexOutOfBoundsException ex) {
                }

                return s;
        }

  final public void program() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BREAK:
      case CLASS:
      case CONSTRUCTIOR:
      case ELSE:
      case EXTENDS:
      case FOR:
      case IF:
      case INT:
      case NEW:
      case PRINT:
      case READ:
      case RETURN:
      case STRING:
      case SUPER:
      case ASSIGN:
      case GT:
      case LT:
      case EQ:
      case LE:
      case GE:
      case NEQ:
      case PLUS:
      case MINUS:
      case MULTIPLY:
      case DIVIDE:
      case REM:
      case NOT:
      case AND:
      case OR:
      case XOR:
      case LPAREN:
      case RPAREN:
      case LBRACE:
      case RBRACE:
      case LBRACKET:
      case RBRACKET:
      case SEMICOLON:
      case COMMA:
      case DOT:
      case int_constant:
      case oct_constant:
      case hexa_constant:
      case binarios_constant:
      case float_constant:
      case boolean_constant:
      case string_constant:
      case char_constant:
      case null_constant:
      case IDENT:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
             System.out.println("Reconheceu PLUS");
        break;
      case BREAK:
        jj_consume_token(BREAK);
              System.out.println("Reconheceu BREAK");
        break;
      case CLASS:
        jj_consume_token(CLASS);
              System.out.println("Reconheceu CLASS");
        break;
      case CONSTRUCTIOR:
        jj_consume_token(CONSTRUCTIOR);
                     System.out.println("Reconheceu CONSTRUCTOR");
        break;
      case ELSE:
        jj_consume_token(ELSE);
             System.out.println("Reconheceu ELSE");
        break;
      case EXTENDS:
        jj_consume_token(EXTENDS);
                System.out.println("Reconheceu EXTENDS");
        break;
      case FOR:
        jj_consume_token(FOR);
            System.out.println("Reconheceu FOR");
        break;
      case IF:
        jj_consume_token(IF);
           System.out.println("Reconheceu IF");
        break;
      case INT:
        jj_consume_token(INT);
            System.out.println("Reconheceu INT");
        break;
      case NEW:
        jj_consume_token(NEW);
            System.out.println("Reconheceu NEW");
        break;
      case PRINT:
        jj_consume_token(PRINT);
              System.out.println("Reconheceu PRINT");
        break;
      case READ:
        jj_consume_token(READ);
             System.out.println("Reconheceu READ");
        break;
      case RETURN:
        jj_consume_token(RETURN);
               System.out.println("Reconheceu RETURN");
        break;
      case STRING:
        jj_consume_token(STRING);
               System.out.println("Reconheceu STRING");
        break;
      case SUPER:
        jj_consume_token(SUPER);
              System.out.println("Reconheceu SUPER");
        break;
      case ASSIGN:
        jj_consume_token(ASSIGN);
               System.out.println("Reconheceu ASSIGN");
        break;
      case GT:
        jj_consume_token(GT);
           System.out.println("Reconheceu GT");
        break;
      case LT:
        jj_consume_token(LT);
           System.out.println("Reconheceu LT");
        break;
      case EQ:
        jj_consume_token(EQ);
           System.out.println("Reconheceu EQ");
        break;
      case LE:
        jj_consume_token(LE);
           System.out.println("Reconheceu LE");
        break;
      case GE:
        jj_consume_token(GE);
           System.out.println("Reconheceu GE");
        break;
      case NEQ:
        jj_consume_token(NEQ);
            System.out.println("Reconheceu NEQ");
        break;
      case MINUS:
        jj_consume_token(MINUS);
              System.out.println("Reconheceu MINUS");
        break;
      case MULTIPLY:
        jj_consume_token(MULTIPLY);
                 System.out.println("Reconheceu MULTIPLY");
        break;
      case DIVIDE:
        jj_consume_token(DIVIDE);
               System.out.println("Reconheceu DIVIDE");
        break;
      case REM:
        jj_consume_token(REM);
            System.out.println("Reconheceu REM");
        break;
      case NOT:
        jj_consume_token(NOT);
            System.out.println("Reconheceu NOT");
        break;
      case AND:
        jj_consume_token(AND);
            System.out.println("Reconheceu AND");
        break;
      case OR:
        jj_consume_token(OR);
           System.out.println("Reconheceu OR");
        break;
      case XOR:
        jj_consume_token(XOR);
            System.out.println("Reconheceu XOR");
        break;
      case LPAREN:
        jj_consume_token(LPAREN);
               System.out.println("Reconheceu LPAREN");
        break;
      case RPAREN:
        jj_consume_token(RPAREN);
               System.out.println("Reconheceu RPAREN");
        break;
      case LBRACE:
        jj_consume_token(LBRACE);
               System.out.println("Reconheceu LBRACE");
        break;
      case RBRACE:
        jj_consume_token(RBRACE);
               System.out.println("Reconheceu RBRACE");
        break;
      case LBRACKET:
        jj_consume_token(LBRACKET);
                 System.out.println("Reconheceu LBRACKET");
        break;
      case RBRACKET:
        jj_consume_token(RBRACKET);
                 System.out.println("Reconheceu RBRACKET");
        break;
      case SEMICOLON:
        jj_consume_token(SEMICOLON);
                  System.out.println("Reconheceu SEMICOLON");
        break;
      case COMMA:
        jj_consume_token(COMMA);
              System.out.println("Reconheceu COMMA");
        break;
      case DOT:
        jj_consume_token(DOT);
            System.out.println("Reconheceu DOT");
        break;
      case IDENT:
        jj_consume_token(IDENT);
              System.out.println("Reconheceu um IDENT");
        break;
      case int_constant:
        jj_consume_token(int_constant);
                     System.out.println("Reconheceu INTEIRO");
        break;
      case oct_constant:
        jj_consume_token(oct_constant);
                     System.out.println("Reconheceu OCTAL");
        break;
      case hexa_constant:
        jj_consume_token(hexa_constant);
                      System.out.println("Reconheceu HEXADECIMAL");
        break;
      case binarios_constant:
        jj_consume_token(binarios_constant);
                          System.out.println("Reconheceu BINARIO");
        break;
      case float_constant:
        jj_consume_token(float_constant);
                       System.out.println("Reconheceu PONTO FLUTUANTE");
        break;
      case boolean_constant:
        jj_consume_token(boolean_constant);
                         System.out.println("Reconheceu EXPRESSAO BOOLEANA");
        break;
      case null_constant:
        jj_consume_token(null_constant);
                      System.out.println("Reconheceu NULO");
        break;
      case char_constant:
        jj_consume_token(char_constant);
                      System.out.println("Reconheceu CHAR");
        break;
      case string_constant:
        jj_consume_token(string_constant);
                        System.out.println("Reconheceu CONSTANTE STRING");
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  /** Generated Token Manager. */
  public langBlaTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xfffff000,0xfffff000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x1fffffff,0x1fffffff,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public langBla(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public langBla(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new langBlaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public langBla(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new langBlaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public langBla(langBlaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(langBlaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[66];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 66; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
