
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150930 (SVN rev 66)
//----------------------------------------------------

package parser;

import java_cup.runtime.*;
import ast.AST;
import ast.Number;
import ast.Identifier;
import ast.Operator;
import interpreter.Interpreter;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150930 (SVN rev 66) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\011\002\000\002\003\005\000\002\003\004" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\005\005\000\002\006\005\000\002" +
    "\006\005\000\002\006\005\000\002\006\005\000\002\006" +
    "\005\000\002\006\005\000\002\006\003\000\002\006\003" +
    "\000\002\006\004\000\002\006\005\000\002\006\006\000" +
    "\002\006\006\000\002\006\003\000\002\007\006\000\002" +
    "\010\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\026\003\015\007\005\014\023\017\007\020" +
    "\012\022\016\023\004\024\010\025\024\026\013\001\002" +
    "\000\004\014\065\001\002\000\020\007\005\014\023\017" +
    "\007\020\012\024\010\025\024\026\025\001\002\000\004" +
    "\005\ufff9\001\002\000\004\014\061\001\002\000\022\005" +
    "\ufff0\006\ufff0\007\ufff0\010\ufff0\011\ufff0\012\ufff0\015\ufff0" +
    "\016\ufff0\001\002\000\030\002\057\003\015\007\005\014" +
    "\023\017\007\020\012\022\016\023\004\024\010\025\024" +
    "\026\013\001\002\000\004\014\054\001\002\000\022\005" +
    "\uffea\006\uffea\007\uffea\010\uffea\011\uffea\012\uffea\016\uffea" +
    "\021\052\001\002\000\004\005\ufff8\001\002\000\004\005" +
    "\051\001\002\000\004\014\046\001\002\000\004\005\ufffe" +
    "\001\002\000\020\005\ufffa\006\031\007\032\010\035\011" +
    "\034\012\027\016\033\001\002\000\030\002\uffff\003\uffff" +
    "\007\uffff\014\uffff\017\uffff\020\uffff\022\uffff\023\uffff\024" +
    "\uffff\025\uffff\026\uffff\001\002\000\004\005\ufffb\001\002" +
    "\000\020\007\005\014\023\017\007\020\012\024\010\025" +
    "\024\026\025\001\002\000\022\005\uffef\006\uffef\007\uffef" +
    "\010\uffef\011\uffef\012\uffef\015\uffef\016\uffef\001\002\000" +
    "\022\005\uffea\006\uffea\007\uffea\010\uffea\011\uffea\012\uffea" +
    "\015\uffea\016\uffea\001\002\000\020\006\031\007\032\010" +
    "\035\011\034\012\027\015\030\016\033\001\002\000\020" +
    "\007\005\014\023\017\007\020\012\024\010\025\024\026" +
    "\025\001\002\000\022\005\uffed\006\uffed\007\uffed\010\uffed" +
    "\011\uffed\012\uffed\015\uffed\016\uffed\001\002\000\020\007" +
    "\005\014\023\017\007\020\012\024\010\025\024\026\025" +
    "\001\002\000\020\007\005\014\023\017\007\020\012\024" +
    "\010\025\024\026\025\001\002\000\020\007\005\014\023" +
    "\017\007\020\012\024\010\025\024\026\025\001\002\000" +
    "\020\007\005\014\023\017\007\020\012\024\010\025\024" +
    "\026\025\001\002\000\020\007\005\014\023\017\007\020" +
    "\012\024\010\025\024\026\025\001\002\000\022\005\ufff4" +
    "\006\ufff4\007\ufff4\010\ufff4\011\ufff4\012\ufff4\015\ufff4\016" +
    "\033\001\002\000\022\005\ufff3\006\ufff3\007\ufff3\010\ufff3" +
    "\011\ufff3\012\ufff3\015\ufff3\016\033\001\002\000\022\005" +
    "\ufff1\006\ufff1\007\ufff1\010\ufff1\011\ufff1\012\ufff1\015\ufff1" +
    "\016\033\001\002\000\022\005\ufff5\006\ufff5\007\ufff5\010" +
    "\035\011\034\012\027\015\ufff5\016\033\001\002\000\022" +
    "\005\ufff6\006\ufff6\007\ufff6\010\035\011\034\012\027\015" +
    "\ufff6\016\033\001\002\000\022\005\ufff2\006\ufff2\007\ufff2" +
    "\010\ufff2\011\ufff2\012\ufff2\015\ufff2\016\033\001\002\000" +
    "\004\005\045\001\002\000\030\002\ufffd\003\ufffd\007\ufffd" +
    "\014\ufffd\017\ufffd\020\ufffd\022\ufffd\023\ufffd\024\ufffd\025" +
    "\ufffd\026\ufffd\001\002\000\020\007\005\014\023\017\007" +
    "\020\012\024\010\025\024\026\025\001\002\000\020\006" +
    "\031\007\032\010\035\011\034\012\027\015\050\016\033" +
    "\001\002\000\004\005\uffe8\001\002\000\030\002\ufffc\003" +
    "\ufffc\007\ufffc\014\ufffc\017\ufffc\020\ufffc\022\ufffc\023\ufffc" +
    "\024\ufffc\025\ufffc\026\ufffc\001\002\000\020\007\005\014" +
    "\023\017\007\020\012\024\010\025\024\026\025\001\002" +
    "\000\020\005\ufff7\006\031\007\032\010\035\011\034\012" +
    "\027\016\033\001\002\000\020\007\005\014\023\017\007" +
    "\020\012\024\010\025\024\026\025\001\002\000\020\006" +
    "\031\007\032\010\035\011\034\012\027\015\056\016\033" +
    "\001\002\000\022\005\uffeb\006\uffeb\007\uffeb\010\uffeb\011" +
    "\uffeb\012\uffeb\015\uffeb\016\uffeb\001\002\000\004\002\000" +
    "\001\002\000\030\002\001\003\001\007\001\014\001\017" +
    "\001\020\001\022\001\023\001\024\001\025\001\026\001" +
    "\001\002\000\020\007\005\014\023\017\007\020\012\024" +
    "\010\025\024\026\025\001\002\000\020\006\031\007\032" +
    "\010\035\011\034\012\027\015\063\016\033\001\002\000" +
    "\022\005\uffec\006\uffec\007\uffec\010\uffec\011\uffec\012\uffec" +
    "\015\uffec\016\uffec\001\002\000\022\005\uffee\006\uffee\007" +
    "\uffee\010\uffee\011\uffee\012\uffee\015\uffee\016\uffee\001\002" +
    "\000\004\026\066\001\002\000\004\015\067\001\002\000" +
    "\004\005\uffe9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\020\002\010\003\020\004\016\005\021\006" +
    "\017\007\005\010\013\001\001\000\002\001\001\000\004" +
    "\006\063\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\016\003\057\004\016\005\021\006\017" +
    "\007\005\010\013\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\011\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\025\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\042\001\001\000\002\001\001\000\004\006\041\001\001" +
    "\000\004\006\040\001\001\000\004\006\037\001\001\000" +
    "\004\006\036\001\001\000\004\006\035\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\046\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\052" +
    "\001\001\000\002\001\001\000\004\006\054\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\061\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public void syntax_error(Symbol s) {
        System.err.println("Erro de sintaxe. Token inesperado: " + sym.terminalNames[s.sym] +
            ". Linha: " + (s.left + 1) + ", Coluna: " + (s.right + 1));
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
        System.err.println("Erro sintático próximo ao símbolo: <" + sym.terminalNames[s.sym] +
            ". Linha: " + (s.left + 1) + ", Coluna: " + (s.right + 1));
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr_part 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr_part 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$0 ::= 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

            Interpreter.interpret(e);
            //AST.printAST(e);
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NT$0",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr_part ::= expr NT$0 SEMI 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr_part ::= error SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= assign_expr 
            {
              AST RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= num_expr 
            {
              AST RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= input_expr 
            {
              AST RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= output_expr 
            {
              AST RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // assign_expr ::= ID ASSIGN num_expr 
            {
              AST RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
            RESULT = Operator.create(sym.ASSIGN, Identifier.create(id), e);
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assign_expr",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // num_expr ::= num_expr PLUS num_expr 
            {
              AST RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		AST e1 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e2 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Operator.create(sym.PLUS, e1, e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // num_expr ::= num_expr MINUS num_expr 
            {
              AST RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		AST e1 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e2 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Operator.create(sym.MINUS, e1, e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // num_expr ::= num_expr TIMES num_expr 
            {
              AST RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		AST e1 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e2 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Operator.create(sym.TIMES, e1, e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // num_expr ::= num_expr DIVIDE num_expr 
            {
              AST RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		AST e1 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e2 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Operator.create(sym.DIVIDE, e1, e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // num_expr ::= num_expr MOD num_expr 
            {
              AST RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		AST e1 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e2 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Operator.create(sym.MOD, e1, e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // num_expr ::= num_expr EXP num_expr 
            {
              AST RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		AST e1 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e2 = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Operator.create(sym.EXP, e1, e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // num_expr ::= NUMBER 
            {
              AST RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Number.create(n); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // num_expr ::= PI 
            {
              AST RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Number.create(n); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // num_expr ::= MINUS num_expr 
            {
              AST RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Operator.create(sym.UMINUS, e);
                   
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // num_expr ::= LPAREN num_expr RPAREN 
            {
              AST RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // num_expr ::= SIN LPAREN num_expr RPAREN 
            {
              AST RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = Operator.create(sym.SIN, e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // num_expr ::= COS LPAREN num_expr RPAREN 
            {
              AST RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = Operator.create(sym.COS, e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // num_expr ::= ID 
            {
              AST RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Identifier.create(id); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("num_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // input_expr ::= READ LPAREN ID RPAREN 
            {
              AST RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = Operator.create(sym.READ,
                                Identifier.create(id)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("input_expr",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // output_expr ::= PRINT LPAREN num_expr RPAREN 
            {
              AST RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		AST e = (AST)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = Operator.create(sym.PRINT, e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("output_expr",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}