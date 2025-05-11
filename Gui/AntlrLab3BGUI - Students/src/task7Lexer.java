// $ANTLR 3.4 C:\\Users\\ahmed rashed\\Desktop\\task7.g 2025-05-08 11:17:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class task7Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int COMMENT=4;
    public static final int Disp=5;
    public static final int Double=6;
    public static final int Factor=7;
    public static final int GeneralArithExpr=8;
    public static final int Id=9;
    public static final int Int=10;
    public static final int Roper=11;
    public static final int StartgeneralArithExpr=12;
    public static final int String=13;
    public static final int Term=14;
    public static final int Type=15;
    public static final int WS=16;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public task7Lexer() {} 
    public task7Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public task7Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\ahmed rashed\\Desktop\\task7.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:2:7: ( '&&' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:2:9: '&&'
            {
            match("&&"); 



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
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:3:7: ( '(' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:3:9: '('
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:4:7: ( ')' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:4:9: ')'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:5:7: ( '*' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:5:9: '*'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:6:7: ( '+' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:6:9: '+'
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:7:7: ( ',' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:7:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:8:7: ( '-' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:8:9: '-'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:9:7: ( '/' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:9:9: '/'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:10:7: ( ';' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:10:9: ';'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:11:7: ( '=' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:12:7: ( '[' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:12:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:13:7: ( ']' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:13:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:14:7: ( 'disp' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:14:9: 'disp'
            {
            match("disp"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:15:7: ( 'else' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:15:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:16:7: ( 'end' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:16:9: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:17:7: ( 'end1' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:17:9: 'end1'
            {
            match("end1"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:18:7: ( 'false' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:18:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:19:7: ( 'for' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:19:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:20:7: ( 'if' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:20:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:21:7: ( 'input' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:21:9: 'input'
            {
            match("input"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:22:7: ( 'mod' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:22:9: 'mod'
            {
            match("mod"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:23:7: ( 'true' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:23:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:24:7: ( '||' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:24:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:79:5: ( 'int' | 'double' | 'string' | 'bool' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'd':
                {
                alt1=2;
                }
                break;
            case 's':
                {
                alt1=3;
                }
                break;
            case 'b':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:79:7: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:79:15: 'double'
                    {
                    match("double"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:79:26: 'string'
                    {
                    match("string"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:79:37: 'bool'
                    {
                    match("bool"); 



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
    // $ANTLR end "Type"

    // $ANTLR start "Id"
    public final void mId() throws RecognitionException {
        try {
            int _type = Id;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:83:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' )* )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:83:7: ( 'a' .. 'z' | 'A' .. 'Z' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:83:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "Id"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:87:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:87:7: ( '0' .. '9' )+
            {
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:87:7: ( '0' .. '9' )+
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
            	    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:
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
    // $ANTLR end "Int"

    // $ANTLR start "Double"
    public final void mDouble() throws RecognitionException {
        try {
            int _type = Double;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:91:5: ( Int '.' Int )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:91:7: Int '.' Int
            {
            mInt(); 


            match('.'); 

            mInt(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Double"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:95:5: ( '\"' (~ ( '\\n' | '\\r' | '\"' ) )* '\"' )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:95:7: '\"' (~ ( '\\n' | '\\r' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:95:11: (~ ( '\\n' | '\\r' | '\"' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop4;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:99:5: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:99:7: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:99:7: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


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

    // $ANTLR start "Roper"
    public final void mRoper() throws RecognitionException {
        try {
            int _type = Roper;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:103:5: ( '>' | '<' | '==' | '>=' | '<=' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='=') ) {
                    alt6=4;
                }
                else {
                    alt6=1;
                }
                }
                break;
            case '<':
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='=') ) {
                    alt6=5;
                }
                else {
                    alt6=2;
                }
                }
                break;
            case '=':
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:103:7: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:103:13: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:103:19: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:103:26: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:103:33: '<='
                    {
                    match("<="); 



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
    // $ANTLR end "Roper"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ahmed rashed\\Desktop\\task7.g:107:5: ( ( '//' (~ ( '\\r' | '\\n' | '\\r\\n' ) )* ) | ( '/*' ( options {greedy=false; } : . )* '*/' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='/') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='/') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='*') ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:107:7: ( '//' (~ ( '\\r' | '\\n' | '\\r\\n' ) )* )
                    {
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:107:7: ( '//' (~ ( '\\r' | '\\n' | '\\r\\n' ) )* )
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:107:8: '//' (~ ( '\\r' | '\\n' | '\\r\\n' ) )*
                    {
                    match("//"); 



                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:107:13: (~ ( '\\r' | '\\n' | '\\r\\n' ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:107:13: ~ ( '\\r' | '\\n' | '\\r\\n' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:108:7: ( '/*' ( options {greedy=false; } : . )* '*/' )
                    {
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:108:7: ( '/*' ( options {greedy=false; } : . )* '*/' )
                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:108:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:108:13: ( options {greedy=false; } : . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='*') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1=='/') ) {
                                alt8=2;
                            }
                            else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\ahmed rashed\\Desktop\\task7.g:108:40: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    match("*/"); 



                    }


                     skip(); 

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
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | Type | Id | Int | Double | String | WS | Roper | COMMENT )
        int alt10=31;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:10: T__17
                {
                mT__17(); 


                }
                break;
            case 2 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:16: T__18
                {
                mT__18(); 


                }
                break;
            case 3 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:22: T__19
                {
                mT__19(); 


                }
                break;
            case 4 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:28: T__20
                {
                mT__20(); 


                }
                break;
            case 5 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:34: T__21
                {
                mT__21(); 


                }
                break;
            case 6 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:40: T__22
                {
                mT__22(); 


                }
                break;
            case 7 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:46: T__23
                {
                mT__23(); 


                }
                break;
            case 8 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:52: T__24
                {
                mT__24(); 


                }
                break;
            case 9 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:58: T__25
                {
                mT__25(); 


                }
                break;
            case 10 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:64: T__26
                {
                mT__26(); 


                }
                break;
            case 11 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:70: T__27
                {
                mT__27(); 


                }
                break;
            case 12 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:76: T__28
                {
                mT__28(); 


                }
                break;
            case 13 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:82: T__29
                {
                mT__29(); 


                }
                break;
            case 14 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:88: T__30
                {
                mT__30(); 


                }
                break;
            case 15 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:94: T__31
                {
                mT__31(); 


                }
                break;
            case 16 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:100: T__32
                {
                mT__32(); 


                }
                break;
            case 17 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:106: T__33
                {
                mT__33(); 


                }
                break;
            case 18 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:112: T__34
                {
                mT__34(); 


                }
                break;
            case 19 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:118: T__35
                {
                mT__35(); 


                }
                break;
            case 20 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:124: T__36
                {
                mT__36(); 


                }
                break;
            case 21 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:130: T__37
                {
                mT__37(); 


                }
                break;
            case 22 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:136: T__38
                {
                mT__38(); 


                }
                break;
            case 23 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:142: T__39
                {
                mT__39(); 


                }
                break;
            case 24 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:148: Type
                {
                mType(); 


                }
                break;
            case 25 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:153: Id
                {
                mId(); 


                }
                break;
            case 26 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:156: Int
                {
                mInt(); 


                }
                break;
            case 27 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:160: Double
                {
                mDouble(); 


                }
                break;
            case 28 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:167: String
                {
                mString(); 


                }
                break;
            case 29 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:174: WS
                {
                mWS(); 


                }
                break;
            case 30 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:177: Roper
                {
                mRoper(); 


                }
                break;
            case 31 :
                // C:\\Users\\ahmed rashed\\Desktop\\task7.g:1:183: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\10\uffff\1\34\1\uffff\1\35\2\uffff\6\26\1\uffff\2\26\1\uffff\1"+
        "\52\6\uffff\6\26\1\62\5\26\2\uffff\3\26\1\75\1\26\1\77\1\uffff\1"+
        "\26\1\101\1\102\3\26\1\106\1\26\1\110\1\111\1\uffff\1\26\1\uffff"+
        "\1\26\2\uffff\1\114\1\26\1\101\1\uffff\1\26\2\uffff\1\117\1\120"+
        "\1\uffff\1\26\1\101\2\uffff\1\101";
    static final String DFA10_eofS =
        "\122\uffff";
    static final String DFA10_minS =
        "\1\11\7\uffff\1\52\1\uffff\1\75\2\uffff\1\151\1\154\1\141\1\146"+
        "\1\157\1\162\1\uffff\1\164\1\157\1\uffff\1\56\6\uffff\1\163\1\165"+
        "\1\163\1\144\1\154\1\162\1\44\1\160\1\144\1\165\1\162\1\157\2\uffff"+
        "\1\160\1\142\1\145\1\44\1\163\1\44\1\uffff\1\165\2\44\1\145\1\151"+
        "\1\154\1\44\1\154\2\44\1\uffff\1\145\1\uffff\1\164\2\uffff\1\44"+
        "\1\156\1\44\1\uffff\1\145\2\uffff\2\44\1\uffff\1\147\1\44\2\uffff"+
        "\1\44";
    static final String DFA10_maxS =
        "\1\174\7\uffff\1\57\1\uffff\1\75\2\uffff\1\157\1\156\1\157\1\156"+
        "\1\157\1\162\1\uffff\1\164\1\157\1\uffff\1\71\6\uffff\1\163\1\165"+
        "\1\163\1\144\1\154\1\162\1\172\1\164\1\144\1\165\1\162\1\157\2\uffff"+
        "\1\160\1\142\1\145\1\172\1\163\1\172\1\uffff\1\165\2\172\1\145\1"+
        "\151\1\154\1\172\1\154\2\172\1\uffff\1\145\1\uffff\1\164\2\uffff"+
        "\1\172\1\156\1\172\1\uffff\1\145\2\uffff\2\172\1\uffff\1\147\1\172"+
        "\2\uffff\1\172";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\uffff\1\13\1"+
        "\14\6\uffff\1\27\2\uffff\1\31\1\uffff\1\34\1\35\1\36\1\37\1\10\1"+
        "\12\14\uffff\1\32\1\33\6\uffff\1\23\12\uffff\1\17\1\uffff\1\22\1"+
        "\uffff\1\30\1\25\3\uffff\1\15\1\uffff\1\16\1\20\2\uffff\1\26\2\uffff"+
        "\1\21\1\24\1\uffff";
    static final String DFA10_specialS =
        "\122\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\uffff\1\30\1\uffff\1\26\1"+
            "\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\12\27"+
            "\1\uffff\1\11\1\32\1\12\1\32\2\uffff\32\26\1\13\1\uffff\1\14"+
            "\3\uffff\1\26\1\25\1\26\1\15\1\16\1\17\2\26\1\20\3\26\1\21\5"+
            "\26\1\24\1\22\6\26\1\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\4\uffff\1\33",
            "",
            "\1\32",
            "",
            "",
            "\1\36\5\uffff\1\37",
            "\1\40\1\uffff\1\41",
            "\1\42\15\uffff\1\43",
            "\1\44\7\uffff\1\45",
            "\1\46",
            "\1\47",
            "",
            "\1\50",
            "\1\51",
            "",
            "\1\53\1\uffff\12\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\63\3\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\26\13\uffff\1\26\1\74\10\26\7\uffff\32\26\6\uffff\32\26",
            "\1\76",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "\1\100",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\107",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "\1\112",
            "",
            "\1\113",
            "",
            "",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\115",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "\1\116",
            "",
            "",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "\1\121",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "\1\26\13\uffff\12\26\7\uffff\32\26\6\uffff\32\26"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | Type | Id | Int | Double | String | WS | Roper | COMMENT );";
        }
    }
 

}