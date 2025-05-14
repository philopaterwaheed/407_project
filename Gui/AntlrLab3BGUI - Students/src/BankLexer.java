// $ANTLR 3.4 /home/philosan/Dev/antlr/407_project/Bank.g 2025-05-14 18:58:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BankLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int Arithmetic_Expression=4;
    public static final int Assign=5;
    public static final int BOOLEAN=6;
    public static final int Body=7;
    public static final int Break=8;
    public static final int CLASS=9;
    public static final int COMMENT=10;
    public static final int Call=11;
    public static final int Class=12;
    public static final int Class_Member=13;
    public static final int Class_Members=14;
    public static final int Compilition_Unit=15;
    public static final int Constructor=16;
    public static final int Control_Structure=17;
    public static final int DIGIT=18;
    public static final int Declaration=19;
    public static final int Default_Case=20;
    public static final int Delete=21;
    public static final int Destructor=22;
    public static final int Do_While=23;
    public static final int ELSE=24;
    public static final int Else=25;
    public static final int FOR=26;
    public static final int Factor=27;
    public static final int For=28;
    public static final int Function=29;
    public static final int ID=30;
    public static final int IF=31;
    public static final int IFSTREAM=32;
    public static final int If=33;
    public static final int Include=34;
    public static final int Manipulator=35;
    public static final int Member_Access=36;
    public static final int NameSpace=37;
    public static final int Not=38;
    public static final int Parameter=39;
    public static final int Qualified=40;
    public static final int Return=41;
    public static final int Return_Type=42;
    public static final int Start=43;
    public static final int Statement=44;
    public static final int Statements=45;
    public static final int Switch=46;
    public static final int Switch_Case=47;
    public static final int Top_Level=48;
    public static final int Top_Level_Component=49;
    public static final int Type=50;
    public static final int WS=51;
    public static final int While=52;
    public static final int While_EXP=53;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public BankLexer() {} 
    public BankLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BankLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/philosan/Dev/antlr/407_project/Bank.g"; }

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:2:7: ( '!' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:3:7: ( '!=' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:3:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:4:7: ( '\"' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:4:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:5:7: ( '#include' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:5:9: '#include'
            {
            match("#include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:6:7: ( '&&' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:6:9: '&&'
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:7:7: ( '&' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:7:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:8:7: ( '(' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:8:9: '('
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:9:7: ( ')' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:9:9: ')'
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:10:7: ( '*' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:10:9: '*'
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:11:7: ( '+' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:11:9: '+'
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:12:7: ( '++' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:12:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:13:7: ( '+=' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:13:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:14:7: ( ',' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:14:9: ','
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:15:7: ( '-' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:15:9: '-'
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:16:7: ( '--' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:16:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:17:7: ( '-=' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:17:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:18:7: ( '->' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:18:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:19:7: ( '.' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:19:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:20:7: ( '.ignore' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:20:9: '.ignore'
            {
            match(".ignore"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:21:7: ( '/' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:21:9: '/'
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:22:7: ( ':' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:23:7: ( '::' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:23:9: '::'
            {
            match("::"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:24:7: ( ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:24:9: ';'
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:25:7: ( '<' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:25:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:26:7: ( '<<' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:26:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:27:7: ( '<=' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:27:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:28:7: ( '=' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:28:9: '='
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:29:7: ( '==' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:29:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:30:7: ( '>' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:30:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:31:7: ( '>=' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:31:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:32:7: ( '>>' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:32:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:33:7: ( '\\'' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:33:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:34:7: ( '\\\\' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:34:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:35:7: ( 'auto' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:35:9: 'auto'
            {
            match("auto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:36:7: ( 'bool' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:36:9: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:37:7: ( 'break' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:37:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:38:7: ( 'case' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:38:9: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:39:7: ( 'char' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:39:9: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:40:7: ( 'cin' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:40:9: 'cin'
            {
            match("cin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:41:7: ( 'const' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:41:9: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:42:7: ( 'cout' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:42:9: 'cout'
            {
            match("cout"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:43:7: ( 'default' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:43:9: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:44:7: ( 'delete' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:44:9: 'delete'
            {
            match("delete"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:45:7: ( 'do' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:45:9: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:46:7: ( 'double' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:46:9: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:47:7: ( 'endl' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:47:9: 'endl'
            {
            match("endl"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:48:8: ( 'float' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:48:10: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:49:8: ( 'getline' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:49:10: 'getline'
            {
            match("getline"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:50:8: ( 'int' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:50:10: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:51:8: ( 'left' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:51:10: 'left'
            {
            match("left"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:52:8: ( 'long' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:52:10: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:53:8: ( 'namespace' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:53:10: 'namespace'
            {
            match("namespace"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:54:8: ( 'new' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:54:10: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:55:8: ( 'private' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:55:10: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:56:8: ( 'protected' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:56:10: 'protected'
            {
            match("protected"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:57:8: ( 'public' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:57:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:58:8: ( 'return' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:58:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:59:8: ( 'right' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:59:10: 'right'
            {
            match("right"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:60:8: ( 'setw' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:60:10: 'setw'
            {
            match("setw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:61:8: ( 'short' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:61:10: 'short'
            {
            match("short"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:62:8: ( 'static' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:62:10: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:63:8: ( 'string' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:63:10: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:64:8: ( 'switch' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:64:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:65:8: ( 'using' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:65:10: 'using'
            {
            match("using"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:66:8: ( 'vector' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:66:10: 'vector'
            {
            match("vector"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:67:8: ( 'virtual' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:67:10: 'virtual'
            {
            match("virtual"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:68:8: ( 'void' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:68:10: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:69:8: ( 'while' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:69:10: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:70:8: ( '{' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:70:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:71:8: ( '||' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:71:10: '||'
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
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:72:8: ( '}' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:72:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:73:8: ( '~' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:73:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:712:9: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:712:11: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:712:20: 'false'
                    {
                    match("false"); 



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
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:714:7: ( 'class' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:714:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:716:4: ( 'if' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:716:6: 'if'
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
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:718:6: ( 'else' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:718:8: 'else'
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
    // $ANTLR end "ELSE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:720:5: ( 'for' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:720:7: 'for'
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
    // $ANTLR end "FOR"

    // $ANTLR start "IFSTREAM"
    public final void mIFSTREAM() throws RecognitionException {
        try {
            int _type = IFSTREAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:722:10: ( 'ofstream' | 'ifstream' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='o') ) {
                alt2=1;
            }
            else if ( (LA2_0=='i') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:722:12: 'ofstream'
                    {
                    match("ofstream"); 



                    }
                    break;
                case 2 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:722:25: 'ifstream'
                    {
                    match("ifstream"); 



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
    // $ANTLR end "IFSTREAM"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:724:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | DIGIT | '_' )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:724:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | DIGIT | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/philosan/Dev/antlr/407_project/Bank.g:724:28: ( 'a' .. 'z' | 'A' .. 'Z' | DIGIT | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:
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
            	    break loop3;
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:726:7: ( '0' .. '9' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:728:4: ( ( ' ' | '\\t' | '\\r\\n' | '\\u000C' | '\\n' )+ )
            // /home/philosan/Dev/antlr/407_project/Bank.g:728:6: ( ' ' | '\\t' | '\\r\\n' | '\\u000C' | '\\n' )+
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:728:6: ( ' ' | '\\t' | '\\r\\n' | '\\u000C' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=6;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt4=1;
                    }
                    break;
                case '\t':
                    {
                    alt4=2;
                    }
                    break;
                case '\r':
                    {
                    alt4=3;
                    }
                    break;
                case '\f':
                    {
                    alt4=4;
                    }
                    break;
                case '\n':
                    {
                    alt4=5;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:728:8: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:728:13: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:728:20: '\\r\\n'
            	    {
            	    match("\r\n"); 



            	    }
            	    break;
            	case 4 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:728:29: '\\u000C'
            	    {
            	    match('\f'); 

            	    }
            	    break;
            	case 5 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:728:40: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/philosan/Dev/antlr/407_project/Bank.g:730:9: ( ( '//' (~ ( '\\t' | '\\r' | '\\n' | '\\r\\n' | '\\u000C' ) )* ) | ( '/*' ( options {greedy=false; } : . )* '*/' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='/') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='/') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='*') ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:730:11: ( '//' (~ ( '\\t' | '\\r' | '\\n' | '\\r\\n' | '\\u000C' ) )* )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:730:11: ( '//' (~ ( '\\t' | '\\r' | '\\n' | '\\r\\n' | '\\u000C' ) )* )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:730:12: '//' (~ ( '\\t' | '\\r' | '\\n' | '\\r\\n' | '\\u000C' ) )*
                    {
                    match("//"); 



                    // /home/philosan/Dev/antlr/407_project/Bank.g:730:17: (~ ( '\\t' | '\\r' | '\\n' | '\\r\\n' | '\\u000C' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\b')||LA5_0=='\u000B'||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/philosan/Dev/antlr/407_project/Bank.g:730:17: ~ ( '\\t' | '\\r' | '\\n' | '\\r\\n' | '\\u000C' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||input.LA(1)=='\u000B'||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:730:66: ( '/*' ( options {greedy=false; } : . )* '*/' )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:730:66: ( '/*' ( options {greedy=false; } : . )* '*/' )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:730:67: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/philosan/Dev/antlr/407_project/Bank.g:730:72: ( options {greedy=false; } : . )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='*') ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1=='/') ) {
                                alt6=2;
                            }
                            else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/philosan/Dev/antlr/407_project/Bank.g:730:99: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
        // /home/philosan/Dev/antlr/407_project/Bank.g:1:8: ( T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | BOOLEAN | CLASS | IF | ELSE | FOR | IFSTREAM | ID | DIGIT | WS | COMMENT )
        int alt8=82;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:10: T__54
                {
                mT__54(); 


                }
                break;
            case 2 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:16: T__55
                {
                mT__55(); 


                }
                break;
            case 3 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:22: T__56
                {
                mT__56(); 


                }
                break;
            case 4 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:28: T__57
                {
                mT__57(); 


                }
                break;
            case 5 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:34: T__58
                {
                mT__58(); 


                }
                break;
            case 6 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:40: T__59
                {
                mT__59(); 


                }
                break;
            case 7 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:46: T__60
                {
                mT__60(); 


                }
                break;
            case 8 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:52: T__61
                {
                mT__61(); 


                }
                break;
            case 9 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:58: T__62
                {
                mT__62(); 


                }
                break;
            case 10 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:64: T__63
                {
                mT__63(); 


                }
                break;
            case 11 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:70: T__64
                {
                mT__64(); 


                }
                break;
            case 12 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:76: T__65
                {
                mT__65(); 


                }
                break;
            case 13 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:82: T__66
                {
                mT__66(); 


                }
                break;
            case 14 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:88: T__67
                {
                mT__67(); 


                }
                break;
            case 15 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:94: T__68
                {
                mT__68(); 


                }
                break;
            case 16 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:100: T__69
                {
                mT__69(); 


                }
                break;
            case 17 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:106: T__70
                {
                mT__70(); 


                }
                break;
            case 18 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:112: T__71
                {
                mT__71(); 


                }
                break;
            case 19 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:118: T__72
                {
                mT__72(); 


                }
                break;
            case 20 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:124: T__73
                {
                mT__73(); 


                }
                break;
            case 21 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:130: T__74
                {
                mT__74(); 


                }
                break;
            case 22 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:136: T__75
                {
                mT__75(); 


                }
                break;
            case 23 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:142: T__76
                {
                mT__76(); 


                }
                break;
            case 24 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:148: T__77
                {
                mT__77(); 


                }
                break;
            case 25 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:154: T__78
                {
                mT__78(); 


                }
                break;
            case 26 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:160: T__79
                {
                mT__79(); 


                }
                break;
            case 27 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:166: T__80
                {
                mT__80(); 


                }
                break;
            case 28 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:172: T__81
                {
                mT__81(); 


                }
                break;
            case 29 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:178: T__82
                {
                mT__82(); 


                }
                break;
            case 30 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:184: T__83
                {
                mT__83(); 


                }
                break;
            case 31 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:190: T__84
                {
                mT__84(); 


                }
                break;
            case 32 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:196: T__85
                {
                mT__85(); 


                }
                break;
            case 33 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:202: T__86
                {
                mT__86(); 


                }
                break;
            case 34 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:208: T__87
                {
                mT__87(); 


                }
                break;
            case 35 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:214: T__88
                {
                mT__88(); 


                }
                break;
            case 36 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:220: T__89
                {
                mT__89(); 


                }
                break;
            case 37 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:226: T__90
                {
                mT__90(); 


                }
                break;
            case 38 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:232: T__91
                {
                mT__91(); 


                }
                break;
            case 39 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:238: T__92
                {
                mT__92(); 


                }
                break;
            case 40 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:244: T__93
                {
                mT__93(); 


                }
                break;
            case 41 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:250: T__94
                {
                mT__94(); 


                }
                break;
            case 42 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:256: T__95
                {
                mT__95(); 


                }
                break;
            case 43 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:262: T__96
                {
                mT__96(); 


                }
                break;
            case 44 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:268: T__97
                {
                mT__97(); 


                }
                break;
            case 45 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:274: T__98
                {
                mT__98(); 


                }
                break;
            case 46 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:280: T__99
                {
                mT__99(); 


                }
                break;
            case 47 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:286: T__100
                {
                mT__100(); 


                }
                break;
            case 48 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:293: T__101
                {
                mT__101(); 


                }
                break;
            case 49 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:300: T__102
                {
                mT__102(); 


                }
                break;
            case 50 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:307: T__103
                {
                mT__103(); 


                }
                break;
            case 51 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:314: T__104
                {
                mT__104(); 


                }
                break;
            case 52 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:321: T__105
                {
                mT__105(); 


                }
                break;
            case 53 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:328: T__106
                {
                mT__106(); 


                }
                break;
            case 54 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:335: T__107
                {
                mT__107(); 


                }
                break;
            case 55 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:342: T__108
                {
                mT__108(); 


                }
                break;
            case 56 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:349: T__109
                {
                mT__109(); 


                }
                break;
            case 57 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:356: T__110
                {
                mT__110(); 


                }
                break;
            case 58 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:363: T__111
                {
                mT__111(); 


                }
                break;
            case 59 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:370: T__112
                {
                mT__112(); 


                }
                break;
            case 60 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:377: T__113
                {
                mT__113(); 


                }
                break;
            case 61 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:384: T__114
                {
                mT__114(); 


                }
                break;
            case 62 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:391: T__115
                {
                mT__115(); 


                }
                break;
            case 63 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:398: T__116
                {
                mT__116(); 


                }
                break;
            case 64 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:405: T__117
                {
                mT__117(); 


                }
                break;
            case 65 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:412: T__118
                {
                mT__118(); 


                }
                break;
            case 66 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:419: T__119
                {
                mT__119(); 


                }
                break;
            case 67 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:426: T__120
                {
                mT__120(); 


                }
                break;
            case 68 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:433: T__121
                {
                mT__121(); 


                }
                break;
            case 69 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:440: T__122
                {
                mT__122(); 


                }
                break;
            case 70 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:447: T__123
                {
                mT__123(); 


                }
                break;
            case 71 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:454: T__124
                {
                mT__124(); 


                }
                break;
            case 72 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:461: T__125
                {
                mT__125(); 


                }
                break;
            case 73 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:468: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 74 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:476: CLASS
                {
                mCLASS(); 


                }
                break;
            case 75 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:482: IF
                {
                mIF(); 


                }
                break;
            case 76 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:485: ELSE
                {
                mELSE(); 


                }
                break;
            case 77 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:490: FOR
                {
                mFOR(); 


                }
                break;
            case 78 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:494: IFSTREAM
                {
                mIFSTREAM(); 


                }
                break;
            case 79 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:503: ID
                {
                mID(); 


                }
                break;
            case 80 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:506: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 81 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:512: WS
                {
                mWS(); 


                }
                break;
            case 82 :
                // /home/philosan/Dev/antlr/407_project/Bank.g:1:515: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\56\2\uffff\1\60\3\uffff\1\63\1\uffff\1\67\1\71\1\73\1"+
        "\75\1\uffff\1\100\1\102\1\105\2\uffff\20\52\4\uffff\2\52\34\uffff"+
        "\11\52\1\167\7\52\1\u0080\30\52\1\u009b\6\52\1\uffff\4\52\1\u00a6"+
        "\1\52\1\u00a8\1\52\1\uffff\3\52\1\u00ad\21\52\1\u00bf\1\u00c0\1"+
        "\52\1\u00c2\1\u00c3\1\uffff\1\52\1\u00c5\4\52\1\u00ca\1\u00cb\2"+
        "\52\1\uffff\1\52\1\uffff\1\52\1\u00d0\1\u00d1\1\52\1\uffff\5\52"+
        "\1\u00d8\7\52\1\u00e0\1\52\1\u00e2\1\52\2\uffff\1\u00e4\2\uffff"+
        "\1\u00e5\1\uffff\1\u00e6\3\52\2\uffff\1\u00ea\1\u00e2\2\52\2\uffff"+
        "\5\52\1\u00f2\1\uffff\1\u00f3\3\52\1\u00f7\2\52\1\uffff\1\u00fa"+
        "\1\uffff\1\52\3\uffff\1\52\1\u00fd\1\u00fe\1\uffff\5\52\1\u0104"+
        "\1\u0105\2\uffff\1\u0106\1\u0107\1\u0108\1\uffff\1\u0109\1\52\1"+
        "\uffff\1\52\1\u010c\2\uffff\1\u010d\2\52\1\u0110\1\52\6\uffff\1"+
        "\u0112\1\52\2\uffff\1\u0114\1\52\1\uffff\1\52\1\uffff\1\u0114\1"+
        "\uffff\1\u0117\1\u0118\2\uffff";
    static final String DFA8_eofS =
        "\u0119\uffff";
    static final String DFA8_minS =
        "\1\11\1\75\2\uffff\1\46\3\uffff\1\53\1\uffff\1\55\1\151\1\52\1\72"+
        "\1\uffff\1\74\2\75\2\uffff\1\165\1\157\1\141\1\145\1\154\1\141\1"+
        "\145\1\146\1\145\1\141\1\162\2\145\1\163\1\145\1\150\4\uffff\1\162"+
        "\1\146\34\uffff\1\164\1\157\1\145\1\163\1\141\2\156\1\141\1\146"+
        "\1\60\1\144\1\163\1\157\1\154\1\162\2\164\1\60\1\146\1\156\1\155"+
        "\1\167\1\151\1\142\1\164\1\147\1\164\1\157\1\141\2\151\1\143\1\162"+
        "\2\151\1\165\1\163\1\157\1\154\1\141\1\145\1\162\1\60\1\163\1\164"+
        "\1\163\1\141\1\145\1\142\1\uffff\1\154\1\145\1\141\1\163\1\60\1"+
        "\154\1\60\1\164\1\uffff\1\164\1\147\1\145\1\60\1\166\1\164\1\154"+
        "\1\165\1\150\1\167\1\162\1\164\1\151\1\164\1\156\2\164\1\144\1\154"+
        "\1\145\1\164\2\60\1\153\2\60\1\uffff\1\164\1\60\1\163\1\165\1\164"+
        "\1\154\2\60\1\164\1\145\1\uffff\1\151\1\uffff\1\162\2\60\1\163\1"+
        "\uffff\1\141\1\145\1\151\1\162\1\164\1\60\1\164\1\151\1\156\1\143"+
        "\1\147\1\157\1\165\1\60\1\145\1\60\1\162\2\uffff\1\60\2\uffff\1"+
        "\60\1\uffff\1\60\1\154\2\145\2\uffff\2\60\1\156\1\145\2\uffff\1"+
        "\160\1\164\2\143\1\156\1\60\1\uffff\1\60\1\143\1\147\1\150\1\60"+
        "\1\162\1\141\1\uffff\1\60\1\uffff\1\145\3\uffff\1\164\2\60\1\uffff"+
        "\1\145\2\141\1\145\1\164\2\60\2\uffff\3\60\1\uffff\1\60\1\154\1"+
        "\uffff\1\141\1\60\2\uffff\1\60\1\155\1\143\1\60\1\145\6\uffff\1"+
        "\60\1\155\2\uffff\1\60\1\145\1\uffff\1\144\1\uffff\1\60\1\uffff"+
        "\2\60\2\uffff";
    static final String DFA8_maxS =
        "\1\176\1\75\2\uffff\1\46\3\uffff\1\75\1\uffff\1\76\1\151\1\57\1"+
        "\72\1\uffff\2\75\1\76\2\uffff\1\165\1\162\2\157\1\156\1\157\1\145"+
        "\1\156\1\157\1\145\1\165\1\151\1\167\1\163\1\157\1\150\4\uffff\1"+
        "\162\1\146\34\uffff\1\164\1\157\1\145\1\163\1\141\1\156\1\165\1"+
        "\141\1\154\1\172\1\144\1\163\1\157\1\154\1\162\2\164\1\172\1\146"+
        "\1\156\1\155\1\167\1\157\1\142\1\164\1\147\1\164\1\157\1\162\2\151"+
        "\1\143\1\162\2\151\1\165\1\163\1\157\1\154\1\141\1\145\1\162\1\172"+
        "\1\163\1\164\1\163\1\141\1\145\1\142\1\uffff\1\154\1\145\1\141\1"+
        "\163\1\172\1\154\1\172\1\164\1\uffff\1\164\1\147\1\145\1\172\1\166"+
        "\1\164\1\154\1\165\1\150\1\167\1\162\1\164\1\151\1\164\1\156\2\164"+
        "\1\144\1\154\1\145\1\164\2\172\1\153\2\172\1\uffff\1\164\1\172\1"+
        "\163\1\165\1\164\1\154\2\172\1\164\1\145\1\uffff\1\151\1\uffff\1"+
        "\162\2\172\1\163\1\uffff\1\141\1\145\1\151\1\162\1\164\1\172\1\164"+
        "\1\151\1\156\1\143\1\147\1\157\1\165\1\172\1\145\1\172\1\162\2\uffff"+
        "\1\172\2\uffff\1\172\1\uffff\1\172\1\154\2\145\2\uffff\2\172\1\156"+
        "\1\145\2\uffff\1\160\1\164\2\143\1\156\1\172\1\uffff\1\172\1\143"+
        "\1\147\1\150\1\172\1\162\1\141\1\uffff\1\172\1\uffff\1\145\3\uffff"+
        "\1\164\2\172\1\uffff\1\145\2\141\1\145\1\164\2\172\2\uffff\3\172"+
        "\1\uffff\1\172\1\154\1\uffff\1\141\1\172\2\uffff\1\172\1\155\1\143"+
        "\1\172\1\145\6\uffff\1\172\1\155\2\uffff\1\172\1\145\1\uffff\1\144"+
        "\1\uffff\1\172\1\uffff\2\172\2\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\3\1\4\1\uffff\1\7\1\10\1\11\1\uffff\1\15\4\uffff\1\27"+
        "\3\uffff\1\40\1\41\20\uffff\1\105\1\106\1\107\1\110\2\uffff\1\117"+
        "\1\120\1\121\1\2\1\1\1\5\1\6\1\13\1\14\1\12\1\17\1\20\1\21\1\16"+
        "\1\23\1\22\1\122\1\24\1\26\1\25\1\31\1\32\1\30\1\34\1\33\1\36\1"+
        "\37\1\35\61\uffff\1\54\10\uffff\1\113\32\uffff\1\47\12\uffff\1\115"+
        "\1\uffff\1\61\4\uffff\1\65\21\uffff\1\42\1\43\1\uffff\1\45\1\46"+
        "\1\uffff\1\51\4\uffff\1\56\1\114\4\uffff\1\62\1\63\6\uffff\1\73"+
        "\7\uffff\1\103\1\uffff\1\111\1\uffff\1\44\1\50\1\112\3\uffff\1\57"+
        "\7\uffff\1\72\1\74\3\uffff\1\100\2\uffff\1\104\2\uffff\1\53\1\55"+
        "\5\uffff\1\70\1\71\1\75\1\76\1\77\1\101\2\uffff\1\52\1\60\2\uffff"+
        "\1\66\1\uffff\1\102\1\uffff\1\116\2\uffff\1\64\1\67";
    static final String DFA8_specialS =
        "\u0119\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\54\1\uffff\2\54\22\uffff\1\54\1\1\1\2\1\3\2\uffff\1\4\1\22"+
            "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\12\53\1\15\1\16\1\17\1"+
            "\20\1\21\2\uffff\32\52\1\uffff\1\23\4\uffff\1\24\1\25\1\26\1"+
            "\27\1\30\1\31\1\32\1\52\1\33\2\52\1\34\1\52\1\35\1\51\1\36\1"+
            "\52\1\37\1\40\1\50\1\41\1\42\1\43\3\52\1\44\1\45\1\46\1\47",
            "\1\55",
            "",
            "",
            "\1\57",
            "",
            "",
            "",
            "\1\61\21\uffff\1\62",
            "",
            "\1\64\17\uffff\1\65\1\66",
            "\1\70",
            "\1\72\4\uffff\1\72",
            "\1\74",
            "",
            "\1\76\1\77",
            "\1\101",
            "\1\103\1\104",
            "",
            "",
            "\1\106",
            "\1\107\2\uffff\1\110",
            "\1\111\6\uffff\1\112\1\113\2\uffff\1\115\2\uffff\1\114",
            "\1\116\11\uffff\1\117",
            "\1\121\1\uffff\1\120",
            "\1\123\12\uffff\1\122\2\uffff\1\124",
            "\1\125",
            "\1\127\7\uffff\1\126",
            "\1\130\11\uffff\1\131",
            "\1\132\3\uffff\1\133",
            "\1\134\2\uffff\1\135",
            "\1\136\3\uffff\1\137",
            "\1\140\2\uffff\1\141\13\uffff\1\142\2\uffff\1\143",
            "\1\144",
            "\1\145\3\uffff\1\146\5\uffff\1\147",
            "\1\150",
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161\6\uffff\1\162",
            "\1\163",
            "\1\164\5\uffff\1\165",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\166\5\52",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\177\7\52",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\5\uffff\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c\20\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00c4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e3",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00fb",
            "",
            "",
            "",
            "\1\u00fc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010a",
            "",
            "\1\u010b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010e",
            "\1\u010f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0113",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0115",
            "",
            "\1\u0116",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | BOOLEAN | CLASS | IF | ELSE | FOR | IFSTREAM | ID | DIGIT | WS | COMMENT );";
        }
    }
 

}