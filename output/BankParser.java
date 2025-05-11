// $ANTLR 3.4 E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g 2025-05-11 16:50:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class BankParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arithmetic_Expression", "Assign", "BOOLEAN", "Body", "Break", "CLASS", "COMMENT", "Call", "Class", "Class_Member", "Class_Members", "Compilition_Unit", "Constructor", "Control_Structure", "DIGIT", "Declaration", "Default_Case", "Delete", "Destructor", "Do_While", "ELSE", "Else", "FOR", "Factor", "For", "Function", "ID", "IF", "IFSTREAM", "If", "Include", "Manipulator", "Member_Access", "NameSpace", "Not", "Parameter", "Qualified", "Return", "Return_Type", "Start", "Statement", "Statements", "Switch", "Switch_Case", "Top_Level", "Top_Level_Component", "Type", "WS", "While", "While_EXP", "'!'", "'!='", "'\"'", "'#include'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'.'", "'.ignore'", "'/'", "':'", "'::'", "';'", "'<'", "'<<'", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'\\''", "'\\\\'", "'\\n'", "'\\r'", "'auto'", "'bool'", "'break'", "'case'", "'char'", "'cin'", "'const'", "'cout'", "'default'", "'delete'", "'do'", "'double'", "'endl'", "'float'", "'getline'", "'int'", "'left'", "'long'", "'namespace'", "'new'", "'private'", "'protected'", "'public'", "'return'", "'right'", "'setw'", "'short'", "'static'", "'string'", "'switch'", "'using'", "'vector'", "'virtual'", "'void'", "'while'", "'{'", "'||'", "'}'", "'~'"
    };

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
    public static final int T__126=126;
    public static final int T__127=127;
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

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return BankParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g"; }


        String s="";


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:56:1: start : ( top_level ) -> ^( Start top_level ) ;
    public final BankParser.start_return start() throws RecognitionException {
        BankParser.start_return retval = new BankParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.top_level_return top_level1 =null;


        RewriteRuleSubtreeStream stream_top_level=new RewriteRuleSubtreeStream(adaptor,"rule top_level");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:56:6: ( ( top_level ) -> ^( Start top_level ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:56:8: ( top_level )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:56:8: ( top_level )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:56:9: top_level
            {
            pushFollow(FOLLOW_top_level_in_start328);
            top_level1=top_level();

            state._fsp--;

            stream_top_level.add(top_level1.getTree());

            }


            // AST REWRITE
            // elements: top_level
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:20: -> ^( Start top_level )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:56:23: ^( Start top_level )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                adaptor.addChild(root_1, stream_top_level.nextTree());

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
    // $ANTLR end "start"


    public static class top_level_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "top_level"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:66:1: top_level : ( compilation_unit top_level_component ) -> ^( Top_Level compilation_unit top_level_component ) ;
    public final BankParser.top_level_return top_level() throws RecognitionException {
        BankParser.top_level_return retval = new BankParser.top_level_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.compilation_unit_return compilation_unit2 =null;

        BankParser.top_level_component_return top_level_component3 =null;


        RewriteRuleSubtreeStream stream_compilation_unit=new RewriteRuleSubtreeStream(adaptor,"rule compilation_unit");
        RewriteRuleSubtreeStream stream_top_level_component=new RewriteRuleSubtreeStream(adaptor,"rule top_level_component");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:66:11: ( ( compilation_unit top_level_component ) -> ^( Top_Level compilation_unit top_level_component ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:66:13: ( compilation_unit top_level_component )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:66:13: ( compilation_unit top_level_component )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:66:14: compilation_unit top_level_component
            {
            pushFollow(FOLLOW_compilation_unit_in_top_level382);
            compilation_unit2=compilation_unit();

            state._fsp--;

            stream_compilation_unit.add(compilation_unit2.getTree());

            pushFollow(FOLLOW_top_level_component_in_top_level384);
            top_level_component3=top_level_component();

            state._fsp--;

            stream_top_level_component.add(top_level_component3.getTree());

            }


            // AST REWRITE
            // elements: compilation_unit, top_level_component
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:52: -> ^( Top_Level compilation_unit top_level_component )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:66:55: ^( Top_Level compilation_unit top_level_component )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Top_Level, "Top_Level")
                , root_1);

                adaptor.addChild(root_1, stream_compilation_unit.nextTree());

                adaptor.addChild(root_1, stream_top_level_component.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "top_level"


    public static class top_level_component_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "top_level_component"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:73:1: top_level_component : ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )+ ;
    public final BankParser.top_level_component_return top_level_component() throws RecognitionException {
        BankParser.top_level_component_return retval = new BankParser.top_level_component_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.function_definition_return function_definition4 =null;

        BankParser.class_definition_return class_definition5 =null;

        BankParser.declaration_return declaration6 =null;


        RewriteRuleSubtreeStream stream_class_definition=new RewriteRuleSubtreeStream(adaptor,"rule class_definition");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:2: ( ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )+ )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:4: ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )+
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:4: ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:6: function_definition
            	    {
            	    pushFollow(FOLLOW_function_definition_in_top_level_component431);
            	    function_definition4=function_definition();

            	    state._fsp--;

            	    stream_function_definition.add(function_definition4.getTree());

            	    // AST REWRITE
            	    // elements: function_definition
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 74:26: -> ^( Top_Level_Component function_definition )
            	    {
            	        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:74:29: ^( Top_Level_Component function_definition )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(Top_Level_Component, "Top_Level_Component")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_function_definition.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;
            	case 2 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:75:4: class_definition
            	    {
            	    pushFollow(FOLLOW_class_definition_in_top_level_component445);
            	    class_definition5=class_definition();

            	    state._fsp--;

            	    stream_class_definition.add(class_definition5.getTree());

            	    // AST REWRITE
            	    // elements: class_definition
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 75:21: -> ^( Top_Level_Component class_definition )
            	    {
            	        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:75:24: ^( Top_Level_Component class_definition )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(Top_Level_Component, "Top_Level_Component")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_class_definition.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;
            	case 3 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:76:4: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_top_level_component459);
            	    declaration6=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration6.getTree());

            	    // AST REWRITE
            	    // elements: declaration
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 76:16: -> ^( Top_Level_Component declaration )
            	    {
            	        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:76:19: ^( Top_Level_Component declaration )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(Top_Level_Component, "Top_Level_Component")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_declaration.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

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
    // $ANTLR end "top_level_component"


    public static class compilation_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compilation_unit"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:87:1: compilation_unit : ( ( include ) -> ^( Compilition_Unit include ) | ( name_space ) -> ^( Compilition_Unit name_space ) )* ;
    public final BankParser.compilation_unit_return compilation_unit() throws RecognitionException {
        BankParser.compilation_unit_return retval = new BankParser.compilation_unit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.include_return include7 =null;

        BankParser.name_space_return name_space8 =null;


        RewriteRuleSubtreeStream stream_include=new RewriteRuleSubtreeStream(adaptor,"rule include");
        RewriteRuleSubtreeStream stream_name_space=new RewriteRuleSubtreeStream(adaptor,"rule name_space");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:88:2: ( ( ( include ) -> ^( Compilition_Unit include ) | ( name_space ) -> ^( Compilition_Unit name_space ) )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:88:4: ( ( include ) -> ^( Compilition_Unit include ) | ( name_space ) -> ^( Compilition_Unit name_space ) )*
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:88:4: ( ( include ) -> ^( Compilition_Unit include ) | ( name_space ) -> ^( Compilition_Unit name_space ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==57) ) {
                    alt2=1;
                }
                else if ( (LA2_0==119) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:88:6: ( include )
            	    {
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:88:6: ( include )
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:88:7: include
            	    {
            	    pushFollow(FOLLOW_include_in_compilation_unit512);
            	    include7=include();

            	    state._fsp--;

            	    stream_include.add(include7.getTree());

            	    }


            	    // AST REWRITE
            	    // elements: include
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 88:16: -> ^( Compilition_Unit include )
            	    {
            	        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:88:19: ^( Compilition_Unit include )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(Compilition_Unit, "Compilition_Unit")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_include.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;
            	case 2 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:89:4: ( name_space )
            	    {
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:89:4: ( name_space )
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:89:5: name_space
            	    {
            	    pushFollow(FOLLOW_name_space_in_compilation_unit528);
            	    name_space8=name_space();

            	    state._fsp--;

            	    stream_name_space.add(name_space8.getTree());

            	    }


            	    // AST REWRITE
            	    // elements: name_space
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 89:17: -> ^( Compilition_Unit name_space )
            	    {
            	        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:89:20: ^( Compilition_Unit name_space )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(Compilition_Unit, "Compilition_Unit")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_name_space.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

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
    // $ANTLR end "compilation_unit"


    public static class include_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:97:1: include : '#include' ( lib -> ^( Include lib ) | header -> ^( Include header ) ) ;
    public final BankParser.include_return include() throws RecognitionException {
        BankParser.include_return retval = new BankParser.include_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal9=null;
        BankParser.lib_return lib10 =null;

        BankParser.header_return header11 =null;


        Object string_literal9_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_lib=new RewriteRuleSubtreeStream(adaptor,"rule lib");
        RewriteRuleSubtreeStream stream_header=new RewriteRuleSubtreeStream(adaptor,"rule header");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:97:9: ( '#include' ( lib -> ^( Include lib ) | header -> ^( Include header ) ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:97:11: '#include' ( lib -> ^( Include lib ) | header -> ^( Include header ) )
            {
            string_literal9=(Token)match(input,57,FOLLOW_57_in_include574);  
            stream_57.add(string_literal9);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:97:22: ( lib -> ^( Include lib ) | header -> ^( Include header ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==77) ) {
                alt3=1;
            }
            else if ( (LA3_0==56) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:98:4: lib
                    {
                    pushFollow(FOLLOW_lib_in_include581);
                    lib10=lib();

                    state._fsp--;

                    stream_lib.add(lib10.getTree());

                    // AST REWRITE
                    // elements: lib
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:8: -> ^( Include lib )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:98:11: ^( Include lib )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Include, "Include")
                        , root_1);

                        adaptor.addChild(root_1, stream_lib.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:99:4: header
                    {
                    pushFollow(FOLLOW_header_in_include595);
                    header11=header();

                    state._fsp--;

                    stream_header.add(header11.getTree());

                    // AST REWRITE
                    // elements: header
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 99:11: -> ^( Include header )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:99:14: ^( Include header )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Include, "Include")
                        , root_1);

                        adaptor.addChild(root_1, stream_header.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


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
    // $ANTLR end "include"


    public static class lib_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lib"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:107:1: lib : '<' (~ ( '\\r' | '\\n' | '>' ) )* '>' ;
    public final BankParser.lib_return lib() throws RecognitionException {
        BankParser.lib_return retval = new BankParser.lib_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal12=null;
        Token set13=null;
        Token char_literal14=null;

        Object char_literal12_tree=null;
        Object set13_tree=null;
        Object char_literal14_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:107:5: ( '<' (~ ( '\\r' | '\\n' | '>' ) )* '>' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:107:7: '<' (~ ( '\\r' | '\\n' | '>' ) )* '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal12=(Token)match(input,77,FOLLOW_77_in_lib637); 
            char_literal12_tree = 
            (Object)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:107:11: (~ ( '\\r' | '\\n' | '>' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= Arithmetic_Expression && LA4_0 <= 81)||(LA4_0 >= 83 && LA4_0 <= 86)||(LA4_0 >= 89 && LA4_0 <= 127)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            	    {
            	    set13=(Token)input.LT(1);

            	    if ( (input.LA(1) >= Arithmetic_Expression && input.LA(1) <= 81)||(input.LA(1) >= 83 && input.LA(1) <= 86)||(input.LA(1) >= 89 && input.LA(1) <= 127) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set13)
            	        );
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


            char_literal14=(Token)match(input,82,FOLLOW_82_in_lib655); 
            char_literal14_tree = 
            (Object)adaptor.create(char_literal14)
            ;
            adaptor.addChild(root_0, char_literal14_tree);


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
    // $ANTLR end "lib"


    public static class header_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "header"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:114:1: header : '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' ;
    public final BankParser.header_return header() throws RecognitionException {
        BankParser.header_return retval = new BankParser.header_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal15=null;
        Token set16=null;
        Token char_literal17=null;

        Object char_literal15_tree=null;
        Object set16_tree=null;
        Object char_literal17_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:114:8: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:114:10: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
            {
            root_0 = (Object)adaptor.nil();


            char_literal15=(Token)match(input,56,FOLLOW_56_in_header687); 
            char_literal15_tree = 
            (Object)adaptor.create(char_literal15)
            ;
            adaptor.addChild(root_0, char_literal15_tree);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:114:14: (~ ( '\\r' | '\\n' | '\"' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= Arithmetic_Expression && LA5_0 <= 55)||(LA5_0 >= 57 && LA5_0 <= 86)||(LA5_0 >= 89 && LA5_0 <= 127)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            	    {
            	    set16=(Token)input.LT(1);

            	    if ( (input.LA(1) >= Arithmetic_Expression && input.LA(1) <= 55)||(input.LA(1) >= 57 && input.LA(1) <= 86)||(input.LA(1) >= 89 && input.LA(1) <= 127) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set16)
            	        );
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


            char_literal17=(Token)match(input,56,FOLLOW_56_in_header705); 
            char_literal17_tree = 
            (Object)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


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
    // $ANTLR end "header"


    public static class name_space_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name_space"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:1: name_space : 'using' 'namespace' ( ( ID ( '::' ID )* ) -> ^( NameSpace ID ( '::' ID )* ) ) ';' ;
    public final BankParser.name_space_return name_space() throws RecognitionException {
        BankParser.name_space_return retval = new BankParser.name_space_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal18=null;
        Token string_literal19=null;
        Token ID20=null;
        Token string_literal21=null;
        Token ID22=null;
        Token char_literal23=null;

        Object string_literal18_tree=null;
        Object string_literal19_tree=null;
        Object ID20_tree=null;
        Object string_literal21_tree=null;
        Object ID22_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:12: ( 'using' 'namespace' ( ( ID ( '::' ID )* ) -> ^( NameSpace ID ( '::' ID )* ) ) ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:14: 'using' 'namespace' ( ( ID ( '::' ID )* ) -> ^( NameSpace ID ( '::' ID )* ) ) ';'
            {
            string_literal18=(Token)match(input,119,FOLLOW_119_in_name_space737);  
            stream_119.add(string_literal18);


            string_literal19=(Token)match(input,107,FOLLOW_107_in_name_space739);  
            stream_107.add(string_literal19);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:34: ( ( ID ( '::' ID )* ) -> ^( NameSpace ID ( '::' ID )* ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:35: ( ID ( '::' ID )* )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:35: ( ID ( '::' ID )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:36: ID ( '::' ID )*
            {
            ID20=(Token)match(input,ID,FOLLOW_ID_in_name_space743);  
            stream_ID.add(ID20);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:39: ( '::' ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==75) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:40: '::' ID
            	    {
            	    string_literal21=(Token)match(input,75,FOLLOW_75_in_name_space746);  
            	    stream_75.add(string_literal21);


            	    ID22=(Token)match(input,ID,FOLLOW_ID_in_name_space748);  
            	    stream_ID.add(ID22);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: ID, 75, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 121:51: -> ^( NameSpace ID ( '::' ID )* )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:54: ^( NameSpace ID ( '::' ID )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NameSpace, "NameSpace")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:121:69: ( '::' ID )*
                while ( stream_ID.hasNext()||stream_75.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_75.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();
                stream_75.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }


            char_literal23=(Token)match(input,76,FOLLOW_76_in_name_space769);  
            stream_76.add(char_literal23);


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
    // $ANTLR end "name_space"


    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_definition"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:1: function_definition : ( return_type ID '(' ( parameters )? ')' body ) -> ^( Function return_type ID '(' ( parameters )? ')' body ) ;
    public final BankParser.function_definition_return function_definition() throws RecognitionException {
        BankParser.function_definition_return retval = new BankParser.function_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID25=null;
        Token char_literal26=null;
        Token char_literal28=null;
        BankParser.return_type_return return_type24 =null;

        BankParser.parameters_return parameters27 =null;

        BankParser.body_return body29 =null;


        Object ID25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:21: ( ( return_type ID '(' ( parameters )? ')' body ) -> ^( Function return_type ID '(' ( parameters )? ')' body ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:23: ( return_type ID '(' ( parameters )? ')' body )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:23: ( return_type ID '(' ( parameters )? ')' body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:24: return_type ID '(' ( parameters )? ')' body
            {
            pushFollow(FOLLOW_return_type_in_function_definition807);
            return_type24=return_type();

            state._fsp--;

            stream_return_type.add(return_type24.getTree());

            ID25=(Token)match(input,ID,FOLLOW_ID_in_function_definition809);  
            stream_ID.add(ID25);


            char_literal26=(Token)match(input,60,FOLLOW_60_in_function_definition811);  
            stream_60.add(char_literal26);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:43: ( parameters )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||LA7_0==90||LA7_0==93||LA7_0==100||LA7_0==102||LA7_0==104||LA7_0==106||LA7_0==115||LA7_0==117||LA7_0==120) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:43: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_function_definition813);
                    parameters27=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters27.getTree());

                    }
                    break;

            }


            char_literal28=(Token)match(input,61,FOLLOW_61_in_function_definition816);  
            stream_61.add(char_literal28);


            pushFollow(FOLLOW_body_in_function_definition818);
            body29=body();

            state._fsp--;

            stream_body.add(body29.getTree());

            }


            // AST REWRITE
            // elements: ID, parameters, 60, 61, return_type, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 133:65: -> ^( Function return_type ID '(' ( parameters )? ')' body )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:68: ^( Function return_type ID '(' ( parameters )? ')' body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Function, "Function")
                , root_1);

                adaptor.addChild(root_1, stream_return_type.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:133:98: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, stream_body.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "function_definition"


    public static class parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameters"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:140:1: parameters : parameter ( ( ',' ) ^ parameter )* ;
    public final BankParser.parameters_return parameters() throws RecognitionException {
        BankParser.parameters_return retval = new BankParser.parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal31=null;
        BankParser.parameter_return parameter30 =null;

        BankParser.parameter_return parameter32 =null;


        Object char_literal31_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:140:12: ( parameter ( ( ',' ) ^ parameter )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:140:14: parameter ( ( ',' ) ^ parameter )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_parameter_in_parameters870);
            parameter30=parameter();

            state._fsp--;

            adaptor.addChild(root_0, parameter30.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:140:24: ( ( ',' ) ^ parameter )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==66) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:140:25: ( ',' ) ^ parameter
            	    {
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:140:25: ( ',' )
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:140:26: ','
            	    {
            	    char_literal31=(Token)match(input,66,FOLLOW_66_in_parameters874); 
            	    char_literal31_tree = 
            	    (Object)adaptor.create(char_literal31)
            	    ;
            	    adaptor.addChild(root_0, char_literal31_tree);


            	    }


            	    pushFollow(FOLLOW_parameter_in_parameters878);
            	    parameter32=parameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, parameter32.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "parameters"


    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:147:1: parameter : ( type ID ) -> ^( Parameter type ID ) ;
    public final BankParser.parameter_return parameter() throws RecognitionException {
        BankParser.parameter_return retval = new BankParser.parameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID34=null;
        BankParser.type_return type33 =null;


        Object ID34_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:147:11: ( ( type ID ) -> ^( Parameter type ID ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:147:13: ( type ID )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:147:13: ( type ID )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:147:14: type ID
            {
            pushFollow(FOLLOW_type_in_parameter913);
            type33=type();

            state._fsp--;

            stream_type.add(type33.getTree());

            ID34=(Token)match(input,ID,FOLLOW_ID_in_parameter915);  
            stream_ID.add(ID34);


            }


            // AST REWRITE
            // elements: ID, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 147:23: -> ^( Parameter type ID )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:147:26: ^( Parameter type ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Parameter, "Parameter")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
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
        }
        return retval;
    }
    // $ANTLR end "parameter"


    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:159:1: body : ( ( '{' statements '}' ) -> ^( Body '{' statements '}' ) | statement -> ^( Body statement ) );
    public final BankParser.body_return body() throws RecognitionException {
        BankParser.body_return retval = new BankParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal35=null;
        Token char_literal37=null;
        BankParser.statements_return statements36 =null;

        BankParser.statement_return statement38 =null;


        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:160:2: ( ( '{' statements '}' ) -> ^( Body '{' statements '}' ) | statement -> ^( Body statement ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==124) ) {
                alt9=1;
            }
            else if ( (LA9_0==FOR||(LA9_0 >= ID && LA9_0 <= IFSTREAM)||LA9_0==90||(LA9_0 >= 93 && LA9_0 <= 94)||LA9_0==96||(LA9_0 >= 98 && LA9_0 <= 100)||(LA9_0 >= 102 && LA9_0 <= 104)||LA9_0==106||LA9_0==112||LA9_0==115||(LA9_0 >= 117 && LA9_0 <= 118)||LA9_0==120||LA9_0==123) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:160:4: ( '{' statements '}' )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:160:4: ( '{' statements '}' )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:160:5: '{' statements '}'
                    {
                    char_literal35=(Token)match(input,124,FOLLOW_124_in_body966);  
                    stream_124.add(char_literal35);


                    pushFollow(FOLLOW_statements_in_body968);
                    statements36=statements();

                    state._fsp--;

                    stream_statements.add(statements36.getTree());

                    char_literal37=(Token)match(input,126,FOLLOW_126_in_body970);  
                    stream_126.add(char_literal37);


                    }


                    // AST REWRITE
                    // elements: 126, 124, statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:25: -> ^( Body '{' statements '}' )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:160:28: ^( Body '{' statements '}' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Body, "Body")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_124.nextNode()
                        );

                        adaptor.addChild(root_1, stream_statements.nextTree());

                        adaptor.addChild(root_1, 
                        stream_126.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:161:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_body989);
                    statement38=statement();

                    state._fsp--;

                    stream_statement.add(statement38.getTree());

                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:14: -> ^( Body statement )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:161:17: ^( Body statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Body, "Body")
                        , root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());

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
    // $ANTLR end "body"


    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statements"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:1: statements : ( ( statement )* ) -> ^( Statements ( statement )* ) ;
    public final BankParser.statements_return statements() throws RecognitionException {
        BankParser.statements_return retval = new BankParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.statement_return statement39 =null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:12: ( ( ( statement )* ) -> ^( Statements ( statement )* ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:14: ( ( statement )* )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:14: ( ( statement )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:15: ( statement )*
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:15: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==FOR||(LA10_0 >= ID && LA10_0 <= IFSTREAM)||LA10_0==90||(LA10_0 >= 93 && LA10_0 <= 94)||LA10_0==96||(LA10_0 >= 98 && LA10_0 <= 100)||(LA10_0 >= 102 && LA10_0 <= 104)||LA10_0==106||LA10_0==112||LA10_0==115||(LA10_0 >= 117 && LA10_0 <= 118)||LA10_0==120||LA10_0==123) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:16: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements1031);
            	    statement39=statement();

            	    state._fsp--;

            	    stream_statement.add(statement39.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 168:29: -> ^( Statements ( statement )* )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:32: ^( Statements ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Statements, "Statements")
                , root_1);

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:168:45: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
        }
        return retval;
    }
    // $ANTLR end "statements"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:175:1: statement : ( declaration -> ^( Statement declaration ) | ( assignment ';' ) -> ^( Statement assignment ';' ) | ( member_access ';' ) -> ^( Statement member_access ';' ) | control_structure -> ^( Statement control_structure ) | return_statement -> ^( Statement return_statement ) | output -> ^( Statement output ) | input -> ^( Statement input ) | delete_statement -> ^( Statement delete_statement ) );
    public final BankParser.statement_return statement() throws RecognitionException {
        BankParser.statement_return retval = new BankParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal42=null;
        Token char_literal44=null;
        BankParser.declaration_return declaration40 =null;

        BankParser.assignment_return assignment41 =null;

        BankParser.member_access_return member_access43 =null;

        BankParser.control_structure_return control_structure45 =null;

        BankParser.return_statement_return return_statement46 =null;

        BankParser.output_return output47 =null;

        BankParser.input_return input48 =null;

        BankParser.delete_statement_return delete_statement49 =null;


        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_control_structure=new RewriteRuleSubtreeStream(adaptor,"rule control_structure");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_member_access=new RewriteRuleSubtreeStream(adaptor,"rule member_access");
        RewriteRuleSubtreeStream stream_delete_statement=new RewriteRuleSubtreeStream(adaptor,"rule delete_statement");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_return_statement=new RewriteRuleSubtreeStream(adaptor,"rule return_statement");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:176:5: ( declaration -> ^( Statement declaration ) | ( assignment ';' ) -> ^( Statement assignment ';' ) | ( member_access ';' ) -> ^( Statement member_access ';' ) | control_structure -> ^( Statement control_structure ) | return_statement -> ^( Statement return_statement ) | output -> ^( Statement output ) | input -> ^( Statement input ) | delete_statement -> ^( Statement delete_statement ) )
            int alt11=8;
            switch ( input.LA(1) ) {
            case IFSTREAM:
            case 90:
            case 93:
            case 100:
            case 102:
            case 104:
            case 106:
            case 115:
            case 117:
            case 120:
                {
                alt11=1;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 65:
                case 69:
                case 80:
                    {
                    alt11=2;
                    }
                    break;
                case 70:
                case 71:
                    {
                    alt11=3;
                    }
                    break;
                case ID:
                case 62:
                    {
                    alt11=1;
                    }
                    break;
                case 76:
                case 78:
                    {
                    alt11=6;
                    }
                    break;
                case 72:
                case 84:
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
            case 99:
            case 118:
            case 123:
                {
                alt11=4;
                }
                break;
            case 112:
                {
                alt11=5;
                }
                break;
            case 96:
                {
                alt11=6;
                }
                break;
            case 94:
            case 103:
                {
                alt11=7;
                }
                break;
            case 98:
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
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:176:7: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement1081);
                    declaration40=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration40.getTree());

                    // AST REWRITE
                    // elements: declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:19: -> ^( Statement declaration )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:176:22: ^( Statement declaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Statement, "Statement")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:177:7: ( assignment ';' )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:177:7: ( assignment ';' )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:177:8: assignment ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement1098);
                    assignment41=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment41.getTree());

                    char_literal42=(Token)match(input,76,FOLLOW_76_in_statement1100);  
                    stream_76.add(char_literal42);


                    }


                    // AST REWRITE
                    // elements: 76, assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:24: -> ^( Statement assignment ';' )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:177:27: ^( Statement assignment ';' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Statement, "Statement")
                        , root_1);

                        adaptor.addChild(root_1, stream_assignment.nextTree());

                        adaptor.addChild(root_1, 
                        stream_76.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:178:7: ( member_access ';' )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:178:7: ( member_access ';' )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:178:8: member_access ';'
                    {
                    pushFollow(FOLLOW_member_access_in_statement1121);
                    member_access43=member_access();

                    state._fsp--;

                    stream_member_access.add(member_access43.getTree());

                    char_literal44=(Token)match(input,76,FOLLOW_76_in_statement1123);  
                    stream_76.add(char_literal44);


                    }


                    // AST REWRITE
                    // elements: 76, member_access
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 178:27: -> ^( Statement member_access ';' )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:178:30: ^( Statement member_access ';' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Statement, "Statement")
                        , root_1);

                        adaptor.addChild(root_1, stream_member_access.nextTree());

                        adaptor.addChild(root_1, 
                        stream_76.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:179:7: control_structure
                    {
                    pushFollow(FOLLOW_control_structure_in_statement1142);
                    control_structure45=control_structure();

                    state._fsp--;

                    stream_control_structure.add(control_structure45.getTree());

                    // AST REWRITE
                    // elements: control_structure
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:25: -> ^( Statement control_structure )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:179:28: ^( Statement control_structure )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Statement, "Statement")
                        , root_1);

                        adaptor.addChild(root_1, stream_control_structure.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:180:7: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_statement1158);
                    return_statement46=return_statement();

                    state._fsp--;

                    stream_return_statement.add(return_statement46.getTree());

                    // AST REWRITE
                    // elements: return_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:24: -> ^( Statement return_statement )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:180:27: ^( Statement return_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Statement, "Statement")
                        , root_1);

                        adaptor.addChild(root_1, stream_return_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:181:7: output
                    {
                    pushFollow(FOLLOW_output_in_statement1174);
                    output47=output();

                    state._fsp--;

                    stream_output.add(output47.getTree());

                    // AST REWRITE
                    // elements: output
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:14: -> ^( Statement output )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:181:17: ^( Statement output )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Statement, "Statement")
                        , root_1);

                        adaptor.addChild(root_1, stream_output.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:182:7: input
                    {
                    pushFollow(FOLLOW_input_in_statement1190);
                    input48=input();

                    state._fsp--;

                    stream_input.add(input48.getTree());

                    // AST REWRITE
                    // elements: input
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:13: -> ^( Statement input )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:182:16: ^( Statement input )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Statement, "Statement")
                        , root_1);

                        adaptor.addChild(root_1, stream_input.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:183:7: delete_statement
                    {
                    pushFollow(FOLLOW_delete_statement_in_statement1206);
                    delete_statement49=delete_statement();

                    state._fsp--;

                    stream_delete_statement.add(delete_statement49.getTree());

                    // AST REWRITE
                    // elements: delete_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:24: -> ^( Statement delete_statement )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:183:27: ^( Statement delete_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Statement, "Statement")
                        , root_1);

                        adaptor.addChild(root_1, stream_delete_statement.nextTree());

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
    // $ANTLR end "statement"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:191:1: assignment : ID ( '=' | '+=' | '-=' ) ^ expression ;
    public final BankParser.assignment_return assignment() throws RecognitionException {
        BankParser.assignment_return retval = new BankParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID50=null;
        Token set51=null;
        BankParser.expression_return expression52 =null;


        Object ID50_tree=null;
        Object set51_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:191:12: ( ID ( '=' | '+=' | '-=' ) ^ expression )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:191:14: ID ( '=' | '+=' | '-=' ) ^ expression
            {
            root_0 = (Object)adaptor.nil();


            ID50=(Token)match(input,ID,FOLLOW_ID_in_assignment1258); 
            ID50_tree = 
            (Object)adaptor.create(ID50)
            ;
            adaptor.addChild(root_0, ID50_tree);


            set51=(Token)input.LT(1);

            set51=(Token)input.LT(1);

            if ( input.LA(1)==65||input.LA(1)==69||input.LA(1)==80 ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set51)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_expression_in_assignment1275);
            expression52=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression52.getTree());

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
    // $ANTLR end "assignment"


    public static class delete_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:1: delete_statement : ( 'delete' expression ';' ) -> ^( Delete 'delete' expression ';' ) ;
    public final BankParser.delete_statement_return delete_statement() throws RecognitionException {
        BankParser.delete_statement_return retval = new BankParser.delete_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal53=null;
        Token char_literal55=null;
        BankParser.expression_return expression54 =null;


        Object string_literal53_tree=null;
        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:18: ( ( 'delete' expression ';' ) -> ^( Delete 'delete' expression ';' ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:20: ( 'delete' expression ';' )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:20: ( 'delete' expression ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:21: 'delete' expression ';'
            {
            string_literal53=(Token)match(input,98,FOLLOW_98_in_delete_statement1308);  
            stream_98.add(string_literal53);


            pushFollow(FOLLOW_expression_in_delete_statement1310);
            expression54=expression();

            state._fsp--;

            stream_expression.add(expression54.getTree());

            char_literal55=(Token)match(input,76,FOLLOW_76_in_delete_statement1312);  
            stream_76.add(char_literal55);


            }


            // AST REWRITE
            // elements: 98, 76, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 198:46: -> ^( Delete 'delete' expression ';' )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:198:49: ^( Delete 'delete' expression ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Delete, "Delete")
                , root_1);

                adaptor.addChild(root_1, 
                stream_98.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, 
                stream_76.nextNode()
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
        }
        return retval;
    }
    // $ANTLR end "delete_statement"


    public static class return_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:205:1: return_statement : ( 'return' ( expression )? ';' ) -> ^( Return 'return' ( expression )? ';' ) ;
    public final BankParser.return_statement_return return_statement() throws RecognitionException {
        BankParser.return_statement_return retval = new BankParser.return_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal56=null;
        Token char_literal58=null;
        BankParser.expression_return expression57 =null;


        Object string_literal56_tree=null;
        Object char_literal58_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:205:18: ( ( 'return' ( expression )? ';' ) -> ^( Return 'return' ( expression )? ';' ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:205:20: ( 'return' ( expression )? ';' )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:205:20: ( 'return' ( expression )? ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:205:21: 'return' ( expression )? ';'
            {
            string_literal56=(Token)match(input,112,FOLLOW_112_in_return_statement1358);  
            stream_112.add(string_literal56);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:205:30: ( expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BOOLEAN||LA12_0==DIGIT||LA12_0==ID||LA12_0==54||LA12_0==56||LA12_0==60||LA12_0==64||LA12_0==68||LA12_0==108) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:205:30: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement1360);
                    expression57=expression();

                    state._fsp--;

                    stream_expression.add(expression57.getTree());

                    }
                    break;

            }


            char_literal58=(Token)match(input,76,FOLLOW_76_in_return_statement1363);  
            stream_76.add(char_literal58);


            }


            // AST REWRITE
            // elements: expression, 76, 112
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 205:47: -> ^( Return 'return' ( expression )? ';' )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:205:50: ^( Return 'return' ( expression )? ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Return, "Return")
                , root_1);

                adaptor.addChild(root_1, 
                stream_112.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:205:68: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_1, 
                stream_76.nextNode()
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
        }
        return retval;
    }
    // $ANTLR end "return_statement"


    public static class control_structure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "control_structure"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:217:1: control_structure : ( if_statement -> ^( Control_Structure if_statement ) | for_loop -> ^( Control_Structure for_loop ) | while_loop -> ^( Control_Structure while_loop ) | do_while_loop -> ^( Control_Structure do_while_loop ) | switch_statement -> ^( Control_Structure switch_statement ) );
    public final BankParser.control_structure_return control_structure() throws RecognitionException {
        BankParser.control_structure_return retval = new BankParser.control_structure_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.if_statement_return if_statement59 =null;

        BankParser.for_loop_return for_loop60 =null;

        BankParser.while_loop_return while_loop61 =null;

        BankParser.do_while_loop_return do_while_loop62 =null;

        BankParser.switch_statement_return switch_statement63 =null;


        RewriteRuleSubtreeStream stream_do_while_loop=new RewriteRuleSubtreeStream(adaptor,"rule do_while_loop");
        RewriteRuleSubtreeStream stream_while_loop=new RewriteRuleSubtreeStream(adaptor,"rule while_loop");
        RewriteRuleSubtreeStream stream_if_statement=new RewriteRuleSubtreeStream(adaptor,"rule if_statement");
        RewriteRuleSubtreeStream stream_for_loop=new RewriteRuleSubtreeStream(adaptor,"rule for_loop");
        RewriteRuleSubtreeStream stream_switch_statement=new RewriteRuleSubtreeStream(adaptor,"rule switch_statement");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:218:2: ( if_statement -> ^( Control_Structure if_statement ) | for_loop -> ^( Control_Structure for_loop ) | while_loop -> ^( Control_Structure while_loop ) | do_while_loop -> ^( Control_Structure do_while_loop ) | switch_statement -> ^( Control_Structure switch_statement ) )
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
            case 123:
                {
                alt13=3;
                }
                break;
            case 99:
                {
                alt13=4;
                }
                break;
            case 118:
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
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:218:4: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_control_structure1415);
                    if_statement59=if_statement();

                    state._fsp--;

                    stream_if_statement.add(if_statement59.getTree());

                    // AST REWRITE
                    // elements: if_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:17: -> ^( Control_Structure if_statement )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:218:20: ^( Control_Structure if_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Control_Structure, "Control_Structure")
                        , root_1);

                        adaptor.addChild(root_1, stream_if_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:219:4: for_loop
                    {
                    pushFollow(FOLLOW_for_loop_in_control_structure1429);
                    for_loop60=for_loop();

                    state._fsp--;

                    stream_for_loop.add(for_loop60.getTree());

                    // AST REWRITE
                    // elements: for_loop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:13: -> ^( Control_Structure for_loop )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:219:16: ^( Control_Structure for_loop )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Control_Structure, "Control_Structure")
                        , root_1);

                        adaptor.addChild(root_1, stream_for_loop.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:220:4: while_loop
                    {
                    pushFollow(FOLLOW_while_loop_in_control_structure1443);
                    while_loop61=while_loop();

                    state._fsp--;

                    stream_while_loop.add(while_loop61.getTree());

                    // AST REWRITE
                    // elements: while_loop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:15: -> ^( Control_Structure while_loop )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:220:18: ^( Control_Structure while_loop )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Control_Structure, "Control_Structure")
                        , root_1);

                        adaptor.addChild(root_1, stream_while_loop.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:221:4: do_while_loop
                    {
                    pushFollow(FOLLOW_do_while_loop_in_control_structure1457);
                    do_while_loop62=do_while_loop();

                    state._fsp--;

                    stream_do_while_loop.add(do_while_loop62.getTree());

                    // AST REWRITE
                    // elements: do_while_loop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:18: -> ^( Control_Structure do_while_loop )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:221:21: ^( Control_Structure do_while_loop )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Control_Structure, "Control_Structure")
                        , root_1);

                        adaptor.addChild(root_1, stream_do_while_loop.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:222:4: switch_statement
                    {
                    pushFollow(FOLLOW_switch_statement_in_control_structure1471);
                    switch_statement63=switch_statement();

                    state._fsp--;

                    stream_switch_statement.add(switch_statement63.getTree());

                    // AST REWRITE
                    // elements: switch_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:21: -> ^( Control_Structure switch_statement )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:222:24: ^( Control_Structure switch_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Control_Structure, "Control_Structure")
                        , root_1);

                        adaptor.addChild(root_1, stream_switch_statement.nextTree());

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
    // $ANTLR end "control_structure"


    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:230:1: if_statement : ( IF '(' expression ')' body ( else_statement )? ) -> ^( If IF '(' expression ')' body ( else_statement )? ) ;
    public final BankParser.if_statement_return if_statement() throws RecognitionException {
        BankParser.if_statement_return retval = new BankParser.if_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF64=null;
        Token char_literal65=null;
        Token char_literal67=null;
        BankParser.expression_return expression66 =null;

        BankParser.body_return body68 =null;

        BankParser.else_statement_return else_statement69 =null;


        Object IF64_tree=null;
        Object char_literal65_tree=null;
        Object char_literal67_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_else_statement=new RewriteRuleSubtreeStream(adaptor,"rule else_statement");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:230:14: ( ( IF '(' expression ')' body ( else_statement )? ) -> ^( If IF '(' expression ')' body ( else_statement )? ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:230:16: ( IF '(' expression ')' body ( else_statement )? )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:230:16: ( IF '(' expression ')' body ( else_statement )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:230:17: IF '(' expression ')' body ( else_statement )?
            {
            IF64=(Token)match(input,IF,FOLLOW_IF_in_if_statement1514);  
            stream_IF.add(IF64);


            char_literal65=(Token)match(input,60,FOLLOW_60_in_if_statement1516);  
            stream_60.add(char_literal65);


            pushFollow(FOLLOW_expression_in_if_statement1518);
            expression66=expression();

            state._fsp--;

            stream_expression.add(expression66.getTree());

            char_literal67=(Token)match(input,61,FOLLOW_61_in_if_statement1520);  
            stream_61.add(char_literal67);


            pushFollow(FOLLOW_body_in_if_statement1522);
            body68=body();

            state._fsp--;

            stream_body.add(body68.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:230:44: ( else_statement )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:230:44: else_statement
                    {
                    pushFollow(FOLLOW_else_statement_in_if_statement1524);
                    else_statement69=else_statement();

                    state._fsp--;

                    stream_else_statement.add(else_statement69.getTree());

                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: 60, else_statement, IF, expression, 61, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 230:61: -> ^( If IF '(' expression ')' body ( else_statement )? )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:230:64: ^( If IF '(' expression ')' body ( else_statement )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(If, "If")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IF.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, stream_body.nextTree());

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:230:96: ( else_statement )?
                if ( stream_else_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_else_statement.nextTree());

                }
                stream_else_statement.reset();

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
        }
        return retval;
    }
    // $ANTLR end "if_statement"


    public static class else_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:237:1: else_statement : ( ELSE body ) -> ^( Else ELSE body ) ;
    public final BankParser.else_statement_return else_statement() throws RecognitionException {
        BankParser.else_statement_return retval = new BankParser.else_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE70=null;
        BankParser.body_return body71 =null;


        Object ELSE70_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:237:16: ( ( ELSE body ) -> ^( Else ELSE body ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:237:18: ( ELSE body )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:237:18: ( ELSE body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:237:19: ELSE body
            {
            ELSE70=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_statement1578);  
            stream_ELSE.add(ELSE70);


            pushFollow(FOLLOW_body_in_else_statement1580);
            body71=body();

            state._fsp--;

            stream_body.add(body71.getTree());

            }


            // AST REWRITE
            // elements: body, ELSE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 237:30: -> ^( Else ELSE body )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:237:33: ^( Else ELSE body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Else, "Else")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ELSE.nextNode()
                );

                adaptor.addChild(root_1, stream_body.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "else_statement"


    public static class for_loop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_loop"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:1: for_loop : ( FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ) -> ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ) ;
    public final BankParser.for_loop_return for_loop() throws RecognitionException {
        BankParser.for_loop_return retval = new BankParser.for_loop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FOR72=null;
        Token char_literal73=null;
        Token string_literal74=null;
        Token string_literal75=null;
        Token char_literal76=null;
        Token ID77=null;
        Token char_literal78=null;
        Token char_literal80=null;
        BankParser.expression_return expression79 =null;

        BankParser.body_return body81 =null;


        Object FOR72_tree=null;
        Object char_literal73_tree=null;
        Object string_literal74_tree=null;
        Object string_literal75_tree=null;
        Object char_literal76_tree=null;
        Object ID77_tree=null;
        Object char_literal78_tree=null;
        Object char_literal80_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:10: ( ( FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ) -> ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:12: ( FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:12: ( FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:13: FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body
            {
            FOR72=(Token)match(input,FOR,FOLLOW_FOR_in_for_loop1624);  
            stream_FOR.add(FOR72);


            char_literal73=(Token)match(input,60,FOLLOW_60_in_for_loop1626);  
            stream_60.add(char_literal73);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:21: ( 'const' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==95) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:21: 'const'
                    {
                    string_literal74=(Token)match(input,95,FOLLOW_95_in_for_loop1628);  
                    stream_95.add(string_literal74);


                    }
                    break;

            }


            string_literal75=(Token)match(input,89,FOLLOW_89_in_for_loop1631);  
            stream_89.add(string_literal75);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:37: ( '&' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==59) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:37: '&'
                    {
                    char_literal76=(Token)match(input,59,FOLLOW_59_in_for_loop1633);  
                    stream_59.add(char_literal76);


                    }
                    break;

            }


            ID77=(Token)match(input,ID,FOLLOW_ID_in_for_loop1636);  
            stream_ID.add(ID77);


            char_literal78=(Token)match(input,74,FOLLOW_74_in_for_loop1638);  
            stream_74.add(char_literal78);


            pushFollow(FOLLOW_expression_in_for_loop1640);
            expression79=expression();

            state._fsp--;

            stream_expression.add(expression79.getTree());

            char_literal80=(Token)match(input,61,FOLLOW_61_in_for_loop1642);  
            stream_61.add(char_literal80);


            pushFollow(FOLLOW_body_in_for_loop1644);
            body81=body();

            state._fsp--;

            stream_body.add(body81.getTree());

            }


            // AST REWRITE
            // elements: 61, 95, 74, body, expression, FOR, 60, ID, 89, 59
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 244:70: -> ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:73: ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(For, "For")
                , root_1);

                adaptor.addChild(root_1, 
                stream_FOR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:87: ( 'const' )?
                if ( stream_95.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_95.nextNode()
                    );

                }
                stream_95.reset();

                adaptor.addChild(root_1, 
                stream_89.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:244:103: ( '&' )?
                if ( stream_59.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_59.nextNode()
                    );

                }
                stream_59.reset();

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_74.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, stream_body.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "for_loop"


    public static class while_loop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_loop"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:251:1: while_loop : ( 'while' '(' while_exp ')' body ) -> ^( While 'while' '(' while_exp ')' body ) ;
    public final BankParser.while_loop_return while_loop() throws RecognitionException {
        BankParser.while_loop_return retval = new BankParser.while_loop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        BankParser.while_exp_return while_exp84 =null;

        BankParser.body_return body86 =null;


        Object string_literal82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_while_exp=new RewriteRuleSubtreeStream(adaptor,"rule while_exp");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:251:12: ( ( 'while' '(' while_exp ')' body ) -> ^( While 'while' '(' while_exp ')' body ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:251:14: ( 'while' '(' while_exp ')' body )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:251:14: ( 'while' '(' while_exp ')' body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:251:15: 'while' '(' while_exp ')' body
            {
            string_literal82=(Token)match(input,123,FOLLOW_123_in_while_loop1706);  
            stream_123.add(string_literal82);


            char_literal83=(Token)match(input,60,FOLLOW_60_in_while_loop1708);  
            stream_60.add(char_literal83);


            pushFollow(FOLLOW_while_exp_in_while_loop1710);
            while_exp84=while_exp();

            state._fsp--;

            stream_while_exp.add(while_exp84.getTree());

            char_literal85=(Token)match(input,61,FOLLOW_61_in_while_loop1712);  
            stream_61.add(char_literal85);


            pushFollow(FOLLOW_body_in_while_loop1714);
            body86=body();

            state._fsp--;

            stream_body.add(body86.getTree());

            }


            // AST REWRITE
            // elements: while_exp, 61, 123, body, 60
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 251:47: -> ^( While 'while' '(' while_exp ')' body )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:251:50: ^( While 'while' '(' while_exp ')' body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(While, "While")
                , root_1);

                adaptor.addChild(root_1, 
                stream_123.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                adaptor.addChild(root_1, stream_while_exp.nextTree());

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, stream_body.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "while_loop"


    public static class while_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_exp"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:258:1: while_exp : ( expression -> ^( While_EXP expression ) | file_input -> ^( While_EXP file_input ) );
    public final BankParser.while_exp_return while_exp() throws RecognitionException {
        BankParser.while_exp_return retval = new BankParser.while_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.expression_return expression87 =null;

        BankParser.file_input_return file_input88 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_file_input=new RewriteRuleSubtreeStream(adaptor,"rule file_input");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:259:2: ( expression -> ^( While_EXP expression ) | file_input -> ^( While_EXP file_input ) )
            int alt17=2;
            switch ( input.LA(1) ) {
            case BOOLEAN:
            case DIGIT:
            case 54:
            case 56:
            case 60:
            case 64:
            case 68:
            case 108:
                {
                alt17=1;
                }
                break;
            case ID:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==55||LA17_2==58||(LA17_2 >= 61 && LA17_2 <= 64)||(LA17_2 >= 67 && LA17_2 <= 68)||(LA17_2 >= 70 && LA17_2 <= 71)||LA17_2==73||LA17_2==77||LA17_2==79||(LA17_2 >= 81 && LA17_2 <= 83)||LA17_2==125) ) {
                    alt17=1;
                }
                else if ( (LA17_2==72||LA17_2==84) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;

                }
                }
                break;
            case 94:
            case 103:
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
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:259:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_while_exp1767);
                    expression87=expression();

                    state._fsp--;

                    stream_expression.add(expression87.getTree());

                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 259:15: -> ^( While_EXP expression )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:259:18: ^( While_EXP expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(While_EXP, "While_EXP")
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:260:4: file_input
                    {
                    pushFollow(FOLLOW_file_input_in_while_exp1781);
                    file_input88=file_input();

                    state._fsp--;

                    stream_file_input.add(file_input88.getTree());

                    // AST REWRITE
                    // elements: file_input
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 260:15: -> ^( While_EXP file_input )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:260:18: ^( While_EXP file_input )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(While_EXP, "While_EXP")
                        , root_1);

                        adaptor.addChild(root_1, stream_file_input.nextTree());

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
    // $ANTLR end "while_exp"


    public static class do_while_loop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "do_while_loop"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:267:1: do_while_loop : ( 'do' body 'while' '(' expression ')' ';' ) -> ^( Do_While 'do' body 'while' '(' expression ')' ';' ) ;
    public final BankParser.do_while_loop_return do_while_loop() throws RecognitionException {
        BankParser.do_while_loop_return retval = new BankParser.do_while_loop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal89=null;
        Token string_literal91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        Token char_literal95=null;
        BankParser.body_return body90 =null;

        BankParser.expression_return expression93 =null;


        Object string_literal89_tree=null;
        Object string_literal91_tree=null;
        Object char_literal92_tree=null;
        Object char_literal94_tree=null;
        Object char_literal95_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:267:15: ( ( 'do' body 'while' '(' expression ')' ';' ) -> ^( Do_While 'do' body 'while' '(' expression ')' ';' ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:267:17: ( 'do' body 'while' '(' expression ')' ';' )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:267:17: ( 'do' body 'while' '(' expression ')' ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:267:18: 'do' body 'while' '(' expression ')' ';'
            {
            string_literal89=(Token)match(input,99,FOLLOW_99_in_do_while_loop1821);  
            stream_99.add(string_literal89);


            pushFollow(FOLLOW_body_in_do_while_loop1823);
            body90=body();

            state._fsp--;

            stream_body.add(body90.getTree());

            string_literal91=(Token)match(input,123,FOLLOW_123_in_do_while_loop1825);  
            stream_123.add(string_literal91);


            char_literal92=(Token)match(input,60,FOLLOW_60_in_do_while_loop1827);  
            stream_60.add(char_literal92);


            pushFollow(FOLLOW_expression_in_do_while_loop1829);
            expression93=expression();

            state._fsp--;

            stream_expression.add(expression93.getTree());

            char_literal94=(Token)match(input,61,FOLLOW_61_in_do_while_loop1831);  
            stream_61.add(char_literal94);


            char_literal95=(Token)match(input,76,FOLLOW_76_in_do_while_loop1833);  
            stream_76.add(char_literal95);


            }


            // AST REWRITE
            // elements: 123, 61, body, 99, expression, 60, 76
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 267:60: -> ^( Do_While 'do' body 'while' '(' expression ')' ';' )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:267:63: ^( Do_While 'do' body 'while' '(' expression ')' ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Do_While, "Do_While")
                , root_1);

                adaptor.addChild(root_1, 
                stream_99.nextNode()
                );

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_1, 
                stream_123.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_76.nextNode()
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
        }
        return retval;
    }
    // $ANTLR end "do_while_loop"


    public static class switch_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switch_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:1: switch_statement : ( 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' ) -> ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' ) ;
    public final BankParser.switch_statement_return switch_statement() throws RecognitionException {
        BankParser.switch_statement_return retval = new BankParser.switch_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        Token char_literal100=null;
        Token char_literal103=null;
        BankParser.expression_return expression98 =null;

        BankParser.switch_case_return switch_case101 =null;

        BankParser.default_case_return default_case102 =null;


        Object string_literal96_tree=null;
        Object char_literal97_tree=null;
        Object char_literal99_tree=null;
        Object char_literal100_tree=null;
        Object char_literal103_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_switch_case=new RewriteRuleSubtreeStream(adaptor,"rule switch_case");
        RewriteRuleSubtreeStream stream_default_case=new RewriteRuleSubtreeStream(adaptor,"rule default_case");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:18: ( ( 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' ) -> ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:20: ( 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:20: ( 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:21: 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}'
            {
            string_literal96=(Token)match(input,118,FOLLOW_118_in_switch_statement1887);  
            stream_118.add(string_literal96);


            char_literal97=(Token)match(input,60,FOLLOW_60_in_switch_statement1889);  
            stream_60.add(char_literal97);


            pushFollow(FOLLOW_expression_in_switch_statement1891);
            expression98=expression();

            state._fsp--;

            stream_expression.add(expression98.getTree());

            char_literal99=(Token)match(input,61,FOLLOW_61_in_switch_statement1893);  
            stream_61.add(char_literal99);


            char_literal100=(Token)match(input,124,FOLLOW_124_in_switch_statement1895);  
            stream_124.add(char_literal100);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:53: ( switch_case )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==92) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:53: switch_case
            	    {
            	    pushFollow(FOLLOW_switch_case_in_switch_statement1897);
            	    switch_case101=switch_case();

            	    state._fsp--;

            	    stream_switch_case.add(switch_case101.getTree());

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


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:66: ( default_case )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==97) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:66: default_case
                    {
                    pushFollow(FOLLOW_default_case_in_switch_statement1900);
                    default_case102=default_case();

                    state._fsp--;

                    stream_default_case.add(default_case102.getTree());

                    }
                    break;

            }


            char_literal103=(Token)match(input,126,FOLLOW_126_in_switch_statement1903);  
            stream_126.add(char_literal103);


            }


            // AST REWRITE
            // elements: switch_case, expression, 118, 60, 61, 124, default_case, 126
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 274:85: -> ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:88: ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Switch, "Switch")
                , root_1);

                adaptor.addChild(root_1, 
                stream_118.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_124.nextNode()
                );

                if ( !(stream_switch_case.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_switch_case.hasNext() ) {
                    adaptor.addChild(root_1, stream_switch_case.nextTree());

                }
                stream_switch_case.reset();

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:274:142: ( default_case )?
                if ( stream_default_case.hasNext() ) {
                    adaptor.addChild(root_1, stream_default_case.nextTree());

                }
                stream_default_case.reset();

                adaptor.addChild(root_1, 
                stream_126.nextNode()
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
        }
        return retval;
    }
    // $ANTLR end "switch_statement"


    public static class switch_case_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switch_case"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:281:1: switch_case : ( 'case' expression ':' statements ( break_statement )? ) -> ^( Switch_Case 'case' expression ':' statements ( break_statement )? ) ;
    public final BankParser.switch_case_return switch_case() throws RecognitionException {
        BankParser.switch_case_return retval = new BankParser.switch_case_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal104=null;
        Token char_literal106=null;
        BankParser.expression_return expression105 =null;

        BankParser.statements_return statements107 =null;

        BankParser.break_statement_return break_statement108 =null;


        Object string_literal104_tree=null;
        Object char_literal106_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_break_statement=new RewriteRuleSubtreeStream(adaptor,"rule break_statement");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:281:13: ( ( 'case' expression ':' statements ( break_statement )? ) -> ^( Switch_Case 'case' expression ':' statements ( break_statement )? ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:281:15: ( 'case' expression ':' statements ( break_statement )? )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:281:15: ( 'case' expression ':' statements ( break_statement )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:281:16: 'case' expression ':' statements ( break_statement )?
            {
            string_literal104=(Token)match(input,92,FOLLOW_92_in_switch_case1961);  
            stream_92.add(string_literal104);


            pushFollow(FOLLOW_expression_in_switch_case1963);
            expression105=expression();

            state._fsp--;

            stream_expression.add(expression105.getTree());

            char_literal106=(Token)match(input,74,FOLLOW_74_in_switch_case1965);  
            stream_74.add(char_literal106);


            pushFollow(FOLLOW_statements_in_switch_case1967);
            statements107=statements();

            state._fsp--;

            stream_statements.add(statements107.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:281:49: ( break_statement )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==91) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:281:49: break_statement
                    {
                    pushFollow(FOLLOW_break_statement_in_switch_case1969);
                    break_statement108=break_statement();

                    state._fsp--;

                    stream_break_statement.add(break_statement108.getTree());

                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: break_statement, 92, expression, 74, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 281:67: -> ^( Switch_Case 'case' expression ':' statements ( break_statement )? )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:281:70: ^( Switch_Case 'case' expression ':' statements ( break_statement )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Switch_Case, "Switch_Case")
                , root_1);

                adaptor.addChild(root_1, 
                stream_92.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, 
                stream_74.nextNode()
                );

                adaptor.addChild(root_1, stream_statements.nextTree());

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:281:117: ( break_statement )?
                if ( stream_break_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_break_statement.nextTree());

                }
                stream_break_statement.reset();

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
        }
        return retval;
    }
    // $ANTLR end "switch_case"


    public static class default_case_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "default_case"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:288:1: default_case : ( 'default' ':' statements ) -> ^( Default_Case 'default' ':' statements ) ;
    public final BankParser.default_case_return default_case() throws RecognitionException {
        BankParser.default_case_return retval = new BankParser.default_case_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal109=null;
        Token char_literal110=null;
        BankParser.statements_return statements111 =null;


        Object string_literal109_tree=null;
        Object char_literal110_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:288:14: ( ( 'default' ':' statements ) -> ^( Default_Case 'default' ':' statements ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:288:16: ( 'default' ':' statements )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:288:16: ( 'default' ':' statements )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:288:17: 'default' ':' statements
            {
            string_literal109=(Token)match(input,97,FOLLOW_97_in_default_case2021);  
            stream_97.add(string_literal109);


            char_literal110=(Token)match(input,74,FOLLOW_74_in_default_case2023);  
            stream_74.add(char_literal110);


            pushFollow(FOLLOW_statements_in_default_case2025);
            statements111=statements();

            state._fsp--;

            stream_statements.add(statements111.getTree());

            }


            // AST REWRITE
            // elements: 97, 74, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 288:43: -> ^( Default_Case 'default' ':' statements )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:288:46: ^( Default_Case 'default' ':' statements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Default_Case, "Default_Case")
                , root_1);

                adaptor.addChild(root_1, 
                stream_97.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_74.nextNode()
                );

                adaptor.addChild(root_1, stream_statements.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "default_case"


    public static class break_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "break_statement"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:295:1: break_statement : ( 'break' ';' ) -> ^( Break 'break' ';' ) ;
    public final BankParser.break_statement_return break_statement() throws RecognitionException {
        BankParser.break_statement_return retval = new BankParser.break_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal112=null;
        Token char_literal113=null;

        Object string_literal112_tree=null;
        Object char_literal113_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:295:17: ( ( 'break' ';' ) -> ^( Break 'break' ';' ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:295:19: ( 'break' ';' )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:295:19: ( 'break' ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:295:20: 'break' ';'
            {
            string_literal112=(Token)match(input,91,FOLLOW_91_in_break_statement2071);  
            stream_91.add(string_literal112);


            char_literal113=(Token)match(input,76,FOLLOW_76_in_break_statement2073);  
            stream_76.add(char_literal113);


            }


            // AST REWRITE
            // elements: 91, 76
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 295:33: -> ^( Break 'break' ';' )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:295:36: ^( Break 'break' ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Break, "Break")
                , root_1);

                adaptor.addChild(root_1, 
                stream_91.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_76.nextNode()
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
        }
        return retval;
    }
    // $ANTLR end "break_statement"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:307:1: type : ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) ) ( '*' )? ;
    public final BankParser.type_return type() throws RecognitionException {
        BankParser.type_return retval = new BankParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID116=null;
        Token char_literal117=null;
        BankParser.base_type_return base_type114 =null;

        BankParser.vector_type_return vector_type115 =null;


        Object ID116_tree=null;
        Object char_literal117_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_base_type=new RewriteRuleSubtreeStream(adaptor,"rule base_type");
        RewriteRuleSubtreeStream stream_vector_type=new RewriteRuleSubtreeStream(adaptor,"rule vector_type");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:307:6: ( ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) ) ( '*' )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:307:8: ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) ) ( '*' )?
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:307:8: ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 90:
            case 93:
            case 100:
            case 102:
            case 104:
            case 106:
            case 115:
            case 117:
                {
                alt21=1;
                }
                break;
            case 120:
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
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:308:2: base_type
                    {
                    pushFollow(FOLLOW_base_type_in_type2124);
                    base_type114=base_type();

                    state._fsp--;

                    stream_base_type.add(base_type114.getTree());

                    // AST REWRITE
                    // elements: base_type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 308:12: -> ^( Type base_type )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:308:15: ^( Type base_type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Type, "Type")
                        , root_1);

                        adaptor.addChild(root_1, stream_base_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:309:4: vector_type
                    {
                    pushFollow(FOLLOW_vector_type_in_type2138);
                    vector_type115=vector_type();

                    state._fsp--;

                    stream_vector_type.add(vector_type115.getTree());

                    // AST REWRITE
                    // elements: vector_type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 309:16: -> ^( Type vector_type )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:309:19: ^( Type vector_type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Type, "Type")
                        , root_1);

                        adaptor.addChild(root_1, stream_vector_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:310:4: ID
                    {
                    ID116=(Token)match(input,ID,FOLLOW_ID_in_type2152);  
                    stream_ID.add(ID116);


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
                    // 310:7: -> ^( Type ID )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:310:10: ^( Type ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Type, "Type")
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

            }


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:311:4: ( '*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:311:5: '*'
                    {
                    char_literal117=(Token)match(input,62,FOLLOW_62_in_type2166);  
                    stream_62.add(char_literal117);


                    }
                    break;

            }


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
    // $ANTLR end "type"


    public static class return_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_type"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:318:1: return_type : ( base_type -> ^( Return_Type base_type ) | 'void' -> ^( Return_Type 'void' ) );
    public final BankParser.return_type_return return_type() throws RecognitionException {
        BankParser.return_type_return retval = new BankParser.return_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal119=null;
        BankParser.base_type_return base_type118 =null;


        Object string_literal119_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_base_type=new RewriteRuleSubtreeStream(adaptor,"rule base_type");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:318:13: ( base_type -> ^( Return_Type base_type ) | 'void' -> ^( Return_Type 'void' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==90||LA23_0==93||LA23_0==100||LA23_0==102||LA23_0==104||LA23_0==106||LA23_0==115||LA23_0==117) ) {
                alt23=1;
            }
            else if ( (LA23_0==122) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:319:4: base_type
                    {
                    pushFollow(FOLLOW_base_type_in_return_type2204);
                    base_type118=base_type();

                    state._fsp--;

                    stream_base_type.add(base_type118.getTree());

                    // AST REWRITE
                    // elements: base_type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:14: -> ^( Return_Type base_type )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:319:17: ^( Return_Type base_type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Return_Type, "Return_Type")
                        , root_1);

                        adaptor.addChild(root_1, stream_base_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:320:4: 'void'
                    {
                    string_literal119=(Token)match(input,122,FOLLOW_122_in_return_type2217);  
                    stream_122.add(string_literal119);


                    // AST REWRITE
                    // elements: 122
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:11: -> ^( Return_Type 'void' )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:320:14: ^( Return_Type 'void' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Return_Type, "Return_Type")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_122.nextNode()
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
    // $ANTLR end "return_type"


    public static class base_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base_type"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:328:1: base_type : ( 'int' | 'double' | 'string' | 'bool' | 'char' | 'long' | 'short' | 'float' );
    public final BankParser.base_type_return base_type() throws RecognitionException {
        BankParser.base_type_return retval = new BankParser.base_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set120=null;

        Object set120_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:328:11: ( 'int' | 'double' | 'string' | 'bool' | 'char' | 'long' | 'short' | 'float' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            {
            root_0 = (Object)adaptor.nil();


            set120=(Token)input.LT(1);

            if ( input.LA(1)==90||input.LA(1)==93||input.LA(1)==100||input.LA(1)==102||input.LA(1)==104||input.LA(1)==106||input.LA(1)==115||input.LA(1)==117 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set120)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "base_type"


    public static class vector_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vector_type"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:335:1: vector_type : 'vector' '<' type '>' ;
    public final BankParser.vector_type_return vector_type() throws RecognitionException {
        BankParser.vector_type_return retval = new BankParser.vector_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        BankParser.type_return type123 =null;


        Object string_literal121_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:335:13: ( 'vector' '<' type '>' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:335:15: 'vector' '<' type '>'
            {
            root_0 = (Object)adaptor.nil();


            string_literal121=(Token)match(input,120,FOLLOW_120_in_vector_type2319); 
            string_literal121_tree = 
            (Object)adaptor.create(string_literal121)
            ;
            adaptor.addChild(root_0, string_literal121_tree);


            char_literal122=(Token)match(input,77,FOLLOW_77_in_vector_type2321); 
            char_literal122_tree = 
            (Object)adaptor.create(char_literal122)
            ;
            adaptor.addChild(root_0, char_literal122_tree);


            pushFollow(FOLLOW_type_in_vector_type2323);
            type123=type();

            state._fsp--;

            adaptor.addChild(root_0, type123.getTree());

            char_literal124=(Token)match(input,82,FOLLOW_82_in_vector_type2325); 
            char_literal124_tree = 
            (Object)adaptor.create(char_literal124)
            ;
            adaptor.addChild(root_0, char_literal124_tree);


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
    // $ANTLR end "vector_type"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:347:1: declaration : ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) ) ';' ;
    public final BankParser.declaration_return declaration() throws RecognitionException {
        BankParser.declaration_return retval = new BankParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal127=null;
        BankParser.variable_declaration_return variable_declaration125 =null;

        BankParser.file_declaration_return file_declaration126 =null;


        Object char_literal127_tree=null;
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule variable_declaration");
        RewriteRuleSubtreeStream stream_file_declaration=new RewriteRuleSubtreeStream(adaptor,"rule file_declaration");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:348:2: ( ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) ) ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:348:4: ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) ) ';'
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:348:4: ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID||LA24_0==90||LA24_0==93||LA24_0==100||LA24_0==102||LA24_0==104||LA24_0==106||LA24_0==115||LA24_0==117||LA24_0==120) ) {
                alt24=1;
            }
            else if ( (LA24_0==IFSTREAM) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:348:6: variable_declaration
                    {
                    pushFollow(FOLLOW_variable_declaration_in_declaration2364);
                    variable_declaration125=variable_declaration();

                    state._fsp--;

                    stream_variable_declaration.add(variable_declaration125.getTree());

                    // AST REWRITE
                    // elements: variable_declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:27: -> ^( Declaration variable_declaration )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:348:30: ^( Declaration variable_declaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Declaration, "Declaration")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable_declaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:349:4: file_declaration
                    {
                    pushFollow(FOLLOW_file_declaration_in_declaration2379);
                    file_declaration126=file_declaration();

                    state._fsp--;

                    stream_file_declaration.add(file_declaration126.getTree());

                    // AST REWRITE
                    // elements: file_declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 349:21: -> ^( Declaration file_declaration )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:349:24: ^( Declaration file_declaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Declaration, "Declaration")
                        , root_1);

                        adaptor.addChild(root_1, stream_file_declaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            char_literal127=(Token)match(input,76,FOLLOW_76_in_declaration2393);  
            stream_76.add(char_literal127);


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
    // $ANTLR end "declaration"


    public static class variable_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_declaration"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:357:1: variable_declaration : type variables ;
    public final BankParser.variable_declaration_return variable_declaration() throws RecognitionException {
        BankParser.variable_declaration_return retval = new BankParser.variable_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.type_return type128 =null;

        BankParser.variables_return variables129 =null;



        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:357:22: ( type variables )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:357:24: type variables
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_variable_declaration2424);
            type128=type();

            state._fsp--;

            adaptor.addChild(root_0, type128.getTree());

            pushFollow(FOLLOW_variables_in_variable_declaration2426);
            variables129=variables();

            state._fsp--;

            adaptor.addChild(root_0, variables129.getTree());

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
    // $ANTLR end "variable_declaration"


    public static class variables_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variables"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:364:1: variables : declarator ( ( ',' ) ^ declarator )* ;
    public final BankParser.variables_return variables() throws RecognitionException {
        BankParser.variables_return retval = new BankParser.variables_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal131=null;
        BankParser.declarator_return declarator130 =null;

        BankParser.declarator_return declarator132 =null;


        Object char_literal131_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:364:11: ( declarator ( ( ',' ) ^ declarator )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:364:13: declarator ( ( ',' ) ^ declarator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declarator_in_variables2458);
            declarator130=declarator();

            state._fsp--;

            adaptor.addChild(root_0, declarator130.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:364:24: ( ( ',' ) ^ declarator )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==66) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:364:26: ( ',' ) ^ declarator
            	    {
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:364:26: ( ',' )
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:364:27: ','
            	    {
            	    char_literal131=(Token)match(input,66,FOLLOW_66_in_variables2463); 
            	    char_literal131_tree = 
            	    (Object)adaptor.create(char_literal131)
            	    ;
            	    adaptor.addChild(root_0, char_literal131_tree);


            	    }


            	    pushFollow(FOLLOW_declarator_in_variables2467);
            	    declarator132=declarator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarator132.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "variables"


    public static class declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarator"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:371:1: declarator : qualified_id ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )? ;
    public final BankParser.declarator_return declarator() throws RecognitionException {
        BankParser.declarator_return retval = new BankParser.declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal134=null;
        Token char_literal136=null;
        Token char_literal138=null;
        BankParser.qualified_id_return qualified_id133 =null;

        BankParser.expression_return expression135 =null;

        BankParser.arguments_return arguments137 =null;


        Object char_literal134_tree=null;
        Object char_literal136_tree=null;
        Object char_literal138_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_qualified_id=new RewriteRuleSubtreeStream(adaptor,"rule qualified_id");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:371:12: ( qualified_id ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:371:14: qualified_id ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )?
            {
            pushFollow(FOLLOW_qualified_id_in_declarator2501);
            qualified_id133=qualified_id();

            state._fsp--;

            stream_qualified_id.add(qualified_id133.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:372:2: ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==80) ) {
                alt27=1;
            }
            else if ( (LA27_0==60) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:372:4: ( '=' expression )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:372:4: ( '=' expression )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:372:6: '=' expression
                    {
                    char_literal134=(Token)match(input,80,FOLLOW_80_in_declarator2509);  
                    stream_80.add(char_literal134);


                    pushFollow(FOLLOW_expression_in_declarator2511);
                    expression135=expression();

                    state._fsp--;

                    stream_expression.add(expression135.getTree());

                    }


                    // AST REWRITE
                    // elements: expression, 80
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 372:23: -> ^( Assign '=' expression )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:372:26: ^( Assign '=' expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Assign, "Assign")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_80.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:373:4: ( '(' ( arguments )? ')' )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:373:4: ( '(' ( arguments )? ')' )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:373:6: '(' ( arguments )? ')'
                    {
                    char_literal136=(Token)match(input,60,FOLLOW_60_in_declarator2531);  
                    stream_60.add(char_literal136);


                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:373:10: ( arguments )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==BOOLEAN||LA26_0==DIGIT||LA26_0==ID||LA26_0==54||LA26_0==56||LA26_0==60||LA26_0==64||LA26_0==68||LA26_0==108) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:373:10: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_declarator2533);
                            arguments137=arguments();

                            state._fsp--;

                            stream_arguments.add(arguments137.getTree());

                            }
                            break;

                    }


                    char_literal138=(Token)match(input,61,FOLLOW_61_in_declarator2536);  
                    stream_61.add(char_literal138);


                    }


                    // AST REWRITE
                    // elements: 61, 60, arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 373:27: -> ^( Call '(' ( arguments )? ')' )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:373:30: ^( Call '(' ( arguments )? ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Call, "Call")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_60.nextNode()
                        );

                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:373:41: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            adaptor.addChild(root_1, stream_arguments.nextTree());

                        }
                        stream_arguments.reset();

                        adaptor.addChild(root_1, 
                        stream_61.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


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
    // $ANTLR end "declarator"


    public static class qualified_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualified_id"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:381:1: qualified_id : ID ( '::' ID )? -> ^( Qualified ID ( '::' ID )? ) ;
    public final BankParser.qualified_id_return qualified_id() throws RecognitionException {
        BankParser.qualified_id_return retval = new BankParser.qualified_id_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID139=null;
        Token string_literal140=null;
        Token ID141=null;

        Object ID139_tree=null;
        Object string_literal140_tree=null;
        Object ID141_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:382:5: ( ID ( '::' ID )? -> ^( Qualified ID ( '::' ID )? ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:382:7: ID ( '::' ID )?
            {
            ID139=(Token)match(input,ID,FOLLOW_ID_in_qualified_id2593);  
            stream_ID.add(ID139);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:382:10: ( '::' ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==75) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:382:12: '::' ID
                    {
                    string_literal140=(Token)match(input,75,FOLLOW_75_in_qualified_id2597);  
                    stream_75.add(string_literal140);


                    ID141=(Token)match(input,ID,FOLLOW_ID_in_qualified_id2599);  
                    stream_ID.add(ID141);


                    }
                    break;

            }


            // AST REWRITE
            // elements: 75, ID, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 383:7: -> ^( Qualified ID ( '::' ID )? )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:383:10: ^( Qualified ID ( '::' ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Qualified, "Qualified")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:383:25: ( '::' ID )?
                if ( stream_75.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_75.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_75.reset();
                stream_ID.reset();

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
        }
        return retval;
    }
    // $ANTLR end "qualified_id"


    public static class file_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "file_declaration"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:391:1: file_declaration : IFSTREAM ID '(' string_literal ')' ;
    public final BankParser.file_declaration_return file_declaration() throws RecognitionException {
        BankParser.file_declaration_return retval = new BankParser.file_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IFSTREAM142=null;
        Token ID143=null;
        Token char_literal144=null;
        Token char_literal146=null;
        BankParser.string_literal_return string_literal145 =null;


        Object IFSTREAM142_tree=null;
        Object ID143_tree=null;
        Object char_literal144_tree=null;
        Object char_literal146_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:391:18: ( IFSTREAM ID '(' string_literal ')' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:391:20: IFSTREAM ID '(' string_literal ')'
            {
            root_0 = (Object)adaptor.nil();


            IFSTREAM142=(Token)match(input,IFSTREAM,FOLLOW_IFSTREAM_in_file_declaration2665); 
            IFSTREAM142_tree = 
            (Object)adaptor.create(IFSTREAM142)
            ;
            adaptor.addChild(root_0, IFSTREAM142_tree);


            ID143=(Token)match(input,ID,FOLLOW_ID_in_file_declaration2668); 
            ID143_tree = 
            (Object)adaptor.create(ID143)
            ;
            adaptor.addChild(root_0, ID143_tree);


            char_literal144=(Token)match(input,60,FOLLOW_60_in_file_declaration2670); 
            char_literal144_tree = 
            (Object)adaptor.create(char_literal144)
            ;
            adaptor.addChild(root_0, char_literal144_tree);


            pushFollow(FOLLOW_string_literal_in_file_declaration2672);
            string_literal145=string_literal();

            state._fsp--;

            adaptor.addChild(root_0, string_literal145.getTree());

            char_literal146=(Token)match(input,61,FOLLOW_61_in_file_declaration2674); 
            char_literal146_tree = 
            (Object)adaptor.create(char_literal146)
            ;
            adaptor.addChild(root_0, char_literal146_tree);


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
    // $ANTLR end "file_declaration"


    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:398:1: arguments : expression ( ( ',' ) ^ expression )* ;
    public final BankParser.arguments_return arguments() throws RecognitionException {
        BankParser.arguments_return retval = new BankParser.arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal148=null;
        BankParser.expression_return expression147 =null;

        BankParser.expression_return expression149 =null;


        Object char_literal148_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:398:11: ( expression ( ( ',' ) ^ expression )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:398:13: expression ( ( ',' ) ^ expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_arguments2706);
            expression147=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression147.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:398:24: ( ( ',' ) ^ expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==66) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:398:25: ( ',' ) ^ expression
            	    {
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:398:25: ( ',' )
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:398:26: ','
            	    {
            	    char_literal148=(Token)match(input,66,FOLLOW_66_in_arguments2710); 
            	    char_literal148_tree = 
            	    (Object)adaptor.create(char_literal148)
            	    ;
            	    adaptor.addChild(root_0, char_literal148_tree);


            	    }


            	    pushFollow(FOLLOW_expression_in_arguments2714);
            	    expression149=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression149.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "arguments"


    public static class class_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_definition"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:410:1: class_definition : ( CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ) -> ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ) ;
    public final BankParser.class_definition_return class_definition() throws RecognitionException {
        BankParser.class_definition_return retval = new BankParser.class_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS150=null;
        Token ID151=null;
        Token char_literal152=null;
        Token ID154=null;
        Token char_literal155=null;
        Token char_literal157=null;
        Token char_literal158=null;
        BankParser.class_visibility_return class_visibility153 =null;

        BankParser.class_members_return class_members156 =null;


        Object CLASS150_tree=null;
        Object ID151_tree=null;
        Object char_literal152_tree=null;
        Object ID154_tree=null;
        Object char_literal155_tree=null;
        Object char_literal157_tree=null;
        Object char_literal158_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_class_visibility=new RewriteRuleSubtreeStream(adaptor,"rule class_visibility");
        RewriteRuleSubtreeStream stream_class_members=new RewriteRuleSubtreeStream(adaptor,"rule class_members");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:410:18: ( ( CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ) -> ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:410:20: ( CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:410:20: ( CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:410:21: CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';'
            {
            CLASS150=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_definition2754);  
            stream_CLASS.add(CLASS150);


            ID151=(Token)match(input,ID,FOLLOW_ID_in_class_definition2756);  
            stream_ID.add(ID151);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:410:30: ( ':' class_visibility ID )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==74) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:410:31: ':' class_visibility ID
                    {
                    char_literal152=(Token)match(input,74,FOLLOW_74_in_class_definition2759);  
                    stream_74.add(char_literal152);


                    pushFollow(FOLLOW_class_visibility_in_class_definition2761);
                    class_visibility153=class_visibility();

                    state._fsp--;

                    stream_class_visibility.add(class_visibility153.getTree());

                    ID154=(Token)match(input,ID,FOLLOW_ID_in_class_definition2763);  
                    stream_ID.add(ID154);


                    }
                    break;

            }


            char_literal155=(Token)match(input,124,FOLLOW_124_in_class_definition2767);  
            stream_124.add(char_literal155);


            pushFollow(FOLLOW_class_members_in_class_definition2769);
            class_members156=class_members();

            state._fsp--;

            stream_class_members.add(class_members156.getTree());

            char_literal157=(Token)match(input,126,FOLLOW_126_in_class_definition2771);  
            stream_126.add(char_literal157);


            char_literal158=(Token)match(input,76,FOLLOW_76_in_class_definition2773);  
            stream_76.add(char_literal158);


            }


            // AST REWRITE
            // elements: ID, ID, class_members, 76, CLASS, 74, 124, class_visibility, 126
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 410:84: -> ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:410:87: ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Class, "Class")
                , root_1);

                adaptor.addChild(root_1, 
                stream_CLASS.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:410:104: ( ':' class_visibility ID )?
                if ( stream_ID.hasNext()||stream_74.hasNext()||stream_class_visibility.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_74.nextNode()
                    );

                    adaptor.addChild(root_1, stream_class_visibility.nextTree());

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();
                stream_74.reset();
                stream_class_visibility.reset();

                adaptor.addChild(root_1, 
                stream_124.nextNode()
                );

                adaptor.addChild(root_1, stream_class_members.nextTree());

                adaptor.addChild(root_1, 
                stream_126.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_76.nextNode()
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
        }
        return retval;
    }
    // $ANTLR end "class_definition"


    public static class class_members_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_members"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:417:1: class_members : ( ( class_member )* ) -> ^( Class_Members ( class_member )* ) ;
    public final BankParser.class_members_return class_members() throws RecognitionException {
        BankParser.class_members_return retval = new BankParser.class_members_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.class_member_return class_member159 =null;


        RewriteRuleSubtreeStream stream_class_member=new RewriteRuleSubtreeStream(adaptor,"rule class_member");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:417:15: ( ( ( class_member )* ) -> ^( Class_Members ( class_member )* ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:417:17: ( ( class_member )* )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:417:17: ( ( class_member )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:417:18: ( class_member )*
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:417:18: ( class_member )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ID||LA31_0==IFSTREAM||LA31_0==90||LA31_0==93||LA31_0==100||LA31_0==102||LA31_0==104||LA31_0==106||(LA31_0 >= 109 && LA31_0 <= 111)||(LA31_0 >= 115 && LA31_0 <= 117)||(LA31_0 >= 120 && LA31_0 <= 122)||LA31_0==127) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:417:19: class_member
            	    {
            	    pushFollow(FOLLOW_class_member_in_class_members2834);
            	    class_member159=class_member();

            	    state._fsp--;

            	    stream_class_member.add(class_member159.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: class_member
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 417:35: -> ^( Class_Members ( class_member )* )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:417:38: ^( Class_Members ( class_member )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Class_Members, "Class_Members")
                , root_1);

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:417:54: ( class_member )*
                while ( stream_class_member.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_member.nextTree());

                }
                stream_class_member.reset();

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
        }
        return retval;
    }
    // $ANTLR end "class_members"


    public static class class_member_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_member"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:424:1: class_member : ( class_visibility ':' )? ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) ) ;
    public final BankParser.class_member_return class_member() throws RecognitionException {
        BankParser.class_member_return retval = new BankParser.class_member_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal161=null;
        BankParser.class_visibility_return class_visibility160 =null;

        BankParser.class_declaration_return class_declaration162 =null;

        BankParser.constructor_return constructor163 =null;

        BankParser.class_function_definition_return class_function_definition164 =null;

        BankParser.destructor_return destructor165 =null;


        Object char_literal161_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_constructor=new RewriteRuleSubtreeStream(adaptor,"rule constructor");
        RewriteRuleSubtreeStream stream_destructor=new RewriteRuleSubtreeStream(adaptor,"rule destructor");
        RewriteRuleSubtreeStream stream_class_visibility=new RewriteRuleSubtreeStream(adaptor,"rule class_visibility");
        RewriteRuleSubtreeStream stream_class_declaration=new RewriteRuleSubtreeStream(adaptor,"rule class_declaration");
        RewriteRuleSubtreeStream stream_class_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule class_function_definition");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:424:14: ( ( class_visibility ':' )? ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:424:16: ( class_visibility ':' )? ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:424:16: ( class_visibility ':' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= 109 && LA32_0 <= 111)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:424:17: class_visibility ':'
                    {
                    pushFollow(FOLLOW_class_visibility_in_class_member2881);
                    class_visibility160=class_visibility();

                    state._fsp--;

                    stream_class_visibility.add(class_visibility160.getTree());

                    char_literal161=(Token)match(input,74,FOLLOW_74_in_class_member2883);  
                    stream_74.add(char_literal161);


                    }
                    break;

            }


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:425:2: ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) )
            int alt33=4;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:425:4: class_declaration
                    {
                    pushFollow(FOLLOW_class_declaration_in_class_member2891);
                    class_declaration162=class_declaration();

                    state._fsp--;

                    stream_class_declaration.add(class_declaration162.getTree());

                    // AST REWRITE
                    // elements: class_declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:22: -> ^( Class_Member class_declaration )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:425:25: ^( Class_Member class_declaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Class_Member, "Class_Member")
                        , root_1);

                        adaptor.addChild(root_1, stream_class_declaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:426:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_class_member2905);
                    constructor163=constructor();

                    state._fsp--;

                    stream_constructor.add(constructor163.getTree());

                    // AST REWRITE
                    // elements: constructor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 426:16: -> ^( Class_Member constructor )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:426:19: ^( Class_Member constructor )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Class_Member, "Class_Member")
                        , root_1);

                        adaptor.addChild(root_1, stream_constructor.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:427:4: class_function_definition
                    {
                    pushFollow(FOLLOW_class_function_definition_in_class_member2919);
                    class_function_definition164=class_function_definition();

                    state._fsp--;

                    stream_class_function_definition.add(class_function_definition164.getTree());

                    // AST REWRITE
                    // elements: class_function_definition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 427:30: -> ^( Class_Member class_function_definition )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:427:33: ^( Class_Member class_function_definition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Class_Member, "Class_Member")
                        , root_1);

                        adaptor.addChild(root_1, stream_class_function_definition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:428:4: destructor
                    {
                    pushFollow(FOLLOW_destructor_in_class_member2933);
                    destructor165=destructor();

                    state._fsp--;

                    stream_destructor.add(destructor165.getTree());

                    // AST REWRITE
                    // elements: destructor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 428:15: -> ^( Class_Member destructor )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:428:18: ^( Class_Member destructor )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Class_Member, "Class_Member")
                        , root_1);

                        adaptor.addChild(root_1, stream_destructor.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


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
    // $ANTLR end "class_member"


    public static class class_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_declaration"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:436:1: class_declaration : ( 'static' )? declaration ;
    public final BankParser.class_declaration_return class_declaration() throws RecognitionException {
        BankParser.class_declaration_return retval = new BankParser.class_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal166=null;
        BankParser.declaration_return declaration167 =null;


        Object string_literal166_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:436:19: ( ( 'static' )? declaration )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:436:21: ( 'static' )? declaration
            {
            root_0 = (Object)adaptor.nil();


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:436:21: ( 'static' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==116) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:436:21: 'static'
                    {
                    string_literal166=(Token)match(input,116,FOLLOW_116_in_class_declaration2976); 
                    string_literal166_tree = 
                    (Object)adaptor.create(string_literal166)
                    ;
                    adaptor.addChild(root_0, string_literal166_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_declaration_in_class_declaration2979);
            declaration167=declaration();

            state._fsp--;

            adaptor.addChild(root_0, declaration167.getTree());

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
    // $ANTLR end "class_declaration"


    public static class class_visibility_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_visibility"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:443:1: class_visibility : ( 'public' | 'private' | 'protected' ) ;
    public final BankParser.class_visibility_return class_visibility() throws RecognitionException {
        BankParser.class_visibility_return retval = new BankParser.class_visibility_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set168=null;

        Object set168_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:443:18: ( ( 'public' | 'private' | 'protected' ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            {
            root_0 = (Object)adaptor.nil();


            set168=(Token)input.LT(1);

            if ( (input.LA(1) >= 109 && input.LA(1) <= 111) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set168)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "class_visibility"


    public static class constructor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructor"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:1: constructor : ( ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) -> ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) ;
    public final BankParser.constructor_return constructor() throws RecognitionException {
        BankParser.constructor_return retval = new BankParser.constructor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal169=null;
        Token ID170=null;
        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal174=null;
        BankParser.parameters_return parameters172 =null;

        BankParser.member_init_list_return member_init_list175 =null;

        BankParser.class_function_body_return class_function_body176 =null;


        Object string_literal169_tree=null;
        Object ID170_tree=null;
        Object char_literal171_tree=null;
        Object char_literal173_tree=null;
        Object char_literal174_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_class_function_body=new RewriteRuleSubtreeStream(adaptor,"rule class_function_body");
        RewriteRuleSubtreeStream stream_member_init_list=new RewriteRuleSubtreeStream(adaptor,"rule member_init_list");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:13: ( ( ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) -> ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:15: ( ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:15: ( ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:16: ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:16: ( 'virtual' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==121) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:16: 'virtual'
                    {
                    string_literal169=(Token)match(input,121,FOLLOW_121_in_constructor3053);  
                    stream_121.add(string_literal169);


                    }
                    break;

            }


            ID170=(Token)match(input,ID,FOLLOW_ID_in_constructor3056);  
            stream_ID.add(ID170);


            char_literal171=(Token)match(input,60,FOLLOW_60_in_constructor3058);  
            stream_60.add(char_literal171);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:34: ( parameters )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID||LA36_0==90||LA36_0==93||LA36_0==100||LA36_0==102||LA36_0==104||LA36_0==106||LA36_0==115||LA36_0==117||LA36_0==120) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:34: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_constructor3060);
                    parameters172=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters172.getTree());

                    }
                    break;

            }


            char_literal173=(Token)match(input,61,FOLLOW_61_in_constructor3063);  
            stream_61.add(char_literal173);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:50: ( ':' member_init_list )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==74) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:450:52: ':' member_init_list
                    {
                    char_literal174=(Token)match(input,74,FOLLOW_74_in_constructor3067);  
                    stream_74.add(char_literal174);


                    pushFollow(FOLLOW_member_init_list_in_constructor3069);
                    member_init_list175=member_init_list();

                    state._fsp--;

                    stream_member_init_list.add(member_init_list175.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_constructor3074);
            class_function_body176=class_function_body();

            state._fsp--;

            stream_class_function_body.add(class_function_body176.getTree());

            }


            // AST REWRITE
            // elements: 121, 60, ID, parameters, 74, member_init_list, class_function_body, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 451:3: -> ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:451:6: ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Constructor, "Constructor")
                , root_1);

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:451:20: ( 'virtual' )?
                if ( stream_121.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_121.nextNode()
                    );

                }
                stream_121.reset();

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:451:38: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:451:54: ( ':' member_init_list )?
                if ( stream_74.hasNext()||stream_member_init_list.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_74.nextNode()
                    );

                    adaptor.addChild(root_1, stream_member_init_list.nextTree());

                }
                stream_74.reset();
                stream_member_init_list.reset();

                adaptor.addChild(root_1, stream_class_function_body.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "constructor"


    public static class destructor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "destructor"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:1: destructor : ( ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) -> ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) ;
    public final BankParser.destructor_return destructor() throws RecognitionException {
        BankParser.destructor_return retval = new BankParser.destructor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal177=null;
        Token char_literal178=null;
        Token ID179=null;
        Token char_literal180=null;
        Token char_literal182=null;
        Token char_literal183=null;
        BankParser.parameters_return parameters181 =null;

        BankParser.member_init_list_return member_init_list184 =null;

        BankParser.class_function_body_return class_function_body185 =null;


        Object string_literal177_tree=null;
        Object char_literal178_tree=null;
        Object ID179_tree=null;
        Object char_literal180_tree=null;
        Object char_literal182_tree=null;
        Object char_literal183_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_class_function_body=new RewriteRuleSubtreeStream(adaptor,"rule class_function_body");
        RewriteRuleSubtreeStream stream_member_init_list=new RewriteRuleSubtreeStream(adaptor,"rule member_init_list");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:12: ( ( ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) -> ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:14: ( ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:14: ( ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:15: ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:15: ( 'virtual' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==121) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:15: 'virtual'
                    {
                    string_literal177=(Token)match(input,121,FOLLOW_121_in_destructor3143);  
                    stream_121.add(string_literal177);


                    }
                    break;

            }


            char_literal178=(Token)match(input,127,FOLLOW_127_in_destructor3146);  
            stream_127.add(char_literal178);


            ID179=(Token)match(input,ID,FOLLOW_ID_in_destructor3148);  
            stream_ID.add(ID179);


            char_literal180=(Token)match(input,60,FOLLOW_60_in_destructor3150);  
            stream_60.add(char_literal180);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:37: ( parameters )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID||LA39_0==90||LA39_0==93||LA39_0==100||LA39_0==102||LA39_0==104||LA39_0==106||LA39_0==115||LA39_0==117||LA39_0==120) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:37: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_destructor3152);
                    parameters181=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters181.getTree());

                    }
                    break;

            }


            char_literal182=(Token)match(input,61,FOLLOW_61_in_destructor3155);  
            stream_61.add(char_literal182);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:53: ( ':' member_init_list )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==74) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:459:55: ':' member_init_list
                    {
                    char_literal183=(Token)match(input,74,FOLLOW_74_in_destructor3159);  
                    stream_74.add(char_literal183);


                    pushFollow(FOLLOW_member_init_list_in_destructor3161);
                    member_init_list184=member_init_list();

                    state._fsp--;

                    stream_member_init_list.add(member_init_list184.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_destructor3167);
            class_function_body185=class_function_body();

            state._fsp--;

            stream_class_function_body.add(class_function_body185.getTree());

            }


            // AST REWRITE
            // elements: member_init_list, 121, class_function_body, 74, 61, 60, 127, parameters, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 460:3: -> ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:460:6: ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Destructor, "Destructor")
                , root_1);

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:460:19: ( 'virtual' )?
                if ( stream_121.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_121.nextNode()
                    );

                }
                stream_121.reset();

                adaptor.addChild(root_1, 
                stream_127.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:460:41: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:460:57: ( ':' member_init_list )?
                if ( stream_member_init_list.hasNext()||stream_74.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_74.nextNode()
                    );

                    adaptor.addChild(root_1, stream_member_init_list.nextTree());

                }
                stream_member_init_list.reset();
                stream_74.reset();

                adaptor.addChild(root_1, stream_class_function_body.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "destructor"


    public static class member_init_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "member_init_list"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:467:1: member_init_list : function_call ( ( ',' ) ^ function_call )* ;
    public final BankParser.member_init_list_return member_init_list() throws RecognitionException {
        BankParser.member_init_list_return retval = new BankParser.member_init_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal187=null;
        BankParser.function_call_return function_call186 =null;

        BankParser.function_call_return function_call188 =null;


        Object char_literal187_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:467:18: ( function_call ( ( ',' ) ^ function_call )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:467:20: function_call ( ( ',' ) ^ function_call )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_function_call_in_member_init_list3236);
            function_call186=function_call();

            state._fsp--;

            adaptor.addChild(root_0, function_call186.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:467:34: ( ( ',' ) ^ function_call )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==66) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:467:36: ( ',' ) ^ function_call
            	    {
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:467:36: ( ',' )
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:467:37: ','
            	    {
            	    char_literal187=(Token)match(input,66,FOLLOW_66_in_member_init_list3241); 
            	    char_literal187_tree = 
            	    (Object)adaptor.create(char_literal187)
            	    ;
            	    adaptor.addChild(root_0, char_literal187_tree);


            	    }


            	    pushFollow(FOLLOW_function_call_in_member_init_list3245);
            	    function_call188=function_call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_call188.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "member_init_list"


    public static class class_function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_function_definition"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:1: class_function_definition : ( ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body ) -> ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body ) ;
    public final BankParser.class_function_definition_return class_function_definition() throws RecognitionException {
        BankParser.class_function_definition_return retval = new BankParser.class_function_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal189=null;
        Token ID191=null;
        Token char_literal192=null;
        Token char_literal194=null;
        Token string_literal195=null;
        BankParser.return_type_return return_type190 =null;

        BankParser.parameters_return parameters193 =null;

        BankParser.class_function_body_return class_function_body196 =null;


        Object string_literal189_tree=null;
        Object ID191_tree=null;
        Object char_literal192_tree=null;
        Object char_literal194_tree=null;
        Object string_literal195_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_class_function_body=new RewriteRuleSubtreeStream(adaptor,"rule class_function_body");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:27: ( ( ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body ) -> ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:29: ( ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:29: ( ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:30: ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:30: ( 'virtual' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==121) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:30: 'virtual'
                    {
                    string_literal189=(Token)match(input,121,FOLLOW_121_in_class_function_definition3280);  
                    stream_121.add(string_literal189);


                    }
                    break;

            }


            pushFollow(FOLLOW_return_type_in_class_function_definition3283);
            return_type190=return_type();

            state._fsp--;

            stream_return_type.add(return_type190.getTree());

            ID191=(Token)match(input,ID,FOLLOW_ID_in_class_function_definition3285);  
            stream_ID.add(ID191);


            char_literal192=(Token)match(input,60,FOLLOW_60_in_class_function_definition3287);  
            stream_60.add(char_literal192);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:60: ( parameters )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID||LA43_0==90||LA43_0==93||LA43_0==100||LA43_0==102||LA43_0==104||LA43_0==106||LA43_0==115||LA43_0==117||LA43_0==120) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:60: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_class_function_definition3289);
                    parameters193=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters193.getTree());

                    }
                    break;

            }


            char_literal194=(Token)match(input,61,FOLLOW_61_in_class_function_definition3292);  
            stream_61.add(char_literal194);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:76: ( 'const' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==95) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:474:76: 'const'
                    {
                    string_literal195=(Token)match(input,95,FOLLOW_95_in_class_function_definition3294);  
                    stream_95.add(string_literal195);


                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_class_function_definition3298);
            class_function_body196=class_function_body();

            state._fsp--;

            stream_class_function_body.add(class_function_body196.getTree());

            }


            // AST REWRITE
            // elements: 95, 60, 61, ID, return_type, class_function_body, 121, parameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 475:3: -> ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:475:6: ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Function, "Function")
                , root_1);

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:475:17: ( 'virtual' )?
                if ( stream_121.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_121.nextNode()
                    );

                }
                stream_121.reset();

                adaptor.addChild(root_1, stream_return_type.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:475:47: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:475:63: ( 'const' )?
                if ( stream_95.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_95.nextNode()
                    );

                }
                stream_95.reset();

                adaptor.addChild(root_1, stream_class_function_body.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "class_function_definition"


    public static class class_function_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_function_body"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:482:1: class_function_body : ( '{' statements '}' ) -> ^( Body '{' statements '}' ) ;
    public final BankParser.class_function_body_return class_function_body() throws RecognitionException {
        BankParser.class_function_body_return retval = new BankParser.class_function_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal197=null;
        Token char_literal199=null;
        BankParser.statements_return statements198 =null;


        Object char_literal197_tree=null;
        Object char_literal199_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:482:20: ( ( '{' statements '}' ) -> ^( Body '{' statements '}' ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:482:22: ( '{' statements '}' )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:482:22: ( '{' statements '}' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:482:23: '{' statements '}'
            {
            char_literal197=(Token)match(input,124,FOLLOW_124_in_class_function_body3360);  
            stream_124.add(char_literal197);


            pushFollow(FOLLOW_statements_in_class_function_body3362);
            statements198=statements();

            state._fsp--;

            stream_statements.add(statements198.getTree());

            char_literal199=(Token)match(input,126,FOLLOW_126_in_class_function_body3364);  
            stream_126.add(char_literal199);


            }


            // AST REWRITE
            // elements: 124, 126, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 482:43: -> ^( Body '{' statements '}' )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:482:46: ^( Body '{' statements '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Body, "Body")
                , root_1);

                adaptor.addChild(root_1, 
                stream_124.nextNode()
                );

                adaptor.addChild(root_1, stream_statements.nextTree());

                adaptor.addChild(root_1, 
                stream_126.nextNode()
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
        }
        return retval;
    }
    // $ANTLR end "class_function_body"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:494:1: expression : and_exp ( ( '||' ) ^ and_exp )* ;
    public final BankParser.expression_return expression() throws RecognitionException {
        BankParser.expression_return retval = new BankParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal201=null;
        BankParser.and_exp_return and_exp200 =null;

        BankParser.and_exp_return and_exp202 =null;


        Object string_literal201_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:494:11: ( and_exp ( ( '||' ) ^ and_exp )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:494:14: and_exp ( ( '||' ) ^ and_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_exp_in_expression3413);
            and_exp200=and_exp();

            state._fsp--;

            adaptor.addChild(root_0, and_exp200.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:494:22: ( ( '||' ) ^ and_exp )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==125) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:494:23: ( '||' ) ^ and_exp
            	    {
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:494:23: ( '||' )
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:494:24: '||'
            	    {
            	    string_literal201=(Token)match(input,125,FOLLOW_125_in_expression3417); 
            	    string_literal201_tree = 
            	    (Object)adaptor.create(string_literal201)
            	    ;
            	    adaptor.addChild(root_0, string_literal201_tree);


            	    }


            	    pushFollow(FOLLOW_and_exp_in_expression3421);
            	    and_exp202=and_exp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_exp202.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "expression"


    public static class and_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_exp"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:501:1: and_exp : equality_exp ( ( '&&' ) ^ equality_exp )* ;
    public final BankParser.and_exp_return and_exp() throws RecognitionException {
        BankParser.and_exp_return retval = new BankParser.and_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal204=null;
        BankParser.equality_exp_return equality_exp203 =null;

        BankParser.equality_exp_return equality_exp205 =null;


        Object string_literal204_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:501:9: ( equality_exp ( ( '&&' ) ^ equality_exp )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:501:11: equality_exp ( ( '&&' ) ^ equality_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_exp_in_and_exp3454);
            equality_exp203=equality_exp();

            state._fsp--;

            adaptor.addChild(root_0, equality_exp203.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:501:24: ( ( '&&' ) ^ equality_exp )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==58) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:501:25: ( '&&' ) ^ equality_exp
            	    {
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:501:25: ( '&&' )
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:501:26: '&&'
            	    {
            	    string_literal204=(Token)match(input,58,FOLLOW_58_in_and_exp3458); 
            	    string_literal204_tree = 
            	    (Object)adaptor.create(string_literal204)
            	    ;
            	    adaptor.addChild(root_0, string_literal204_tree);


            	    }


            	    pushFollow(FOLLOW_equality_exp_in_and_exp3462);
            	    equality_exp205=equality_exp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equality_exp205.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // $ANTLR end "and_exp"


    public static class equality_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_exp"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:508:1: equality_exp : relational_exp ( ( '==' | '!=' ) ^ relational_exp )* ;
    public final BankParser.equality_exp_return equality_exp() throws RecognitionException {
        BankParser.equality_exp_return retval = new BankParser.equality_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set207=null;
        BankParser.relational_exp_return relational_exp206 =null;

        BankParser.relational_exp_return relational_exp208 =null;


        Object set207_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:508:14: ( relational_exp ( ( '==' | '!=' ) ^ relational_exp )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:508:16: relational_exp ( ( '==' | '!=' ) ^ relational_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_exp_in_equality_exp3496);
            relational_exp206=relational_exp();

            state._fsp--;

            adaptor.addChild(root_0, relational_exp206.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:508:31: ( ( '==' | '!=' ) ^ relational_exp )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==55||LA47_0==81) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:508:32: ( '==' | '!=' ) ^ relational_exp
            	    {
            	    set207=(Token)input.LT(1);

            	    set207=(Token)input.LT(1);

            	    if ( input.LA(1)==55||input.LA(1)==81 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set207)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relational_exp_in_equality_exp3508);
            	    relational_exp208=relational_exp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relational_exp208.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // $ANTLR end "equality_exp"


    public static class relational_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_exp"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:515:1: relational_exp : unary_exp ( ( '<' | '>' | '<=' | '>=' ) ^ unary_exp )* ;
    public final BankParser.relational_exp_return relational_exp() throws RecognitionException {
        BankParser.relational_exp_return retval = new BankParser.relational_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set210=null;
        BankParser.unary_exp_return unary_exp209 =null;

        BankParser.unary_exp_return unary_exp211 =null;


        Object set210_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:515:16: ( unary_exp ( ( '<' | '>' | '<=' | '>=' ) ^ unary_exp )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:515:18: unary_exp ( ( '<' | '>' | '<=' | '>=' ) ^ unary_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unary_exp_in_relational_exp3542);
            unary_exp209=unary_exp();

            state._fsp--;

            adaptor.addChild(root_0, unary_exp209.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:515:28: ( ( '<' | '>' | '<=' | '>=' ) ^ unary_exp )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==77||LA48_0==79||(LA48_0 >= 82 && LA48_0 <= 83)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:515:29: ( '<' | '>' | '<=' | '>=' ) ^ unary_exp
            	    {
            	    set210=(Token)input.LT(1);

            	    set210=(Token)input.LT(1);

            	    if ( input.LA(1)==77||input.LA(1)==79||(input.LA(1) >= 82 && input.LA(1) <= 83) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set210)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_exp_in_relational_exp3562);
            	    unary_exp211=unary_exp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_exp211.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "relational_exp"


    public static class unary_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_exp"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:522:1: unary_exp : ( arithmetic_expression -> ^( Arithmetic_Expression arithmetic_expression ) | ( '!' unary_exp ) -> ^( Not '!' unary_exp ) );
    public final BankParser.unary_exp_return unary_exp() throws RecognitionException {
        BankParser.unary_exp_return retval = new BankParser.unary_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal213=null;
        BankParser.arithmetic_expression_return arithmetic_expression212 =null;

        BankParser.unary_exp_return unary_exp214 =null;


        Object char_literal213_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule arithmetic_expression");
        RewriteRuleSubtreeStream stream_unary_exp=new RewriteRuleSubtreeStream(adaptor,"rule unary_exp");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:523:2: ( arithmetic_expression -> ^( Arithmetic_Expression arithmetic_expression ) | ( '!' unary_exp ) -> ^( Not '!' unary_exp ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==BOOLEAN||LA49_0==DIGIT||LA49_0==ID||LA49_0==56||LA49_0==60||LA49_0==64||LA49_0==68||LA49_0==108) ) {
                alt49=1;
            }
            else if ( (LA49_0==54) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:524:2: arithmetic_expression
                    {
                    pushFollow(FOLLOW_arithmetic_expression_in_unary_exp3600);
                    arithmetic_expression212=arithmetic_expression();

                    state._fsp--;

                    stream_arithmetic_expression.add(arithmetic_expression212.getTree());

                    // AST REWRITE
                    // elements: arithmetic_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 524:24: -> ^( Arithmetic_Expression arithmetic_expression )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:524:27: ^( Arithmetic_Expression arithmetic_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Arithmetic_Expression, "Arithmetic_Expression")
                        , root_1);

                        adaptor.addChild(root_1, stream_arithmetic_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:525:4: ( '!' unary_exp )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:525:4: ( '!' unary_exp )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:525:5: '!' unary_exp
                    {
                    char_literal213=(Token)match(input,54,FOLLOW_54_in_unary_exp3615);  
                    stream_54.add(char_literal213);


                    pushFollow(FOLLOW_unary_exp_in_unary_exp3617);
                    unary_exp214=unary_exp();

                    state._fsp--;

                    stream_unary_exp.add(unary_exp214.getTree());

                    }


                    // AST REWRITE
                    // elements: 54, unary_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 525:20: -> ^( Not '!' unary_exp )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:525:23: ^( Not '!' unary_exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Not, "Not")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_54.nextNode()
                        );

                        adaptor.addChild(root_1, stream_unary_exp.nextTree());

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
    // $ANTLR end "unary_exp"


    public static class arithmetic_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithmetic_expression"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:532:1: arithmetic_expression : term ( ( '+' | '-' ) ^ term )* ;
    public final BankParser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
        BankParser.arithmetic_expression_return retval = new BankParser.arithmetic_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set216=null;
        BankParser.term_return term215 =null;

        BankParser.term_return term217 =null;


        Object set216_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:532:23: ( term ( ( '+' | '-' ) ^ term )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:532:25: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_arithmetic_expression3660);
            term215=term();

            state._fsp--;

            adaptor.addChild(root_0, term215.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:532:30: ( ( '+' | '-' ) ^ term )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==63||LA50_0==67) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:532:31: ( '+' | '-' ) ^ term
            	    {
            	    set216=(Token)input.LT(1);

            	    set216=(Token)input.LT(1);

            	    if ( input.LA(1)==63||input.LA(1)==67 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set216)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_arithmetic_expression3672);
            	    term217=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term217.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "arithmetic_expression"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:539:1: term : factor ( ( '*' | '/' ) ^ factor )* ;
    public final BankParser.term_return term() throws RecognitionException {
        BankParser.term_return retval = new BankParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set219=null;
        BankParser.factor_return factor218 =null;

        BankParser.factor_return factor220 =null;


        Object set219_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:539:6: ( factor ( ( '*' | '/' ) ^ factor )* )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:539:8: factor ( ( '*' | '/' ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term3709);
            factor218=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor218.getTree());

            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:539:15: ( ( '*' | '/' ) ^ factor )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==62||LA51_0==73) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:539:16: ( '*' | '/' ) ^ factor
            	    {
            	    set219=(Token)input.LT(1);

            	    set219=(Token)input.LT(1);

            	    if ( input.LA(1)==62||input.LA(1)==73 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set219)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term3721);
            	    factor220=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor220.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:546:1: factor : ( ( '(' arithmetic_expression ')' ) -> ^( Factor '(' arithmetic_expression ')' ) | ID -> ^( Factor ID ) | change -> ^( Factor change ) | true_false -> ^( Factor true_false ) | integer_literal -> ^( Factor integer_literal ) | string_literal -> ^( Factor string_literal ) | object_decleration -> ^( Factor object_decleration ) | member_access -> ^( Factor member_access ) );
    public final BankParser.factor_return factor() throws RecognitionException {
        BankParser.factor_return retval = new BankParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal221=null;
        Token char_literal223=null;
        Token ID224=null;
        BankParser.arithmetic_expression_return arithmetic_expression222 =null;

        BankParser.change_return change225 =null;

        BankParser.true_false_return true_false226 =null;

        BankParser.integer_literal_return integer_literal227 =null;

        BankParser.string_literal_return string_literal228 =null;

        BankParser.object_decleration_return object_decleration229 =null;

        BankParser.member_access_return member_access230 =null;


        Object char_literal221_tree=null;
        Object char_literal223_tree=null;
        Object ID224_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_string_literal=new RewriteRuleSubtreeStream(adaptor,"rule string_literal");
        RewriteRuleSubtreeStream stream_object_decleration=new RewriteRuleSubtreeStream(adaptor,"rule object_decleration");
        RewriteRuleSubtreeStream stream_member_access=new RewriteRuleSubtreeStream(adaptor,"rule member_access");
        RewriteRuleSubtreeStream stream_true_false=new RewriteRuleSubtreeStream(adaptor,"rule true_false");
        RewriteRuleSubtreeStream stream_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule arithmetic_expression");
        RewriteRuleSubtreeStream stream_change=new RewriteRuleSubtreeStream(adaptor,"rule change");
        RewriteRuleSubtreeStream stream_integer_literal=new RewriteRuleSubtreeStream(adaptor,"rule integer_literal");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:547:2: ( ( '(' arithmetic_expression ')' ) -> ^( Factor '(' arithmetic_expression ')' ) | ID -> ^( Factor ID ) | change -> ^( Factor change ) | true_false -> ^( Factor true_false ) | integer_literal -> ^( Factor integer_literal ) | string_literal -> ^( Factor string_literal ) | object_decleration -> ^( Factor object_decleration ) | member_access -> ^( Factor member_access ) )
            int alt52=8;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt52=1;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 64:
                case 68:
                    {
                    alt52=3;
                    }
                    break;
                case 70:
                case 71:
                    {
                    alt52=8;
                    }
                    break;
                case 55:
                case 58:
                case 61:
                case 62:
                case 63:
                case 66:
                case 67:
                case 73:
                case 74:
                case 76:
                case 77:
                case 78:
                case 79:
                case 81:
                case 82:
                case 83:
                case 84:
                case 125:
                    {
                    alt52=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 2, input);

                    throw nvae;

                }

                }
                break;
            case 64:
            case 68:
                {
                alt52=3;
                }
                break;
            case BOOLEAN:
                {
                alt52=4;
                }
                break;
            case DIGIT:
                {
                alt52=5;
                }
                break;
            case 56:
                {
                alt52=6;
                }
                break;
            case 108:
                {
                alt52=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:547:4: ( '(' arithmetic_expression ')' )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:547:4: ( '(' arithmetic_expression ')' )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:547:5: '(' arithmetic_expression ')'
                    {
                    char_literal221=(Token)match(input,60,FOLLOW_60_in_factor3758);  
                    stream_60.add(char_literal221);


                    pushFollow(FOLLOW_arithmetic_expression_in_factor3760);
                    arithmetic_expression222=arithmetic_expression();

                    state._fsp--;

                    stream_arithmetic_expression.add(arithmetic_expression222.getTree());

                    char_literal223=(Token)match(input,61,FOLLOW_61_in_factor3762);  
                    stream_61.add(char_literal223);


                    }


                    // AST REWRITE
                    // elements: arithmetic_expression, 61, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 547:36: -> ^( Factor '(' arithmetic_expression ')' )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:547:39: ^( Factor '(' arithmetic_expression ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_60.nextNode()
                        );

                        adaptor.addChild(root_1, stream_arithmetic_expression.nextTree());

                        adaptor.addChild(root_1, 
                        stream_61.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:548:4: ID
                    {
                    ID224=(Token)match(input,ID,FOLLOW_ID_in_factor3781);  
                    stream_ID.add(ID224);


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
                    // 548:7: -> ^( Factor ID )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:548:10: ^( Factor ID )
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
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:549:4: change
                    {
                    pushFollow(FOLLOW_change_in_factor3795);
                    change225=change();

                    state._fsp--;

                    stream_change.add(change225.getTree());

                    // AST REWRITE
                    // elements: change
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 549:11: -> ^( Factor change )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:549:14: ^( Factor change )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_change.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:550:4: true_false
                    {
                    pushFollow(FOLLOW_true_false_in_factor3809);
                    true_false226=true_false();

                    state._fsp--;

                    stream_true_false.add(true_false226.getTree());

                    // AST REWRITE
                    // elements: true_false
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 550:15: -> ^( Factor true_false )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:550:18: ^( Factor true_false )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_true_false.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:551:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_factor3823);
                    integer_literal227=integer_literal();

                    state._fsp--;

                    stream_integer_literal.add(integer_literal227.getTree());

                    // AST REWRITE
                    // elements: integer_literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 551:20: -> ^( Factor integer_literal )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:551:23: ^( Factor integer_literal )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_integer_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:552:4: string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_factor3837);
                    string_literal228=string_literal();

                    state._fsp--;

                    stream_string_literal.add(string_literal228.getTree());

                    // AST REWRITE
                    // elements: string_literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 552:19: -> ^( Factor string_literal )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:552:22: ^( Factor string_literal )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_string_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:553:4: object_decleration
                    {
                    pushFollow(FOLLOW_object_decleration_in_factor3851);
                    object_decleration229=object_decleration();

                    state._fsp--;

                    stream_object_decleration.add(object_decleration229.getTree());

                    // AST REWRITE
                    // elements: object_decleration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 553:23: -> ^( Factor object_decleration )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:553:26: ^( Factor object_decleration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_object_decleration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:554:4: member_access
                    {
                    pushFollow(FOLLOW_member_access_in_factor3865);
                    member_access230=member_access();

                    state._fsp--;

                    stream_member_access.add(member_access230.getTree());

                    // AST REWRITE
                    // elements: member_access
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 554:18: -> ^( Factor member_access )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:554:21: ^( Factor member_access )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_member_access.nextTree());

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


    public static class true_false_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "true_false"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:562:1: true_false : BOOLEAN ;
    public final BankParser.true_false_return true_false() throws RecognitionException {
        BankParser.true_false_return retval = new BankParser.true_false_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN231=null;

        Object BOOLEAN231_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:562:12: ( BOOLEAN )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:562:14: BOOLEAN
            {
            root_0 = (Object)adaptor.nil();


            BOOLEAN231=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_true_false3906); 
            BOOLEAN231_tree = 
            (Object)adaptor.create(BOOLEAN231)
            ;
            adaptor.addChild(root_0, BOOLEAN231_tree);


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
    // $ANTLR end "true_false"


    public static class member_access_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "member_access"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:569:1: member_access : ( function_access -> ^( Member_Access function_access ) | pointer_access -> ^( Member_Access pointer_access ) );
    public final BankParser.member_access_return member_access() throws RecognitionException {
        BankParser.member_access_return retval = new BankParser.member_access_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.function_access_return function_access232 =null;

        BankParser.pointer_access_return pointer_access233 =null;


        RewriteRuleSubtreeStream stream_function_access=new RewriteRuleSubtreeStream(adaptor,"rule function_access");
        RewriteRuleSubtreeStream stream_pointer_access=new RewriteRuleSubtreeStream(adaptor,"rule pointer_access");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:570:2: ( function_access -> ^( Member_Access function_access ) | pointer_access -> ^( Member_Access pointer_access ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==71) ) {
                    int LA53_2 = input.LA(3);

                    if ( (LA53_2==ID) ) {
                        alt53=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA53_1==70) ) {
                    alt53=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:571:2: function_access
                    {
                    pushFollow(FOLLOW_function_access_in_member_access3942);
                    function_access232=function_access();

                    state._fsp--;

                    stream_function_access.add(function_access232.getTree());

                    // AST REWRITE
                    // elements: function_access
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 571:18: -> ^( Member_Access function_access )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:571:21: ^( Member_Access function_access )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Member_Access, "Member_Access")
                        , root_1);

                        adaptor.addChild(root_1, stream_function_access.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:572:4: pointer_access
                    {
                    pushFollow(FOLLOW_pointer_access_in_member_access3956);
                    pointer_access233=pointer_access();

                    state._fsp--;

                    stream_pointer_access.add(pointer_access233.getTree());

                    // AST REWRITE
                    // elements: pointer_access
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 572:19: -> ^( Member_Access pointer_access )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:572:22: ^( Member_Access pointer_access )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Member_Access, "Member_Access")
                        , root_1);

                        adaptor.addChild(root_1, stream_pointer_access.nextTree());

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
    // $ANTLR end "member_access"


    public static class function_access_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_access"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:580:1: function_access : ID '.' ID ( '(' ( arguments )? ')' )? ;
    public final BankParser.function_access_return function_access() throws RecognitionException {
        BankParser.function_access_return retval = new BankParser.function_access_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID234=null;
        Token char_literal235=null;
        Token ID236=null;
        Token char_literal237=null;
        Token char_literal239=null;
        BankParser.arguments_return arguments238 =null;


        Object ID234_tree=null;
        Object char_literal235_tree=null;
        Object ID236_tree=null;
        Object char_literal237_tree=null;
        Object char_literal239_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:580:17: ( ID '.' ID ( '(' ( arguments )? ')' )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:580:19: ID '.' ID ( '(' ( arguments )? ')' )?
            {
            root_0 = (Object)adaptor.nil();


            ID234=(Token)match(input,ID,FOLLOW_ID_in_function_access3998); 
            ID234_tree = 
            (Object)adaptor.create(ID234)
            ;
            adaptor.addChild(root_0, ID234_tree);


            char_literal235=(Token)match(input,71,FOLLOW_71_in_function_access4000); 
            char_literal235_tree = 
            (Object)adaptor.create(char_literal235)
            ;
            adaptor.addChild(root_0, char_literal235_tree);


            ID236=(Token)match(input,ID,FOLLOW_ID_in_function_access4002); 
            ID236_tree = 
            (Object)adaptor.create(ID236)
            ;
            adaptor.addChild(root_0, ID236_tree);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:580:30: ( '(' ( arguments )? ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==60) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:580:32: '(' ( arguments )? ')'
                    {
                    char_literal237=(Token)match(input,60,FOLLOW_60_in_function_access4007); 
                    char_literal237_tree = 
                    (Object)adaptor.create(char_literal237)
                    ;
                    adaptor.addChild(root_0, char_literal237_tree);


                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:580:36: ( arguments )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==BOOLEAN||LA54_0==DIGIT||LA54_0==ID||LA54_0==54||LA54_0==56||LA54_0==60||LA54_0==64||LA54_0==68||LA54_0==108) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:580:36: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_function_access4009);
                            arguments238=arguments();

                            state._fsp--;

                            adaptor.addChild(root_0, arguments238.getTree());

                            }
                            break;

                    }


                    char_literal239=(Token)match(input,61,FOLLOW_61_in_function_access4012); 
                    char_literal239_tree = 
                    (Object)adaptor.create(char_literal239)
                    ;
                    adaptor.addChild(root_0, char_literal239_tree);


                    }
                    break;

            }


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
    // $ANTLR end "function_access"


    public static class pointer_access_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointer_access"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:587:1: pointer_access : ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )? ;
    public final BankParser.pointer_access_return pointer_access() throws RecognitionException {
        BankParser.pointer_access_return retval = new BankParser.pointer_access_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID240=null;
        Token set241=null;
        Token ID242=null;
        Token char_literal243=null;
        Token char_literal245=null;
        BankParser.arguments_return arguments244 =null;


        Object ID240_tree=null;
        Object set241_tree=null;
        Object ID242_tree=null;
        Object char_literal243_tree=null;
        Object char_literal245_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:587:16: ( ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )? )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:587:18: ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )?
            {
            root_0 = (Object)adaptor.nil();


            ID240=(Token)match(input,ID,FOLLOW_ID_in_pointer_access4047); 
            ID240_tree = 
            (Object)adaptor.create(ID240)
            ;
            adaptor.addChild(root_0, ID240_tree);


            set241=(Token)input.LT(1);

            if ( (input.LA(1) >= 70 && input.LA(1) <= 71) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set241)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            ID242=(Token)match(input,ID,FOLLOW_ID_in_pointer_access4057); 
            ID242_tree = 
            (Object)adaptor.create(ID242)
            ;
            adaptor.addChild(root_0, ID242_tree);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:587:37: ( '(' ( arguments )? ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==60) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:587:38: '(' ( arguments )? ')'
                    {
                    char_literal243=(Token)match(input,60,FOLLOW_60_in_pointer_access4060); 
                    char_literal243_tree = 
                    (Object)adaptor.create(char_literal243)
                    ;
                    adaptor.addChild(root_0, char_literal243_tree);


                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:587:42: ( arguments )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==BOOLEAN||LA56_0==DIGIT||LA56_0==ID||LA56_0==54||LA56_0==56||LA56_0==60||LA56_0==64||LA56_0==68||LA56_0==108) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:587:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_pointer_access4062);
                            arguments244=arguments();

                            state._fsp--;

                            adaptor.addChild(root_0, arguments244.getTree());

                            }
                            break;

                    }


                    char_literal245=(Token)match(input,61,FOLLOW_61_in_pointer_access4065); 
                    char_literal245_tree = 
                    (Object)adaptor.create(char_literal245)
                    ;
                    adaptor.addChild(root_0, char_literal245_tree);


                    }
                    break;

            }


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
    // $ANTLR end "pointer_access"


    public static class function_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:594:1: function_call : ( ID '(' ( arguments )? ')' ) -> ^( Call ID '(' ( arguments )? ')' ) ;
    public final BankParser.function_call_return function_call() throws RecognitionException {
        BankParser.function_call_return retval = new BankParser.function_call_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID246=null;
        Token char_literal247=null;
        Token char_literal249=null;
        BankParser.arguments_return arguments248 =null;


        Object ID246_tree=null;
        Object char_literal247_tree=null;
        Object char_literal249_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:594:15: ( ( ID '(' ( arguments )? ')' ) -> ^( Call ID '(' ( arguments )? ')' ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:594:17: ( ID '(' ( arguments )? ')' )
            {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:594:17: ( ID '(' ( arguments )? ')' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:594:18: ID '(' ( arguments )? ')'
            {
            ID246=(Token)match(input,ID,FOLLOW_ID_in_function_call4100);  
            stream_ID.add(ID246);


            char_literal247=(Token)match(input,60,FOLLOW_60_in_function_call4102);  
            stream_60.add(char_literal247);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:594:25: ( arguments )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==BOOLEAN||LA58_0==DIGIT||LA58_0==ID||LA58_0==54||LA58_0==56||LA58_0==60||LA58_0==64||LA58_0==68||LA58_0==108) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:594:25: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_function_call4104);
                    arguments248=arguments();

                    state._fsp--;

                    stream_arguments.add(arguments248.getTree());

                    }
                    break;

            }


            char_literal249=(Token)match(input,61,FOLLOW_61_in_function_call4107);  
            stream_61.add(char_literal249);


            }


            // AST REWRITE
            // elements: 61, ID, arguments, 60
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 594:41: -> ^( Call ID '(' ( arguments )? ')' )
            {
                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:594:44: ^( Call ID '(' ( arguments )? ')' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Call, "Call")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:594:58: ( arguments )?
                if ( stream_arguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_arguments.nextTree());

                }
                stream_arguments.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
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
        }
        return retval;
    }
    // $ANTLR end "function_call"


    public static class object_decleration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "object_decleration"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:601:1: object_decleration : 'new' function_call ;
    public final BankParser.object_decleration_return object_decleration() throws RecognitionException {
        BankParser.object_decleration_return retval = new BankParser.object_decleration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal250=null;
        BankParser.function_call_return function_call251 =null;


        Object string_literal250_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:601:20: ( 'new' function_call )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:601:22: 'new' function_call
            {
            root_0 = (Object)adaptor.nil();


            string_literal250=(Token)match(input,108,FOLLOW_108_in_object_decleration4154); 
            string_literal250_tree = 
            (Object)adaptor.create(string_literal250)
            ;
            adaptor.addChild(root_0, string_literal250_tree);


            pushFollow(FOLLOW_function_call_in_object_decleration4156);
            function_call251=function_call();

            state._fsp--;

            adaptor.addChild(root_0, function_call251.getTree());

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
    // $ANTLR end "object_decleration"


    public static class change_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "change"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:608:1: change : ( ( '++' | '--' ) ID | ID ( '++' | '--' ) ) ;
    public final BankParser.change_return change() throws RecognitionException {
        BankParser.change_return retval = new BankParser.change_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set252=null;
        Token ID253=null;
        Token ID254=null;
        Token set255=null;

        Object set252_tree=null;
        Object ID253_tree=null;
        Object ID254_tree=null;
        Object set255_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:608:8: ( ( ( '++' | '--' ) ID | ID ( '++' | '--' ) ) )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:608:10: ( ( '++' | '--' ) ID | ID ( '++' | '--' ) )
            {
            root_0 = (Object)adaptor.nil();


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:608:10: ( ( '++' | '--' ) ID | ID ( '++' | '--' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==64||LA59_0==68) ) {
                alt59=1;
            }
            else if ( (LA59_0==ID) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:608:12: ( '++' | '--' ) ID
                    {
                    set252=(Token)input.LT(1);

                    if ( input.LA(1)==64||input.LA(1)==68 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set252)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    ID253=(Token)match(input,ID,FOLLOW_ID_in_change4197); 
                    ID253_tree = 
                    (Object)adaptor.create(ID253)
                    ;
                    adaptor.addChild(root_0, ID253_tree);


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:608:31: ID ( '++' | '--' )
                    {
                    ID254=(Token)match(input,ID,FOLLOW_ID_in_change4201); 
                    ID254_tree = 
                    (Object)adaptor.create(ID254)
                    ;
                    adaptor.addChild(root_0, ID254_tree);


                    set255=(Token)input.LT(1);

                    if ( input.LA(1)==64||input.LA(1)==68 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set255)
                        );
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
    // $ANTLR end "change"


    public static class integer_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integer_literal"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:620:1: integer_literal : ( DIGIT )+ ;
    public final BankParser.integer_literal_return integer_literal() throws RecognitionException {
        BankParser.integer_literal_return retval = new BankParser.integer_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DIGIT256=null;

        Object DIGIT256_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:620:17: ( ( DIGIT )+ )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:620:19: ( DIGIT )+
            {
            root_0 = (Object)adaptor.nil();


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:620:19: ( DIGIT )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==DIGIT) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:620:19: DIGIT
            	    {
            	    DIGIT256=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_integer_literal4248); 
            	    DIGIT256_tree = 
            	    (Object)adaptor.create(DIGIT256)
            	    ;
            	    adaptor.addChild(root_0, DIGIT256_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
    // $ANTLR end "integer_literal"


    public static class float_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "float_literal"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:627:1: float_literal : ( DIGIT )+ '.' ( DIGIT )+ ;
    public final BankParser.float_literal_return float_literal() throws RecognitionException {
        BankParser.float_literal_return retval = new BankParser.float_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DIGIT257=null;
        Token char_literal258=null;
        Token DIGIT259=null;

        Object DIGIT257_tree=null;
        Object char_literal258_tree=null;
        Object DIGIT259_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:627:15: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:627:17: ( DIGIT )+ '.' ( DIGIT )+
            {
            root_0 = (Object)adaptor.nil();


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:627:17: ( DIGIT )+
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
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:627:17: DIGIT
            	    {
            	    DIGIT257=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_float_literal4281); 
            	    DIGIT257_tree = 
            	    (Object)adaptor.create(DIGIT257)
            	    ;
            	    adaptor.addChild(root_0, DIGIT257_tree);


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


            char_literal258=(Token)match(input,71,FOLLOW_71_in_float_literal4284); 
            char_literal258_tree = 
            (Object)adaptor.create(char_literal258)
            ;
            adaptor.addChild(root_0, char_literal258_tree);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:627:28: ( DIGIT )+
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
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:627:28: DIGIT
            	    {
            	    DIGIT259=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_float_literal4286); 
            	    DIGIT259_tree = 
            	    (Object)adaptor.create(DIGIT259)
            	    ;
            	    adaptor.addChild(root_0, DIGIT259_tree);


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
    // $ANTLR end "float_literal"


    public static class string_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_literal"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:634:1: string_literal : '\"' (~ '\"' )* '\"' ;
    public final BankParser.string_literal_return string_literal() throws RecognitionException {
        BankParser.string_literal_return retval = new BankParser.string_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal260=null;
        Token set261=null;
        Token char_literal262=null;

        Object char_literal260_tree=null;
        Object set261_tree=null;
        Object char_literal262_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:634:16: ( '\"' (~ '\"' )* '\"' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:634:18: '\"' (~ '\"' )* '\"'
            {
            root_0 = (Object)adaptor.nil();


            char_literal260=(Token)match(input,56,FOLLOW_56_in_string_literal4319); 
            char_literal260_tree = 
            (Object)adaptor.create(char_literal260)
            ;
            adaptor.addChild(root_0, char_literal260_tree);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:634:22: (~ '\"' )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0 >= Arithmetic_Expression && LA63_0 <= 55)||(LA63_0 >= 57 && LA63_0 <= 127)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            	    {
            	    set261=(Token)input.LT(1);

            	    if ( (input.LA(1) >= Arithmetic_Expression && input.LA(1) <= 55)||(input.LA(1) >= 57 && input.LA(1) <= 127) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set261)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            char_literal262=(Token)match(input,56,FOLLOW_56_in_string_literal4327); 
            char_literal262_tree = 
            (Object)adaptor.create(char_literal262)
            ;
            adaptor.addChild(root_0, char_literal262_tree);


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
    // $ANTLR end "string_literal"


    public static class character_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "character_literal"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:641:1: character_literal : '\\'' (~ ( '\\'' | '\\\\' ) )* '\\'' ;
    public final BankParser.character_literal_return character_literal() throws RecognitionException {
        BankParser.character_literal_return retval = new BankParser.character_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal263=null;
        Token set264=null;
        Token char_literal265=null;

        Object char_literal263_tree=null;
        Object set264_tree=null;
        Object char_literal265_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:641:19: ( '\\'' (~ ( '\\'' | '\\\\' ) )* '\\'' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:641:21: '\\'' (~ ( '\\'' | '\\\\' ) )* '\\''
            {
            root_0 = (Object)adaptor.nil();


            char_literal263=(Token)match(input,85,FOLLOW_85_in_character_literal4359); 
            char_literal263_tree = 
            (Object)adaptor.create(char_literal263)
            ;
            adaptor.addChild(root_0, char_literal263_tree);


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:641:26: (~ ( '\\'' | '\\\\' ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0 >= Arithmetic_Expression && LA64_0 <= 84)||(LA64_0 >= 87 && LA64_0 <= 127)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            	    {
            	    set264=(Token)input.LT(1);

            	    if ( (input.LA(1) >= Arithmetic_Expression && input.LA(1) <= 84)||(input.LA(1) >= 87 && input.LA(1) <= 127) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set264)
            	        );
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


            char_literal265=(Token)match(input,85,FOLLOW_85_in_character_literal4373); 
            char_literal265_tree = 
            (Object)adaptor.create(char_literal265)
            ;
            adaptor.addChild(root_0, char_literal265_tree);


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
    // $ANTLR end "character_literal"


    public static class output_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "output"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:653:1: output : ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';' ;
    public final BankParser.output_return output() throws RecognitionException {
        BankParser.output_return retval = new BankParser.output_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set266=null;
        Token string_literal267=null;
        Token string_literal269=null;
        Token char_literal271=null;
        BankParser.expression_return expression268 =null;

        BankParser.manipulators_return manipulators270 =null;


        Object set266_tree=null;
        Object string_literal267_tree=null;
        Object string_literal269_tree=null;
        Object char_literal271_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:653:8: ( ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';' )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:653:11: ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';'
            {
            root_0 = (Object)adaptor.nil();


            set266=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==96 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set266)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:653:25: ( '<<' ( expression | 'endl' | manipulators ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==78) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:653:26: '<<' ( expression | 'endl' | manipulators )
            	    {
            	    string_literal267=(Token)match(input,78,FOLLOW_78_in_output4420); 
            	    string_literal267_tree = 
            	    (Object)adaptor.create(string_literal267)
            	    ;
            	    adaptor.addChild(root_0, string_literal267_tree);


            	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:653:31: ( expression | 'endl' | manipulators )
            	    int alt65=3;
            	    switch ( input.LA(1) ) {
            	    case BOOLEAN:
            	    case DIGIT:
            	    case ID:
            	    case 54:
            	    case 56:
            	    case 60:
            	    case 64:
            	    case 68:
            	    case 108:
            	        {
            	        alt65=1;
            	        }
            	        break;
            	    case 101:
            	        {
            	        alt65=2;
            	        }
            	        break;
            	    case 105:
            	    case 113:
            	    case 114:
            	    case 117:
            	        {
            	        alt65=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 65, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt65) {
            	        case 1 :
            	            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:653:32: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_output4423);
            	            expression268=expression();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expression268.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:653:45: 'endl'
            	            {
            	            string_literal269=(Token)match(input,101,FOLLOW_101_in_output4427); 
            	            string_literal269_tree = 
            	            (Object)adaptor.create(string_literal269)
            	            ;
            	            adaptor.addChild(root_0, string_literal269_tree);


            	            }
            	            break;
            	        case 3 :
            	            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:653:54: manipulators
            	            {
            	            pushFollow(FOLLOW_manipulators_in_output4431);
            	            manipulators270=manipulators();

            	            state._fsp--;

            	            adaptor.addChild(root_0, manipulators270.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            char_literal271=(Token)match(input,76,FOLLOW_76_in_output4436); 
            char_literal271_tree = 
            (Object)adaptor.create(char_literal271)
            ;
            adaptor.addChild(root_0, char_literal271_tree);


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
    // $ANTLR end "output"


    public static class manipulators_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "manipulators"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:660:1: manipulators : ( 'left' -> ^( Manipulator 'left' ) | 'right' -> ^( Manipulator 'right' ) | ( 'setw' '(' expression ')' ) -> ^( Manipulator 'setw' '(' expression ')' ) | ( 'string' '(' expression ',' character_literal ')' ) -> ^( Manipulator 'string' '(' expression ',' character_literal ')' ) );
    public final BankParser.manipulators_return manipulators() throws RecognitionException {
        BankParser.manipulators_return retval = new BankParser.manipulators_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal272=null;
        Token string_literal273=null;
        Token string_literal274=null;
        Token char_literal275=null;
        Token char_literal277=null;
        Token string_literal278=null;
        Token char_literal279=null;
        Token char_literal281=null;
        Token char_literal283=null;
        BankParser.expression_return expression276 =null;

        BankParser.expression_return expression280 =null;

        BankParser.character_literal_return character_literal282 =null;


        Object string_literal272_tree=null;
        Object string_literal273_tree=null;
        Object string_literal274_tree=null;
        Object char_literal275_tree=null;
        Object char_literal277_tree=null;
        Object string_literal278_tree=null;
        Object char_literal279_tree=null;
        Object char_literal281_tree=null;
        Object char_literal283_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_character_literal=new RewriteRuleSubtreeStream(adaptor,"rule character_literal");
        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:661:2: ( 'left' -> ^( Manipulator 'left' ) | 'right' -> ^( Manipulator 'right' ) | ( 'setw' '(' expression ')' ) -> ^( Manipulator 'setw' '(' expression ')' ) | ( 'string' '(' expression ',' character_literal ')' ) -> ^( Manipulator 'string' '(' expression ',' character_literal ')' ) )
            int alt67=4;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt67=1;
                }
                break;
            case 113:
                {
                alt67=2;
                }
                break;
            case 114:
                {
                alt67=3;
                }
                break;
            case 117:
                {
                alt67=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }

            switch (alt67) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:661:4: 'left'
                    {
                    string_literal272=(Token)match(input,105,FOLLOW_105_in_manipulators4470);  
                    stream_105.add(string_literal272);


                    // AST REWRITE
                    // elements: 105
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 661:11: -> ^( Manipulator 'left' )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:661:14: ^( Manipulator 'left' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Manipulator, "Manipulator")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_105.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:662:4: 'right'
                    {
                    string_literal273=(Token)match(input,113,FOLLOW_113_in_manipulators4484);  
                    stream_113.add(string_literal273);


                    // AST REWRITE
                    // elements: 113
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 662:12: -> ^( Manipulator 'right' )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:662:15: ^( Manipulator 'right' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Manipulator, "Manipulator")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_113.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:663:4: ( 'setw' '(' expression ')' )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:663:4: ( 'setw' '(' expression ')' )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:663:5: 'setw' '(' expression ')'
                    {
                    string_literal274=(Token)match(input,114,FOLLOW_114_in_manipulators4500);  
                    stream_114.add(string_literal274);


                    char_literal275=(Token)match(input,60,FOLLOW_60_in_manipulators4502);  
                    stream_60.add(char_literal275);


                    pushFollow(FOLLOW_expression_in_manipulators4504);
                    expression276=expression();

                    state._fsp--;

                    stream_expression.add(expression276.getTree());

                    char_literal277=(Token)match(input,61,FOLLOW_61_in_manipulators4506);  
                    stream_61.add(char_literal277);


                    }


                    // AST REWRITE
                    // elements: 114, 61, 60, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 663:32: -> ^( Manipulator 'setw' '(' expression ')' )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:663:35: ^( Manipulator 'setw' '(' expression ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Manipulator, "Manipulator")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_114.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_60.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, 
                        stream_61.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:664:4: ( 'string' '(' expression ',' character_literal ')' )
                    {
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:664:4: ( 'string' '(' expression ',' character_literal ')' )
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:664:5: 'string' '(' expression ',' character_literal ')'
                    {
                    string_literal278=(Token)match(input,117,FOLLOW_117_in_manipulators4528);  
                    stream_117.add(string_literal278);


                    char_literal279=(Token)match(input,60,FOLLOW_60_in_manipulators4530);  
                    stream_60.add(char_literal279);


                    pushFollow(FOLLOW_expression_in_manipulators4532);
                    expression280=expression();

                    state._fsp--;

                    stream_expression.add(expression280.getTree());

                    char_literal281=(Token)match(input,66,FOLLOW_66_in_manipulators4534);  
                    stream_66.add(char_literal281);


                    pushFollow(FOLLOW_character_literal_in_manipulators4536);
                    character_literal282=character_literal();

                    state._fsp--;

                    stream_character_literal.add(character_literal282.getTree());

                    char_literal283=(Token)match(input,61,FOLLOW_61_in_manipulators4538);  
                    stream_61.add(char_literal283);


                    }


                    // AST REWRITE
                    // elements: 66, character_literal, 117, 60, expression, 61
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 664:56: -> ^( Manipulator 'string' '(' expression ',' character_literal ')' )
                    {
                        // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:664:59: ^( Manipulator 'string' '(' expression ',' character_literal ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Manipulator, "Manipulator")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_117.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_60.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, 
                        stream_66.nextNode()
                        );

                        adaptor.addChild(root_1, stream_character_literal.nextTree());

                        adaptor.addChild(root_1, 
                        stream_61.nextNode()
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
    // $ANTLR end "manipulators"


    public static class input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "input"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:676:1: input : ( stream ( '>>' expression )+ ';' | 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';' | stream '.ignore' '(' ')' ';' );
    public final BankParser.input_return input() throws RecognitionException {
        BankParser.input_return retval = new BankParser.input_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal285=null;
        Token char_literal287=null;
        Token string_literal288=null;
        Token char_literal289=null;
        Token char_literal291=null;
        Token ID292=null;
        Token char_literal293=null;
        Token char_literal295=null;
        Token char_literal296=null;
        Token string_literal298=null;
        Token char_literal299=null;
        Token char_literal300=null;
        Token char_literal301=null;
        BankParser.stream_return stream284 =null;

        BankParser.expression_return expression286 =null;

        BankParser.stream_return stream290 =null;

        BankParser.character_literal_return character_literal294 =null;

        BankParser.stream_return stream297 =null;


        Object string_literal285_tree=null;
        Object char_literal287_tree=null;
        Object string_literal288_tree=null;
        Object char_literal289_tree=null;
        Object char_literal291_tree=null;
        Object ID292_tree=null;
        Object char_literal293_tree=null;
        Object char_literal295_tree=null;
        Object char_literal296_tree=null;
        Object string_literal298_tree=null;
        Object char_literal299_tree=null;
        Object char_literal300_tree=null;
        Object char_literal301_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:677:3: ( stream ( '>>' expression )+ ';' | 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';' | stream '.ignore' '(' ')' ';' )
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ID||LA70_0==94) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==84) ) {
                    alt70=1;
                }
                else if ( (LA70_1==72) ) {
                    alt70=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA70_0==103) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:677:3: stream ( '>>' expression )+ ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stream_in_input4594);
                    stream284=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream284.getTree());

                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:677:10: ( '>>' expression )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==84) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:677:11: '>>' expression
                    	    {
                    	    string_literal285=(Token)match(input,84,FOLLOW_84_in_input4597); 
                    	    string_literal285_tree = 
                    	    (Object)adaptor.create(string_literal285)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal285_tree);


                    	    pushFollow(FOLLOW_expression_in_input4599);
                    	    expression286=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression286.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);


                    char_literal287=(Token)match(input,76,FOLLOW_76_in_input4603); 
                    char_literal287_tree = 
                    (Object)adaptor.create(char_literal287)
                    ;
                    adaptor.addChild(root_0, char_literal287_tree);


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:678:3: 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal288=(Token)match(input,103,FOLLOW_103_in_input4607); 
                    string_literal288_tree = 
                    (Object)adaptor.create(string_literal288)
                    ;
                    adaptor.addChild(root_0, string_literal288_tree);


                    char_literal289=(Token)match(input,60,FOLLOW_60_in_input4609); 
                    char_literal289_tree = 
                    (Object)adaptor.create(char_literal289)
                    ;
                    adaptor.addChild(root_0, char_literal289_tree);


                    pushFollow(FOLLOW_stream_in_input4611);
                    stream290=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream290.getTree());

                    char_literal291=(Token)match(input,66,FOLLOW_66_in_input4613); 
                    char_literal291_tree = 
                    (Object)adaptor.create(char_literal291)
                    ;
                    adaptor.addChild(root_0, char_literal291_tree);


                    ID292=(Token)match(input,ID,FOLLOW_ID_in_input4615); 
                    ID292_tree = 
                    (Object)adaptor.create(ID292)
                    ;
                    adaptor.addChild(root_0, ID292_tree);


                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:678:31: ( ',' character_literal )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==66) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:678:32: ',' character_literal
                            {
                            char_literal293=(Token)match(input,66,FOLLOW_66_in_input4618); 
                            char_literal293_tree = 
                            (Object)adaptor.create(char_literal293)
                            ;
                            adaptor.addChild(root_0, char_literal293_tree);


                            pushFollow(FOLLOW_character_literal_in_input4620);
                            character_literal294=character_literal();

                            state._fsp--;

                            adaptor.addChild(root_0, character_literal294.getTree());

                            }
                            break;

                    }


                    char_literal295=(Token)match(input,61,FOLLOW_61_in_input4624); 
                    char_literal295_tree = 
                    (Object)adaptor.create(char_literal295)
                    ;
                    adaptor.addChild(root_0, char_literal295_tree);


                    char_literal296=(Token)match(input,76,FOLLOW_76_in_input4626); 
                    char_literal296_tree = 
                    (Object)adaptor.create(char_literal296)
                    ;
                    adaptor.addChild(root_0, char_literal296_tree);


                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:679:5: stream '.ignore' '(' ')' ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stream_in_input4632);
                    stream297=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream297.getTree());

                    string_literal298=(Token)match(input,72,FOLLOW_72_in_input4634); 
                    string_literal298_tree = 
                    (Object)adaptor.create(string_literal298)
                    ;
                    adaptor.addChild(root_0, string_literal298_tree);


                    char_literal299=(Token)match(input,60,FOLLOW_60_in_input4636); 
                    char_literal299_tree = 
                    (Object)adaptor.create(char_literal299)
                    ;
                    adaptor.addChild(root_0, char_literal299_tree);


                    char_literal300=(Token)match(input,61,FOLLOW_61_in_input4638); 
                    char_literal300_tree = 
                    (Object)adaptor.create(char_literal300)
                    ;
                    adaptor.addChild(root_0, char_literal300_tree);


                    char_literal301=(Token)match(input,76,FOLLOW_76_in_input4640); 
                    char_literal301_tree = 
                    (Object)adaptor.create(char_literal301)
                    ;
                    adaptor.addChild(root_0, char_literal301_tree);


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
    // $ANTLR end "input"


    public static class file_input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "file_input"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:687:1: file_input : ( ID ( '>>' expression )+ | 'getline' '(' stream ',' ID ')' | stream '.ignore' '(' ')' );
    public final BankParser.file_input_return file_input() throws RecognitionException {
        BankParser.file_input_return retval = new BankParser.file_input_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID302=null;
        Token string_literal303=null;
        Token string_literal305=null;
        Token char_literal306=null;
        Token char_literal308=null;
        Token ID309=null;
        Token char_literal310=null;
        Token string_literal312=null;
        Token char_literal313=null;
        Token char_literal314=null;
        BankParser.expression_return expression304 =null;

        BankParser.stream_return stream307 =null;

        BankParser.stream_return stream311 =null;


        Object ID302_tree=null;
        Object string_literal303_tree=null;
        Object string_literal305_tree=null;
        Object char_literal306_tree=null;
        Object char_literal308_tree=null;
        Object ID309_tree=null;
        Object char_literal310_tree=null;
        Object string_literal312_tree=null;
        Object char_literal313_tree=null;
        Object char_literal314_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:687:12: ( ID ( '>>' expression )+ | 'getline' '(' stream ',' ID ')' | stream '.ignore' '(' ')' )
            int alt72=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==84) ) {
                    alt72=1;
                }
                else if ( (LA72_1==72) ) {
                    alt72=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;

                }
                }
                break;
            case 103:
                {
                alt72=2;
                }
                break;
            case 94:
                {
                alt72=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:687:14: ID ( '>>' expression )+
                    {
                    root_0 = (Object)adaptor.nil();


                    ID302=(Token)match(input,ID,FOLLOW_ID_in_file_input4672); 
                    ID302_tree = 
                    (Object)adaptor.create(ID302)
                    ;
                    adaptor.addChild(root_0, ID302_tree);


                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:687:17: ( '>>' expression )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==84) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:687:18: '>>' expression
                    	    {
                    	    string_literal303=(Token)match(input,84,FOLLOW_84_in_file_input4675); 
                    	    string_literal303_tree = 
                    	    (Object)adaptor.create(string_literal303)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal303_tree);


                    	    pushFollow(FOLLOW_expression_in_file_input4677);
                    	    expression304=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression304.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt71 >= 1 ) break loop71;
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:688:3: 'getline' '(' stream ',' ID ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal305=(Token)match(input,103,FOLLOW_103_in_file_input4683); 
                    string_literal305_tree = 
                    (Object)adaptor.create(string_literal305)
                    ;
                    adaptor.addChild(root_0, string_literal305_tree);


                    char_literal306=(Token)match(input,60,FOLLOW_60_in_file_input4685); 
                    char_literal306_tree = 
                    (Object)adaptor.create(char_literal306)
                    ;
                    adaptor.addChild(root_0, char_literal306_tree);


                    pushFollow(FOLLOW_stream_in_file_input4687);
                    stream307=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream307.getTree());

                    char_literal308=(Token)match(input,66,FOLLOW_66_in_file_input4689); 
                    char_literal308_tree = 
                    (Object)adaptor.create(char_literal308)
                    ;
                    adaptor.addChild(root_0, char_literal308_tree);


                    ID309=(Token)match(input,ID,FOLLOW_ID_in_file_input4691); 
                    ID309_tree = 
                    (Object)adaptor.create(ID309)
                    ;
                    adaptor.addChild(root_0, ID309_tree);


                    char_literal310=(Token)match(input,61,FOLLOW_61_in_file_input4693); 
                    char_literal310_tree = 
                    (Object)adaptor.create(char_literal310)
                    ;
                    adaptor.addChild(root_0, char_literal310_tree);


                    }
                    break;
                case 3 :
                    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:689:5: stream '.ignore' '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stream_in_file_input4699);
                    stream311=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream311.getTree());

                    string_literal312=(Token)match(input,72,FOLLOW_72_in_file_input4701); 
                    string_literal312_tree = 
                    (Object)adaptor.create(string_literal312)
                    ;
                    adaptor.addChild(root_0, string_literal312_tree);


                    char_literal313=(Token)match(input,60,FOLLOW_60_in_file_input4703); 
                    char_literal313_tree = 
                    (Object)adaptor.create(char_literal313)
                    ;
                    adaptor.addChild(root_0, char_literal313_tree);


                    char_literal314=(Token)match(input,61,FOLLOW_61_in_file_input4705); 
                    char_literal314_tree = 
                    (Object)adaptor.create(char_literal314)
                    ;
                    adaptor.addChild(root_0, char_literal314_tree);


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
    // $ANTLR end "file_input"


    public static class stream_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stream"
    // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:696:1: stream : ( 'cin' | ID );
    public final BankParser.stream_return stream() throws RecognitionException {
        BankParser.stream_return retval = new BankParser.stream_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set315=null;

        Object set315_tree=null;

        try {
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:696:8: ( 'cin' | ID )
            // E:\\Matrial\\2'nd semester\\Compiler\\Lab\\project\\407_project\\Bank.g:
            {
            root_0 = (Object)adaptor.nil();


            set315=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==94 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set315)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "stream"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA1_eotS =
        "\20\uffff";
    static final String DFA1_eofS =
        "\1\1\17\uffff";
    static final String DFA1_minS =
        "\1\11\1\uffff\1\36\3\uffff\1\74\1\6\1\36\1\32\1\6\1\67\1\6\1\36"+
        "\1\6\1\67";
    static final String DFA1_maxS =
        "\1\172\1\uffff\1\76\3\uffff\1\120\1\170\1\175\1\174\1\154\1\175"+
        "\1\170\1\175\1\154\1\175";
    static final String DFA1_acceptS =
        "\1\uffff\1\4\1\uffff\1\1\1\2\1\3\12\uffff";
    static final String DFA1_specialS =
        "\20\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\24\uffff\1\5\1\uffff\1\5\71\uffff\1\2\2\uffff\1\2\6\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\1\5\1\uffff\1\3",
            "",
            "\1\6\37\uffff\1\5",
            "",
            "",
            "",
            "\1\7\5\uffff\1\5\10\uffff\2\5\3\uffff\1\5",
            "\1\5\13\uffff\1\5\13\uffff\1\10\27\uffff\1\5\1\uffff\1\5\3"+
            "\uffff\1\5\1\11\2\uffff\1\5\3\uffff\1\5\25\uffff\1\3\2\uffff"+
            "\1\3\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\5\6\uffff\1\3\1\uffff\1\3\2\uffff\1\3",
            "\1\3\30\uffff\1\5\2\uffff\1\5\2\uffff\1\5\1\12\2\5\1\uffff"+
            "\3\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\3\5\51\uffff\1\5",
            "\1\3\3\uffff\3\3\41\uffff\1\5\11\uffff\1\5\15\uffff\1\3\2\uffff"+
            "\2\3\1\uffff\1\3\1\uffff\3\3\1\uffff\3\3\1\uffff\1\3\5\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\2\uffff\2\3",
            "\1\5\13\uffff\1\5\13\uffff\1\13\31\uffff\1\5\3\uffff\1\5\3"+
            "\uffff\1\5\3\uffff\1\5\47\uffff\1\5",
            "\1\5\2\uffff\1\5\2\uffff\1\11\3\5\1\uffff\1\14\2\5\1\uffff"+
            "\2\5\1\uffff\1\5\3\uffff\1\5\1\uffff\1\5\1\uffff\3\5\51\uffff"+
            "\1\5",
            "\1\5\13\uffff\1\5\13\uffff\1\15\27\uffff\1\5\1\uffff\1\5\3"+
            "\uffff\1\5\3\uffff\1\5\3\uffff\1\5\25\uffff\1\3\2\uffff\1\3"+
            "\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\5"+
            "\6\uffff\1\3\1\uffff\1\3\2\uffff\1\3",
            "\1\3\30\uffff\1\5\2\uffff\1\5\2\uffff\1\5\1\16\2\5\1\uffff"+
            "\3\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\3\5\51\uffff\1\5",
            "\1\5\13\uffff\1\5\13\uffff\1\17\31\uffff\1\5\3\uffff\1\5\3"+
            "\uffff\1\5\3\uffff\1\5\47\uffff\1\5",
            "\1\5\2\uffff\1\5\2\uffff\1\11\3\5\1\uffff\1\14\2\5\1\uffff"+
            "\2\5\1\uffff\1\5\3\uffff\1\5\1\uffff\1\5\1\uffff\3\5\51\uffff"+
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
            return "()+ loopback of 74:4: ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )+";
        }
    }
    static final String DFA33_eotS =
        "\22\uffff";
    static final String DFA33_eofS =
        "\22\uffff";
    static final String DFA33_minS =
        "\1\36\1\uffff\3\36\2\uffff\1\74\1\uffff\1\6\1\36\1\102\1\6\1\67"+
        "\1\6\1\36\1\6\1\67";
    static final String DFA33_maxS =
        "\1\177\1\uffff\2\76\1\177\2\uffff\1\120\1\uffff\1\170\1\175\1\174"+
        "\1\154\1\175\1\170\1\175\1\154\1\175";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\4\1\uffff\1\2\11\uffff";
    static final String DFA33_specialS =
        "\22\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\1\uffff\1\1\71\uffff\1\2\2\uffff\1\2\6\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\1\1\2\2\uffff\1"+
            "\1\1\4\1\5\4\uffff\1\6",
            "",
            "\1\7\37\uffff\1\1",
            "\1\1\35\uffff\1\10\1\uffff\1\1",
            "\1\10\73\uffff\1\5\2\uffff\1\5\6\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\10\uffff\1\5\1\uffff\1\5\4\uffff\1\5\4\uffff"+
            "\1\6",
            "",
            "",
            "\1\11\5\uffff\1\1\10\uffff\2\1\3\uffff\1\1",
            "",
            "\1\1\13\uffff\1\1\13\uffff\1\12\27\uffff\1\1\1\uffff\1\1\3"+
            "\uffff\1\1\1\13\2\uffff\1\1\3\uffff\1\1\25\uffff\1\5\2\uffff"+
            "\1\5\6\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\1\6\uffff\1\5\1\uffff\1\5\2\uffff\1\5",
            "\1\5\30\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\14\2\1\1\uffff"+
            "\3\1\1\uffff\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\3\1\51\uffff\1\1",
            "\1\1\11\uffff\1\1\22\uffff\1\5\34\uffff\1\5",
            "\1\1\13\uffff\1\1\13\uffff\1\15\31\uffff\1\1\3\uffff\1\1\3"+
            "\uffff\1\1\3\uffff\1\1\47\uffff\1\1",
            "\1\1\2\uffff\1\1\2\uffff\1\13\3\1\1\uffff\1\16\2\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\3\1\51\uffff"+
            "\1\1",
            "\1\1\13\uffff\1\1\13\uffff\1\17\27\uffff\1\1\1\uffff\1\1\3"+
            "\uffff\1\1\3\uffff\1\1\3\uffff\1\1\25\uffff\1\5\2\uffff\1\5"+
            "\6\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\1"+
            "\6\uffff\1\5\1\uffff\1\5\2\uffff\1\5",
            "\1\5\30\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\20\2\1\1\uffff"+
            "\3\1\1\uffff\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\3\1\51\uffff\1\1",
            "\1\1\13\uffff\1\1\13\uffff\1\21\31\uffff\1\1\3\uffff\1\1\3"+
            "\uffff\1\1\3\uffff\1\1\47\uffff\1\1",
            "\1\1\2\uffff\1\1\2\uffff\1\13\3\1\1\uffff\1\16\2\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\3\1\51\uffff"+
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
            return "425:2: ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) )";
        }
    }
 

    public static final BitSet FOLLOW_top_level_in_start328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compilation_unit_in_top_level382 = new BitSet(new long[]{0x0000000140000200L,0x0528055024000000L});
    public static final BitSet FOLLOW_top_level_component_in_top_level384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_top_level_component431 = new BitSet(new long[]{0x0000000140000202L,0x0528055024000000L});
    public static final BitSet FOLLOW_class_definition_in_top_level_component445 = new BitSet(new long[]{0x0000000140000202L,0x0528055024000000L});
    public static final BitSet FOLLOW_declaration_in_top_level_component459 = new BitSet(new long[]{0x0000000140000202L,0x0528055024000000L});
    public static final BitSet FOLLOW_include_in_compilation_unit512 = new BitSet(new long[]{0x0200000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_name_space_in_compilation_unit528 = new BitSet(new long[]{0x0200000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_57_in_include574 = new BitSet(new long[]{0x0100000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_lib_in_include581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_header_in_include595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_lib637 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFE7FFFFFL});
    public static final BitSet FOLLOW_82_in_lib655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_header687 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFE7FFFFFL});
    public static final BitSet FOLLOW_56_in_header705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_name_space737 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_name_space739 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_name_space743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_name_space746 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_name_space748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_76_in_name_space769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_type_in_function_definition807 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_function_definition809 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_function_definition811 = new BitSet(new long[]{0x2000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_parameters_in_function_definition813 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function_definition816 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_function_definition818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_parameters874 = new BitSet(new long[]{0x0000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_parameter_in_parameters878 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter913 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_parameter915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_body966 = new BitSet(new long[]{0x00000001C4000000L,0x496905DD64000000L});
    public static final BitSet FOLLOW_statements_in_body968 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_body970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_body989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements1031 = new BitSet(new long[]{0x00000001C4000002L,0x096905DD64000000L});
    public static final BitSet FOLLOW_declaration_in_statement1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_statement1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_member_access_in_statement1121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_statement1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_structure_in_statement1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_output_in_statement1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_input_in_statement1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_statement1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment1258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010022L});
    public static final BitSet FOLLOW_set_in_assignment1261 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_assignment1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_delete_statement1308 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_delete_statement1310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_delete_statement1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_return_statement1358 = new BitSet(new long[]{0x1140000040040040L,0x0000100000001011L});
    public static final BitSet FOLLOW_expression_in_return_statement1360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_return_statement1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_control_structure1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_in_control_structure1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_in_control_structure1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_loop_in_control_structure1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switch_statement_in_control_structure1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1514 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_if_statement1516 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_if_statement1518 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_if_statement1520 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_if_statement1522 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_else_statement_in_if_statement1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_statement1578 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_else_statement1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop1624 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_for_loop1626 = new BitSet(new long[]{0x0000000000000000L,0x0000000082000000L});
    public static final BitSet FOLLOW_95_in_for_loop1628 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_loop1631 = new BitSet(new long[]{0x0800000040000000L});
    public static final BitSet FOLLOW_59_in_for_loop1633 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_for_loop1636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_for_loop1638 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_for_loop1640 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_for_loop1642 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_for_loop1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_while_loop1706 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_while_loop1708 = new BitSet(new long[]{0x1140000040040040L,0x0000108040000011L});
    public static final BitSet FOLLOW_while_exp_in_while_loop1710 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_while_loop1712 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_while_loop1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_while_exp1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_file_input_in_while_exp1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_do_while_loop1821 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_do_while_loop1823 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_do_while_loop1825 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_do_while_loop1827 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_do_while_loop1829 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_do_while_loop1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_do_while_loop1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_switch_statement1887 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_switch_statement1889 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_switch_statement1891 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_switch_statement1893 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_switch_statement1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_switch_case_in_switch_statement1897 = new BitSet(new long[]{0x0000000000000000L,0x4000000210000000L});
    public static final BitSet FOLLOW_default_case_in_switch_statement1900 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_switch_statement1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_switch_case1961 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_switch_case1963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_switch_case1965 = new BitSet(new long[]{0x00000001C4000000L,0x096905DD6C000000L});
    public static final BitSet FOLLOW_statements_in_switch_case1967 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_break_statement_in_switch_case1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_default_case2021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_default_case2023 = new BitSet(new long[]{0x00000001C4000000L,0x096905DD64000000L});
    public static final BitSet FOLLOW_statements_in_default_case2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_break_statement2071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_break_statement2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_type_in_type2124 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_vector_type_in_type2138 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ID_in_type2152 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_type2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_type_in_return_type2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_return_type2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_vector_type2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_vector_type2321 = new BitSet(new long[]{0x0000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_type_in_vector_type2323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_vector_type2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_declaration2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_file_declaration_in_declaration2379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_declaration2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable_declaration2424 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_variables_in_variable_declaration2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_variables2458 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_variables2463 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_declarator_in_variables2467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_qualified_id_in_declarator2501 = new BitSet(new long[]{0x1000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_declarator2509 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_declarator2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_declarator2531 = new BitSet(new long[]{0x3140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_arguments_in_declarator2533 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_declarator2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qualified_id2593 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_qualified_id2597 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_qualified_id2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFSTREAM_in_file_declaration2665 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_file_declaration2668 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_file_declaration2670 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_string_literal_in_file_declaration2672 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_file_declaration2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arguments2706 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_arguments2710 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_arguments2714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_in_class_definition2754 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_class_definition2756 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000400L});
    public static final BitSet FOLLOW_74_in_class_definition2759 = new BitSet(new long[]{0x0000000000000000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_class_visibility_in_class_definition2761 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_class_definition2763 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_class_definition2767 = new BitSet(new long[]{0x0000000140000000L,0xC738E55024000000L});
    public static final BitSet FOLLOW_class_members_in_class_definition2769 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_class_definition2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_class_definition2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_member_in_class_members2834 = new BitSet(new long[]{0x0000000140000002L,0x8738E55024000000L});
    public static final BitSet FOLLOW_class_visibility_in_class_member2881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_class_member2883 = new BitSet(new long[]{0x0000000140000000L,0x8738055024000000L});
    public static final BitSet FOLLOW_class_declaration_in_class_member2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_class_member2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_function_definition_in_class_member2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destructor_in_class_member2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_class_declaration2976 = new BitSet(new long[]{0x0000000140000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_declaration_in_class_declaration2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_constructor3053 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_constructor3056 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_constructor3058 = new BitSet(new long[]{0x2000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_parameters_in_constructor3060 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_constructor3063 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000400L});
    public static final BitSet FOLLOW_74_in_constructor3067 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_member_init_list_in_constructor3069 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_class_function_body_in_constructor3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_destructor3143 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_destructor3146 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_destructor3148 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_destructor3150 = new BitSet(new long[]{0x2000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_parameters_in_destructor3152 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_destructor3155 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000400L});
    public static final BitSet FOLLOW_74_in_destructor3159 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_member_init_list_in_destructor3161 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_class_function_body_in_destructor3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_member_init_list3236 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_member_init_list3241 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_function_call_in_member_init_list3245 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_121_in_class_function_definition3280 = new BitSet(new long[]{0x0000000000000000L,0x0428055024000000L});
    public static final BitSet FOLLOW_return_type_in_class_function_definition3283 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_class_function_definition3285 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_class_function_definition3287 = new BitSet(new long[]{0x2000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_parameters_in_class_function_definition3289 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_class_function_definition3292 = new BitSet(new long[]{0x0000000000000000L,0x1000000080000000L});
    public static final BitSet FOLLOW_95_in_class_function_definition3294 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_class_function_body_in_class_function_definition3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_class_function_body3360 = new BitSet(new long[]{0x00000001C4000000L,0x496905DD64000000L});
    public static final BitSet FOLLOW_statements_in_class_function_body3362 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_class_function_body3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_exp_in_expression3413 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_expression3417 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_and_exp_in_expression3421 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_equality_exp_in_and_exp3454 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_and_exp3458 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_equality_exp_in_and_exp3462 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_relational_exp_in_equality_exp3496 = new BitSet(new long[]{0x0080000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_set_in_equality_exp3499 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_relational_exp_in_equality_exp3508 = new BitSet(new long[]{0x0080000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_unary_exp_in_relational_exp3542 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CA000L});
    public static final BitSet FOLLOW_set_in_relational_exp3545 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_unary_exp_in_relational_exp3562 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CA000L});
    public static final BitSet FOLLOW_arithmetic_expression_in_unary_exp3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_unary_exp3615 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_unary_exp_in_unary_exp3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arithmetic_expression3660 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_arithmetic_expression3663 = new BitSet(new long[]{0x1100000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_term_in_arithmetic_expression3672 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_term3709 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_term3712 = new BitSet(new long[]{0x1100000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_factor_in_term3721 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_60_in_factor3758 = new BitSet(new long[]{0x1100000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_arithmetic_expression_in_factor3760 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_factor3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_change_in_factor3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_true_false_in_factor3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_factor3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_factor3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_decleration_in_factor3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_member_access_in_factor3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_true_false3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_access_in_member_access3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_access_in_member_access3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_access3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_function_access4000 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_function_access4002 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_function_access4007 = new BitSet(new long[]{0x3140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_arguments_in_function_access4009 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function_access4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pointer_access4047 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_pointer_access4049 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_pointer_access4057 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_pointer_access4060 = new BitSet(new long[]{0x3140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_arguments_in_pointer_access4062 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_pointer_access4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_call4100 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_function_call4102 = new BitSet(new long[]{0x3140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_arguments_in_function_call4104 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function_call4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_object_decleration4154 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_function_call_in_object_decleration4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change4189 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_change4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_change4201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_set_in_change4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_integer_literal4248 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DIGIT_in_float_literal4281 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_float_literal4284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DIGIT_in_float_literal4286 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_56_in_string_literal4319 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_56_in_string_literal4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_character_literal4359 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFBFFFFFL});
    public static final BitSet FOLLOW_85_in_character_literal4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_output4411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_78_in_output4420 = new BitSet(new long[]{0x1140000040040040L,0x0026122000000011L});
    public static final BitSet FOLLOW_expression_in_output4423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_101_in_output4427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_manipulators_in_output4431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_76_in_output4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_manipulators4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_manipulators4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_manipulators4500 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_manipulators4502 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_manipulators4504 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_manipulators4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_manipulators4528 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_manipulators4530 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_manipulators4532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_manipulators4534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_character_literal_in_manipulators4536 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_manipulators4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_input4594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_input4597 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_input4599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000101000L});
    public static final BitSet FOLLOW_76_in_input4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_input4607 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_input4609 = new BitSet(new long[]{0x0000000040000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stream_in_input4611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_input4613 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_input4615 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_input4618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_character_literal_in_input4620 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_input4624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_input4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_input4632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_input4634 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_input4636 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_input4638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_input4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_file_input4672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_file_input4675 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_file_input4677 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_103_in_file_input4683 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_file_input4685 = new BitSet(new long[]{0x0000000040000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stream_in_file_input4687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_file_input4689 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_file_input4691 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_file_input4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_file_input4699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_file_input4701 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_file_input4703 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_file_input4705 = new BitSet(new long[]{0x0000000000000002L});

}