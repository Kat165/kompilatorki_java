// Generated from C:/Users/kasia/IdeaProjects/kompilatorki_java/antlr4\GrammarInit.g4 by ANTLR 4.10.1
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarInitParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, PROCENT=5, INCREMENT=6, DECREMENT=7, 
		AND=8, OR=9, NOT=10, ASSIGN=11, ASSIGN_ADD=12, ASSIGN_MINUS=13, ASSIGN_MULTIPLY=14, 
		ASSIGN_DIVIDE=15, ASSIGN_PERCENT=16, EQUALS=17, NOT_EQUALS=18, SMALLER=19, 
		BIGGER=20, SMALLER_OR_EQUAL=21, BIGGER_OR_EQUAL=22, LEFT_INDEX=23, RIGHT_INDEX=24, 
		LEFT_BRACKET=25, RIGHT_BRACKET=26, LEFT_CURVY_BRACKET=27, RIGHT_CURVY_BRACKET=28, 
		DELI=29, DOT=30, NL=31, NL2=32, NL3=33, PACKAGE=34, IMPORT=35, CLASS=36, 
		FUN=37, OBJECT=38, VAL_INIT=39, VAR_INIT=40, CONSTRUCTOR=41, BY=42, THIS=43, 
		WHERE=44, IF_INIT=45, ELSE_INIT=46, WHEN=47, TRY_INIT=48, CATCH_INIT=49, 
		FOR_INIT=50, DO_INIT=51, WHILE_INIT=52, THROW_INIT=53, RETURN_INIT=54, 
		CONT_INIT=55, BREAK_INIT=56, AS=57, IS=58, IN=59, NOT_IS=60, NOT_IN=61, 
		OUT=62, DYNAMIC=63, PUBLIC=64, PRIVATE=65, PROTECTED=66, INTERNAL=67, 
		ENUM=68, OVERRIDE=69, OPEN=70, LATEINIT=71, IT=72, NULL=73, BooleanLiteral=74, 
		SPACE=75, COMM=76, COM=77, DOWNTO=78, STEP=79, DOTDOT=80, STRING=81, INT=82, 
		COLON=83, PRINTLN=84, EscapedIdentifier=85, Liczba_calk=86, Nazwa=87, 
		Char=88, String=89, Liczba_zmiennoprzecin=90;
	public static final int
		RULE_startowy = 0, RULE_condition = 1, RULE_assignment = 2, RULE_if_stat = 3, 
		RULE_else_stat = 4, RULE_while_loop = 5, RULE_for_loop = 6, RULE_for_inside = 7, 
		RULE_do_while_loop = 8, RULE_function_body = 9, RULE_function = 10, RULE_try_catch_stat = 11, 
		RULE_return_stat = 12, RULE_komentarz_poj = 13, RULE_komentarz_wiel = 14, 
		RULE_instruction = 15, RULE_classDeclaration = 16, RULE_variable = 17, 
		RULE_class_body = 18, RULE_function_call = 19, RULE_argument_list = 20, 
		RULE_fun_arg = 21, RULE_type = 22, RULE_println = 23, RULE_decrement = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"startowy", "condition", "assignment", "if_stat", "else_stat", "while_loop", 
			"for_loop", "for_inside", "do_while_loop", "function_body", "function", 
			"try_catch_stat", "return_stat", "komentarz_poj", "komentarz_wiel", "instruction", 
			"classDeclaration", "variable", "class_body", "function_call", "argument_list", 
			"fun_arg", "type", "println", "decrement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'&&'", "'||'", 
			"'!'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", 
			"'<'", "'>'", "'\\u00E2\\u2021\\uFFFD'", "'>='", "'['", "']'", "'('", 
			"')'", "'{'", "'}'", "','", "'.'", "'\\n'", "'\\r'", "'\\t'", "'package'", 
			"'import'", "'class'", "'fun'", "'object'", "'val'", "'var'", "'constructor'", 
			"'by'", "'this'", "'where'", "'if'", "'else'", "'when'", "'try'", "'catch'", 
			"'for'", "'do'", "'while'", "'throw'", "'return'", "'continue'", "'break'", 
			"'as'", "'is'", "'in'", "'!is'", "'!in'", "'out'", "'dynamic'", "'public'", 
			"'private'", "'protected'", "'internal'", "'enum'", "'override'", "'open'", 
			"'lateinit'", "'it'", "'null'", null, "' '", "'\\u00E2\\u20AC\\u017E'", 
			"'`'", "'downTo'", "'step'", "'..'", "'String'", "'Int'", "':'", "'println'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "PROCENT", "INCREMENT", 
			"DECREMENT", "AND", "OR", "NOT", "ASSIGN", "ASSIGN_ADD", "ASSIGN_MINUS", 
			"ASSIGN_MULTIPLY", "ASSIGN_DIVIDE", "ASSIGN_PERCENT", "EQUALS", "NOT_EQUALS", 
			"SMALLER", "BIGGER", "SMALLER_OR_EQUAL", "BIGGER_OR_EQUAL", "LEFT_INDEX", 
			"RIGHT_INDEX", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_CURVY_BRACKET", 
			"RIGHT_CURVY_BRACKET", "DELI", "DOT", "NL", "NL2", "NL3", "PACKAGE", 
			"IMPORT", "CLASS", "FUN", "OBJECT", "VAL_INIT", "VAR_INIT", "CONSTRUCTOR", 
			"BY", "THIS", "WHERE", "IF_INIT", "ELSE_INIT", "WHEN", "TRY_INIT", "CATCH_INIT", 
			"FOR_INIT", "DO_INIT", "WHILE_INIT", "THROW_INIT", "RETURN_INIT", "CONT_INIT", 
			"BREAK_INIT", "AS", "IS", "IN", "NOT_IS", "NOT_IN", "OUT", "DYNAMIC", 
			"PUBLIC", "PRIVATE", "PROTECTED", "INTERNAL", "ENUM", "OVERRIDE", "OPEN", 
			"LATEINIT", "IT", "NULL", "BooleanLiteral", "SPACE", "COMM", "COM", "DOWNTO", 
			"STEP", "DOTDOT", "STRING", "INT", "COLON", "PRINTLN", "EscapedIdentifier", 
			"Liczba_calk", "Nazwa", "Char", "String", "Liczba_zmiennoprzecin"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GrammarInit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarInitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartowyContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarInitParser.EOF, 0); }
		public StartowyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startowy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterStartowy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitStartowy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitStartowy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartowyContext startowy() throws RecognitionException {
		StartowyContext _localctx = new StartowyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startowy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			classDeclaration();
			setState(51);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> Nazwa() { return getTokens(GrammarInitParser.Nazwa); }
		public TerminalNode Nazwa(int i) {
			return getToken(GrammarInitParser.Nazwa, i);
		}
		public List<TerminalNode> Liczba_calk() { return getTokens(GrammarInitParser.Liczba_calk); }
		public TerminalNode Liczba_calk(int i) {
			return getToken(GrammarInitParser.Liczba_calk, i);
		}
		public List<TerminalNode> Liczba_zmiennoprzecin() { return getTokens(GrammarInitParser.Liczba_zmiennoprzecin); }
		public TerminalNode Liczba_zmiennoprzecin(int i) {
			return getToken(GrammarInitParser.Liczba_zmiennoprzecin, i);
		}
		public TerminalNode EQUALS() { return getToken(GrammarInitParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(GrammarInitParser.NOT_EQUALS, 0); }
		public TerminalNode SMALLER() { return getToken(GrammarInitParser.SMALLER, 0); }
		public TerminalNode BIGGER() { return getToken(GrammarInitParser.BIGGER, 0); }
		public TerminalNode SMALLER_OR_EQUAL() { return getToken(GrammarInitParser.SMALLER_OR_EQUAL, 0); }
		public TerminalNode BIGGER_OR_EQUAL() { return getToken(GrammarInitParser.BIGGER_OR_EQUAL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (Liczba_calk - 86)) | (1L << (Nazwa - 86)) | (1L << (Liczba_zmiennoprzecin - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << SMALLER) | (1L << BIGGER) | (1L << SMALLER_OR_EQUAL) | (1L << BIGGER_OR_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(55);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (Liczba_calk - 86)) | (1L << (Nazwa - 86)) | (1L << (Liczba_zmiennoprzecin - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(GrammarInitParser.ASSIGN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> Nazwa() { return getTokens(GrammarInitParser.Nazwa); }
		public TerminalNode Nazwa(int i) {
			return getToken(GrammarInitParser.Nazwa, i);
		}
		public TerminalNode Liczba_zmiennoprzecin() { return getToken(GrammarInitParser.Liczba_zmiennoprzecin, 0); }
		public TerminalNode Liczba_calk() { return getToken(GrammarInitParser.Liczba_calk, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_INIT:
				{
				setState(57);
				variable();
				}
				break;
			case Nazwa:
				{
				setState(58);
				match(Nazwa);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(61);
			match(ASSIGN);
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(62);
				match(Nazwa);
				}
				break;
			case 2:
				{
				setState(63);
				match(Liczba_zmiennoprzecin);
				}
				break;
			case 3:
				{
				setState(64);
				match(Liczba_calk);
				}
				break;
			case 4:
				{
				setState(65);
				function_call();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode IF_INIT() { return getToken(GrammarInitParser.IF_INIT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GrammarInitParser.LEFT_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(GrammarInitParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_CURVY_BRACKET() { return getToken(GrammarInitParser.LEFT_CURVY_BRACKET, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode RIGHT_CURVY_BRACKET() { return getToken(GrammarInitParser.RIGHT_CURVY_BRACKET, 0); }
		public List<Else_statContext> else_stat() {
			return getRuleContexts(Else_statContext.class);
		}
		public Else_statContext else_stat(int i) {
			return getRuleContext(Else_statContext.class,i);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IF_INIT);
			setState(69);
			match(LEFT_BRACKET);
			setState(70);
			condition();
			setState(71);
			match(RIGHT_BRACKET);
			setState(72);
			match(LEFT_CURVY_BRACKET);
			setState(73);
			instruction();
			setState(74);
			match(RIGHT_CURVY_BRACKET);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_INIT) {
				{
				{
				setState(75);
				else_stat();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_statContext extends ParserRuleContext {
		public TerminalNode ELSE_INIT() { return getToken(GrammarInitParser.ELSE_INIT, 0); }
		public TerminalNode LEFT_CURVY_BRACKET() { return getToken(GrammarInitParser.LEFT_CURVY_BRACKET, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode RIGHT_CURVY_BRACKET() { return getToken(GrammarInitParser.RIGHT_CURVY_BRACKET, 0); }
		public Else_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterElse_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitElse_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitElse_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statContext else_stat() throws RecognitionException {
		Else_statContext _localctx = new Else_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ELSE_INIT);
			setState(82);
			match(LEFT_CURVY_BRACKET);
			setState(83);
			instruction();
			setState(84);
			match(RIGHT_CURVY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE_INIT() { return getToken(GrammarInitParser.WHILE_INIT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GrammarInitParser.LEFT_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(GrammarInitParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_CURVY_BRACKET() { return getToken(GrammarInitParser.LEFT_CURVY_BRACKET, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode RIGHT_CURVY_BRACKET() { return getToken(GrammarInitParser.RIGHT_CURVY_BRACKET, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(WHILE_INIT);
			setState(87);
			match(LEFT_BRACKET);
			setState(88);
			condition();
			setState(89);
			match(RIGHT_BRACKET);
			setState(90);
			match(LEFT_CURVY_BRACKET);
			setState(91);
			instruction();
			setState(92);
			match(RIGHT_CURVY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR_INIT() { return getToken(GrammarInitParser.FOR_INIT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GrammarInitParser.LEFT_BRACKET, 0); }
		public TerminalNode Nazwa() { return getToken(GrammarInitParser.Nazwa, 0); }
		public TerminalNode IN() { return getToken(GrammarInitParser.IN, 0); }
		public For_insideContext for_inside() {
			return getRuleContext(For_insideContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(GrammarInitParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_CURVY_BRACKET() { return getToken(GrammarInitParser.LEFT_CURVY_BRACKET, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode RIGHT_CURVY_BRACKET() { return getToken(GrammarInitParser.RIGHT_CURVY_BRACKET, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(FOR_INIT);
			setState(95);
			match(LEFT_BRACKET);
			setState(96);
			match(Nazwa);
			setState(97);
			match(IN);
			setState(98);
			for_inside();
			setState(99);
			match(RIGHT_BRACKET);
			setState(100);
			match(LEFT_CURVY_BRACKET);
			setState(101);
			instruction();
			setState(102);
			match(RIGHT_CURVY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_insideContext extends ParserRuleContext {
		public List<TerminalNode> Liczba_calk() { return getTokens(GrammarInitParser.Liczba_calk); }
		public TerminalNode Liczba_calk(int i) {
			return getToken(GrammarInitParser.Liczba_calk, i);
		}
		public TerminalNode DOTDOT() { return getToken(GrammarInitParser.DOTDOT, 0); }
		public TerminalNode Nazwa() { return getToken(GrammarInitParser.Nazwa, 0); }
		public For_insideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_inside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterFor_inside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitFor_inside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitFor_inside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_insideContext for_inside() throws RecognitionException {
		For_insideContext _localctx = new For_insideContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_inside);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Liczba_calk:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(104);
				match(Liczba_calk);
				setState(105);
				match(DOTDOT);
				setState(106);
				match(Liczba_calk);
				}
				}
				break;
			case Nazwa:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(Nazwa);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode DO_INIT() { return getToken(GrammarInitParser.DO_INIT, 0); }
		public TerminalNode LEFT_CURVY_BRACKET() { return getToken(GrammarInitParser.LEFT_CURVY_BRACKET, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode RIGHT_CURVY_BRACKET() { return getToken(GrammarInitParser.RIGHT_CURVY_BRACKET, 0); }
		public TerminalNode WHILE_INIT() { return getToken(GrammarInitParser.WHILE_INIT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GrammarInitParser.LEFT_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(GrammarInitParser.RIGHT_BRACKET, 0); }
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitDo_while_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(DO_INIT);
			setState(111);
			match(LEFT_CURVY_BRACKET);
			setState(112);
			instruction();
			setState(113);
			match(RIGHT_CURVY_BRACKET);
			setState(114);
			match(WHILE_INIT);
			setState(115);
			match(LEFT_BRACKET);
			setState(116);
			condition();
			setState(117);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode LEFT_CURVY_BRACKET() { return getToken(GrammarInitParser.LEFT_CURVY_BRACKET, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode RIGHT_CURVY_BRACKET() { return getToken(GrammarInitParser.RIGHT_CURVY_BRACKET, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(LEFT_CURVY_BRACKET);
			setState(120);
			instruction();
			setState(121);
			match(RIGHT_CURVY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(GrammarInitParser.FUN, 0); }
		public TerminalNode Nazwa() { return getToken(GrammarInitParser.Nazwa, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GrammarInitParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GrammarInitParser.RIGHT_BRACKET, 0); }
		public Fun_argContext fun_arg() {
			return getRuleContext(Fun_argContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrammarInitParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(FUN);
			setState(124);
			match(Nazwa);
			setState(125);
			match(LEFT_BRACKET);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Nazwa) {
				{
				setState(126);
				fun_arg();
				}
			}

			setState(129);
			match(RIGHT_BRACKET);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(130);
				match(COLON);
				setState(131);
				type();
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_CURVY_BRACKET) {
				{
				setState(134);
				function_body();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_catch_statContext extends ParserRuleContext {
		public TerminalNode TRY_INIT() { return getToken(GrammarInitParser.TRY_INIT, 0); }
		public List<TerminalNode> LEFT_CURVY_BRACKET() { return getTokens(GrammarInitParser.LEFT_CURVY_BRACKET); }
		public TerminalNode LEFT_CURVY_BRACKET(int i) {
			return getToken(GrammarInitParser.LEFT_CURVY_BRACKET, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> RIGHT_CURVY_BRACKET() { return getTokens(GrammarInitParser.RIGHT_CURVY_BRACKET); }
		public TerminalNode RIGHT_CURVY_BRACKET(int i) {
			return getToken(GrammarInitParser.RIGHT_CURVY_BRACKET, i);
		}
		public TerminalNode CATCH_INIT() { return getToken(GrammarInitParser.CATCH_INIT, 0); }
		public Try_catch_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_catch_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterTry_catch_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitTry_catch_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitTry_catch_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_catch_statContext try_catch_stat() throws RecognitionException {
		Try_catch_statContext _localctx = new Try_catch_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_try_catch_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(TRY_INIT);
			setState(138);
			match(LEFT_CURVY_BRACKET);
			setState(139);
			instruction();
			setState(140);
			match(RIGHT_CURVY_BRACKET);
			setState(141);
			match(CATCH_INIT);
			setState(142);
			match(LEFT_CURVY_BRACKET);
			setState(143);
			instruction();
			setState(144);
			match(RIGHT_CURVY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statContext extends ParserRuleContext {
		public TerminalNode RETURN_INIT() { return getToken(GrammarInitParser.RETURN_INIT, 0); }
		public TerminalNode Nazwa() { return getToken(GrammarInitParser.Nazwa, 0); }
		public TerminalNode Liczba_zmiennoprzecin() { return getToken(GrammarInitParser.Liczba_zmiennoprzecin, 0); }
		public TerminalNode Liczba_calk() { return getToken(GrammarInitParser.Liczba_calk, 0); }
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterReturn_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitReturn_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitReturn_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_return_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(RETURN_INIT);
			setState(147);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (Liczba_calk - 86)) | (1L << (Nazwa - 86)) | (1L << (Liczba_zmiennoprzecin - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Komentarz_pojContext extends ParserRuleContext {
		public List<TerminalNode> DIVIDE() { return getTokens(GrammarInitParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(GrammarInitParser.DIVIDE, i);
		}
		public TerminalNode String() { return getToken(GrammarInitParser.String, 0); }
		public TerminalNode EscapedIdentifier() { return getToken(GrammarInitParser.EscapedIdentifier, 0); }
		public Komentarz_pojContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komentarz_poj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterKomentarz_poj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitKomentarz_poj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitKomentarz_poj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Komentarz_pojContext komentarz_poj() throws RecognitionException {
		Komentarz_pojContext _localctx = new Komentarz_pojContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_komentarz_poj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(DIVIDE);
			setState(150);
			match(DIVIDE);
			setState(151);
			match(String);
			setState(152);
			match(EscapedIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Komentarz_wielContext extends ParserRuleContext {
		public List<TerminalNode> DIVIDE() { return getTokens(GrammarInitParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(GrammarInitParser.DIVIDE, i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(GrammarInitParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(GrammarInitParser.MULTIPLY, i);
		}
		public TerminalNode String() { return getToken(GrammarInitParser.String, 0); }
		public Komentarz_wielContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komentarz_wiel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterKomentarz_wiel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitKomentarz_wiel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitKomentarz_wiel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Komentarz_wielContext komentarz_wiel() throws RecognitionException {
		Komentarz_wielContext _localctx = new Komentarz_wielContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_komentarz_wiel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(DIVIDE);
			setState(155);
			match(MULTIPLY);
			setState(156);
			match(String);
			setState(157);
			match(MULTIPLY);
			setState(158);
			match(DIVIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public List<For_loopContext> for_loop() {
			return getRuleContexts(For_loopContext.class);
		}
		public For_loopContext for_loop(int i) {
			return getRuleContext(For_loopContext.class,i);
		}
		public List<If_statContext> if_stat() {
			return getRuleContexts(If_statContext.class);
		}
		public If_statContext if_stat(int i) {
			return getRuleContext(If_statContext.class,i);
		}
		public List<While_loopContext> while_loop() {
			return getRuleContexts(While_loopContext.class);
		}
		public While_loopContext while_loop(int i) {
			return getRuleContext(While_loopContext.class,i);
		}
		public List<TerminalNode> Nazwa() { return getTokens(GrammarInitParser.Nazwa); }
		public TerminalNode Nazwa(int i) {
			return getToken(GrammarInitParser.Nazwa, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<Do_while_loopContext> do_while_loop() {
			return getRuleContexts(Do_while_loopContext.class);
		}
		public Do_while_loopContext do_while_loop(int i) {
			return getRuleContext(Do_while_loopContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<Try_catch_statContext> try_catch_stat() {
			return getRuleContexts(Try_catch_statContext.class);
		}
		public Try_catch_statContext try_catch_stat(int i) {
			return getRuleContext(Try_catch_statContext.class,i);
		}
		public List<Komentarz_pojContext> komentarz_poj() {
			return getRuleContexts(Komentarz_pojContext.class);
		}
		public Komentarz_pojContext komentarz_poj(int i) {
			return getRuleContext(Komentarz_pojContext.class,i);
		}
		public List<Komentarz_wielContext> komentarz_wiel() {
			return getRuleContexts(Komentarz_wielContext.class);
		}
		public Komentarz_wielContext komentarz_wiel(int i) {
			return getRuleContext(Komentarz_wielContext.class,i);
		}
		public List<Return_statContext> return_stat() {
			return getRuleContexts(Return_statContext.class);
		}
		public Return_statContext return_stat(int i) {
			return getRuleContext(Return_statContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(GrammarInitParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GrammarInitParser.NL, i);
		}
		public List<TerminalNode> INCREMENT() { return getTokens(GrammarInitParser.INCREMENT); }
		public TerminalNode INCREMENT(int i) {
			return getToken(GrammarInitParser.INCREMENT, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<PrintlnContext> println() {
			return getRuleContexts(PrintlnContext.class);
		}
		public PrintlnContext println(int i) {
			return getRuleContext(PrintlnContext.class,i);
		}
		public List<DecrementContext> decrement() {
			return getRuleContexts(DecrementContext.class);
		}
		public DecrementContext decrement(int i) {
			return getRuleContext(DecrementContext.class,i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << NL) | (1L << FUN) | (1L << VAR_INIT) | (1L << IF_INIT) | (1L << TRY_INIT) | (1L << FOR_INIT) | (1L << DO_INIT) | (1L << WHILE_INIT) | (1L << RETURN_INIT))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (PRINTLN - 84)) | (1L << (Liczba_calk - 84)) | (1L << (Nazwa - 84)))) != 0)) {
				{
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(160);
					for_loop();
					}
					break;
				case 2:
					{
					setState(161);
					if_stat();
					}
					break;
				case 3:
					{
					setState(162);
					while_loop();
					}
					break;
				case 4:
					{
					setState(163);
					match(Nazwa);
					}
					break;
				case 5:
					{
					setState(164);
					variable();
					}
					break;
				case 6:
					{
					setState(165);
					assignment();
					}
					break;
				case 7:
					{
					setState(166);
					do_while_loop();
					}
					break;
				case 8:
					{
					setState(167);
					function();
					}
					break;
				case 9:
					{
					setState(168);
					try_catch_stat();
					}
					break;
				case 10:
					{
					setState(169);
					komentarz_poj();
					}
					break;
				case 11:
					{
					setState(170);
					komentarz_wiel();
					}
					break;
				case 12:
					{
					setState(171);
					return_stat();
					}
					break;
				case 13:
					{
					setState(172);
					match(NL);
					}
					break;
				case 14:
					{
					setState(173);
					match(Nazwa);
					setState(174);
					match(INCREMENT);
					}
					break;
				case 15:
					{
					setState(175);
					function_call();
					}
					break;
				case 16:
					{
					setState(176);
					println();
					}
					break;
				case 17:
					{
					setState(177);
					decrement();
					}
					break;
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(GrammarInitParser.CLASS, 0); }
		public TerminalNode Nazwa() { return getToken(GrammarInitParser.Nazwa, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GrammarInitParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GrammarInitParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_CURVY_BRACKET() { return getToken(GrammarInitParser.LEFT_CURVY_BRACKET, 0); }
		public TerminalNode RIGHT_CURVY_BRACKET() { return getToken(GrammarInitParser.RIGHT_CURVY_BRACKET, 0); }
		public TerminalNode PRIVATE() { return getToken(GrammarInitParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(GrammarInitParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(GrammarInitParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(GrammarInitParser.INTERNAL, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PUBLIC - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (INTERNAL - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(184);
			match(CLASS);
			setState(185);
			match(Nazwa);
			setState(186);
			match(LEFT_BRACKET);
			setState(187);
			match(RIGHT_BRACKET);
			setState(188);
			match(LEFT_CURVY_BRACKET);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(189);
				class_body();
				}
				break;
			}
			setState(192);
			match(RIGHT_CURVY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR_INIT() { return getToken(GrammarInitParser.VAR_INIT, 0); }
		public TerminalNode Nazwa() { return getToken(GrammarInitParser.Nazwa, 0); }
		public TerminalNode COLON() { return getToken(GrammarInitParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(VAR_INIT);
			setState(195);
			match(Nazwa);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(196);
				match(COLON);
				setState(197);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (FUN - 37)) | (1L << (VAR_INIT - 37)) | (1L << (Nazwa - 37)))) != 0)) {
				{
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(200);
					assignment();
					}
					break;
				case 2:
					{
					setState(201);
					function();
					}
					break;
				case 3:
					{
					setState(202);
					variable();
					}
					break;
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode Nazwa() { return getToken(GrammarInitParser.Nazwa, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GrammarInitParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GrammarInitParser.RIGHT_BRACKET, 0); }
		public List<Argument_listContext> argument_list() {
			return getRuleContexts(Argument_listContext.class);
		}
		public Argument_listContext argument_list(int i) {
			return getRuleContext(Argument_listContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(Nazwa);
			setState(209);
			match(LEFT_BRACKET);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (Liczba_calk - 86)) | (1L << (Nazwa - 86)) | (1L << (Liczba_zmiennoprzecin - 86)))) != 0)) {
				{
				{
				setState(210);
				argument_list();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<TerminalNode> Nazwa() { return getTokens(GrammarInitParser.Nazwa); }
		public TerminalNode Nazwa(int i) {
			return getToken(GrammarInitParser.Nazwa, i);
		}
		public List<TerminalNode> Liczba_calk() { return getTokens(GrammarInitParser.Liczba_calk); }
		public TerminalNode Liczba_calk(int i) {
			return getToken(GrammarInitParser.Liczba_calk, i);
		}
		public List<TerminalNode> Liczba_zmiennoprzecin() { return getTokens(GrammarInitParser.Liczba_zmiennoprzecin); }
		public TerminalNode Liczba_zmiennoprzecin(int i) {
			return getToken(GrammarInitParser.Liczba_zmiennoprzecin, i);
		}
		public List<TerminalNode> DELI() { return getTokens(GrammarInitParser.DELI); }
		public TerminalNode DELI(int i) {
			return getToken(GrammarInitParser.DELI, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argument_list);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Nazwa:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(Nazwa);
				}
				break;
			case Liczba_calk:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(Liczba_calk);
				}
				break;
			case Liczba_zmiennoprzecin:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(Liczba_zmiennoprzecin);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DELI) {
					{
					{
					setState(221);
					match(DELI);
					setState(222);
					_la = _input.LA(1);
					if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (Liczba_calk - 86)) | (1L << (Nazwa - 86)) | (1L << (Liczba_zmiennoprzecin - 86)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_argContext extends ParserRuleContext {
		public List<TerminalNode> Nazwa() { return getTokens(GrammarInitParser.Nazwa); }
		public TerminalNode Nazwa(int i) {
			return getToken(GrammarInitParser.Nazwa, i);
		}
		public List<TerminalNode> COLON() { return getTokens(GrammarInitParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GrammarInitParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> DELI() { return getTokens(GrammarInitParser.DELI); }
		public TerminalNode DELI(int i) {
			return getToken(GrammarInitParser.DELI, i);
		}
		public Fun_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterFun_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitFun_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitFun_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_argContext fun_arg() throws RecognitionException {
		Fun_argContext _localctx = new Fun_argContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fun_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(Nazwa);
			setState(231);
			match(COLON);
			setState(232);
			type();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELI) {
				{
				{
				setState(233);
				match(DELI);
				setState(234);
				match(Nazwa);
				setState(235);
				match(COLON);
				setState(236);
				type();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarInitParser.STRING, 0); }
		public TerminalNode INT() { return getToken(GrammarInitParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(GrammarInitParser.PRINTLN, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(GrammarInitParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GrammarInitParser.RIGHT_BRACKET, 0); }
		public TerminalNode Nazwa() { return getToken(GrammarInitParser.Nazwa, 0); }
		public TerminalNode STRING() { return getToken(GrammarInitParser.STRING, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(PRINTLN);
			setState(245);
			match(LEFT_BRACKET);
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(246);
				match(Nazwa);
				}
				break;
			case 2:
				{
				setState(247);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(248);
				function_call();
				}
				break;
			}
			setState(251);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecrementContext extends ParserRuleContext {
		public TerminalNode DECREMENT() { return getToken(GrammarInitParser.DECREMENT, 0); }
		public TerminalNode Liczba_calk() { return getToken(GrammarInitParser.Liczba_calk, 0); }
		public TerminalNode Nazwa() { return getToken(GrammarInitParser.Nazwa, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarInitListener ) ((GrammarInitListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarInitVisitor ) return ((GrammarInitVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_decrement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==Liczba_calk || _la==Nazwa) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(254);
			match(DECREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001Z\u0101\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007m\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0080\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0085\b\n\u0001\n\u0003\n\u0088\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00b3\b\u000f\n\u000f\f\u000f\u00b6\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00bf\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c7\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00cc\b\u0012\n\u0012\f\u0012\u00cf"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00d4\b\u0013"+
		"\n\u0013\f\u0013\u00d7\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00e0\b\u0014\n"+
		"\u0014\f\u0014\u00e3\t\u0014\u0003\u0014\u00e5\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u00ee\b\u0015\n\u0015\f\u0015\u00f1\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00fa\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0005\u0002"+
		"\u0000VWZZ\u0001\u0000\u0011\u0016\u0001\u0000@C\u0001\u0000QR\u0001\u0000"+
		"VW\u010d\u00002\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000"+
		"\u0004;\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bQ\u0001"+
		"\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000\u0000"+
		"\u000el\u0001\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012w"+
		"\u0001\u0000\u0000\u0000\u0014{\u0001\u0000\u0000\u0000\u0016\u0089\u0001"+
		"\u0000\u0000\u0000\u0018\u0092\u0001\u0000\u0000\u0000\u001a\u0095\u0001"+
		"\u0000\u0000\u0000\u001c\u009a\u0001\u0000\u0000\u0000\u001e\u00b4\u0001"+
		"\u0000\u0000\u0000 \u00b7\u0001\u0000\u0000\u0000\"\u00c2\u0001\u0000"+
		"\u0000\u0000$\u00cd\u0001\u0000\u0000\u0000&\u00d0\u0001\u0000\u0000\u0000"+
		"(\u00e4\u0001\u0000\u0000\u0000*\u00e6\u0001\u0000\u0000\u0000,\u00f2"+
		"\u0001\u0000\u0000\u0000.\u00f4\u0001\u0000\u0000\u00000\u00fd\u0001\u0000"+
		"\u0000\u000023\u0003 \u0010\u000034\u0005\u0000\u0000\u00014\u0001\u0001"+
		"\u0000\u0000\u000056\u0007\u0000\u0000\u000067\u0007\u0001\u0000\u0000"+
		"78\u0007\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009<\u0003\"\u0011"+
		"\u0000:<\u0005W\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=B\u0005\u000b\u0000\u0000>C\u0005W\u0000"+
		"\u0000?C\u0005Z\u0000\u0000@C\u0005V\u0000\u0000AC\u0003&\u0013\u0000"+
		"B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005"+
		"-\u0000\u0000EF\u0005\u0019\u0000\u0000FG\u0003\u0002\u0001\u0000GH\u0005"+
		"\u001a\u0000\u0000HI\u0005\u001b\u0000\u0000IJ\u0003\u001e\u000f\u0000"+
		"JN\u0005\u001c\u0000\u0000KM\u0003\b\u0004\u0000LK\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000O\u0007\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005"+
		".\u0000\u0000RS\u0005\u001b\u0000\u0000ST\u0003\u001e\u000f\u0000TU\u0005"+
		"\u001c\u0000\u0000U\t\u0001\u0000\u0000\u0000VW\u00054\u0000\u0000WX\u0005"+
		"\u0019\u0000\u0000XY\u0003\u0002\u0001\u0000YZ\u0005\u001a\u0000\u0000"+
		"Z[\u0005\u001b\u0000\u0000[\\\u0003\u001e\u000f\u0000\\]\u0005\u001c\u0000"+
		"\u0000]\u000b\u0001\u0000\u0000\u0000^_\u00052\u0000\u0000_`\u0005\u0019"+
		"\u0000\u0000`a\u0005W\u0000\u0000ab\u0005;\u0000\u0000bc\u0003\u000e\u0007"+
		"\u0000cd\u0005\u001a\u0000\u0000de\u0005\u001b\u0000\u0000ef\u0003\u001e"+
		"\u000f\u0000fg\u0005\u001c\u0000\u0000g\r\u0001\u0000\u0000\u0000hi\u0005"+
		"V\u0000\u0000ij\u0005P\u0000\u0000jm\u0005V\u0000\u0000km\u0005W\u0000"+
		"\u0000lh\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\u000f\u0001"+
		"\u0000\u0000\u0000no\u00053\u0000\u0000op\u0005\u001b\u0000\u0000pq\u0003"+
		"\u001e\u000f\u0000qr\u0005\u001c\u0000\u0000rs\u00054\u0000\u0000st\u0005"+
		"\u0019\u0000\u0000tu\u0003\u0002\u0001\u0000uv\u0005\u001a\u0000\u0000"+
		"v\u0011\u0001\u0000\u0000\u0000wx\u0005\u001b\u0000\u0000xy\u0003\u001e"+
		"\u000f\u0000yz\u0005\u001c\u0000\u0000z\u0013\u0001\u0000\u0000\u0000"+
		"{|\u0005%\u0000\u0000|}\u0005W\u0000\u0000}\u007f\u0005\u0019\u0000\u0000"+
		"~\u0080\u0003*\u0015\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0005\u001a\u0000\u0000\u0082\u0083\u0005S\u0000\u0000\u0083\u0085\u0003"+
		",\u0016\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0012"+
		"\t\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u008a\u00050\u0000\u0000"+
		"\u008a\u008b\u0005\u001b\u0000\u0000\u008b\u008c\u0003\u001e\u000f\u0000"+
		"\u008c\u008d\u0005\u001c\u0000\u0000\u008d\u008e\u00051\u0000\u0000\u008e"+
		"\u008f\u0005\u001b\u0000\u0000\u008f\u0090\u0003\u001e\u000f\u0000\u0090"+
		"\u0091\u0005\u001c\u0000\u0000\u0091\u0017\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u00056\u0000\u0000\u0093\u0094\u0007\u0000\u0000\u0000\u0094\u0019"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0004\u0000\u0000\u0096\u0097"+
		"\u0005\u0004\u0000\u0000\u0097\u0098\u0005Y\u0000\u0000\u0098\u0099\u0005"+
		"U\u0000\u0000\u0099\u001b\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0004"+
		"\u0000\u0000\u009b\u009c\u0005\u0003\u0000\u0000\u009c\u009d\u0005Y\u0000"+
		"\u0000\u009d\u009e\u0005\u0003\u0000\u0000\u009e\u009f\u0005\u0004\u0000"+
		"\u0000\u009f\u001d\u0001\u0000\u0000\u0000\u00a0\u00b3\u0003\f\u0006\u0000"+
		"\u00a1\u00b3\u0003\u0006\u0003\u0000\u00a2\u00b3\u0003\n\u0005\u0000\u00a3"+
		"\u00b3\u0005W\u0000\u0000\u00a4\u00b3\u0003\"\u0011\u0000\u00a5\u00b3"+
		"\u0003\u0004\u0002\u0000\u00a6\u00b3\u0003\u0010\b\u0000\u00a7\u00b3\u0003"+
		"\u0014\n\u0000\u00a8\u00b3\u0003\u0016\u000b\u0000\u00a9\u00b3\u0003\u001a"+
		"\r\u0000\u00aa\u00b3\u0003\u001c\u000e\u0000\u00ab\u00b3\u0003\u0018\f"+
		"\u0000\u00ac\u00b3\u0005\u001f\u0000\u0000\u00ad\u00ae\u0005W\u0000\u0000"+
		"\u00ae\u00b3\u0005\u0006\u0000\u0000\u00af\u00b3\u0003&\u0013\u0000\u00b0"+
		"\u00b3\u0003.\u0017\u0000\u00b1\u00b3\u00030\u0018\u0000\u00b2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00a1\u0001\u0000\u0000\u0000\u00b2\u00a2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00a3\u0001\u0000\u0000\u0000\u00b2\u00a4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00a5\u0001\u0000\u0000\u0000\u00b2\u00a6\u0001"+
		"\u0000\u0000\u0000\u00b2\u00a7\u0001\u0000\u0000\u0000\u00b2\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b2\u00a9\u0001\u0000\u0000\u0000\u00b2\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b2\u00ab\u0001\u0000\u0000\u0000\u00b2\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b2\u00af\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u001f\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007"+
		"\u0002\u0000\u0000\u00b8\u00b9\u0005$\u0000\u0000\u00b9\u00ba\u0005W\u0000"+
		"\u0000\u00ba\u00bb\u0005\u0019\u0000\u0000\u00bb\u00bc\u0005\u001a\u0000"+
		"\u0000\u00bc\u00be\u0005\u001b\u0000\u0000\u00bd\u00bf\u0003$\u0012\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u001c\u0000\u0000"+
		"\u00c1!\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005(\u0000\u0000\u00c3\u00c6"+
		"\u0005W\u0000\u0000\u00c4\u00c5\u0005S\u0000\u0000\u00c5\u00c7\u0003,"+
		"\u0016\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7#\u0001\u0000\u0000\u0000\u00c8\u00cc\u0003\u0004\u0002"+
		"\u0000\u00c9\u00cc\u0003\u0014\n\u0000\u00ca\u00cc\u0003\"\u0011\u0000"+
		"\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce%\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0005W\u0000\u0000\u00d1\u00d5\u0005\u0019\u0000\u0000\u00d2\u00d4"+
		"\u0003(\u0014\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005\u001a\u0000\u0000\u00d9\'\u0001\u0000"+
		"\u0000\u0000\u00da\u00e5\u0005W\u0000\u0000\u00db\u00e5\u0005V\u0000\u0000"+
		"\u00dc\u00e1\u0005Z\u0000\u0000\u00dd\u00de\u0005\u001d\u0000\u0000\u00de"+
		"\u00e0\u0007\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e4\u00da\u0001\u0000\u0000\u0000\u00e4"+
		"\u00db\u0001\u0000\u0000\u0000\u00e4\u00dc\u0001\u0000\u0000\u0000\u00e5"+
		")\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005W\u0000\u0000\u00e7\u00e8\u0005"+
		"S\u0000\u0000\u00e8\u00ef\u0003,\u0016\u0000\u00e9\u00ea\u0005\u001d\u0000"+
		"\u0000\u00ea\u00eb\u0005W\u0000\u0000\u00eb\u00ec\u0005S\u0000\u0000\u00ec"+
		"\u00ee\u0003,\u0016\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ee\u00f1"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0+\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0007\u0003\u0000\u0000\u00f3-\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005T\u0000\u0000\u00f5\u00f9\u0005\u0019\u0000"+
		"\u0000\u00f6\u00fa\u0005W\u0000\u0000\u00f7\u00fa\u0005Q\u0000\u0000\u00f8"+
		"\u00fa\u0003&\u0013\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00f9\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u001a\u0000\u0000\u00fc/\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0007\u0004\u0000\u0000\u00fe\u00ff\u0005"+
		"\u0007\u0000\u0000\u00ff1\u0001\u0000\u0000\u0000\u0012;BNl\u007f\u0084"+
		"\u0087\u00b2\u00b4\u00be\u00c6\u00cb\u00cd\u00d5\u00e1\u00e4\u00ef\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}