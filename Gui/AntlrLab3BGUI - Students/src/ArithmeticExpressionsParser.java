// $ANTLR 3.4 D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g 2025-05-08 04:21:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOUBLE", "Factor", "Fun", "GeneralArithExpr", "ID", "INT", "StartgeneralArithExpr", "Term", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "';'"
    };

    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int DOUBLE=4;
    public static final int Factor=5;
    public static final int Fun=6;
    public static final int GeneralArithExpr=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int StartgeneralArithExpr=10;
    public static final int Term=11;
    public static final int WS=12;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ArithmeticExpressionsParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArithmeticExpressionsParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ArithmeticExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g"; }


    String s="";


    public static class startgeneralArithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "startgeneralArithExpr"
    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:15:1: startgeneralArithExpr : ( ( generalArithExpr )+ ';' ) -> ^( StartgeneralArithExpr ( generalArithExpr )+ ';' ) ;
    public final ArithmeticExpressionsParser.startgeneralArithExpr_return startgeneralArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.startgeneralArithExpr_return retval = new ArithmeticExpressionsParser.startgeneralArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr1 =null;


        Object char_literal2_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:15:22: ( ( ( generalArithExpr )+ ';' ) -> ^( StartgeneralArithExpr ( generalArithExpr )+ ';' ) )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:15:24: ( ( generalArithExpr )+ ';' )
            {
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:15:24: ( ( generalArithExpr )+ ';' )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:15:25: ( generalArithExpr )+ ';'
            {
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:15:25: ( generalArithExpr )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DOUBLE||LA1_0==Fun||(LA1_0 >= ID && LA1_0 <= INT)||LA1_0==13||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:15:25: generalArithExpr
            	    {
            	    pushFollow(FOLLOW_generalArithExpr_in_startgeneralArithExpr40);
            	    generalArithExpr1=generalArithExpr();

            	    state._fsp--;

            	    stream_generalArithExpr.add(generalArithExpr1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            char_literal2=(Token)match(input,19,FOLLOW_19_in_startgeneralArithExpr43);  
            stream_19.add(char_literal2);


            }


            // AST REWRITE
            // elements: generalArithExpr, 19
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 16:2: -> ^( StartgeneralArithExpr ( generalArithExpr )+ ';' )
            {
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:16:5: ^( StartgeneralArithExpr ( generalArithExpr )+ ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(StartgeneralArithExpr, "StartgeneralArithExpr")
                , root_1);

                if ( !(stream_generalArithExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_generalArithExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                }
                stream_generalArithExpr.reset();

                adaptor.addChild(root_1, 
                stream_19.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "startgeneralArithExpr"


    public static class generalArithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generalArithExpr"
    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:26:1: generalArithExpr : term ( ( '+' | '-' ) ^ term )* ;
    public final ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.generalArithExpr_return retval = new ArithmeticExpressionsParser.generalArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set4=null;
        ArithmeticExpressionsParser.term_return term3 =null;

        ArithmeticExpressionsParser.term_return term5 =null;


        Object set4_tree=null;

        try {
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:26:17: ( term ( ( '+' | '-' ) ^ term )* )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:26:19: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_generalArithExpr105);
            term3=term();

            state._fsp--;

            adaptor.addChild(root_0, term3.getTree());

            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:26:24: ( ( '+' | '-' ) ^ term )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    switch ( input.LA(2) ) {
                    case ID:
                        {
                        alt2=1;
                        }
                        break;
                    case INT:
                        {
                        alt2=1;
                        }
                        break;
                    case DOUBLE:
                    case Fun:
                    case 13:
                    case 17:
                        {
                        alt2=1;
                        }
                        break;

                    }

                }
                else if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:26:25: ( '+' | '-' ) ^ term
            	    {
            	    set4=(Token)input.LT(1);

            	    set4=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 16 && input.LA(1) <= 17) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set4)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_generalArithExpr118);
            	    term5=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "generalArithExpr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:34:1: term : factor ( ( '*' | '/' ) ^ factor )* ;
    public final ArithmeticExpressionsParser.term_return term() throws RecognitionException {
        ArithmeticExpressionsParser.term_return retval = new ArithmeticExpressionsParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set7=null;
        ArithmeticExpressionsParser.factor_return factor6 =null;

        ArithmeticExpressionsParser.factor_return factor8 =null;


        Object set7_tree=null;

        try {
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:34:6: ( factor ( ( '*' | '/' ) ^ factor )* )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:34:8: factor ( ( '*' | '/' ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term156);
            factor6=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor6.getTree());

            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:34:15: ( ( '*' | '/' ) ^ factor )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:34:17: ( '*' | '/' ) ^ factor
            	    {
            	    set7=(Token)input.LT(1);

            	    set7=(Token)input.LT(1);

            	    if ( input.LA(1)==15||input.LA(1)==18 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set7)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term171);
            	    factor8=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor8.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:42:1: factor : ( ID -> ^( Factor ID ) | INT -> ^( Factor INT ) | DOUBLE -> ^( Factor DOUBLE ) | '-' ID -> ^( Factor '-' ID ) | '-' INT -> ^( Factor '-' INT ) | '-' DOUBLE -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) );
    public final ArithmeticExpressionsParser.factor_return factor() throws RecognitionException {
        ArithmeticExpressionsParser.factor_return retval = new ArithmeticExpressionsParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID9=null;
        Token INT10=null;
        Token DOUBLE11=null;
        Token char_literal12=null;
        Token ID13=null;
        Token char_literal14=null;
        Token INT15=null;
        Token char_literal16=null;
        Token DOUBLE17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        Token Fun21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr19 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr23 =null;


        Object ID9_tree=null;
        Object INT10_tree=null;
        Object DOUBLE11_tree=null;
        Object char_literal12_tree=null;
        Object ID13_tree=null;
        Object char_literal14_tree=null;
        Object INT15_tree=null;
        Object char_literal16_tree=null;
        Object DOUBLE17_tree=null;
        Object char_literal18_tree=null;
        Object char_literal20_tree=null;
        Object Fun21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOUBLE=new RewriteRuleTokenStream(adaptor,"token DOUBLE");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_Fun=new RewriteRuleTokenStream(adaptor,"token Fun");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:42:8: ( ID -> ^( Factor ID ) | INT -> ^( Factor INT ) | DOUBLE -> ^( Factor DOUBLE ) | '-' ID -> ^( Factor '-' ID ) | '-' INT -> ^( Factor '-' INT ) | '-' DOUBLE -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt4=1;
                }
                break;
            case INT:
                {
                alt4=2;
                }
                break;
            case DOUBLE:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt4=4;
                    }
                    break;
                case INT:
                    {
                    alt4=5;
                    }
                    break;
                case DOUBLE:
                    {
                    alt4=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;

                }

                }
                break;
            case 13:
                {
                alt4=7;
                }
                break;
            case Fun:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:42:11: ID
                    {
                    ID9=(Token)match(input,ID,FOLLOW_ID_in_factor209);  
                    stream_ID.add(ID9);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 42:14: -> ^( Factor ID )
                    {
                        // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:42:17: ^( Factor ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:43:3: INT
                    {
                    INT10=(Token)match(input,INT,FOLLOW_INT_in_factor221);  
                    stream_INT.add(INT10);


                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 43:7: -> ^( Factor INT )
                    {
                        // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:43:10: ^( Factor INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:44:3: DOUBLE
                    {
                    DOUBLE11=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_factor233);  
                    stream_DOUBLE.add(DOUBLE11);


                    // AST REWRITE
                    // elements: DOUBLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 44:10: -> ^( Factor DOUBLE )
                    {
                        // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:44:13: ^( Factor DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_DOUBLE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:45:4: '-' ID
                    {
                    char_literal12=(Token)match(input,17,FOLLOW_17_in_factor246);  
                    stream_17.add(char_literal12);


                    ID13=(Token)match(input,ID,FOLLOW_ID_in_factor249);  
                    stream_ID.add(ID13);


                    // AST REWRITE
                    // elements: 17, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 45:12: -> ^( Factor '-' ID )
                    {
                        // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:45:15: ^( Factor '-' ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_17.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:46:4: '-' INT
                    {
                    char_literal14=(Token)match(input,17,FOLLOW_17_in_factor265);  
                    stream_17.add(char_literal14);


                    INT15=(Token)match(input,INT,FOLLOW_INT_in_factor268);  
                    stream_INT.add(INT15);


                    // AST REWRITE
                    // elements: 17, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 46:13: -> ^( Factor '-' INT )
                    {
                        // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:46:16: ^( Factor '-' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_17.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:47:4: '-' DOUBLE
                    {
                    char_literal16=(Token)match(input,17,FOLLOW_17_in_factor284);  
                    stream_17.add(char_literal16);


                    DOUBLE17=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_factor287);  
                    stream_DOUBLE.add(DOUBLE17);


                    // AST REWRITE
                    // elements: 17, DOUBLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 47:17: -> ^( Factor '-' DOUBLE )
                    {
                        // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:47:20: ^( Factor '-' DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_17.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_DOUBLE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:48:4: '(' generalArithExpr ')'
                    {
                    char_literal18=(Token)match(input,13,FOLLOW_13_in_factor304);  
                    stream_13.add(char_literal18);


                    pushFollow(FOLLOW_generalArithExpr_in_factor306);
                    generalArithExpr19=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr19.getTree());

                    char_literal20=(Token)match(input,14,FOLLOW_14_in_factor308);  
                    stream_14.add(char_literal20);


                    // AST REWRITE
                    // elements: 14, generalArithExpr, 13
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 48:29: -> ^( Factor '(' generalArithExpr ')' )
                    {
                        // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:48:32: ^( Factor '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_13.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_14.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:49:4: Fun '(' generalArithExpr ')'
                    {
                    Fun21=(Token)match(input,Fun,FOLLOW_Fun_in_factor326);  
                    stream_Fun.add(Fun21);


                    char_literal22=(Token)match(input,13,FOLLOW_13_in_factor328);  
                    stream_13.add(char_literal22);


                    pushFollow(FOLLOW_generalArithExpr_in_factor330);
                    generalArithExpr23=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr23.getTree());

                    char_literal24=(Token)match(input,14,FOLLOW_14_in_factor332);  
                    stream_14.add(char_literal24);


                    // AST REWRITE
                    // elements: 13, generalArithExpr, 14, Fun
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:33: -> ^( Factor Fun '(' generalArithExpr ')' )
                    {
                        // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:49:36: ^( Factor Fun '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Fun.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_13.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_14.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_generalArithExpr_in_startgeneralArithExpr40 = new BitSet(new long[]{0x00000000000A2350L});
    public static final BitSet FOLLOW_19_in_startgeneralArithExpr43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_generalArithExpr105 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_set_in_generalArithExpr108 = new BitSet(new long[]{0x0000000000022350L});
    public static final BitSet FOLLOW_term_in_generalArithExpr118 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_factor_in_term156 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_set_in_term160 = new BitSet(new long[]{0x0000000000022350L});
    public static final BitSet FOLLOW_factor_in_term171 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_ID_in_factor209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_factor233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_factor246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_factor249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_factor265 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_factor268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_factor284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOUBLE_in_factor287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_factor304 = new BitSet(new long[]{0x0000000000022350L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor306 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_factor308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fun_in_factor326 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_factor328 = new BitSet(new long[]{0x0000000000022350L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor330 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_factor332 = new BitSet(new long[]{0x0000000000000002L});

}