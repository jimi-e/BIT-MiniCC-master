package bit.minisys.minicc.parser;

// Generated from mygrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mygrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Auto=1, Break=2, Case=3, Char=4, Const=5, Continue=6, Default=7, Do=8, 
		Double=9, Else=10, Enum=11, Extern=12, Float=13, For=14, Goto=15, If=16, 
		Inline=17, Int=18, Long=19, Register=20, Restrict=21, Return=22, Short=23, 
		Signed=24, Sizeof=25, Static=26, Struct=27, Switch=28, Typedef=29, Union=30, 
		Unsigned=31, Void=32, Volatile=33, While=34, Alignas=35, Alignof=36, Atomic=37, 
		Bool=38, Complex=39, Generic=40, Imaginary=41, Noreturn=42, StaticAssert=43, 
		ThreadLocal=44, LeftParen=45, RightParen=46, RightParen2=47, LeftBracket=48, 
		RightBracket=49, LeftBrace=50, RightBrace=51, Less=52, LessEqual=53, Greater=54, 
		GreaterEqual=55, LeftShift=56, RightShift=57, Plus=58, PlusPlus=59, Minus=60, 
		MinusMinus=61, Star=62, Div=63, Mod=64, And=65, Or=66, AndAnd=67, OrOr=68, 
		Caret=69, Not=70, Tilde=71, Question=72, Colon=73, Semi=74, Comma=75, 
		Assign=76, StarAssign=77, DivAssign=78, ModAssign=79, PlusAssign=80, MinusAssign=81, 
		LeftShiftAssign=82, RightShiftAssign=83, AndAssign=84, XorAssign=85, OrAssign=86, 
		Equal=87, NotEqual=88, Arrow=89, Dot=90, Ellipsis=91, Identifier=92, Constant=93, 
		String_Literal=94, Complex_Define=95, Line_Directive=96, Space=97, Newline=98, 
		Block_Comment=99, Lin_Comment=100;
	public static final int
		RULE_primary_expression = 0, RULE_generic_selection = 1, RULE_generic_assoc_list = 2, 
		RULE_generic_association = 3, RULE_postfix_expression = 4, RULE_argument_expression_list = 5, 
		RULE_unary_expression = 6, RULE_unary_operator = 7, RULE_cast_expression = 8, 
		RULE_multiplicative_expression = 9, RULE_additive_expression = 10, RULE_shift_expression = 11, 
		RULE_relational_expression = 12, RULE_equality_expression = 13, RULE_and_expression = 14, 
		RULE_exclusive_OR_expression = 15, RULE_inclusive_OR_expression = 16, 
		RULE_logical_AND_expression = 17, RULE_logical_OR_expression = 18, RULE_conditional_expression = 19, 
		RULE_assignment_expression = 20, RULE_assignment_operator = 21, RULE_expression = 22, 
		RULE_constant_expression = 23, RULE_declaration = 24, RULE_declaration_specifiers = 25, 
		RULE_declaration_specifier = 26, RULE_init_declarator_list = 27, RULE_init_declarator = 28, 
		RULE_storage_class_specifier = 29, RULE_type_specifier = 30, RULE_struct_or_union_specifier = 31, 
		RULE_struct_or_union = 32, RULE_struct_declaration_list = 33, RULE_struct_declaration = 34, 
		RULE_specifier_qualifier_list = 35, RULE_struct_declarator_list = 36, 
		RULE_struct_declarator = 37, RULE_enum_specifier = 38, RULE_enumerator_list = 39, 
		RULE_enumerator = 40, RULE_enumerator_constant = 41, RULE_atomic_type_specifier = 42, 
		RULE_type_qualifier = 43, RULE_function_specifier = 44, RULE_alignment_specifier = 45, 
		RULE_declarator = 46, RULE_direct_declarator = 47, RULE_pointer = 48, 
		RULE_type_qualifier_list = 49, RULE_parameter_type_list = 50, RULE_parameter_list = 51, 
		RULE_parameter_declaration = 52, RULE_identifier_list = 53, RULE_type_name = 54, 
		RULE_abstract_declarator = 55, RULE_direct_abstract_declarator = 56, RULE_typedef_name = 57, 
		RULE_initializer = 58, RULE_initializer_list = 59, RULE_designation = 60, 
		RULE_designator_list = 61, RULE_designator = 62, RULE_static_assert_declaration = 63, 
		RULE_statement = 64, RULE_labeled_statement = 65, RULE_compound_statement = 66, 
		RULE_block_item_list = 67, RULE_block_item = 68, RULE_expression_statement = 69, 
		RULE_selection_statement = 70, RULE_iteration_statement = 71, RULE_for_condition = 72, 
		RULE_for_declaration = 73, RULE_for_expression = 74, RULE_jump_statement = 75, 
		RULE_compilation_unit = 76, RULE_translation_unit = 77, RULE_external_declaration = 78, 
		RULE_function_definition = 79, RULE_declaration_list = 80;
	private static String[] makeRuleNames() {
		return new String[] {
			"primary_expression", "generic_selection", "generic_assoc_list", "generic_association", 
			"postfix_expression", "argument_expression_list", "unary_expression", 
			"unary_operator", "cast_expression", "multiplicative_expression", "additive_expression", 
			"shift_expression", "relational_expression", "equality_expression", "and_expression", 
			"exclusive_OR_expression", "inclusive_OR_expression", "logical_AND_expression", 
			"logical_OR_expression", "conditional_expression", "assignment_expression", 
			"assignment_operator", "expression", "constant_expression", "declaration", 
			"declaration_specifiers", "declaration_specifier", "init_declarator_list", 
			"init_declarator", "storage_class_specifier", "type_specifier", "struct_or_union_specifier", 
			"struct_or_union", "struct_declaration_list", "struct_declaration", "specifier_qualifier_list", 
			"struct_declarator_list", "struct_declarator", "enum_specifier", "enumerator_list", 
			"enumerator", "enumerator_constant", "atomic_type_specifier", "type_qualifier", 
			"function_specifier", "alignment_specifier", "declarator", "direct_declarator", 
			"pointer", "type_qualifier_list", "parameter_type_list", "parameter_list", 
			"parameter_declaration", "identifier_list", "type_name", "abstract_declarator", 
			"direct_abstract_declarator", "typedef_name", "initializer", "initializer_list", 
			"designation", "designator_list", "designator", "static_assert_declaration", 
			"statement", "labeled_statement", "compound_statement", "block_item_list", 
			"block_item", "expression_statement", "selection_statement", "iteration_statement", 
			"for_condition", "for_declaration", "for_expression", "jump_statement", 
			"compilation_unit", "translation_unit", "external_declaration", "function_definition", 
			"declaration_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", 
			"'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", "'register'", 
			"'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
			"'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", 
			"'volatile'", "'while'", "'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", 
			"'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", "'_Static_assert'", 
			"'_Thread_local'", "'('", null, "') '", "'['", "']'", "'{'", "'}'", "'<'", 
			"'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", 
			"'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", 
			"'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", "'.'", 
			"'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Auto", "Break", "Case", "Char", "Const", "Continue", "Default", 
			"Do", "Double", "Else", "Enum", "Extern", "Float", "For", "Goto", "If", 
			"Inline", "Int", "Long", "Register", "Restrict", "Return", "Short", "Signed", 
			"Sizeof", "Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", 
			"Void", "Volatile", "While", "Alignas", "Alignof", "Atomic", "Bool", 
			"Complex", "Generic", "Imaginary", "Noreturn", "StaticAssert", "ThreadLocal", 
			"LeftParen", "RightParen", "RightParen2", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", 
			"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", 
			"Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
			"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", 
			"Arrow", "Dot", "Ellipsis", "Identifier", "Constant", "String_Literal", 
			"Complex_Define", "Line_Directive", "Space", "Newline", "Block_Comment", 
			"Lin_Comment"
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
	public String getGrammarFileName() { return "mygrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mygrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(mygrammarParser.Constant, 0); }
		public List<TerminalNode> String_Literal() { return getTokens(mygrammarParser.String_Literal); }
		public TerminalNode String_Literal(int i) {
			return getToken(mygrammarParser.String_Literal, i);
		}
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public Generic_selectionContext generic_selection() {
			return getRuleContext(Generic_selectionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primary_expression);
		try {
			int _alt;
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(Constant);
				}
				break;
			case String_Literal:
				enterOuterAlt(_localctx, 3);
				{
				setState(165); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(164);
						match(String_Literal);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(167); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(LeftParen);
				setState(170);
				expression(0);
				setState(171);
				match(RightParen);
				}
				break;
			case Generic:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				generic_selection();
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

	public static class Generic_selectionContext extends ParserRuleContext {
		public TerminalNode Generic() { return getToken(mygrammarParser.Generic, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Generic_assoc_listContext generic_assoc_list() {
			return getRuleContext(Generic_assoc_listContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public Generic_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterGeneric_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitGeneric_selection(this);
		}
	}

	public final Generic_selectionContext generic_selection() throws RecognitionException {
		Generic_selectionContext _localctx = new Generic_selectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_generic_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(Generic);
			setState(177);
			match(LeftParen);
			setState(178);
			assignment_expression();
			setState(179);
			match(Comma);
			setState(180);
			generic_assoc_list(0);
			setState(181);
			match(RightParen);
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

	public static class Generic_assoc_listContext extends ParserRuleContext {
		public Generic_associationContext generic_association() {
			return getRuleContext(Generic_associationContext.class,0);
		}
		public Generic_assoc_listContext generic_assoc_list() {
			return getRuleContext(Generic_assoc_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Generic_assoc_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_assoc_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterGeneric_assoc_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitGeneric_assoc_list(this);
		}
	}

	public final Generic_assoc_listContext generic_assoc_list() throws RecognitionException {
		return generic_assoc_list(0);
	}

	private Generic_assoc_listContext generic_assoc_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Generic_assoc_listContext _localctx = new Generic_assoc_listContext(_ctx, _parentState);
		Generic_assoc_listContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_generic_assoc_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184);
			generic_association();
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Generic_assoc_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_generic_assoc_list);
					setState(186);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(187);
					match(Comma);
					setState(188);
					generic_association();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Generic_associationContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(mygrammarParser.Colon, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(mygrammarParser.Default, 0); }
		public Generic_associationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterGeneric_association(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitGeneric_association(this);
		}
	}

	public final Generic_associationContext generic_association() throws RecognitionException {
		Generic_associationContext _localctx = new Generic_associationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_generic_association);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Star:
			case Colon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				type_name();
				setState(195);
				match(Colon);
				setState(196);
				assignment_expression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(Default);
				setState(199);
				match(Colon);
				setState(200);
				assignment_expression();
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(mygrammarParser.LeftBrace, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(mygrammarParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(mygrammarParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(mygrammarParser.RightBracket, 0); }
		public Argument_expression_listContext argument_expression_list() {
			return getRuleContext(Argument_expression_listContext.class,0);
		}
		public TerminalNode Dot() { return getToken(mygrammarParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public TerminalNode Arrow() { return getToken(mygrammarParser.Arrow, 0); }
		public TerminalNode PlusPlus() { return getToken(mygrammarParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(mygrammarParser.MinusMinus, 0); }
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitPostfix_expression(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(204);
				primary_expression();
				}
				break;
			case 2:
				{
				setState(205);
				match(LeftParen);
				setState(206);
				type_name();
				setState(207);
				match(RightParen);
				setState(208);
				match(LeftBrace);
				setState(209);
				initializer_list(0);
				setState(210);
				match(RightBrace);
				}
				break;
			case 3:
				{
				setState(212);
				match(LeftParen);
				setState(213);
				type_name();
				setState(214);
				match(RightParen);
				setState(215);
				match(LeftBrace);
				setState(216);
				initializer_list(0);
				setState(217);
				match(Comma);
				setState(218);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(222);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(223);
						match(LeftBracket);
						setState(224);
						expression(0);
						setState(225);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(227);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(228);
						match(LeftParen);
						setState(230);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
							{
							setState(229);
							argument_expression_list(0);
							}
						}

						setState(232);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(233);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(234);
						match(Dot);
						setState(235);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(236);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(237);
						match(Arrow);
						setState(238);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(239);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(240);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(241);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(242);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Argument_expression_listContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Argument_expression_listContext argument_expression_list() {
			return getRuleContext(Argument_expression_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterArgument_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitArgument_expression_list(this);
		}
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		return argument_expression_list(0);
	}

	private Argument_expression_listContext argument_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, _parentState);
		Argument_expression_listContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_argument_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(249);
			assignment_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Argument_expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argument_expression_list);
					setState(251);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(252);
					match(Comma);
					setState(253);
					assignment_expression();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(mygrammarParser.PlusPlus, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(mygrammarParser.MinusMinus, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(mygrammarParser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public TerminalNode Alignof() { return getToken(mygrammarParser.Alignof, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unary_expression);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				postfix_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(PlusPlus);
				setState(261);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(MinusMinus);
				setState(263);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				unary_operator();
				setState(265);
				cast_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				match(Sizeof);
				setState(268);
				unary_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				match(Sizeof);
				setState(270);
				match(LeftParen);
				setState(271);
				type_name();
				setState(272);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				match(Alignof);
				setState(275);
				match(LeftParen);
				setState(276);
				type_name();
				setState(277);
				match(RightParen);
				}
				break;
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(mygrammarParser.And, 0); }
		public TerminalNode Star() { return getToken(mygrammarParser.Star, 0); }
		public TerminalNode Plus() { return getToken(mygrammarParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(mygrammarParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(mygrammarParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(mygrammarParser.Not, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (Plus - 58)) | (1L << (Minus - 58)) | (1L << (Star - 58)) | (1L << (And - 58)) | (1L << (Not - 58)) | (1L << (Tilde - 58)))) != 0)) ) {
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

	public static class Cast_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cast_expression);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				unary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(LeftParen);
				setState(285);
				type_name();
				setState(286);
				match(RightParen);
				setState(287);
				cast_expression();
				}
				break;
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(mygrammarParser.Star, 0); }
		public TerminalNode Div() { return getToken(mygrammarParser.Div, 0); }
		public TerminalNode Mod() { return getToken(mygrammarParser.Mod, 0); }
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		return multiplicative_expression(0);
	}

	private Multiplicative_expressionContext multiplicative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, _parentState);
		Multiplicative_expressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_multiplicative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(292);
			cast_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(294);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(295);
						match(Star);
						setState(296);
						cast_expression();
						}
						break;
					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(297);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(298);
						match(Div);
						setState(299);
						cast_expression();
						}
						break;
					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(300);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(301);
						match(Mod);
						setState(302);
						cast_expression();
						}
						break;
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(mygrammarParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(mygrammarParser.Minus, 0); }
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		return additive_expression(0);
	}

	private Additive_expressionContext additive_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, _parentState);
		Additive_expressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_additive_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(309);
			multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(311);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(312);
						match(Plus);
						setState(313);
						multiplicative_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(314);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(315);
						match(Minus);
						setState(316);
						multiplicative_expression(0);
						}
						break;
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(mygrammarParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(mygrammarParser.RightShift, 0); }
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		return shift_expression(0);
	}

	private Shift_expressionContext shift_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, _parentState);
		Shift_expressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_shift_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(323);
			additive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Shift_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expression);
						setState(325);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(326);
						match(LeftShift);
						setState(327);
						additive_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Shift_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expression);
						setState(328);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(329);
						match(RightShift);
						setState(330);
						additive_expression(0);
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(mygrammarParser.Less, 0); }
		public TerminalNode Greater() { return getToken(mygrammarParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(mygrammarParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(mygrammarParser.GreaterEqual, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		return relational_expression(0);
	}

	private Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_relational_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(337);
			shift_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(351);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(339);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(340);
						match(Less);
						setState(341);
						shift_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(342);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(343);
						match(Greater);
						setState(344);
						shift_expression(0);
						}
						break;
					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(345);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(346);
						match(LessEqual);
						setState(347);
						shift_expression(0);
						}
						break;
					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(348);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(349);
						match(GreaterEqual);
						setState(350);
						shift_expression(0);
						}
						break;
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(mygrammarParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(mygrammarParser.NotEqual, 0); }
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		return equality_expression(0);
	}

	private Equality_expressionContext equality_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, _parentState);
		Equality_expressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_equality_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(357);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(359);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(360);
						match(Equal);
						setState(361);
						relational_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(362);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(363);
						match(NotEqual);
						setState(364);
						relational_expression(0);
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public TerminalNode And() { return getToken(mygrammarParser.And, 0); }
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		return and_expression(0);
	}

	private And_expressionContext and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_expressionContext _localctx = new And_expressionContext(_ctx, _parentState);
		And_expressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(371);
			equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and_expression);
					setState(373);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(374);
					match(And);
					setState(375);
					equality_expression(0);
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exclusive_OR_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Exclusive_OR_expressionContext exclusive_OR_expression() {
			return getRuleContext(Exclusive_OR_expressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(mygrammarParser.Caret, 0); }
		public Exclusive_OR_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_OR_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterExclusive_OR_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitExclusive_OR_expression(this);
		}
	}

	public final Exclusive_OR_expressionContext exclusive_OR_expression() throws RecognitionException {
		return exclusive_OR_expression(0);
	}

	private Exclusive_OR_expressionContext exclusive_OR_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exclusive_OR_expressionContext _localctx = new Exclusive_OR_expressionContext(_ctx, _parentState);
		Exclusive_OR_expressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exclusive_OR_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(382);
			and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exclusive_OR_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusive_OR_expression);
					setState(384);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(385);
					match(Caret);
					setState(386);
					and_expression(0);
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Inclusive_OR_expressionContext extends ParserRuleContext {
		public Exclusive_OR_expressionContext exclusive_OR_expression() {
			return getRuleContext(Exclusive_OR_expressionContext.class,0);
		}
		public Inclusive_OR_expressionContext inclusive_OR_expression() {
			return getRuleContext(Inclusive_OR_expressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(mygrammarParser.Or, 0); }
		public Inclusive_OR_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_OR_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterInclusive_OR_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitInclusive_OR_expression(this);
		}
	}

	public final Inclusive_OR_expressionContext inclusive_OR_expression() throws RecognitionException {
		return inclusive_OR_expression(0);
	}

	private Inclusive_OR_expressionContext inclusive_OR_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inclusive_OR_expressionContext _localctx = new Inclusive_OR_expressionContext(_ctx, _parentState);
		Inclusive_OR_expressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_inclusive_OR_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(393);
			exclusive_OR_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Inclusive_OR_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusive_OR_expression);
					setState(395);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(396);
					match(Or);
					setState(397);
					exclusive_OR_expression(0);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_AND_expressionContext extends ParserRuleContext {
		public Inclusive_OR_expressionContext inclusive_OR_expression() {
			return getRuleContext(Inclusive_OR_expressionContext.class,0);
		}
		public Logical_AND_expressionContext logical_AND_expression() {
			return getRuleContext(Logical_AND_expressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(mygrammarParser.AndAnd, 0); }
		public Logical_AND_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_AND_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterLogical_AND_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitLogical_AND_expression(this);
		}
	}

	public final Logical_AND_expressionContext logical_AND_expression() throws RecognitionException {
		return logical_AND_expression(0);
	}

	private Logical_AND_expressionContext logical_AND_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_AND_expressionContext _localctx = new Logical_AND_expressionContext(_ctx, _parentState);
		Logical_AND_expressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_logical_AND_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			inclusive_OR_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_AND_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_AND_expression);
					setState(406);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(407);
					match(AndAnd);
					setState(408);
					inclusive_OR_expression(0);
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_OR_expressionContext extends ParserRuleContext {
		public Logical_AND_expressionContext logical_AND_expression() {
			return getRuleContext(Logical_AND_expressionContext.class,0);
		}
		public Logical_OR_expressionContext logical_OR_expression() {
			return getRuleContext(Logical_OR_expressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(mygrammarParser.OrOr, 0); }
		public Logical_OR_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_OR_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterLogical_OR_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitLogical_OR_expression(this);
		}
	}

	public final Logical_OR_expressionContext logical_OR_expression() throws RecognitionException {
		return logical_OR_expression(0);
	}

	private Logical_OR_expressionContext logical_OR_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_OR_expressionContext _localctx = new Logical_OR_expressionContext(_ctx, _parentState);
		Logical_OR_expressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logical_OR_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(415);
			logical_AND_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_OR_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_OR_expression);
					setState(417);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(418);
					match(OrOr);
					setState(419);
					logical_AND_expression(0);
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Logical_OR_expressionContext logical_OR_expression() {
			return getRuleContext(Logical_OR_expressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(mygrammarParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(mygrammarParser.Colon, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditional_expression);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				logical_OR_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				logical_OR_expression(0);
				setState(427);
				match(Question);
				setState(428);
				expression(0);
				setState(429);
				match(Colon);
				setState(430);
				conditional_expression();
				}
				break;
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment_expression);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				conditional_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				unary_expression();
				setState(436);
				assignment_operator();
				setState(437);
				assignment_expression();
				}
				break;
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(mygrammarParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(mygrammarParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(mygrammarParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(mygrammarParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(mygrammarParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(mygrammarParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(mygrammarParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(mygrammarParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(mygrammarParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(mygrammarParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(mygrammarParser.OrAssign, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Assign - 76)) | (1L << (StarAssign - 76)) | (1L << (DivAssign - 76)) | (1L << (ModAssign - 76)) | (1L << (PlusAssign - 76)) | (1L << (MinusAssign - 76)) | (1L << (LeftShiftAssign - 76)) | (1L << (RightShiftAssign - 76)) | (1L << (AndAssign - 76)) | (1L << (XorAssign - 76)) | (1L << (OrAssign - 76)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(444);
			assignment_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(446);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(447);
					match(Comma);
					setState(448);
					assignment_expression();
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			conditional_expression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Static_assert_declarationContext static_assert_declaration() {
			return getRuleContext(Static_assert_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declaration);
		int _la;
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case ThreadLocal:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				declaration_specifiers();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (LeftParen - 45)) | (1L << (Star - 45)) | (1L << (Identifier - 45)))) != 0)) {
					{
					setState(457);
					init_declarator_list(0);
					}
				}

				setState(460);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				static_assert_declaration();
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

	public static class Declaration_specifiersContext extends ParserRuleContext {
		public List<Declaration_specifierContext> declaration_specifier() {
			return getRuleContexts(Declaration_specifierContext.class);
		}
		public Declaration_specifierContext declaration_specifier(int i) {
			return getRuleContext(Declaration_specifierContext.class,i);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterDeclaration_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitDeclaration_specifiers(this);
		}
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaration_specifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(466); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(465);
					declaration_specifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(468); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Declaration_specifierContext extends ParserRuleContext {
		public Storage_class_specifierContext storage_class_specifier() {
			return getRuleContext(Storage_class_specifierContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Function_specifierContext function_specifier() {
			return getRuleContext(Function_specifierContext.class,0);
		}
		public Alignment_specifierContext alignment_specifier() {
			return getRuleContext(Alignment_specifierContext.class,0);
		}
		public Declaration_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterDeclaration_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitDeclaration_specifier(this);
		}
	}

	public final Declaration_specifierContext declaration_specifier() throws RecognitionException {
		Declaration_specifierContext _localctx = new Declaration_specifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declaration_specifier);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				storage_class_specifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				type_specifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				type_qualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				function_specifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
				alignment_specifier();
				}
				break;
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

	public static class Init_declarator_listContext extends ParserRuleContext {
		public Init_declaratorContext init_declarator() {
			return getRuleContext(Init_declaratorContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		return init_declarator_list(0);
	}

	private Init_declarator_listContext init_declarator_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, _parentState);
		Init_declarator_listContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_init_declarator_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(478);
			init_declarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Init_declarator_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_init_declarator_list);
					setState(480);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(481);
					match(Comma);
					setState(482);
					init_declarator();
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(mygrammarParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitInit_declarator(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_init_declarator);
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				declarator();
				setState(490);
				match(Assign);
				setState(491);
				initializer();
				}
				break;
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

	public static class Storage_class_specifierContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(mygrammarParser.Typedef, 0); }
		public TerminalNode Extern() { return getToken(mygrammarParser.Extern, 0); }
		public TerminalNode Static() { return getToken(mygrammarParser.Static, 0); }
		public TerminalNode ThreadLocal() { return getToken(mygrammarParser.ThreadLocal, 0); }
		public TerminalNode Auto() { return getToken(mygrammarParser.Auto, 0); }
		public TerminalNode Register() { return getToken(mygrammarParser.Register, 0); }
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterStorage_class_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitStorage_class_specifier(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0)) ) {
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

	public static class Type_specifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(mygrammarParser.Void, 0); }
		public TerminalNode Char() { return getToken(mygrammarParser.Char, 0); }
		public TerminalNode Short() { return getToken(mygrammarParser.Short, 0); }
		public TerminalNode Int() { return getToken(mygrammarParser.Int, 0); }
		public TerminalNode Long() { return getToken(mygrammarParser.Long, 0); }
		public TerminalNode Float() { return getToken(mygrammarParser.Float, 0); }
		public TerminalNode Double() { return getToken(mygrammarParser.Double, 0); }
		public TerminalNode Signed() { return getToken(mygrammarParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(mygrammarParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(mygrammarParser.Bool, 0); }
		public TerminalNode Complex() { return getToken(mygrammarParser.Complex, 0); }
		public Atomic_type_specifierContext atomic_type_specifier() {
			return getRuleContext(Atomic_type_specifierContext.class,0);
		}
		public Struct_or_union_specifierContext struct_or_union_specifier() {
			return getRuleContext(Struct_or_union_specifierContext.class,0);
		}
		public Enum_specifierContext enum_specifier() {
			return getRuleContext(Enum_specifierContext.class,0);
		}
		public Typedef_nameContext typedef_name() {
			return getRuleContext(Typedef_nameContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitType_specifier(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type_specifier);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(Void);
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(Char);
				}
				break;
			case Short:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				match(Short);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				match(Int);
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				match(Long);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 6);
				{
				setState(502);
				match(Float);
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 7);
				{
				setState(503);
				match(Double);
				}
				break;
			case Signed:
				enterOuterAlt(_localctx, 8);
				{
				setState(504);
				match(Signed);
				}
				break;
			case Unsigned:
				enterOuterAlt(_localctx, 9);
				{
				setState(505);
				match(Unsigned);
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 10);
				{
				setState(506);
				match(Bool);
				}
				break;
			case Complex:
				enterOuterAlt(_localctx, 11);
				{
				setState(507);
				match(Complex);
				}
				break;
			case Atomic:
				enterOuterAlt(_localctx, 12);
				{
				setState(508);
				atomic_type_specifier();
				}
				break;
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 13);
				{
				setState(509);
				struct_or_union_specifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 14);
				{
				setState(510);
				enum_specifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 15);
				{
				setState(511);
				typedef_name();
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

	public static class Struct_or_union_specifierContext extends ParserRuleContext {
		public Struct_or_unionContext struct_or_union() {
			return getRuleContext(Struct_or_unionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(mygrammarParser.LeftBrace, 0); }
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(mygrammarParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public Struct_or_union_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_or_union_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterStruct_or_union_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitStruct_or_union_specifier(this);
		}
	}

	public final Struct_or_union_specifierContext struct_or_union_specifier() throws RecognitionException {
		Struct_or_union_specifierContext _localctx = new Struct_or_union_specifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_struct_or_union_specifier);
		int _la;
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				struct_or_union();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(515);
					match(Identifier);
					}
				}

				setState(518);
				match(LeftBrace);
				setState(519);
				struct_declaration_list(0);
				setState(520);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				struct_or_union();
				setState(523);
				match(Identifier);
				}
				break;
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

	public static class Struct_or_unionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(mygrammarParser.Struct, 0); }
		public TerminalNode Union() { return getToken(mygrammarParser.Union, 0); }
		public Struct_or_unionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_or_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterStruct_or_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitStruct_or_union(this);
		}
	}

	public final Struct_or_unionContext struct_or_union() throws RecognitionException {
		Struct_or_unionContext _localctx = new Struct_or_unionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_struct_or_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
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

	public static class Struct_declaration_listContext extends ParserRuleContext {
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public Struct_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterStruct_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitStruct_declaration_list(this);
		}
	}

	public final Struct_declaration_listContext struct_declaration_list() throws RecognitionException {
		return struct_declaration_list(0);
	}

	private Struct_declaration_listContext struct_declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Struct_declaration_listContext _localctx = new Struct_declaration_listContext(_ctx, _parentState);
		Struct_declaration_listContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_struct_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(530);
			struct_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Struct_declaration_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_struct_declaration_list);
					setState(532);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(533);
					struct_declaration();
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public Static_assert_declarationContext static_assert_declaration() {
			return getRuleContext(Static_assert_declarationContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitStruct_declaration(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_struct_declaration);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Star:
			case Colon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				specifier_qualifier_list();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (LeftParen - 45)) | (1L << (Star - 45)) | (1L << (Colon - 45)) | (1L << (Identifier - 45)))) != 0)) {
					{
					setState(540);
					struct_declarator_list();
					}
				}

				setState(543);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				static_assert_declaration();
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

	public static class Specifier_qualifier_listContext extends ParserRuleContext {
		public Struct_declaratorContext struct_declarator() {
			return getRuleContext(Struct_declaratorContext.class,0);
		}
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Specifier_qualifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier_qualifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterSpecifier_qualifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitSpecifier_qualifier_list(this);
		}
	}

	public final Specifier_qualifier_listContext specifier_qualifier_list() throws RecognitionException {
		Specifier_qualifier_listContext _localctx = new Specifier_qualifier_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_specifier_qualifier_list);
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				struct_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				struct_declarator_list();
				setState(550);
				match(Comma);
				setState(551);
				struct_declarator();
				}
				break;
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

	public static class Struct_declarator_listContext extends ParserRuleContext {
		public List<Struct_declaratorContext> struct_declarator() {
			return getRuleContexts(Struct_declaratorContext.class);
		}
		public Struct_declaratorContext struct_declarator(int i) {
			return getRuleContext(Struct_declaratorContext.class,i);
		}
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterStruct_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitStruct_declarator_list(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_struct_declarator_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			struct_declarator();
			setState(556);
			struct_declarator_list();
			setState(557);
			match(Comma);
			setState(558);
			struct_declarator();
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

	public static class Struct_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(mygrammarParser.Colon, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterStruct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitStruct_declarator(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_struct_declarator);
		int _la;
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (LeftParen - 45)) | (1L << (Star - 45)) | (1L << (Identifier - 45)))) != 0)) {
					{
					setState(561);
					declarator();
					}
				}

				setState(564);
				match(Colon);
				setState(565);
				constant_expression();
				}
				break;
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

	public static class Enum_specifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(mygrammarParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(mygrammarParser.LeftBrace, 0); }
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(mygrammarParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Enum_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterEnum_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitEnum_specifier(this);
		}
	}

	public final Enum_specifierContext enum_specifier() throws RecognitionException {
		Enum_specifierContext _localctx = new Enum_specifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_enum_specifier);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(Enum);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(569);
					match(Identifier);
					}
				}

				setState(572);
				match(LeftBrace);
				setState(573);
				enumerator_list(0);
				setState(574);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(Enum);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(577);
					match(Identifier);
					}
				}

				setState(580);
				match(LeftBrace);
				setState(581);
				enumerator_list(0);
				setState(582);
				match(Comma);
				setState(583);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				match(Enum);
				setState(586);
				match(Identifier);
				}
				break;
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

	public static class Enumerator_listContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterEnumerator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitEnumerator_list(this);
		}
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		return enumerator_list(0);
	}

	private Enumerator_listContext enumerator_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, _parentState);
		Enumerator_listContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_enumerator_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(590);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Enumerator_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumerator_list);
					setState(592);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(593);
					match(Comma);
					setState(594);
					enumerator();
					}
					} 
				}
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public Enumerator_constantContext enumerator_constant() {
			return getRuleContext(Enumerator_constantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(mygrammarParser.Assign, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_enumerator);
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				enumerator_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				enumerator_constant();
				setState(602);
				match(Assign);
				setState(603);
				constant_expression();
				}
				break;
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

	public static class Enumerator_constantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public Enumerator_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterEnumerator_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitEnumerator_constant(this);
		}
	}

	public final Enumerator_constantContext enumerator_constant() throws RecognitionException {
		Enumerator_constantContext _localctx = new Enumerator_constantContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enumerator_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(Identifier);
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

	public static class Atomic_type_specifierContext extends ParserRuleContext {
		public TerminalNode Atomic() { return getToken(mygrammarParser.Atomic, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public Atomic_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterAtomic_type_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitAtomic_type_specifier(this);
		}
	}

	public final Atomic_type_specifierContext atomic_type_specifier() throws RecognitionException {
		Atomic_type_specifierContext _localctx = new Atomic_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_atomic_type_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(Atomic);
			setState(610);
			match(LeftParen);
			setState(611);
			type_name();
			setState(612);
			match(RightParen);
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

	public static class Type_qualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(mygrammarParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(mygrammarParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(mygrammarParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(mygrammarParser.Atomic, 0); }
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitType_qualifier(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
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

	public static class Function_specifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(mygrammarParser.Inline, 0); }
		public TerminalNode Noreturn() { return getToken(mygrammarParser.Noreturn, 0); }
		public Function_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterFunction_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitFunction_specifier(this);
		}
	}

	public final Function_specifierContext function_specifier() throws RecognitionException {
		Function_specifierContext _localctx = new Function_specifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_function_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_la = _input.LA(1);
			if ( !(_la==Inline || _la==Noreturn) ) {
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

	public static class Alignment_specifierContext extends ParserRuleContext {
		public List<TerminalNode> Alignas() { return getTokens(mygrammarParser.Alignas); }
		public TerminalNode Alignas(int i) {
			return getToken(mygrammarParser.Alignas, i);
		}
		public List<TerminalNode> LeftParen() { return getTokens(mygrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(mygrammarParser.LeftParen, i);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(mygrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(mygrammarParser.RightParen, i);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Alignment_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignment_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterAlignment_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitAlignment_specifier(this);
		}
	}

	public final Alignment_specifierContext alignment_specifier() throws RecognitionException {
		Alignment_specifierContext _localctx = new Alignment_specifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_alignment_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(Alignas);
			setState(619);
			match(LeftParen);
			setState(620);
			type_name();
			setState(621);
			match(RightParen);
			setState(622);
			match(Alignas);
			setState(623);
			match(LeftParen);
			setState(624);
			constant_expression();
			setState(625);
			match(RightParen);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(627);
				pointer();
				}
			}

			setState(630);
			direct_declarator(0);
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

	public static class Direct_declaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(mygrammarParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(mygrammarParser.RightBracket, 0); }
		public Type_qualifier_listContext type_qualifier_list() {
			return getRuleContext(Type_qualifier_listContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(mygrammarParser.Static, 0); }
		public TerminalNode Star() { return getToken(mygrammarParser.Star, 0); }
		public Parameter_type_listContext parameter_type_list() {
			return getRuleContext(Parameter_type_listContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Direct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterDirect_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitDirect_declarator(this);
		}
	}

	public final Direct_declaratorContext direct_declarator() throws RecognitionException {
		return direct_declarator(0);
	}

	private Direct_declaratorContext direct_declarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Direct_declaratorContext _localctx = new Direct_declaratorContext(_ctx, _parentState);
		Direct_declaratorContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_direct_declarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(633);
				match(Identifier);
				}
				break;
			case LeftParen:
				{
				setState(634);
				match(LeftParen);
				setState(635);
				declarator();
				setState(636);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(687);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new Direct_declaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_direct_declarator);
						setState(640);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(641);
						match(LeftBracket);
						setState(643);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(642);
							type_qualifier_list(0);
							}
						}

						setState(646);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
							{
							setState(645);
							assignment_expression();
							}
						}

						setState(648);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new Direct_declaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_direct_declarator);
						setState(649);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(650);
						match(LeftBracket);
						setState(651);
						match(Static);
						setState(653);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(652);
							type_qualifier_list(0);
							}
						}

						setState(656);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
							{
							setState(655);
							assignment_expression();
							}
						}

						setState(658);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new Direct_declaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_direct_declarator);
						setState(659);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(660);
						match(LeftBracket);
						setState(662);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(661);
							type_qualifier_list(0);
							}
						}

						setState(664);
						match(Static);
						setState(666);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
							{
							setState(665);
							assignment_expression();
							}
						}

						setState(668);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new Direct_declaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_direct_declarator);
						setState(669);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(670);
						match(LeftBracket);
						setState(672);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(671);
							type_qualifier_list(0);
							}
						}

						setState(674);
						match(Star);
						setState(675);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new Direct_declaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_direct_declarator);
						setState(676);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(677);
						match(LeftParen);
						setState(678);
						parameter_type_list();
						setState(679);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new Direct_declaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_direct_declarator);
						setState(681);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(682);
						match(LeftParen);
						setState(684);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(683);
							identifier_list(0);
							}
						}

						setState(686);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(mygrammarParser.Star, 0); }
		public Type_qualifier_listContext type_qualifier_list() {
			return getRuleContext(Type_qualifier_listContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pointer);
		int _la;
		try {
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				match(Star);
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(693);
					type_qualifier_list(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				match(Star);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(697);
					type_qualifier_list(0);
					}
				}

				setState(700);
				pointer();
				}
				break;
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

	public static class Type_qualifier_listContext extends ParserRuleContext {
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Type_qualifier_listContext type_qualifier_list() {
			return getRuleContext(Type_qualifier_listContext.class,0);
		}
		public Type_qualifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterType_qualifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitType_qualifier_list(this);
		}
	}

	public final Type_qualifier_listContext type_qualifier_list() throws RecognitionException {
		return type_qualifier_list(0);
	}

	private Type_qualifier_listContext type_qualifier_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_qualifier_listContext _localctx = new Type_qualifier_listContext(_ctx, _parentState);
		Type_qualifier_listContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_type_qualifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(704);
			type_qualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_qualifier_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_qualifier_list);
					setState(706);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(707);
					type_qualifier();
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Parameter_type_listContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(mygrammarParser.Ellipsis, 0); }
		public Parameter_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterParameter_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitParameter_type_list(this);
		}
	}

	public final Parameter_type_listContext parameter_type_list() throws RecognitionException {
		Parameter_type_listContext _localctx = new Parameter_type_listContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameter_type_list);
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				parameter_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				parameter_list(0);
				setState(715);
				match(Comma);
				setState(716);
				match(Ellipsis);
				}
				break;
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

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		return parameter_list(0);
	}

	private Parameter_listContext parameter_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, _parentState);
		Parameter_listContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_parameter_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(721);
			parameter_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(728);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Parameter_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameter_list);
					setState(723);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(724);
					match(Comma);
					setState(725);
					parameter_declaration();
					}
					} 
				}
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitParameter_declaration(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parameter_declaration);
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				declaration_specifiers();
				setState(732);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				declaration_specifiers();
				setState(736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(735);
					abstract_declarator();
					}
					break;
				}
				}
				break;
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

	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		return identifier_list(0);
	}

	private Identifier_listContext identifier_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, _parentState);
		Identifier_listContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_identifier_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(741);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Identifier_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifier_list);
					setState(743);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(744);
					match(Comma);
					setState(745);
					match(Identifier);
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			specifier_qualifier_list();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(752);
				abstract_declarator();
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

	public static class Abstract_declaratorContext extends ParserRuleContext {
		public List<PointerContext> pointer() {
			return getRuleContexts(PointerContext.class);
		}
		public PointerContext pointer(int i) {
			return getRuleContext(PointerContext.class,i);
		}
		public Direct_abstract_declaratorContext direct_abstract_declarator() {
			return getRuleContext(Direct_abstract_declaratorContext.class,0);
		}
		public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterAbstract_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitAbstract_declarator(this);
		}
	}

	public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
		Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_abstract_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			pointer();
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(756);
				pointer();
				}
			}

			setState(759);
			direct_abstract_declarator();
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

	public static class Direct_abstract_declaratorContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(mygrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(mygrammarParser.LeftParen, i);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(mygrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(mygrammarParser.RightParen, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(mygrammarParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(mygrammarParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(mygrammarParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(mygrammarParser.RightBracket, i);
		}
		public List<TerminalNode> Static() { return getTokens(mygrammarParser.Static); }
		public TerminalNode Static(int i) {
			return getToken(mygrammarParser.Static, i);
		}
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public List<Type_qualifier_listContext> type_qualifier_list() {
			return getRuleContexts(Type_qualifier_listContext.class);
		}
		public Type_qualifier_listContext type_qualifier_list(int i) {
			return getRuleContext(Type_qualifier_listContext.class,i);
		}
		public TerminalNode Star() { return getToken(mygrammarParser.Star, 0); }
		public List<Direct_abstract_declaratorContext> direct_abstract_declarator() {
			return getRuleContexts(Direct_abstract_declaratorContext.class);
		}
		public Direct_abstract_declaratorContext direct_abstract_declarator(int i) {
			return getRuleContext(Direct_abstract_declaratorContext.class,i);
		}
		public Parameter_type_listContext parameter_type_list() {
			return getRuleContext(Parameter_type_listContext.class,0);
		}
		public Direct_abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_abstract_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterDirect_abstract_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitDirect_abstract_declarator(this);
		}
	}

	public final Direct_abstract_declaratorContext direct_abstract_declarator() throws RecognitionException {
		Direct_abstract_declaratorContext _localctx = new Direct_abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_direct_abstract_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(LeftParen);
			setState(762);
			abstract_declarator();
			setState(763);
			match(RightParen);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(764);
				direct_abstract_declarator();
				}
			}

			setState(767);
			match(LeftBracket);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
				{
				setState(768);
				type_qualifier_list(0);
				}
			}

			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
				{
				setState(771);
				assignment_expression();
				}
			}

			setState(774);
			match(RightBracket);
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(775);
				direct_abstract_declarator();
				}
			}

			setState(778);
			match(LeftBracket);
			setState(779);
			match(Static);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
				{
				setState(780);
				type_qualifier_list(0);
				}
			}

			setState(783);
			assignment_expression();
			setState(784);
			match(RightBracket);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(785);
				direct_abstract_declarator();
				}
			}

			setState(788);
			match(LeftBracket);
			setState(789);
			type_qualifier_list(0);
			setState(790);
			match(Static);
			setState(791);
			assignment_expression();
			setState(792);
			match(RightBracket);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(793);
				direct_abstract_declarator();
				}
			}

			setState(796);
			match(LeftBracket);
			setState(797);
			match(Star);
			setState(798);
			match(RightBracket);
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(799);
				direct_abstract_declarator();
				}
				break;
			}
			setState(802);
			match(LeftParen);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(803);
				parameter_type_list();
				}
			}

			setState(806);
			match(RightParen);
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

	public static class Typedef_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public Typedef_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterTypedef_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitTypedef_name(this);
		}
	}

	public final Typedef_nameContext typedef_name() throws RecognitionException {
		Typedef_nameContext _localctx = new Typedef_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typedef_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(Identifier);
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

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(mygrammarParser.LeftBrace, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(mygrammarParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_initializer);
		try {
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				assignment_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				match(LeftBrace);
				setState(812);
				initializer_list(0);
				setState(813);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				match(LeftBrace);
				setState(816);
				initializer_list(0);
				setState(817);
				match(Comma);
				setState(818);
				match(RightBrace);
				}
				break;
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

	public static class Initializer_listContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		return initializer_list(0);
	}

	private Initializer_listContext initializer_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, _parentState);
		Initializer_listContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_initializer_list, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(823);
				designation();
				}
			}

			setState(826);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Initializer_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializer_list);
					setState(828);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(829);
					match(Comma);
					setState(831);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket) {
						{
						setState(830);
						designation();
						}
					}

					setState(833);
					initializer();
					}
					} 
				}
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public Designator_listContext designator_list() {
			return getRuleContext(Designator_listContext.class,0);
		}
		public TerminalNode Assign() { return getToken(mygrammarParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitDesignation(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			designator_list();
			setState(840);
			match(Assign);
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

	public static class Designator_listContext extends ParserRuleContext {
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public Designator_listContext designator_list() {
			return getRuleContext(Designator_listContext.class,0);
		}
		public Designator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterDesignator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitDesignator_list(this);
		}
	}

	public final Designator_listContext designator_list() throws RecognitionException {
		Designator_listContext _localctx = new Designator_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_designator_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			designator();
			setState(843);
			designator_list();
			setState(844);
			designator();
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

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(mygrammarParser.LeftBracket, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(mygrammarParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(mygrammarParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_designator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(LeftBracket);
			setState(847);
			constant_expression();
			setState(848);
			match(RightBracket);
			setState(849);
			match(Dot);
			setState(850);
			match(Identifier);
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

	public static class Static_assert_declarationContext extends ParserRuleContext {
		public TerminalNode StaticAssert() { return getToken(mygrammarParser.StaticAssert, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mygrammarParser.Comma, 0); }
		public TerminalNode String_Literal() { return getToken(mygrammarParser.String_Literal, 0); }
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public Static_assert_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assert_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterStatic_assert_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitStatic_assert_declaration(this);
		}
	}

	public final Static_assert_declarationContext static_assert_declaration() throws RecognitionException {
		Static_assert_declarationContext _localctx = new Static_assert_declarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_static_assert_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(StaticAssert);
			setState(853);
			match(LeftParen);
			setState(854);
			constant_expression();
			setState(855);
			match(Comma);
			setState(856);
			match(String_Literal);
			setState(857);
			match(RightParen);
			setState(858);
			match(Semi);
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

	public static class StatementContext extends ParserRuleContext {
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_statement);
		try {
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				labeled_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				compound_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(862);
				expression_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
				selection_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(864);
				iteration_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(865);
				jump_statement();
				}
				break;
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

	public static class Labeled_statementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(mygrammarParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Default() { return getToken(mygrammarParser.Default, 0); }
		public TerminalNode Case() { return getToken(mygrammarParser.Case, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitLabeled_statement(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_labeled_statement);
		try {
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(Identifier);
				setState(869);
				match(Colon);
				setState(870);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				match(Default);
				setState(872);
				match(Colon);
				setState(873);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 3);
				{
				setState(874);
				match(Case);
				setState(875);
				constant_expression();
				setState(876);
				match(Colon);
				setState(877);
				statement();
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

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(mygrammarParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(mygrammarParser.RightBrace, 0); }
		public Block_item_listContext block_item_list() {
			return getRuleContext(Block_item_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(LeftBrace);
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
				{
				setState(882);
				block_item_list(0);
				}
			}

			setState(885);
			match(RightBrace);
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

	public static class Block_item_listContext extends ParserRuleContext {
		public Block_itemContext block_item() {
			return getRuleContext(Block_itemContext.class,0);
		}
		public Block_item_listContext block_item_list() {
			return getRuleContext(Block_item_listContext.class,0);
		}
		public Block_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterBlock_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitBlock_item_list(this);
		}
	}

	public final Block_item_listContext block_item_list() throws RecognitionException {
		return block_item_list(0);
	}

	private Block_item_listContext block_item_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Block_item_listContext _localctx = new Block_item_listContext(_ctx, _parentState);
		Block_item_listContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_block_item_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(888);
			block_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Block_item_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_block_item_list);
					setState(890);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(891);
					block_item();
					}
					} 
				}
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Block_itemContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitBlock_item(this);
		}
	}

	public final Block_itemContext block_item() throws RecognitionException {
		Block_itemContext _localctx = new Block_itemContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_block_item);
		try {
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				statement();
				}
				break;
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

	public static class Expression_statementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_expression_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
				{
				setState(901);
				expression(0);
				}
			}

			setState(904);
			match(Semi);
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

	public static class Selection_statementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(mygrammarParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(mygrammarParser.Else, 0); }
		public TerminalNode Switch() { return getToken(mygrammarParser.Switch, 0); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_selection_statement);
		try {
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(If);
				setState(907);
				match(LeftParen);
				setState(908);
				expression(0);
				setState(909);
				match(RightParen);
				setState(910);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(If);
				setState(913);
				match(LeftParen);
				setState(914);
				expression(0);
				setState(915);
				match(RightParen);
				setState(916);
				statement();
				setState(917);
				match(Else);
				setState(918);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(920);
				match(Switch);
				setState(921);
				match(LeftParen);
				setState(922);
				expression(0);
				setState(923);
				match(RightParen);
				setState(924);
				statement();
				}
				break;
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(mygrammarParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(mygrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(mygrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(mygrammarParser.Do, 0); }
		public TerminalNode RightParen2() { return getToken(mygrammarParser.RightParen2, 0); }
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public TerminalNode For() { return getToken(mygrammarParser.For, 0); }
		public For_conditionContext for_condition() {
			return getRuleContext(For_conditionContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_iteration_statement);
		try {
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				match(While);
				setState(929);
				match(LeftParen);
				setState(930);
				expression(0);
				setState(931);
				match(RightParen);
				setState(932);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				match(Do);
				setState(935);
				statement();
				setState(936);
				match(While);
				setState(937);
				match(LeftParen);
				setState(938);
				expression(0);
				setState(939);
				match(RightParen2);
				setState(940);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(942);
				match(For);
				setState(943);
				match(LeftParen);
				setState(944);
				for_condition();
				setState(945);
				match(RightParen);
				setState(946);
				statement();
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

	public static class For_conditionContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(mygrammarParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(mygrammarParser.Semi, i);
		}
		public For_declarationContext for_declaration() {
			return getRuleContext(For_declarationContext.class,0);
		}
		public List<For_expressionContext> for_expression() {
			return getRuleContexts(For_expressionContext.class);
		}
		public For_expressionContext for_expression(int i) {
			return getRuleContext(For_expressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterFor_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitFor_condition(this);
		}
	}

	public final For_conditionContext for_condition() throws RecognitionException {
		For_conditionContext _localctx = new For_conditionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_for_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(950);
				for_declaration();
				}
				break;
			case 2:
				{
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
					{
					setState(951);
					expression(0);
					}
				}

				}
				break;
			}
			setState(956);
			match(Semi);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
				{
				setState(957);
				for_expression();
				}
			}

			setState(960);
			match(Semi);
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
				{
				setState(961);
				for_expression();
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

	public static class For_declarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public For_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterFor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitFor_declaration(this);
		}
	}

	public final For_declarationContext for_declaration() throws RecognitionException {
		For_declarationContext _localctx = new For_declarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_for_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			declaration_specifiers();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (LeftParen - 45)) | (1L << (Star - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(965);
				init_declarator_list(0);
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

	public static class For_expressionContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(mygrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mygrammarParser.Comma, i);
		}
		public For_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterFor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitFor_expression(this);
		}
	}

	public final For_expressionContext for_expression() throws RecognitionException {
		For_expressionContext _localctx = new For_expressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_for_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			assignment_expression();
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(969);
				match(Comma);
				setState(970);
				assignment_expression();
				}
				}
				setState(975);
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

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(mygrammarParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(mygrammarParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public TerminalNode Continue() { return getToken(mygrammarParser.Continue, 0); }
		public TerminalNode Break() { return getToken(mygrammarParser.Break, 0); }
		public TerminalNode Return() { return getToken(mygrammarParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_jump_statement);
		int _la;
		try {
			setState(988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Goto:
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				match(Goto);
				setState(977);
				match(Identifier);
				setState(978);
				match(Semi);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				match(Continue);
				setState(980);
				match(Semi);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 3);
				{
				setState(981);
				match(Break);
				setState(982);
				match(Semi);
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 4);
				{
				setState(983);
				match(Return);
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (And - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (String_Literal - 65)))) != 0)) {
					{
					setState(984);
					expression(0);
					}
				}

				setState(987);
				match(Semi);
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

	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mygrammarParser.EOF, 0); }
		public Translation_unitContext translation_unit() {
			return getRuleContext(Translation_unitContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitCompilation_unit(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << Star))) != 0) || _la==Semi || _la==Identifier) {
				{
				setState(990);
				translation_unit(0);
				}
			}

			setState(993);
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

	public static class Translation_unitContext extends ParserRuleContext {
		public External_declarationContext external_declaration() {
			return getRuleContext(External_declarationContext.class,0);
		}
		public Translation_unitContext translation_unit() {
			return getRuleContext(Translation_unitContext.class,0);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitTranslation_unit(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		return translation_unit(0);
	}

	private Translation_unitContext translation_unit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, _parentState);
		Translation_unitContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_translation_unit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(996);
			external_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Translation_unitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translation_unit);
					setState(998);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(999);
					external_declaration();
					}
					} 
				}
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class External_declarationContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(mygrammarParser.Semi, 0); }
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterExternal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitExternal_declaration(this);
		}
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_external_declaration);
		try {
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				match(Semi);
				}
				break;
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

	public static class Function_definitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1010);
				declaration_specifiers();
				}
				break;
			}
			setState(1013);
			declarator();
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1014);
				declaration_list(0);
				}
			}

			setState(1017);
			compound_statement();
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

	public static class Declaration_listContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).enterDeclaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener ) ((mygrammarListener)listener).exitDeclaration_list(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		return declaration_list(0);
	}

	private Declaration_listContext declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, _parentState);
		Declaration_listContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1020);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1026);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Declaration_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declaration_list);
					setState(1022);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1023);
					declaration();
					}
					} 
				}
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return generic_assoc_list_sempred((Generic_assoc_listContext)_localctx, predIndex);
		case 4:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 5:
			return argument_expression_list_sempred((Argument_expression_listContext)_localctx, predIndex);
		case 9:
			return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);
		case 10:
			return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);
		case 11:
			return shift_expression_sempred((Shift_expressionContext)_localctx, predIndex);
		case 12:
			return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);
		case 13:
			return equality_expression_sempred((Equality_expressionContext)_localctx, predIndex);
		case 14:
			return and_expression_sempred((And_expressionContext)_localctx, predIndex);
		case 15:
			return exclusive_OR_expression_sempred((Exclusive_OR_expressionContext)_localctx, predIndex);
		case 16:
			return inclusive_OR_expression_sempred((Inclusive_OR_expressionContext)_localctx, predIndex);
		case 17:
			return logical_AND_expression_sempred((Logical_AND_expressionContext)_localctx, predIndex);
		case 18:
			return logical_OR_expression_sempred((Logical_OR_expressionContext)_localctx, predIndex);
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 27:
			return init_declarator_list_sempred((Init_declarator_listContext)_localctx, predIndex);
		case 33:
			return struct_declaration_list_sempred((Struct_declaration_listContext)_localctx, predIndex);
		case 39:
			return enumerator_list_sempred((Enumerator_listContext)_localctx, predIndex);
		case 47:
			return direct_declarator_sempred((Direct_declaratorContext)_localctx, predIndex);
		case 49:
			return type_qualifier_list_sempred((Type_qualifier_listContext)_localctx, predIndex);
		case 51:
			return parameter_list_sempred((Parameter_listContext)_localctx, predIndex);
		case 53:
			return identifier_list_sempred((Identifier_listContext)_localctx, predIndex);
		case 59:
			return initializer_list_sempred((Initializer_listContext)_localctx, predIndex);
		case 67:
			return block_item_list_sempred((Block_item_listContext)_localctx, predIndex);
		case 77:
			return translation_unit_sempred((Translation_unitContext)_localctx, predIndex);
		case 80:
			return declaration_list_sempred((Declaration_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean generic_assoc_list_sempred(Generic_assoc_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean argument_expression_list_sempred(Argument_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shift_expression_sempred(Shift_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_expression_sempred(Equality_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean and_expression_sempred(And_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusive_OR_expression_sempred(Exclusive_OR_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusive_OR_expression_sempred(Inclusive_OR_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_AND_expression_sempred(Logical_AND_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_OR_expression_sempred(Logical_OR_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean init_declarator_list_sempred(Init_declarator_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean struct_declaration_list_sempred(Struct_declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumerator_list_sempred(Enumerator_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean direct_declarator_sempred(Direct_declaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 6);
		case 31:
			return precpred(_ctx, 5);
		case 32:
			return precpred(_ctx, 4);
		case 33:
			return precpred(_ctx, 3);
		case 34:
			return precpred(_ctx, 2);
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_qualifier_list_sempred(Type_qualifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameter_list_sempred(Parameter_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifier_list_sempred(Identifier_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializer_list_sempred(Initializer_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean block_item_list_sempred(Block_item_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translation_unit_sempred(Translation_unitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declaration_list_sempred(Declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3f\u0408\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\6\2\u00a8\n\2\r\2\16\2\u00a9\3\2\3\2\3\2\3\2\3\2\5\2\u00b1\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00c0\n\4\f\4\16\4"+
		"\u00c3\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00cc\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00df\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e9\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u00f6\n\6\f\6\16\6\u00f9\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u0101\n\7\f\7\16\7\u0104\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u011a\n\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0124\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u0132\n\13\f\13\16\13\u0135\13\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0140\n\f\f\f\16\f\u0143\13\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u014e\n\r\f\r\16\r\u0151\13\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u0162\n\16\f\16\16\16\u0165\13\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u0170\n\17\f\17\16\17\u0173\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\7\20\u017b\n\20\f\20\16\20\u017e\13\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u0186\n\21\f\21\16\21\u0189\13\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\7\22\u0191\n\22\f\22\16\22\u0194\13\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\7\23\u019c\n\23\f\23\16\23\u019f\13\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u01a7\n\24\f\24\16\24\u01aa\13\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u01b3\n\25\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u01ba\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01c4\n\30\f"+
		"\30\16\30\u01c7\13\30\3\31\3\31\3\32\3\32\5\32\u01cd\n\32\3\32\3\32\3"+
		"\32\5\32\u01d2\n\32\3\33\6\33\u01d5\n\33\r\33\16\33\u01d6\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u01de\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01e6"+
		"\n\35\f\35\16\35\u01e9\13\35\3\36\3\36\3\36\3\36\3\36\5\36\u01f0\n\36"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0203\n \3"+
		"!\3!\5!\u0207\n!\3!\3!\3!\3!\3!\3!\3!\5!\u0210\n!\3\"\3\"\3#\3#\3#\3#"+
		"\3#\7#\u0219\n#\f#\16#\u021c\13#\3$\3$\5$\u0220\n$\3$\3$\3$\5$\u0225\n"+
		"$\3%\3%\3%\3%\3%\5%\u022c\n%\3&\3&\3&\3&\3&\3\'\3\'\5\'\u0235\n\'\3\'"+
		"\3\'\5\'\u0239\n\'\3(\3(\5(\u023d\n(\3(\3(\3(\3(\3(\3(\5(\u0245\n(\3("+
		"\3(\3(\3(\3(\3(\3(\5(\u024e\n(\3)\3)\3)\3)\3)\3)\7)\u0256\n)\f)\16)\u0259"+
		"\13)\3*\3*\3*\3*\3*\5*\u0260\n*\3+\3+\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3\60\5\60\u0277\n\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\5\61\u0281\n\61\3\61\3\61\3\61\5\61\u0286\n\61\3\61\5\61"+
		"\u0289\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u0290\n\61\3\61\5\61\u0293\n"+
		"\61\3\61\3\61\3\61\3\61\5\61\u0299\n\61\3\61\3\61\5\61\u029d\n\61\3\61"+
		"\3\61\3\61\3\61\5\61\u02a3\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u02af\n\61\3\61\7\61\u02b2\n\61\f\61\16\61\u02b5\13\61"+
		"\3\62\3\62\5\62\u02b9\n\62\3\62\3\62\5\62\u02bd\n\62\3\62\5\62\u02c0\n"+
		"\62\3\63\3\63\3\63\3\63\3\63\7\63\u02c7\n\63\f\63\16\63\u02ca\13\63\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u02d1\n\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\7\65\u02d9\n\65\f\65\16\65\u02dc\13\65\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u02e3\n\66\5\66\u02e5\n\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u02ed\n"+
		"\67\f\67\16\67\u02f0\13\67\38\38\58\u02f4\n8\39\39\59\u02f8\n9\39\39\3"+
		":\3:\3:\3:\5:\u0300\n:\3:\3:\5:\u0304\n:\3:\5:\u0307\n:\3:\3:\5:\u030b"+
		"\n:\3:\3:\3:\5:\u0310\n:\3:\3:\3:\5:\u0315\n:\3:\3:\3:\3:\3:\3:\5:\u031d"+
		"\n:\3:\3:\3:\3:\5:\u0323\n:\3:\3:\5:\u0327\n:\3:\3:\3;\3;\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\5<\u0337\n<\3=\3=\5=\u033b\n=\3=\3=\3=\3=\3=\5=\u0342"+
		"\n=\3=\7=\u0345\n=\f=\16=\u0348\13=\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3"+
		"@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\5B\u0365\nB\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\5C\u0372\nC\3D\3D\5D\u0376\nD\3D\3D\3E\3E\3E\3"+
		"E\3E\7E\u037f\nE\fE\16E\u0382\13E\3F\3F\5F\u0386\nF\3G\5G\u0389\nG\3G"+
		"\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u03a1"+
		"\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03b7"+
		"\nI\3J\3J\5J\u03bb\nJ\5J\u03bd\nJ\3J\3J\5J\u03c1\nJ\3J\3J\5J\u03c5\nJ"+
		"\3K\3K\5K\u03c9\nK\3L\3L\3L\7L\u03ce\nL\fL\16L\u03d1\13L\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\5M\u03dc\nM\3M\5M\u03df\nM\3N\5N\u03e2\nN\3N\3N\3O\3O\3"+
		"O\3O\3O\7O\u03eb\nO\fO\16O\u03ee\13O\3P\3P\3P\5P\u03f3\nP\3Q\5Q\u03f6"+
		"\nQ\3Q\3Q\5Q\u03fa\nQ\3Q\3Q\3R\3R\3R\3R\3R\7R\u0403\nR\fR\16R\u0406\13"+
		"R\3R\2\33\6\n\f\24\26\30\32\34\36 \"$&.8DP`dhlx\u0088\u009c\u00a2S\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\2\b\7\2<"+
		"<>>@@CCHI\3\2NX\b\2\3\3\16\16\26\26\34\34\37\37..\4\2\35\35  \6\2\7\7"+
		"\27\27##\'\'\4\2\23\23,,\2\u0451\2\u00b0\3\2\2\2\4\u00b2\3\2\2\2\6\u00b9"+
		"\3\2\2\2\b\u00cb\3\2\2\2\n\u00de\3\2\2\2\f\u00fa\3\2\2\2\16\u0119\3\2"+
		"\2\2\20\u011b\3\2\2\2\22\u0123\3\2\2\2\24\u0125\3\2\2\2\26\u0136\3\2\2"+
		"\2\30\u0144\3\2\2\2\32\u0152\3\2\2\2\34\u0166\3\2\2\2\36\u0174\3\2\2\2"+
		" \u017f\3\2\2\2\"\u018a\3\2\2\2$\u0195\3\2\2\2&\u01a0\3\2\2\2(\u01b2\3"+
		"\2\2\2*\u01b9\3\2\2\2,\u01bb\3\2\2\2.\u01bd\3\2\2\2\60\u01c8\3\2\2\2\62"+
		"\u01d1\3\2\2\2\64\u01d4\3\2\2\2\66\u01dd\3\2\2\28\u01df\3\2\2\2:\u01ef"+
		"\3\2\2\2<\u01f1\3\2\2\2>\u0202\3\2\2\2@\u020f\3\2\2\2B\u0211\3\2\2\2D"+
		"\u0213\3\2\2\2F\u0224\3\2\2\2H\u022b\3\2\2\2J\u022d\3\2\2\2L\u0238\3\2"+
		"\2\2N\u024d\3\2\2\2P\u024f\3\2\2\2R\u025f\3\2\2\2T\u0261\3\2\2\2V\u0263"+
		"\3\2\2\2X\u0268\3\2\2\2Z\u026a\3\2\2\2\\\u026c\3\2\2\2^\u0276\3\2\2\2"+
		"`\u0280\3\2\2\2b\u02bf\3\2\2\2d\u02c1\3\2\2\2f\u02d0\3\2\2\2h\u02d2\3"+
		"\2\2\2j\u02e4\3\2\2\2l\u02e6\3\2\2\2n\u02f1\3\2\2\2p\u02f5\3\2\2\2r\u02fb"+
		"\3\2\2\2t\u032a\3\2\2\2v\u0336\3\2\2\2x\u0338\3\2\2\2z\u0349\3\2\2\2|"+
		"\u034c\3\2\2\2~\u0350\3\2\2\2\u0080\u0356\3\2\2\2\u0082\u0364\3\2\2\2"+
		"\u0084\u0371\3\2\2\2\u0086\u0373\3\2\2\2\u0088\u0379\3\2\2\2\u008a\u0385"+
		"\3\2\2\2\u008c\u0388\3\2\2\2\u008e\u03a0\3\2\2\2\u0090\u03b6\3\2\2\2\u0092"+
		"\u03bc\3\2\2\2\u0094\u03c6\3\2\2\2\u0096\u03ca\3\2\2\2\u0098\u03de\3\2"+
		"\2\2\u009a\u03e1\3\2\2\2\u009c\u03e5\3\2\2\2\u009e\u03f2\3\2\2\2\u00a0"+
		"\u03f5\3\2\2\2\u00a2\u03fd\3\2\2\2\u00a4\u00b1\7^\2\2\u00a5\u00b1\7_\2"+
		"\2\u00a6\u00a8\7`\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac"+
		"\u00ad\5.\30\2\u00ad\u00ae\7\60\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b1\5"+
		"\4\3\2\u00b0\u00a4\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b0"+
		"\u00ab\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\3\3\2\2\2\u00b2\u00b3\7*\2\2"+
		"\u00b3\u00b4\7/\2\2\u00b4\u00b5\5*\26\2\u00b5\u00b6\7M\2\2\u00b6\u00b7"+
		"\5\6\4\2\u00b7\u00b8\7\60\2\2\u00b8\5\3\2\2\2\u00b9\u00ba\b\4\1\2\u00ba"+
		"\u00bb\5\b\5\2\u00bb\u00c1\3\2\2\2\u00bc\u00bd\f\3\2\2\u00bd\u00be\7M"+
		"\2\2\u00be\u00c0\5\b\5\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\7\3\2\2\2\u00c3\u00c1\3\2\2\2"+
		"\u00c4\u00c5\5n8\2\u00c5\u00c6\7K\2\2\u00c6\u00c7\5*\26\2\u00c7\u00cc"+
		"\3\2\2\2\u00c8\u00c9\7\t\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cc\5*\26\2\u00cb"+
		"\u00c4\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\t\3\2\2\2\u00cd\u00ce\b\6\1\2"+
		"\u00ce\u00df\5\2\2\2\u00cf\u00d0\7/\2\2\u00d0\u00d1\5n8\2\u00d1\u00d2"+
		"\7\60\2\2\u00d2\u00d3\7\64\2\2\u00d3\u00d4\5x=\2\u00d4\u00d5\7\65\2\2"+
		"\u00d5\u00df\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7\u00d8\5n8\2\u00d8\u00d9"+
		"\7\60\2\2\u00d9\u00da\7\64\2\2\u00da\u00db\5x=\2\u00db\u00dc\7M\2\2\u00dc"+
		"\u00dd\7\65\2\2\u00dd\u00df\3\2\2\2\u00de\u00cd\3\2\2\2\u00de\u00cf\3"+
		"\2\2\2\u00de\u00d6\3\2\2\2\u00df\u00f7\3\2\2\2\u00e0\u00e1\f\n\2\2\u00e1"+
		"\u00e2\7\62\2\2\u00e2\u00e3\5.\30\2\u00e3\u00e4\7\63\2\2\u00e4\u00f6\3"+
		"\2\2\2\u00e5\u00e6\f\t\2\2\u00e6\u00e8\7/\2\2\u00e7\u00e9\5\f\7\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f6\7\60"+
		"\2\2\u00eb\u00ec\f\b\2\2\u00ec\u00ed\7\\\2\2\u00ed\u00f6\7^\2\2\u00ee"+
		"\u00ef\f\7\2\2\u00ef\u00f0\7[\2\2\u00f0\u00f6\7^\2\2\u00f1\u00f2\f\6\2"+
		"\2\u00f2\u00f6\7=\2\2\u00f3\u00f4\f\5\2\2\u00f4\u00f6\7?\2\2\u00f5\u00e0"+
		"\3\2\2\2\u00f5\u00e5\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\13\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb"+
		"\b\7\1\2\u00fb\u00fc\5*\26\2\u00fc\u0102\3\2\2\2\u00fd\u00fe\f\3\2\2\u00fe"+
		"\u00ff\7M\2\2\u00ff\u0101\5*\26\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\r\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0105\u011a\5\n\6\2\u0106\u0107\7=\2\2\u0107\u011a\5\16\b\2\u0108"+
		"\u0109\7?\2\2\u0109\u011a\5\16\b\2\u010a\u010b\5\20\t\2\u010b\u010c\5"+
		"\22\n\2\u010c\u011a\3\2\2\2\u010d\u010e\7\33\2\2\u010e\u011a\5\16\b\2"+
		"\u010f\u0110\7\33\2\2\u0110\u0111\7/\2\2\u0111\u0112\5n8\2\u0112\u0113"+
		"\7\60\2\2\u0113\u011a\3\2\2\2\u0114\u0115\7&\2\2\u0115\u0116\7/\2\2\u0116"+
		"\u0117\5n8\2\u0117\u0118\7\60\2\2\u0118\u011a\3\2\2\2\u0119\u0105\3\2"+
		"\2\2\u0119\u0106\3\2\2\2\u0119\u0108\3\2\2\2\u0119\u010a\3\2\2\2\u0119"+
		"\u010d\3\2\2\2\u0119\u010f\3\2\2\2\u0119\u0114\3\2\2\2\u011a\17\3\2\2"+
		"\2\u011b\u011c\t\2\2\2\u011c\21\3\2\2\2\u011d\u0124\5\16\b\2\u011e\u011f"+
		"\7/\2\2\u011f\u0120\5n8\2\u0120\u0121\7\60\2\2\u0121\u0122\5\22\n\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u011e\3\2\2\2\u0124\23\3\2\2"+
		"\2\u0125\u0126\b\13\1\2\u0126\u0127\5\22\n\2\u0127\u0133\3\2\2\2\u0128"+
		"\u0129\f\5\2\2\u0129\u012a\7@\2\2\u012a\u0132\5\22\n\2\u012b\u012c\f\4"+
		"\2\2\u012c\u012d\7A\2\2\u012d\u0132\5\22\n\2\u012e\u012f\f\3\2\2\u012f"+
		"\u0130\7B\2\2\u0130\u0132\5\22\n\2\u0131\u0128\3\2\2\2\u0131\u012b\3\2"+
		"\2\2\u0131\u012e\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\25\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\b\f\1"+
		"\2\u0137\u0138\5\24\13\2\u0138\u0141\3\2\2\2\u0139\u013a\f\4\2\2\u013a"+
		"\u013b\7<\2\2\u013b\u0140\5\24\13\2\u013c\u013d\f\3\2\2\u013d\u013e\7"+
		">\2\2\u013e\u0140\5\24\13\2\u013f\u0139\3\2\2\2\u013f\u013c\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\27\3\2\2"+
		"\2\u0143\u0141\3\2\2\2\u0144\u0145\b\r\1\2\u0145\u0146\5\26\f\2\u0146"+
		"\u014f\3\2\2\2\u0147\u0148\f\4\2\2\u0148\u0149\7:\2\2\u0149\u014e\5\26"+
		"\f\2\u014a\u014b\f\3\2\2\u014b\u014c\7;\2\2\u014c\u014e\5\26\f\2\u014d"+
		"\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\31\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153"+
		"\b\16\1\2\u0153\u0154\5\30\r\2\u0154\u0163\3\2\2\2\u0155\u0156\f\6\2\2"+
		"\u0156\u0157\7\66\2\2\u0157\u0162\5\30\r\2\u0158\u0159\f\5\2\2\u0159\u015a"+
		"\78\2\2\u015a\u0162\5\30\r\2\u015b\u015c\f\4\2\2\u015c\u015d\7\67\2\2"+
		"\u015d\u0162\5\30\r\2\u015e\u015f\f\3\2\2\u015f\u0160\79\2\2\u0160\u0162"+
		"\5\30\r\2\u0161\u0155\3\2\2\2\u0161\u0158\3\2\2\2\u0161\u015b\3\2\2\2"+
		"\u0161\u015e\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\33\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\b\17\1\2\u0167"+
		"\u0168\5\32\16\2\u0168\u0171\3\2\2\2\u0169\u016a\f\4\2\2\u016a\u016b\7"+
		"Y\2\2\u016b\u0170\5\32\16\2\u016c\u016d\f\3\2\2\u016d\u016e\7Z\2\2\u016e"+
		"\u0170\5\32\16\2\u016f\u0169\3\2\2\2\u016f\u016c\3\2\2\2\u0170\u0173\3"+
		"\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\35\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0175\b\20\1\2\u0175\u0176\5\34\17\2\u0176\u017c"+
		"\3\2\2\2\u0177\u0178\f\3\2\2\u0178\u0179\7C\2\2\u0179\u017b\5\34\17\2"+
		"\u017a\u0177\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\37\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\b\21\1\2\u0180"+
		"\u0181\5\36\20\2\u0181\u0187\3\2\2\2\u0182\u0183\f\3\2\2\u0183\u0184\7"+
		"G\2\2\u0184\u0186\5\36\20\2\u0185\u0182\3\2\2\2\u0186\u0189\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188!\3\2\2\2\u0189\u0187\3\2\2\2"+
		"\u018a\u018b\b\22\1\2\u018b\u018c\5 \21\2\u018c\u0192\3\2\2\2\u018d\u018e"+
		"\f\3\2\2\u018e\u018f\7D\2\2\u018f\u0191\5 \21\2\u0190\u018d\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193#\3\2\2\2"+
		"\u0194\u0192\3\2\2\2\u0195\u0196\b\23\1\2\u0196\u0197\5\"\22\2\u0197\u019d"+
		"\3\2\2\2\u0198\u0199\f\3\2\2\u0199\u019a\7E\2\2\u019a\u019c\5\"\22\2\u019b"+
		"\u0198\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e%\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\b\24\1\2\u01a1\u01a2"+
		"\5$\23\2\u01a2\u01a8\3\2\2\2\u01a3\u01a4\f\3\2\2\u01a4\u01a5\7F\2\2\u01a5"+
		"\u01a7\5$\23\2\u01a6\u01a3\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\'\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01b3"+
		"\5&\24\2\u01ac\u01ad\5&\24\2\u01ad\u01ae\7J\2\2\u01ae\u01af\5.\30\2\u01af"+
		"\u01b0\7K\2\2\u01b0\u01b1\5(\25\2\u01b1\u01b3\3\2\2\2\u01b2\u01ab\3\2"+
		"\2\2\u01b2\u01ac\3\2\2\2\u01b3)\3\2\2\2\u01b4\u01ba\5(\25\2\u01b5\u01b6"+
		"\5\16\b\2\u01b6\u01b7\5,\27\2\u01b7\u01b8\5*\26\2\u01b8\u01ba\3\2\2\2"+
		"\u01b9\u01b4\3\2\2\2\u01b9\u01b5\3\2\2\2\u01ba+\3\2\2\2\u01bb\u01bc\t"+
		"\3\2\2\u01bc-\3\2\2\2\u01bd\u01be\b\30\1\2\u01be\u01bf\5*\26\2\u01bf\u01c5"+
		"\3\2\2\2\u01c0\u01c1\f\3\2\2\u01c1\u01c2\7M\2\2\u01c2\u01c4\5*\26\2\u01c3"+
		"\u01c0\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6/\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\5(\25\2\u01c9\61\3"+
		"\2\2\2\u01ca\u01cc\5\64\33\2\u01cb\u01cd\58\35\2\u01cc\u01cb\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\7L\2\2\u01cf\u01d2\3\2"+
		"\2\2\u01d0\u01d2\5\u0080A\2\u01d1\u01ca\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2"+
		"\63\3\2\2\2\u01d3\u01d5\5\66\34\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\65\3\2\2\2\u01d8\u01de"+
		"\5<\37\2\u01d9\u01de\5> \2\u01da\u01de\5X-\2\u01db\u01de\5Z.\2\u01dc\u01de"+
		"\5\\/\2\u01dd\u01d8\3\2\2\2\u01dd\u01d9\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de\67\3\2\2\2\u01df\u01e0\b\35\1"+
		"\2\u01e0\u01e1\5:\36\2\u01e1\u01e7\3\2\2\2\u01e2\u01e3\f\3\2\2\u01e3\u01e4"+
		"\7M\2\2\u01e4\u01e6\5:\36\2\u01e5\u01e2\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e89\3\2\2\2\u01e9\u01e7\3\2\2\2"+
		"\u01ea\u01f0\5^\60\2\u01eb\u01ec\5^\60\2\u01ec\u01ed\7N\2\2\u01ed\u01ee"+
		"\5v<\2\u01ee\u01f0\3\2\2\2\u01ef\u01ea\3\2\2\2\u01ef\u01eb\3\2\2\2\u01f0"+
		";\3\2\2\2\u01f1\u01f2\t\4\2\2\u01f2=\3\2\2\2\u01f3\u0203\7\"\2\2\u01f4"+
		"\u0203\7\6\2\2\u01f5\u0203\7\31\2\2\u01f6\u0203\7\24\2\2\u01f7\u0203\7"+
		"\25\2\2\u01f8\u0203\7\17\2\2\u01f9\u0203\7\13\2\2\u01fa\u0203\7\32\2\2"+
		"\u01fb\u0203\7!\2\2\u01fc\u0203\7(\2\2\u01fd\u0203\7)\2\2\u01fe\u0203"+
		"\5V,\2\u01ff\u0203\5@!\2\u0200\u0203\5N(\2\u0201\u0203\5t;\2\u0202\u01f3"+
		"\3\2\2\2\u0202\u01f4\3\2\2\2\u0202\u01f5\3\2\2\2\u0202\u01f6\3\2\2\2\u0202"+
		"\u01f7\3\2\2\2\u0202\u01f8\3\2\2\2\u0202\u01f9\3\2\2\2\u0202\u01fa\3\2"+
		"\2\2\u0202\u01fb\3\2\2\2\u0202\u01fc\3\2\2\2\u0202\u01fd\3\2\2\2\u0202"+
		"\u01fe\3\2\2\2\u0202\u01ff\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2"+
		"\2\2\u0203?\3\2\2\2\u0204\u0206\5B\"\2\u0205\u0207\7^\2\2\u0206\u0205"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7\64\2\2"+
		"\u0209\u020a\5D#\2\u020a\u020b\7\65\2\2\u020b\u0210\3\2\2\2\u020c\u020d"+
		"\5B\"\2\u020d\u020e\7^\2\2\u020e\u0210\3\2\2\2\u020f\u0204\3\2\2\2\u020f"+
		"\u020c\3\2\2\2\u0210A\3\2\2\2\u0211\u0212\t\5\2\2\u0212C\3\2\2\2\u0213"+
		"\u0214\b#\1\2\u0214\u0215\5F$\2\u0215\u021a\3\2\2\2\u0216\u0217\f\3\2"+
		"\2\u0217\u0219\5F$\2\u0218\u0216\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021bE\3\2\2\2\u021c\u021a\3\2\2\2\u021d"+
		"\u021f\5H%\2\u021e\u0220\5J&\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2"+
		"\u0220\u0221\3\2\2\2\u0221\u0222\7L\2\2\u0222\u0225\3\2\2\2\u0223\u0225"+
		"\5\u0080A\2\u0224\u021d\3\2\2\2\u0224\u0223\3\2\2\2\u0225G\3\2\2\2\u0226"+
		"\u022c\5L\'\2\u0227\u0228\5J&\2\u0228\u0229\7M\2\2\u0229\u022a\5L\'\2"+
		"\u022a\u022c\3\2\2\2\u022b\u0226\3\2\2\2\u022b\u0227\3\2\2\2\u022cI\3"+
		"\2\2\2\u022d\u022e\5L\'\2\u022e\u022f\5J&\2\u022f\u0230\7M\2\2\u0230\u0231"+
		"\5L\'\2\u0231K\3\2\2\2\u0232\u0239\5^\60\2\u0233\u0235\5^\60\2\u0234\u0233"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\7K\2\2\u0237"+
		"\u0239\5\60\31\2\u0238\u0232\3\2\2\2\u0238\u0234\3\2\2\2\u0239M\3\2\2"+
		"\2\u023a\u023c\7\r\2\2\u023b\u023d\7^\2\2\u023c\u023b\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\7\64\2\2\u023f\u0240\5P)\2\u0240"+
		"\u0241\7\65\2\2\u0241\u024e\3\2\2\2\u0242\u0244\7\r\2\2\u0243\u0245\7"+
		"^\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0247\7\64\2\2\u0247\u0248\5P)\2\u0248\u0249\7M\2\2\u0249\u024a\7\65"+
		"\2\2\u024a\u024e\3\2\2\2\u024b\u024c\7\r\2\2\u024c\u024e\7^\2\2\u024d"+
		"\u023a\3\2\2\2\u024d\u0242\3\2\2\2\u024d\u024b\3\2\2\2\u024eO\3\2\2\2"+
		"\u024f\u0250\b)\1\2\u0250\u0251\5R*\2\u0251\u0257\3\2\2\2\u0252\u0253"+
		"\f\3\2\2\u0253\u0254\7M\2\2\u0254\u0256\5R*\2\u0255\u0252\3\2\2\2\u0256"+
		"\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258Q\3\2\2\2"+
		"\u0259\u0257\3\2\2\2\u025a\u0260\5T+\2\u025b\u025c\5T+\2\u025c\u025d\7"+
		"N\2\2\u025d\u025e\5\60\31\2\u025e\u0260\3\2\2\2\u025f\u025a\3\2\2\2\u025f"+
		"\u025b\3\2\2\2\u0260S\3\2\2\2\u0261\u0262\7^\2\2\u0262U\3\2\2\2\u0263"+
		"\u0264\7\'\2\2\u0264\u0265\7/\2\2\u0265\u0266\5n8\2\u0266\u0267\7\60\2"+
		"\2\u0267W\3\2\2\2\u0268\u0269\t\6\2\2\u0269Y\3\2\2\2\u026a\u026b\t\7\2"+
		"\2\u026b[\3\2\2\2\u026c\u026d\7%\2\2\u026d\u026e\7/\2\2\u026e\u026f\5"+
		"n8\2\u026f\u0270\7\60\2\2\u0270\u0271\7%\2\2\u0271\u0272\7/\2\2\u0272"+
		"\u0273\5\60\31\2\u0273\u0274\7\60\2\2\u0274]\3\2\2\2\u0275\u0277\5b\62"+
		"\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279"+
		"\5`\61\2\u0279_\3\2\2\2\u027a\u027b\b\61\1\2\u027b\u0281\7^\2\2\u027c"+
		"\u027d\7/\2\2\u027d\u027e\5^\60\2\u027e\u027f\7\60\2\2\u027f\u0281\3\2"+
		"\2\2\u0280\u027a\3\2\2\2\u0280\u027c\3\2\2\2\u0281\u02b3\3\2\2\2\u0282"+
		"\u0283\f\b\2\2\u0283\u0285\7\62\2\2\u0284\u0286\5d\63\2\u0285\u0284\3"+
		"\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287\u0289\5*\26\2\u0288"+
		"\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u02b2\7\63"+
		"\2\2\u028b\u028c\f\7\2\2\u028c\u028d\7\62\2\2\u028d\u028f\7\34\2\2\u028e"+
		"\u0290\5d\63\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2"+
		"\2\2\u0291\u0293\5*\26\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u02b2\7\63\2\2\u0295\u0296\f\6\2\2\u0296\u0298\7"+
		"\62\2\2\u0297\u0299\5d\63\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029c\7\34\2\2\u029b\u029d\5*\26\2\u029c\u029b\3"+
		"\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02b2\7\63\2\2\u029f"+
		"\u02a0\f\5\2\2\u02a0\u02a2\7\62\2\2\u02a1\u02a3\5d\63\2\u02a2\u02a1\3"+
		"\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\7@\2\2\u02a5"+
		"\u02b2\7\63\2\2\u02a6\u02a7\f\4\2\2\u02a7\u02a8\7/\2\2\u02a8\u02a9\5f"+
		"\64\2\u02a9\u02aa\7\60\2\2\u02aa\u02b2\3\2\2\2\u02ab\u02ac\f\3\2\2\u02ac"+
		"\u02ae\7/\2\2\u02ad\u02af\5l\67\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\7\60\2\2\u02b1\u0282\3\2\2\2\u02b1"+
		"\u028b\3\2\2\2\u02b1\u0295\3\2\2\2\u02b1\u029f\3\2\2\2\u02b1\u02a6\3\2"+
		"\2\2\u02b1\u02ab\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4a\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b8\7@\2\2\u02b7"+
		"\u02b9\5d\63\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02c0\3\2"+
		"\2\2\u02ba\u02bc\7@\2\2\u02bb\u02bd\5d\63\2\u02bc\u02bb\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\5b\62\2\u02bf\u02b6\3\2"+
		"\2\2\u02bf\u02ba\3\2\2\2\u02c0c\3\2\2\2\u02c1\u02c2\b\63\1\2\u02c2\u02c3"+
		"\5X-\2\u02c3\u02c8\3\2\2\2\u02c4\u02c5\f\3\2\2\u02c5\u02c7\5X-\2\u02c6"+
		"\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2"+
		"\2\2\u02c9e\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02d1\5h\65\2\u02cc\u02cd"+
		"\5h\65\2\u02cd\u02ce\7M\2\2\u02ce\u02cf\7]\2\2\u02cf\u02d1\3\2\2\2\u02d0"+
		"\u02cb\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d1g\3\2\2\2\u02d2\u02d3\b\65\1\2"+
		"\u02d3\u02d4\5j\66\2\u02d4\u02da\3\2\2\2\u02d5\u02d6\f\3\2\2\u02d6\u02d7"+
		"\7M\2\2\u02d7\u02d9\5j\66\2\u02d8\u02d5\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da"+
		"\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02dbi\3\2\2\2\u02dc\u02da\3\2\2\2"+
		"\u02dd\u02de\5\64\33\2\u02de\u02df\5^\60\2\u02df\u02e5\3\2\2\2\u02e0\u02e2"+
		"\5\64\33\2\u02e1\u02e3\5p9\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e5\3\2\2\2\u02e4\u02dd\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e5k\3\2\2\2"+
		"\u02e6\u02e7\b\67\1\2\u02e7\u02e8\7^\2\2\u02e8\u02ee\3\2\2\2\u02e9\u02ea"+
		"\f\3\2\2\u02ea\u02eb\7M\2\2\u02eb\u02ed\7^\2\2\u02ec\u02e9\3\2\2\2\u02ed"+
		"\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02efm\3\2\2\2"+
		"\u02f0\u02ee\3\2\2\2\u02f1\u02f3\5H%\2\u02f2\u02f4\5p9\2\u02f3\u02f2\3"+
		"\2\2\2\u02f3\u02f4\3\2\2\2\u02f4o\3\2\2\2\u02f5\u02f7\5b\62\2\u02f6\u02f8"+
		"\5b\62\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02fa\5r:\2\u02faq\3\2\2\2\u02fb\u02fc\7/\2\2\u02fc\u02fd\5p9\2\u02fd"+
		"\u02ff\7\60\2\2\u02fe\u0300\5r:\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300\u0301\3\2\2\2\u0301\u0303\7\62\2\2\u0302\u0304\5d\63\2\u0303"+
		"\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0307\5*"+
		"\26\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u030a\7\63\2\2\u0309\u030b\5r:\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2"+
		"\2\2\u030b\u030c\3\2\2\2\u030c\u030d\7\62\2\2\u030d\u030f\7\34\2\2\u030e"+
		"\u0310\5d\63\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\3\2"+
		"\2\2\u0311\u0312\5*\26\2\u0312\u0314\7\63\2\2\u0313\u0315\5r:\2\u0314"+
		"\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\7\62"+
		"\2\2\u0317\u0318\5d\63\2\u0318\u0319\7\34\2\2\u0319\u031a\5*\26\2\u031a"+
		"\u031c\7\63\2\2\u031b\u031d\5r:\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031d\u031e\3\2\2\2\u031e\u031f\7\62\2\2\u031f\u0320\7@\2\2\u0320"+
		"\u0322\7\63\2\2\u0321\u0323\5r:\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2"+
		"\2\2\u0323\u0324\3\2\2\2\u0324\u0326\7/\2\2\u0325\u0327\5f\64\2\u0326"+
		"\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\7\60"+
		"\2\2\u0329s\3\2\2\2\u032a\u032b\7^\2\2\u032bu\3\2\2\2\u032c\u0337\5*\26"+
		"\2\u032d\u032e\7\64\2\2\u032e\u032f\5x=\2\u032f\u0330\7\65\2\2\u0330\u0337"+
		"\3\2\2\2\u0331\u0332\7\64\2\2\u0332\u0333\5x=\2\u0333\u0334\7M\2\2\u0334"+
		"\u0335\7\65\2\2\u0335\u0337\3\2\2\2\u0336\u032c\3\2\2\2\u0336\u032d\3"+
		"\2\2\2\u0336\u0331\3\2\2\2\u0337w\3\2\2\2\u0338\u033a\b=\1\2\u0339\u033b"+
		"\5z>\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u033d\5v<\2\u033d\u0346\3\2\2\2\u033e\u033f\f\3\2\2\u033f\u0341\7M\2"+
		"\2\u0340\u0342\5z>\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343"+
		"\3\2\2\2\u0343\u0345\5v<\2\u0344\u033e\3\2\2\2\u0345\u0348\3\2\2\2\u0346"+
		"\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347y\3\2\2\2\u0348\u0346\3\2\2\2"+
		"\u0349\u034a\5|?\2\u034a\u034b\7N\2\2\u034b{\3\2\2\2\u034c\u034d\5~@\2"+
		"\u034d\u034e\5|?\2\u034e\u034f\5~@\2\u034f}\3\2\2\2\u0350\u0351\7\62\2"+
		"\2\u0351\u0352\5\60\31\2\u0352\u0353\7\63\2\2\u0353\u0354\7\\\2\2\u0354"+
		"\u0355\7^\2\2\u0355\177\3\2\2\2\u0356\u0357\7-\2\2\u0357\u0358\7/\2\2"+
		"\u0358\u0359\5\60\31\2\u0359\u035a\7M\2\2\u035a\u035b\7`\2\2\u035b\u035c"+
		"\7\60\2\2\u035c\u035d\7L\2\2\u035d\u0081\3\2\2\2\u035e\u0365\5\u0084C"+
		"\2\u035f\u0365\5\u0086D\2\u0360\u0365\5\u008cG\2\u0361\u0365\5\u008eH"+
		"\2\u0362\u0365\5\u0090I\2\u0363\u0365\5\u0098M\2\u0364\u035e\3\2\2\2\u0364"+
		"\u035f\3\2\2\2\u0364\u0360\3\2\2\2\u0364\u0361\3\2\2\2\u0364\u0362\3\2"+
		"\2\2\u0364\u0363\3\2\2\2\u0365\u0083\3\2\2\2\u0366\u0367\7^\2\2\u0367"+
		"\u0368\7K\2\2\u0368\u0372\5\u0082B\2\u0369\u036a\7\t\2\2\u036a\u036b\7"+
		"K\2\2\u036b\u0372\5\u0082B\2\u036c\u036d\7\5\2\2\u036d\u036e\5\60\31\2"+
		"\u036e\u036f\7K\2\2\u036f\u0370\5\u0082B\2\u0370\u0372\3\2\2\2\u0371\u0366"+
		"\3\2\2\2\u0371\u0369\3\2\2\2\u0371\u036c\3\2\2\2\u0372\u0085\3\2\2\2\u0373"+
		"\u0375\7\64\2\2\u0374\u0376\5\u0088E\2\u0375\u0374\3\2\2\2\u0375\u0376"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\7\65\2\2\u0378\u0087\3\2\2\2"+
		"\u0379\u037a\bE\1\2\u037a\u037b\5\u008aF\2\u037b\u0380\3\2\2\2\u037c\u037d"+
		"\f\3\2\2\u037d\u037f\5\u008aF\2\u037e\u037c\3\2\2\2\u037f\u0382\3\2\2"+
		"\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0089\3\2\2\2\u0382\u0380"+
		"\3\2\2\2\u0383\u0386\5\62\32\2\u0384\u0386\5\u0082B\2\u0385\u0383\3\2"+
		"\2\2\u0385\u0384\3\2\2\2\u0386\u008b\3\2\2\2\u0387\u0389\5.\30\2\u0388"+
		"\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\7L"+
		"\2\2\u038b\u008d\3\2\2\2\u038c\u038d\7\22\2\2\u038d\u038e\7/\2\2\u038e"+
		"\u038f\5.\30\2\u038f\u0390\7\60\2\2\u0390\u0391\5\u0082B\2\u0391\u03a1"+
		"\3\2\2\2\u0392\u0393\7\22\2\2\u0393\u0394\7/\2\2\u0394\u0395\5.\30\2\u0395"+
		"\u0396\7\60\2\2\u0396\u0397\5\u0082B\2\u0397\u0398\7\f\2\2\u0398\u0399"+
		"\5\u0082B\2\u0399\u03a1\3\2\2\2\u039a\u039b\7\36\2\2\u039b\u039c\7/\2"+
		"\2\u039c\u039d\5.\30\2\u039d\u039e\7\60\2\2\u039e\u039f\5\u0082B\2\u039f"+
		"\u03a1\3\2\2\2\u03a0\u038c\3\2\2\2\u03a0\u0392\3\2\2\2\u03a0\u039a\3\2"+
		"\2\2\u03a1\u008f\3\2\2\2\u03a2\u03a3\7$\2\2\u03a3\u03a4\7/\2\2\u03a4\u03a5"+
		"\5.\30\2\u03a5\u03a6\7\60\2\2\u03a6\u03a7\5\u0082B\2\u03a7\u03b7\3\2\2"+
		"\2\u03a8\u03a9\7\n\2\2\u03a9\u03aa\5\u0082B\2\u03aa\u03ab\7$\2\2\u03ab"+
		"\u03ac\7/\2\2\u03ac\u03ad\5.\30\2\u03ad\u03ae\7\61\2\2\u03ae\u03af\7L"+
		"\2\2\u03af\u03b7\3\2\2\2\u03b0\u03b1\7\20\2\2\u03b1\u03b2\7/\2\2\u03b2"+
		"\u03b3\5\u0092J\2\u03b3\u03b4\7\60\2\2\u03b4\u03b5\5\u0082B\2\u03b5\u03b7"+
		"\3\2\2\2\u03b6\u03a2\3\2\2\2\u03b6\u03a8\3\2\2\2\u03b6\u03b0\3\2\2\2\u03b7"+
		"\u0091\3\2\2\2\u03b8\u03bd\5\u0094K\2\u03b9\u03bb\5.\30\2\u03ba\u03b9"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03b8\3\2\2\2\u03bc"+
		"\u03ba\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\7L\2\2\u03bf\u03c1\5\u0096"+
		"L\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2"+
		"\u03c4\7L\2\2\u03c3\u03c5\5\u0096L\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3"+
		"\2\2\2\u03c5\u0093\3\2\2\2\u03c6\u03c8\5\64\33\2\u03c7\u03c9\58\35\2\u03c8"+
		"\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u0095\3\2\2\2\u03ca\u03cf\5*"+
		"\26\2\u03cb\u03cc\7M\2\2\u03cc\u03ce\5*\26\2\u03cd\u03cb\3\2\2\2\u03ce"+
		"\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u0097\3\2"+
		"\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d3\7\21\2\2\u03d3\u03d4\7^\2\2\u03d4"+
		"\u03df\7L\2\2\u03d5\u03d6\7\b\2\2\u03d6\u03df\7L\2\2\u03d7\u03d8\7\4\2"+
		"\2\u03d8\u03df\7L\2\2\u03d9\u03db\7\30\2\2\u03da\u03dc\5.\30\2\u03db\u03da"+
		"\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\7L\2\2\u03de"+
		"\u03d2\3\2\2\2\u03de\u03d5\3\2\2\2\u03de\u03d7\3\2\2\2\u03de\u03d9\3\2"+
		"\2\2\u03df\u0099\3\2\2\2\u03e0\u03e2\5\u009cO\2\u03e1\u03e0\3\2\2\2\u03e1"+
		"\u03e2\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\7\2\2\3\u03e4\u009b\3\2"+
		"\2\2\u03e5\u03e6\bO\1\2\u03e6\u03e7\5\u009eP\2\u03e7\u03ec\3\2\2\2\u03e8"+
		"\u03e9\f\3\2\2\u03e9\u03eb\5\u009eP\2\u03ea\u03e8\3\2\2\2\u03eb\u03ee"+
		"\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u009d\3\2\2\2\u03ee"+
		"\u03ec\3\2\2\2\u03ef\u03f3\5\u00a0Q\2\u03f0\u03f3\5\62\32\2\u03f1\u03f3"+
		"\7L\2\2\u03f2\u03ef\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f1\3\2\2\2\u03f3"+
		"\u009f\3\2\2\2\u03f4\u03f6\5\64\33\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3"+
		"\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\5^\60\2\u03f8\u03fa\5\u00a2R\2"+
		"\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc"+
		"\5\u0086D\2\u03fc\u00a1\3\2\2\2\u03fd\u03fe\bR\1\2\u03fe\u03ff\5\62\32"+
		"\2\u03ff\u0404\3\2\2\2\u0400\u0401\f\3\2\2\u0401\u0403\5\62\32\2\u0402"+
		"\u0400\3\2\2\2\u0403\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2"+
		"\2\2\u0405\u00a3\3\2\2\2\u0406\u0404\3\2\2\2m\u00a9\u00b0\u00c1\u00cb"+
		"\u00de\u00e8\u00f5\u00f7\u0102\u0119\u0123\u0131\u0133\u013f\u0141\u014d"+
		"\u014f\u0161\u0163\u016f\u0171\u017c\u0187\u0192\u019d\u01a8\u01b2\u01b9"+
		"\u01c5\u01cc\u01d1\u01d6\u01dd\u01e7\u01ef\u0202\u0206\u020f\u021a\u021f"+
		"\u0224\u022b\u0234\u0238\u023c\u0244\u024d\u0257\u025f\u0276\u0280\u0285"+
		"\u0288\u028f\u0292\u0298\u029c\u02a2\u02ae\u02b1\u02b3\u02b8\u02bc\u02bf"+
		"\u02c8\u02d0\u02da\u02e2\u02e4\u02ee\u02f3\u02f7\u02ff\u0303\u0306\u030a"+
		"\u030f\u0314\u031c\u0322\u0326\u0336\u033a\u0341\u0346\u0364\u0371\u0375"+
		"\u0380\u0385\u0388\u03a0\u03b6\u03ba\u03bc\u03c0\u03c4\u03c8\u03cf\u03db"+
		"\u03de\u03e1\u03ec\u03f2\u03f5\u03f9\u0404";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}