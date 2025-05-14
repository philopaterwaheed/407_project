// $ANTLR 3.4 /home/philosan/Dev/antlr/407_project/Bank.g 2025-05-14 15:34:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class BankParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arithmetic_Expression", "Assign", "BOOLEAN", "Body", "Break", "CLASS", "COMMENT", "Call", "Class", "Class_Member", "Class_Members", "Compilation_Unit", "Constructor", "Control_Structure", "DIGIT", "Declaration", "Default_Case", "Delete", "Destructor", "Do_While", "ELSE", "Else", "FOR", "Factor", "For", "Function", "ID", "IF", "IFSTREAM", "If", "Include", "Manipulator", "Member_Access", "NameSpace", "Not", "Parameter", "Qualified", "Return", "Return_Type", "Start", "Statement", "Statements", "Switch", "Switch_Case", "Top_Level", "Top_Level_Component", "Type", "WS", "While", "While_EXP", "'!'", "'!='", "'\"'", "'#include'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'.'", "'.ignore'", "'/'", "':'", "'::'", "';'", "'<'", "'<<'", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'\\''", "'\\\\'", "'\\n'", "'\\r'", "'auto'", "'bool'", "'break'", "'case'", "'char'", "'cin'", "'const'", "'cout'", "'default'", "'delete'", "'do'", "'double'", "'endl'", "'float'", "'getline'", "'int'", "'left'", "'long'", "'namespace'", "'new'", "'private'", "'protected'", "'public'", "'return'", "'right'", "'setw'", "'short'", "'static'", "'string'", "'switch'", "'using'", "'vector'", "'virtual'", "'void'", "'while'", "'{'", "'||'", "'}'", "'~'"
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
    public static final int Compilation_Unit=15;
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
    public String getGrammarFileName() { return "/home/philosan/Dev/antlr/407_project/Bank.g"; }


        String s="";


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/philosan/Dev/antlr/407_project/Bank.g:55:1: start : top_level -> ^( Start top_level ) ;
    public final BankParser.start_return start() throws RecognitionException {
        BankParser.start_return retval = new BankParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.top_level_return top_level1 =null;


        RewriteRuleSubtreeStream stream_top_level=new RewriteRuleSubtreeStream(adaptor,"rule top_level");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:56:5: ( top_level -> ^( Start top_level ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:56:7: top_level
            {
            pushFollow(FOLLOW_top_level_in_start328);
            top_level1=top_level();

            state._fsp--;

            stream_top_level.add(top_level1.getTree());

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
            // 56:17: -> ^( Start top_level )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:56:20: ^( Start top_level )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class top_level_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "top_level"
    // /home/philosan/Dev/antlr/407_project/Bank.g:59:1: top_level : compilation_unit top_level_component -> ^( Top_Level compilation_unit top_level_component ) ;
    public final BankParser.top_level_return top_level() throws RecognitionException {
        BankParser.top_level_return retval = new BankParser.top_level_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.compilation_unit_return compilation_unit2 =null;

        BankParser.top_level_component_return top_level_component3 =null;


        RewriteRuleSubtreeStream stream_compilation_unit=new RewriteRuleSubtreeStream(adaptor,"rule compilation_unit");
        RewriteRuleSubtreeStream stream_top_level_component=new RewriteRuleSubtreeStream(adaptor,"rule top_level_component");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:60:5: ( compilation_unit top_level_component -> ^( Top_Level compilation_unit top_level_component ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:60:7: compilation_unit top_level_component
            {
            pushFollow(FOLLOW_compilation_unit_in_top_level353);
            compilation_unit2=compilation_unit();

            state._fsp--;

            stream_compilation_unit.add(compilation_unit2.getTree());

            pushFollow(FOLLOW_top_level_component_in_top_level355);
            top_level_component3=top_level_component();

            state._fsp--;

            stream_top_level_component.add(top_level_component3.getTree());

            // AST REWRITE
            // elements: top_level_component, compilation_unit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:44: -> ^( Top_Level compilation_unit top_level_component )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:60:47: ^( Top_Level compilation_unit top_level_component )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:63:1: top_level_component : ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )+ ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:64:5: ( ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )+ )
            // /home/philosan/Dev/antlr/407_project/Bank.g:64:7: ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )+
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:64:7: ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:64:8: function_definition
            	    {
            	    pushFollow(FOLLOW_function_definition_in_top_level_component383);
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
            	    // 64:28: -> ^( Top_Level_Component function_definition )
            	    {
            	        // /home/philosan/Dev/antlr/407_project/Bank.g:64:31: ^( Top_Level_Component function_definition )
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
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:65:7: class_definition
            	    {
            	    pushFollow(FOLLOW_class_definition_in_top_level_component399);
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
            	    // 65:24: -> ^( Top_Level_Component class_definition )
            	    {
            	        // /home/philosan/Dev/antlr/407_project/Bank.g:65:27: ^( Top_Level_Component class_definition )
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
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:66:7: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_top_level_component415);
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
            	    // 66:19: -> ^( Top_Level_Component declaration )
            	    {
            	        // /home/philosan/Dev/antlr/407_project/Bank.g:66:22: ^( Top_Level_Component declaration )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:72:1: compilation_unit : ( ( include ) -> ^( Compilation_Unit include ) | ( name_space ) -> ^( Compilation_Unit name_space ) )* ;
    public final BankParser.compilation_unit_return compilation_unit() throws RecognitionException {
        BankParser.compilation_unit_return retval = new BankParser.compilation_unit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.include_return include7 =null;

        BankParser.name_space_return name_space8 =null;


        RewriteRuleSubtreeStream stream_include=new RewriteRuleSubtreeStream(adaptor,"rule include");
        RewriteRuleSubtreeStream stream_name_space=new RewriteRuleSubtreeStream(adaptor,"rule name_space");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:73:5: ( ( ( include ) -> ^( Compilation_Unit include ) | ( name_space ) -> ^( Compilation_Unit name_space ) )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:73:7: ( ( include ) -> ^( Compilation_Unit include ) | ( name_space ) -> ^( Compilation_Unit name_space ) )*
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:73:7: ( ( include ) -> ^( Compilation_Unit include ) | ( name_space ) -> ^( Compilation_Unit name_space ) )*
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
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:73:8: ( include )
            	    {
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:73:8: ( include )
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:73:9: include
            	    {
            	    pushFollow(FOLLOW_include_in_compilation_unit451);
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
            	    // 73:18: -> ^( Compilation_Unit include )
            	    {
            	        // /home/philosan/Dev/antlr/407_project/Bank.g:73:21: ^( Compilation_Unit include )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(Compilation_Unit, "Compilation_Unit")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_include.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;
            	case 2 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:74:7: ( name_space )
            	    {
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:74:7: ( name_space )
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:74:8: name_space
            	    {
            	    pushFollow(FOLLOW_name_space_in_compilation_unit469);
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
            	    // 74:20: -> ^( Compilation_Unit name_space )
            	    {
            	        // /home/philosan/Dev/antlr/407_project/Bank.g:74:23: ^( Compilation_Unit name_space )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(Compilation_Unit, "Compilation_Unit")
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:77:1: include : '#include' ( lib -> ^( Include lib ) | header -> ^( Include header ) ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:78:5: ( '#include' ( lib -> ^( Include lib ) | header -> ^( Include header ) ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:78:7: '#include' ( lib -> ^( Include lib ) | header -> ^( Include header ) )
            {
            string_literal9=(Token)match(input,57,FOLLOW_57_in_include497);  
            stream_57.add(string_literal9);


            // /home/philosan/Dev/antlr/407_project/Bank.g:78:18: ( lib -> ^( Include lib ) | header -> ^( Include header ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:79:7: lib
                    {
                    pushFollow(FOLLOW_lib_in_include507);
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
                    // 79:11: -> ^( Include lib )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:79:14: ^( Include lib )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:80:7: header
                    {
                    pushFollow(FOLLOW_header_in_include523);
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
                    // 80:14: -> ^( Include header )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:80:17: ^( Include header )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:84:1: lib : '<' (~ ( '\\r' | '\\n' | '>' ) )* '>' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:84:5: ( '<' (~ ( '\\r' | '\\n' | '>' ) )* '>' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:84:7: '<' (~ ( '\\r' | '\\n' | '>' ) )* '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal12=(Token)match(input,77,FOLLOW_77_in_lib550); 
            char_literal12_tree = 
            (Object)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:84:11: (~ ( '\\r' | '\\n' | '>' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= Arithmetic_Expression && LA4_0 <= 81)||(LA4_0 >= 83 && LA4_0 <= 86)||(LA4_0 >= 89 && LA4_0 <= 127)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:
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


            char_literal14=(Token)match(input,82,FOLLOW_82_in_lib568); 
            char_literal14_tree = 
            (Object)adaptor.create(char_literal14)
            ;
            adaptor.addChild(root_0, char_literal14_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:86:1: header : '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:86:8: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:86:10: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
            {
            root_0 = (Object)adaptor.nil();


            char_literal15=(Token)match(input,56,FOLLOW_56_in_header577); 
            char_literal15_tree = 
            (Object)adaptor.create(char_literal15)
            ;
            adaptor.addChild(root_0, char_literal15_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:86:14: (~ ( '\\r' | '\\n' | '\"' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= Arithmetic_Expression && LA5_0 <= 55)||(LA5_0 >= 57 && LA5_0 <= 86)||(LA5_0 >= 89 && LA5_0 <= 127)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:
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


            char_literal17=(Token)match(input,56,FOLLOW_56_in_header595); 
            char_literal17_tree = 
            (Object)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:88:1: name_space : 'using' 'namespace' ( ( ID ( '::' ID )* ) -> ^( NameSpace ID ( '::' ID )* ) ) ';' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:89:5: ( 'using' 'namespace' ( ( ID ( '::' ID )* ) -> ^( NameSpace ID ( '::' ID )* ) ) ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:89:7: 'using' 'namespace' ( ( ID ( '::' ID )* ) -> ^( NameSpace ID ( '::' ID )* ) ) ';'
            {
            string_literal18=(Token)match(input,119,FOLLOW_119_in_name_space608);  
            stream_119.add(string_literal18);


            string_literal19=(Token)match(input,107,FOLLOW_107_in_name_space610);  
            stream_107.add(string_literal19);


            // /home/philosan/Dev/antlr/407_project/Bank.g:89:27: ( ( ID ( '::' ID )* ) -> ^( NameSpace ID ( '::' ID )* ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:89:28: ( ID ( '::' ID )* )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:89:28: ( ID ( '::' ID )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:89:29: ID ( '::' ID )*
            {
            ID20=(Token)match(input,ID,FOLLOW_ID_in_name_space614);  
            stream_ID.add(ID20);


            // /home/philosan/Dev/antlr/407_project/Bank.g:89:32: ( '::' ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==75) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:89:33: '::' ID
            	    {
            	    string_literal21=(Token)match(input,75,FOLLOW_75_in_name_space617);  
            	    stream_75.add(string_literal21);


            	    ID22=(Token)match(input,ID,FOLLOW_ID_in_name_space619);  
            	    stream_ID.add(ID22);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
            // 89:44: -> ^( NameSpace ID ( '::' ID )* )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:89:47: ^( NameSpace ID ( '::' ID )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NameSpace, "NameSpace")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:89:62: ( '::' ID )*
                while ( stream_75.hasNext()||stream_ID.hasNext() ) {
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


            char_literal23=(Token)match(input,76,FOLLOW_76_in_name_space640);  
            stream_76.add(char_literal23);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:94:1: function_definition : return_type ID '(' ( parameters )? ')' body -> ^( Function return_type ID '(' ( parameters )? ')' body ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:95:5: ( return_type ID '(' ( parameters )? ')' body -> ^( Function return_type ID '(' ( parameters )? ')' body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:95:7: return_type ID '(' ( parameters )? ')' body
            {
            pushFollow(FOLLOW_return_type_in_function_definition659);
            return_type24=return_type();

            state._fsp--;

            stream_return_type.add(return_type24.getTree());

            ID25=(Token)match(input,ID,FOLLOW_ID_in_function_definition661);  
            stream_ID.add(ID25);


            char_literal26=(Token)match(input,60,FOLLOW_60_in_function_definition663);  
            stream_60.add(char_literal26);


            // /home/philosan/Dev/antlr/407_project/Bank.g:95:26: ( parameters )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||LA7_0==90||LA7_0==93||LA7_0==100||LA7_0==102||LA7_0==104||LA7_0==106||LA7_0==115||LA7_0==117||LA7_0==120) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:95:26: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_function_definition665);
                    parameters27=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters27.getTree());

                    }
                    break;

            }


            char_literal28=(Token)match(input,61,FOLLOW_61_in_function_definition668);  
            stream_61.add(char_literal28);


            pushFollow(FOLLOW_body_in_function_definition670);
            body29=body();

            state._fsp--;

            stream_body.add(body29.getTree());

            // AST REWRITE
            // elements: ID, 61, 60, return_type, body, parameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 95:47: -> ^( Function return_type ID '(' ( parameters )? ')' body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:95:50: ^( Function return_type ID '(' ( parameters )? ')' body )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:95:80: ( parameters )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:98:1: parameters : parameter ( ',' parameter )* ;
    public final BankParser.parameters_return parameters() throws RecognitionException {
        BankParser.parameters_return retval = new BankParser.parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal31=null;
        BankParser.parameter_return parameter30 =null;

        BankParser.parameter_return parameter32 =null;


        Object char_literal31_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:99:5: ( parameter ( ',' parameter )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:99:7: parameter ( ',' parameter )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_parameter_in_parameters706);
            parameter30=parameter();

            state._fsp--;

            adaptor.addChild(root_0, parameter30.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:99:17: ( ',' parameter )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==66) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:99:18: ',' parameter
            	    {
            	    char_literal31=(Token)match(input,66,FOLLOW_66_in_parameters709); 
            	    char_literal31_tree = 
            	    (Object)adaptor.create(char_literal31)
            	    ;
            	    adaptor.addChild(root_0, char_literal31_tree);


            	    pushFollow(FOLLOW_parameter_in_parameters711);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:102:1: parameter : type ID -> ^( Parameter type ID ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:103:5: ( type ID -> ^( Parameter type ID ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:103:7: type ID
            {
            pushFollow(FOLLOW_type_in_parameter730);
            type33=type();

            state._fsp--;

            stream_type.add(type33.getTree());

            ID34=(Token)match(input,ID,FOLLOW_ID_in_parameter732);  
            stream_ID.add(ID34);


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
            // 103:15: -> ^( Parameter type ID )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:103:18: ^( Parameter type ID )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:108:1: body : ( '{' statements '}' -> ^( Body '{' statements '}' ) | statement -> ^( Body statement ) );
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:109:5: ( '{' statements '}' -> ^( Body '{' statements '}' ) | statement -> ^( Body statement ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:109:7: '{' statements '}'
                    {
                    char_literal35=(Token)match(input,124,FOLLOW_124_in_body761);  
                    stream_124.add(char_literal35);


                    pushFollow(FOLLOW_statements_in_body763);
                    statements36=statements();

                    state._fsp--;

                    stream_statements.add(statements36.getTree());

                    char_literal37=(Token)match(input,126,FOLLOW_126_in_body765);  
                    stream_126.add(char_literal37);


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
                    // 109:26: -> ^( Body '{' statements '}' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:109:29: ^( Body '{' statements '}' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:110:7: statement
                    {
                    pushFollow(FOLLOW_statement_in_body785);
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
                    // 110:17: -> ^( Body statement )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:110:20: ^( Body statement )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:113:1: statements : ( statement )* -> ^( Statements ( statement )* ) ;
    public final BankParser.statements_return statements() throws RecognitionException {
        BankParser.statements_return retval = new BankParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.statement_return statement39 =null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:114:5: ( ( statement )* -> ^( Statements ( statement )* ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:114:7: ( statement )*
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:114:7: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==FOR||(LA10_0 >= ID && LA10_0 <= IFSTREAM)||LA10_0==90||(LA10_0 >= 93 && LA10_0 <= 94)||LA10_0==96||(LA10_0 >= 98 && LA10_0 <= 100)||(LA10_0 >= 102 && LA10_0 <= 104)||LA10_0==106||LA10_0==112||LA10_0==115||(LA10_0 >= 117 && LA10_0 <= 118)||LA10_0==120||LA10_0==123) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:114:8: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements811);
            	    statement39=statement();

            	    state._fsp--;

            	    stream_statement.add(statement39.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
            // 114:20: -> ^( Statements ( statement )* )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:114:23: ^( Statements ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Statements, "Statements")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:114:36: ( statement )*
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:117:1: statement : ( declaration -> ^( Statement declaration ) | assignment ';' -> ^( Statement assignment ';' ) | member_access ';' -> ^( Statement member_access ';' ) | control_structure -> ^( Statement control_structure ) | return_statement -> ^( Statement return_statement ) | output -> ^( Statement output ) | input -> ^( Statement input ) | delete_statement -> ^( Statement delete_statement ) );
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:118:5: ( declaration -> ^( Statement declaration ) | assignment ';' -> ^( Statement assignment ';' ) | member_access ';' -> ^( Statement member_access ';' ) | control_structure -> ^( Statement control_structure ) | return_statement -> ^( Statement return_statement ) | output -> ^( Statement output ) | input -> ^( Statement input ) | delete_statement -> ^( Statement delete_statement ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:118:7: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement841);
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
                    // 118:19: -> ^( Statement declaration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:118:22: ^( Statement declaration )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:119:7: assignment ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement857);
                    assignment41=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment41.getTree());

                    char_literal42=(Token)match(input,76,FOLLOW_76_in_statement859);  
                    stream_76.add(char_literal42);


                    // AST REWRITE
                    // elements: assignment, 76
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:22: -> ^( Statement assignment ';' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:119:25: ^( Statement assignment ';' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:120:7: member_access ';'
                    {
                    pushFollow(FOLLOW_member_access_in_statement877);
                    member_access43=member_access();

                    state._fsp--;

                    stream_member_access.add(member_access43.getTree());

                    char_literal44=(Token)match(input,76,FOLLOW_76_in_statement879);  
                    stream_76.add(char_literal44);


                    // AST REWRITE
                    // elements: member_access, 76
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:25: -> ^( Statement member_access ';' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:120:28: ^( Statement member_access ';' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:121:7: control_structure
                    {
                    pushFollow(FOLLOW_control_structure_in_statement897);
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
                    // 121:25: -> ^( Statement control_structure )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:121:28: ^( Statement control_structure )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:122:7: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_statement913);
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
                    // 122:24: -> ^( Statement return_statement )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:122:27: ^( Statement return_statement )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:123:7: output
                    {
                    pushFollow(FOLLOW_output_in_statement929);
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
                    // 123:14: -> ^( Statement output )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:123:17: ^( Statement output )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:124:7: input
                    {
                    pushFollow(FOLLOW_input_in_statement945);
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
                    // 124:13: -> ^( Statement input )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:124:16: ^( Statement input )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:125:7: delete_statement
                    {
                    pushFollow(FOLLOW_delete_statement_in_statement961);
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
                    // 125:24: -> ^( Statement delete_statement )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:125:27: ^( Statement delete_statement )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:128:1: assignment : ID ( '=' | '+=' | '-=' ) expression ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:129:5: ( ID ( '=' | '+=' | '-=' ) expression )
            // /home/philosan/Dev/antlr/407_project/Bank.g:129:7: ID ( '=' | '+=' | '-=' ) expression
            {
            root_0 = (Object)adaptor.nil();


            ID50=(Token)match(input,ID,FOLLOW_ID_in_assignment990); 
            ID50_tree = 
            (Object)adaptor.create(ID50)
            ;
            adaptor.addChild(root_0, ID50_tree);


            set51=(Token)input.LT(1);

            if ( input.LA(1)==65||input.LA(1)==69||input.LA(1)==80 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set51)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_expression_in_assignment1004);
            expression52=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression52.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:132:1: delete_statement : 'delete' expression ';' -> ^( Delete 'delete' expression ';' ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:133:5: ( 'delete' expression ';' -> ^( Delete 'delete' expression ';' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:133:7: 'delete' expression ';'
            {
            string_literal53=(Token)match(input,98,FOLLOW_98_in_delete_statement1021);  
            stream_98.add(string_literal53);


            pushFollow(FOLLOW_expression_in_delete_statement1023);
            expression54=expression();

            state._fsp--;

            stream_expression.add(expression54.getTree());

            char_literal55=(Token)match(input,76,FOLLOW_76_in_delete_statement1025);  
            stream_76.add(char_literal55);


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
            // 133:31: -> ^( Delete 'delete' expression ';' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:133:34: ^( Delete 'delete' expression ';' )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:136:1: return_statement : 'return' ( expression )? ';' -> ^( Return 'return' ( expression )? ';' ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:137:5: ( 'return' ( expression )? ';' -> ^( Return 'return' ( expression )? ';' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:137:7: 'return' ( expression )? ';'
            {
            string_literal56=(Token)match(input,112,FOLLOW_112_in_return_statement1054);  
            stream_112.add(string_literal56);


            // /home/philosan/Dev/antlr/407_project/Bank.g:137:16: ( expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BOOLEAN||LA12_0==DIGIT||LA12_0==ID||LA12_0==54||LA12_0==56||LA12_0==60||LA12_0==64||LA12_0==68||LA12_0==108) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:137:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement1056);
                    expression57=expression();

                    state._fsp--;

                    stream_expression.add(expression57.getTree());

                    }
                    break;

            }


            char_literal58=(Token)match(input,76,FOLLOW_76_in_return_statement1059);  
            stream_76.add(char_literal58);


            // AST REWRITE
            // elements: 76, expression, 112
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 137:32: -> ^( Return 'return' ( expression )? ';' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:137:35: ^( Return 'return' ( expression )? ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Return, "Return")
                , root_1);

                adaptor.addChild(root_1, 
                stream_112.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:137:53: ( expression )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:142:1: control_structure : ( if_statement -> ^( Control_Structure if_statement ) | for_loop -> ^( Control_Structure for_loop ) | while_loop -> ^( Control_Structure while_loop ) | do_while_loop -> ^( Control_Structure do_while_loop ) | switch_statement -> ^( Control_Structure switch_statement ) );
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:143:5: ( if_statement -> ^( Control_Structure if_statement ) | for_loop -> ^( Control_Structure for_loop ) | while_loop -> ^( Control_Structure while_loop ) | do_while_loop -> ^( Control_Structure do_while_loop ) | switch_statement -> ^( Control_Structure switch_statement ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:143:7: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_control_structure1091);
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
                    // 143:20: -> ^( Control_Structure if_statement )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:143:23: ^( Control_Structure if_statement )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:144:7: for_loop
                    {
                    pushFollow(FOLLOW_for_loop_in_control_structure1107);
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
                    // 144:16: -> ^( Control_Structure for_loop )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:144:19: ^( Control_Structure for_loop )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:145:7: while_loop
                    {
                    pushFollow(FOLLOW_while_loop_in_control_structure1123);
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
                    // 145:18: -> ^( Control_Structure while_loop )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:145:21: ^( Control_Structure while_loop )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:146:7: do_while_loop
                    {
                    pushFollow(FOLLOW_do_while_loop_in_control_structure1139);
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
                    // 146:21: -> ^( Control_Structure do_while_loop )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:146:24: ^( Control_Structure do_while_loop )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:147:7: switch_statement
                    {
                    pushFollow(FOLLOW_switch_statement_in_control_structure1155);
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
                    // 147:24: -> ^( Control_Structure switch_statement )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:147:27: ^( Control_Structure switch_statement )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:150:1: if_statement : IF '(' expression ')' body ( else_statement )? -> ^( If IF '(' expression ')' body ( else_statement )? ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:151:5: ( IF '(' expression ')' body ( else_statement )? -> ^( If IF '(' expression ')' body ( else_statement )? ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:151:7: IF '(' expression ')' body ( else_statement )?
            {
            IF64=(Token)match(input,IF,FOLLOW_IF_in_if_statement1180);  
            stream_IF.add(IF64);


            char_literal65=(Token)match(input,60,FOLLOW_60_in_if_statement1182);  
            stream_60.add(char_literal65);


            pushFollow(FOLLOW_expression_in_if_statement1184);
            expression66=expression();

            state._fsp--;

            stream_expression.add(expression66.getTree());

            char_literal67=(Token)match(input,61,FOLLOW_61_in_if_statement1186);  
            stream_61.add(char_literal67);


            pushFollow(FOLLOW_body_in_if_statement1188);
            body68=body();

            state._fsp--;

            stream_body.add(body68.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:151:34: ( else_statement )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:151:34: else_statement
                    {
                    pushFollow(FOLLOW_else_statement_in_if_statement1190);
                    else_statement69=else_statement();

                    state._fsp--;

                    stream_else_statement.add(else_statement69.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: else_statement, 61, expression, 60, body, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 151:50: -> ^( If IF '(' expression ')' body ( else_statement )? )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:151:53: ^( If IF '(' expression ')' body ( else_statement )? )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:151:85: ( else_statement )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:154:1: else_statement : ELSE body -> ^( Else ELSE body ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:155:5: ( ELSE body -> ^( Else ELSE body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:155:7: ELSE body
            {
            ELSE70=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_statement1227);  
            stream_ELSE.add(ELSE70);


            pushFollow(FOLLOW_body_in_else_statement1229);
            body71=body();

            state._fsp--;

            stream_body.add(body71.getTree());

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
            // 155:17: -> ^( Else ELSE body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:155:20: ^( Else ELSE body )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:158:1: for_loop : FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body -> ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:159:5: ( FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body -> ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:159:7: FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body
            {
            FOR72=(Token)match(input,FOR,FOLLOW_FOR_in_for_loop1256);  
            stream_FOR.add(FOR72);


            char_literal73=(Token)match(input,60,FOLLOW_60_in_for_loop1258);  
            stream_60.add(char_literal73);


            // /home/philosan/Dev/antlr/407_project/Bank.g:159:15: ( 'const' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==95) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:159:15: 'const'
                    {
                    string_literal74=(Token)match(input,95,FOLLOW_95_in_for_loop1260);  
                    stream_95.add(string_literal74);


                    }
                    break;

            }


            string_literal75=(Token)match(input,89,FOLLOW_89_in_for_loop1263);  
            stream_89.add(string_literal75);


            // /home/philosan/Dev/antlr/407_project/Bank.g:159:31: ( '&' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==59) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:159:31: '&'
                    {
                    char_literal76=(Token)match(input,59,FOLLOW_59_in_for_loop1265);  
                    stream_59.add(char_literal76);


                    }
                    break;

            }


            ID77=(Token)match(input,ID,FOLLOW_ID_in_for_loop1268);  
            stream_ID.add(ID77);


            char_literal78=(Token)match(input,74,FOLLOW_74_in_for_loop1270);  
            stream_74.add(char_literal78);


            pushFollow(FOLLOW_expression_in_for_loop1272);
            expression79=expression();

            state._fsp--;

            stream_expression.add(expression79.getTree());

            char_literal80=(Token)match(input,61,FOLLOW_61_in_for_loop1274);  
            stream_61.add(char_literal80);


            pushFollow(FOLLOW_body_in_for_loop1276);
            body81=body();

            state._fsp--;

            stream_body.add(body81.getTree());

            // AST REWRITE
            // elements: ID, expression, 89, body, 95, FOR, 59, 74, 60, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 159:63: -> ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:159:66: ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:159:80: ( 'const' )?
                if ( stream_95.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_95.nextNode()
                    );

                }
                stream_95.reset();

                adaptor.addChild(root_1, 
                stream_89.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:159:96: ( '&' )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:162:1: while_loop : 'while' '(' while_exp ')' body -> ^( While 'while' '(' while_exp ')' body ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:163:5: ( 'while' '(' while_exp ')' body -> ^( While 'while' '(' while_exp ')' body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:163:7: 'while' '(' while_exp ')' body
            {
            string_literal82=(Token)match(input,123,FOLLOW_123_in_while_loop1321);  
            stream_123.add(string_literal82);


            char_literal83=(Token)match(input,60,FOLLOW_60_in_while_loop1323);  
            stream_60.add(char_literal83);


            pushFollow(FOLLOW_while_exp_in_while_loop1325);
            while_exp84=while_exp();

            state._fsp--;

            stream_while_exp.add(while_exp84.getTree());

            char_literal85=(Token)match(input,61,FOLLOW_61_in_while_loop1327);  
            stream_61.add(char_literal85);


            pushFollow(FOLLOW_body_in_while_loop1329);
            body86=body();

            state._fsp--;

            stream_body.add(body86.getTree());

            // AST REWRITE
            // elements: 61, body, while_exp, 123, 60
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:38: -> ^( While 'while' '(' while_exp ')' body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:163:41: ^( While 'while' '(' while_exp ')' body )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:166:1: while_exp : ( expression -> ^( While_EXP expression ) | file_input -> ^( While_EXP file_input ) );
    public final BankParser.while_exp_return while_exp() throws RecognitionException {
        BankParser.while_exp_return retval = new BankParser.while_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.expression_return expression87 =null;

        BankParser.file_input_return file_input88 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_file_input=new RewriteRuleSubtreeStream(adaptor,"rule file_input");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:167:5: ( expression -> ^( While_EXP expression ) | file_input -> ^( While_EXP file_input ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:167:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_while_exp1364);
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
                    // 167:18: -> ^( While_EXP expression )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:167:21: ^( While_EXP expression )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:168:7: file_input
                    {
                    pushFollow(FOLLOW_file_input_in_while_exp1380);
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
                    // 168:18: -> ^( While_EXP file_input )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:168:21: ^( While_EXP file_input )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:171:1: do_while_loop : 'do' body 'while' '(' expression ')' ';' -> ^( Do_While 'do' body 'while' '(' expression ')' ';' ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:172:5: ( 'do' body 'while' '(' expression ')' ';' -> ^( Do_While 'do' body 'while' '(' expression ')' ';' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:172:7: 'do' body 'while' '(' expression ')' ';'
            {
            string_literal89=(Token)match(input,99,FOLLOW_99_in_do_while_loop1405);  
            stream_99.add(string_literal89);


            pushFollow(FOLLOW_body_in_do_while_loop1407);
            body90=body();

            state._fsp--;

            stream_body.add(body90.getTree());

            string_literal91=(Token)match(input,123,FOLLOW_123_in_do_while_loop1409);  
            stream_123.add(string_literal91);


            char_literal92=(Token)match(input,60,FOLLOW_60_in_do_while_loop1411);  
            stream_60.add(char_literal92);


            pushFollow(FOLLOW_expression_in_do_while_loop1413);
            expression93=expression();

            state._fsp--;

            stream_expression.add(expression93.getTree());

            char_literal94=(Token)match(input,61,FOLLOW_61_in_do_while_loop1415);  
            stream_61.add(char_literal94);


            char_literal95=(Token)match(input,76,FOLLOW_76_in_do_while_loop1417);  
            stream_76.add(char_literal95);


            // AST REWRITE
            // elements: 99, 60, expression, 61, body, 123, 76
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 172:48: -> ^( Do_While 'do' body 'while' '(' expression ')' ';' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:172:51: ^( Do_While 'do' body 'while' '(' expression ')' ';' )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:175:1: switch_statement : 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' -> ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:176:5: ( 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' -> ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:176:7: 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}'
            {
            string_literal96=(Token)match(input,118,FOLLOW_118_in_switch_statement1454);  
            stream_118.add(string_literal96);


            char_literal97=(Token)match(input,60,FOLLOW_60_in_switch_statement1456);  
            stream_60.add(char_literal97);


            pushFollow(FOLLOW_expression_in_switch_statement1458);
            expression98=expression();

            state._fsp--;

            stream_expression.add(expression98.getTree());

            char_literal99=(Token)match(input,61,FOLLOW_61_in_switch_statement1460);  
            stream_61.add(char_literal99);


            char_literal100=(Token)match(input,124,FOLLOW_124_in_switch_statement1462);  
            stream_124.add(char_literal100);


            // /home/philosan/Dev/antlr/407_project/Bank.g:176:39: ( switch_case )+
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
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:176:39: switch_case
            	    {
            	    pushFollow(FOLLOW_switch_case_in_switch_statement1464);
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


            // /home/philosan/Dev/antlr/407_project/Bank.g:176:52: ( default_case )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==97) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:176:52: default_case
                    {
                    pushFollow(FOLLOW_default_case_in_switch_statement1467);
                    default_case102=default_case();

                    state._fsp--;

                    stream_default_case.add(default_case102.getTree());

                    }
                    break;

            }


            char_literal103=(Token)match(input,126,FOLLOW_126_in_switch_statement1470);  
            stream_126.add(char_literal103);


            // AST REWRITE
            // elements: 60, expression, 61, 118, 126, default_case, 124, switch_case
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 176:70: -> ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:176:73: ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:176:127: ( default_case )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:179:1: switch_case : 'case' expression ':' statements ( break_statement )? -> ^( Switch_Case 'case' expression ':' statements ( break_statement )? ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:180:5: ( 'case' expression ':' statements ( break_statement )? -> ^( Switch_Case 'case' expression ':' statements ( break_statement )? ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:180:7: 'case' expression ':' statements ( break_statement )?
            {
            string_literal104=(Token)match(input,92,FOLLOW_92_in_switch_case1511);  
            stream_92.add(string_literal104);


            pushFollow(FOLLOW_expression_in_switch_case1513);
            expression105=expression();

            state._fsp--;

            stream_expression.add(expression105.getTree());

            char_literal106=(Token)match(input,74,FOLLOW_74_in_switch_case1515);  
            stream_74.add(char_literal106);


            pushFollow(FOLLOW_statements_in_switch_case1517);
            statements107=statements();

            state._fsp--;

            stream_statements.add(statements107.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:180:40: ( break_statement )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==91) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:180:40: break_statement
                    {
                    pushFollow(FOLLOW_break_statement_in_switch_case1519);
                    break_statement108=break_statement();

                    state._fsp--;

                    stream_break_statement.add(break_statement108.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: break_statement, expression, 92, statements, 74
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 180:57: -> ^( Switch_Case 'case' expression ':' statements ( break_statement )? )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:180:60: ^( Switch_Case 'case' expression ':' statements ( break_statement )? )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:180:107: ( break_statement )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:183:1: default_case : 'default' ':' statements -> ^( Default_Case 'default' ':' statements ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:184:5: ( 'default' ':' statements -> ^( Default_Case 'default' ':' statements ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:184:7: 'default' ':' statements
            {
            string_literal109=(Token)match(input,97,FOLLOW_97_in_default_case1554);  
            stream_97.add(string_literal109);


            char_literal110=(Token)match(input,74,FOLLOW_74_in_default_case1556);  
            stream_74.add(char_literal110);


            pushFollow(FOLLOW_statements_in_default_case1558);
            statements111=statements();

            state._fsp--;

            stream_statements.add(statements111.getTree());

            // AST REWRITE
            // elements: 74, statements, 97
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:32: -> ^( Default_Case 'default' ':' statements )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:184:35: ^( Default_Case 'default' ':' statements )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:187:1: break_statement : 'break' ';' -> ^( Break 'break' ';' ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:188:5: ( 'break' ';' -> ^( Break 'break' ';' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:188:7: 'break' ';'
            {
            string_literal112=(Token)match(input,91,FOLLOW_91_in_break_statement1587);  
            stream_91.add(string_literal112);


            char_literal113=(Token)match(input,76,FOLLOW_76_in_break_statement1589);  
            stream_76.add(char_literal113);


            // AST REWRITE
            // elements: 76, 91
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:19: -> ^( Break 'break' ';' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:188:22: ^( Break 'break' ';' )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:193:1: type : ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) ) ( '*' )? ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:194:5: ( ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) ) ( '*' )? )
            // /home/philosan/Dev/antlr/407_project/Bank.g:194:7: ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) ) ( '*' )?
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:194:7: ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:194:8: base_type
                    {
                    pushFollow(FOLLOW_base_type_in_type1619);
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
                    // 194:18: -> ^( Type base_type )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:194:21: ^( Type base_type )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:195:7: vector_type
                    {
                    pushFollow(FOLLOW_vector_type_in_type1635);
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
                    // 195:19: -> ^( Type vector_type )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:195:22: ^( Type vector_type )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:196:7: ID
                    {
                    ID116=(Token)match(input,ID,FOLLOW_ID_in_type1651);  
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
                    // 196:10: -> ^( Type ID )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:196:13: ^( Type ID )
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


            // /home/philosan/Dev/antlr/407_project/Bank.g:197:7: ( '*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:197:8: '*'
                    {
                    char_literal117=(Token)match(input,62,FOLLOW_62_in_type1668);  
                    stream_62.add(char_literal117);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:200:1: return_type : ( base_type -> ^( Return_Type base_type ) | 'void' -> ^( Return_Type 'void' ) );
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:201:5: ( base_type -> ^( Return_Type base_type ) | 'void' -> ^( Return_Type 'void' ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:201:7: base_type
                    {
                    pushFollow(FOLLOW_base_type_in_return_type1687);
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
                    // 201:17: -> ^( Return_Type base_type )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:201:20: ^( Return_Type base_type )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:202:7: 'void'
                    {
                    string_literal119=(Token)match(input,122,FOLLOW_122_in_return_type1703);  
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
                    // 202:14: -> ^( Return_Type 'void' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:202:17: ^( Return_Type 'void' )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:205:1: base_type : ( 'int' | 'double' | 'string' | 'bool' | 'char' | 'long' | 'short' | 'float' );
    public final BankParser.base_type_return base_type() throws RecognitionException {
        BankParser.base_type_return retval = new BankParser.base_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set120=null;

        Object set120_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:206:5: ( 'int' | 'double' | 'string' | 'bool' | 'char' | 'long' | 'short' | 'float' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:209:1: vector_type : 'vector' '<' type '>' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:210:5: ( 'vector' '<' type '>' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:210:7: 'vector' '<' type '>'
            {
            root_0 = (Object)adaptor.nil();


            string_literal121=(Token)match(input,120,FOLLOW_120_in_vector_type1773); 
            string_literal121_tree = 
            (Object)adaptor.create(string_literal121)
            ;
            adaptor.addChild(root_0, string_literal121_tree);


            char_literal122=(Token)match(input,77,FOLLOW_77_in_vector_type1775); 
            char_literal122_tree = 
            (Object)adaptor.create(char_literal122)
            ;
            adaptor.addChild(root_0, char_literal122_tree);


            pushFollow(FOLLOW_type_in_vector_type1777);
            type123=type();

            state._fsp--;

            adaptor.addChild(root_0, type123.getTree());

            char_literal124=(Token)match(input,82,FOLLOW_82_in_vector_type1779); 
            char_literal124_tree = 
            (Object)adaptor.create(char_literal124)
            ;
            adaptor.addChild(root_0, char_literal124_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:215:1: declaration : ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) ) ';' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:216:5: ( ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) ) ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:216:7: ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) ) ';'
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:216:7: ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:216:8: variable_declaration
                    {
                    pushFollow(FOLLOW_variable_declaration_in_declaration1799);
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
                    // 216:29: -> ^( Declaration variable_declaration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:216:32: ^( Declaration variable_declaration )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:217:7: file_declaration
                    {
                    pushFollow(FOLLOW_file_declaration_in_declaration1815);
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
                    // 217:24: -> ^( Declaration file_declaration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:217:27: ^( Declaration file_declaration )
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


            char_literal127=(Token)match(input,76,FOLLOW_76_in_declaration1831);  
            stream_76.add(char_literal127);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:221:1: variable_declaration : type variables ;
    public final BankParser.variable_declaration_return variable_declaration() throws RecognitionException {
        BankParser.variable_declaration_return retval = new BankParser.variable_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.type_return type128 =null;

        BankParser.variables_return variables129 =null;



        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:222:5: ( type variables )
            // /home/philosan/Dev/antlr/407_project/Bank.g:222:7: type variables
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_variable_declaration1848);
            type128=type();

            state._fsp--;

            adaptor.addChild(root_0, type128.getTree());

            pushFollow(FOLLOW_variables_in_variable_declaration1850);
            variables129=variables();

            state._fsp--;

            adaptor.addChild(root_0, variables129.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:225:1: variables : declarator ( ',' declarator )* ;
    public final BankParser.variables_return variables() throws RecognitionException {
        BankParser.variables_return retval = new BankParser.variables_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal131=null;
        BankParser.declarator_return declarator130 =null;

        BankParser.declarator_return declarator132 =null;


        Object char_literal131_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:226:5: ( declarator ( ',' declarator )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:226:7: declarator ( ',' declarator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declarator_in_variables1867);
            declarator130=declarator();

            state._fsp--;

            adaptor.addChild(root_0, declarator130.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:226:18: ( ',' declarator )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==66) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:226:19: ',' declarator
            	    {
            	    char_literal131=(Token)match(input,66,FOLLOW_66_in_variables1870); 
            	    char_literal131_tree = 
            	    (Object)adaptor.create(char_literal131)
            	    ;
            	    adaptor.addChild(root_0, char_literal131_tree);


            	    pushFollow(FOLLOW_declarator_in_variables1872);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:229:1: declarator : qualified_id ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )? ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:230:5: ( qualified_id ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )? )
            // /home/philosan/Dev/antlr/407_project/Bank.g:230:7: qualified_id ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )?
            {
            pushFollow(FOLLOW_qualified_id_in_declarator1891);
            qualified_id133=qualified_id();

            state._fsp--;

            stream_qualified_id.add(qualified_id133.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:231:5: ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )?
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:231:6: ( '=' expression )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:231:6: ( '=' expression )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:231:7: '=' expression
                    {
                    char_literal134=(Token)match(input,80,FOLLOW_80_in_declarator1899);  
                    stream_80.add(char_literal134);


                    pushFollow(FOLLOW_expression_in_declarator1901);
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
                    // 231:23: -> ^( Assign '=' expression )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:231:26: ^( Assign '=' expression )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:232:7: ( '(' ( arguments )? ')' )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:232:7: ( '(' ( arguments )? ')' )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:232:8: '(' ( arguments )? ')'
                    {
                    char_literal136=(Token)match(input,60,FOLLOW_60_in_declarator1921);  
                    stream_60.add(char_literal136);


                    // /home/philosan/Dev/antlr/407_project/Bank.g:232:12: ( arguments )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==BOOLEAN||LA26_0==DIGIT||LA26_0==ID||LA26_0==54||LA26_0==56||LA26_0==60||LA26_0==64||LA26_0==68||LA26_0==108) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/philosan/Dev/antlr/407_project/Bank.g:232:12: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_declarator1923);
                            arguments137=arguments();

                            state._fsp--;

                            stream_arguments.add(arguments137.getTree());

                            }
                            break;

                    }


                    char_literal138=(Token)match(input,61,FOLLOW_61_in_declarator1926);  
                    stream_61.add(char_literal138);


                    }


                    // AST REWRITE
                    // elements: arguments, 61, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:28: -> ^( Call '(' ( arguments )? ')' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:232:31: ^( Call '(' ( arguments )? ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Call, "Call")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_60.nextNode()
                        );

                        // /home/philosan/Dev/antlr/407_project/Bank.g:232:42: ( arguments )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:236:1: qualified_id : ID ( '::' ID )? -> ^( Qualified ID ( '::' ID )? ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:237:5: ( ID ( '::' ID )? -> ^( Qualified ID ( '::' ID )? ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:237:7: ID ( '::' ID )?
            {
            ID139=(Token)match(input,ID,FOLLOW_ID_in_qualified_id1966);  
            stream_ID.add(ID139);


            // /home/philosan/Dev/antlr/407_project/Bank.g:237:10: ( '::' ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==75) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:237:11: '::' ID
                    {
                    string_literal140=(Token)match(input,75,FOLLOW_75_in_qualified_id1969);  
                    stream_75.add(string_literal140);


                    ID141=(Token)match(input,ID,FOLLOW_ID_in_qualified_id1971);  
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
            // 238:7: -> ^( Qualified ID ( '::' ID )? )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:238:10: ^( Qualified ID ( '::' ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Qualified, "Qualified")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:238:25: ( '::' ID )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:241:1: file_declaration : IFSTREAM ID '(' string_literal ')' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:242:5: ( IFSTREAM ID '(' string_literal ')' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:242:7: IFSTREAM ID '(' string_literal ')'
            {
            root_0 = (Object)adaptor.nil();


            IFSTREAM142=(Token)match(input,IFSTREAM,FOLLOW_IFSTREAM_in_file_declaration2011); 
            IFSTREAM142_tree = 
            (Object)adaptor.create(IFSTREAM142)
            ;
            adaptor.addChild(root_0, IFSTREAM142_tree);


            ID143=(Token)match(input,ID,FOLLOW_ID_in_file_declaration2013); 
            ID143_tree = 
            (Object)adaptor.create(ID143)
            ;
            adaptor.addChild(root_0, ID143_tree);


            char_literal144=(Token)match(input,60,FOLLOW_60_in_file_declaration2015); 
            char_literal144_tree = 
            (Object)adaptor.create(char_literal144)
            ;
            adaptor.addChild(root_0, char_literal144_tree);


            pushFollow(FOLLOW_string_literal_in_file_declaration2017);
            string_literal145=string_literal();

            state._fsp--;

            adaptor.addChild(root_0, string_literal145.getTree());

            char_literal146=(Token)match(input,61,FOLLOW_61_in_file_declaration2019); 
            char_literal146_tree = 
            (Object)adaptor.create(char_literal146)
            ;
            adaptor.addChild(root_0, char_literal146_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:245:1: arguments : expression ( ',' expression )* ;
    public final BankParser.arguments_return arguments() throws RecognitionException {
        BankParser.arguments_return retval = new BankParser.arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal148=null;
        BankParser.expression_return expression147 =null;

        BankParser.expression_return expression149 =null;


        Object char_literal148_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:246:5: ( expression ( ',' expression )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:246:7: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_arguments2036);
            expression147=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression147.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:246:18: ( ',' expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==66) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:246:19: ',' expression
            	    {
            	    char_literal148=(Token)match(input,66,FOLLOW_66_in_arguments2039); 
            	    char_literal148_tree = 
            	    (Object)adaptor.create(char_literal148)
            	    ;
            	    adaptor.addChild(root_0, char_literal148_tree);


            	    pushFollow(FOLLOW_expression_in_arguments2041);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:251:1: class_definition : CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' -> ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:252:5: ( CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' -> ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:252:7: CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';'
            {
            CLASS150=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_definition2062);  
            stream_CLASS.add(CLASS150);


            ID151=(Token)match(input,ID,FOLLOW_ID_in_class_definition2064);  
            stream_ID.add(ID151);


            // /home/philosan/Dev/antlr/407_project/Bank.g:252:16: ( ':' class_visibility ID )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==74) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:252:17: ':' class_visibility ID
                    {
                    char_literal152=(Token)match(input,74,FOLLOW_74_in_class_definition2067);  
                    stream_74.add(char_literal152);


                    pushFollow(FOLLOW_class_visibility_in_class_definition2069);
                    class_visibility153=class_visibility();

                    state._fsp--;

                    stream_class_visibility.add(class_visibility153.getTree());

                    ID154=(Token)match(input,ID,FOLLOW_ID_in_class_definition2071);  
                    stream_ID.add(ID154);


                    }
                    break;

            }


            char_literal155=(Token)match(input,124,FOLLOW_124_in_class_definition2075);  
            stream_124.add(char_literal155);


            pushFollow(FOLLOW_class_members_in_class_definition2077);
            class_members156=class_members();

            state._fsp--;

            stream_class_members.add(class_members156.getTree());

            char_literal157=(Token)match(input,126,FOLLOW_126_in_class_definition2079);  
            stream_126.add(char_literal157);


            char_literal158=(Token)match(input,76,FOLLOW_76_in_class_definition2081);  
            stream_76.add(char_literal158);


            // AST REWRITE
            // elements: ID, 124, ID, 76, class_members, CLASS, 74, class_visibility, 126
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 252:69: -> ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:252:72: ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:252:89: ( ':' class_visibility ID )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:255:1: class_members : ( class_member )* -> ^( Class_Members ( class_member )* ) ;
    public final BankParser.class_members_return class_members() throws RecognitionException {
        BankParser.class_members_return retval = new BankParser.class_members_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.class_member_return class_member159 =null;


        RewriteRuleSubtreeStream stream_class_member=new RewriteRuleSubtreeStream(adaptor,"rule class_member");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:256:5: ( ( class_member )* -> ^( Class_Members ( class_member )* ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:256:7: ( class_member )*
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:256:7: ( class_member )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ID||LA31_0==IFSTREAM||LA31_0==90||LA31_0==93||LA31_0==100||LA31_0==102||LA31_0==104||LA31_0==106||(LA31_0 >= 109 && LA31_0 <= 111)||(LA31_0 >= 115 && LA31_0 <= 117)||(LA31_0 >= 120 && LA31_0 <= 122)||LA31_0==127) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:256:8: class_member
            	    {
            	    pushFollow(FOLLOW_class_member_in_class_members2126);
            	    class_member159=class_member();

            	    state._fsp--;

            	    stream_class_member.add(class_member159.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


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
            // 256:23: -> ^( Class_Members ( class_member )* )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:256:26: ^( Class_Members ( class_member )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Class_Members, "Class_Members")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:256:42: ( class_member )*
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:259:1: class_member : ( class_visibility ':' )? ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:260:5: ( ( class_visibility ':' )? ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:260:7: ( class_visibility ':' )? ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:260:7: ( class_visibility ':' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= 109 && LA32_0 <= 111)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:260:8: class_visibility ':'
                    {
                    pushFollow(FOLLOW_class_visibility_in_class_member2158);
                    class_visibility160=class_visibility();

                    state._fsp--;

                    stream_class_visibility.add(class_visibility160.getTree());

                    char_literal161=(Token)match(input,74,FOLLOW_74_in_class_member2160);  
                    stream_74.add(char_literal161);


                    }
                    break;

            }


            // /home/philosan/Dev/antlr/407_project/Bank.g:261:5: ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) )
            int alt33=4;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:261:6: class_declaration
                    {
                    pushFollow(FOLLOW_class_declaration_in_class_member2169);
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
                    // 261:24: -> ^( Class_Member class_declaration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:261:27: ^( Class_Member class_declaration )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:262:7: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_class_member2185);
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
                    // 262:19: -> ^( Class_Member constructor )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:262:22: ^( Class_Member constructor )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:263:7: class_function_definition
                    {
                    pushFollow(FOLLOW_class_function_definition_in_class_member2201);
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
                    // 263:33: -> ^( Class_Member class_function_definition )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:263:36: ^( Class_Member class_function_definition )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:264:7: destructor
                    {
                    pushFollow(FOLLOW_destructor_in_class_member2217);
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
                    // 264:18: -> ^( Class_Member destructor )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:264:21: ^( Class_Member destructor )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:268:1: class_declaration : ( 'static' )? declaration ;
    public final BankParser.class_declaration_return class_declaration() throws RecognitionException {
        BankParser.class_declaration_return retval = new BankParser.class_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal166=null;
        BankParser.declaration_return declaration167 =null;


        Object string_literal166_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:269:5: ( ( 'static' )? declaration )
            // /home/philosan/Dev/antlr/407_project/Bank.g:269:7: ( 'static' )? declaration
            {
            root_0 = (Object)adaptor.nil();


            // /home/philosan/Dev/antlr/407_project/Bank.g:269:7: ( 'static' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==116) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:269:7: 'static'
                    {
                    string_literal166=(Token)match(input,116,FOLLOW_116_in_class_declaration2248); 
                    string_literal166_tree = 
                    (Object)adaptor.create(string_literal166)
                    ;
                    adaptor.addChild(root_0, string_literal166_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_declaration_in_class_declaration2251);
            declaration167=declaration();

            state._fsp--;

            adaptor.addChild(root_0, declaration167.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:272:1: class_visibility : ( 'public' | 'private' | 'protected' );
    public final BankParser.class_visibility_return class_visibility() throws RecognitionException {
        BankParser.class_visibility_return retval = new BankParser.class_visibility_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set168=null;

        Object set168_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:273:5: ( 'public' | 'private' | 'protected' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:276:1: constructor : ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body -> ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:277:5: ( ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body -> ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:277:7: ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:277:7: ( 'virtual' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==121) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:277:7: 'virtual'
                    {
                    string_literal169=(Token)match(input,121,FOLLOW_121_in_constructor2293);  
                    stream_121.add(string_literal169);


                    }
                    break;

            }


            ID170=(Token)match(input,ID,FOLLOW_ID_in_constructor2296);  
            stream_ID.add(ID170);


            char_literal171=(Token)match(input,60,FOLLOW_60_in_constructor2298);  
            stream_60.add(char_literal171);


            // /home/philosan/Dev/antlr/407_project/Bank.g:277:25: ( parameters )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID||LA36_0==90||LA36_0==93||LA36_0==100||LA36_0==102||LA36_0==104||LA36_0==106||LA36_0==115||LA36_0==117||LA36_0==120) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:277:25: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_constructor2300);
                    parameters172=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters172.getTree());

                    }
                    break;

            }


            char_literal173=(Token)match(input,61,FOLLOW_61_in_constructor2303);  
            stream_61.add(char_literal173);


            // /home/philosan/Dev/antlr/407_project/Bank.g:277:41: ( ':' member_init_list )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==74) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:277:42: ':' member_init_list
                    {
                    char_literal174=(Token)match(input,74,FOLLOW_74_in_constructor2306);  
                    stream_74.add(char_literal174);


                    pushFollow(FOLLOW_member_init_list_in_constructor2308);
                    member_init_list175=member_init_list();

                    state._fsp--;

                    stream_member_init_list.add(member_init_list175.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_constructor2312);
            class_function_body176=class_function_body();

            state._fsp--;

            stream_class_function_body.add(class_function_body176.getTree());

            // AST REWRITE
            // elements: 60, member_init_list, parameters, 74, 121, ID, class_function_body, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 278:9: -> ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:278:12: ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Constructor, "Constructor")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:278:26: ( 'virtual' )?
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:278:44: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:278:60: ( ':' member_init_list )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:281:1: destructor : ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body -> ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:282:5: ( ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body -> ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:282:7: ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:282:7: ( 'virtual' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==121) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:282:7: 'virtual'
                    {
                    string_literal177=(Token)match(input,121,FOLLOW_121_in_destructor2364);  
                    stream_121.add(string_literal177);


                    }
                    break;

            }


            char_literal178=(Token)match(input,127,FOLLOW_127_in_destructor2367);  
            stream_127.add(char_literal178);


            ID179=(Token)match(input,ID,FOLLOW_ID_in_destructor2369);  
            stream_ID.add(ID179);


            char_literal180=(Token)match(input,60,FOLLOW_60_in_destructor2371);  
            stream_60.add(char_literal180);


            // /home/philosan/Dev/antlr/407_project/Bank.g:282:29: ( parameters )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID||LA39_0==90||LA39_0==93||LA39_0==100||LA39_0==102||LA39_0==104||LA39_0==106||LA39_0==115||LA39_0==117||LA39_0==120) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:282:29: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_destructor2373);
                    parameters181=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters181.getTree());

                    }
                    break;

            }


            char_literal182=(Token)match(input,61,FOLLOW_61_in_destructor2376);  
            stream_61.add(char_literal182);


            // /home/philosan/Dev/antlr/407_project/Bank.g:282:45: ( ':' member_init_list )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==74) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:282:46: ':' member_init_list
                    {
                    char_literal183=(Token)match(input,74,FOLLOW_74_in_destructor2379);  
                    stream_74.add(char_literal183);


                    pushFollow(FOLLOW_member_init_list_in_destructor2381);
                    member_init_list184=member_init_list();

                    state._fsp--;

                    stream_member_init_list.add(member_init_list184.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_destructor2385);
            class_function_body185=class_function_body();

            state._fsp--;

            stream_class_function_body.add(class_function_body185.getTree());

            // AST REWRITE
            // elements: 121, parameters, 60, member_init_list, 74, 127, ID, class_function_body, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 283:9: -> ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:283:12: ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Destructor, "Destructor")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:283:25: ( 'virtual' )?
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:283:47: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:283:63: ( ':' member_init_list )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:286:1: member_init_list : function_call ( ',' function_call )* ;
    public final BankParser.member_init_list_return member_init_list() throws RecognitionException {
        BankParser.member_init_list_return retval = new BankParser.member_init_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal187=null;
        BankParser.function_call_return function_call186 =null;

        BankParser.function_call_return function_call188 =null;


        Object char_literal187_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:287:5: ( function_call ( ',' function_call )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:287:7: function_call ( ',' function_call )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_function_call_in_member_init_list2441);
            function_call186=function_call();

            state._fsp--;

            adaptor.addChild(root_0, function_call186.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:287:21: ( ',' function_call )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==66) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:287:22: ',' function_call
            	    {
            	    char_literal187=(Token)match(input,66,FOLLOW_66_in_member_init_list2444); 
            	    char_literal187_tree = 
            	    (Object)adaptor.create(char_literal187)
            	    ;
            	    adaptor.addChild(root_0, char_literal187_tree);


            	    pushFollow(FOLLOW_function_call_in_member_init_list2446);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:290:1: class_function_definition : ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body -> ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:291:5: ( ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body -> ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:291:7: ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:291:7: ( 'virtual' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==121) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:291:7: 'virtual'
                    {
                    string_literal189=(Token)match(input,121,FOLLOW_121_in_class_function_definition2465);  
                    stream_121.add(string_literal189);


                    }
                    break;

            }


            pushFollow(FOLLOW_return_type_in_class_function_definition2468);
            return_type190=return_type();

            state._fsp--;

            stream_return_type.add(return_type190.getTree());

            ID191=(Token)match(input,ID,FOLLOW_ID_in_class_function_definition2470);  
            stream_ID.add(ID191);


            char_literal192=(Token)match(input,60,FOLLOW_60_in_class_function_definition2472);  
            stream_60.add(char_literal192);


            // /home/philosan/Dev/antlr/407_project/Bank.g:291:37: ( parameters )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID||LA43_0==90||LA43_0==93||LA43_0==100||LA43_0==102||LA43_0==104||LA43_0==106||LA43_0==115||LA43_0==117||LA43_0==120) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:291:37: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_class_function_definition2474);
                    parameters193=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters193.getTree());

                    }
                    break;

            }


            char_literal194=(Token)match(input,61,FOLLOW_61_in_class_function_definition2477);  
            stream_61.add(char_literal194);


            // /home/philosan/Dev/antlr/407_project/Bank.g:291:53: ( 'const' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==95) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:291:53: 'const'
                    {
                    string_literal195=(Token)match(input,95,FOLLOW_95_in_class_function_definition2479);  
                    stream_95.add(string_literal195);


                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_class_function_definition2482);
            class_function_body196=class_function_body();

            state._fsp--;

            stream_class_function_body.add(class_function_body196.getTree());

            // AST REWRITE
            // elements: 121, return_type, ID, parameters, 61, 60, 95, class_function_body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 292:9: -> ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:292:12: ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Function, "Function")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:292:23: ( 'virtual' )?
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:292:53: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:292:69: ( 'const' )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:295:1: class_function_body : '{' statements '}' -> ^( Body '{' statements '}' ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:296:5: ( '{' statements '}' -> ^( Body '{' statements '}' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:296:7: '{' statements '}'
            {
            char_literal197=(Token)match(input,124,FOLLOW_124_in_class_function_body2532);  
            stream_124.add(char_literal197);


            pushFollow(FOLLOW_statements_in_class_function_body2534);
            statements198=statements();

            state._fsp--;

            stream_statements.add(statements198.getTree());

            char_literal199=(Token)match(input,126,FOLLOW_126_in_class_function_body2536);  
            stream_126.add(char_literal199);


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
            // 296:26: -> ^( Body '{' statements '}' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:296:29: ^( Body '{' statements '}' )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:301:1: expression : and_exp ( '||' and_exp )* ;
    public final BankParser.expression_return expression() throws RecognitionException {
        BankParser.expression_return retval = new BankParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal201=null;
        BankParser.and_exp_return and_exp200 =null;

        BankParser.and_exp_return and_exp202 =null;


        Object string_literal201_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:302:5: ( and_exp ( '||' and_exp )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:302:7: and_exp ( '||' and_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_exp_in_expression2567);
            and_exp200=and_exp();

            state._fsp--;

            adaptor.addChild(root_0, and_exp200.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:302:15: ( '||' and_exp )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==125) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:302:16: '||' and_exp
            	    {
            	    string_literal201=(Token)match(input,125,FOLLOW_125_in_expression2570); 
            	    string_literal201_tree = 
            	    (Object)adaptor.create(string_literal201)
            	    ;
            	    adaptor.addChild(root_0, string_literal201_tree);


            	    pushFollow(FOLLOW_and_exp_in_expression2572);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:305:1: and_exp : equality_exp ( '&&' equality_exp )* ;
    public final BankParser.and_exp_return and_exp() throws RecognitionException {
        BankParser.and_exp_return retval = new BankParser.and_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal204=null;
        BankParser.equality_exp_return equality_exp203 =null;

        BankParser.equality_exp_return equality_exp205 =null;


        Object string_literal204_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:306:5: ( equality_exp ( '&&' equality_exp )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:306:7: equality_exp ( '&&' equality_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_exp_in_and_exp2591);
            equality_exp203=equality_exp();

            state._fsp--;

            adaptor.addChild(root_0, equality_exp203.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:306:20: ( '&&' equality_exp )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==58) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:306:21: '&&' equality_exp
            	    {
            	    string_literal204=(Token)match(input,58,FOLLOW_58_in_and_exp2594); 
            	    string_literal204_tree = 
            	    (Object)adaptor.create(string_literal204)
            	    ;
            	    adaptor.addChild(root_0, string_literal204_tree);


            	    pushFollow(FOLLOW_equality_exp_in_and_exp2596);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:309:1: equality_exp : relational_exp ( ( '==' | '!=' ) relational_exp )* ;
    public final BankParser.equality_exp_return equality_exp() throws RecognitionException {
        BankParser.equality_exp_return retval = new BankParser.equality_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set207=null;
        BankParser.relational_exp_return relational_exp206 =null;

        BankParser.relational_exp_return relational_exp208 =null;


        Object set207_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:310:5: ( relational_exp ( ( '==' | '!=' ) relational_exp )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:310:7: relational_exp ( ( '==' | '!=' ) relational_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_exp_in_equality_exp2615);
            relational_exp206=relational_exp();

            state._fsp--;

            adaptor.addChild(root_0, relational_exp206.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:310:22: ( ( '==' | '!=' ) relational_exp )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==55||LA47_0==81) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:310:23: ( '==' | '!=' ) relational_exp
            	    {
            	    set207=(Token)input.LT(1);

            	    if ( input.LA(1)==55||input.LA(1)==81 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set207)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relational_exp_in_equality_exp2626);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:313:1: relational_exp : unary_exp ( ( '<' | '>' | '<=' | '>=' ) unary_exp )* ;
    public final BankParser.relational_exp_return relational_exp() throws RecognitionException {
        BankParser.relational_exp_return retval = new BankParser.relational_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set210=null;
        BankParser.unary_exp_return unary_exp209 =null;

        BankParser.unary_exp_return unary_exp211 =null;


        Object set210_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:314:5: ( unary_exp ( ( '<' | '>' | '<=' | '>=' ) unary_exp )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:314:7: unary_exp ( ( '<' | '>' | '<=' | '>=' ) unary_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unary_exp_in_relational_exp2645);
            unary_exp209=unary_exp();

            state._fsp--;

            adaptor.addChild(root_0, unary_exp209.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:314:17: ( ( '<' | '>' | '<=' | '>=' ) unary_exp )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==77||LA48_0==79||(LA48_0 >= 82 && LA48_0 <= 83)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:314:18: ( '<' | '>' | '<=' | '>=' ) unary_exp
            	    {
            	    set210=(Token)input.LT(1);

            	    if ( input.LA(1)==77||input.LA(1)==79||(input.LA(1) >= 82 && input.LA(1) <= 83) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set210)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_exp_in_relational_exp2664);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:317:1: unary_exp : ( arithmetic_expression -> ^( Arithmetic_Expression arithmetic_expression ) | '!' unary_exp -> ^( Not '!' unary_exp ) );
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:318:5: ( arithmetic_expression -> ^( Arithmetic_Expression arithmetic_expression ) | '!' unary_exp -> ^( Not '!' unary_exp ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:318:7: arithmetic_expression
                    {
                    pushFollow(FOLLOW_arithmetic_expression_in_unary_exp2683);
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
                    // 318:29: -> ^( Arithmetic_Expression arithmetic_expression )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:318:32: ^( Arithmetic_Expression arithmetic_expression )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:319:7: '!' unary_exp
                    {
                    char_literal213=(Token)match(input,54,FOLLOW_54_in_unary_exp2699);  
                    stream_54.add(char_literal213);


                    pushFollow(FOLLOW_unary_exp_in_unary_exp2701);
                    unary_exp214=unary_exp();

                    state._fsp--;

                    stream_unary_exp.add(unary_exp214.getTree());

                    // AST REWRITE
                    // elements: unary_exp, 54
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:21: -> ^( Not '!' unary_exp )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:319:24: ^( Not '!' unary_exp )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:322:1: arithmetic_expression : term ( ( '+' | '-' ) term )* ;
    public final BankParser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
        BankParser.arithmetic_expression_return retval = new BankParser.arithmetic_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set216=null;
        BankParser.term_return term215 =null;

        BankParser.term_return term217 =null;


        Object set216_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:323:5: ( term ( ( '+' | '-' ) term )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:323:7: term ( ( '+' | '-' ) term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_arithmetic_expression2728);
            term215=term();

            state._fsp--;

            adaptor.addChild(root_0, term215.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:323:12: ( ( '+' | '-' ) term )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==63||LA50_0==67) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:323:13: ( '+' | '-' ) term
            	    {
            	    set216=(Token)input.LT(1);

            	    if ( input.LA(1)==63||input.LA(1)==67 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set216)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_arithmetic_expression2739);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:326:1: term : factor ( ( '*' | '/' ) factor )* ;
    public final BankParser.term_return term() throws RecognitionException {
        BankParser.term_return retval = new BankParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set219=null;
        BankParser.factor_return factor218 =null;

        BankParser.factor_return factor220 =null;


        Object set219_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:327:5: ( factor ( ( '*' | '/' ) factor )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:327:7: factor ( ( '*' | '/' ) factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2762);
            factor218=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor218.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:327:14: ( ( '*' | '/' ) factor )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==62||LA51_0==73) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:327:15: ( '*' | '/' ) factor
            	    {
            	    set219=(Token)input.LT(1);

            	    if ( input.LA(1)==62||input.LA(1)==73 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set219)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term2773);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:330:1: factor : ( '(' arithmetic_expression ')' -> ^( Factor '(' arithmetic_expression ')' ) | ID -> ^( Factor ID ) | change -> ^( Factor change ) | true_false -> ^( Factor true_false ) | integer_literal -> ^( Factor integer_literal ) | string_literal -> ^( Factor string_literal ) | object_declaration -> ^( Factor object_declaration ) | member_access -> ^( Factor member_access ) );
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

        BankParser.object_declaration_return object_declaration229 =null;

        BankParser.member_access_return member_access230 =null;


        Object char_literal221_tree=null;
        Object char_literal223_tree=null;
        Object ID224_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_string_literal=new RewriteRuleSubtreeStream(adaptor,"rule string_literal");
        RewriteRuleSubtreeStream stream_member_access=new RewriteRuleSubtreeStream(adaptor,"rule member_access");
        RewriteRuleSubtreeStream stream_true_false=new RewriteRuleSubtreeStream(adaptor,"rule true_false");
        RewriteRuleSubtreeStream stream_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule arithmetic_expression");
        RewriteRuleSubtreeStream stream_change=new RewriteRuleSubtreeStream(adaptor,"rule change");
        RewriteRuleSubtreeStream stream_integer_literal=new RewriteRuleSubtreeStream(adaptor,"rule integer_literal");
        RewriteRuleSubtreeStream stream_object_declaration=new RewriteRuleSubtreeStream(adaptor,"rule object_declaration");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:331:5: ( '(' arithmetic_expression ')' -> ^( Factor '(' arithmetic_expression ')' ) | ID -> ^( Factor ID ) | change -> ^( Factor change ) | true_false -> ^( Factor true_false ) | integer_literal -> ^( Factor integer_literal ) | string_literal -> ^( Factor string_literal ) | object_declaration -> ^( Factor object_declaration ) | member_access -> ^( Factor member_access ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:331:7: '(' arithmetic_expression ')'
                    {
                    char_literal221=(Token)match(input,60,FOLLOW_60_in_factor2792);  
                    stream_60.add(char_literal221);


                    pushFollow(FOLLOW_arithmetic_expression_in_factor2794);
                    arithmetic_expression222=arithmetic_expression();

                    state._fsp--;

                    stream_arithmetic_expression.add(arithmetic_expression222.getTree());

                    char_literal223=(Token)match(input,61,FOLLOW_61_in_factor2796);  
                    stream_61.add(char_literal223);


                    // AST REWRITE
                    // elements: 60, arithmetic_expression, 61
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 331:37: -> ^( Factor '(' arithmetic_expression ')' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:331:40: ^( Factor '(' arithmetic_expression ')' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:332:7: ID
                    {
                    ID224=(Token)match(input,ID,FOLLOW_ID_in_factor2816);  
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
                    // 332:10: -> ^( Factor ID )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:332:13: ^( Factor ID )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:333:7: change
                    {
                    pushFollow(FOLLOW_change_in_factor2832);
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
                    // 333:14: -> ^( Factor change )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:333:17: ^( Factor change )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:334:7: true_false
                    {
                    pushFollow(FOLLOW_true_false_in_factor2848);
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
                    // 334:18: -> ^( Factor true_false )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:334:21: ^( Factor true_false )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:335:7: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_factor2864);
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
                    // 335:23: -> ^( Factor integer_literal )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:335:26: ^( Factor integer_literal )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:336:7: string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_factor2880);
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
                    // 336:22: -> ^( Factor string_literal )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:336:25: ^( Factor string_literal )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:337:7: object_declaration
                    {
                    pushFollow(FOLLOW_object_declaration_in_factor2896);
                    object_declaration229=object_declaration();

                    state._fsp--;

                    stream_object_declaration.add(object_declaration229.getTree());

                    // AST REWRITE
                    // elements: object_declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 337:26: -> ^( Factor object_declaration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:337:29: ^( Factor object_declaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_object_declaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:338:7: member_access
                    {
                    pushFollow(FOLLOW_member_access_in_factor2912);
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
                    // 338:21: -> ^( Factor member_access )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:338:24: ^( Factor member_access )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:341:1: true_false : BOOLEAN ;
    public final BankParser.true_false_return true_false() throws RecognitionException {
        BankParser.true_false_return retval = new BankParser.true_false_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN231=null;

        Object BOOLEAN231_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:342:5: ( BOOLEAN )
            // /home/philosan/Dev/antlr/407_project/Bank.g:342:7: BOOLEAN
            {
            root_0 = (Object)adaptor.nil();


            BOOLEAN231=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_true_false2937); 
            BOOLEAN231_tree = 
            (Object)adaptor.create(BOOLEAN231)
            ;
            adaptor.addChild(root_0, BOOLEAN231_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:345:1: member_access : ( function_access -> ^( Member_Access function_access ) | pointer_access -> ^( Member_Access pointer_access ) );
    public final BankParser.member_access_return member_access() throws RecognitionException {
        BankParser.member_access_return retval = new BankParser.member_access_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.function_access_return function_access232 =null;

        BankParser.pointer_access_return pointer_access233 =null;


        RewriteRuleSubtreeStream stream_function_access=new RewriteRuleSubtreeStream(adaptor,"rule function_access");
        RewriteRuleSubtreeStream stream_pointer_access=new RewriteRuleSubtreeStream(adaptor,"rule pointer_access");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:346:5: ( function_access -> ^( Member_Access function_access ) | pointer_access -> ^( Member_Access pointer_access ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:346:7: function_access
                    {
                    pushFollow(FOLLOW_function_access_in_member_access2954);
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
                    // 346:23: -> ^( Member_Access function_access )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:346:26: ^( Member_Access function_access )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:347:7: pointer_access
                    {
                    pushFollow(FOLLOW_pointer_access_in_member_access2970);
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
                    // 347:22: -> ^( Member_Access pointer_access )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:347:25: ^( Member_Access pointer_access )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:350:1: function_access : ID '.' ID ( '(' ( arguments )? ')' )? ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:351:5: ( ID '.' ID ( '(' ( arguments )? ')' )? )
            // /home/philosan/Dev/antlr/407_project/Bank.g:351:7: ID '.' ID ( '(' ( arguments )? ')' )?
            {
            root_0 = (Object)adaptor.nil();


            ID234=(Token)match(input,ID,FOLLOW_ID_in_function_access2995); 
            ID234_tree = 
            (Object)adaptor.create(ID234)
            ;
            adaptor.addChild(root_0, ID234_tree);


            char_literal235=(Token)match(input,71,FOLLOW_71_in_function_access2997); 
            char_literal235_tree = 
            (Object)adaptor.create(char_literal235)
            ;
            adaptor.addChild(root_0, char_literal235_tree);


            ID236=(Token)match(input,ID,FOLLOW_ID_in_function_access2999); 
            ID236_tree = 
            (Object)adaptor.create(ID236)
            ;
            adaptor.addChild(root_0, ID236_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:351:17: ( '(' ( arguments )? ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==60) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:351:18: '(' ( arguments )? ')'
                    {
                    char_literal237=(Token)match(input,60,FOLLOW_60_in_function_access3002); 
                    char_literal237_tree = 
                    (Object)adaptor.create(char_literal237)
                    ;
                    adaptor.addChild(root_0, char_literal237_tree);


                    // /home/philosan/Dev/antlr/407_project/Bank.g:351:22: ( arguments )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==BOOLEAN||LA54_0==DIGIT||LA54_0==ID||LA54_0==54||LA54_0==56||LA54_0==60||LA54_0==64||LA54_0==68||LA54_0==108) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /home/philosan/Dev/antlr/407_project/Bank.g:351:22: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_function_access3004);
                            arguments238=arguments();

                            state._fsp--;

                            adaptor.addChild(root_0, arguments238.getTree());

                            }
                            break;

                    }


                    char_literal239=(Token)match(input,61,FOLLOW_61_in_function_access3007); 
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:354:1: pointer_access : ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )? ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:355:5: ( ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )? )
            // /home/philosan/Dev/antlr/407_project/Bank.g:355:7: ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )?
            {
            root_0 = (Object)adaptor.nil();


            ID240=(Token)match(input,ID,FOLLOW_ID_in_pointer_access3026); 
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


            ID242=(Token)match(input,ID,FOLLOW_ID_in_pointer_access3036); 
            ID242_tree = 
            (Object)adaptor.create(ID242)
            ;
            adaptor.addChild(root_0, ID242_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:355:26: ( '(' ( arguments )? ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==60) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:355:27: '(' ( arguments )? ')'
                    {
                    char_literal243=(Token)match(input,60,FOLLOW_60_in_pointer_access3039); 
                    char_literal243_tree = 
                    (Object)adaptor.create(char_literal243)
                    ;
                    adaptor.addChild(root_0, char_literal243_tree);


                    // /home/philosan/Dev/antlr/407_project/Bank.g:355:31: ( arguments )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==BOOLEAN||LA56_0==DIGIT||LA56_0==ID||LA56_0==54||LA56_0==56||LA56_0==60||LA56_0==64||LA56_0==68||LA56_0==108) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /home/philosan/Dev/antlr/407_project/Bank.g:355:31: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_pointer_access3041);
                            arguments244=arguments();

                            state._fsp--;

                            adaptor.addChild(root_0, arguments244.getTree());

                            }
                            break;

                    }


                    char_literal245=(Token)match(input,61,FOLLOW_61_in_pointer_access3044); 
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:358:1: function_call : ID '(' ( arguments )? ')' -> ^( Call ID '(' ( arguments )? ')' ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:359:5: ( ID '(' ( arguments )? ')' -> ^( Call ID '(' ( arguments )? ')' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:359:7: ID '(' ( arguments )? ')'
            {
            ID246=(Token)match(input,ID,FOLLOW_ID_in_function_call3063);  
            stream_ID.add(ID246);


            char_literal247=(Token)match(input,60,FOLLOW_60_in_function_call3065);  
            stream_60.add(char_literal247);


            // /home/philosan/Dev/antlr/407_project/Bank.g:359:14: ( arguments )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==BOOLEAN||LA58_0==DIGIT||LA58_0==ID||LA58_0==54||LA58_0==56||LA58_0==60||LA58_0==64||LA58_0==68||LA58_0==108) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:359:14: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_function_call3067);
                    arguments248=arguments();

                    state._fsp--;

                    stream_arguments.add(arguments248.getTree());

                    }
                    break;

            }


            char_literal249=(Token)match(input,61,FOLLOW_61_in_function_call3070);  
            stream_61.add(char_literal249);


            // AST REWRITE
            // elements: arguments, 60, ID, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 359:29: -> ^( Call ID '(' ( arguments )? ')' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:359:32: ^( Call ID '(' ( arguments )? ')' )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:359:46: ( arguments )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_call"


    public static class object_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "object_declaration"
    // /home/philosan/Dev/antlr/407_project/Bank.g:362:1: object_declaration : 'new' function_call ;
    public final BankParser.object_declaration_return object_declaration() throws RecognitionException {
        BankParser.object_declaration_return retval = new BankParser.object_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal250=null;
        BankParser.function_call_return function_call251 =null;


        Object string_literal250_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:363:5: ( 'new' function_call )
            // /home/philosan/Dev/antlr/407_project/Bank.g:363:7: 'new' function_call
            {
            root_0 = (Object)adaptor.nil();


            string_literal250=(Token)match(input,108,FOLLOW_108_in_object_declaration3102); 
            string_literal250_tree = 
            (Object)adaptor.create(string_literal250)
            ;
            adaptor.addChild(root_0, string_literal250_tree);


            pushFollow(FOLLOW_function_call_in_object_declaration3104);
            function_call251=function_call();

            state._fsp--;

            adaptor.addChild(root_0, function_call251.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "object_declaration"


    public static class change_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "change"
    // /home/philosan/Dev/antlr/407_project/Bank.g:366:1: change : ( ( '++' | '--' ) ID | ID ( '++' | '--' ) );
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:367:5: ( ( '++' | '--' ) ID | ID ( '++' | '--' ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:367:7: ( '++' | '--' ) ID
                    {
                    root_0 = (Object)adaptor.nil();


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


                    ID253=(Token)match(input,ID,FOLLOW_ID_in_change3129); 
                    ID253_tree = 
                    (Object)adaptor.create(ID253)
                    ;
                    adaptor.addChild(root_0, ID253_tree);


                    }
                    break;
                case 2 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:367:26: ID ( '++' | '--' )
                    {
                    root_0 = (Object)adaptor.nil();


                    ID254=(Token)match(input,ID,FOLLOW_ID_in_change3133); 
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
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:372:1: integer_literal : ( DIGIT )+ ;
    public final BankParser.integer_literal_return integer_literal() throws RecognitionException {
        BankParser.integer_literal_return retval = new BankParser.integer_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DIGIT256=null;

        Object DIGIT256_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:373:5: ( ( DIGIT )+ )
            // /home/philosan/Dev/antlr/407_project/Bank.g:373:7: ( DIGIT )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/philosan/Dev/antlr/407_project/Bank.g:373:7: ( DIGIT )+
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
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:373:7: DIGIT
            	    {
            	    DIGIT256=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_integer_literal3160); 
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:376:1: float_literal : ( DIGIT )+ '.' ( DIGIT )+ ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:377:5: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // /home/philosan/Dev/antlr/407_project/Bank.g:377:7: ( DIGIT )+ '.' ( DIGIT )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/philosan/Dev/antlr/407_project/Bank.g:377:7: ( DIGIT )+
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
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:377:7: DIGIT
            	    {
            	    DIGIT257=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_float_literal3178); 
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


            char_literal258=(Token)match(input,71,FOLLOW_71_in_float_literal3181); 
            char_literal258_tree = 
            (Object)adaptor.create(char_literal258)
            ;
            adaptor.addChild(root_0, char_literal258_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:377:18: ( DIGIT )+
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
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:377:18: DIGIT
            	    {
            	    DIGIT259=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_float_literal3183); 
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:380:1: string_literal : '\"' (~ '\"' )* '\"' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:381:5: ( '\"' (~ '\"' )* '\"' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:381:7: '\"' (~ '\"' )* '\"'
            {
            root_0 = (Object)adaptor.nil();


            char_literal260=(Token)match(input,56,FOLLOW_56_in_string_literal3201); 
            char_literal260_tree = 
            (Object)adaptor.create(char_literal260)
            ;
            adaptor.addChild(root_0, char_literal260_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:381:11: (~ '\"' )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0 >= Arithmetic_Expression && LA63_0 <= 55)||(LA63_0 >= 57 && LA63_0 <= 127)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:
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


            char_literal262=(Token)match(input,56,FOLLOW_56_in_string_literal3209); 
            char_literal262_tree = 
            (Object)adaptor.create(char_literal262)
            ;
            adaptor.addChild(root_0, char_literal262_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:384:1: character_literal : '\\'' (~ ( '\\'' | '\\\\' ) )* '\\'' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:385:5: ( '\\'' (~ ( '\\'' | '\\\\' ) )* '\\'' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:385:7: '\\'' (~ ( '\\'' | '\\\\' ) )* '\\''
            {
            root_0 = (Object)adaptor.nil();


            char_literal263=(Token)match(input,85,FOLLOW_85_in_character_literal3226); 
            char_literal263_tree = 
            (Object)adaptor.create(char_literal263)
            ;
            adaptor.addChild(root_0, char_literal263_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:385:12: (~ ( '\\'' | '\\\\' ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0 >= Arithmetic_Expression && LA64_0 <= 84)||(LA64_0 >= 87 && LA64_0 <= 127)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:
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


            char_literal265=(Token)match(input,85,FOLLOW_85_in_character_literal3240); 
            char_literal265_tree = 
            (Object)adaptor.create(char_literal265)
            ;
            adaptor.addChild(root_0, char_literal265_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:390:1: output : ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:391:5: ( ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:391:7: ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';'
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


            // /home/philosan/Dev/antlr/407_project/Bank.g:391:21: ( '<<' ( expression | 'endl' | manipulators ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==78) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:391:22: '<<' ( expression | 'endl' | manipulators )
            	    {
            	    string_literal267=(Token)match(input,78,FOLLOW_78_in_output3268); 
            	    string_literal267_tree = 
            	    (Object)adaptor.create(string_literal267)
            	    ;
            	    adaptor.addChild(root_0, string_literal267_tree);


            	    // /home/philosan/Dev/antlr/407_project/Bank.g:391:27: ( expression | 'endl' | manipulators )
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
            	            // /home/philosan/Dev/antlr/407_project/Bank.g:391:28: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_output3271);
            	            expression268=expression();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expression268.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/philosan/Dev/antlr/407_project/Bank.g:391:41: 'endl'
            	            {
            	            string_literal269=(Token)match(input,101,FOLLOW_101_in_output3275); 
            	            string_literal269_tree = 
            	            (Object)adaptor.create(string_literal269)
            	            ;
            	            adaptor.addChild(root_0, string_literal269_tree);


            	            }
            	            break;
            	        case 3 :
            	            // /home/philosan/Dev/antlr/407_project/Bank.g:391:50: manipulators
            	            {
            	            pushFollow(FOLLOW_manipulators_in_output3279);
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


            char_literal271=(Token)match(input,76,FOLLOW_76_in_output3284); 
            char_literal271_tree = 
            (Object)adaptor.create(char_literal271)
            ;
            adaptor.addChild(root_0, char_literal271_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:394:1: manipulators : ( 'left' -> ^( Manipulator 'left' ) | 'right' -> ^( Manipulator 'right' ) | 'setw' '(' expression ')' -> ^( Manipulator 'setw' '(' expression ')' ) | 'string' '(' expression ',' character_literal ')' -> ^( Manipulator 'string' '(' expression ',' character_literal ')' ) );
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:395:5: ( 'left' -> ^( Manipulator 'left' ) | 'right' -> ^( Manipulator 'right' ) | 'setw' '(' expression ')' -> ^( Manipulator 'setw' '(' expression ')' ) | 'string' '(' expression ',' character_literal ')' -> ^( Manipulator 'string' '(' expression ',' character_literal ')' ) )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:395:7: 'left'
                    {
                    string_literal272=(Token)match(input,105,FOLLOW_105_in_manipulators3301);  
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
                    // 395:14: -> ^( Manipulator 'left' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:395:17: ^( Manipulator 'left' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:396:7: 'right'
                    {
                    string_literal273=(Token)match(input,113,FOLLOW_113_in_manipulators3317);  
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
                    // 396:15: -> ^( Manipulator 'right' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:396:18: ^( Manipulator 'right' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:397:7: 'setw' '(' expression ')'
                    {
                    string_literal274=(Token)match(input,114,FOLLOW_114_in_manipulators3333);  
                    stream_114.add(string_literal274);


                    char_literal275=(Token)match(input,60,FOLLOW_60_in_manipulators3335);  
                    stream_60.add(char_literal275);


                    pushFollow(FOLLOW_expression_in_manipulators3337);
                    expression276=expression();

                    state._fsp--;

                    stream_expression.add(expression276.getTree());

                    char_literal277=(Token)match(input,61,FOLLOW_61_in_manipulators3339);  
                    stream_61.add(char_literal277);


                    // AST REWRITE
                    // elements: expression, 114, 61, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 397:33: -> ^( Manipulator 'setw' '(' expression ')' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:397:36: ^( Manipulator 'setw' '(' expression ')' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:398:7: 'string' '(' expression ',' character_literal ')'
                    {
                    string_literal278=(Token)match(input,117,FOLLOW_117_in_manipulators3361);  
                    stream_117.add(string_literal278);


                    char_literal279=(Token)match(input,60,FOLLOW_60_in_manipulators3363);  
                    stream_60.add(char_literal279);


                    pushFollow(FOLLOW_expression_in_manipulators3365);
                    expression280=expression();

                    state._fsp--;

                    stream_expression.add(expression280.getTree());

                    char_literal281=(Token)match(input,66,FOLLOW_66_in_manipulators3367);  
                    stream_66.add(char_literal281);


                    pushFollow(FOLLOW_character_literal_in_manipulators3369);
                    character_literal282=character_literal();

                    state._fsp--;

                    stream_character_literal.add(character_literal282.getTree());

                    char_literal283=(Token)match(input,61,FOLLOW_61_in_manipulators3371);  
                    stream_61.add(char_literal283);


                    // AST REWRITE
                    // elements: expression, 117, 66, character_literal, 61, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 398:57: -> ^( Manipulator 'string' '(' expression ',' character_literal ')' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:398:60: ^( Manipulator 'string' '(' expression ',' character_literal ')' )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:403:1: input : ( stream ( '>>' expression )+ ';' | 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';' | stream '.ignore' '(' ')' ';' );
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:404:5: ( stream ( '>>' expression )+ ';' | 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';' | stream '.ignore' '(' ')' ';' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:404:7: stream ( '>>' expression )+ ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stream_in_input3408);
                    stream284=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream284.getTree());

                    // /home/philosan/Dev/antlr/407_project/Bank.g:404:14: ( '>>' expression )+
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
                    	    // /home/philosan/Dev/antlr/407_project/Bank.g:404:15: '>>' expression
                    	    {
                    	    string_literal285=(Token)match(input,84,FOLLOW_84_in_input3411); 
                    	    string_literal285_tree = 
                    	    (Object)adaptor.create(string_literal285)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal285_tree);


                    	    pushFollow(FOLLOW_expression_in_input3413);
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


                    char_literal287=(Token)match(input,76,FOLLOW_76_in_input3417); 
                    char_literal287_tree = 
                    (Object)adaptor.create(char_literal287)
                    ;
                    adaptor.addChild(root_0, char_literal287_tree);


                    }
                    break;
                case 2 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:405:7: 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal288=(Token)match(input,103,FOLLOW_103_in_input3425); 
                    string_literal288_tree = 
                    (Object)adaptor.create(string_literal288)
                    ;
                    adaptor.addChild(root_0, string_literal288_tree);


                    char_literal289=(Token)match(input,60,FOLLOW_60_in_input3427); 
                    char_literal289_tree = 
                    (Object)adaptor.create(char_literal289)
                    ;
                    adaptor.addChild(root_0, char_literal289_tree);


                    pushFollow(FOLLOW_stream_in_input3429);
                    stream290=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream290.getTree());

                    char_literal291=(Token)match(input,66,FOLLOW_66_in_input3431); 
                    char_literal291_tree = 
                    (Object)adaptor.create(char_literal291)
                    ;
                    adaptor.addChild(root_0, char_literal291_tree);


                    ID292=(Token)match(input,ID,FOLLOW_ID_in_input3433); 
                    ID292_tree = 
                    (Object)adaptor.create(ID292)
                    ;
                    adaptor.addChild(root_0, ID292_tree);


                    // /home/philosan/Dev/antlr/407_project/Bank.g:405:35: ( ',' character_literal )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==66) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/philosan/Dev/antlr/407_project/Bank.g:405:36: ',' character_literal
                            {
                            char_literal293=(Token)match(input,66,FOLLOW_66_in_input3436); 
                            char_literal293_tree = 
                            (Object)adaptor.create(char_literal293)
                            ;
                            adaptor.addChild(root_0, char_literal293_tree);


                            pushFollow(FOLLOW_character_literal_in_input3438);
                            character_literal294=character_literal();

                            state._fsp--;

                            adaptor.addChild(root_0, character_literal294.getTree());

                            }
                            break;

                    }


                    char_literal295=(Token)match(input,61,FOLLOW_61_in_input3442); 
                    char_literal295_tree = 
                    (Object)adaptor.create(char_literal295)
                    ;
                    adaptor.addChild(root_0, char_literal295_tree);


                    char_literal296=(Token)match(input,76,FOLLOW_76_in_input3444); 
                    char_literal296_tree = 
                    (Object)adaptor.create(char_literal296)
                    ;
                    adaptor.addChild(root_0, char_literal296_tree);


                    }
                    break;
                case 3 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:406:7: stream '.ignore' '(' ')' ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stream_in_input3452);
                    stream297=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream297.getTree());

                    string_literal298=(Token)match(input,72,FOLLOW_72_in_input3454); 
                    string_literal298_tree = 
                    (Object)adaptor.create(string_literal298)
                    ;
                    adaptor.addChild(root_0, string_literal298_tree);


                    char_literal299=(Token)match(input,60,FOLLOW_60_in_input3456); 
                    char_literal299_tree = 
                    (Object)adaptor.create(char_literal299)
                    ;
                    adaptor.addChild(root_0, char_literal299_tree);


                    char_literal300=(Token)match(input,61,FOLLOW_61_in_input3458); 
                    char_literal300_tree = 
                    (Object)adaptor.create(char_literal300)
                    ;
                    adaptor.addChild(root_0, char_literal300_tree);


                    char_literal301=(Token)match(input,76,FOLLOW_76_in_input3460); 
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:409:1: file_input : ( ID ( '>>' expression )+ | 'getline' '(' stream ',' ID ')' | stream '.ignore' '(' ')' );
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:410:5: ( ID ( '>>' expression )+ | 'getline' '(' stream ',' ID ')' | stream '.ignore' '(' ')' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:410:7: ID ( '>>' expression )+
                    {
                    root_0 = (Object)adaptor.nil();


                    ID302=(Token)match(input,ID,FOLLOW_ID_in_file_input3477); 
                    ID302_tree = 
                    (Object)adaptor.create(ID302)
                    ;
                    adaptor.addChild(root_0, ID302_tree);


                    // /home/philosan/Dev/antlr/407_project/Bank.g:410:10: ( '>>' expression )+
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
                    	    // /home/philosan/Dev/antlr/407_project/Bank.g:410:11: '>>' expression
                    	    {
                    	    string_literal303=(Token)match(input,84,FOLLOW_84_in_file_input3480); 
                    	    string_literal303_tree = 
                    	    (Object)adaptor.create(string_literal303)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal303_tree);


                    	    pushFollow(FOLLOW_expression_in_file_input3482);
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:411:7: 'getline' '(' stream ',' ID ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal305=(Token)match(input,103,FOLLOW_103_in_file_input3492); 
                    string_literal305_tree = 
                    (Object)adaptor.create(string_literal305)
                    ;
                    adaptor.addChild(root_0, string_literal305_tree);


                    char_literal306=(Token)match(input,60,FOLLOW_60_in_file_input3494); 
                    char_literal306_tree = 
                    (Object)adaptor.create(char_literal306)
                    ;
                    adaptor.addChild(root_0, char_literal306_tree);


                    pushFollow(FOLLOW_stream_in_file_input3496);
                    stream307=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream307.getTree());

                    char_literal308=(Token)match(input,66,FOLLOW_66_in_file_input3498); 
                    char_literal308_tree = 
                    (Object)adaptor.create(char_literal308)
                    ;
                    adaptor.addChild(root_0, char_literal308_tree);


                    ID309=(Token)match(input,ID,FOLLOW_ID_in_file_input3500); 
                    ID309_tree = 
                    (Object)adaptor.create(ID309)
                    ;
                    adaptor.addChild(root_0, ID309_tree);


                    char_literal310=(Token)match(input,61,FOLLOW_61_in_file_input3502); 
                    char_literal310_tree = 
                    (Object)adaptor.create(char_literal310)
                    ;
                    adaptor.addChild(root_0, char_literal310_tree);


                    }
                    break;
                case 3 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:412:7: stream '.ignore' '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stream_in_file_input3510);
                    stream311=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream311.getTree());

                    string_literal312=(Token)match(input,72,FOLLOW_72_in_file_input3512); 
                    string_literal312_tree = 
                    (Object)adaptor.create(string_literal312)
                    ;
                    adaptor.addChild(root_0, string_literal312_tree);


                    char_literal313=(Token)match(input,60,FOLLOW_60_in_file_input3514); 
                    char_literal313_tree = 
                    (Object)adaptor.create(char_literal313)
                    ;
                    adaptor.addChild(root_0, char_literal313_tree);


                    char_literal314=(Token)match(input,61,FOLLOW_61_in_file_input3516); 
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:415:1: stream : ( 'cin' | ID );
    public final BankParser.stream_return stream() throws RecognitionException {
        BankParser.stream_return retval = new BankParser.stream_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set315=null;

        Object set315_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:416:5: ( 'cin' | ID )
            // /home/philosan/Dev/antlr/407_project/Bank.g:
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
            return "()+ loopback of 64:7: ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )+";
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
            return "261:5: ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) )";
        }
    }
 

    public static final BitSet FOLLOW_top_level_in_start328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compilation_unit_in_top_level353 = new BitSet(new long[]{0x0000000140000200L,0x0528055024000000L});
    public static final BitSet FOLLOW_top_level_component_in_top_level355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_top_level_component383 = new BitSet(new long[]{0x0000000140000202L,0x0528055024000000L});
    public static final BitSet FOLLOW_class_definition_in_top_level_component399 = new BitSet(new long[]{0x0000000140000202L,0x0528055024000000L});
    public static final BitSet FOLLOW_declaration_in_top_level_component415 = new BitSet(new long[]{0x0000000140000202L,0x0528055024000000L});
    public static final BitSet FOLLOW_include_in_compilation_unit451 = new BitSet(new long[]{0x0200000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_name_space_in_compilation_unit469 = new BitSet(new long[]{0x0200000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_57_in_include497 = new BitSet(new long[]{0x0100000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_lib_in_include507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_header_in_include523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_lib550 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFE7FFFFFL});
    public static final BitSet FOLLOW_82_in_lib568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_header577 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFE7FFFFFL});
    public static final BitSet FOLLOW_56_in_header595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_name_space608 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_name_space610 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_name_space614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_name_space617 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_name_space619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_76_in_name_space640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_type_in_function_definition659 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_function_definition661 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_function_definition663 = new BitSet(new long[]{0x2000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_parameters_in_function_definition665 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function_definition668 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_function_definition670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters706 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_parameters709 = new BitSet(new long[]{0x0000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_parameter_in_parameters711 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter730 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_parameter732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_body761 = new BitSet(new long[]{0x00000001C4000000L,0x496905DD64000000L});
    public static final BitSet FOLLOW_statements_in_body763 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_body765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_body785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements811 = new BitSet(new long[]{0x00000001C4000002L,0x096905DD64000000L});
    public static final BitSet FOLLOW_declaration_in_statement841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_statement859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_member_access_in_statement877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_statement879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_structure_in_statement897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_output_in_statement929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_input_in_statement945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_statement961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010022L});
    public static final BitSet FOLLOW_set_in_assignment992 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_assignment1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_delete_statement1021 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_delete_statement1023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_delete_statement1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_return_statement1054 = new BitSet(new long[]{0x1140000040040040L,0x0000100000001011L});
    public static final BitSet FOLLOW_expression_in_return_statement1056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_return_statement1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_control_structure1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_in_control_structure1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_in_control_structure1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_loop_in_control_structure1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switch_statement_in_control_structure1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1180 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_if_statement1182 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_if_statement1184 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_if_statement1186 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_if_statement1188 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_else_statement_in_if_statement1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_statement1227 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_else_statement1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop1256 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_for_loop1258 = new BitSet(new long[]{0x0000000000000000L,0x0000000082000000L});
    public static final BitSet FOLLOW_95_in_for_loop1260 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_loop1263 = new BitSet(new long[]{0x0800000040000000L});
    public static final BitSet FOLLOW_59_in_for_loop1265 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_for_loop1268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_for_loop1270 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_for_loop1272 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_for_loop1274 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_for_loop1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_while_loop1321 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_while_loop1323 = new BitSet(new long[]{0x1140000040040040L,0x0000108040000011L});
    public static final BitSet FOLLOW_while_exp_in_while_loop1325 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_while_loop1327 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_while_loop1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_while_exp1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_file_input_in_while_exp1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_do_while_loop1405 = new BitSet(new long[]{0x00000001C4000000L,0x196905DD64000000L});
    public static final BitSet FOLLOW_body_in_do_while_loop1407 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_do_while_loop1409 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_do_while_loop1411 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_do_while_loop1413 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_do_while_loop1415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_do_while_loop1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_switch_statement1454 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_switch_statement1456 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_switch_statement1458 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_switch_statement1460 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_switch_statement1462 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_switch_case_in_switch_statement1464 = new BitSet(new long[]{0x0000000000000000L,0x4000000210000000L});
    public static final BitSet FOLLOW_default_case_in_switch_statement1467 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_switch_statement1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_switch_case1511 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_switch_case1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_switch_case1515 = new BitSet(new long[]{0x00000001C4000000L,0x096905DD6C000000L});
    public static final BitSet FOLLOW_statements_in_switch_case1517 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_break_statement_in_switch_case1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_default_case1554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_default_case1556 = new BitSet(new long[]{0x00000001C4000000L,0x096905DD64000000L});
    public static final BitSet FOLLOW_statements_in_default_case1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_break_statement1587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_break_statement1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_type_in_type1619 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_vector_type_in_type1635 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ID_in_type1651 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_type1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_type_in_return_type1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_return_type1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_vector_type1773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_vector_type1775 = new BitSet(new long[]{0x0000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_type_in_vector_type1777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_vector_type1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_declaration1799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_file_declaration_in_declaration1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_declaration1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable_declaration1848 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_variables_in_variable_declaration1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_variables1867 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_variables1870 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_declarator_in_variables1872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_qualified_id_in_declarator1891 = new BitSet(new long[]{0x1000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_declarator1899 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_declarator1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_declarator1921 = new BitSet(new long[]{0x3140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_arguments_in_declarator1923 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_declarator1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qualified_id1966 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_qualified_id1969 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_qualified_id1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFSTREAM_in_file_declaration2011 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_file_declaration2013 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_file_declaration2015 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_string_literal_in_file_declaration2017 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_file_declaration2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arguments2036 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_arguments2039 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_arguments2041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_in_class_definition2062 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_class_definition2064 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000400L});
    public static final BitSet FOLLOW_74_in_class_definition2067 = new BitSet(new long[]{0x0000000000000000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_class_visibility_in_class_definition2069 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_class_definition2071 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_class_definition2075 = new BitSet(new long[]{0x0000000140000000L,0xC738E55024000000L});
    public static final BitSet FOLLOW_class_members_in_class_definition2077 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_class_definition2079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_class_definition2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_member_in_class_members2126 = new BitSet(new long[]{0x0000000140000002L,0x8738E55024000000L});
    public static final BitSet FOLLOW_class_visibility_in_class_member2158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_class_member2160 = new BitSet(new long[]{0x0000000140000000L,0x8738055024000000L});
    public static final BitSet FOLLOW_class_declaration_in_class_member2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_class_member2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_function_definition_in_class_member2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destructor_in_class_member2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_class_declaration2248 = new BitSet(new long[]{0x0000000140000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_declaration_in_class_declaration2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_constructor2293 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_constructor2296 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_constructor2298 = new BitSet(new long[]{0x2000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_parameters_in_constructor2300 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_constructor2303 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000400L});
    public static final BitSet FOLLOW_74_in_constructor2306 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_member_init_list_in_constructor2308 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_class_function_body_in_constructor2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_destructor2364 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_destructor2367 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_destructor2369 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_destructor2371 = new BitSet(new long[]{0x2000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_parameters_in_destructor2373 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_destructor2376 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000400L});
    public static final BitSet FOLLOW_74_in_destructor2379 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_member_init_list_in_destructor2381 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_class_function_body_in_destructor2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_member_init_list2441 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_member_init_list2444 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_function_call_in_member_init_list2446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_121_in_class_function_definition2465 = new BitSet(new long[]{0x0000000000000000L,0x0428055024000000L});
    public static final BitSet FOLLOW_return_type_in_class_function_definition2468 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_class_function_definition2470 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_class_function_definition2472 = new BitSet(new long[]{0x2000000040000000L,0x0128055024000000L});
    public static final BitSet FOLLOW_parameters_in_class_function_definition2474 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_class_function_definition2477 = new BitSet(new long[]{0x0000000000000000L,0x1000000080000000L});
    public static final BitSet FOLLOW_95_in_class_function_definition2479 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_class_function_body_in_class_function_definition2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_class_function_body2532 = new BitSet(new long[]{0x00000001C4000000L,0x496905DD64000000L});
    public static final BitSet FOLLOW_statements_in_class_function_body2534 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_class_function_body2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_exp_in_expression2567 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_expression2570 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_and_exp_in_expression2572 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_equality_exp_in_and_exp2591 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_and_exp2594 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_equality_exp_in_and_exp2596 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_relational_exp_in_equality_exp2615 = new BitSet(new long[]{0x0080000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_set_in_equality_exp2618 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_relational_exp_in_equality_exp2626 = new BitSet(new long[]{0x0080000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_unary_exp_in_relational_exp2645 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CA000L});
    public static final BitSet FOLLOW_set_in_relational_exp2648 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_unary_exp_in_relational_exp2664 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CA000L});
    public static final BitSet FOLLOW_arithmetic_expression_in_unary_exp2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_unary_exp2699 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_unary_exp_in_unary_exp2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arithmetic_expression2728 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_arithmetic_expression2731 = new BitSet(new long[]{0x1100000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_term_in_arithmetic_expression2739 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_term2762 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_term2765 = new BitSet(new long[]{0x1100000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_factor_in_term2773 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_60_in_factor2792 = new BitSet(new long[]{0x1100000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_arithmetic_expression_in_factor2794 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_factor2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_change_in_factor2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_true_false_in_factor2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_factor2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_factor2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_declaration_in_factor2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_member_access_in_factor2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_true_false2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_access_in_member_access2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_access_in_member_access2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_access2995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_function_access2997 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_function_access2999 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_function_access3002 = new BitSet(new long[]{0x3140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_arguments_in_function_access3004 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function_access3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pointer_access3026 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_pointer_access3028 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_pointer_access3036 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_pointer_access3039 = new BitSet(new long[]{0x3140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_arguments_in_pointer_access3041 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_pointer_access3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_call3063 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_function_call3065 = new BitSet(new long[]{0x3140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_arguments_in_function_call3067 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function_call3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_object_declaration3102 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_function_call_in_object_declaration3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change3121 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_change3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_change3133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_set_in_change3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_integer_literal3160 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DIGIT_in_float_literal3178 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_float_literal3181 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DIGIT_in_float_literal3183 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_56_in_string_literal3201 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_56_in_string_literal3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_character_literal3226 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFBFFFFFL});
    public static final BitSet FOLLOW_85_in_character_literal3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_output3259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_78_in_output3268 = new BitSet(new long[]{0x1140000040040040L,0x0026122000000011L});
    public static final BitSet FOLLOW_expression_in_output3271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_101_in_output3275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_manipulators_in_output3279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_76_in_output3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_manipulators3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_manipulators3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_manipulators3333 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_manipulators3335 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_manipulators3337 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_manipulators3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_manipulators3361 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_manipulators3363 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_manipulators3365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_manipulators3367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_character_literal_in_manipulators3369 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_manipulators3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_input3408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_input3411 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_input3413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000101000L});
    public static final BitSet FOLLOW_76_in_input3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_input3425 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_input3427 = new BitSet(new long[]{0x0000000040000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stream_in_input3429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_input3431 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_input3433 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_input3436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_character_literal_in_input3438 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_input3442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_input3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_input3452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_input3454 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_input3456 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_input3458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_input3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_file_input3477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_file_input3480 = new BitSet(new long[]{0x1140000040040040L,0x0000100000000011L});
    public static final BitSet FOLLOW_expression_in_file_input3482 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_103_in_file_input3492 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_file_input3494 = new BitSet(new long[]{0x0000000040000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_stream_in_file_input3496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_file_input3498 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_file_input3500 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_file_input3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_file_input3510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_file_input3512 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_file_input3514 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_file_input3516 = new BitSet(new long[]{0x0000000000000002L});

}