// $ANTLR 3.4 /home/philosan/Dev/antlr/407_project/Bank.g 2025-05-14 18:58:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class BankParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arithmetic_Expression", "Assign", "BOOLEAN", "Body", "Break", "CLASS", "COMMENT", "Call", "Class", "Class_Member", "Class_Members", "Compilition_Unit", "Constructor", "Control_Structure", "DIGIT", "Declaration", "Default_Case", "Delete", "Destructor", "Do_While", "ELSE", "Else", "FOR", "Factor", "For", "Function", "ID", "IF", "IFSTREAM", "If", "Include", "Manipulator", "Member_Access", "NameSpace", "Not", "Parameter", "Qualified", "Return", "Return_Type", "Start", "Statement", "Statements", "Switch", "Switch_Case", "Top_Level", "Top_Level_Component", "Type", "WS", "While", "While_EXP", "'!'", "'!='", "'\"'", "'#include'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'.'", "'.ignore'", "'/'", "':'", "'::'", "';'", "'<'", "'<<'", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'\\''", "'\\\\'", "'auto'", "'bool'", "'break'", "'case'", "'char'", "'cin'", "'const'", "'cout'", "'default'", "'delete'", "'do'", "'double'", "'endl'", "'float'", "'getline'", "'int'", "'left'", "'long'", "'namespace'", "'new'", "'private'", "'protected'", "'public'", "'return'", "'right'", "'setw'", "'short'", "'static'", "'string'", "'switch'", "'using'", "'vector'", "'virtual'", "'void'", "'while'", "'{'", "'||'", "'}'", "'~'"
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
    public String getGrammarFileName() { return "/home/philosan/Dev/antlr/407_project/Bank.g"; }


        String s="";


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/philosan/Dev/antlr/407_project/Bank.g:56:1: start : top_level -> ^( Start top_level ) ;
    public final BankParser.start_return start() throws RecognitionException {
        BankParser.start_return retval = new BankParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.top_level_return top_level1 =null;


        RewriteRuleSubtreeStream stream_top_level=new RewriteRuleSubtreeStream(adaptor,"rule top_level");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:57:5: ( top_level -> ^( Start top_level ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:57:7: top_level
            {
            pushFollow(FOLLOW_top_level_in_start332);
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
            // 57:17: -> ^( Start top_level )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:57:20: ^( Start top_level )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:67:1: top_level : ( ( compilation_unit )* ( top_level_component )* ) -> ^( Top_Level ( compilation_unit )* ( top_level_component )* ) ;
    public final BankParser.top_level_return top_level() throws RecognitionException {
        BankParser.top_level_return retval = new BankParser.top_level_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.compilation_unit_return compilation_unit2 =null;

        BankParser.top_level_component_return top_level_component3 =null;


        RewriteRuleSubtreeStream stream_compilation_unit=new RewriteRuleSubtreeStream(adaptor,"rule compilation_unit");
        RewriteRuleSubtreeStream stream_top_level_component=new RewriteRuleSubtreeStream(adaptor,"rule top_level_component");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:68:5: ( ( ( compilation_unit )* ( top_level_component )* ) -> ^( Top_Level ( compilation_unit )* ( top_level_component )* ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:68:7: ( ( compilation_unit )* ( top_level_component )* )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:68:7: ( ( compilation_unit )* ( top_level_component )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:68:8: ( compilation_unit )* ( top_level_component )*
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:68:8: ( compilation_unit )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==57||LA1_0==117) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:68:8: compilation_unit
            	    {
            	    pushFollow(FOLLOW_compilation_unit_in_top_level393);
            	    compilation_unit2=compilation_unit();

            	    state._fsp--;

            	    stream_compilation_unit.add(compilation_unit2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // /home/philosan/Dev/antlr/407_project/Bank.g:68:26: ( top_level_component )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS||LA2_0==ID||LA2_0==IFSTREAM||LA2_0==88||LA2_0==91||LA2_0==98||LA2_0==100||LA2_0==102||LA2_0==104||LA2_0==113||LA2_0==115||LA2_0==118||LA2_0==120) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:68:26: top_level_component
            	    {
            	    pushFollow(FOLLOW_top_level_component_in_top_level396);
            	    top_level_component3=top_level_component();

            	    state._fsp--;

            	    stream_top_level_component.add(top_level_component3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
            // 69:7: -> ^( Top_Level ( compilation_unit )* ( top_level_component )* )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:69:10: ^( Top_Level ( compilation_unit )* ( top_level_component )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Top_Level, "Top_Level")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:69:22: ( compilation_unit )*
                while ( stream_compilation_unit.hasNext() ) {
                    adaptor.addChild(root_1, stream_compilation_unit.nextTree());

                }
                stream_compilation_unit.reset();

                // /home/philosan/Dev/antlr/407_project/Bank.g:69:40: ( top_level_component )*
                while ( stream_top_level_component.hasNext() ) {
                    adaptor.addChild(root_1, stream_top_level_component.nextTree());

                }
                stream_top_level_component.reset();

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:75:1: top_level_component : ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) );
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:76:5: ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:76:8: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_top_level_component454);
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
                    // 76:28: -> ^( Top_Level_Component function_definition )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:76:31: ^( Top_Level_Component function_definition )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:77:7: class_definition
                    {
                    pushFollow(FOLLOW_class_definition_in_top_level_component471);
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
                    // 77:24: -> ^( Top_Level_Component class_definition )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:77:27: ^( Top_Level_Component class_definition )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:78:7: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_top_level_component488);
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
                    // 78:19: -> ^( Top_Level_Component declaration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:78:22: ^( Top_Level_Component declaration )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:88:1: compilation_unit : ( ( include ) -> ^( Compilition_Unit include ) | ( name_space ) -> ^( Compilition_Unit name_space ) ) ;
    public final BankParser.compilation_unit_return compilation_unit() throws RecognitionException {
        BankParser.compilation_unit_return retval = new BankParser.compilation_unit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.include_return include7 =null;

        BankParser.name_space_return name_space8 =null;


        RewriteRuleSubtreeStream stream_include=new RewriteRuleSubtreeStream(adaptor,"rule include");
        RewriteRuleSubtreeStream stream_name_space=new RewriteRuleSubtreeStream(adaptor,"rule name_space");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:89:2: ( ( ( include ) -> ^( Compilition_Unit include ) | ( name_space ) -> ^( Compilition_Unit name_space ) ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:89:4: ( ( include ) -> ^( Compilition_Unit include ) | ( name_space ) -> ^( Compilition_Unit name_space ) )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:89:4: ( ( include ) -> ^( Compilition_Unit include ) | ( name_space ) -> ^( Compilition_Unit name_space ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==57) ) {
                alt4=1;
            }
            else if ( (LA4_0==117) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:89:6: ( include )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:89:6: ( include )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:89:7: include
                    {
                    pushFollow(FOLLOW_include_in_compilation_unit536);
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
                    // 89:16: -> ^( Compilition_Unit include )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:89:19: ^( Compilition_Unit include )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:90:4: ( name_space )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:90:4: ( name_space )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:90:5: name_space
                    {
                    pushFollow(FOLLOW_name_space_in_compilation_unit552);
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
                    // 90:17: -> ^( Compilition_Unit name_space )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:90:20: ^( Compilition_Unit name_space )
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
    // $ANTLR end "compilation_unit"


    public static class include_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include"
    // /home/philosan/Dev/antlr/407_project/Bank.g:98:1: include : '#include' ( lib -> ^( Include lib ) | header -> ^( Include header ) ) ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:98:9: ( '#include' ( lib -> ^( Include lib ) | header -> ^( Include header ) ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:98:11: '#include' ( lib -> ^( Include lib ) | header -> ^( Include header ) )
            {
            string_literal9=(Token)match(input,57,FOLLOW_57_in_include597);  
            stream_57.add(string_literal9);


            // /home/philosan/Dev/antlr/407_project/Bank.g:98:22: ( lib -> ^( Include lib ) | header -> ^( Include header ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==77) ) {
                alt5=1;
            }
            else if ( (LA5_0==56) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:99:4: lib
                    {
                    pushFollow(FOLLOW_lib_in_include604);
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
                    // 99:8: -> ^( Include lib )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:99:11: ^( Include lib )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:100:4: header
                    {
                    pushFollow(FOLLOW_header_in_include618);
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
                    // 100:11: -> ^( Include header )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:100:14: ^( Include header )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:108:1: lib : '<' (~ ( '>' ) )* '>' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:108:5: ( '<' (~ ( '>' ) )* '>' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:108:7: '<' (~ ( '>' ) )* '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal12=(Token)match(input,77,FOLLOW_77_in_lib660); 
            char_literal12_tree = 
            (Object)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:108:11: (~ ( '>' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= Arithmetic_Expression && LA6_0 <= 81)||(LA6_0 >= 83 && LA6_0 <= 125)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:
            	    {
            	    set13=(Token)input.LT(1);

            	    if ( (input.LA(1) >= Arithmetic_Expression && input.LA(1) <= 81)||(input.LA(1) >= 83 && input.LA(1) <= 125) ) {
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
            	    break loop6;
                }
            } while (true);


            char_literal14=(Token)match(input,82,FOLLOW_82_in_lib670); 
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:115:1: header : '\"' (~ ( '\"' ) )* '\"' ;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:115:8: ( '\"' (~ ( '\"' ) )* '\"' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:115:10: '\"' (~ ( '\"' ) )* '\"'
            {
            root_0 = (Object)adaptor.nil();


            char_literal15=(Token)match(input,56,FOLLOW_56_in_header702); 
            char_literal15_tree = 
            (Object)adaptor.create(char_literal15)
            ;
            adaptor.addChild(root_0, char_literal15_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:115:14: (~ ( '\"' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= Arithmetic_Expression && LA7_0 <= 55)||(LA7_0 >= 57 && LA7_0 <= 125)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:
            	    {
            	    set16=(Token)input.LT(1);

            	    if ( (input.LA(1) >= Arithmetic_Expression && input.LA(1) <= 55)||(input.LA(1) >= 57 && input.LA(1) <= 125) ) {
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
            	    break loop7;
                }
            } while (true);


            char_literal17=(Token)match(input,56,FOLLOW_56_in_header712); 
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:122:1: name_space : 'using' 'namespace' ( name_space_name -> ^( NameSpace name_space_name ) ) ';' ;
    public final BankParser.name_space_return name_space() throws RecognitionException {
        BankParser.name_space_return retval = new BankParser.name_space_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal18=null;
        Token string_literal19=null;
        Token char_literal21=null;
        BankParser.name_space_name_return name_space_name20 =null;


        Object string_literal18_tree=null;
        Object string_literal19_tree=null;
        Object char_literal21_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_name_space_name=new RewriteRuleSubtreeStream(adaptor,"rule name_space_name");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:122:12: ( 'using' 'namespace' ( name_space_name -> ^( NameSpace name_space_name ) ) ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:122:14: 'using' 'namespace' ( name_space_name -> ^( NameSpace name_space_name ) ) ';'
            {
            string_literal18=(Token)match(input,117,FOLLOW_117_in_name_space744);  
            stream_117.add(string_literal18);


            string_literal19=(Token)match(input,105,FOLLOW_105_in_name_space746);  
            stream_105.add(string_literal19);


            // /home/philosan/Dev/antlr/407_project/Bank.g:122:34: ( name_space_name -> ^( NameSpace name_space_name ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:122:36: name_space_name
            {
            pushFollow(FOLLOW_name_space_name_in_name_space750);
            name_space_name20=name_space_name();

            state._fsp--;

            stream_name_space_name.add(name_space_name20.getTree());

            // AST REWRITE
            // elements: name_space_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:52: -> ^( NameSpace name_space_name )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:122:55: ^( NameSpace name_space_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NameSpace, "NameSpace")
                , root_1);

                adaptor.addChild(root_1, stream_name_space_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }


            char_literal21=(Token)match(input,76,FOLLOW_76_in_name_space762);  
            stream_76.add(char_literal21);


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


    public static class name_space_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name_space_name"
    // /home/philosan/Dev/antlr/407_project/Bank.g:128:1: name_space_name : ( ID ( '::' ID )* ) ;
    public final BankParser.name_space_name_return name_space_name() throws RecognitionException {
        BankParser.name_space_name_return retval = new BankParser.name_space_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID22=null;
        Token string_literal23=null;
        Token ID24=null;

        Object ID22_tree=null;
        Object string_literal23_tree=null;
        Object ID24_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:129:2: ( ( ID ( '::' ID )* ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:129:5: ( ID ( '::' ID )* )
            {
            root_0 = (Object)adaptor.nil();


            // /home/philosan/Dev/antlr/407_project/Bank.g:129:5: ( ID ( '::' ID )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:129:6: ID ( '::' ID )*
            {
            ID22=(Token)match(input,ID,FOLLOW_ID_in_name_space_name797); 
            ID22_tree = 
            (Object)adaptor.create(ID22)
            ;
            adaptor.addChild(root_0, ID22_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:129:9: ( '::' ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==75) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:129:10: '::' ID
            	    {
            	    string_literal23=(Token)match(input,75,FOLLOW_75_in_name_space_name800); 
            	    string_literal23_tree = 
            	    (Object)adaptor.create(string_literal23)
            	    ;
            	    adaptor.addChild(root_0, string_literal23_tree);


            	    ID24=(Token)match(input,ID,FOLLOW_ID_in_name_space_name802); 
            	    ID24_tree = 
            	    (Object)adaptor.create(ID24)
            	    ;
            	    adaptor.addChild(root_0, ID24_tree);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "name_space_name"


    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_definition"
    // /home/philosan/Dev/antlr/407_project/Bank.g:140:1: function_definition : ( return_type ID '(' ( parameters )? ')' body ) -> ^( Function return_type ID '(' ( parameters )? ')' body ) ;
    public final BankParser.function_definition_return function_definition() throws RecognitionException {
        BankParser.function_definition_return retval = new BankParser.function_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID26=null;
        Token char_literal27=null;
        Token char_literal29=null;
        BankParser.return_type_return return_type25 =null;

        BankParser.parameters_return parameters28 =null;

        BankParser.body_return body30 =null;


        Object ID26_tree=null;
        Object char_literal27_tree=null;
        Object char_literal29_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:140:21: ( ( return_type ID '(' ( parameters )? ')' body ) -> ^( Function return_type ID '(' ( parameters )? ')' body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:140:23: ( return_type ID '(' ( parameters )? ')' body )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:140:23: ( return_type ID '(' ( parameters )? ')' body )
            // /home/philosan/Dev/antlr/407_project/Bank.g:140:24: return_type ID '(' ( parameters )? ')' body
            {
            pushFollow(FOLLOW_return_type_in_function_definition843);
            return_type25=return_type();

            state._fsp--;

            stream_return_type.add(return_type25.getTree());

            ID26=(Token)match(input,ID,FOLLOW_ID_in_function_definition845);  
            stream_ID.add(ID26);


            char_literal27=(Token)match(input,60,FOLLOW_60_in_function_definition847);  
            stream_60.add(char_literal27);


            // /home/philosan/Dev/antlr/407_project/Bank.g:140:43: ( parameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID||LA9_0==88||LA9_0==91||LA9_0==98||LA9_0==100||LA9_0==102||LA9_0==104||LA9_0==113||LA9_0==115||LA9_0==118) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:140:43: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_function_definition849);
                    parameters28=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters28.getTree());

                    }
                    break;

            }


            char_literal29=(Token)match(input,61,FOLLOW_61_in_function_definition852);  
            stream_61.add(char_literal29);


            pushFollow(FOLLOW_body_in_function_definition854);
            body30=body();

            state._fsp--;

            stream_body.add(body30.getTree());

            }


            // AST REWRITE
            // elements: return_type, 60, parameters, body, ID, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 140:65: -> ^( Function return_type ID '(' ( parameters )? ')' body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:140:68: ^( Function return_type ID '(' ( parameters )? ')' body )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:140:98: ( parameters )?
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:147:1: parameters : parameter ( ( ',' ) ^ parameter )* ;
    public final BankParser.parameters_return parameters() throws RecognitionException {
        BankParser.parameters_return retval = new BankParser.parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal32=null;
        BankParser.parameter_return parameter31 =null;

        BankParser.parameter_return parameter33 =null;


        Object char_literal32_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:147:12: ( parameter ( ( ',' ) ^ parameter )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:147:14: parameter ( ( ',' ) ^ parameter )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_parameter_in_parameters906);
            parameter31=parameter();

            state._fsp--;

            adaptor.addChild(root_0, parameter31.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:147:24: ( ( ',' ) ^ parameter )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==66) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:147:25: ( ',' ) ^ parameter
            	    {
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:147:25: ( ',' )
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:147:26: ','
            	    {
            	    char_literal32=(Token)match(input,66,FOLLOW_66_in_parameters910); 
            	    char_literal32_tree = 
            	    (Object)adaptor.create(char_literal32)
            	    ;
            	    adaptor.addChild(root_0, char_literal32_tree);


            	    }


            	    pushFollow(FOLLOW_parameter_in_parameters914);
            	    parameter33=parameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, parameter33.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:154:1: parameter : ( type ID ) -> ^( Parameter type ID ) ;
    public final BankParser.parameter_return parameter() throws RecognitionException {
        BankParser.parameter_return retval = new BankParser.parameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID35=null;
        BankParser.type_return type34 =null;


        Object ID35_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:154:11: ( ( type ID ) -> ^( Parameter type ID ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:154:13: ( type ID )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:154:13: ( type ID )
            // /home/philosan/Dev/antlr/407_project/Bank.g:154:14: type ID
            {
            pushFollow(FOLLOW_type_in_parameter949);
            type34=type();

            state._fsp--;

            stream_type.add(type34.getTree());

            ID35=(Token)match(input,ID,FOLLOW_ID_in_parameter951);  
            stream_ID.add(ID35);


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
            // 154:23: -> ^( Parameter type ID )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:154:26: ^( Parameter type ID )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:166:1: body : ( ( '{' statements '}' ) -> ^( Body '{' statements '}' ) | statement -> ^( Body statement ) );
    public final BankParser.body_return body() throws RecognitionException {
        BankParser.body_return retval = new BankParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal36=null;
        Token char_literal38=null;
        BankParser.statements_return statements37 =null;

        BankParser.statement_return statement39 =null;


        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:167:2: ( ( '{' statements '}' ) -> ^( Body '{' statements '}' ) | statement -> ^( Body statement ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==122) ) {
                alt11=1;
            }
            else if ( (LA11_0==FOR||(LA11_0 >= ID && LA11_0 <= IFSTREAM)||LA11_0==88||(LA11_0 >= 91 && LA11_0 <= 92)||LA11_0==94||(LA11_0 >= 96 && LA11_0 <= 98)||(LA11_0 >= 100 && LA11_0 <= 102)||LA11_0==104||LA11_0==110||LA11_0==113||(LA11_0 >= 115 && LA11_0 <= 116)||LA11_0==118||LA11_0==121) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:167:4: ( '{' statements '}' )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:167:4: ( '{' statements '}' )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:167:5: '{' statements '}'
                    {
                    char_literal36=(Token)match(input,122,FOLLOW_122_in_body1002);  
                    stream_122.add(char_literal36);


                    pushFollow(FOLLOW_statements_in_body1004);
                    statements37=statements();

                    state._fsp--;

                    stream_statements.add(statements37.getTree());

                    char_literal38=(Token)match(input,124,FOLLOW_124_in_body1006);  
                    stream_124.add(char_literal38);


                    }


                    // AST REWRITE
                    // elements: statements, 122, 124
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:25: -> ^( Body '{' statements '}' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:167:28: ^( Body '{' statements '}' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Body, "Body")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_122.nextNode()
                        );

                        adaptor.addChild(root_1, stream_statements.nextTree());

                        adaptor.addChild(root_1, 
                        stream_124.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:168:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_body1025);
                    statement39=statement();

                    state._fsp--;

                    stream_statement.add(statement39.getTree());

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
                    // 168:14: -> ^( Body statement )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:168:17: ^( Body statement )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:175:1: statements : ( ( statement )* ) -> ^( Statements ( statement )* ) ;
    public final BankParser.statements_return statements() throws RecognitionException {
        BankParser.statements_return retval = new BankParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.statement_return statement40 =null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:175:12: ( ( ( statement )* ) -> ^( Statements ( statement )* ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:175:14: ( ( statement )* )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:175:14: ( ( statement )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:175:15: ( statement )*
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:175:15: ( statement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==FOR||(LA12_0 >= ID && LA12_0 <= IFSTREAM)||LA12_0==88||(LA12_0 >= 91 && LA12_0 <= 92)||LA12_0==94||(LA12_0 >= 96 && LA12_0 <= 98)||(LA12_0 >= 100 && LA12_0 <= 102)||LA12_0==104||LA12_0==110||LA12_0==113||(LA12_0 >= 115 && LA12_0 <= 116)||LA12_0==118||LA12_0==121) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:175:16: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements1067);
            	    statement40=statement();

            	    state._fsp--;

            	    stream_statement.add(statement40.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // 175:29: -> ^( Statements ( statement )* )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:175:32: ^( Statements ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Statements, "Statements")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:175:45: ( statement )*
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:182:1: statement : ( declaration -> ^( Statement declaration ) | ( assignment ';' ) -> ^( Statement assignment ';' ) | ( member_access ';' ) -> ^( Statement member_access ';' ) | control_structure -> ^( Statement control_structure ) | return_statement -> ^( Statement return_statement ) | output -> ^( Statement output ) | input -> ^( Statement input ) | delete_statement -> ^( Statement delete_statement ) );
    public final BankParser.statement_return statement() throws RecognitionException {
        BankParser.statement_return retval = new BankParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal43=null;
        Token char_literal45=null;
        BankParser.declaration_return declaration41 =null;

        BankParser.assignment_return assignment42 =null;

        BankParser.member_access_return member_access44 =null;

        BankParser.control_structure_return control_structure46 =null;

        BankParser.return_statement_return return_statement47 =null;

        BankParser.output_return output48 =null;

        BankParser.input_return input49 =null;

        BankParser.delete_statement_return delete_statement50 =null;


        Object char_literal43_tree=null;
        Object char_literal45_tree=null;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:183:5: ( declaration -> ^( Statement declaration ) | ( assignment ';' ) -> ^( Statement assignment ';' ) | ( member_access ';' ) -> ^( Statement member_access ';' ) | control_structure -> ^( Statement control_structure ) | return_statement -> ^( Statement return_statement ) | output -> ^( Statement output ) | input -> ^( Statement input ) | delete_statement -> ^( Statement delete_statement ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case IFSTREAM:
            case 88:
            case 91:
            case 98:
            case 100:
            case 102:
            case 104:
            case 113:
            case 115:
            case 118:
                {
                alt13=1;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 65:
                case 69:
                case 80:
                    {
                    alt13=2;
                    }
                    break;
                case 70:
                case 71:
                    {
                    alt13=3;
                    }
                    break;
                case ID:
                case 62:
                    {
                    alt13=1;
                    }
                    break;
                case 76:
                case 78:
                    {
                    alt13=6;
                    }
                    break;
                case 72:
                case 84:
                    {
                    alt13=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }

                }
                break;
            case FOR:
            case IF:
            case 97:
            case 116:
            case 121:
                {
                alt13=4;
                }
                break;
            case 110:
                {
                alt13=5;
                }
                break;
            case 94:
                {
                alt13=6;
                }
                break;
            case 92:
            case 101:
                {
                alt13=7;
                }
                break;
            case 96:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:183:7: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement1117);
                    declaration41=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration41.getTree());

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
                    // 183:19: -> ^( Statement declaration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:183:22: ^( Statement declaration )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:184:7: ( assignment ';' )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:184:7: ( assignment ';' )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:184:8: assignment ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement1134);
                    assignment42=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment42.getTree());

                    char_literal43=(Token)match(input,76,FOLLOW_76_in_statement1136);  
                    stream_76.add(char_literal43);


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
                    // 184:24: -> ^( Statement assignment ';' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:184:27: ^( Statement assignment ';' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:185:7: ( member_access ';' )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:185:7: ( member_access ';' )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:185:8: member_access ';'
                    {
                    pushFollow(FOLLOW_member_access_in_statement1157);
                    member_access44=member_access();

                    state._fsp--;

                    stream_member_access.add(member_access44.getTree());

                    char_literal45=(Token)match(input,76,FOLLOW_76_in_statement1159);  
                    stream_76.add(char_literal45);


                    }


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
                    // 185:27: -> ^( Statement member_access ';' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:185:30: ^( Statement member_access ';' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:186:7: control_structure
                    {
                    pushFollow(FOLLOW_control_structure_in_statement1178);
                    control_structure46=control_structure();

                    state._fsp--;

                    stream_control_structure.add(control_structure46.getTree());

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
                    // 186:25: -> ^( Statement control_structure )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:186:28: ^( Statement control_structure )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:187:7: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_statement1194);
                    return_statement47=return_statement();

                    state._fsp--;

                    stream_return_statement.add(return_statement47.getTree());

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
                    // 187:24: -> ^( Statement return_statement )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:187:27: ^( Statement return_statement )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:188:7: output
                    {
                    pushFollow(FOLLOW_output_in_statement1210);
                    output48=output();

                    state._fsp--;

                    stream_output.add(output48.getTree());

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
                    // 188:14: -> ^( Statement output )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:188:17: ^( Statement output )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:189:7: input
                    {
                    pushFollow(FOLLOW_input_in_statement1226);
                    input49=input();

                    state._fsp--;

                    stream_input.add(input49.getTree());

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
                    // 189:13: -> ^( Statement input )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:189:16: ^( Statement input )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:190:7: delete_statement
                    {
                    pushFollow(FOLLOW_delete_statement_in_statement1242);
                    delete_statement50=delete_statement();

                    state._fsp--;

                    stream_delete_statement.add(delete_statement50.getTree());

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
                    // 190:24: -> ^( Statement delete_statement )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:190:27: ^( Statement delete_statement )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:198:1: assignment : ID ( '=' | '+=' | '-=' ) ^ expression ;
    public final BankParser.assignment_return assignment() throws RecognitionException {
        BankParser.assignment_return retval = new BankParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID51=null;
        Token set52=null;
        BankParser.expression_return expression53 =null;


        Object ID51_tree=null;
        Object set52_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:198:12: ( ID ( '=' | '+=' | '-=' ) ^ expression )
            // /home/philosan/Dev/antlr/407_project/Bank.g:198:14: ID ( '=' | '+=' | '-=' ) ^ expression
            {
            root_0 = (Object)adaptor.nil();


            ID51=(Token)match(input,ID,FOLLOW_ID_in_assignment1294); 
            ID51_tree = 
            (Object)adaptor.create(ID51)
            ;
            adaptor.addChild(root_0, ID51_tree);


            set52=(Token)input.LT(1);

            set52=(Token)input.LT(1);

            if ( input.LA(1)==65||input.LA(1)==69||input.LA(1)==80 ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set52)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_expression_in_assignment1311);
            expression53=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression53.getTree());

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:205:1: delete_statement : ( 'delete' expression ';' ) -> ^( Delete 'delete' expression ';' ) ;
    public final BankParser.delete_statement_return delete_statement() throws RecognitionException {
        BankParser.delete_statement_return retval = new BankParser.delete_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal54=null;
        Token char_literal56=null;
        BankParser.expression_return expression55 =null;


        Object string_literal54_tree=null;
        Object char_literal56_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:205:18: ( ( 'delete' expression ';' ) -> ^( Delete 'delete' expression ';' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:205:20: ( 'delete' expression ';' )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:205:20: ( 'delete' expression ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:205:21: 'delete' expression ';'
            {
            string_literal54=(Token)match(input,96,FOLLOW_96_in_delete_statement1344);  
            stream_96.add(string_literal54);


            pushFollow(FOLLOW_expression_in_delete_statement1346);
            expression55=expression();

            state._fsp--;

            stream_expression.add(expression55.getTree());

            char_literal56=(Token)match(input,76,FOLLOW_76_in_delete_statement1348);  
            stream_76.add(char_literal56);


            }


            // AST REWRITE
            // elements: 96, expression, 76
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 205:46: -> ^( Delete 'delete' expression ';' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:205:49: ^( Delete 'delete' expression ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Delete, "Delete")
                , root_1);

                adaptor.addChild(root_1, 
                stream_96.nextNode()
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:212:1: return_statement : ( 'return' ( expression )? ';' ) -> ^( Return 'return' ( expression )? ';' ) ;
    public final BankParser.return_statement_return return_statement() throws RecognitionException {
        BankParser.return_statement_return retval = new BankParser.return_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal57=null;
        Token char_literal59=null;
        BankParser.expression_return expression58 =null;


        Object string_literal57_tree=null;
        Object char_literal59_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:212:18: ( ( 'return' ( expression )? ';' ) -> ^( Return 'return' ( expression )? ';' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:212:20: ( 'return' ( expression )? ';' )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:212:20: ( 'return' ( expression )? ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:212:21: 'return' ( expression )? ';'
            {
            string_literal57=(Token)match(input,110,FOLLOW_110_in_return_statement1394);  
            stream_110.add(string_literal57);


            // /home/philosan/Dev/antlr/407_project/Bank.g:212:30: ( expression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BOOLEAN||LA14_0==DIGIT||LA14_0==ID||LA14_0==54||LA14_0==56||LA14_0==60||LA14_0==64||LA14_0==68||LA14_0==106) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:212:30: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement1396);
                    expression58=expression();

                    state._fsp--;

                    stream_expression.add(expression58.getTree());

                    }
                    break;

            }


            char_literal59=(Token)match(input,76,FOLLOW_76_in_return_statement1399);  
            stream_76.add(char_literal59);


            }


            // AST REWRITE
            // elements: expression, 110, 76
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 212:47: -> ^( Return 'return' ( expression )? ';' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:212:50: ^( Return 'return' ( expression )? ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Return, "Return")
                , root_1);

                adaptor.addChild(root_1, 
                stream_110.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:212:68: ( expression )?
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:224:1: control_structure : ( if_statement -> ^( Control_Structure if_statement ) | for_loop -> ^( Control_Structure for_loop ) | while_loop -> ^( Control_Structure while_loop ) | do_while_loop -> ^( Control_Structure do_while_loop ) | switch_statement -> ^( Control_Structure switch_statement ) );
    public final BankParser.control_structure_return control_structure() throws RecognitionException {
        BankParser.control_structure_return retval = new BankParser.control_structure_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.if_statement_return if_statement60 =null;

        BankParser.for_loop_return for_loop61 =null;

        BankParser.while_loop_return while_loop62 =null;

        BankParser.do_while_loop_return do_while_loop63 =null;

        BankParser.switch_statement_return switch_statement64 =null;


        RewriteRuleSubtreeStream stream_do_while_loop=new RewriteRuleSubtreeStream(adaptor,"rule do_while_loop");
        RewriteRuleSubtreeStream stream_while_loop=new RewriteRuleSubtreeStream(adaptor,"rule while_loop");
        RewriteRuleSubtreeStream stream_if_statement=new RewriteRuleSubtreeStream(adaptor,"rule if_statement");
        RewriteRuleSubtreeStream stream_for_loop=new RewriteRuleSubtreeStream(adaptor,"rule for_loop");
        RewriteRuleSubtreeStream stream_switch_statement=new RewriteRuleSubtreeStream(adaptor,"rule switch_statement");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:225:2: ( if_statement -> ^( Control_Structure if_statement ) | for_loop -> ^( Control_Structure for_loop ) | while_loop -> ^( Control_Structure while_loop ) | do_while_loop -> ^( Control_Structure do_while_loop ) | switch_statement -> ^( Control_Structure switch_statement ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt15=1;
                }
                break;
            case FOR:
                {
                alt15=2;
                }
                break;
            case 121:
                {
                alt15=3;
                }
                break;
            case 97:
                {
                alt15=4;
                }
                break;
            case 116:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:225:4: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_control_structure1451);
                    if_statement60=if_statement();

                    state._fsp--;

                    stream_if_statement.add(if_statement60.getTree());

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
                    // 225:17: -> ^( Control_Structure if_statement )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:225:20: ^( Control_Structure if_statement )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:226:4: for_loop
                    {
                    pushFollow(FOLLOW_for_loop_in_control_structure1465);
                    for_loop61=for_loop();

                    state._fsp--;

                    stream_for_loop.add(for_loop61.getTree());

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
                    // 226:13: -> ^( Control_Structure for_loop )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:226:16: ^( Control_Structure for_loop )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:227:4: while_loop
                    {
                    pushFollow(FOLLOW_while_loop_in_control_structure1479);
                    while_loop62=while_loop();

                    state._fsp--;

                    stream_while_loop.add(while_loop62.getTree());

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
                    // 227:15: -> ^( Control_Structure while_loop )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:227:18: ^( Control_Structure while_loop )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:228:4: do_while_loop
                    {
                    pushFollow(FOLLOW_do_while_loop_in_control_structure1493);
                    do_while_loop63=do_while_loop();

                    state._fsp--;

                    stream_do_while_loop.add(do_while_loop63.getTree());

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
                    // 228:18: -> ^( Control_Structure do_while_loop )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:228:21: ^( Control_Structure do_while_loop )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:229:4: switch_statement
                    {
                    pushFollow(FOLLOW_switch_statement_in_control_structure1507);
                    switch_statement64=switch_statement();

                    state._fsp--;

                    stream_switch_statement.add(switch_statement64.getTree());

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
                    // 229:21: -> ^( Control_Structure switch_statement )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:229:24: ^( Control_Structure switch_statement )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:237:1: if_statement : ( IF '(' expression ')' body ( else_statement )? ) -> ^( If IF '(' expression ')' body ( else_statement )? ) ;
    public final BankParser.if_statement_return if_statement() throws RecognitionException {
        BankParser.if_statement_return retval = new BankParser.if_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF65=null;
        Token char_literal66=null;
        Token char_literal68=null;
        BankParser.expression_return expression67 =null;

        BankParser.body_return body69 =null;

        BankParser.else_statement_return else_statement70 =null;


        Object IF65_tree=null;
        Object char_literal66_tree=null;
        Object char_literal68_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_else_statement=new RewriteRuleSubtreeStream(adaptor,"rule else_statement");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:237:14: ( ( IF '(' expression ')' body ( else_statement )? ) -> ^( If IF '(' expression ')' body ( else_statement )? ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:237:16: ( IF '(' expression ')' body ( else_statement )? )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:237:16: ( IF '(' expression ')' body ( else_statement )? )
            // /home/philosan/Dev/antlr/407_project/Bank.g:237:17: IF '(' expression ')' body ( else_statement )?
            {
            IF65=(Token)match(input,IF,FOLLOW_IF_in_if_statement1550);  
            stream_IF.add(IF65);


            char_literal66=(Token)match(input,60,FOLLOW_60_in_if_statement1552);  
            stream_60.add(char_literal66);


            pushFollow(FOLLOW_expression_in_if_statement1554);
            expression67=expression();

            state._fsp--;

            stream_expression.add(expression67.getTree());

            char_literal68=(Token)match(input,61,FOLLOW_61_in_if_statement1556);  
            stream_61.add(char_literal68);


            pushFollow(FOLLOW_body_in_if_statement1558);
            body69=body();

            state._fsp--;

            stream_body.add(body69.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:237:44: ( else_statement )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ELSE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:237:44: else_statement
                    {
                    pushFollow(FOLLOW_else_statement_in_if_statement1560);
                    else_statement70=else_statement();

                    state._fsp--;

                    stream_else_statement.add(else_statement70.getTree());

                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: 60, else_statement, expression, body, IF, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 237:61: -> ^( If IF '(' expression ')' body ( else_statement )? )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:237:64: ^( If IF '(' expression ')' body ( else_statement )? )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:237:96: ( else_statement )?
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:244:1: else_statement : ( ELSE body ) -> ^( Else ELSE body ) ;
    public final BankParser.else_statement_return else_statement() throws RecognitionException {
        BankParser.else_statement_return retval = new BankParser.else_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE71=null;
        BankParser.body_return body72 =null;


        Object ELSE71_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:244:16: ( ( ELSE body ) -> ^( Else ELSE body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:244:18: ( ELSE body )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:244:18: ( ELSE body )
            // /home/philosan/Dev/antlr/407_project/Bank.g:244:19: ELSE body
            {
            ELSE71=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_statement1614);  
            stream_ELSE.add(ELSE71);


            pushFollow(FOLLOW_body_in_else_statement1616);
            body72=body();

            state._fsp--;

            stream_body.add(body72.getTree());

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
            // 244:30: -> ^( Else ELSE body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:244:33: ^( Else ELSE body )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:251:1: for_loop : ( FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ) -> ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ) ;
    public final BankParser.for_loop_return for_loop() throws RecognitionException {
        BankParser.for_loop_return retval = new BankParser.for_loop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FOR73=null;
        Token char_literal74=null;
        Token string_literal75=null;
        Token string_literal76=null;
        Token char_literal77=null;
        Token ID78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        BankParser.expression_return expression80 =null;

        BankParser.body_return body82 =null;


        Object FOR73_tree=null;
        Object char_literal74_tree=null;
        Object string_literal75_tree=null;
        Object string_literal76_tree=null;
        Object char_literal77_tree=null;
        Object ID78_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:251:10: ( ( FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ) -> ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:251:12: ( FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:251:12: ( FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
            // /home/philosan/Dev/antlr/407_project/Bank.g:251:13: FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body
            {
            FOR73=(Token)match(input,FOR,FOLLOW_FOR_in_for_loop1660);  
            stream_FOR.add(FOR73);


            char_literal74=(Token)match(input,60,FOLLOW_60_in_for_loop1662);  
            stream_60.add(char_literal74);


            // /home/philosan/Dev/antlr/407_project/Bank.g:251:21: ( 'const' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==93) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:251:21: 'const'
                    {
                    string_literal75=(Token)match(input,93,FOLLOW_93_in_for_loop1664);  
                    stream_93.add(string_literal75);


                    }
                    break;

            }


            string_literal76=(Token)match(input,87,FOLLOW_87_in_for_loop1667);  
            stream_87.add(string_literal76);


            // /home/philosan/Dev/antlr/407_project/Bank.g:251:37: ( '&' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==59) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:251:37: '&'
                    {
                    char_literal77=(Token)match(input,59,FOLLOW_59_in_for_loop1669);  
                    stream_59.add(char_literal77);


                    }
                    break;

            }


            ID78=(Token)match(input,ID,FOLLOW_ID_in_for_loop1672);  
            stream_ID.add(ID78);


            char_literal79=(Token)match(input,74,FOLLOW_74_in_for_loop1674);  
            stream_74.add(char_literal79);


            pushFollow(FOLLOW_expression_in_for_loop1676);
            expression80=expression();

            state._fsp--;

            stream_expression.add(expression80.getTree());

            char_literal81=(Token)match(input,61,FOLLOW_61_in_for_loop1678);  
            stream_61.add(char_literal81);


            pushFollow(FOLLOW_body_in_for_loop1680);
            body82=body();

            state._fsp--;

            stream_body.add(body82.getTree());

            }


            // AST REWRITE
            // elements: expression, FOR, 87, body, 59, ID, 74, 60, 93, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 251:70: -> ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:251:73: ^( For FOR '(' ( 'const' )? 'auto' ( '&' )? ID ':' expression ')' body )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:251:87: ( 'const' )?
                if ( stream_93.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_93.nextNode()
                    );

                }
                stream_93.reset();

                adaptor.addChild(root_1, 
                stream_87.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:251:103: ( '&' )?
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:258:1: while_loop : ( 'while' '(' while_exp ')' body ) -> ^( While 'while' '(' while_exp ')' body ) ;
    public final BankParser.while_loop_return while_loop() throws RecognitionException {
        BankParser.while_loop_return retval = new BankParser.while_loop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal83=null;
        Token char_literal84=null;
        Token char_literal86=null;
        BankParser.while_exp_return while_exp85 =null;

        BankParser.body_return body87 =null;


        Object string_literal83_tree=null;
        Object char_literal84_tree=null;
        Object char_literal86_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_while_exp=new RewriteRuleSubtreeStream(adaptor,"rule while_exp");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:258:12: ( ( 'while' '(' while_exp ')' body ) -> ^( While 'while' '(' while_exp ')' body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:258:14: ( 'while' '(' while_exp ')' body )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:258:14: ( 'while' '(' while_exp ')' body )
            // /home/philosan/Dev/antlr/407_project/Bank.g:258:15: 'while' '(' while_exp ')' body
            {
            string_literal83=(Token)match(input,121,FOLLOW_121_in_while_loop1742);  
            stream_121.add(string_literal83);


            char_literal84=(Token)match(input,60,FOLLOW_60_in_while_loop1744);  
            stream_60.add(char_literal84);


            pushFollow(FOLLOW_while_exp_in_while_loop1746);
            while_exp85=while_exp();

            state._fsp--;

            stream_while_exp.add(while_exp85.getTree());

            char_literal86=(Token)match(input,61,FOLLOW_61_in_while_loop1748);  
            stream_61.add(char_literal86);


            pushFollow(FOLLOW_body_in_while_loop1750);
            body87=body();

            state._fsp--;

            stream_body.add(body87.getTree());

            }


            // AST REWRITE
            // elements: while_exp, body, 121, 60, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 258:47: -> ^( While 'while' '(' while_exp ')' body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:258:50: ^( While 'while' '(' while_exp ')' body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(While, "While")
                , root_1);

                adaptor.addChild(root_1, 
                stream_121.nextNode()
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:265:1: while_exp : ( expression -> ^( While_EXP expression ) | file_input -> ^( While_EXP file_input ) );
    public final BankParser.while_exp_return while_exp() throws RecognitionException {
        BankParser.while_exp_return retval = new BankParser.while_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.expression_return expression88 =null;

        BankParser.file_input_return file_input89 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_file_input=new RewriteRuleSubtreeStream(adaptor,"rule file_input");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:266:2: ( expression -> ^( While_EXP expression ) | file_input -> ^( While_EXP file_input ) )
            int alt19=2;
            switch ( input.LA(1) ) {
            case BOOLEAN:
            case DIGIT:
            case 54:
            case 56:
            case 60:
            case 64:
            case 68:
            case 106:
                {
                alt19=1;
                }
                break;
            case ID:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==55||LA19_2==58||(LA19_2 >= 61 && LA19_2 <= 64)||(LA19_2 >= 67 && LA19_2 <= 68)||(LA19_2 >= 70 && LA19_2 <= 71)||LA19_2==73||LA19_2==77||LA19_2==79||(LA19_2 >= 81 && LA19_2 <= 83)||LA19_2==123) ) {
                    alt19=1;
                }
                else if ( (LA19_2==72||LA19_2==84) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;

                }
                }
                break;
            case 92:
            case 101:
                {
                alt19=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:266:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_while_exp1803);
                    expression88=expression();

                    state._fsp--;

                    stream_expression.add(expression88.getTree());

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
                    // 266:15: -> ^( While_EXP expression )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:266:18: ^( While_EXP expression )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:267:4: file_input
                    {
                    pushFollow(FOLLOW_file_input_in_while_exp1817);
                    file_input89=file_input();

                    state._fsp--;

                    stream_file_input.add(file_input89.getTree());

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
                    // 267:15: -> ^( While_EXP file_input )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:267:18: ^( While_EXP file_input )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:274:1: do_while_loop : ( 'do' body 'while' '(' expression ')' ';' ) -> ^( Do_While 'do' body 'while' '(' expression ')' ';' ) ;
    public final BankParser.do_while_loop_return do_while_loop() throws RecognitionException {
        BankParser.do_while_loop_return retval = new BankParser.do_while_loop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal90=null;
        Token string_literal92=null;
        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal96=null;
        BankParser.body_return body91 =null;

        BankParser.expression_return expression94 =null;


        Object string_literal90_tree=null;
        Object string_literal92_tree=null;
        Object char_literal93_tree=null;
        Object char_literal95_tree=null;
        Object char_literal96_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:274:15: ( ( 'do' body 'while' '(' expression ')' ';' ) -> ^( Do_While 'do' body 'while' '(' expression ')' ';' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:274:17: ( 'do' body 'while' '(' expression ')' ';' )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:274:17: ( 'do' body 'while' '(' expression ')' ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:274:18: 'do' body 'while' '(' expression ')' ';'
            {
            string_literal90=(Token)match(input,97,FOLLOW_97_in_do_while_loop1857);  
            stream_97.add(string_literal90);


            pushFollow(FOLLOW_body_in_do_while_loop1859);
            body91=body();

            state._fsp--;

            stream_body.add(body91.getTree());

            string_literal92=(Token)match(input,121,FOLLOW_121_in_do_while_loop1861);  
            stream_121.add(string_literal92);


            char_literal93=(Token)match(input,60,FOLLOW_60_in_do_while_loop1863);  
            stream_60.add(char_literal93);


            pushFollow(FOLLOW_expression_in_do_while_loop1865);
            expression94=expression();

            state._fsp--;

            stream_expression.add(expression94.getTree());

            char_literal95=(Token)match(input,61,FOLLOW_61_in_do_while_loop1867);  
            stream_61.add(char_literal95);


            char_literal96=(Token)match(input,76,FOLLOW_76_in_do_while_loop1869);  
            stream_76.add(char_literal96);


            }


            // AST REWRITE
            // elements: 121, expression, 76, 97, 60, 61, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 274:60: -> ^( Do_While 'do' body 'while' '(' expression ')' ';' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:274:63: ^( Do_While 'do' body 'while' '(' expression ')' ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Do_While, "Do_While")
                , root_1);

                adaptor.addChild(root_1, 
                stream_97.nextNode()
                );

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_1, 
                stream_121.nextNode()
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:281:1: switch_statement : ( 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' ) -> ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' ) ;
    public final BankParser.switch_statement_return switch_statement() throws RecognitionException {
        BankParser.switch_statement_return retval = new BankParser.switch_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal97=null;
        Token char_literal98=null;
        Token char_literal100=null;
        Token char_literal101=null;
        Token char_literal104=null;
        BankParser.expression_return expression99 =null;

        BankParser.switch_case_return switch_case102 =null;

        BankParser.default_case_return default_case103 =null;


        Object string_literal97_tree=null;
        Object char_literal98_tree=null;
        Object char_literal100_tree=null;
        Object char_literal101_tree=null;
        Object char_literal104_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_switch_case=new RewriteRuleSubtreeStream(adaptor,"rule switch_case");
        RewriteRuleSubtreeStream stream_default_case=new RewriteRuleSubtreeStream(adaptor,"rule default_case");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:281:18: ( ( 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' ) -> ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:281:20: ( 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:281:20: ( 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:281:21: 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}'
            {
            string_literal97=(Token)match(input,116,FOLLOW_116_in_switch_statement1923);  
            stream_116.add(string_literal97);


            char_literal98=(Token)match(input,60,FOLLOW_60_in_switch_statement1925);  
            stream_60.add(char_literal98);


            pushFollow(FOLLOW_expression_in_switch_statement1927);
            expression99=expression();

            state._fsp--;

            stream_expression.add(expression99.getTree());

            char_literal100=(Token)match(input,61,FOLLOW_61_in_switch_statement1929);  
            stream_61.add(char_literal100);


            char_literal101=(Token)match(input,122,FOLLOW_122_in_switch_statement1931);  
            stream_122.add(char_literal101);


            // /home/philosan/Dev/antlr/407_project/Bank.g:281:53: ( switch_case )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==90) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:281:53: switch_case
            	    {
            	    pushFollow(FOLLOW_switch_case_in_switch_statement1933);
            	    switch_case102=switch_case();

            	    state._fsp--;

            	    stream_switch_case.add(switch_case102.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            // /home/philosan/Dev/antlr/407_project/Bank.g:281:66: ( default_case )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==95) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:281:66: default_case
                    {
                    pushFollow(FOLLOW_default_case_in_switch_statement1936);
                    default_case103=default_case();

                    state._fsp--;

                    stream_default_case.add(default_case103.getTree());

                    }
                    break;

            }


            char_literal104=(Token)match(input,124,FOLLOW_124_in_switch_statement1939);  
            stream_124.add(char_literal104);


            }


            // AST REWRITE
            // elements: switch_case, 61, 60, 122, 124, default_case, 116, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 281:85: -> ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:281:88: ^( Switch 'switch' '(' expression ')' '{' ( switch_case )+ ( default_case )? '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Switch, "Switch")
                , root_1);

                adaptor.addChild(root_1, 
                stream_116.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_122.nextNode()
                );

                if ( !(stream_switch_case.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_switch_case.hasNext() ) {
                    adaptor.addChild(root_1, stream_switch_case.nextTree());

                }
                stream_switch_case.reset();

                // /home/philosan/Dev/antlr/407_project/Bank.g:281:142: ( default_case )?
                if ( stream_default_case.hasNext() ) {
                    adaptor.addChild(root_1, stream_default_case.nextTree());

                }
                stream_default_case.reset();

                adaptor.addChild(root_1, 
                stream_124.nextNode()
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:288:1: switch_case : ( 'case' expression ':' statements ( break_statement )? ) -> ^( Switch_Case 'case' expression ':' statements ( break_statement )? ) ;
    public final BankParser.switch_case_return switch_case() throws RecognitionException {
        BankParser.switch_case_return retval = new BankParser.switch_case_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal105=null;
        Token char_literal107=null;
        BankParser.expression_return expression106 =null;

        BankParser.statements_return statements108 =null;

        BankParser.break_statement_return break_statement109 =null;


        Object string_literal105_tree=null;
        Object char_literal107_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_break_statement=new RewriteRuleSubtreeStream(adaptor,"rule break_statement");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:288:13: ( ( 'case' expression ':' statements ( break_statement )? ) -> ^( Switch_Case 'case' expression ':' statements ( break_statement )? ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:288:15: ( 'case' expression ':' statements ( break_statement )? )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:288:15: ( 'case' expression ':' statements ( break_statement )? )
            // /home/philosan/Dev/antlr/407_project/Bank.g:288:16: 'case' expression ':' statements ( break_statement )?
            {
            string_literal105=(Token)match(input,90,FOLLOW_90_in_switch_case1997);  
            stream_90.add(string_literal105);


            pushFollow(FOLLOW_expression_in_switch_case1999);
            expression106=expression();

            state._fsp--;

            stream_expression.add(expression106.getTree());

            char_literal107=(Token)match(input,74,FOLLOW_74_in_switch_case2001);  
            stream_74.add(char_literal107);


            pushFollow(FOLLOW_statements_in_switch_case2003);
            statements108=statements();

            state._fsp--;

            stream_statements.add(statements108.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:288:49: ( break_statement )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==89) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:288:49: break_statement
                    {
                    pushFollow(FOLLOW_break_statement_in_switch_case2005);
                    break_statement109=break_statement();

                    state._fsp--;

                    stream_break_statement.add(break_statement109.getTree());

                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: 90, 74, break_statement, expression, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 288:67: -> ^( Switch_Case 'case' expression ':' statements ( break_statement )? )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:288:70: ^( Switch_Case 'case' expression ':' statements ( break_statement )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Switch_Case, "Switch_Case")
                , root_1);

                adaptor.addChild(root_1, 
                stream_90.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, 
                stream_74.nextNode()
                );

                adaptor.addChild(root_1, stream_statements.nextTree());

                // /home/philosan/Dev/antlr/407_project/Bank.g:288:117: ( break_statement )?
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:295:1: default_case : ( 'default' ':' statements ) -> ^( Default_Case 'default' ':' statements ) ;
    public final BankParser.default_case_return default_case() throws RecognitionException {
        BankParser.default_case_return retval = new BankParser.default_case_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal110=null;
        Token char_literal111=null;
        BankParser.statements_return statements112 =null;


        Object string_literal110_tree=null;
        Object char_literal111_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:295:14: ( ( 'default' ':' statements ) -> ^( Default_Case 'default' ':' statements ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:295:16: ( 'default' ':' statements )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:295:16: ( 'default' ':' statements )
            // /home/philosan/Dev/antlr/407_project/Bank.g:295:17: 'default' ':' statements
            {
            string_literal110=(Token)match(input,95,FOLLOW_95_in_default_case2057);  
            stream_95.add(string_literal110);


            char_literal111=(Token)match(input,74,FOLLOW_74_in_default_case2059);  
            stream_74.add(char_literal111);


            pushFollow(FOLLOW_statements_in_default_case2061);
            statements112=statements();

            state._fsp--;

            stream_statements.add(statements112.getTree());

            }


            // AST REWRITE
            // elements: 74, 95, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 295:43: -> ^( Default_Case 'default' ':' statements )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:295:46: ^( Default_Case 'default' ':' statements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Default_Case, "Default_Case")
                , root_1);

                adaptor.addChild(root_1, 
                stream_95.nextNode()
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:302:1: break_statement : ( 'break' ';' ) -> ^( Break 'break' ';' ) ;
    public final BankParser.break_statement_return break_statement() throws RecognitionException {
        BankParser.break_statement_return retval = new BankParser.break_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal113=null;
        Token char_literal114=null;

        Object string_literal113_tree=null;
        Object char_literal114_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:302:17: ( ( 'break' ';' ) -> ^( Break 'break' ';' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:302:19: ( 'break' ';' )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:302:19: ( 'break' ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:302:20: 'break' ';'
            {
            string_literal113=(Token)match(input,89,FOLLOW_89_in_break_statement2107);  
            stream_89.add(string_literal113);


            char_literal114=(Token)match(input,76,FOLLOW_76_in_break_statement2109);  
            stream_76.add(char_literal114);


            }


            // AST REWRITE
            // elements: 76, 89
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 302:33: -> ^( Break 'break' ';' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:302:36: ^( Break 'break' ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Break, "Break")
                , root_1);

                adaptor.addChild(root_1, 
                stream_89.nextNode()
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:314:1: type : ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) ) ( '*' )? ;
    public final BankParser.type_return type() throws RecognitionException {
        BankParser.type_return retval = new BankParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID117=null;
        Token char_literal118=null;
        BankParser.base_type_return base_type115 =null;

        BankParser.vector_type_return vector_type116 =null;


        Object ID117_tree=null;
        Object char_literal118_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_base_type=new RewriteRuleSubtreeStream(adaptor,"rule base_type");
        RewriteRuleSubtreeStream stream_vector_type=new RewriteRuleSubtreeStream(adaptor,"rule vector_type");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:314:6: ( ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) ) ( '*' )? )
            // /home/philosan/Dev/antlr/407_project/Bank.g:314:8: ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) ) ( '*' )?
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:314:8: ( base_type -> ^( Type base_type ) | vector_type -> ^( Type vector_type ) | ID -> ^( Type ID ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 88:
            case 91:
            case 98:
            case 100:
            case 102:
            case 104:
            case 113:
            case 115:
                {
                alt23=1;
                }
                break;
            case 118:
                {
                alt23=2;
                }
                break;
            case ID:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:315:2: base_type
                    {
                    pushFollow(FOLLOW_base_type_in_type2160);
                    base_type115=base_type();

                    state._fsp--;

                    stream_base_type.add(base_type115.getTree());

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
                    // 315:12: -> ^( Type base_type )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:315:15: ^( Type base_type )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:316:4: vector_type
                    {
                    pushFollow(FOLLOW_vector_type_in_type2174);
                    vector_type116=vector_type();

                    state._fsp--;

                    stream_vector_type.add(vector_type116.getTree());

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
                    // 316:16: -> ^( Type vector_type )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:316:19: ^( Type vector_type )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:317:4: ID
                    {
                    ID117=(Token)match(input,ID,FOLLOW_ID_in_type2188);  
                    stream_ID.add(ID117);


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
                    // 317:7: -> ^( Type ID )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:317:10: ^( Type ID )
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


            // /home/philosan/Dev/antlr/407_project/Bank.g:318:4: ( '*' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==62) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:318:5: '*'
                    {
                    char_literal118=(Token)match(input,62,FOLLOW_62_in_type2202);  
                    stream_62.add(char_literal118);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:325:1: return_type : ( base_type -> ^( Return_Type base_type ) | 'void' -> ^( Return_Type 'void' ) );
    public final BankParser.return_type_return return_type() throws RecognitionException {
        BankParser.return_type_return retval = new BankParser.return_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal120=null;
        BankParser.base_type_return base_type119 =null;


        Object string_literal120_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_base_type=new RewriteRuleSubtreeStream(adaptor,"rule base_type");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:325:13: ( base_type -> ^( Return_Type base_type ) | 'void' -> ^( Return_Type 'void' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==88||LA25_0==91||LA25_0==98||LA25_0==100||LA25_0==102||LA25_0==104||LA25_0==113||LA25_0==115) ) {
                alt25=1;
            }
            else if ( (LA25_0==120) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:326:4: base_type
                    {
                    pushFollow(FOLLOW_base_type_in_return_type2240);
                    base_type119=base_type();

                    state._fsp--;

                    stream_base_type.add(base_type119.getTree());

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
                    // 326:14: -> ^( Return_Type base_type )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:326:17: ^( Return_Type base_type )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:327:4: 'void'
                    {
                    string_literal120=(Token)match(input,120,FOLLOW_120_in_return_type2253);  
                    stream_120.add(string_literal120);


                    // AST REWRITE
                    // elements: 120
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:11: -> ^( Return_Type 'void' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:327:14: ^( Return_Type 'void' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Return_Type, "Return_Type")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_120.nextNode()
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:335:1: base_type : ( 'int' | 'double' | 'string' | 'bool' | 'char' | 'long' | 'short' | 'float' );
    public final BankParser.base_type_return base_type() throws RecognitionException {
        BankParser.base_type_return retval = new BankParser.base_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set121=null;

        Object set121_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:335:11: ( 'int' | 'double' | 'string' | 'bool' | 'char' | 'long' | 'short' | 'float' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:
            {
            root_0 = (Object)adaptor.nil();


            set121=(Token)input.LT(1);

            if ( input.LA(1)==88||input.LA(1)==91||input.LA(1)==98||input.LA(1)==100||input.LA(1)==102||input.LA(1)==104||input.LA(1)==113||input.LA(1)==115 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set121)
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
//        catch (MismatchedTokenException e) {
//             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
//        }
//        catch (NoViableAltException e) {
//             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
//        }
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:342:1: vector_type : 'vector' '<' type '>' ;
    public final BankParser.vector_type_return vector_type() throws RecognitionException {
        BankParser.vector_type_return retval = new BankParser.vector_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal122=null;
        Token char_literal123=null;
        Token char_literal125=null;
        BankParser.type_return type124 =null;


        Object string_literal122_tree=null;
        Object char_literal123_tree=null;
        Object char_literal125_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:342:13: ( 'vector' '<' type '>' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:342:15: 'vector' '<' type '>'
            {
            root_0 = (Object)adaptor.nil();


            string_literal122=(Token)match(input,118,FOLLOW_118_in_vector_type2355); 
            string_literal122_tree = 
            (Object)adaptor.create(string_literal122)
            ;
            adaptor.addChild(root_0, string_literal122_tree);


            char_literal123=(Token)match(input,77,FOLLOW_77_in_vector_type2357); 
            char_literal123_tree = 
            (Object)adaptor.create(char_literal123)
            ;
            adaptor.addChild(root_0, char_literal123_tree);


            pushFollow(FOLLOW_type_in_vector_type2359);
            type124=type();

            state._fsp--;

            adaptor.addChild(root_0, type124.getTree());

            char_literal125=(Token)match(input,82,FOLLOW_82_in_vector_type2361); 
            char_literal125_tree = 
            (Object)adaptor.create(char_literal125)
            ;
            adaptor.addChild(root_0, char_literal125_tree);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:354:1: declaration : ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) ) ';' ;
    public final BankParser.declaration_return declaration() throws RecognitionException {
        BankParser.declaration_return retval = new BankParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal128=null;
        BankParser.variable_declaration_return variable_declaration126 =null;

        BankParser.file_declaration_return file_declaration127 =null;


        Object char_literal128_tree=null;
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule variable_declaration");
        RewriteRuleSubtreeStream stream_file_declaration=new RewriteRuleSubtreeStream(adaptor,"rule file_declaration");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:355:2: ( ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) ) ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:355:4: ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) ) ';'
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:355:4: ( variable_declaration -> ^( Declaration variable_declaration ) | file_declaration -> ^( Declaration file_declaration ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID||LA26_0==88||LA26_0==91||LA26_0==98||LA26_0==100||LA26_0==102||LA26_0==104||LA26_0==113||LA26_0==115||LA26_0==118) ) {
                alt26=1;
            }
            else if ( (LA26_0==IFSTREAM) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:355:6: variable_declaration
                    {
                    pushFollow(FOLLOW_variable_declaration_in_declaration2400);
                    variable_declaration126=variable_declaration();

                    state._fsp--;

                    stream_variable_declaration.add(variable_declaration126.getTree());

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
                    // 355:27: -> ^( Declaration variable_declaration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:355:30: ^( Declaration variable_declaration )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:356:4: file_declaration
                    {
                    pushFollow(FOLLOW_file_declaration_in_declaration2415);
                    file_declaration127=file_declaration();

                    state._fsp--;

                    stream_file_declaration.add(file_declaration127.getTree());

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
                    // 356:21: -> ^( Declaration file_declaration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:356:24: ^( Declaration file_declaration )
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


            char_literal128=(Token)match(input,76,FOLLOW_76_in_declaration2429);  
            stream_76.add(char_literal128);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:364:1: variable_declaration : type variables ;
    public final BankParser.variable_declaration_return variable_declaration() throws RecognitionException {
        BankParser.variable_declaration_return retval = new BankParser.variable_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.type_return type129 =null;

        BankParser.variables_return variables130 =null;



        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:364:22: ( type variables )
            // /home/philosan/Dev/antlr/407_project/Bank.g:364:24: type variables
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_variable_declaration2460);
            type129=type();

            state._fsp--;

            adaptor.addChild(root_0, type129.getTree());

            pushFollow(FOLLOW_variables_in_variable_declaration2462);
            variables130=variables();

            state._fsp--;

            adaptor.addChild(root_0, variables130.getTree());

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:371:1: variables : declarator ( ( ',' ) ^ declarator )* ;
    public final BankParser.variables_return variables() throws RecognitionException {
        BankParser.variables_return retval = new BankParser.variables_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal132=null;
        BankParser.declarator_return declarator131 =null;

        BankParser.declarator_return declarator133 =null;


        Object char_literal132_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:371:11: ( declarator ( ( ',' ) ^ declarator )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:371:13: declarator ( ( ',' ) ^ declarator )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_declarator_in_variables2494);
            declarator131=declarator();

            state._fsp--;

            adaptor.addChild(root_0, declarator131.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:371:24: ( ( ',' ) ^ declarator )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==66) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:371:26: ( ',' ) ^ declarator
            	    {
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:371:26: ( ',' )
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:371:27: ','
            	    {
            	    char_literal132=(Token)match(input,66,FOLLOW_66_in_variables2499); 
            	    char_literal132_tree = 
            	    (Object)adaptor.create(char_literal132)
            	    ;
            	    adaptor.addChild(root_0, char_literal132_tree);


            	    }


            	    pushFollow(FOLLOW_declarator_in_variables2503);
            	    declarator133=declarator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarator133.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:378:1: declarator : qualified_id ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )? ;
    public final BankParser.declarator_return declarator() throws RecognitionException {
        BankParser.declarator_return retval = new BankParser.declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal135=null;
        Token char_literal137=null;
        Token char_literal139=null;
        BankParser.qualified_id_return qualified_id134 =null;

        BankParser.expression_return expression136 =null;

        BankParser.arguments_return arguments138 =null;


        Object char_literal135_tree=null;
        Object char_literal137_tree=null;
        Object char_literal139_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_qualified_id=new RewriteRuleSubtreeStream(adaptor,"rule qualified_id");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:378:12: ( qualified_id ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )? )
            // /home/philosan/Dev/antlr/407_project/Bank.g:378:14: qualified_id ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )?
            {
            pushFollow(FOLLOW_qualified_id_in_declarator2537);
            qualified_id134=qualified_id();

            state._fsp--;

            stream_qualified_id.add(qualified_id134.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:379:2: ( ( '=' expression ) -> ^( Assign '=' expression ) | ( '(' ( arguments )? ')' ) -> ^( Call '(' ( arguments )? ')' ) )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==80) ) {
                alt29=1;
            }
            else if ( (LA29_0==60) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:379:4: ( '=' expression )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:379:4: ( '=' expression )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:379:6: '=' expression
                    {
                    char_literal135=(Token)match(input,80,FOLLOW_80_in_declarator2545);  
                    stream_80.add(char_literal135);


                    pushFollow(FOLLOW_expression_in_declarator2547);
                    expression136=expression();

                    state._fsp--;

                    stream_expression.add(expression136.getTree());

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
                    // 379:23: -> ^( Assign '=' expression )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:379:26: ^( Assign '=' expression )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:380:4: ( '(' ( arguments )? ')' )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:380:4: ( '(' ( arguments )? ')' )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:380:6: '(' ( arguments )? ')'
                    {
                    char_literal137=(Token)match(input,60,FOLLOW_60_in_declarator2567);  
                    stream_60.add(char_literal137);


                    // /home/philosan/Dev/antlr/407_project/Bank.g:380:10: ( arguments )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==BOOLEAN||LA28_0==DIGIT||LA28_0==ID||LA28_0==54||LA28_0==56||LA28_0==60||LA28_0==64||LA28_0==68||LA28_0==106) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/philosan/Dev/antlr/407_project/Bank.g:380:10: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_declarator2569);
                            arguments138=arguments();

                            state._fsp--;

                            stream_arguments.add(arguments138.getTree());

                            }
                            break;

                    }


                    char_literal139=(Token)match(input,61,FOLLOW_61_in_declarator2572);  
                    stream_61.add(char_literal139);


                    }


                    // AST REWRITE
                    // elements: 60, arguments, 61
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 380:27: -> ^( Call '(' ( arguments )? ')' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:380:30: ^( Call '(' ( arguments )? ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Call, "Call")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_60.nextNode()
                        );

                        // /home/philosan/Dev/antlr/407_project/Bank.g:380:41: ( arguments )?
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:388:1: qualified_id : ID ( '::' ID )? -> ^( Qualified ID ( '::' ID )? ) ;
    public final BankParser.qualified_id_return qualified_id() throws RecognitionException {
        BankParser.qualified_id_return retval = new BankParser.qualified_id_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID140=null;
        Token string_literal141=null;
        Token ID142=null;

        Object ID140_tree=null;
        Object string_literal141_tree=null;
        Object ID142_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:389:5: ( ID ( '::' ID )? -> ^( Qualified ID ( '::' ID )? ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:389:7: ID ( '::' ID )?
            {
            ID140=(Token)match(input,ID,FOLLOW_ID_in_qualified_id2629);  
            stream_ID.add(ID140);


            // /home/philosan/Dev/antlr/407_project/Bank.g:389:10: ( '::' ID )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==75) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:389:12: '::' ID
                    {
                    string_literal141=(Token)match(input,75,FOLLOW_75_in_qualified_id2633);  
                    stream_75.add(string_literal141);


                    ID142=(Token)match(input,ID,FOLLOW_ID_in_qualified_id2635);  
                    stream_ID.add(ID142);


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
            // 390:7: -> ^( Qualified ID ( '::' ID )? )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:390:10: ^( Qualified ID ( '::' ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Qualified, "Qualified")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:390:25: ( '::' ID )?
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:398:1: file_declaration : IFSTREAM ID '(' string_literal ')' ;
    public final BankParser.file_declaration_return file_declaration() throws RecognitionException {
        BankParser.file_declaration_return retval = new BankParser.file_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IFSTREAM143=null;
        Token ID144=null;
        Token char_literal145=null;
        Token char_literal147=null;
        BankParser.string_literal_return string_literal146 =null;


        Object IFSTREAM143_tree=null;
        Object ID144_tree=null;
        Object char_literal145_tree=null;
        Object char_literal147_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:398:18: ( IFSTREAM ID '(' string_literal ')' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:398:20: IFSTREAM ID '(' string_literal ')'
            {
            root_0 = (Object)adaptor.nil();


            IFSTREAM143=(Token)match(input,IFSTREAM,FOLLOW_IFSTREAM_in_file_declaration2701); 
            IFSTREAM143_tree = 
            (Object)adaptor.create(IFSTREAM143)
            ;
            adaptor.addChild(root_0, IFSTREAM143_tree);


            ID144=(Token)match(input,ID,FOLLOW_ID_in_file_declaration2704); 
            ID144_tree = 
            (Object)adaptor.create(ID144)
            ;
            adaptor.addChild(root_0, ID144_tree);


            char_literal145=(Token)match(input,60,FOLLOW_60_in_file_declaration2706); 
            char_literal145_tree = 
            (Object)adaptor.create(char_literal145)
            ;
            adaptor.addChild(root_0, char_literal145_tree);


            pushFollow(FOLLOW_string_literal_in_file_declaration2708);
            string_literal146=string_literal();

            state._fsp--;

            adaptor.addChild(root_0, string_literal146.getTree());

            char_literal147=(Token)match(input,61,FOLLOW_61_in_file_declaration2710); 
            char_literal147_tree = 
            (Object)adaptor.create(char_literal147)
            ;
            adaptor.addChild(root_0, char_literal147_tree);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:405:1: arguments : expression ( ( ',' ) ^ expression )* ;
    public final BankParser.arguments_return arguments() throws RecognitionException {
        BankParser.arguments_return retval = new BankParser.arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal149=null;
        BankParser.expression_return expression148 =null;

        BankParser.expression_return expression150 =null;


        Object char_literal149_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:405:11: ( expression ( ( ',' ) ^ expression )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:405:13: expression ( ( ',' ) ^ expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_arguments2742);
            expression148=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression148.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:405:24: ( ( ',' ) ^ expression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==66) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:405:25: ( ',' ) ^ expression
            	    {
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:405:25: ( ',' )
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:405:26: ','
            	    {
            	    char_literal149=(Token)match(input,66,FOLLOW_66_in_arguments2746); 
            	    char_literal149_tree = 
            	    (Object)adaptor.create(char_literal149)
            	    ;
            	    adaptor.addChild(root_0, char_literal149_tree);


            	    }


            	    pushFollow(FOLLOW_expression_in_arguments2750);
            	    expression150=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression150.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:417:1: class_definition : ( CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ) -> ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ) ;
    public final BankParser.class_definition_return class_definition() throws RecognitionException {
        BankParser.class_definition_return retval = new BankParser.class_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS151=null;
        Token ID152=null;
        Token char_literal153=null;
        Token ID155=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token char_literal159=null;
        BankParser.class_visibility_return class_visibility154 =null;

        BankParser.class_members_return class_members157 =null;


        Object CLASS151_tree=null;
        Object ID152_tree=null;
        Object char_literal153_tree=null;
        Object ID155_tree=null;
        Object char_literal156_tree=null;
        Object char_literal158_tree=null;
        Object char_literal159_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_class_visibility=new RewriteRuleSubtreeStream(adaptor,"rule class_visibility");
        RewriteRuleSubtreeStream stream_class_members=new RewriteRuleSubtreeStream(adaptor,"rule class_members");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:417:18: ( ( CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ) -> ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:417:20: ( CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:417:20: ( CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:417:21: CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';'
            {
            CLASS151=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_definition2790);  
            stream_CLASS.add(CLASS151);


            ID152=(Token)match(input,ID,FOLLOW_ID_in_class_definition2792);  
            stream_ID.add(ID152);


            // /home/philosan/Dev/antlr/407_project/Bank.g:417:30: ( ':' class_visibility ID )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==74) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:417:31: ':' class_visibility ID
                    {
                    char_literal153=(Token)match(input,74,FOLLOW_74_in_class_definition2795);  
                    stream_74.add(char_literal153);


                    pushFollow(FOLLOW_class_visibility_in_class_definition2797);
                    class_visibility154=class_visibility();

                    state._fsp--;

                    stream_class_visibility.add(class_visibility154.getTree());

                    ID155=(Token)match(input,ID,FOLLOW_ID_in_class_definition2799);  
                    stream_ID.add(ID155);


                    }
                    break;

            }


            char_literal156=(Token)match(input,122,FOLLOW_122_in_class_definition2803);  
            stream_122.add(char_literal156);


            pushFollow(FOLLOW_class_members_in_class_definition2805);
            class_members157=class_members();

            state._fsp--;

            stream_class_members.add(class_members157.getTree());

            char_literal158=(Token)match(input,124,FOLLOW_124_in_class_definition2807);  
            stream_124.add(char_literal158);


            char_literal159=(Token)match(input,76,FOLLOW_76_in_class_definition2809);  
            stream_76.add(char_literal159);


            }


            // AST REWRITE
            // elements: ID, 124, class_visibility, 74, class_members, 76, ID, CLASS, 122
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 417:84: -> ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:417:87: ^( Class CLASS ID ( ':' class_visibility ID )? '{' class_members '}' ';' )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:417:104: ( ':' class_visibility ID )?
                if ( stream_class_visibility.hasNext()||stream_74.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_74.nextNode()
                    );

                    adaptor.addChild(root_1, stream_class_visibility.nextTree());

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_class_visibility.reset();
                stream_74.reset();
                stream_ID.reset();

                adaptor.addChild(root_1, 
                stream_122.nextNode()
                );

                adaptor.addChild(root_1, stream_class_members.nextTree());

                adaptor.addChild(root_1, 
                stream_124.nextNode()
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:424:1: class_members : ( ( class_member )* ) -> ^( Class_Members ( class_member )* ) ;
    public final BankParser.class_members_return class_members() throws RecognitionException {
        BankParser.class_members_return retval = new BankParser.class_members_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.class_member_return class_member160 =null;


        RewriteRuleSubtreeStream stream_class_member=new RewriteRuleSubtreeStream(adaptor,"rule class_member");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:424:15: ( ( ( class_member )* ) -> ^( Class_Members ( class_member )* ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:424:17: ( ( class_member )* )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:424:17: ( ( class_member )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:424:18: ( class_member )*
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:424:18: ( class_member )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ID||LA33_0==IFSTREAM||LA33_0==88||LA33_0==91||LA33_0==98||LA33_0==100||LA33_0==102||LA33_0==104||(LA33_0 >= 107 && LA33_0 <= 109)||(LA33_0 >= 113 && LA33_0 <= 115)||(LA33_0 >= 118 && LA33_0 <= 120)||LA33_0==125) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:424:19: class_member
            	    {
            	    pushFollow(FOLLOW_class_member_in_class_members2870);
            	    class_member160=class_member();

            	    state._fsp--;

            	    stream_class_member.add(class_member160.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
            // 424:35: -> ^( Class_Members ( class_member )* )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:424:38: ^( Class_Members ( class_member )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Class_Members, "Class_Members")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:424:54: ( class_member )*
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:431:1: class_member : ( class_visibility ':' )? ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) ) ;
    public final BankParser.class_member_return class_member() throws RecognitionException {
        BankParser.class_member_return retval = new BankParser.class_member_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal162=null;
        BankParser.class_visibility_return class_visibility161 =null;

        BankParser.class_declaration_return class_declaration163 =null;

        BankParser.constructor_return constructor164 =null;

        BankParser.class_function_definition_return class_function_definition165 =null;

        BankParser.destructor_return destructor166 =null;


        Object char_literal162_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_constructor=new RewriteRuleSubtreeStream(adaptor,"rule constructor");
        RewriteRuleSubtreeStream stream_destructor=new RewriteRuleSubtreeStream(adaptor,"rule destructor");
        RewriteRuleSubtreeStream stream_class_visibility=new RewriteRuleSubtreeStream(adaptor,"rule class_visibility");
        RewriteRuleSubtreeStream stream_class_declaration=new RewriteRuleSubtreeStream(adaptor,"rule class_declaration");
        RewriteRuleSubtreeStream stream_class_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule class_function_definition");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:431:14: ( ( class_visibility ':' )? ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:431:16: ( class_visibility ':' )? ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:431:16: ( class_visibility ':' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0 >= 107 && LA34_0 <= 109)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:431:17: class_visibility ':'
                    {
                    pushFollow(FOLLOW_class_visibility_in_class_member2917);
                    class_visibility161=class_visibility();

                    state._fsp--;

                    stream_class_visibility.add(class_visibility161.getTree());

                    char_literal162=(Token)match(input,74,FOLLOW_74_in_class_member2919);  
                    stream_74.add(char_literal162);


                    }
                    break;

            }


            // /home/philosan/Dev/antlr/407_project/Bank.g:432:2: ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) )
            int alt35=4;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:432:4: class_declaration
                    {
                    pushFollow(FOLLOW_class_declaration_in_class_member2927);
                    class_declaration163=class_declaration();

                    state._fsp--;

                    stream_class_declaration.add(class_declaration163.getTree());

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
                    // 432:22: -> ^( Class_Member class_declaration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:432:25: ^( Class_Member class_declaration )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:433:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_class_member2941);
                    constructor164=constructor();

                    state._fsp--;

                    stream_constructor.add(constructor164.getTree());

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
                    // 433:16: -> ^( Class_Member constructor )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:433:19: ^( Class_Member constructor )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:434:4: class_function_definition
                    {
                    pushFollow(FOLLOW_class_function_definition_in_class_member2955);
                    class_function_definition165=class_function_definition();

                    state._fsp--;

                    stream_class_function_definition.add(class_function_definition165.getTree());

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
                    // 434:30: -> ^( Class_Member class_function_definition )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:434:33: ^( Class_Member class_function_definition )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:435:4: destructor
                    {
                    pushFollow(FOLLOW_destructor_in_class_member2969);
                    destructor166=destructor();

                    state._fsp--;

                    stream_destructor.add(destructor166.getTree());

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
                    // 435:15: -> ^( Class_Member destructor )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:435:18: ^( Class_Member destructor )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:443:1: class_declaration : ( 'static' )? declaration ;
    public final BankParser.class_declaration_return class_declaration() throws RecognitionException {
        BankParser.class_declaration_return retval = new BankParser.class_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal167=null;
        BankParser.declaration_return declaration168 =null;


        Object string_literal167_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:443:19: ( ( 'static' )? declaration )
            // /home/philosan/Dev/antlr/407_project/Bank.g:443:21: ( 'static' )? declaration
            {
            root_0 = (Object)adaptor.nil();


            // /home/philosan/Dev/antlr/407_project/Bank.g:443:21: ( 'static' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==114) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:443:21: 'static'
                    {
                    string_literal167=(Token)match(input,114,FOLLOW_114_in_class_declaration3012); 
                    string_literal167_tree = 
                    (Object)adaptor.create(string_literal167)
                    ;
                    adaptor.addChild(root_0, string_literal167_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_declaration_in_class_declaration3015);
            declaration168=declaration();

            state._fsp--;

            adaptor.addChild(root_0, declaration168.getTree());

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:450:1: class_visibility : ( 'public' | 'private' | 'protected' ) ;
    public final BankParser.class_visibility_return class_visibility() throws RecognitionException {
        BankParser.class_visibility_return retval = new BankParser.class_visibility_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set169=null;

        Object set169_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:450:18: ( ( 'public' | 'private' | 'protected' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:
            {
            root_0 = (Object)adaptor.nil();


            set169=(Token)input.LT(1);

            if ( (input.LA(1) >= 107 && input.LA(1) <= 109) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set169)
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
//        catch (MismatchedTokenException e) {
//             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
//        }
//        catch (NoViableAltException e) {
//             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
//        }
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:457:1: constructor : ( ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) -> ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) ;
    public final BankParser.constructor_return constructor() throws RecognitionException {
        BankParser.constructor_return retval = new BankParser.constructor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal170=null;
        Token ID171=null;
        Token char_literal172=null;
        Token char_literal174=null;
        Token char_literal175=null;
        BankParser.parameters_return parameters173 =null;

        BankParser.member_init_list_return member_init_list176 =null;

        BankParser.class_function_body_return class_function_body177 =null;


        Object string_literal170_tree=null;
        Object ID171_tree=null;
        Object char_literal172_tree=null;
        Object char_literal174_tree=null;
        Object char_literal175_tree=null;
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_class_function_body=new RewriteRuleSubtreeStream(adaptor,"rule class_function_body");
        RewriteRuleSubtreeStream stream_member_init_list=new RewriteRuleSubtreeStream(adaptor,"rule member_init_list");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:457:13: ( ( ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) -> ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:457:15: ( ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:457:15: ( ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            // /home/philosan/Dev/antlr/407_project/Bank.g:457:16: ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:457:16: ( 'virtual' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==119) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:457:16: 'virtual'
                    {
                    string_literal170=(Token)match(input,119,FOLLOW_119_in_constructor3089);  
                    stream_119.add(string_literal170);


                    }
                    break;

            }


            ID171=(Token)match(input,ID,FOLLOW_ID_in_constructor3092);  
            stream_ID.add(ID171);


            char_literal172=(Token)match(input,60,FOLLOW_60_in_constructor3094);  
            stream_60.add(char_literal172);


            // /home/philosan/Dev/antlr/407_project/Bank.g:457:34: ( parameters )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ID||LA38_0==88||LA38_0==91||LA38_0==98||LA38_0==100||LA38_0==102||LA38_0==104||LA38_0==113||LA38_0==115||LA38_0==118) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:457:34: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_constructor3096);
                    parameters173=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters173.getTree());

                    }
                    break;

            }


            char_literal174=(Token)match(input,61,FOLLOW_61_in_constructor3099);  
            stream_61.add(char_literal174);


            // /home/philosan/Dev/antlr/407_project/Bank.g:457:50: ( ':' member_init_list )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==74) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:457:52: ':' member_init_list
                    {
                    char_literal175=(Token)match(input,74,FOLLOW_74_in_constructor3103);  
                    stream_74.add(char_literal175);


                    pushFollow(FOLLOW_member_init_list_in_constructor3105);
                    member_init_list176=member_init_list();

                    state._fsp--;

                    stream_member_init_list.add(member_init_list176.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_constructor3110);
            class_function_body177=class_function_body();

            state._fsp--;

            stream_class_function_body.add(class_function_body177.getTree());

            }


            // AST REWRITE
            // elements: 74, 119, parameters, 60, 61, ID, class_function_body, member_init_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 458:3: -> ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:458:6: ^( Constructor ( 'virtual' )? ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Constructor, "Constructor")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:458:20: ( 'virtual' )?
                if ( stream_119.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_119.nextNode()
                    );

                }
                stream_119.reset();

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:458:38: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:458:54: ( ':' member_init_list )?
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:466:1: destructor : ( ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) -> ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) ;
    public final BankParser.destructor_return destructor() throws RecognitionException {
        BankParser.destructor_return retval = new BankParser.destructor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal178=null;
        Token char_literal179=null;
        Token ID180=null;
        Token char_literal181=null;
        Token char_literal183=null;
        Token char_literal184=null;
        BankParser.parameters_return parameters182 =null;

        BankParser.member_init_list_return member_init_list185 =null;

        BankParser.class_function_body_return class_function_body186 =null;


        Object string_literal178_tree=null;
        Object char_literal179_tree=null;
        Object ID180_tree=null;
        Object char_literal181_tree=null;
        Object char_literal183_tree=null;
        Object char_literal184_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_class_function_body=new RewriteRuleSubtreeStream(adaptor,"rule class_function_body");
        RewriteRuleSubtreeStream stream_member_init_list=new RewriteRuleSubtreeStream(adaptor,"rule member_init_list");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:466:12: ( ( ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) -> ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:466:14: ( ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:466:14: ( ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            // /home/philosan/Dev/antlr/407_project/Bank.g:466:15: ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:466:15: ( 'virtual' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==119) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:466:15: 'virtual'
                    {
                    string_literal178=(Token)match(input,119,FOLLOW_119_in_destructor3179);  
                    stream_119.add(string_literal178);


                    }
                    break;

            }


            char_literal179=(Token)match(input,125,FOLLOW_125_in_destructor3182);  
            stream_125.add(char_literal179);


            ID180=(Token)match(input,ID,FOLLOW_ID_in_destructor3184);  
            stream_ID.add(ID180);


            char_literal181=(Token)match(input,60,FOLLOW_60_in_destructor3186);  
            stream_60.add(char_literal181);


            // /home/philosan/Dev/antlr/407_project/Bank.g:466:37: ( parameters )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ID||LA41_0==88||LA41_0==91||LA41_0==98||LA41_0==100||LA41_0==102||LA41_0==104||LA41_0==113||LA41_0==115||LA41_0==118) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:466:37: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_destructor3188);
                    parameters182=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters182.getTree());

                    }
                    break;

            }


            char_literal183=(Token)match(input,61,FOLLOW_61_in_destructor3191);  
            stream_61.add(char_literal183);


            // /home/philosan/Dev/antlr/407_project/Bank.g:466:53: ( ':' member_init_list )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==74) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:466:55: ':' member_init_list
                    {
                    char_literal184=(Token)match(input,74,FOLLOW_74_in_destructor3195);  
                    stream_74.add(char_literal184);


                    pushFollow(FOLLOW_member_init_list_in_destructor3197);
                    member_init_list185=member_init_list();

                    state._fsp--;

                    stream_member_init_list.add(member_init_list185.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_destructor3203);
            class_function_body186=class_function_body();

            state._fsp--;

            stream_class_function_body.add(class_function_body186.getTree());

            }


            // AST REWRITE
            // elements: parameters, 119, class_function_body, 125, ID, 74, member_init_list, 61, 60
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 467:3: -> ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:467:6: ^( Destructor ( 'virtual' )? '~' ID '(' ( parameters )? ')' ( ':' member_init_list )? class_function_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Destructor, "Destructor")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:467:19: ( 'virtual' )?
                if ( stream_119.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_119.nextNode()
                    );

                }
                stream_119.reset();

                adaptor.addChild(root_1, 
                stream_125.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:467:41: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:467:57: ( ':' member_init_list )?
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
    // $ANTLR end "destructor"


    public static class member_init_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "member_init_list"
    // /home/philosan/Dev/antlr/407_project/Bank.g:474:1: member_init_list : function_call ( ( ',' ) ^ function_call )* ;
    public final BankParser.member_init_list_return member_init_list() throws RecognitionException {
        BankParser.member_init_list_return retval = new BankParser.member_init_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal188=null;
        BankParser.function_call_return function_call187 =null;

        BankParser.function_call_return function_call189 =null;


        Object char_literal188_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:474:18: ( function_call ( ( ',' ) ^ function_call )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:474:20: function_call ( ( ',' ) ^ function_call )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_function_call_in_member_init_list3272);
            function_call187=function_call();

            state._fsp--;

            adaptor.addChild(root_0, function_call187.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:474:34: ( ( ',' ) ^ function_call )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==66) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:474:36: ( ',' ) ^ function_call
            	    {
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:474:36: ( ',' )
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:474:37: ','
            	    {
            	    char_literal188=(Token)match(input,66,FOLLOW_66_in_member_init_list3277); 
            	    char_literal188_tree = 
            	    (Object)adaptor.create(char_literal188)
            	    ;
            	    adaptor.addChild(root_0, char_literal188_tree);


            	    }


            	    pushFollow(FOLLOW_function_call_in_member_init_list3281);
            	    function_call189=function_call();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_call189.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:481:1: class_function_definition : ( ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body ) -> ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body ) ;
    public final BankParser.class_function_definition_return class_function_definition() throws RecognitionException {
        BankParser.class_function_definition_return retval = new BankParser.class_function_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal190=null;
        Token ID192=null;
        Token char_literal193=null;
        Token char_literal195=null;
        Token string_literal196=null;
        BankParser.return_type_return return_type191 =null;

        BankParser.parameters_return parameters194 =null;

        BankParser.class_function_body_return class_function_body197 =null;


        Object string_literal190_tree=null;
        Object ID192_tree=null;
        Object char_literal193_tree=null;
        Object char_literal195_tree=null;
        Object string_literal196_tree=null;
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_class_function_body=new RewriteRuleSubtreeStream(adaptor,"rule class_function_body");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:481:27: ( ( ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body ) -> ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:481:29: ( ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:481:29: ( ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body )
            // /home/philosan/Dev/antlr/407_project/Bank.g:481:30: ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:481:30: ( 'virtual' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==119) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:481:30: 'virtual'
                    {
                    string_literal190=(Token)match(input,119,FOLLOW_119_in_class_function_definition3316);  
                    stream_119.add(string_literal190);


                    }
                    break;

            }


            pushFollow(FOLLOW_return_type_in_class_function_definition3319);
            return_type191=return_type();

            state._fsp--;

            stream_return_type.add(return_type191.getTree());

            ID192=(Token)match(input,ID,FOLLOW_ID_in_class_function_definition3321);  
            stream_ID.add(ID192);


            char_literal193=(Token)match(input,60,FOLLOW_60_in_class_function_definition3323);  
            stream_60.add(char_literal193);


            // /home/philosan/Dev/antlr/407_project/Bank.g:481:60: ( parameters )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ID||LA45_0==88||LA45_0==91||LA45_0==98||LA45_0==100||LA45_0==102||LA45_0==104||LA45_0==113||LA45_0==115||LA45_0==118) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:481:60: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_class_function_definition3325);
                    parameters194=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters194.getTree());

                    }
                    break;

            }


            char_literal195=(Token)match(input,61,FOLLOW_61_in_class_function_definition3328);  
            stream_61.add(char_literal195);


            // /home/philosan/Dev/antlr/407_project/Bank.g:481:76: ( 'const' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==93) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:481:76: 'const'
                    {
                    string_literal196=(Token)match(input,93,FOLLOW_93_in_class_function_definition3330);  
                    stream_93.add(string_literal196);


                    }
                    break;

            }


            pushFollow(FOLLOW_class_function_body_in_class_function_definition3334);
            class_function_body197=class_function_body();

            state._fsp--;

            stream_class_function_body.add(class_function_body197.getTree());

            }


            // AST REWRITE
            // elements: 119, 60, ID, parameters, class_function_body, 61, 93, return_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 482:3: -> ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:482:6: ^( Function ( 'virtual' )? return_type ID '(' ( parameters )? ')' ( 'const' )? class_function_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Function, "Function")
                , root_1);

                // /home/philosan/Dev/antlr/407_project/Bank.g:482:17: ( 'virtual' )?
                if ( stream_119.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_119.nextNode()
                    );

                }
                stream_119.reset();

                adaptor.addChild(root_1, stream_return_type.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_60.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:482:47: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                // /home/philosan/Dev/antlr/407_project/Bank.g:482:63: ( 'const' )?
                if ( stream_93.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_93.nextNode()
                    );

                }
                stream_93.reset();

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:489:1: class_function_body : ( '{' statements '}' ) -> ^( Body '{' statements '}' ) ;
    public final BankParser.class_function_body_return class_function_body() throws RecognitionException {
        BankParser.class_function_body_return retval = new BankParser.class_function_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal198=null;
        Token char_literal200=null;
        BankParser.statements_return statements199 =null;


        Object char_literal198_tree=null;
        Object char_literal200_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:489:20: ( ( '{' statements '}' ) -> ^( Body '{' statements '}' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:489:22: ( '{' statements '}' )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:489:22: ( '{' statements '}' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:489:23: '{' statements '}'
            {
            char_literal198=(Token)match(input,122,FOLLOW_122_in_class_function_body3396);  
            stream_122.add(char_literal198);


            pushFollow(FOLLOW_statements_in_class_function_body3398);
            statements199=statements();

            state._fsp--;

            stream_statements.add(statements199.getTree());

            char_literal200=(Token)match(input,124,FOLLOW_124_in_class_function_body3400);  
            stream_124.add(char_literal200);


            }


            // AST REWRITE
            // elements: 122, 124, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 489:43: -> ^( Body '{' statements '}' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:489:46: ^( Body '{' statements '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Body, "Body")
                , root_1);

                adaptor.addChild(root_1, 
                stream_122.nextNode()
                );

                adaptor.addChild(root_1, stream_statements.nextTree());

                adaptor.addChild(root_1, 
                stream_124.nextNode()
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:501:1: expression : and_exp ( ( '||' ) ^ and_exp )* ;
    public final BankParser.expression_return expression() throws RecognitionException {
        BankParser.expression_return retval = new BankParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal202=null;
        BankParser.and_exp_return and_exp201 =null;

        BankParser.and_exp_return and_exp203 =null;


        Object string_literal202_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:501:11: ( and_exp ( ( '||' ) ^ and_exp )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:501:14: and_exp ( ( '||' ) ^ and_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_exp_in_expression3449);
            and_exp201=and_exp();

            state._fsp--;

            adaptor.addChild(root_0, and_exp201.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:501:22: ( ( '||' ) ^ and_exp )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==123) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:501:23: ( '||' ) ^ and_exp
            	    {
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:501:23: ( '||' )
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:501:24: '||'
            	    {
            	    string_literal202=(Token)match(input,123,FOLLOW_123_in_expression3453); 
            	    string_literal202_tree = 
            	    (Object)adaptor.create(string_literal202)
            	    ;
            	    adaptor.addChild(root_0, string_literal202_tree);


            	    }


            	    pushFollow(FOLLOW_and_exp_in_expression3457);
            	    and_exp203=and_exp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_exp203.getTree());

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
    // $ANTLR end "expression"


    public static class and_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_exp"
    // /home/philosan/Dev/antlr/407_project/Bank.g:508:1: and_exp : equality_exp ( ( '&&' ) ^ equality_exp )* ;
    public final BankParser.and_exp_return and_exp() throws RecognitionException {
        BankParser.and_exp_return retval = new BankParser.and_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal205=null;
        BankParser.equality_exp_return equality_exp204 =null;

        BankParser.equality_exp_return equality_exp206 =null;


        Object string_literal205_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:508:9: ( equality_exp ( ( '&&' ) ^ equality_exp )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:508:11: equality_exp ( ( '&&' ) ^ equality_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_exp_in_and_exp3490);
            equality_exp204=equality_exp();

            state._fsp--;

            adaptor.addChild(root_0, equality_exp204.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:508:24: ( ( '&&' ) ^ equality_exp )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==58) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:508:25: ( '&&' ) ^ equality_exp
            	    {
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:508:25: ( '&&' )
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:508:26: '&&'
            	    {
            	    string_literal205=(Token)match(input,58,FOLLOW_58_in_and_exp3494); 
            	    string_literal205_tree = 
            	    (Object)adaptor.create(string_literal205)
            	    ;
            	    adaptor.addChild(root_0, string_literal205_tree);


            	    }


            	    pushFollow(FOLLOW_equality_exp_in_and_exp3498);
            	    equality_exp206=equality_exp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equality_exp206.getTree());

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
    // $ANTLR end "and_exp"


    public static class equality_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_exp"
    // /home/philosan/Dev/antlr/407_project/Bank.g:515:1: equality_exp : relational_exp ( ( '==' | '!=' ) ^ relational_exp )* ;
    public final BankParser.equality_exp_return equality_exp() throws RecognitionException {
        BankParser.equality_exp_return retval = new BankParser.equality_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set208=null;
        BankParser.relational_exp_return relational_exp207 =null;

        BankParser.relational_exp_return relational_exp209 =null;


        Object set208_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:515:14: ( relational_exp ( ( '==' | '!=' ) ^ relational_exp )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:515:16: relational_exp ( ( '==' | '!=' ) ^ relational_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_exp_in_equality_exp3532);
            relational_exp207=relational_exp();

            state._fsp--;

            adaptor.addChild(root_0, relational_exp207.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:515:31: ( ( '==' | '!=' ) ^ relational_exp )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==55||LA49_0==81) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:515:32: ( '==' | '!=' ) ^ relational_exp
            	    {
            	    set208=(Token)input.LT(1);

            	    set208=(Token)input.LT(1);

            	    if ( input.LA(1)==55||input.LA(1)==81 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set208)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relational_exp_in_equality_exp3544);
            	    relational_exp209=relational_exp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relational_exp209.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:522:1: relational_exp : unary_exp ( ( '<' | '>' | '<=' | '>=' ) ^ unary_exp )* ;
    public final BankParser.relational_exp_return relational_exp() throws RecognitionException {
        BankParser.relational_exp_return retval = new BankParser.relational_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set211=null;
        BankParser.unary_exp_return unary_exp210 =null;

        BankParser.unary_exp_return unary_exp212 =null;


        Object set211_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:522:16: ( unary_exp ( ( '<' | '>' | '<=' | '>=' ) ^ unary_exp )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:522:18: unary_exp ( ( '<' | '>' | '<=' | '>=' ) ^ unary_exp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unary_exp_in_relational_exp3578);
            unary_exp210=unary_exp();

            state._fsp--;

            adaptor.addChild(root_0, unary_exp210.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:522:28: ( ( '<' | '>' | '<=' | '>=' ) ^ unary_exp )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==77||LA50_0==79||(LA50_0 >= 82 && LA50_0 <= 83)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:522:29: ( '<' | '>' | '<=' | '>=' ) ^ unary_exp
            	    {
            	    set211=(Token)input.LT(1);

            	    set211=(Token)input.LT(1);

            	    if ( input.LA(1)==77||input.LA(1)==79||(input.LA(1) >= 82 && input.LA(1) <= 83) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set211)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_exp_in_relational_exp3598);
            	    unary_exp212=unary_exp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_exp212.getTree());

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
    // $ANTLR end "relational_exp"


    public static class unary_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_exp"
    // /home/philosan/Dev/antlr/407_project/Bank.g:529:1: unary_exp : ( arithmetic_expression -> ^( Arithmetic_Expression arithmetic_expression ) | ( '!' unary_exp ) -> ^( Not '!' unary_exp ) );
    public final BankParser.unary_exp_return unary_exp() throws RecognitionException {
        BankParser.unary_exp_return retval = new BankParser.unary_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal214=null;
        BankParser.arithmetic_expression_return arithmetic_expression213 =null;

        BankParser.unary_exp_return unary_exp215 =null;


        Object char_literal214_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_arithmetic_expression=new RewriteRuleSubtreeStream(adaptor,"rule arithmetic_expression");
        RewriteRuleSubtreeStream stream_unary_exp=new RewriteRuleSubtreeStream(adaptor,"rule unary_exp");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:530:2: ( arithmetic_expression -> ^( Arithmetic_Expression arithmetic_expression ) | ( '!' unary_exp ) -> ^( Not '!' unary_exp ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==BOOLEAN||LA51_0==DIGIT||LA51_0==ID||LA51_0==56||LA51_0==60||LA51_0==64||LA51_0==68||LA51_0==106) ) {
                alt51=1;
            }
            else if ( (LA51_0==54) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:531:2: arithmetic_expression
                    {
                    pushFollow(FOLLOW_arithmetic_expression_in_unary_exp3636);
                    arithmetic_expression213=arithmetic_expression();

                    state._fsp--;

                    stream_arithmetic_expression.add(arithmetic_expression213.getTree());

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
                    // 531:24: -> ^( Arithmetic_Expression arithmetic_expression )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:531:27: ^( Arithmetic_Expression arithmetic_expression )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:532:4: ( '!' unary_exp )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:532:4: ( '!' unary_exp )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:532:5: '!' unary_exp
                    {
                    char_literal214=(Token)match(input,54,FOLLOW_54_in_unary_exp3651);  
                    stream_54.add(char_literal214);


                    pushFollow(FOLLOW_unary_exp_in_unary_exp3653);
                    unary_exp215=unary_exp();

                    state._fsp--;

                    stream_unary_exp.add(unary_exp215.getTree());

                    }


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
                    // 532:20: -> ^( Not '!' unary_exp )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:532:23: ^( Not '!' unary_exp )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:539:1: arithmetic_expression : term ( ( '+' | '-' ) ^ term )* ;
    public final BankParser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
        BankParser.arithmetic_expression_return retval = new BankParser.arithmetic_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set217=null;
        BankParser.term_return term216 =null;

        BankParser.term_return term218 =null;


        Object set217_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:539:23: ( term ( ( '+' | '-' ) ^ term )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:539:25: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_arithmetic_expression3696);
            term216=term();

            state._fsp--;

            adaptor.addChild(root_0, term216.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:539:30: ( ( '+' | '-' ) ^ term )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==63||LA52_0==67) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:539:31: ( '+' | '-' ) ^ term
            	    {
            	    set217=(Token)input.LT(1);

            	    set217=(Token)input.LT(1);

            	    if ( input.LA(1)==63||input.LA(1)==67 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set217)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_arithmetic_expression3708);
            	    term218=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term218.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:546:1: term : factor ( ( '*' | '/' ) ^ factor )* ;
    public final BankParser.term_return term() throws RecognitionException {
        BankParser.term_return retval = new BankParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set220=null;
        BankParser.factor_return factor219 =null;

        BankParser.factor_return factor221 =null;


        Object set220_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:546:6: ( factor ( ( '*' | '/' ) ^ factor )* )
            // /home/philosan/Dev/antlr/407_project/Bank.g:546:8: factor ( ( '*' | '/' ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term3745);
            factor219=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor219.getTree());

            // /home/philosan/Dev/antlr/407_project/Bank.g:546:15: ( ( '*' | '/' ) ^ factor )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==62||LA53_0==73) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:546:16: ( '*' | '/' ) ^ factor
            	    {
            	    set220=(Token)input.LT(1);

            	    set220=(Token)input.LT(1);

            	    if ( input.LA(1)==62||input.LA(1)==73 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set220)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term3757);
            	    factor221=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor221.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:553:1: factor : ( ( '(' arithmetic_expression ')' ) -> ^( Factor '(' arithmetic_expression ')' ) | ID -> ^( Factor ID ) | change -> ^( Factor change ) | true_false -> ^( Factor true_false ) | integer_literal -> ^( Factor integer_literal ) | string_literal -> ^( Factor string_literal ) | object_decleration -> ^( Factor object_decleration ) | member_access -> ^( Factor member_access ) );
    public final BankParser.factor_return factor() throws RecognitionException {
        BankParser.factor_return retval = new BankParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal222=null;
        Token char_literal224=null;
        Token ID225=null;
        BankParser.arithmetic_expression_return arithmetic_expression223 =null;

        BankParser.change_return change226 =null;

        BankParser.true_false_return true_false227 =null;

        BankParser.integer_literal_return integer_literal228 =null;

        BankParser.string_literal_return string_literal229 =null;

        BankParser.object_decleration_return object_decleration230 =null;

        BankParser.member_access_return member_access231 =null;


        Object char_literal222_tree=null;
        Object char_literal224_tree=null;
        Object ID225_tree=null;
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
            // /home/philosan/Dev/antlr/407_project/Bank.g:554:2: ( ( '(' arithmetic_expression ')' ) -> ^( Factor '(' arithmetic_expression ')' ) | ID -> ^( Factor ID ) | change -> ^( Factor change ) | true_false -> ^( Factor true_false ) | integer_literal -> ^( Factor integer_literal ) | string_literal -> ^( Factor string_literal ) | object_decleration -> ^( Factor object_decleration ) | member_access -> ^( Factor member_access ) )
            int alt54=8;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt54=1;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 64:
                case 68:
                    {
                    alt54=3;
                    }
                    break;
                case 70:
                case 71:
                    {
                    alt54=8;
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
                case 123:
                    {
                    alt54=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;

                }

                }
                break;
            case 64:
            case 68:
                {
                alt54=3;
                }
                break;
            case BOOLEAN:
                {
                alt54=4;
                }
                break;
            case DIGIT:
                {
                alt54=5;
                }
                break;
            case 56:
                {
                alt54=6;
                }
                break;
            case 106:
                {
                alt54=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:554:4: ( '(' arithmetic_expression ')' )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:554:4: ( '(' arithmetic_expression ')' )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:554:5: '(' arithmetic_expression ')'
                    {
                    char_literal222=(Token)match(input,60,FOLLOW_60_in_factor3794);  
                    stream_60.add(char_literal222);


                    pushFollow(FOLLOW_arithmetic_expression_in_factor3796);
                    arithmetic_expression223=arithmetic_expression();

                    state._fsp--;

                    stream_arithmetic_expression.add(arithmetic_expression223.getTree());

                    char_literal224=(Token)match(input,61,FOLLOW_61_in_factor3798);  
                    stream_61.add(char_literal224);


                    }


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
                    // 554:36: -> ^( Factor '(' arithmetic_expression ')' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:554:39: ^( Factor '(' arithmetic_expression ')' )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:555:4: ID
                    {
                    ID225=(Token)match(input,ID,FOLLOW_ID_in_factor3817);  
                    stream_ID.add(ID225);


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
                    // 555:7: -> ^( Factor ID )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:555:10: ^( Factor ID )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:556:4: change
                    {
                    pushFollow(FOLLOW_change_in_factor3831);
                    change226=change();

                    state._fsp--;

                    stream_change.add(change226.getTree());

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
                    // 556:11: -> ^( Factor change )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:556:14: ^( Factor change )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:557:4: true_false
                    {
                    pushFollow(FOLLOW_true_false_in_factor3845);
                    true_false227=true_false();

                    state._fsp--;

                    stream_true_false.add(true_false227.getTree());

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
                    // 557:15: -> ^( Factor true_false )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:557:18: ^( Factor true_false )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:558:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_factor3859);
                    integer_literal228=integer_literal();

                    state._fsp--;

                    stream_integer_literal.add(integer_literal228.getTree());

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
                    // 558:20: -> ^( Factor integer_literal )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:558:23: ^( Factor integer_literal )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:559:4: string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_factor3873);
                    string_literal229=string_literal();

                    state._fsp--;

                    stream_string_literal.add(string_literal229.getTree());

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
                    // 559:19: -> ^( Factor string_literal )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:559:22: ^( Factor string_literal )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:560:4: object_decleration
                    {
                    pushFollow(FOLLOW_object_decleration_in_factor3887);
                    object_decleration230=object_decleration();

                    state._fsp--;

                    stream_object_decleration.add(object_decleration230.getTree());

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
                    // 560:23: -> ^( Factor object_decleration )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:560:26: ^( Factor object_decleration )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:561:4: member_access
                    {
                    pushFollow(FOLLOW_member_access_in_factor3901);
                    member_access231=member_access();

                    state._fsp--;

                    stream_member_access.add(member_access231.getTree());

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
                    // 561:18: -> ^( Factor member_access )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:561:21: ^( Factor member_access )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:569:1: true_false : BOOLEAN ;
    public final BankParser.true_false_return true_false() throws RecognitionException {
        BankParser.true_false_return retval = new BankParser.true_false_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOOLEAN232=null;

        Object BOOLEAN232_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:569:12: ( BOOLEAN )
            // /home/philosan/Dev/antlr/407_project/Bank.g:569:14: BOOLEAN
            {
            root_0 = (Object)adaptor.nil();


            BOOLEAN232=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_true_false3942); 
            BOOLEAN232_tree = 
            (Object)adaptor.create(BOOLEAN232)
            ;
            adaptor.addChild(root_0, BOOLEAN232_tree);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:576:1: member_access : ( function_access -> ^( Member_Access function_access ) | pointer_access -> ^( Member_Access pointer_access ) );
    public final BankParser.member_access_return member_access() throws RecognitionException {
        BankParser.member_access_return retval = new BankParser.member_access_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        BankParser.function_access_return function_access233 =null;

        BankParser.pointer_access_return pointer_access234 =null;


        RewriteRuleSubtreeStream stream_function_access=new RewriteRuleSubtreeStream(adaptor,"rule function_access");
        RewriteRuleSubtreeStream stream_pointer_access=new RewriteRuleSubtreeStream(adaptor,"rule pointer_access");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:577:2: ( function_access -> ^( Member_Access function_access ) | pointer_access -> ^( Member_Access pointer_access ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==71) ) {
                    int LA55_2 = input.LA(3);

                    if ( (LA55_2==ID) ) {
                        alt55=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA55_1==70) ) {
                    alt55=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:578:2: function_access
                    {
                    pushFollow(FOLLOW_function_access_in_member_access3978);
                    function_access233=function_access();

                    state._fsp--;

                    stream_function_access.add(function_access233.getTree());

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
                    // 578:18: -> ^( Member_Access function_access )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:578:21: ^( Member_Access function_access )
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:579:4: pointer_access
                    {
                    pushFollow(FOLLOW_pointer_access_in_member_access3992);
                    pointer_access234=pointer_access();

                    state._fsp--;

                    stream_pointer_access.add(pointer_access234.getTree());

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
                    // 579:19: -> ^( Member_Access pointer_access )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:579:22: ^( Member_Access pointer_access )
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:587:1: function_access : ID '.' ID ( '(' ( arguments )? ')' )? ;
    public final BankParser.function_access_return function_access() throws RecognitionException {
        BankParser.function_access_return retval = new BankParser.function_access_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID235=null;
        Token char_literal236=null;
        Token ID237=null;
        Token char_literal238=null;
        Token char_literal240=null;
        BankParser.arguments_return arguments239 =null;


        Object ID235_tree=null;
        Object char_literal236_tree=null;
        Object ID237_tree=null;
        Object char_literal238_tree=null;
        Object char_literal240_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:587:17: ( ID '.' ID ( '(' ( arguments )? ')' )? )
            // /home/philosan/Dev/antlr/407_project/Bank.g:587:19: ID '.' ID ( '(' ( arguments )? ')' )?
            {
            root_0 = (Object)adaptor.nil();


            ID235=(Token)match(input,ID,FOLLOW_ID_in_function_access4034); 
            ID235_tree = 
            (Object)adaptor.create(ID235)
            ;
            adaptor.addChild(root_0, ID235_tree);


            char_literal236=(Token)match(input,71,FOLLOW_71_in_function_access4036); 
            char_literal236_tree = 
            (Object)adaptor.create(char_literal236)
            ;
            adaptor.addChild(root_0, char_literal236_tree);


            ID237=(Token)match(input,ID,FOLLOW_ID_in_function_access4038); 
            ID237_tree = 
            (Object)adaptor.create(ID237)
            ;
            adaptor.addChild(root_0, ID237_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:587:30: ( '(' ( arguments )? ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==60) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:587:32: '(' ( arguments )? ')'
                    {
                    char_literal238=(Token)match(input,60,FOLLOW_60_in_function_access4043); 
                    char_literal238_tree = 
                    (Object)adaptor.create(char_literal238)
                    ;
                    adaptor.addChild(root_0, char_literal238_tree);


                    // /home/philosan/Dev/antlr/407_project/Bank.g:587:36: ( arguments )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==BOOLEAN||LA56_0==DIGIT||LA56_0==ID||LA56_0==54||LA56_0==56||LA56_0==60||LA56_0==64||LA56_0==68||LA56_0==106) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /home/philosan/Dev/antlr/407_project/Bank.g:587:36: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_function_access4045);
                            arguments239=arguments();

                            state._fsp--;

                            adaptor.addChild(root_0, arguments239.getTree());

                            }
                            break;

                    }


                    char_literal240=(Token)match(input,61,FOLLOW_61_in_function_access4048); 
                    char_literal240_tree = 
                    (Object)adaptor.create(char_literal240)
                    ;
                    adaptor.addChild(root_0, char_literal240_tree);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:594:1: pointer_access : ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )? ;
    public final BankParser.pointer_access_return pointer_access() throws RecognitionException {
        BankParser.pointer_access_return retval = new BankParser.pointer_access_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID241=null;
        Token set242=null;
        Token ID243=null;
        Token char_literal244=null;
        Token char_literal246=null;
        BankParser.arguments_return arguments245 =null;


        Object ID241_tree=null;
        Object set242_tree=null;
        Object ID243_tree=null;
        Object char_literal244_tree=null;
        Object char_literal246_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:594:16: ( ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )? )
            // /home/philosan/Dev/antlr/407_project/Bank.g:594:18: ID ( '->' | '.' ) ID ( '(' ( arguments )? ')' )?
            {
            root_0 = (Object)adaptor.nil();


            ID241=(Token)match(input,ID,FOLLOW_ID_in_pointer_access4083); 
            ID241_tree = 
            (Object)adaptor.create(ID241)
            ;
            adaptor.addChild(root_0, ID241_tree);


            set242=(Token)input.LT(1);

            if ( (input.LA(1) >= 70 && input.LA(1) <= 71) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set242)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            ID243=(Token)match(input,ID,FOLLOW_ID_in_pointer_access4093); 
            ID243_tree = 
            (Object)adaptor.create(ID243)
            ;
            adaptor.addChild(root_0, ID243_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:594:37: ( '(' ( arguments )? ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==60) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:594:38: '(' ( arguments )? ')'
                    {
                    char_literal244=(Token)match(input,60,FOLLOW_60_in_pointer_access4096); 
                    char_literal244_tree = 
                    (Object)adaptor.create(char_literal244)
                    ;
                    adaptor.addChild(root_0, char_literal244_tree);


                    // /home/philosan/Dev/antlr/407_project/Bank.g:594:42: ( arguments )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==BOOLEAN||LA58_0==DIGIT||LA58_0==ID||LA58_0==54||LA58_0==56||LA58_0==60||LA58_0==64||LA58_0==68||LA58_0==106) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /home/philosan/Dev/antlr/407_project/Bank.g:594:42: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_pointer_access4098);
                            arguments245=arguments();

                            state._fsp--;

                            adaptor.addChild(root_0, arguments245.getTree());

                            }
                            break;

                    }


                    char_literal246=(Token)match(input,61,FOLLOW_61_in_pointer_access4101); 
                    char_literal246_tree = 
                    (Object)adaptor.create(char_literal246)
                    ;
                    adaptor.addChild(root_0, char_literal246_tree);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:601:1: function_call : ( ID '(' ( arguments )? ')' ) -> ^( Call ID '(' ( arguments )? ')' ) ;
    public final BankParser.function_call_return function_call() throws RecognitionException {
        BankParser.function_call_return retval = new BankParser.function_call_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID247=null;
        Token char_literal248=null;
        Token char_literal250=null;
        BankParser.arguments_return arguments249 =null;


        Object ID247_tree=null;
        Object char_literal248_tree=null;
        Object char_literal250_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:601:15: ( ( ID '(' ( arguments )? ')' ) -> ^( Call ID '(' ( arguments )? ')' ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:601:17: ( ID '(' ( arguments )? ')' )
            {
            // /home/philosan/Dev/antlr/407_project/Bank.g:601:17: ( ID '(' ( arguments )? ')' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:601:18: ID '(' ( arguments )? ')'
            {
            ID247=(Token)match(input,ID,FOLLOW_ID_in_function_call4136);  
            stream_ID.add(ID247);


            char_literal248=(Token)match(input,60,FOLLOW_60_in_function_call4138);  
            stream_60.add(char_literal248);


            // /home/philosan/Dev/antlr/407_project/Bank.g:601:25: ( arguments )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==BOOLEAN||LA60_0==DIGIT||LA60_0==ID||LA60_0==54||LA60_0==56||LA60_0==60||LA60_0==64||LA60_0==68||LA60_0==106) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:601:25: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_function_call4140);
                    arguments249=arguments();

                    state._fsp--;

                    stream_arguments.add(arguments249.getTree());

                    }
                    break;

            }


            char_literal250=(Token)match(input,61,FOLLOW_61_in_function_call4143);  
            stream_61.add(char_literal250);


            }


            // AST REWRITE
            // elements: arguments, ID, 61, 60
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 601:41: -> ^( Call ID '(' ( arguments )? ')' )
            {
                // /home/philosan/Dev/antlr/407_project/Bank.g:601:44: ^( Call ID '(' ( arguments )? ')' )
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

                // /home/philosan/Dev/antlr/407_project/Bank.g:601:58: ( arguments )?
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:608:1: object_decleration : 'new' function_call ;
    public final BankParser.object_decleration_return object_decleration() throws RecognitionException {
        BankParser.object_decleration_return retval = new BankParser.object_decleration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal251=null;
        BankParser.function_call_return function_call252 =null;


        Object string_literal251_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:608:20: ( 'new' function_call )
            // /home/philosan/Dev/antlr/407_project/Bank.g:608:22: 'new' function_call
            {
            root_0 = (Object)adaptor.nil();


            string_literal251=(Token)match(input,106,FOLLOW_106_in_object_decleration4190); 
            string_literal251_tree = 
            (Object)adaptor.create(string_literal251)
            ;
            adaptor.addChild(root_0, string_literal251_tree);


            pushFollow(FOLLOW_function_call_in_object_decleration4192);
            function_call252=function_call();

            state._fsp--;

            adaptor.addChild(root_0, function_call252.getTree());

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
    // /home/philosan/Dev/antlr/407_project/Bank.g:615:1: change : ( ( '++' | '--' ) ID | ID ( '++' | '--' ) ) ;
    public final BankParser.change_return change() throws RecognitionException {
        BankParser.change_return retval = new BankParser.change_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set253=null;
        Token ID254=null;
        Token ID255=null;
        Token set256=null;

        Object set253_tree=null;
        Object ID254_tree=null;
        Object ID255_tree=null;
        Object set256_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:615:8: ( ( ( '++' | '--' ) ID | ID ( '++' | '--' ) ) )
            // /home/philosan/Dev/antlr/407_project/Bank.g:615:10: ( ( '++' | '--' ) ID | ID ( '++' | '--' ) )
            {
            root_0 = (Object)adaptor.nil();


            // /home/philosan/Dev/antlr/407_project/Bank.g:615:10: ( ( '++' | '--' ) ID | ID ( '++' | '--' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==64||LA61_0==68) ) {
                alt61=1;
            }
            else if ( (LA61_0==ID) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:615:12: ( '++' | '--' ) ID
                    {
                    set253=(Token)input.LT(1);

                    if ( input.LA(1)==64||input.LA(1)==68 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set253)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    ID254=(Token)match(input,ID,FOLLOW_ID_in_change4233); 
                    ID254_tree = 
                    (Object)adaptor.create(ID254)
                    ;
                    adaptor.addChild(root_0, ID254_tree);


                    }
                    break;
                case 2 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:615:31: ID ( '++' | '--' )
                    {
                    ID255=(Token)match(input,ID,FOLLOW_ID_in_change4237); 
                    ID255_tree = 
                    (Object)adaptor.create(ID255)
                    ;
                    adaptor.addChild(root_0, ID255_tree);


                    set256=(Token)input.LT(1);

                    if ( input.LA(1)==64||input.LA(1)==68 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set256)
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:627:1: integer_literal : ( DIGIT )+ ;
    public final BankParser.integer_literal_return integer_literal() throws RecognitionException {
        BankParser.integer_literal_return retval = new BankParser.integer_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DIGIT257=null;

        Object DIGIT257_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:627:17: ( ( DIGIT )+ )
            // /home/philosan/Dev/antlr/407_project/Bank.g:627:19: ( DIGIT )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/philosan/Dev/antlr/407_project/Bank.g:627:19: ( DIGIT )+
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
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:627:19: DIGIT
            	    {
            	    DIGIT257=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_integer_literal4284); 
            	    DIGIT257_tree = 
            	    (Object)adaptor.create(DIGIT257)
            	    ;
            	    adaptor.addChild(root_0, DIGIT257_tree);


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
    // $ANTLR end "integer_literal"


    public static class float_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "float_literal"
    // /home/philosan/Dev/antlr/407_project/Bank.g:634:1: float_literal : ( DIGIT )+ '.' ( DIGIT )+ ;
    public final BankParser.float_literal_return float_literal() throws RecognitionException {
        BankParser.float_literal_return retval = new BankParser.float_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DIGIT258=null;
        Token char_literal259=null;
        Token DIGIT260=null;

        Object DIGIT258_tree=null;
        Object char_literal259_tree=null;
        Object DIGIT260_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:634:15: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // /home/philosan/Dev/antlr/407_project/Bank.g:634:17: ( DIGIT )+ '.' ( DIGIT )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/philosan/Dev/antlr/407_project/Bank.g:634:17: ( DIGIT )+
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
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:634:17: DIGIT
            	    {
            	    DIGIT258=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_float_literal4317); 
            	    DIGIT258_tree = 
            	    (Object)adaptor.create(DIGIT258)
            	    ;
            	    adaptor.addChild(root_0, DIGIT258_tree);


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


            char_literal259=(Token)match(input,71,FOLLOW_71_in_float_literal4320); 
            char_literal259_tree = 
            (Object)adaptor.create(char_literal259)
            ;
            adaptor.addChild(root_0, char_literal259_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:634:28: ( DIGIT )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==DIGIT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:634:28: DIGIT
            	    {
            	    DIGIT260=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_float_literal4322); 
            	    DIGIT260_tree = 
            	    (Object)adaptor.create(DIGIT260)
            	    ;
            	    adaptor.addChild(root_0, DIGIT260_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:641:1: string_literal : '\"' (~ '\"' )* '\"' ;
    public final BankParser.string_literal_return string_literal() throws RecognitionException {
        BankParser.string_literal_return retval = new BankParser.string_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal261=null;
        Token set262=null;
        Token char_literal263=null;

        Object char_literal261_tree=null;
        Object set262_tree=null;
        Object char_literal263_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:641:16: ( '\"' (~ '\"' )* '\"' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:641:18: '\"' (~ '\"' )* '\"'
            {
            root_0 = (Object)adaptor.nil();


            char_literal261=(Token)match(input,56,FOLLOW_56_in_string_literal4355); 
            char_literal261_tree = 
            (Object)adaptor.create(char_literal261)
            ;
            adaptor.addChild(root_0, char_literal261_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:641:22: (~ '\"' )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0 >= Arithmetic_Expression && LA65_0 <= 55)||(LA65_0 >= 57 && LA65_0 <= 125)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:
            	    {
            	    set262=(Token)input.LT(1);

            	    if ( (input.LA(1) >= Arithmetic_Expression && input.LA(1) <= 55)||(input.LA(1) >= 57 && input.LA(1) <= 125) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set262)
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
            	    break loop65;
                }
            } while (true);


            char_literal263=(Token)match(input,56,FOLLOW_56_in_string_literal4363); 
            char_literal263_tree = 
            (Object)adaptor.create(char_literal263)
            ;
            adaptor.addChild(root_0, char_literal263_tree);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:648:1: character_literal : '\\'' (~ ( '\\'' | '\\\\' ) )* '\\'' ;
    public final BankParser.character_literal_return character_literal() throws RecognitionException {
        BankParser.character_literal_return retval = new BankParser.character_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal264=null;
        Token set265=null;
        Token char_literal266=null;

        Object char_literal264_tree=null;
        Object set265_tree=null;
        Object char_literal266_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:648:19: ( '\\'' (~ ( '\\'' | '\\\\' ) )* '\\'' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:648:21: '\\'' (~ ( '\\'' | '\\\\' ) )* '\\''
            {
            root_0 = (Object)adaptor.nil();


            char_literal264=(Token)match(input,85,FOLLOW_85_in_character_literal4395); 
            char_literal264_tree = 
            (Object)adaptor.create(char_literal264)
            ;
            adaptor.addChild(root_0, char_literal264_tree);


            // /home/philosan/Dev/antlr/407_project/Bank.g:648:26: (~ ( '\\'' | '\\\\' ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0 >= Arithmetic_Expression && LA66_0 <= 84)||(LA66_0 >= 87 && LA66_0 <= 125)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:
            	    {
            	    set265=(Token)input.LT(1);

            	    if ( (input.LA(1) >= Arithmetic_Expression && input.LA(1) <= 84)||(input.LA(1) >= 87 && input.LA(1) <= 125) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set265)
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
            	    break loop66;
                }
            } while (true);


            char_literal266=(Token)match(input,85,FOLLOW_85_in_character_literal4409); 
            char_literal266_tree = 
            (Object)adaptor.create(char_literal266)
            ;
            adaptor.addChild(root_0, char_literal266_tree);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:660:1: output : ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';' ;
    public final BankParser.output_return output() throws RecognitionException {
        BankParser.output_return retval = new BankParser.output_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set267=null;
        Token string_literal268=null;
        Token string_literal270=null;
        Token char_literal272=null;
        BankParser.expression_return expression269 =null;

        BankParser.manipulators_return manipulators271 =null;


        Object set267_tree=null;
        Object string_literal268_tree=null;
        Object string_literal270_tree=null;
        Object char_literal272_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:660:8: ( ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';' )
            // /home/philosan/Dev/antlr/407_project/Bank.g:660:11: ( 'cout' | ID ) ( '<<' ( expression | 'endl' | manipulators ) )* ';'
            {
            root_0 = (Object)adaptor.nil();


            set267=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==94 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set267)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // /home/philosan/Dev/antlr/407_project/Bank.g:660:25: ( '<<' ( expression | 'endl' | manipulators ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==78) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /home/philosan/Dev/antlr/407_project/Bank.g:660:26: '<<' ( expression | 'endl' | manipulators )
            	    {
            	    string_literal268=(Token)match(input,78,FOLLOW_78_in_output4456); 
            	    string_literal268_tree = 
            	    (Object)adaptor.create(string_literal268)
            	    ;
            	    adaptor.addChild(root_0, string_literal268_tree);


            	    // /home/philosan/Dev/antlr/407_project/Bank.g:660:31: ( expression | 'endl' | manipulators )
            	    int alt67=3;
            	    switch ( input.LA(1) ) {
            	    case BOOLEAN:
            	    case DIGIT:
            	    case ID:
            	    case 54:
            	    case 56:
            	    case 60:
            	    case 64:
            	    case 68:
            	    case 106:
            	        {
            	        alt67=1;
            	        }
            	        break;
            	    case 99:
            	        {
            	        alt67=2;
            	        }
            	        break;
            	    case 103:
            	    case 111:
            	    case 112:
            	    case 115:
            	        {
            	        alt67=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 67, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt67) {
            	        case 1 :
            	            // /home/philosan/Dev/antlr/407_project/Bank.g:660:32: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_output4459);
            	            expression269=expression();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expression269.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/philosan/Dev/antlr/407_project/Bank.g:660:45: 'endl'
            	            {
            	            string_literal270=(Token)match(input,99,FOLLOW_99_in_output4463); 
            	            string_literal270_tree = 
            	            (Object)adaptor.create(string_literal270)
            	            ;
            	            adaptor.addChild(root_0, string_literal270_tree);


            	            }
            	            break;
            	        case 3 :
            	            // /home/philosan/Dev/antlr/407_project/Bank.g:660:54: manipulators
            	            {
            	            pushFollow(FOLLOW_manipulators_in_output4467);
            	            manipulators271=manipulators();

            	            state._fsp--;

            	            adaptor.addChild(root_0, manipulators271.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            char_literal272=(Token)match(input,76,FOLLOW_76_in_output4472); 
            char_literal272_tree = 
            (Object)adaptor.create(char_literal272)
            ;
            adaptor.addChild(root_0, char_literal272_tree);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:667:1: manipulators : ( 'left' -> ^( Manipulator 'left' ) | 'right' -> ^( Manipulator 'right' ) | ( 'setw' '(' expression ')' ) -> ^( Manipulator 'setw' '(' expression ')' ) | ( 'string' '(' expression ',' character_literal ')' ) -> ^( Manipulator 'string' '(' expression ',' character_literal ')' ) );
    public final BankParser.manipulators_return manipulators() throws RecognitionException {
        BankParser.manipulators_return retval = new BankParser.manipulators_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal273=null;
        Token string_literal274=null;
        Token string_literal275=null;
        Token char_literal276=null;
        Token char_literal278=null;
        Token string_literal279=null;
        Token char_literal280=null;
        Token char_literal282=null;
        Token char_literal284=null;
        BankParser.expression_return expression277 =null;

        BankParser.expression_return expression281 =null;

        BankParser.character_literal_return character_literal283 =null;


        Object string_literal273_tree=null;
        Object string_literal274_tree=null;
        Object string_literal275_tree=null;
        Object char_literal276_tree=null;
        Object char_literal278_tree=null;
        Object string_literal279_tree=null;
        Object char_literal280_tree=null;
        Object char_literal282_tree=null;
        Object char_literal284_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_character_literal=new RewriteRuleSubtreeStream(adaptor,"rule character_literal");
        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:668:2: ( 'left' -> ^( Manipulator 'left' ) | 'right' -> ^( Manipulator 'right' ) | ( 'setw' '(' expression ')' ) -> ^( Manipulator 'setw' '(' expression ')' ) | ( 'string' '(' expression ',' character_literal ')' ) -> ^( Manipulator 'string' '(' expression ',' character_literal ')' ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt69=1;
                }
                break;
            case 111:
                {
                alt69=2;
                }
                break;
            case 112:
                {
                alt69=3;
                }
                break;
            case 115:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:668:4: 'left'
                    {
                    string_literal273=(Token)match(input,103,FOLLOW_103_in_manipulators4506);  
                    stream_103.add(string_literal273);


                    // AST REWRITE
                    // elements: 103
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 668:11: -> ^( Manipulator 'left' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:668:14: ^( Manipulator 'left' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Manipulator, "Manipulator")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_103.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:669:4: 'right'
                    {
                    string_literal274=(Token)match(input,111,FOLLOW_111_in_manipulators4520);  
                    stream_111.add(string_literal274);


                    // AST REWRITE
                    // elements: 111
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 669:12: -> ^( Manipulator 'right' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:669:15: ^( Manipulator 'right' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Manipulator, "Manipulator")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_111.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:670:4: ( 'setw' '(' expression ')' )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:670:4: ( 'setw' '(' expression ')' )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:670:5: 'setw' '(' expression ')'
                    {
                    string_literal275=(Token)match(input,112,FOLLOW_112_in_manipulators4536);  
                    stream_112.add(string_literal275);


                    char_literal276=(Token)match(input,60,FOLLOW_60_in_manipulators4538);  
                    stream_60.add(char_literal276);


                    pushFollow(FOLLOW_expression_in_manipulators4540);
                    expression277=expression();

                    state._fsp--;

                    stream_expression.add(expression277.getTree());

                    char_literal278=(Token)match(input,61,FOLLOW_61_in_manipulators4542);  
                    stream_61.add(char_literal278);


                    }


                    // AST REWRITE
                    // elements: 60, 61, expression, 112
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 670:32: -> ^( Manipulator 'setw' '(' expression ')' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:670:35: ^( Manipulator 'setw' '(' expression ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Manipulator, "Manipulator")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_112.nextNode()
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
                    // /home/philosan/Dev/antlr/407_project/Bank.g:671:4: ( 'string' '(' expression ',' character_literal ')' )
                    {
                    // /home/philosan/Dev/antlr/407_project/Bank.g:671:4: ( 'string' '(' expression ',' character_literal ')' )
                    // /home/philosan/Dev/antlr/407_project/Bank.g:671:5: 'string' '(' expression ',' character_literal ')'
                    {
                    string_literal279=(Token)match(input,115,FOLLOW_115_in_manipulators4564);  
                    stream_115.add(string_literal279);


                    char_literal280=(Token)match(input,60,FOLLOW_60_in_manipulators4566);  
                    stream_60.add(char_literal280);


                    pushFollow(FOLLOW_expression_in_manipulators4568);
                    expression281=expression();

                    state._fsp--;

                    stream_expression.add(expression281.getTree());

                    char_literal282=(Token)match(input,66,FOLLOW_66_in_manipulators4570);  
                    stream_66.add(char_literal282);


                    pushFollow(FOLLOW_character_literal_in_manipulators4572);
                    character_literal283=character_literal();

                    state._fsp--;

                    stream_character_literal.add(character_literal283.getTree());

                    char_literal284=(Token)match(input,61,FOLLOW_61_in_manipulators4574);  
                    stream_61.add(char_literal284);


                    }


                    // AST REWRITE
                    // elements: 66, expression, 61, character_literal, 115, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 671:56: -> ^( Manipulator 'string' '(' expression ',' character_literal ')' )
                    {
                        // /home/philosan/Dev/antlr/407_project/Bank.g:671:59: ^( Manipulator 'string' '(' expression ',' character_literal ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Manipulator, "Manipulator")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_115.nextNode()
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
    // /home/philosan/Dev/antlr/407_project/Bank.g:683:1: input : ( stream ( '>>' expression )+ ';' | 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';' | stream '.ignore' '(' ')' ';' );
    public final BankParser.input_return input() throws RecognitionException {
        BankParser.input_return retval = new BankParser.input_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal286=null;
        Token char_literal288=null;
        Token string_literal289=null;
        Token char_literal290=null;
        Token char_literal292=null;
        Token ID293=null;
        Token char_literal294=null;
        Token char_literal296=null;
        Token char_literal297=null;
        Token string_literal299=null;
        Token char_literal300=null;
        Token char_literal301=null;
        Token char_literal302=null;
        BankParser.stream_return stream285 =null;

        BankParser.expression_return expression287 =null;

        BankParser.stream_return stream291 =null;

        BankParser.character_literal_return character_literal295 =null;

        BankParser.stream_return stream298 =null;


        Object string_literal286_tree=null;
        Object char_literal288_tree=null;
        Object string_literal289_tree=null;
        Object char_literal290_tree=null;
        Object char_literal292_tree=null;
        Object ID293_tree=null;
        Object char_literal294_tree=null;
        Object char_literal296_tree=null;
        Object char_literal297_tree=null;
        Object string_literal299_tree=null;
        Object char_literal300_tree=null;
        Object char_literal301_tree=null;
        Object char_literal302_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:684:3: ( stream ( '>>' expression )+ ';' | 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';' | stream '.ignore' '(' ')' ';' )
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==ID||LA72_0==92) ) {
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
            else if ( (LA72_0==101) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }
            switch (alt72) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:684:3: stream ( '>>' expression )+ ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stream_in_input4630);
                    stream285=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream285.getTree());

                    // /home/philosan/Dev/antlr/407_project/Bank.g:684:10: ( '>>' expression )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==84) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // /home/philosan/Dev/antlr/407_project/Bank.g:684:11: '>>' expression
                    	    {
                    	    string_literal286=(Token)match(input,84,FOLLOW_84_in_input4633); 
                    	    string_literal286_tree = 
                    	    (Object)adaptor.create(string_literal286)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal286_tree);


                    	    pushFollow(FOLLOW_expression_in_input4635);
                    	    expression287=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression287.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt70 >= 1 ) break loop70;
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);


                    char_literal288=(Token)match(input,76,FOLLOW_76_in_input4639); 
                    char_literal288_tree = 
                    (Object)adaptor.create(char_literal288)
                    ;
                    adaptor.addChild(root_0, char_literal288_tree);


                    }
                    break;
                case 2 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:685:3: 'getline' '(' stream ',' ID ( ',' character_literal )? ')' ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal289=(Token)match(input,101,FOLLOW_101_in_input4643); 
                    string_literal289_tree = 
                    (Object)adaptor.create(string_literal289)
                    ;
                    adaptor.addChild(root_0, string_literal289_tree);


                    char_literal290=(Token)match(input,60,FOLLOW_60_in_input4645); 
                    char_literal290_tree = 
                    (Object)adaptor.create(char_literal290)
                    ;
                    adaptor.addChild(root_0, char_literal290_tree);


                    pushFollow(FOLLOW_stream_in_input4647);
                    stream291=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream291.getTree());

                    char_literal292=(Token)match(input,66,FOLLOW_66_in_input4649); 
                    char_literal292_tree = 
                    (Object)adaptor.create(char_literal292)
                    ;
                    adaptor.addChild(root_0, char_literal292_tree);


                    ID293=(Token)match(input,ID,FOLLOW_ID_in_input4651); 
                    ID293_tree = 
                    (Object)adaptor.create(ID293)
                    ;
                    adaptor.addChild(root_0, ID293_tree);


                    // /home/philosan/Dev/antlr/407_project/Bank.g:685:31: ( ',' character_literal )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==66) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/philosan/Dev/antlr/407_project/Bank.g:685:32: ',' character_literal
                            {
                            char_literal294=(Token)match(input,66,FOLLOW_66_in_input4654); 
                            char_literal294_tree = 
                            (Object)adaptor.create(char_literal294)
                            ;
                            adaptor.addChild(root_0, char_literal294_tree);


                            pushFollow(FOLLOW_character_literal_in_input4656);
                            character_literal295=character_literal();

                            state._fsp--;

                            adaptor.addChild(root_0, character_literal295.getTree());

                            }
                            break;

                    }


                    char_literal296=(Token)match(input,61,FOLLOW_61_in_input4660); 
                    char_literal296_tree = 
                    (Object)adaptor.create(char_literal296)
                    ;
                    adaptor.addChild(root_0, char_literal296_tree);


                    char_literal297=(Token)match(input,76,FOLLOW_76_in_input4662); 
                    char_literal297_tree = 
                    (Object)adaptor.create(char_literal297)
                    ;
                    adaptor.addChild(root_0, char_literal297_tree);


                    }
                    break;
                case 3 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:686:5: stream '.ignore' '(' ')' ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stream_in_input4668);
                    stream298=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream298.getTree());

                    string_literal299=(Token)match(input,72,FOLLOW_72_in_input4670); 
                    string_literal299_tree = 
                    (Object)adaptor.create(string_literal299)
                    ;
                    adaptor.addChild(root_0, string_literal299_tree);


                    char_literal300=(Token)match(input,60,FOLLOW_60_in_input4672); 
                    char_literal300_tree = 
                    (Object)adaptor.create(char_literal300)
                    ;
                    adaptor.addChild(root_0, char_literal300_tree);


                    char_literal301=(Token)match(input,61,FOLLOW_61_in_input4674); 
                    char_literal301_tree = 
                    (Object)adaptor.create(char_literal301)
                    ;
                    adaptor.addChild(root_0, char_literal301_tree);


                    char_literal302=(Token)match(input,76,FOLLOW_76_in_input4676); 
                    char_literal302_tree = 
                    (Object)adaptor.create(char_literal302)
                    ;
                    adaptor.addChild(root_0, char_literal302_tree);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:694:1: file_input : ( ID ( '>>' expression )+ | 'getline' '(' stream ',' ID ')' | stream '.ignore' '(' ')' );
    public final BankParser.file_input_return file_input() throws RecognitionException {
        BankParser.file_input_return retval = new BankParser.file_input_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID303=null;
        Token string_literal304=null;
        Token string_literal306=null;
        Token char_literal307=null;
        Token char_literal309=null;
        Token ID310=null;
        Token char_literal311=null;
        Token string_literal313=null;
        Token char_literal314=null;
        Token char_literal315=null;
        BankParser.expression_return expression305 =null;

        BankParser.stream_return stream308 =null;

        BankParser.stream_return stream312 =null;


        Object ID303_tree=null;
        Object string_literal304_tree=null;
        Object string_literal306_tree=null;
        Object char_literal307_tree=null;
        Object char_literal309_tree=null;
        Object ID310_tree=null;
        Object char_literal311_tree=null;
        Object string_literal313_tree=null;
        Object char_literal314_tree=null;
        Object char_literal315_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:694:12: ( ID ( '>>' expression )+ | 'getline' '(' stream ',' ID ')' | stream '.ignore' '(' ')' )
            int alt74=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==84) ) {
                    alt74=1;
                }
                else if ( (LA74_1==72) ) {
                    alt74=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;

                }
                }
                break;
            case 101:
                {
                alt74=2;
                }
                break;
            case 92:
                {
                alt74=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }

            switch (alt74) {
                case 1 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:694:14: ID ( '>>' expression )+
                    {
                    root_0 = (Object)adaptor.nil();


                    ID303=(Token)match(input,ID,FOLLOW_ID_in_file_input4708); 
                    ID303_tree = 
                    (Object)adaptor.create(ID303)
                    ;
                    adaptor.addChild(root_0, ID303_tree);


                    // /home/philosan/Dev/antlr/407_project/Bank.g:694:17: ( '>>' expression )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==84) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // /home/philosan/Dev/antlr/407_project/Bank.g:694:18: '>>' expression
                    	    {
                    	    string_literal304=(Token)match(input,84,FOLLOW_84_in_file_input4711); 
                    	    string_literal304_tree = 
                    	    (Object)adaptor.create(string_literal304)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal304_tree);


                    	    pushFollow(FOLLOW_expression_in_file_input4713);
                    	    expression305=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression305.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:695:3: 'getline' '(' stream ',' ID ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal306=(Token)match(input,101,FOLLOW_101_in_file_input4719); 
                    string_literal306_tree = 
                    (Object)adaptor.create(string_literal306)
                    ;
                    adaptor.addChild(root_0, string_literal306_tree);


                    char_literal307=(Token)match(input,60,FOLLOW_60_in_file_input4721); 
                    char_literal307_tree = 
                    (Object)adaptor.create(char_literal307)
                    ;
                    adaptor.addChild(root_0, char_literal307_tree);


                    pushFollow(FOLLOW_stream_in_file_input4723);
                    stream308=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream308.getTree());

                    char_literal309=(Token)match(input,66,FOLLOW_66_in_file_input4725); 
                    char_literal309_tree = 
                    (Object)adaptor.create(char_literal309)
                    ;
                    adaptor.addChild(root_0, char_literal309_tree);


                    ID310=(Token)match(input,ID,FOLLOW_ID_in_file_input4727); 
                    ID310_tree = 
                    (Object)adaptor.create(ID310)
                    ;
                    adaptor.addChild(root_0, ID310_tree);


                    char_literal311=(Token)match(input,61,FOLLOW_61_in_file_input4729); 
                    char_literal311_tree = 
                    (Object)adaptor.create(char_literal311)
                    ;
                    adaptor.addChild(root_0, char_literal311_tree);


                    }
                    break;
                case 3 :
                    // /home/philosan/Dev/antlr/407_project/Bank.g:696:5: stream '.ignore' '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stream_in_file_input4735);
                    stream312=stream();

                    state._fsp--;

                    adaptor.addChild(root_0, stream312.getTree());

                    string_literal313=(Token)match(input,72,FOLLOW_72_in_file_input4737); 
                    string_literal313_tree = 
                    (Object)adaptor.create(string_literal313)
                    ;
                    adaptor.addChild(root_0, string_literal313_tree);


                    char_literal314=(Token)match(input,60,FOLLOW_60_in_file_input4739); 
                    char_literal314_tree = 
                    (Object)adaptor.create(char_literal314)
                    ;
                    adaptor.addChild(root_0, char_literal314_tree);


                    char_literal315=(Token)match(input,61,FOLLOW_61_in_file_input4741); 
                    char_literal315_tree = 
                    (Object)adaptor.create(char_literal315)
                    ;
                    adaptor.addChild(root_0, char_literal315_tree);


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
    // /home/philosan/Dev/antlr/407_project/Bank.g:703:1: stream : ( 'cin' | ID );
    public final BankParser.stream_return stream() throws RecognitionException {
        BankParser.stream_return retval = new BankParser.stream_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set316=null;

        Object set316_tree=null;

        try {
            // /home/philosan/Dev/antlr/407_project/Bank.g:703:8: ( 'cin' | ID )
            // /home/philosan/Dev/antlr/407_project/Bank.g:
            {
            root_0 = (Object)adaptor.nil();


            set316=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==92 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set316)
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
//        catch (MismatchedTokenException e) {
//             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
//        }
//        catch (NoViableAltException e) {
//             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
//        }
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA3_eotS =
        "\17\uffff";
    static final String DFA3_eofS =
        "\17\uffff";
    static final String DFA3_minS =
        "\1\11\1\36\3\uffff\1\74\1\6\1\36\1\32\1\6\1\67\1\6\1\36\1\6\1\67";
    static final String DFA3_maxS =
        "\1\170\1\76\3\uffff\1\120\1\166\1\173\1\172\1\152\1\173\1\166\1"+
        "\173\1\152\1\173";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\3\12\uffff";
    static final String DFA3_specialS =
        "\17\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\24\uffff\1\4\1\uffff\1\4\67\uffff\1\1\2\uffff\1\1\6\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\10\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\1\4\1\uffff\1\2",
            "\1\5\37\uffff\1\4",
            "",
            "",
            "",
            "\1\6\5\uffff\1\4\10\uffff\2\4\3\uffff\1\4",
            "\1\4\13\uffff\1\4\13\uffff\1\7\27\uffff\1\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\10\2\uffff\1\4\3\uffff\1\4\23\uffff\1\2\2\uffff\1\2\6"+
            "\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4\6"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
            "\1\2\30\uffff\1\4\2\uffff\1\4\2\uffff\1\4\1\11\2\4\1\uffff"+
            "\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\3\4\47\uffff\1\4",
            "\1\2\3\uffff\3\2\41\uffff\1\4\11\uffff\1\4\13\uffff\1\2\2\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\3\2\1\uffff\3\2\1\uffff\1\2\5\uffff"+
            "\1\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\2\2\uffff\2\2",
            "\1\4\13\uffff\1\4\13\uffff\1\12\31\uffff\1\4\3\uffff\1\4\3"+
            "\uffff\1\4\3\uffff\1\4\45\uffff\1\4",
            "\1\4\2\uffff\1\4\2\uffff\1\10\3\4\1\uffff\1\13\2\4\1\uffff"+
            "\2\4\1\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\uffff\3\4\47\uffff"+
            "\1\4",
            "\1\4\13\uffff\1\4\13\uffff\1\14\27\uffff\1\4\1\uffff\1\4\3"+
            "\uffff\1\4\3\uffff\1\4\3\uffff\1\4\23\uffff\1\2\2\uffff\1\2"+
            "\6\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\4"+
            "\6\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
            "\1\2\30\uffff\1\4\2\uffff\1\4\2\uffff\1\4\1\15\2\4\1\uffff"+
            "\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\3\4\47\uffff\1\4",
            "\1\4\13\uffff\1\4\13\uffff\1\16\31\uffff\1\4\3\uffff\1\4\3"+
            "\uffff\1\4\3\uffff\1\4\45\uffff\1\4",
            "\1\4\2\uffff\1\4\2\uffff\1\10\3\4\1\uffff\1\13\2\4\1\uffff"+
            "\2\4\1\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\uffff\3\4\47\uffff"+
            "\1\4"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "75:1: top_level_component : ( function_definition -> ^( Top_Level_Component function_definition ) | class_definition -> ^( Top_Level_Component class_definition ) | declaration -> ^( Top_Level_Component declaration ) );";
        }
    }
    static final String DFA35_eotS =
        "\22\uffff";
    static final String DFA35_eofS =
        "\22\uffff";
    static final String DFA35_minS =
        "\1\36\1\uffff\3\36\2\uffff\1\74\1\uffff\1\6\1\36\1\102\1\6\1\67"+
        "\1\6\1\36\1\6\1\67";
    static final String DFA35_maxS =
        "\1\175\1\uffff\2\76\1\175\2\uffff\1\120\1\uffff\1\166\1\173\1\172"+
        "\1\152\1\173\1\166\1\173\1\152\1\173";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\4\1\uffff\1\2\11\uffff";
    static final String DFA35_specialS =
        "\22\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\3\1\uffff\1\1\67\uffff\1\2\2\uffff\1\2\6\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\1\1\2\2\uffff\1"+
            "\1\1\4\1\5\4\uffff\1\6",
            "",
            "\1\7\37\uffff\1\1",
            "\1\1\35\uffff\1\10\1\uffff\1\1",
            "\1\10\71\uffff\1\5\2\uffff\1\5\6\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\10\uffff\1\5\1\uffff\1\5\4\uffff\1\5\4\uffff"+
            "\1\6",
            "",
            "",
            "\1\11\5\uffff\1\1\10\uffff\2\1\3\uffff\1\1",
            "",
            "\1\1\13\uffff\1\1\13\uffff\1\12\27\uffff\1\1\1\uffff\1\1\3"+
            "\uffff\1\1\1\13\2\uffff\1\1\3\uffff\1\1\23\uffff\1\5\2\uffff"+
            "\1\5\6\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\1\6\uffff\1\5\1\uffff\1\5\2\uffff\1\5",
            "\1\5\30\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\14\2\1\1\uffff"+
            "\3\1\1\uffff\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\3\1\47\uffff\1\1",
            "\1\1\11\uffff\1\1\20\uffff\1\5\34\uffff\1\5",
            "\1\1\13\uffff\1\1\13\uffff\1\15\31\uffff\1\1\3\uffff\1\1\3"+
            "\uffff\1\1\3\uffff\1\1\45\uffff\1\1",
            "\1\1\2\uffff\1\1\2\uffff\1\13\3\1\1\uffff\1\16\2\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\3\1\47\uffff"+
            "\1\1",
            "\1\1\13\uffff\1\1\13\uffff\1\17\27\uffff\1\1\1\uffff\1\1\3"+
            "\uffff\1\1\3\uffff\1\1\3\uffff\1\1\23\uffff\1\5\2\uffff\1\5"+
            "\6\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\1"+
            "\6\uffff\1\5\1\uffff\1\5\2\uffff\1\5",
            "\1\5\30\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\20\2\1\1\uffff"+
            "\3\1\1\uffff\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\3\1\47\uffff\1\1",
            "\1\1\13\uffff\1\1\13\uffff\1\21\31\uffff\1\1\3\uffff\1\1\3"+
            "\uffff\1\1\3\uffff\1\1\45\uffff\1\1",
            "\1\1\2\uffff\1\1\2\uffff\1\13\3\1\1\uffff\1\16\2\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\1\uffff\3\1\47\uffff"+
            "\1\1"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "432:2: ( class_declaration -> ^( Class_Member class_declaration ) | constructor -> ^( Class_Member constructor ) | class_function_definition -> ^( Class_Member class_function_definition ) | destructor -> ^( Class_Member destructor ) )";
        }
    }
 

    public static final BitSet FOLLOW_top_level_in_start332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compilation_unit_in_top_level393 = new BitSet(new long[]{0x0200000140000202L,0x016A015409000000L});
    public static final BitSet FOLLOW_top_level_component_in_top_level396 = new BitSet(new long[]{0x0000000140000202L,0x014A015409000000L});
    public static final BitSet FOLLOW_function_definition_in_top_level_component454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_definition_in_top_level_component471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_top_level_component488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_in_compilation_unit536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_space_in_compilation_unit552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_include597 = new BitSet(new long[]{0x0100000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_lib_in_include604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_header_in_include618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_lib660 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_82_in_lib670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_header702 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_56_in_header712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_name_space744 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_name_space746 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_name_space_name_in_name_space750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_name_space762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name_space_name797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_name_space_name800 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_name_space_name802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_return_type_in_function_definition843 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_function_definition845 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_function_definition847 = new BitSet(new long[]{0x2000000040000000L,0x004A015409000000L});
    public static final BitSet FOLLOW_parameters_in_function_definition849 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function_definition852 = new BitSet(new long[]{0x00000001C4000000L,0x065A417759000000L});
    public static final BitSet FOLLOW_body_in_function_definition854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters906 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_parameters910 = new BitSet(new long[]{0x0000000040000000L,0x004A015409000000L});
    public static final BitSet FOLLOW_parameter_in_parameters914 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter949 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_parameter951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_body1002 = new BitSet(new long[]{0x00000001C4000000L,0x125A417759000000L});
    public static final BitSet FOLLOW_statements_in_body1004 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_body1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_body1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements1067 = new BitSet(new long[]{0x00000001C4000002L,0x025A417759000000L});
    public static final BitSet FOLLOW_declaration_in_statement1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_statement1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_member_access_in_statement1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_statement1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_structure_in_statement1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_output_in_statement1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_input_in_statement1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_statement1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment1294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010022L});
    public static final BitSet FOLLOW_set_in_assignment1297 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_assignment1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_delete_statement1344 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_delete_statement1346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_delete_statement1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_return_statement1394 = new BitSet(new long[]{0x1140000040040040L,0x0000040000001011L});
    public static final BitSet FOLLOW_expression_in_return_statement1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_return_statement1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_control_structure1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_in_control_structure1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_loop_in_control_structure1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_loop_in_control_structure1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switch_statement_in_control_structure1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1550 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_if_statement1552 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_if_statement1554 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_if_statement1556 = new BitSet(new long[]{0x00000001C4000000L,0x065A417759000000L});
    public static final BitSet FOLLOW_body_in_if_statement1558 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_else_statement_in_if_statement1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_statement1614 = new BitSet(new long[]{0x00000001C4000000L,0x065A417759000000L});
    public static final BitSet FOLLOW_body_in_else_statement1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_loop1660 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_for_loop1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000020800000L});
    public static final BitSet FOLLOW_93_in_for_loop1664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_for_loop1667 = new BitSet(new long[]{0x0800000040000000L});
    public static final BitSet FOLLOW_59_in_for_loop1669 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_for_loop1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_for_loop1674 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_for_loop1676 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_for_loop1678 = new BitSet(new long[]{0x00000001C4000000L,0x065A417759000000L});
    public static final BitSet FOLLOW_body_in_for_loop1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_while_loop1742 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_while_loop1744 = new BitSet(new long[]{0x1140000040040040L,0x0000042010000011L});
    public static final BitSet FOLLOW_while_exp_in_while_loop1746 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_while_loop1748 = new BitSet(new long[]{0x00000001C4000000L,0x065A417759000000L});
    public static final BitSet FOLLOW_body_in_while_loop1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_while_exp1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_file_input_in_while_exp1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_do_while_loop1857 = new BitSet(new long[]{0x00000001C4000000L,0x065A417759000000L});
    public static final BitSet FOLLOW_body_in_do_while_loop1859 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_do_while_loop1861 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_do_while_loop1863 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_do_while_loop1865 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_do_while_loop1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_do_while_loop1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_switch_statement1923 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_switch_statement1925 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_switch_statement1927 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_switch_statement1929 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_switch_statement1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switch_case_in_switch_statement1933 = new BitSet(new long[]{0x0000000000000000L,0x1000000084000000L});
    public static final BitSet FOLLOW_default_case_in_switch_statement1936 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_switch_statement1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_switch_case1997 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_switch_case1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_switch_case2001 = new BitSet(new long[]{0x00000001C4000000L,0x025A41775B000000L});
    public static final BitSet FOLLOW_statements_in_switch_case2003 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_break_statement_in_switch_case2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_default_case2057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_default_case2059 = new BitSet(new long[]{0x00000001C4000000L,0x025A417759000000L});
    public static final BitSet FOLLOW_statements_in_default_case2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_break_statement2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_break_statement2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_type_in_type2160 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_vector_type_in_type2174 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ID_in_type2188 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_type2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_type_in_return_type2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_return_type2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_vector_type2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_vector_type2357 = new BitSet(new long[]{0x0000000040000000L,0x004A015409000000L});
    public static final BitSet FOLLOW_type_in_vector_type2359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_vector_type2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_declaration2400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_file_declaration_in_declaration2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_declaration2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable_declaration2460 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_variables_in_variable_declaration2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_variables2494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_variables2499 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_declarator_in_variables2503 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_qualified_id_in_declarator2537 = new BitSet(new long[]{0x1000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_declarator2545 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_declarator2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_declarator2567 = new BitSet(new long[]{0x3140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_arguments_in_declarator2569 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_declarator2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qualified_id2629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_qualified_id2633 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_qualified_id2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFSTREAM_in_file_declaration2701 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_file_declaration2704 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_file_declaration2706 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_string_literal_in_file_declaration2708 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_file_declaration2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arguments2742 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_arguments2746 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_arguments2750 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_in_class_definition2790 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_class_definition2792 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000400L});
    public static final BitSet FOLLOW_74_in_class_definition2795 = new BitSet(new long[]{0x0000000000000000L,0x0000380000000000L});
    public static final BitSet FOLLOW_class_visibility_in_class_definition2797 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_class_definition2799 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_class_definition2803 = new BitSet(new long[]{0x0000000140000000L,0x31CE395409000000L});
    public static final BitSet FOLLOW_class_members_in_class_definition2805 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_class_definition2807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_class_definition2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_member_in_class_members2870 = new BitSet(new long[]{0x0000000140000002L,0x21CE395409000000L});
    public static final BitSet FOLLOW_class_visibility_in_class_member2917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_class_member2919 = new BitSet(new long[]{0x0000000140000000L,0x21CE015409000000L});
    public static final BitSet FOLLOW_class_declaration_in_class_member2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_class_member2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_function_definition_in_class_member2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destructor_in_class_member2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_class_declaration3012 = new BitSet(new long[]{0x0000000140000000L,0x004A015409000000L});
    public static final BitSet FOLLOW_declaration_in_class_declaration3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_constructor3089 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_constructor3092 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_constructor3094 = new BitSet(new long[]{0x2000000040000000L,0x004A015409000000L});
    public static final BitSet FOLLOW_parameters_in_constructor3096 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_constructor3099 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000400L});
    public static final BitSet FOLLOW_74_in_constructor3103 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_member_init_list_in_constructor3105 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_class_function_body_in_constructor3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_destructor3179 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_destructor3182 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_destructor3184 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_destructor3186 = new BitSet(new long[]{0x2000000040000000L,0x004A015409000000L});
    public static final BitSet FOLLOW_parameters_in_destructor3188 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_destructor3191 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000400L});
    public static final BitSet FOLLOW_74_in_destructor3195 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_member_init_list_in_destructor3197 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_class_function_body_in_destructor3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_member_init_list3272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_member_init_list3277 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_function_call_in_member_init_list3281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_119_in_class_function_definition3316 = new BitSet(new long[]{0x0000000000000000L,0x010A015409000000L});
    public static final BitSet FOLLOW_return_type_in_class_function_definition3319 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_class_function_definition3321 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_class_function_definition3323 = new BitSet(new long[]{0x2000000040000000L,0x004A015409000000L});
    public static final BitSet FOLLOW_parameters_in_class_function_definition3325 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_class_function_definition3328 = new BitSet(new long[]{0x0000000000000000L,0x0400000020000000L});
    public static final BitSet FOLLOW_93_in_class_function_definition3330 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_class_function_body_in_class_function_definition3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_class_function_body3396 = new BitSet(new long[]{0x00000001C4000000L,0x125A417759000000L});
    public static final BitSet FOLLOW_statements_in_class_function_body3398 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_class_function_body3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_exp_in_expression3449 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_expression3453 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_and_exp_in_expression3457 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_equality_exp_in_and_exp3490 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_and_exp3494 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_equality_exp_in_and_exp3498 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_relational_exp_in_equality_exp3532 = new BitSet(new long[]{0x0080000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_set_in_equality_exp3535 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_relational_exp_in_equality_exp3544 = new BitSet(new long[]{0x0080000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_unary_exp_in_relational_exp3578 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CA000L});
    public static final BitSet FOLLOW_set_in_relational_exp3581 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_unary_exp_in_relational_exp3598 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CA000L});
    public static final BitSet FOLLOW_arithmetic_expression_in_unary_exp3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_unary_exp3651 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_unary_exp_in_unary_exp3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arithmetic_expression3696 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_arithmetic_expression3699 = new BitSet(new long[]{0x1100000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_term_in_arithmetic_expression3708 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_term3745 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_term3748 = new BitSet(new long[]{0x1100000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_factor_in_term3757 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_60_in_factor3794 = new BitSet(new long[]{0x1100000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_arithmetic_expression_in_factor3796 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_factor3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_change_in_factor3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_true_false_in_factor3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_factor3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_factor3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_decleration_in_factor3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_member_access_in_factor3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_true_false3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_access_in_member_access3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_access_in_member_access3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_access4034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_function_access4036 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_function_access4038 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_function_access4043 = new BitSet(new long[]{0x3140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_arguments_in_function_access4045 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function_access4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pointer_access4083 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_pointer_access4085 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_pointer_access4093 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_pointer_access4096 = new BitSet(new long[]{0x3140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_arguments_in_pointer_access4098 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_pointer_access4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_call4136 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_function_call4138 = new BitSet(new long[]{0x3140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_arguments_in_function_call4140 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function_call4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_object_decleration4190 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_function_call_in_object_decleration4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change4225 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_change4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_change4237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_set_in_change4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_integer_literal4284 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DIGIT_in_float_literal4317 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_float_literal4320 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DIGIT_in_float_literal4322 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_56_in_string_literal4355 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_56_in_string_literal4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_character_literal4395 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x3FFFFFFFFFBFFFFFL});
    public static final BitSet FOLLOW_85_in_character_literal4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_output4447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_78_in_output4456 = new BitSet(new long[]{0x1140000040040040L,0x0009848800000011L});
    public static final BitSet FOLLOW_expression_in_output4459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_99_in_output4463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_manipulators_in_output4467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_76_in_output4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_manipulators4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_manipulators4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_manipulators4536 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_manipulators4538 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_manipulators4540 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_manipulators4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_manipulators4564 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_manipulators4566 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_manipulators4568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_manipulators4570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_character_literal_in_manipulators4572 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_manipulators4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_input4630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_input4633 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_input4635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000101000L});
    public static final BitSet FOLLOW_76_in_input4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_input4643 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_input4645 = new BitSet(new long[]{0x0000000040000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_stream_in_input4647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_input4649 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_input4651 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_input4654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_character_literal_in_input4656 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_input4660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_input4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_input4668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_input4670 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_input4672 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_input4674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_input4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_file_input4708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_file_input4711 = new BitSet(new long[]{0x1140000040040040L,0x0000040000000011L});
    public static final BitSet FOLLOW_expression_in_file_input4713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_101_in_file_input4719 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_file_input4721 = new BitSet(new long[]{0x0000000040000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_stream_in_file_input4723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_file_input4725 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_file_input4727 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_file_input4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stream_in_file_input4735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_file_input4737 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_file_input4739 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_file_input4741 = new BitSet(new long[]{0x0000000000000002L});

}