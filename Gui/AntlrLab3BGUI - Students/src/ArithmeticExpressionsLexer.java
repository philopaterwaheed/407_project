// $ANTLR 3.4 D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g 2025-05-08 04:21:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ArithmeticExpressionsLexer() {} 
    public ArithmeticExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArithmeticExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:2:7: ( '(' )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:2:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:3:7: ( ')' )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:4:7: ( '*' )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:4:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:5:7: ( '+' )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:5:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:6:7: ( '-' )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:6:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:7:7: ( '/' )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:7:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:8:7: ( ';' )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:8:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "Fun"
    public final void mFun() throws RecognitionException {
        try {
            int _type = Fun;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:57:5: ( 'sin' | 'cos' | 'tan' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt1=1;
                }
                break;
            case 'c':
                {
                alt1=2;
                }
                break;
            case 't':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:57:7: 'sin'
                    {
                    match("sin"); 



                    }
                    break;
                case 2 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:57:15: 'cos'
                    {
                    match("cos"); 



                    }
                    break;
                case 3 :
                    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:57:22: 'tan'
                    {
                    match("tan"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Fun"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:60:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:60:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:60:32: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:61:5: ( ( '0' .. '9' )+ )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:61:8: ( '0' .. '9' )+
            {
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:61:8: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:62:8: ( INT '.' INT )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:62:10: INT '.' INT
            {
            mINT(); 


            match('.'); 

            mINT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:63:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:63:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | Fun | ID | INT | DOUBLE | WS )
        int alt4=12;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:28: T__16
                {
                mT__16(); 


                }
                break;
            case 5 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:34: T__17
                {
                mT__17(); 


                }
                break;
            case 6 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:40: T__18
                {
                mT__18(); 


                }
                break;
            case 7 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:46: T__19
                {
                mT__19(); 


                }
                break;
            case 8 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:52: Fun
                {
                mFun(); 


                }
                break;
            case 9 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:56: ID
                {
                mID(); 


                }
                break;
            case 10 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:59: INT
                {
                mINT(); 


                }
                break;
            case 11 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:63: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 12 :
                // D:\\ANTLR\\Lab4\\Lab4\\Programs\\ArithmeticExpressions.g:1:70: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\10\uffff\3\13\1\uffff\1\21\1\uffff\3\13\2\uffff\3\26\1\uffff";
    static final String DFA4_eofS =
        "\27\uffff";
    static final String DFA4_minS =
        "\1\11\7\uffff\1\151\1\157\1\141\1\uffff\1\56\1\uffff\1\156\1\163"+
        "\1\156\2\uffff\3\60\1\uffff";
    static final String DFA4_maxS =
        "\1\172\7\uffff\1\151\1\157\1\141\1\uffff\1\71\1\uffff\1\156\1\163"+
        "\1\156\2\uffff\3\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\11\1\uffff\1\14\3"+
        "\uffff\1\12\1\13\3\uffff\1\10";
    static final String DFA4_specialS =
        "\27\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\15\2\uffff\1\15\22\uffff\1\15\7\uffff\1\1\1\2\1\3\1\4\1\uffff"+
            "\1\5\1\uffff\1\6\12\14\1\uffff\1\7\5\uffff\32\13\4\uffff\1\13"+
            "\1\uffff\2\13\1\11\17\13\1\10\1\12\6\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            "\1\22\1\uffff\12\14",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "",
            "",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | Fun | ID | INT | DOUBLE | WS );";
        }
    }
 

}