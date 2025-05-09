// $ANTLR 3.4 E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g 2025-05-09 22:39:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BankParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "CLASS", "COMMENT", "DIGIT", "ELSE", "FOR", "ID", "IF", "WS", "'!'", "'!='", "'\"'", "'#include'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'.'", "'.ignore'", "'/'", "':'", "'::'", "';'", "'<'", "'<<'", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'\\''", "'\\\\'", "'\\n'", "'\\r'", "'auto'", "'bool'", "'break'", "'case'", "'char'", "'cin'", "'const'", "'cout'", "'default'", "'delete'", "'do'", "'double'", "'endl'", "'float'", "'getline'", "'ifstream'", "'int'", "'left'", "'long'", "'namespace'", "'new'", "'ofstream'", "'private'", "'protected'", "'public'", "'return'", "'right'", "'setw'", "'short'", "'static'", "'string'", "'switch'", "'using'", "'vector'", "'virtual'", "'void'", "'while'", "'{'", "'||'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
    public static final int BOOLEAN=4;
    public static final int CLASS=5;
    public static final int COMMENT=6;
    public static final int DIGIT=7;
    public static final int ELSE=8;
    public static final int FOR=9;
    public static final int ID=10;
    public static final int IF=11;
    public static final int WS=12;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public BankParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public BankParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return BankParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g"; }



    // $ANTLR start "start"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:7:1: start : top_level ;
    public final void start() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:7:6: ( top_level )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:7:8: top_level
            {
            pushFollow(FOLLOW_top_level_in_start25);
            top_level();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "top_level"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:9:1: top_level : compilation_unit ( function_definition | class_definition | declaration )+ ;
    public final void top_level() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:9:11: ( compilation_unit ( function_definition | class_definition | declaration )+ )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:9:13: compilation_unit ( function_definition | class_definition | declaration )+
            {
            pushFollow(FOLLOW_compilation_unit_in_top_level34);
            compilation_unit();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:9:30: ( function_definition | class_definition | declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:9:32: function_definition
            	    {
            	    pushFollow(FOLLOW_function_definition_in_top_level38);
            	    function_definition();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:9:54: class_definition
            	    {
            	    pushFollow(FOLLOW_class_definition_in_top_level42);
            	    class_definition();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:9:73: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_top_level46);
            	    declaration();

            	    state._fsp--;


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


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "top_level"



    // $ANTLR start "compilation_unit"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:14:1: compilation_unit : ( include | name_space )* ;
    public final void compilation_unit() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:14:18: ( ( include | name_space )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:14:20: ( include | name_space )*
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:14:20: ( include | name_space )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }
                else if ( (LA2_0==80) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:14:21: include
            	    {
            	    pushFollow(FOLLOW_include_in_compilation_unit62);
            	    include();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:14:31: name_space
            	    {
            	    pushFollow(FOLLOW_name_space_in_compilation_unit66);
            	    name_space();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "compilation_unit"



    // $ANTLR start "include"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:16:1: include : '#include' ( lib | header ) ;
    public final void include() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:16:9: ( '#include' ( lib | header ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:16:11: '#include' ( lib | header )
            {
            match(input,16,FOLLOW_16_in_include77); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:16:22: ( lib | header )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:16:23: lib
                    {
                    pushFollow(FOLLOW_lib_in_include80);
                    lib();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:16:29: header
                    {
                    pushFollow(FOLLOW_header_in_include84);
                    header();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "include"



    // $ANTLR start "lib"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:18:1: lib : '<' (~ ( '\\r' | '\\n' | '>' ) )* '>' ;
    public final void lib() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:18:5: ( '<' (~ ( '\\r' | '\\n' | '>' ) )* '>' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:18:7: '<' (~ ( '\\r' | '\\n' | '>' ) )* '>'
            {
            match(input,36,FOLLOW_36_in_lib94); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:18:11: (~ ( '\\r' | '\\n' | '>' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= BOOLEAN && LA4_0 <= 40)||(LA4_0 >= 42 && LA4_0 <= 45)||(LA4_0 >= 48 && LA4_0 <= 88)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            	    {
            	    if ( (input.LA(1) >= BOOLEAN && input.LA(1) <= 40)||(input.LA(1) >= 42 && input.LA(1) <= 45)||(input.LA(1) >= 48 && input.LA(1) <= 88) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,41,FOLLOW_41_in_lib112); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lib"



    // $ANTLR start "header"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:20:1: header : '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' ;
    public final void header() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:20:8: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:20:10: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
            {
            match(input,15,FOLLOW_15_in_header121); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:20:14: (~ ( '\\r' | '\\n' | '\"' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= BOOLEAN && LA5_0 <= 14)||(LA5_0 >= 16 && LA5_0 <= 45)||(LA5_0 >= 48 && LA5_0 <= 88)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            	    {
            	    if ( (input.LA(1) >= BOOLEAN && input.LA(1) <= 14)||(input.LA(1) >= 16 && input.LA(1) <= 45)||(input.LA(1) >= 48 && input.LA(1) <= 88) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input,15,FOLLOW_15_in_header139); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "header"



    // $ANTLR start "name_space"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:22:1: name_space : 'using' 'namespace' ID ( '::' ID )* ';' ;
    public final void name_space() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:22:12: ( 'using' 'namespace' ID ( '::' ID )* ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:22:14: 'using' 'namespace' ID ( '::' ID )* ';'
            {
            match(input,80,FOLLOW_80_in_name_space148); 

            match(input,67,FOLLOW_67_in_name_space150); 

            match(input,ID,FOLLOW_ID_in_name_space152); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:22:37: ( '::' ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:22:38: '::' ID
            	    {
            	    match(input,34,FOLLOW_34_in_name_space155); 

            	    match(input,ID,FOLLOW_ID_in_name_space157); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,35,FOLLOW_35_in_name_space161); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "name_space"



    // $ANTLR start "function_definition"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:29:1: function_definition : return_type function_name '(' ( parameters )? ')' body ;
    public final void function_definition() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:29:21: ( return_type function_name '(' ( parameters )? ')' body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:29:23: return_type function_name '(' ( parameters )? ')' body
            {
            pushFollow(FOLLOW_return_type_in_function_definition175);
            return_type();

            state._fsp--;


            pushFollow(FOLLOW_function_name_in_function_definition177);
            function_name();

            state._fsp--;


            match(input,19,FOLLOW_19_in_function_definition179); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:29:53: ( parameters )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||LA7_0==49||LA7_0==52||LA7_0==59||LA7_0==61||LA7_0==64||LA7_0==66||LA7_0==76||LA7_0==78||LA7_0==81) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:29:53: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_function_definition181);
                    parameters();

                    state._fsp--;


                    }
                    break;

            }


            match(input,20,FOLLOW_20_in_function_definition184); 

            pushFollow(FOLLOW_body_in_function_definition186);
            body();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "function_definition"



    // $ANTLR start "function_name"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:31:1: function_name : ID ;
    public final void function_name() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:31:15: ( ID )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:31:17: ID
            {
            match(input,ID,FOLLOW_ID_in_function_name195); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "function_name"



    // $ANTLR start "parameters"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:33:1: parameters : parameter ( ',' parameter )* ;
    public final void parameters() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:33:12: ( parameter ( ',' parameter )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:33:14: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameters204);
            parameter();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:33:24: ( ',' parameter )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:33:25: ',' parameter
            	    {
            	    match(input,25,FOLLOW_25_in_parameters207); 

            	    pushFollow(FOLLOW_parameter_in_parameters209);
            	    parameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parameters"



    // $ANTLR start "parameter"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:35:1: parameter : type ID ;
    public final void parameter() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:35:11: ( type ID )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:35:13: type ID
            {
            pushFollow(FOLLOW_type_in_parameter220);
            type();

            state._fsp--;


            match(input,ID,FOLLOW_ID_in_parameter222); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parameter"



    // $ANTLR start "body"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:42:1: body : ( '{' statements '}' | statement );
    public final void body() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:42:6: ( '{' statements '}' | statement )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==85) ) {
                alt9=1;
            }
            else if ( ((LA9_0 >= FOR && LA9_0 <= IF)||LA9_0==49||(LA9_0 >= 52 && LA9_0 <= 53)||LA9_0==55||(LA9_0 >= 57 && LA9_0 <= 59)||(LA9_0 >= 61 && LA9_0 <= 64)||LA9_0==66||LA9_0==69||LA9_0==73||LA9_0==76||(LA9_0 >= 78 && LA9_0 <= 79)||LA9_0==81||LA9_0==84) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:42:8: '{' statements '}'
                    {
                    match(input,85,FOLLOW_85_in_body236); 

                    pushFollow(FOLLOW_statements_in_body238);
                    statements();

                    state._fsp--;


                    match(input,87,FOLLOW_87_in_body240); 

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:42:29: statement
                    {
                    pushFollow(FOLLOW_statement_in_body244);
                    statement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "body"



    // $ANTLR start "statements"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:44:1: statements : ( statement )* ;
    public final void statements() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:44:12: ( ( statement )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:44:14: ( statement )*
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:44:14: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= FOR && LA10_0 <= IF)||LA10_0==49||(LA10_0 >= 52 && LA10_0 <= 53)||LA10_0==55||(LA10_0 >= 57 && LA10_0 <= 59)||(LA10_0 >= 61 && LA10_0 <= 64)||LA10_0==66||LA10_0==69||LA10_0==73||LA10_0==76||(LA10_0 >= 78 && LA10_0 <= 79)||LA10_0==81||LA10_0==84) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:44:15: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements254);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statements"



    // $ANTLR start "statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:46:1: statement : ( declaration | assignment ';' | member_access ';' | control_structure | return_statement | output | input | delete_statement );
    public final void statement() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:47:5: ( declaration | assignment ';' | member_access ';' | control_structure | return_statement | output | input | delete_statement )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 49:
            case 52:
            case 59:
            case 61:
            case 63:
            case 64:
            case 66:
            case 69:
            case 76:
            case 78:
            case 81:
                {
                alt11=1;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 24:
                case 28:
                case 39:
                    {
                    alt11=2;
                    }
                    break;
                case 29:
                case 30:
                    {
                    alt11=3;
                    }
                    break;
                case ID:
                case 21:
                    {
                    alt11=1;
                    }
                    break;
                case 35:
                case 37:
                    {
                    alt11=6;
                    }
                    break;
                case 31:
                case 43:
                    {
                    alt11=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }

                }
                break;
            case FOR:
            case IF:
            case 58:
            case 79:
            case 84:
                {
                alt11=4;
                }
                break;
            case 73:
                {
                alt11=5;
                }
                break;
            case 55:
                {
                alt11=6;
                }
                break;
            case 53:
            case 62:
                {
                alt11=7;
                }
                break;
            case 57:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:47:7: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement269);
                    declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:48:7: assignment ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement277);
                    assignment();

                    state._fsp--;


                    match(input,35,FOLLOW_35_in_statement279); 

                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:49:7: member_access ';'
                    {
                    pushFollow(FOLLOW_member_access_in_statement287);
                    member_access();

                    state._fsp--;


                    match(input,35,FOLLOW_35_in_statement289); 

                    }
                    break;
                case 4 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:50:7: control_structure
                    {
                    pushFollow(FOLLOW_control_structure_in_statement297);
                    control_structure();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:51:7: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_statement305);
                    return_statement();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:52:7: output
                    {
                    pushFollow(FOLLOW_output_in_statement313);
                    output();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:53:7: input
                    {
                    pushFollow(FOLLOW_input_in_statement321);
                    input();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:54:7: delete_statement
                    {
                    pushFollow(FOLLOW_delete_statement_in_statement329);
                    delete_statement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "assignment"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:57:1: assignment : ID ( '=' | '+=' | '-=' ) expression ;
    public final void assignment() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:57:12: ( ID ( '=' | '+=' | '-=' ) expression )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:57:14: ID ( '=' | '+=' | '-=' ) expression
            {
            match(input,ID,FOLLOW_ID_in_assignment346); 

            if ( input.LA(1)==24||input.LA(1)==28||input.LA(1)==39 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_expression_in_assignment362);
            expression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "delete_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:59:1: delete_statement : 'delete' expression ';' ;
    public final void delete_statement() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:59:18: ( 'delete' expression ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:59:20: 'delete' expression ';'
            {
            match(input,57,FOLLOW_57_in_delete_statement371); 

            pushFollow(FOLLOW_expression_in_delete_statement373);
            expression();

            state._fsp--;


            match(input,35,FOLLOW_35_in_delete_statement375); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "delete_statement"



    // $ANTLR start "return_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:61:1: return_statement : 'return' ( expression )? ';' ;
    public final void return_statement() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:61:18: ( 'return' ( expression )? ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:61:20: 'return' ( expression )? ';'
            {
            match(input,73,FOLLOW_73_in_return_statement384); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:61:29: ( expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BOOLEAN||LA12_0==DIGIT||LA12_0==ID||LA12_0==13||LA12_0==15||LA12_0==19||LA12_0==23||LA12_0==27||LA12_0==68) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:61:29: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement386);
                    expression();

                    state._fsp--;


                    }
                    break;

            }


            match(input,35,FOLLOW_35_in_return_statement389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "return_statement"



    // $ANTLR start "control_structure"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:68:1: control_structure : ( if_statement | for_loop | while_loop | do_while_loop | switch_statement );
    public final void control_structure() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:68:19: ( if_statement | for_loop | while_loop | do_while_loop | switch_statement )
            int alt13=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt13=1;
                }
                break;
            case FOR:
                {
                alt13=2;
                }
                break;
            case 84:
                {
                alt13=3;
                }
                break;
            case 58:
                {
                alt13=4;
                }
                break;
            case 79:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:68:21: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_control_structure403);
                    if_statement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:68:36: for_loop
                    {
                    pushFollow(FOLLOW_for_loop_in_control_structure407);
                    for_loop();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:68:47: while_loop
                    {
                    pushFollow(FOLLOW_while_loop_in_control_structure411);
                    while_loop();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:68:60: do_while_loop
                    {
                    pushFollow(FOLLOW_do_while_loop_in_control_structure415);
                    do_while_loop();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:68:76: switch_statement
                    {
                    pushFollow(FOLLOW_switch_statement_in_control_structure419);
                    switch_statement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "control_structure"



    // $ANTLR start "if_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:70:1: if_statement : IF '(' expression ')' body ( else_statement )? ;
    public final void if_statement() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:70:14: ( IF '(' expression ')' body ( else_statement )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:70:16: IF '(' expression ')' body ( else_statement )?
            {
            match(input,IF,FOLLOW_IF_in_if_statement428); 

            match(input,19,FOLLOW_19_in_if_statement430); 

            pushFollow(FOLLOW_expression_in_if_statement432);
            expression();

            state._fsp--;


            match(input,20,FOLLOW_20_in_if_statement434); 

            pushFollow(FOLLOW_body_in_if_statement436);
            body();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:70:43: ( else_statement )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:70:43: else_statement
                    {
                    pushFollow(FOLLOW_else_statement_in_if_statement438);
                    else_statement();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "if_statement"



    // $ANTLR start "else_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:72:1: else_statement : ELSE body ;
    public final void else_statement() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:72:16: ( ELSE body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:72:18: ELSE body
            {
            match(input,ELSE,FOLLOW_ELSE_in_else_statement448); 

            pushFollow(FOLLOW_body_in_else_statement450);
            body();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "else_statement"



    // $ANTLR start "for_loop"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:1: for_loop : FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ;
    public final void for_loop() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:10: ( FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:12: FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body
            {
            match(input,FOR,FOLLOW_FOR_in_for_loop459); 

            match(input,19,FOLLOW_19_in_for_loop461); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:20: ( 'const' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:20: 'const'
                    {
                    match(input,54,FOLLOW_54_in_for_loop463); 

                    }
                    break;

            }


            match(input,48,FOLLOW_48_in_for_loop466); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:36: ( '&' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:36: '&'
                    {
                    match(input,18,FOLLOW_18_in_for_loop468); 

                    }
                    break;

            }


            match(input,ID,FOLLOW_ID_in_for_loop471); 

            match(input,33,FOLLOW_33_in_for_loop473); 

            pushFollow(FOLLOW_expression_in_for_loop475);
            expression();

            state._fsp--;


            match(input,20,FOLLOW_20_in_for_loop477); 

            pushFollow(FOLLOW_body_in_for_loop479);
            body();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "for_loop"



    // $ANTLR start "while_loop"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:76:1: while_loop : 'while' '(' ( expression | file_input ) ')' body ;
    public final void while_loop() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:76:12: ( 'while' '(' ( expression | file_input ) ')' body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:76:14: 'while' '(' ( expression | file_input ) ')' body
            {
            match(input,84,FOLLOW_84_in_while_loop488); 

            match(input,19,FOLLOW_19_in_while_loop490); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:76:26: ( expression | file_input )
            int alt17=2;
            switch ( input.LA(1) ) {
            case BOOLEAN:
            case DIGIT:
            case 13:
            case 15:
            case 19:
            case 23:
            case 27:
            case 68:
                {
                alt17=1;
                }
                break;
            case ID:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==14||LA17_2==17||(LA17_2 >= 20 && LA17_2 <= 23)||(LA17_2 >= 26 && LA17_2 <= 27)||(LA17_2 >= 29 && LA17_2 <= 30)||LA17_2==32||LA17_2==36||LA17_2==38||(LA17_2 >= 40 && LA17_2 <= 42)||LA17_2==86) ) {
                    alt17=1;
                }
                else if ( (LA17_2==31||LA17_2==43) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;

                }
                }
                break;
            case 53:
            case 62:
                {
                alt17=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:76:27: expression
                    {
                    pushFollow(FOLLOW_expression_in_while_loop493);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:76:40: file_input
                    {
                    pushFollow(FOLLOW_file_input_in_while_loop497);
                    file_input();

                    state._fsp--;


                    }
                    break;

            }


            match(input,20,FOLLOW_20_in_while_loop500); 

            pushFollow(FOLLOW_body_in_while_loop502);
            body();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "while_loop"



    // $ANTLR start "do_while_loop"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:78:1: do_while_loop : 'do' body 'while' '(' expression ')' ';' ;
    public final void do_while_loop() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:78:15: ( 'do' body 'while' '(' expression ')' ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:78:17: 'do' body 'while' '(' expression ')' ';'
            {
            match(input,58,FOLLOW_58_in_do_while_loop511); 

            pushFollow(FOLLOW_body_in_do_while_loop513);
            body();

            state._fsp--;


            match(input,84,FOLLOW_84_in_do_while_loop515); 

            match(input,19,FOLLOW_19_in_do_while_loop517); 

            pushFollow(FOLLOW_expression_in_do_while_loop519);
            expression();

            state._fsp--;


            match(input,20,FOLLOW_20_in_do_while_loop521); 

            match(input,35,FOLLOW_35_in_do_while_loop523); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "do_while_loop"



    // $ANTLR start "switch_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:80:1: switch_statement : 'switch' '(' expression ')' '{' ( switch_cases )+ ( default_case )? '}' ;
    public final void switch_statement() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:80:18: ( 'switch' '(' expression ')' '{' ( switch_cases )+ ( default_case )? '}' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:80:20: 'switch' '(' expression ')' '{' ( switch_cases )+ ( default_case )? '}'
            {
            match(input,79,FOLLOW_79_in_switch_statement532); 

            match(input,19,FOLLOW_19_in_switch_statement534); 

            pushFollow(FOLLOW_expression_in_switch_statement536);
            expression();

            state._fsp--;


            match(input,20,FOLLOW_20_in_switch_statement538); 

            match(input,85,FOLLOW_85_in_switch_statement540); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:80:52: ( switch_cases )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==51) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:80:52: switch_cases
            	    {
            	    pushFollow(FOLLOW_switch_cases_in_switch_statement542);
            	    switch_cases();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:80:66: ( default_case )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==56) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:80:66: default_case
                    {
                    pushFollow(FOLLOW_default_case_in_switch_statement545);
                    default_case();

                    state._fsp--;


                    }
                    break;

            }


            match(input,87,FOLLOW_87_in_switch_statement548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "switch_statement"



    // $ANTLR start "switch_cases"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:82:1: switch_cases : 'case' expression ':' statements ( break_statement )? ;
    public final void switch_cases() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:82:14: ( 'case' expression ':' statements ( break_statement )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:82:16: 'case' expression ':' statements ( break_statement )?
            {
            match(input,51,FOLLOW_51_in_switch_cases557); 

            pushFollow(FOLLOW_expression_in_switch_cases559);
            expression();

            state._fsp--;


            match(input,33,FOLLOW_33_in_switch_cases561); 

            pushFollow(FOLLOW_statements_in_switch_cases563);
            statements();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:82:49: ( break_statement )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==50) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:82:49: break_statement
                    {
                    pushFollow(FOLLOW_break_statement_in_switch_cases565);
                    break_statement();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "switch_cases"



    // $ANTLR start "default_case"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:84:1: default_case : 'default' ':' statements ;
    public final void default_case() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:84:14: ( 'default' ':' statements )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:84:16: 'default' ':' statements
            {
            match(input,56,FOLLOW_56_in_default_case575); 

            match(input,33,FOLLOW_33_in_default_case577); 

            pushFollow(FOLLOW_statements_in_default_case579);
            statements();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "default_case"



    // $ANTLR start "break_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:86:1: break_statement : 'break' ';' ;
    public final void break_statement() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:86:17: ( 'break' ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:86:19: 'break' ';'
            {
            match(input,50,FOLLOW_50_in_break_statement588); 

            match(input,35,FOLLOW_35_in_break_statement590); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "break_statement"



    // $ANTLR start "type"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:93:1: type : ( base_type | vector_type | ID ) ( '*' )? ;
    public final void type() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:93:6: ( ( base_type | vector_type | ID ) ( '*' )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:93:8: ( base_type | vector_type | ID ) ( '*' )?
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:93:8: ( base_type | vector_type | ID )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 49:
            case 52:
            case 59:
            case 61:
            case 64:
            case 66:
            case 76:
            case 78:
                {
                alt21=1;
                }
                break;
            case 81:
                {
                alt21=2;
                }
                break;
            case ID:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:93:9: base_type
                    {
                    pushFollow(FOLLOW_base_type_in_type605);
                    base_type();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:93:21: vector_type
                    {
                    pushFollow(FOLLOW_vector_type_in_type609);
                    vector_type();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:93:35: ID
                    {
                    match(input,ID,FOLLOW_ID_in_type613); 

                    }
                    break;

            }


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:93:39: ( '*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:93:40: '*'
                    {
                    match(input,21,FOLLOW_21_in_type617); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "type"



    // $ANTLR start "return_type"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:95:1: return_type : ( base_type | 'void' );
    public final void return_type() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:95:13: ( base_type | 'void' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49||LA23_0==52||LA23_0==59||LA23_0==61||LA23_0==64||LA23_0==66||LA23_0==76||LA23_0==78) ) {
                alt23=1;
            }
            else if ( (LA23_0==83) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:95:15: base_type
                    {
                    pushFollow(FOLLOW_base_type_in_return_type628);
                    base_type();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:95:27: 'void'
                    {
                    match(input,83,FOLLOW_83_in_return_type632); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "return_type"



    // $ANTLR start "base_type"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:97:1: base_type : ( 'int' | 'double' | 'string' | 'bool' | 'char' | 'long' | 'short' | 'float' );
    public final void base_type() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:97:11: ( 'int' | 'double' | 'string' | 'bool' | 'char' | 'long' | 'short' | 'float' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            {
            if ( input.LA(1)==49||input.LA(1)==52||input.LA(1)==59||input.LA(1)==61||input.LA(1)==64||input.LA(1)==66||input.LA(1)==76||input.LA(1)==78 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "base_type"



    // $ANTLR start "vector_type"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:99:1: vector_type : 'vector' '<' type '>' ;
    public final void vector_type() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:99:13: ( 'vector' '<' type '>' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:99:15: 'vector' '<' type '>'
            {
            match(input,81,FOLLOW_81_in_vector_type678); 

            match(input,36,FOLLOW_36_in_vector_type680); 

            pushFollow(FOLLOW_type_in_vector_type682);
            type();

            state._fsp--;


            match(input,41,FOLLOW_41_in_vector_type684); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vector_type"



    // $ANTLR start "declaration"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:106:1: declaration : ( variable_declaration | file_declaration ) ';' ;
    public final void declaration() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:106:12: ( ( variable_declaration | file_declaration ) ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:106:14: ( variable_declaration | file_declaration ) ';'
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:106:14: ( variable_declaration | file_declaration )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID||LA24_0==49||LA24_0==52||LA24_0==59||LA24_0==61||LA24_0==64||LA24_0==66||LA24_0==76||LA24_0==78||LA24_0==81) ) {
                alt24=1;
            }
            else if ( (LA24_0==63||LA24_0==69) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:106:16: variable_declaration
                    {
                    pushFollow(FOLLOW_variable_declaration_in_declaration698);
                    variable_declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:106:40: file_declaration
                    {
                    pushFollow(FOLLOW_file_declaration_in_declaration703);
                    file_declaration();

                    state._fsp--;


                    }
                    break;

            }


            match(input,35,FOLLOW_35_in_declaration707); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "variable_declaration"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:108:1: variable_declaration : type variables ;
    public final void variable_declaration() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:108:22: ( type variables )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:108:24: type variables
            {
            pushFollow(FOLLOW_type_in_variable_declaration715);
            type();

            state._fsp--;


            pushFollow(FOLLOW_variables_in_variable_declaration717);
            variables();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "variable_declaration"



    // $ANTLR start "variables"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:110:1: variables : declarator ( ',' declarator )* ;
    public final void variables() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:110:11: ( declarator ( ',' declarator )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:110:13: declarator ( ',' declarator )*
            {
            pushFollow(FOLLOW_declarator_in_variables726);
            declarator();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:110:24: ( ',' declarator )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:110:26: ',' declarator
            	    {
            	    match(input,25,FOLLOW_25_in_variables730); 

            	    pushFollow(FOLLOW_declarator_in_variables732);
            	    declarator();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "variables"



    // $ANTLR start "declarator"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:1: declarator : ID ( '::' ID )? ( ( '=' expression ) | ( '(' ( arguments )? ')' ) )? ;
    public final void declarator() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:12: ( ID ( '::' ID )? ( ( '=' expression ) | ( '(' ( arguments )? ')' ) )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:14: ID ( '::' ID )? ( ( '=' expression ) | ( '(' ( arguments )? ')' ) )?
            {
            match(input,ID,FOLLOW_ID_in_declarator743); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:17: ( '::' ID )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:19: '::' ID
                    {
                    match(input,34,FOLLOW_34_in_declarator747); 

                    match(input,ID,FOLLOW_ID_in_declarator749); 

                    }
                    break;

            }


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:30: ( ( '=' expression ) | ( '(' ( arguments )? ')' ) )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            else if ( (LA28_0==19) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:32: ( '=' expression )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:32: ( '=' expression )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:34: '=' expression
                    {
                    match(input,39,FOLLOW_39_in_declarator758); 

                    pushFollow(FOLLOW_expression_in_declarator760);
                    expression();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:53: ( '(' ( arguments )? ')' )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:53: ( '(' ( arguments )? ')' )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:55: '(' ( arguments )? ')'
                    {
                    match(input,19,FOLLOW_19_in_declarator768); 

                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:59: ( arguments )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==BOOLEAN||LA27_0==DIGIT||LA27_0==ID||LA27_0==13||LA27_0==15||LA27_0==19||LA27_0==23||LA27_0==27||LA27_0==68) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:112:59: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_declarator770);
                            arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_declarator773); 

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declarator"



    // $ANTLR start "file_declaration"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:114:1: file_declaration : ( 'ofstream' | 'ifstream' ) ID '(' string_literal ')' ;
    public final void file_declaration() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:114:18: ( ( 'ofstream' | 'ifstream' ) ID '(' string_literal ')' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:114:20: ( 'ofstream' | 'ifstream' ) ID '(' string_literal ')'
            {
            if ( input.LA(1)==63||input.LA(1)==69 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,ID,FOLLOW_ID_in_file_declaration794); 

            match(input,19,FOLLOW_19_in_file_declaration796); 

            pushFollow(FOLLOW_string_literal_in_file_declaration798);
            string_literal();

            state._fsp--;


            match(input,20,FOLLOW_20_in_file_declaration800); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "file_declaration"



    // $ANTLR start "arguments"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:116:1: arguments : expression ( ',' expression )* ;
    public final void arguments() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:116:11: ( expression ( ',' expression )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:116:13: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_arguments809);
            expression();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:116:24: ( ',' expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==25) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:116:25: ',' expression
            	    {
            	    match(input,25,FOLLOW_25_in_arguments812); 

            	    pushFollow(FOLLOW_expression_in_arguments814);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "arguments"



    // $ANTLR start "class_definition"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:123:1: class_definition : CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ;
    public final void class_definition() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:123:18: ( CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:123:20: CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';'
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_definition830); 

            match(input,ID,FOLLOW_ID_in_class_definition832); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:123:29: ( ':' class_visibility ID )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:123:30: ':' class_visibility ID
                    {
                    match(input,33,FOLLOW_33_in_class_definition835); 

                    pushFollow(FOLLOW_class_visibility_in_class_definition837);
                    class_visibility();

                    state._fsp--;


                    match(input,ID,FOLLOW_ID_in_class_definition839); 

                    }
                    break;

            }


            match(input,85,FOLLOW_85_in_class_definition843); 

            pushFollow(FOLLOW_class_members_in_class_definition845);
            class_members();

            state._fsp--;


            match(input,87,FOLLOW_87_in_class_definition847); 

            match(input,35,FOLLOW_35_in_class_definition849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "class_definition"



    // $ANTLR start "class_members"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:125:1: class_members : ( class_member )* ;
    public final void class_members() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:125:15: ( ( class_member )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:125:17: ( class_member )*
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:125:17: ( class_member )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ID||LA31_0==49||LA31_0==52||LA31_0==59||LA31_0==61||(LA31_0 >= 63 && LA31_0 <= 64)||LA31_0==66||(LA31_0 >= 69 && LA31_0 <= 72)||(LA31_0 >= 76 && LA31_0 <= 78)||(LA31_0 >= 81 && LA31_0 <= 83)||LA31_0==88) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:125:18: class_member
            	    {
            	    pushFollow(FOLLOW_class_member_in_class_members858);
            	    class_member();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "class_members"



    // $ANTLR start "class_member"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:127:1: class_member : ( class_visibility ':' )? ( class_declaration | constructor | class_function_definition | destructor ) ;
    public final void class_member() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:127:14: ( ( class_visibility ':' )? ( class_declaration | constructor | class_function_definition | destructor ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:127:16: ( class_visibility ':' )? ( class_declaration | constructor | class_function_definition | destructor )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:127:16: ( class_visibility ':' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= 70 && LA32_0 <= 72)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:127:17: class_visibility ':'
                    {
                    pushFollow(FOLLOW_class_visibility_in_class_member870);
                    class_visibility();

                    state._fsp--;


                    match(input,33,FOLLOW_33_in_class_member872); 

                    }
                    break;

            }


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:127:40: ( class_declaration | constructor | class_function_definition | destructor )
            int alt33=4;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:127:42: class_declaration
                    {
                    pushFollow(FOLLOW_class_declaration_in_class_member878);
                    class_declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:127:62: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_class_member882);
                    constructor();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:127:76: class_function_definition
                    {
                    pushFollow(FOLLOW_class_function_definition_in_class_member886);
                    class_function_definition();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:127:104: destructor
                    {
                    pushFollow(FOLLOW_destructor_in_class_member890);
                    destructor();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "class_member"



    // $ANTLR start "class_declaration"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:129:1: class_declaration : ( 'static' )? declaration ;
    public final void class_declaration() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:129:19: ( ( 'static' )? declaration )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:129:21: ( 'static' )? declaration
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:129:21: ( 'static' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==77) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:129:21: 'static'
                    {
                    match(input,77,FOLLOW_77_in_class_declaration900); 

                    }
                    break;

            }


            pushFollow(FOLLOW_declaration_in_class_declaration903);
            declaration();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "class_declaration"



    // $ANTLR start "class_visibility"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:131:1: class_visibility : ( 'public' | 'private' | 'protected' ) ;
    public final void class_visibility() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:131:18: ( ( 'public' | 'private' | 'protected' ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            {
            if ( (input.LA(1) >= 70 && input.LA(1) <= 72) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "class_visibility"



    // $ANTLR start "constructor"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:1: constructor : ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' ( function_call ( ',' function_call )* ) )? class_function_body ;
    public final void constructor() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:13: ( ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' ( function_call ( ',' function_call )* ) )? class_function_body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:15: ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' ( function_call ( ',' function_call )* ) )? class_function_body
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:15: ( 'virtual' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==82) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:15: 'virtual'
                    {
                    match(input,82,FOLLOW_82_in_constructor930); 

                    }
                    break;

            }


            match(input,ID,FOLLOW_ID_in_constructor933); 

            match(input,19,FOLLOW_19_in_constructor935); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:33: ( parameters )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID||LA36_0==49||LA36_0==52||LA36_0==59||LA36_0==61||LA36_0==64||LA36_0==66||LA36_0==76||LA36_0==78||LA36_0==81) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:33: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_constructor937);
                    parameters();

                    state._fsp--;


                    }
                    break;

            }


            match(input,20,FOLLOW_20_in_constructor940); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:49: ( ':' ( function_call ( ',' function_call )* ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:51: ':' ( function_call ( ',' function_call )* )
                    {
                    match(input,33,FOLLOW_33_in_constructor944); 

                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:55: ( function_call ( ',' function_call )* )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:57: function_call ( ',' function_call )*
                    {
                    pushFollow(FOLLOW_function_call_in_constructor948);
                    function_call();

                    state._fsp--;


                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:71: ( ',' function_call )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==25) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:73: ',' function_call
                    	    {
                    	    match(input,25,FOLLOW_25_in_constructor952); 

                    	    pushFollow(FOLLOW_function_call_in_constructor954);
                    	    function_call();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_constructor964);
            class_function_body();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "constructor"



    // $ANTLR start "destructor"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:1: destructor : ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' ( function_call ( ',' function_call )* ) )? class_function_body ;
    public final void destructor() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:12: ( ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' ( function_call ( ',' function_call )* ) )? class_function_body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:14: ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' ( function_call ( ',' function_call )* ) )? class_function_body
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:14: ( 'virtual' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==82) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:14: 'virtual'
                    {
                    match(input,82,FOLLOW_82_in_destructor973); 

                    }
                    break;

            }


            match(input,88,FOLLOW_88_in_destructor976); 

            match(input,ID,FOLLOW_ID_in_destructor978); 

            match(input,19,FOLLOW_19_in_destructor980); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:36: ( parameters )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ID||LA40_0==49||LA40_0==52||LA40_0==59||LA40_0==61||LA40_0==64||LA40_0==66||LA40_0==76||LA40_0==78||LA40_0==81) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:36: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_destructor982);
                    parameters();

                    state._fsp--;


                    }
                    break;

            }


            match(input,20,FOLLOW_20_in_destructor985); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:52: ( ':' ( function_call ( ',' function_call )* ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:54: ':' ( function_call ( ',' function_call )* )
                    {
                    match(input,33,FOLLOW_33_in_destructor989); 

                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:58: ( function_call ( ',' function_call )* )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:60: function_call ( ',' function_call )*
                    {
                    pushFollow(FOLLOW_function_call_in_destructor993);
                    function_call();

                    state._fsp--;


                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:74: ( ',' function_call )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==25) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:135:76: ',' function_call
                    	    {
                    	    match(input,25,FOLLOW_25_in_destructor997); 

                    	    pushFollow(FOLLOW_function_call_in_destructor999);
                    	    function_call();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_destructor1010);
            class_function_body();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "destructor"



    // $ANTLR start "class_function_definition"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:137:1: class_function_definition : ( 'virtual' )? return_type function_name '(' ( parameters )? ')' ( 'const' )? class_function_body ;
    public final void class_function_definition() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:137:27: ( ( 'virtual' )? return_type function_name '(' ( parameters )? ')' ( 'const' )? class_function_body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:137:29: ( 'virtual' )? return_type function_name '(' ( parameters )? ')' ( 'const' )? class_function_body
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:137:29: ( 'virtual' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==82) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:137:29: 'virtual'
                    {
                    match(input,82,FOLLOW_82_in_class_function_definition1018); 

                    }
                    break;

            }


            pushFollow(FOLLOW_return_type_in_class_function_definition1021);
            return_type();

            state._fsp--;


            pushFollow(FOLLOW_function_name_in_class_function_definition1023);
            function_name();

            state._fsp--;


            match(input,19,FOLLOW_19_in_class_function_definition1025); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:137:70: ( parameters )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ID||LA44_0==49||LA44_0==52||LA44_0==59||LA44_0==61||LA44_0==64||LA44_0==66||LA44_0==76||LA44_0==78||LA44_0==81) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:137:70: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_class_function_definition1027);
                    parameters();

                    state._fsp--;


                    }
                    break;

            }


            match(input,20,FOLLOW_20_in_class_function_definition1030); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:137:86: ( 'const' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:137:86: 'const'
                    {
                    match(input,54,FOLLOW_54_in_class_function_definition1032); 

                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_class_function_definition1036);
            class_function_body();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "class_function_definition"



    // $ANTLR start "class_function_body"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:139:1: class_function_body : '{' statements '}' ;
    public final void class_function_body() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:139:20: ( '{' statements '}' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:139:22: '{' statements '}'
            {
            match(input,85,FOLLOW_85_in_class_function_body1044); 

            pushFollow(FOLLOW_statements_in_class_function_body1046);
            statements();

            state._fsp--;


            match(input,87,FOLLOW_87_in_class_function_body1048); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "class_function_body"



    // $ANTLR start "expression"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:146:1: expression : boolean_expression ;
    public final void expression() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:146:11: ( boolean_expression )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:146:14: boolean_expression
            {
            pushFollow(FOLLOW_boolean_expression_in_expression1061);
            boolean_expression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "boolean_expression"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:148:1: boolean_expression : and_exp ( '||' and_exp )* ;
    public final void boolean_expression() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:148:20: ( and_exp ( '||' and_exp )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:148:22: and_exp ( '||' and_exp )*
            {
            pushFollow(FOLLOW_and_exp_in_boolean_expression1069);
            and_exp();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:148:30: ( '||' and_exp )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==86) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:148:31: '||' and_exp
            	    {
            	    match(input,86,FOLLOW_86_in_boolean_expression1072); 

            	    pushFollow(FOLLOW_and_exp_in_boolean_expression1074);
            	    and_exp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "boolean_expression"



    // $ANTLR start "and_exp"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:150:1: and_exp : equality_exp ( '&&' equality_exp )* ;
    public final void and_exp() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:150:9: ( equality_exp ( '&&' equality_exp )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:150:11: equality_exp ( '&&' equality_exp )*
            {
            pushFollow(FOLLOW_equality_exp_in_and_exp1085);
            equality_exp();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:150:24: ( '&&' equality_exp )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==17) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:150:25: '&&' equality_exp
            	    {
            	    match(input,17,FOLLOW_17_in_and_exp1088); 

            	    pushFollow(FOLLOW_equality_exp_in_and_exp1090);
            	    equality_exp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "and_exp"



    // $ANTLR start "equality_exp"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:152:1: equality_exp : relational_exp ( ( '==' | '!=' ) relational_exp )* ;
    public final void equality_exp() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:152:14: ( relational_exp ( ( '==' | '!=' ) relational_exp )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:152:16: relational_exp ( ( '==' | '!=' ) relational_exp )*
            {
            pushFollow(FOLLOW_relational_exp_in_equality_exp1101);
            relational_exp();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:152:31: ( ( '==' | '!=' ) relational_exp )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==14||LA48_0==40) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:152:32: ( '==' | '!=' ) relational_exp
            	    {
            	    if ( input.LA(1)==14||input.LA(1)==40 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relational_exp_in_equality_exp1112);
            	    relational_exp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "equality_exp"



    // $ANTLR start "relational_exp"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:154:1: relational_exp : unary_exp ( ( '<' | '>' | '<=' | '>=' ) unary_exp )* ;
    public final void relational_exp() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:154:16: ( unary_exp ( ( '<' | '>' | '<=' | '>=' ) unary_exp )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:154:18: unary_exp ( ( '<' | '>' | '<=' | '>=' ) unary_exp )*
            {
            pushFollow(FOLLOW_unary_exp_in_relational_exp1123);
            unary_exp();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:154:28: ( ( '<' | '>' | '<=' | '>=' ) unary_exp )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==36||LA49_0==38||(LA49_0 >= 41 && LA49_0 <= 42)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:154:29: ( '<' | '>' | '<=' | '>=' ) unary_exp
            	    {
            	    if ( input.LA(1)==36||input.LA(1)==38||(input.LA(1) >= 41 && input.LA(1) <= 42) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_exp_in_relational_exp1142);
            	    unary_exp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relational_exp"



    // $ANTLR start "unary_exp"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:156:1: unary_exp : ( arithmetic_expression | '!' unary_exp );
    public final void unary_exp() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:156:11: ( arithmetic_expression | '!' unary_exp )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==BOOLEAN||LA50_0==DIGIT||LA50_0==ID||LA50_0==15||LA50_0==19||LA50_0==23||LA50_0==27||LA50_0==68) ) {
                alt50=1;
            }
            else if ( (LA50_0==13) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:156:13: arithmetic_expression
                    {
                    pushFollow(FOLLOW_arithmetic_expression_in_unary_exp1153);
                    arithmetic_expression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:156:37: '!' unary_exp
                    {
                    match(input,13,FOLLOW_13_in_unary_exp1157); 

                    pushFollow(FOLLOW_unary_exp_in_unary_exp1159);
                    unary_exp();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "unary_exp"



    // $ANTLR start "arithmetic_expression"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:158:1: arithmetic_expression : term ( ( '+' | '-' ) term )* ;
    public final void arithmetic_expression() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:158:23: ( term ( ( '+' | '-' ) term )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:158:25: term ( ( '+' | '-' ) term )*
            {
            pushFollow(FOLLOW_term_in_arithmetic_expression1168);
            term();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:158:30: ( ( '+' | '-' ) term )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==22||LA51_0==26) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:158:31: ( '+' | '-' ) term
            	    {
            	    if ( input.LA(1)==22||input.LA(1)==26 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_arithmetic_expression1179);
            	    term();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "arithmetic_expression"



    // $ANTLR start "term"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:160:1: term : factor ( ( '*' | '/' ) factor )* ;
    public final void term() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:160:6: ( factor ( ( '*' | '/' ) factor )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:160:8: factor ( ( '*' | '/' ) factor )*
            {
            pushFollow(FOLLOW_factor_in_term1193);
            factor();

            state._fsp--;


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:160:15: ( ( '*' | '/' ) factor )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==21||LA52_0==32) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:160:16: ( '*' | '/' ) factor
            	    {
            	    if ( input.LA(1)==21||input.LA(1)==32 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term1204);
            	    factor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "term"



    // $ANTLR start "factor"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:162:1: factor : ( '(' arithmetic_expression ')' | ID | change | true_false | integer_literal | string_literal | object_decleration | member_access );
    public final void factor() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:162:8: ( '(' arithmetic_expression ')' | ID | change | true_false | integer_literal | string_literal | object_decleration | member_access )
            int alt53=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt53=1;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 23:
                case 27:
                    {
                    alt53=3;
                    }
                    break;
                case 29:
                case 30:
                    {
                    alt53=8;
                    }
                    break;
                case 14:
                case 17:
                case 20:
                case 21:
                case 22:
                case 25:
                case 26:
                case 32:
                case 33:
                case 35:
                case 36:
                case 37:
                case 38:
                case 40:
                case 41:
                case 42:
                case 43:
                case 86:
                    {
                    alt53=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;

                }

                }
                break;
            case 23:
            case 27:
                {
                alt53=3;
                }
                break;
            case BOOLEAN:
                {
                alt53=4;
                }
                break;
            case DIGIT:
                {
                alt53=5;
                }
                break;
            case 15:
                {
                alt53=6;
                }
                break;
            case 68:
                {
                alt53=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:162:10: '(' arithmetic_expression ')'
                    {
                    match(input,19,FOLLOW_19_in_factor1215); 

                    pushFollow(FOLLOW_arithmetic_expression_in_factor1217);
                    arithmetic_expression();

                    state._fsp--;


                    match(input,20,FOLLOW_20_in_factor1219); 

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:162:42: ID
                    {
                    match(input,ID,FOLLOW_ID_in_factor1223); 

                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:162:47: change
                    {
                    pushFollow(FOLLOW_change_in_factor1227);
                    change();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:162:56: true_false
                    {
                    pushFollow(FOLLOW_true_false_in_factor1231);
                    true_false();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:162:69: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_factor1235);
                    integer_literal();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:162:87: string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_factor1239);
                    string_literal();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:162:104: object_decleration
                    {
                    pushFollow(FOLLOW_object_decleration_in_factor1243);
                    object_decleration();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:162:125: member_access
                    {
                    pushFollow(FOLLOW_member_access_in_factor1247);
                    member_access();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "true_false"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:164:1: true_false : BOOLEAN ;
    public final void true_false() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:164:12: ( BOOLEAN )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:164:14: BOOLEAN
            {
            match(input,BOOLEAN,FOLLOW_BOOLEAN_in_true_false1255); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "true_false"



    // $ANTLR start "member_access"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:166:1: member_access : ( function_access | pointer_access );
    public final void member_access() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:166:15: ( function_access | pointer_access )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==30) ) {
                    int LA54_2 = input.LA(3);

                    if ( (LA54_2==ID) ) {
                        alt54=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA54_1==29) ) {
                    alt54=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:166:18: function_access
                    {
                    pushFollow(FOLLOW_function_access_in_member_access1264);
                    function_access();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:166:36: pointer_access
                    {
                    pushFollow(FOLLOW_pointer_access_in_member_access1268);
                    pointer_access();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "member_access"



    // $ANTLR start "function_access"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:1: function_access : ID '.' ID ( '(' ( arguments )? ')' )? ;
    public final void function_access() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:17: ( ID '.' ID ( '(' ( arguments )? ')' )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:19: ID '.' ID ( '(' ( arguments )? ')' )?
            {
            match(input,ID,FOLLOW_ID_in_function_access1277); 

            match(input,30,FOLLOW_30_in_function_access1279); 

            match(input,ID,FOLLOW_ID_in_function_access1281); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:30: ( '(' ( arguments )? ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==19) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:32: '(' ( arguments )? ')'
                    {
                    match(input,19,FOLLOW_19_in_function_access1286); 

                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:36: ( arguments )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==BOOLEAN||LA55_0==DIGIT||LA55_0==ID||LA55_0==13||LA55_0==15||LA55_0==19||LA55_0==23||LA55_0==27||LA55_0==68) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:36: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_function_access1288);
                            arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_function_access1291); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "function_access"



    // $ANTLR start "pointer_access"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:170:1: pointer_access : ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )? ;
    public final void pointer_access() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:170:16: ( ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:170:18: ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )?
            {
            match(input,ID,FOLLOW_ID_in_pointer_access1303); 

            if ( (input.LA(1) >= 29 && input.LA(1) <= 30) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,ID,FOLLOW_ID_in_pointer_access1313); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:170:37: ( '(' ( arguments )? ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==19) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:170:38: '(' ( arguments )? ')'
                    {
                    match(input,19,FOLLOW_19_in_pointer_access1316); 

                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:170:42: ( arguments )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==BOOLEAN||LA57_0==DIGIT||LA57_0==ID||LA57_0==13||LA57_0==15||LA57_0==19||LA57_0==23||LA57_0==27||LA57_0==68) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:170:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_pointer_access1318);
                            arguments();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_pointer_access1321); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pointer_access"



    // $ANTLR start "function_call"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:172:1: function_call : ID '(' ( arguments )? ')' ;
    public final void function_call() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:172:15: ( ID '(' ( arguments )? ')' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:172:17: ID '(' ( arguments )? ')'
            {
            match(input,ID,FOLLOW_ID_in_function_call1332); 

            match(input,19,FOLLOW_19_in_function_call1334); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:172:24: ( arguments )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==BOOLEAN||LA59_0==DIGIT||LA59_0==ID||LA59_0==13||LA59_0==15||LA59_0==19||LA59_0==23||LA59_0==27||LA59_0==68) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:172:24: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_function_call1336);
                    arguments();

                    state._fsp--;


                    }
                    break;

            }


            match(input,20,FOLLOW_20_in_function_call1339); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "function_call"



    // $ANTLR start "object_decleration"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:174:1: object_decleration : 'new' function_call ;
    public final void object_decleration() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:174:20: ( 'new' function_call )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:174:22: 'new' function_call
            {
            match(input,68,FOLLOW_68_in_object_decleration1347); 

            pushFollow(FOLLOW_function_call_in_object_decleration1349);
            function_call();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "object_decleration"



    // $ANTLR start "change"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:176:1: change : ( ( '++' | '--' ) ID | ID ( '++' | '--' ) ) ;
    public final void change() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:176:8: ( ( ( '++' | '--' ) ID | ID ( '++' | '--' ) ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:176:10: ( ( '++' | '--' ) ID | ID ( '++' | '--' ) )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:176:10: ( ( '++' | '--' ) ID | ID ( '++' | '--' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==23||LA60_0==27) ) {
                alt60=1;
            }
            else if ( (LA60_0==ID) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:176:12: ( '++' | '--' ) ID
                    {
                    if ( input.LA(1)==23||input.LA(1)==27 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,ID,FOLLOW_ID_in_change1367); 

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:176:31: ID ( '++' | '--' )
                    {
                    match(input,ID,FOLLOW_ID_in_change1371); 

                    if ( input.LA(1)==23||input.LA(1)==27 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "change"



    // $ANTLR start "integer_literal"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:183:1: integer_literal : ( DIGIT )+ ;
    public final void integer_literal() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:183:17: ( ( DIGIT )+ )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:183:19: ( DIGIT )+
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:183:19: ( DIGIT )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==DIGIT) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:183:19: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_integer_literal1395); 

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "integer_literal"



    // $ANTLR start "float_literal"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:185:1: float_literal : ( DIGIT )+ '.' ( DIGIT )+ ;
    public final void float_literal() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:185:15: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:185:17: ( DIGIT )+ '.' ( DIGIT )+
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:185:17: ( DIGIT )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==DIGIT) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:185:17: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_float_literal1405); 

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);


            match(input,30,FOLLOW_30_in_float_literal1408); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:185:28: ( DIGIT )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==DIGIT) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:185:28: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_float_literal1410); 

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "float_literal"



    // $ANTLR start "string_literal"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:187:1: string_literal : '\"' (~ '\"' )* '\"' ;
    public final void string_literal() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:187:16: ( '\"' (~ '\"' )* '\"' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:187:18: '\"' (~ '\"' )* '\"'
            {
            match(input,15,FOLLOW_15_in_string_literal1420); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:187:22: (~ '\"' )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0 >= BOOLEAN && LA64_0 <= 14)||(LA64_0 >= 16 && LA64_0 <= 88)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            	    {
            	    if ( (input.LA(1) >= BOOLEAN && input.LA(1) <= 14)||(input.LA(1) >= 16 && input.LA(1) <= 88) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            match(input,15,FOLLOW_15_in_string_literal1428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "string_literal"



    // $ANTLR start "character_literal"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:189:1: character_literal : '\\'' (~ ( '\\'' | '\\\\' ) )* '\\'' ;
    public final void character_literal() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:189:19: ( '\\'' (~ ( '\\'' | '\\\\' ) )* '\\'' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:189:21: '\\'' (~ ( '\\'' | '\\\\' ) )* '\\''
            {
            match(input,44,FOLLOW_44_in_character_literal1437); 

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:189:26: (~ ( '\\'' | '\\\\' ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0 >= BOOLEAN && LA65_0 <= 43)||(LA65_0 >= 46 && LA65_0 <= 88)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            	    {
            	    if ( (input.LA(1) >= BOOLEAN && input.LA(1) <= 43)||(input.LA(1) >= 46 && input.LA(1) <= 88) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            match(input,44,FOLLOW_44_in_character_literal1451); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "character_literal"



    // $ANTLR start "output"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:196:1: output : ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';' ;
    public final void output() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:196:8: ( ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:196:11: ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';'
            {
            if ( input.LA(1)==ID||input.LA(1)==55 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:196:25: ( '<<' ( expression | 'endl' | manipulators ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==37) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:196:26: '<<' ( expression | 'endl' | manipulators )
            	    {
            	    match(input,37,FOLLOW_37_in_output1475); 

            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:196:31: ( expression | 'endl' | manipulators )
            	    int alt66=3;
            	    switch ( input.LA(1) ) {
            	    case BOOLEAN:
            	    case DIGIT:
            	    case ID:
            	    case 13:
            	    case 15:
            	    case 19:
            	    case 23:
            	    case 27:
            	    case 68:
            	        {
            	        alt66=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt66=2;
            	        }
            	        break;
            	    case 65:
            	    case 74:
            	    case 75:
            	    case 78:
            	        {
            	        alt66=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 66, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt66) {
            	        case 1 :
            	            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:196:32: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_output1478);
            	            expression();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:196:45: 'endl'
            	            {
            	            match(input,60,FOLLOW_60_in_output1482); 

            	            }
            	            break;
            	        case 3 :
            	            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:196:54: manipulators
            	            {
            	            pushFollow(FOLLOW_manipulators_in_output1486);
            	            manipulators();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            match(input,35,FOLLOW_35_in_output1491); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "output"



    // $ANTLR start "manipulators"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:1: manipulators : ( 'left' | 'right' | 'setw' '(' expression ')' | 'string' '(' expression ',' character_literal ')' );
    public final void manipulators() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:14: ( 'left' | 'right' | 'setw' '(' expression ')' | 'string' '(' expression ',' character_literal ')' )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt68=1;
                }
                break;
            case 74:
                {
                alt68=2;
                }
                break;
            case 75:
                {
                alt68=3;
                }
                break;
            case 78:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }

            switch (alt68) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:16: 'left'
                    {
                    match(input,65,FOLLOW_65_in_manipulators1500); 

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:25: 'right'
                    {
                    match(input,74,FOLLOW_74_in_manipulators1504); 

                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:35: 'setw' '(' expression ')'
                    {
                    match(input,75,FOLLOW_75_in_manipulators1508); 

                    match(input,19,FOLLOW_19_in_manipulators1510); 

                    pushFollow(FOLLOW_expression_in_manipulators1512);
                    expression();

                    state._fsp--;


                    match(input,20,FOLLOW_20_in_manipulators1514); 

                    }
                    break;
                case 4 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:63: 'string' '(' expression ',' character_literal ')'
                    {
                    match(input,78,FOLLOW_78_in_manipulators1518); 

                    match(input,19,FOLLOW_19_in_manipulators1520); 

                    pushFollow(FOLLOW_expression_in_manipulators1522);
                    expression();

                    state._fsp--;


                    match(input,25,FOLLOW_25_in_manipulators1524); 

                    pushFollow(FOLLOW_character_literal_in_manipulators1526);
                    character_literal();

                    state._fsp--;


                    match(input,20,FOLLOW_20_in_manipulators1528); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "manipulators"



    // $ANTLR start "input"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:205:1: input : ( stream ( '>>' expression )+ ';' | 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';' | stream '.ignore' '(' ')' ';' );
    public final void input() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:206:3: ( stream ( '>>' expression )+ ';' | 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';' | stream '.ignore' '(' ')' ';' )
            int alt71=3;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ID||LA71_0==53) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==43) ) {
                    alt71=1;
                }
                else if ( (LA71_1==31) ) {
                    alt71=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA71_0==62) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:206:3: stream ( '>>' expression )+ ';'
                    {
                    pushFollow(FOLLOW_stream_in_input1542);
                    stream();

                    state._fsp--;


                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:206:10: ( '>>' expression )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==43) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:206:11: '>>' expression
                    	    {
                    	    match(input,43,FOLLOW_43_in_input1545); 

                    	    pushFollow(FOLLOW_expression_in_input1547);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);


                    match(input,35,FOLLOW_35_in_input1551); 

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:207:3: 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';'
                    {
                    match(input,62,FOLLOW_62_in_input1555); 

                    match(input,19,FOLLOW_19_in_input1557); 

                    pushFollow(FOLLOW_stream_in_input1559);
                    stream();

                    state._fsp--;


                    match(input,25,FOLLOW_25_in_input1561); 

                    match(input,ID,FOLLOW_ID_in_input1563); 

                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:207:31: ( ',' character_literal )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==25) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:207:32: ',' character_literal
                            {
                            match(input,25,FOLLOW_25_in_input1566); 

                            pushFollow(FOLLOW_character_literal_in_input1568);
                            character_literal();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_input1572); 

                    match(input,35,FOLLOW_35_in_input1574); 

                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:208:5: stream '.ignore' '(' ')' ';'
                    {
                    pushFollow(FOLLOW_stream_in_input1580);
                    stream();

                    state._fsp--;


                    match(input,31,FOLLOW_31_in_input1582); 

                    match(input,19,FOLLOW_19_in_input1584); 

                    match(input,20,FOLLOW_20_in_input1586); 

                    match(input,35,FOLLOW_35_in_input1588); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "input"



    // $ANTLR start "file_input"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:211:1: file_input : ( ID ( '>>' expression )+ | 'getline' '(' stream ',' ID ')' | stream '.ignore' '(' ')' );
    public final void file_input() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:211:12: ( ID ( '>>' expression )+ | 'getline' '(' stream ',' ID ')' | stream '.ignore' '(' ')' )
            int alt73=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==43) ) {
                    alt73=1;
                }
                else if ( (LA73_1==31) ) {
                    alt73=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;

                }
                }
                break;
            case 62:
                {
                alt73=2;
                }
                break;
            case 53:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }

            switch (alt73) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:211:14: ID ( '>>' expression )+
                    {
                    match(input,ID,FOLLOW_ID_in_file_input1597); 

                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:211:17: ( '>>' expression )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==43) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:211:18: '>>' expression
                    	    {
                    	    match(input,43,FOLLOW_43_in_file_input1600); 

                    	    pushFollow(FOLLOW_expression_in_file_input1602);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:212:3: 'getline' '(' stream ',' ID ')'
                    {
                    match(input,62,FOLLOW_62_in_file_input1608); 

                    match(input,19,FOLLOW_19_in_file_input1610); 

                    pushFollow(FOLLOW_stream_in_file_input1612);
                    stream();

                    state._fsp--;


                    match(input,25,FOLLOW_25_in_file_input1614); 

                    match(input,ID,FOLLOW_ID_in_file_input1616); 

                    match(input,20,FOLLOW_20_in_file_input1618); 

                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:213:5: stream '.ignore' '(' ')'
                    {
                    pushFollow(FOLLOW_stream_in_file_input1624);
                    stream();

                    state._fsp--;


                    match(input,31,FOLLOW_31_in_file_input1626); 

                    match(input,19,FOLLOW_19_in_file_input1628); 

                    match(input,20,FOLLOW_20_in_file_input1630); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "file_input"



    // $ANTLR start "stream"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:215:1: stream : ( 'cin' | ID );
    public final void stream() throws RecognitionException {
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:215:8: ( 'cin' | ID )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            {
            if ( input.LA(1)==ID||input.LA(1)==53 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stream"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA1_eotS =
        "\20\uffff";
    static final String DFA1_eofS =
        "\1\1\17\uffff";
    static final String DFA1_minS =
        "\1\5\1\uffff\1\12\3\uffff\1\23\1\4\1\12\1\11\1\4\1\16\1\4\1\12\1"+
        "\4\1\16";
    static final String DFA1_maxS =
        "\1\123\1\uffff\1\25\3\uffff\1\47\1\121\1\126\1\125\1\104\1\126\1"+
        "\121\1\126\1\104\1\126";
    static final String DFA1_acceptS =
        "\1\uffff\1\4\1\uffff\1\1\1\2\1\3\12\uffff";
    static final String DFA1_specialS =
        "\20\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\4\uffff\1\5\46\uffff\1\2\2\uffff\1\2\6\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\5\1\2\1\uffff\1\2\2\uffff\1\5\6\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\1\5\1\uffff\1\3",
            "",
            "\1\6\12\uffff\1\5",
            "",
            "",
            "",
            "\1\7\5\uffff\1\5\10\uffff\2\5\3\uffff\1\5",
            "\1\5\2\uffff\1\5\2\uffff\1\10\2\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\1\5\1\11\2\uffff\1\5\3\uffff\1\5\25\uffff\1\3\2\uffff\1\3\6"+
            "\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\5\7"+
            "\uffff\1\3\1\uffff\1\3\2\uffff\1\3",
            "\1\3\3\uffff\1\5\2\uffff\1\5\2\uffff\1\5\1\12\2\5\1\uffff\3"+
            "\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\1\uffff\1\5\1\uffff\3"+
            "\5\53\uffff\1\5",
            "\3\3\15\uffff\1\5\11\uffff\1\5\15\uffff\1\3\2\uffff\2\3\1\uffff"+
            "\1\3\1\uffff\3\3\1\uffff\4\3\1\uffff\1\3\2\uffff\1\3\3\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\2\uffff\2\3",
            "\1\5\2\uffff\1\5\2\uffff\1\13\4\uffff\1\5\3\uffff\1\5\3\uffff"+
            "\1\5\3\uffff\1\5\50\uffff\1\5",
            "\1\5\2\uffff\1\5\2\uffff\1\11\3\5\1\uffff\1\14\2\5\1\uffff"+
            "\2\5\1\uffff\1\5\3\uffff\1\5\1\uffff\1\5\1\uffff\3\5\53\uffff"+
            "\1\5",
            "\1\5\2\uffff\1\5\2\uffff\1\15\2\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\1\5\3\uffff\1\5\3\uffff\1\5\25\uffff\1\3\2\uffff\1\3\6\uffff"+
            "\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\5\7\uffff"+
            "\1\3\1\uffff\1\3\2\uffff\1\3",
            "\1\3\3\uffff\1\5\2\uffff\1\5\2\uffff\1\5\1\16\2\5\1\uffff\3"+
            "\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\1\uffff\1\5\1\uffff\3"+
            "\5\53\uffff\1\5",
            "\1\5\2\uffff\1\5\2\uffff\1\17\4\uffff\1\5\3\uffff\1\5\3\uffff"+
            "\1\5\3\uffff\1\5\50\uffff\1\5",
            "\1\5\2\uffff\1\5\2\uffff\1\11\3\5\1\uffff\1\14\2\5\1\uffff"+
            "\2\5\1\uffff\1\5\3\uffff\1\5\1\uffff\1\5\1\uffff\3\5\53\uffff"+
            "\1\5"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()+ loopback of 9:30: ( function_definition | class_definition | declaration )+";
        }
    }
    static final String DFA33_eotS =
        "\22\uffff";
    static final String DFA33_eofS =
        "\22\uffff";
    static final String DFA33_minS =
        "\1\12\1\uffff\3\12\2\uffff\1\23\1\uffff\1\4\1\12\1\31\1\4\1\16\1"+
        "\4\1\12\1\4\1\16";
    static final String DFA33_maxS =
        "\1\130\1\uffff\2\25\1\130\2\uffff\1\47\1\uffff\1\121\1\126\1\125"+
        "\1\104\1\126\1\121\1\126\1\104\1\126";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\4\1\uffff\1\2\11\uffff";
    static final String DFA33_specialS =
        "\22\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\46\uffff\1\2\2\uffff\1\2\6\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\1\1\2\1\uffff\1\2\2\uffff\1\1\6\uffff\1\2\1\1\1\2\2\uffff"+
            "\1\1\1\4\1\5\4\uffff\1\6",
            "",
            "\1\7\12\uffff\1\1",
            "\1\1\10\uffff\1\10\1\uffff\1\1",
            "\1\10\46\uffff\1\5\2\uffff\1\5\6\uffff\1\5\1\uffff\1\5\2\uffff"+
            "\1\5\1\uffff\1\5\11\uffff\1\5\1\uffff\1\5\4\uffff\1\5\4\uffff"+
            "\1\6",
            "",
            "",
            "\1\11\5\uffff\1\1\10\uffff\2\1\3\uffff\1\1",
            "",
            "\1\1\2\uffff\1\1\2\uffff\1\12\2\uffff\1\1\1\uffff\1\1\3\uffff"+
            "\1\1\1\13\2\uffff\1\1\3\uffff\1\1\25\uffff\1\5\2\uffff\1\5\6"+
            "\uffff\1\5\1\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\1\7"+
            "\uffff\1\5\1\uffff\1\5\2\uffff\1\5",
            "\1\5\3\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\14\2\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\3"+
            "\1\53\uffff\1\1",
            "\1\1\11\uffff\1\1\22\uffff\1\5\36\uffff\1\5",
            "\1\1\2\uffff\1\1\2\uffff\1\15\4\uffff\1\1\3\uffff\1\1\3\uffff"+
            "\1\1\3\uffff\1\1\50\uffff\1\1",
            "\1\1\2\uffff\1\1\2\uffff\1\13\3\1\1\uffff\1\16\2\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\3\1\53\uffff"+
            "\1\1",
            "\1\1\2\uffff\1\1\2\uffff\1\17\2\uffff\1\1\1\uffff\1\1\3\uffff"+
            "\1\1\3\uffff\1\1\3\uffff\1\1\25\uffff\1\5\2\uffff\1\5\6\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\1\7\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\1\5",
            "\1\5\3\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\20\2\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\3"+
            "\1\53\uffff\1\1",
            "\1\1\2\uffff\1\1\2\uffff\1\21\4\uffff\1\1\3\uffff\1\1\3\uffff"+
            "\1\1\3\uffff\1\1\50\uffff\1\1",
            "\1\1\2\uffff\1\1\2\uffff\1\13\3\1\1\uffff\1\16\2\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\3\1\53\uffff"+
            "\1\1"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "127:40: ( class_declaration | constructor | class_function_definition | destructor )";
        }
    }
 

    public static final BitSet FOLLOW_top_level_in_start25 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compilation_unit_in_top_level34 = new BitSet(new long[]{0xA812000000000420L,0x00000000000A5025L});
    public static final BitSet FOLLOW_function_definition_in_top_level38 = new BitSet(new long[]{0xA812000000000422L,0x00000000000A5025L});
    public static final BitSet FOLLOW_class_definition_in_top_level42 = new BitSet(new long[]{0xA812000000000422L,0x00000000000A5025L});
    public static final BitSet FOLLOW_declaration_in_top_level46 = new BitSet(new long[]{0xA812000000000422L,0x00000000000A5025L});
    public static final BitSet FOLLOW_include_in_compilation_unit62 = new BitSet(new long[]{0x0000000000010002L,0x0000000000010000L});
    public static final BitSet FOLLOW_name_space_in_compilation_unit66 = new BitSet(new long[]{0x0000000000010002L,0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_include77 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_lib_in_include80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_header_in_include84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_lib94 = new BitSet(new long[]{0xFFFF3FFFFFFFFFF0L,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_41_in_lib112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_header121 = new BitSet(new long[]{0xFFFF3FFFFFFFFFF0L,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_15_in_header139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_name_space148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_name_space150 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_name_space152 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_name_space155 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_name_space157 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_name_space161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_type_in_function_definition175 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_function_name_in_function_definition177 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_function_definition179 = new BitSet(new long[]{0x2812000000100400L,0x0000000000025005L});
    public static final BitSet FOLLOW_parameters_in_function_definition181 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function_definition184 = new BitSet(new long[]{0xEEB2000000000E00L,0x000000000032D225L});
    public static final BitSet FOLLOW_body_in_function_definition186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_name195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters204 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parameters207 = new BitSet(new long[]{0x2812000000000400L,0x0000000000025005L});
    public static final BitSet FOLLOW_parameter_in_parameters209 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_type_in_parameter220 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_parameter222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_body236 = new BitSet(new long[]{0xEEB2000000000E00L,0x000000000092D225L});
    public static final BitSet FOLLOW_statements_in_body238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_body240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_body244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements254 = new BitSet(new long[]{0xEEB2000000000E02L,0x000000000012D225L});
    public static final BitSet FOLLOW_declaration_in_statement269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement277 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_statement279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_member_access_in_statement287 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_statement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_structure_in_statement297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_output_in_statement313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_input_in_statement321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_statement329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment346 = new BitSet(new long[]{0x0000008011000000L});
    public static final BitSet FOLLOW_set_in_assignment349 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_assignment362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_delete_statement371 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_delete_statement373 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_delete_statement375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_return_statement384 = new BitSet(new long[]{0x000000080888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_return_statement386 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_return_statement389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_control_structure403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_in_control_structure407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_in_control_structure411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_loop_in_control_structure415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switch_statement_in_control_structure419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement428 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_if_statement430 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_if_statement432 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_if_statement434 = new BitSet(new long[]{0xEEB2000000000E00L,0x000000000032D225L});
    public static final BitSet FOLLOW_body_in_if_statement436 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_else_statement_in_if_statement438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_statement448 = new BitSet(new long[]{0xEEB2000000000E00L,0x000000000032D225L});
    public static final BitSet FOLLOW_body_in_else_statement450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop459 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_for_loop461 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_54_in_for_loop463 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_for_loop466 = new BitSet(new long[]{0x0000000000040400L});
    public static final BitSet FOLLOW_18_in_for_loop468 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_for_loop471 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_for_loop473 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_for_loop475 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_for_loop477 = new BitSet(new long[]{0xEEB2000000000E00L,0x000000000032D225L});
    public static final BitSet FOLLOW_body_in_for_loop479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_while_loop488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_while_loop490 = new BitSet(new long[]{0x402000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_while_loop493 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_file_input_in_while_loop497 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_while_loop500 = new BitSet(new long[]{0xEEB2000000000E00L,0x000000000032D225L});
    public static final BitSet FOLLOW_body_in_while_loop502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_do_while_loop511 = new BitSet(new long[]{0xEEB2000000000E00L,0x000000000032D225L});
    public static final BitSet FOLLOW_body_in_do_while_loop513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_do_while_loop515 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_do_while_loop517 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_do_while_loop519 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_do_while_loop521 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_do_while_loop523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_switch_statement532 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_switch_statement534 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_switch_statement536 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_switch_statement538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_switch_statement540 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_switch_cases_in_switch_statement542 = new BitSet(new long[]{0x0108000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_default_case_in_switch_statement545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_switch_statement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_switch_cases557 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_switch_cases559 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_switch_cases561 = new BitSet(new long[]{0xEEB6000000000E00L,0x000000000012D225L});
    public static final BitSet FOLLOW_statements_in_switch_cases563 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_break_statement_in_switch_cases565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_default_case575 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_default_case577 = new BitSet(new long[]{0xEEB2000000000E00L,0x000000000012D225L});
    public static final BitSet FOLLOW_statements_in_default_case579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_break_statement588 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_break_statement590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_type_in_type605 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_vector_type_in_type609 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ID_in_type613 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_type617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_type_in_return_type628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_return_type632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_vector_type678 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_vector_type680 = new BitSet(new long[]{0x2812000000000400L,0x0000000000025005L});
    public static final BitSet FOLLOW_type_in_vector_type682 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_vector_type684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_declaration698 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_file_declaration_in_declaration703 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_declaration707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable_declaration715 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_variables_in_variable_declaration717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_variables726 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_variables730 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_declarator_in_variables732 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ID_in_declarator743 = new BitSet(new long[]{0x0000008400080002L});
    public static final BitSet FOLLOW_34_in_declarator747 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_declarator749 = new BitSet(new long[]{0x0000008000080002L});
    public static final BitSet FOLLOW_39_in_declarator758 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_declarator760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_declarator768 = new BitSet(new long[]{0x000000000898A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_arguments_in_declarator770 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_declarator773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_file_declaration786 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_file_declaration794 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_file_declaration796 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_string_literal_in_file_declaration798 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_file_declaration800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arguments809 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_arguments812 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_arguments814 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_CLASS_in_class_definition830 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_class_definition832 = new BitSet(new long[]{0x0000000200000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_33_in_class_definition835 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_class_visibility_in_class_definition837 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_class_definition839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_class_definition843 = new BitSet(new long[]{0xA812000000000400L,0x00000000018E71E5L});
    public static final BitSet FOLLOW_class_members_in_class_definition845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_class_definition847 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_class_definition849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_member_in_class_members858 = new BitSet(new long[]{0xA812000000000402L,0x00000000010E71E5L});
    public static final BitSet FOLLOW_class_visibility_in_class_member870 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_class_member872 = new BitSet(new long[]{0xA812000000000400L,0x00000000010E7025L});
    public static final BitSet FOLLOW_class_declaration_in_class_member878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_class_member882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_function_definition_in_class_member886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destructor_in_class_member890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_class_declaration900 = new BitSet(new long[]{0xA812000000000400L,0x0000000000025025L});
    public static final BitSet FOLLOW_declaration_in_class_declaration903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_constructor930 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_constructor933 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_constructor935 = new BitSet(new long[]{0x2812000000100400L,0x0000000000025005L});
    public static final BitSet FOLLOW_parameters_in_constructor937 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_constructor940 = new BitSet(new long[]{0x0000000200000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_33_in_constructor944 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_function_call_in_constructor948 = new BitSet(new long[]{0x0000000002000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_25_in_constructor952 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_function_call_in_constructor954 = new BitSet(new long[]{0x0000000002000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_class_function_body_in_constructor964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_destructor973 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_destructor976 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_destructor978 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_destructor980 = new BitSet(new long[]{0x2812000000100400L,0x0000000000025005L});
    public static final BitSet FOLLOW_parameters_in_destructor982 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_destructor985 = new BitSet(new long[]{0x0000000200000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_33_in_destructor989 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_function_call_in_destructor993 = new BitSet(new long[]{0x0000000002000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_25_in_destructor997 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_function_call_in_destructor999 = new BitSet(new long[]{0x0000000002000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_class_function_body_in_destructor1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_class_function_definition1018 = new BitSet(new long[]{0x2812000000000000L,0x0000000000085005L});
    public static final BitSet FOLLOW_return_type_in_class_function_definition1021 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_function_name_in_class_function_definition1023 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_class_function_definition1025 = new BitSet(new long[]{0x2812000000100400L,0x0000000000025005L});
    public static final BitSet FOLLOW_parameters_in_class_function_definition1027 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_class_function_definition1030 = new BitSet(new long[]{0x0040000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_54_in_class_function_definition1032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_class_function_body_in_class_function_definition1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_class_function_body1044 = new BitSet(new long[]{0xEEB2000000000E00L,0x000000000092D225L});
    public static final BitSet FOLLOW_statements_in_class_function_body1046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_class_function_body1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_expression1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_exp_in_boolean_expression1069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_boolean_expression1072 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_and_exp_in_boolean_expression1074 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equality_exp_in_and_exp1085 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_and_exp1088 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_equality_exp_in_and_exp1090 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_relational_exp_in_equality_exp1101 = new BitSet(new long[]{0x0000010000004002L});
    public static final BitSet FOLLOW_set_in_equality_exp1104 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_relational_exp_in_equality_exp1112 = new BitSet(new long[]{0x0000010000004002L});
    public static final BitSet FOLLOW_unary_exp_in_relational_exp1123 = new BitSet(new long[]{0x0000065000000002L});
    public static final BitSet FOLLOW_set_in_relational_exp1126 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_unary_exp_in_relational_exp1142 = new BitSet(new long[]{0x0000065000000002L});
    public static final BitSet FOLLOW_arithmetic_expression_in_unary_exp1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_unary_exp1157 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_unary_exp_in_unary_exp1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arithmetic_expression1168 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_set_in_arithmetic_expression1171 = new BitSet(new long[]{0x0000000008888490L,0x0000000000000010L});
    public static final BitSet FOLLOW_term_in_arithmetic_expression1179 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_factor_in_term1193 = new BitSet(new long[]{0x0000000100200002L});
    public static final BitSet FOLLOW_set_in_term1196 = new BitSet(new long[]{0x0000000008888490L,0x0000000000000010L});
    public static final BitSet FOLLOW_factor_in_term1204 = new BitSet(new long[]{0x0000000100200002L});
    public static final BitSet FOLLOW_19_in_factor1215 = new BitSet(new long[]{0x0000000008888490L,0x0000000000000010L});
    public static final BitSet FOLLOW_arithmetic_expression_in_factor1217 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_factor1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_change_in_factor1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_true_false_in_factor1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_factor1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_factor1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_decleration_in_factor1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_member_access_in_factor1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_true_false1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_access_in_member_access1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_access_in_member_access1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_access1277 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_function_access1279 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_function_access1281 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_function_access1286 = new BitSet(new long[]{0x000000000898A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_arguments_in_function_access1288 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function_access1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pointer_access1303 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_pointer_access1305 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_pointer_access1313 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_pointer_access1316 = new BitSet(new long[]{0x000000000898A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_arguments_in_pointer_access1318 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_pointer_access1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_call1332 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_function_call1334 = new BitSet(new long[]{0x000000000898A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_arguments_in_function_call1336 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function_call1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_object_decleration1347 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_function_call_in_object_decleration1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change1359 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_change1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_change1371 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_set_in_change1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_integer_literal1395 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DIGIT_in_float_literal1405 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_30_in_float_literal1408 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DIGIT_in_float_literal1410 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_15_in_string_literal1420 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_15_in_string_literal1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_character_literal1437 = new BitSet(new long[]{0xFFFFDFFFFFFFFFF0L,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_44_in_character_literal1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_output1466 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_37_in_output1475 = new BitSet(new long[]{0x100000000888A490L,0x0000000000004C12L});
    public static final BitSet FOLLOW_expression_in_output1478 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_60_in_output1482 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_manipulators_in_output1486 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_35_in_output1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_manipulators1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_manipulators1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_manipulators1508 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_manipulators1510 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_manipulators1512 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_manipulators1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_manipulators1518 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_manipulators1520 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_manipulators1522 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_manipulators1524 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_character_literal_in_manipulators1526 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_manipulators1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_input1542 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_input1545 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_input1547 = new BitSet(new long[]{0x0000080800000000L});
    public static final BitSet FOLLOW_35_in_input1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_input1555 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_input1557 = new BitSet(new long[]{0x0020000000000400L});
    public static final BitSet FOLLOW_stream_in_input1559 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_input1561 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_input1563 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_input1566 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_character_literal_in_input1568 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_input1572 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_input1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_input1580 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_input1582 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_input1584 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_input1586 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_input1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_file_input1597 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_file_input1600 = new BitSet(new long[]{0x000000000888A490L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_file_input1602 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_62_in_file_input1608 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_file_input1610 = new BitSet(new long[]{0x0020000000000400L});
    public static final BitSet FOLLOW_stream_in_file_input1612 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_file_input1614 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_file_input1616 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_file_input1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_file_input1624 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_file_input1626 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_file_input1628 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_file_input1630 = new BitSet(new long[]{0x0000000000000002L});

}