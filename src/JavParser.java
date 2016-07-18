// Generated from Jav.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ID=23, Digit=24, ADD=25, 
		SUB=26, MUL=27, DIV=28, MOD=29, COMMA=30, EQ2=31, EQ=32, NOT_EQ=33, LT=34, 
		GT=35, LT_EQ=36, GT_EQ=37, WS=38;
	public static final int
		RULE_arith_op = 0, RULE_bool_value = 1, RULE_int_value = 2, RULE_rel_op = 3, 
		RULE_value = 4, RULE_type = 5, RULE_declr = 6, RULE_var = 7, RULE_var_1 = 8, 
		RULE_var_2 = 9, RULE_back = 10, RULE_assign = 11, RULE_parameter = 12, 
		RULE_arith_expr = 13, RULE_gen_expr = 14, RULE_param = 15, RULE_open_sq = 16, 
		RULE_close_sq = 17, RULE_double_colon = 18, RULE_stack_declr = 19, RULE_stack_push = 20, 
		RULE_stack_pop = 21, RULE_display = 22, RULE_loop = 23, RULE_open_brace = 24, 
		RULE_close_brace = 25, RULE_body = 26, RULE_if_else = 27, RULE_els = 28, 
		RULE_parameters = 29, RULE_arguments = 30, RULE_inc = 31, RULE_dec = 32, 
		RULE_methodcall = 33, RULE_methodstmt = 34, RULE_fact_call = 35, RULE_statement = 36, 
		RULE_start = 37;
	public static final String[] ruleNames = {
		"arith_op", "bool_value", "int_value", "rel_op", "value", "type", "declr", 
		"var", "var_1", "var_2", "back", "assign", "parameter", "arith_expr", 
		"gen_expr", "param", "open_sq", "close_sq", "double_colon", "stack_declr", 
		"stack_push", "stack_pop", "display", "loop", "open_brace", "close_brace", 
		"body", "if_else", "els", "parameters", "arguments", "inc", "dec", "methodcall", 
		"methodstmt", "fact_call", "statement", "start"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TRUE'", "'FALSE'", "'int'", "'boolean'", "'return'", "'<<'", "'>>'", 
		"'::'", "'stack'", "'.push'", "'.pop'", "'print'", "'while'", "'{'", "'}'", 
		"'if'", "'else'", "'else if'", "'++'", "'--'", "'Methodcall'", "'method'", 
		null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "','", "'=='", "'='", "'!='", 
		"'<'", "'>'", "'<='", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "ID", 
		"Digit", "ADD", "SUB", "MUL", "DIV", "MOD", "COMMA", "EQ2", "EQ", "NOT_EQ", 
		"LT", "GT", "LT_EQ", "GT_EQ", "WS"
	};
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
	public String getGrammarFileName() { return "Jav.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(JavParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(JavParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavParser.MOD, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitArith_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitArith_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Bool_valueContext extends ParserRuleContext {
		public Bool_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterBool_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitBool_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitBool_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valueContext bool_value() throws RecognitionException {
		Bool_valueContext _localctx = new Bool_valueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bool_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Int_valueContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(JavParser.Digit, 0); }
		public Int_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterInt_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitInt_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitInt_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_valueContext int_value() throws RecognitionException {
		Int_valueContext _localctx = new Int_valueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_int_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(Digit);
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

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode EQ2() { return getToken(JavParser.EQ2, 0); }
		public TerminalNode NOT_EQ() { return getToken(JavParser.NOT_EQ, 0); }
		public TerminalNode LT() { return getToken(JavParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavParser.GT, 0); }
		public TerminalNode LT_EQ() { return getToken(JavParser.LT_EQ, 0); }
		public TerminalNode GT_EQ() { return getToken(JavParser.GT_EQ, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ2) | (1L << NOT_EQ) | (1L << LT) | (1L << GT) | (1L << LT_EQ) | (1L << GT_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ValueContext extends ParserRuleContext {
		public Bool_valueContext bool_value() {
			return getRuleContext(Bool_valueContext.class,0);
		}
		public Int_valueContext int_value() {
			return getRuleContext(Int_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				bool_value();
				}
				break;
			case Digit:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				int_value();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DeclrContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public TerminalNode EQ() { return getToken(JavParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterDeclr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitDeclr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitDeclr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclrContext declr() throws RecognitionException {
		DeclrContext _localctx = new DeclrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			type();
			setState(91);
			match(ID);
			setState(92);
			match(EQ);
			setState(93);
			value();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public TerminalNode Digit() { return getToken(JavParser.Digit, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(ID);
				setState(97);
				match(Digit);
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

	public static class Var_1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public TerminalNode Digit() { return getToken(JavParser.Digit, 0); }
		public Var_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterVar_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitVar_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitVar_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_1Context var_1() throws RecognitionException {
		Var_1Context _localctx = new Var_1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_1);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(ID);
				setState(102);
				match(Digit);
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

	public static class Var_2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public TerminalNode Digit() { return getToken(JavParser.Digit, 0); }
		public Var_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterVar_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitVar_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitVar_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_2Context var_2() throws RecognitionException {
		Var_2Context _localctx = new Var_2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_2);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ID);
				setState(107);
				match(Digit);
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

	public static class BackContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode WS() { return getToken(JavParser.WS, 0); }
		public BackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterBack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitBack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitBack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackContext back() throws RecognitionException {
		BackContext _localctx = new BackContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_back);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__4);
				setState(111);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T__4);
				setState(113);
				match(WS);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public TerminalNode EQ() { return getToken(JavParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(ID);
				setState(117);
				match(EQ);
				setState(118);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(ID);
				setState(120);
				match(EQ);
				setState(121);
				var();
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			type();
			setState(125);
			match(ID);
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

	public static class Arith_exprContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JavParser.EQ, 0); }
		public Var_1Context var_1() {
			return getRuleContext(Var_1Context.class,0);
		}
		public List<Arith_opContext> arith_op() {
			return getRuleContexts(Arith_opContext.class);
		}
		public Arith_opContext arith_op(int i) {
			return getRuleContext(Arith_opContext.class,i);
		}
		public List<Var_2Context> var_2() {
			return getRuleContexts(Var_2Context.class);
		}
		public Var_2Context var_2(int i) {
			return getRuleContext(Var_2Context.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitArith_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitArith_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arith_expr);
		int _la;
		try {
			setState(148);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				var();
				setState(128);
				match(EQ);
				setState(129);
				var_1();
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130);
					arith_op();
					setState(131);
					var_2();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD))) != 0) );
				}
				break;
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				type();
				setState(138);
				var();
				setState(139);
				match(EQ);
				setState(140);
				var_1();
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					arith_op();
					setState(142);
					var_2();
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD))) != 0) );
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

	public static class Gen_exprContext extends ParserRuleContext {
		public Var_1Context var_1() {
			return getRuleContext(Var_1Context.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Var_2Context var_2() {
			return getRuleContext(Var_2Context.class,0);
		}
		public TerminalNode Digit() { return getToken(JavParser.Digit, 0); }
		public Gen_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterGen_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitGen_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitGen_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen_exprContext gen_expr() throws RecognitionException {
		Gen_exprContext _localctx = new Gen_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_gen_expr);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				var_1();
				setState(151);
				rel_op();
				setState(152);
				var_2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				var_1();
				setState(155);
				rel_op();
				setState(156);
				match(Digit);
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

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			type();
			setState(161);
			match(ID);
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

	public static class Open_sqContext extends ParserRuleContext {
		public Open_sqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_sq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterOpen_sq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitOpen_sq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitOpen_sq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_sqContext open_sq() throws RecognitionException {
		Open_sqContext _localctx = new Open_sqContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_open_sq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__5);
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

	public static class Close_sqContext extends ParserRuleContext {
		public Close_sqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_sq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterClose_sq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitClose_sq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitClose_sq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_sqContext close_sq() throws RecognitionException {
		Close_sqContext _localctx = new Close_sqContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_close_sq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__6);
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

	public static class Double_colonContext extends ParserRuleContext {
		public Double_colonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterDouble_colon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitDouble_colon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitDouble_colon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_colonContext double_colon() throws RecognitionException {
		Double_colonContext _localctx = new Double_colonContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_double_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__7);
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

	public static class Stack_declrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public Stack_declrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_declr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterStack_declr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitStack_declr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitStack_declr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_declrContext stack_declr() throws RecognitionException {
		Stack_declrContext _localctx = new Stack_declrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stack_declr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__8);
			setState(170);
			match(ID);
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

	public static class Stack_pushContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public Open_sqContext open_sq() {
			return getRuleContext(Open_sqContext.class,0);
		}
		public Close_sqContext close_sq() {
			return getRuleContext(Close_sqContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode Digit() { return getToken(JavParser.Digit, 0); }
		public Stack_pushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterStack_push(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitStack_push(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitStack_push(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_pushContext stack_push() throws RecognitionException {
		Stack_pushContext _localctx = new Stack_pushContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stack_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(173);
			match(T__9);
			setState(174);
			open_sq();
			setState(177);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(175);
				var();
				}
				break;
			case Digit:
				{
				setState(176);
				match(Digit);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(179);
			close_sq();
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

	public static class Stack_popContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public TerminalNode EQ() { return getToken(JavParser.EQ, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Stack_popContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterStack_pop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitStack_pop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitStack_pop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_popContext stack_pop() throws RecognitionException {
		Stack_popContext _localctx = new Stack_popContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stack_pop);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				type();
				setState(182);
				match(ID);
				setState(183);
				match(EQ);
				setState(184);
				var();
				setState(185);
				match(T__10);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(ID);
				setState(188);
				match(EQ);
				setState(189);
				var();
				setState(190);
				match(T__10);
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

	public static class DisplayContext extends ParserRuleContext {
		public Double_colonContext double_colon() {
			return getRuleContext(Double_colonContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitDisplay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitDisplay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__11);
			setState(195);
			double_colon();
			setState(196);
			var();
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

	public static class LoopContext extends ParserRuleContext {
		public Open_sqContext open_sq() {
			return getRuleContext(Open_sqContext.class,0);
		}
		public Gen_exprContext gen_expr() {
			return getRuleContext(Gen_exprContext.class,0);
		}
		public Close_sqContext close_sq() {
			return getRuleContext(Close_sqContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__12);
			setState(199);
			open_sq();
			setState(200);
			gen_expr();
			setState(201);
			close_sq();
			setState(202);
			body();
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

	public static class Open_braceContext extends ParserRuleContext {
		public Open_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterOpen_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitOpen_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitOpen_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_braceContext open_brace() throws RecognitionException {
		Open_braceContext _localctx = new Open_braceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_open_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__13);
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

	public static class Close_braceContext extends ParserRuleContext {
		public Close_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterClose_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitClose_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitClose_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_braceContext close_brace() throws RecognitionException {
		Close_braceContext _localctx = new Close_braceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_close_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__14);
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

	public static class BodyContext extends ParserRuleContext {
		public Open_braceContext open_brace() {
			return getRuleContext(Open_braceContext.class,0);
		}
		public Close_braceContext close_brace() {
			return getRuleContext(Close_braceContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			open_brace();
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				statement();
				}
				}
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__20) | (1L << ID))) != 0) );
			setState(214);
			close_brace();
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

	public static class If_elseContext extends ParserRuleContext {
		public Open_sqContext open_sq() {
			return getRuleContext(Open_sqContext.class,0);
		}
		public Gen_exprContext gen_expr() {
			return getRuleContext(Gen_exprContext.class,0);
		}
		public Close_sqContext close_sq() {
			return getRuleContext(Close_sqContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElsContext els() {
			return getRuleContext(ElsContext.class,0);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__15);
			setState(217);
			open_sq();
			setState(218);
			gen_expr();
			setState(219);
			close_sq();
			setState(220);
			body();
			setState(221);
			els();
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

	public static class ElsContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WS() { return getToken(JavParser.WS, 0); }
		public ElsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_els; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterEls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitEls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitEls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsContext els() throws RecognitionException {
		ElsContext _localctx = new ElsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_els);
		try {
			setState(228);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__16);
				setState(224);
				body();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__17);
				setState(226);
				body();
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(WS);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(230);
				param();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(231);
					match(COMMA);
					setState(232);
					param();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(242);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(243);
				match(ID);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(244);
					match(COMMA);
					setState(245);
					match(ID);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(255);
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

	public static class IncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ID);
			setState(257);
			match(T__18);
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

	public static class DecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
			setState(260);
			match(T__19);
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

	public static class MethodcallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public Open_sqContext open_sq() {
			return getRuleContext(Open_sqContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Close_sqContext close_sq() {
			return getRuleContext(Close_sqContext.class,0);
		}
		public MethodcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterMethodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitMethodcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitMethodcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodcallContext methodcall() throws RecognitionException {
		MethodcallContext _localctx = new MethodcallContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_methodcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__20);
			setState(263);
			match(ID);
			setState(264);
			open_sq();
			setState(265);
			arguments();
			setState(266);
			close_sq();
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

	public static class MethodstmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public Open_sqContext open_sq() {
			return getRuleContext(Open_sqContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Close_sqContext close_sq() {
			return getRuleContext(Close_sqContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MethodstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterMethodstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitMethodstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitMethodstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodstmtContext methodstmt() throws RecognitionException {
		MethodstmtContext _localctx = new MethodstmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__21);
			setState(269);
			match(ID);
			setState(270);
			open_sq();
			setState(271);
			parameters();
			setState(272);
			close_sq();
			setState(273);
			body();
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

	public static class Fact_callContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavParser.ID, 0); }
		public TerminalNode EQ() { return getToken(JavParser.EQ, 0); }
		public Var_1Context var_1() {
			return getRuleContext(Var_1Context.class,0);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public Fact_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterFact_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitFact_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitFact_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fact_callContext fact_call() throws RecognitionException {
		Fact_callContext _localctx = new Fact_callContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fact_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			type();
			setState(276);
			match(ID);
			setState(277);
			match(EQ);
			setState(278);
			var_1();
			setState(279);
			match(MUL);
			setState(280);
			methodcall();
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
		public DeclrContext declr() {
			return getRuleContext(DeclrContext.class,0);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public Gen_exprContext gen_expr() {
			return getRuleContext(Gen_exprContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Fact_callContext fact_call() {
			return getRuleContext(Fact_callContext.class,0);
		}
		public Stack_pushContext stack_push() {
			return getRuleContext(Stack_pushContext.class,0);
		}
		public Stack_popContext stack_pop() {
			return getRuleContext(Stack_popContext.class,0);
		}
		public Stack_declrContext stack_declr() {
			return getRuleContext(Stack_declrContext.class,0);
		}
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public BackContext back() {
			return getRuleContext(BackContext.class,0);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statement);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				declr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				methodcall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				arith_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				gen_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				if_else();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				parameter();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				fact_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(290);
				stack_push();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(291);
				stack_pop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(292);
				stack_declr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(293);
				display();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(294);
				assign();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(295);
				back();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(296);
				inc();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(297);
				dec();
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

	public static class StartContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MethodstmtContext> methodstmt() {
			return getRuleContexts(MethodstmtContext.class);
		}
		public MethodstmtContext methodstmt(int i) {
			return getRuleContext(MethodstmtContext.class,i);
		}
		public List<MethodcallContext> methodcall() {
			return getRuleContexts(MethodcallContext.class);
		}
		public MethodcallContext methodcall(int i) {
			return getRuleContext(MethodcallContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavListener ) ((JavListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavVisitor ) return ((JavVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(300);
					statement();
					}
					break;
				case 2:
					{
					setState(301);
					methodstmt();
					}
					break;
				case 3:
					{
					setState(302);
					methodcall();
					}
					break;
				}
				}
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0) );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\5\6Y\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\te\n"+
		"\t\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\5\13o\n\13\3\f\3\f\3\f\3\f\5\f"+
		"u\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\6\17\u0088\n\17\r\17\16\17\u0089\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\6\17\u0093\n\17\r\17\16\17\u0094\5\17\u0097\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a1\n\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00b4"+
		"\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00c3\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\6\34\u00d5\n\34\r\34\16\34\u00d6\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u00e7"+
		"\n\36\3\37\3\37\3\37\7\37\u00ec\n\37\f\37\16\37\u00ef\13\37\7\37\u00f1"+
		"\n\37\f\37\16\37\u00f4\13\37\3 \3 \3 \7 \u00f9\n \f \16 \u00fc\13 \7 "+
		"\u00fe\n \f \16 \u0101\13 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\5&\u012d\n&\3\'\3\'\3\'\6\'\u0132\n\'\r\'\16\'\u0133"+
		"\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJL\2\6\3\2\33\37\3\2\3\4\4\2!!#\'\3\2\5\6\u0134\2N\3\2\2\2\4"+
		"P\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20"+
		"d\3\2\2\2\22i\3\2\2\2\24n\3\2\2\2\26t\3\2\2\2\30|\3\2\2\2\32~\3\2\2\2"+
		"\34\u0096\3\2\2\2\36\u00a0\3\2\2\2 \u00a2\3\2\2\2\"\u00a5\3\2\2\2$\u00a7"+
		"\3\2\2\2&\u00a9\3\2\2\2(\u00ab\3\2\2\2*\u00ae\3\2\2\2,\u00c2\3\2\2\2."+
		"\u00c4\3\2\2\2\60\u00c8\3\2\2\2\62\u00ce\3\2\2\2\64\u00d0\3\2\2\2\66\u00d2"+
		"\3\2\2\28\u00da\3\2\2\2:\u00e6\3\2\2\2<\u00f2\3\2\2\2>\u00ff\3\2\2\2@"+
		"\u0102\3\2\2\2B\u0105\3\2\2\2D\u0108\3\2\2\2F\u010e\3\2\2\2H\u0115\3\2"+
		"\2\2J\u012c\3\2\2\2L\u0131\3\2\2\2NO\t\2\2\2O\3\3\2\2\2PQ\t\3\2\2Q\5\3"+
		"\2\2\2RS\7\32\2\2S\7\3\2\2\2TU\t\4\2\2U\t\3\2\2\2VY\5\4\3\2WY\5\6\4\2"+
		"XV\3\2\2\2XW\3\2\2\2Y\13\3\2\2\2Z[\t\5\2\2[\r\3\2\2\2\\]\5\f\7\2]^\7\31"+
		"\2\2^_\7\"\2\2_`\5\n\6\2`\17\3\2\2\2ae\7\31\2\2bc\7\31\2\2ce\7\32\2\2"+
		"da\3\2\2\2db\3\2\2\2e\21\3\2\2\2fj\7\31\2\2gh\7\31\2\2hj\7\32\2\2if\3"+
		"\2\2\2ig\3\2\2\2j\23\3\2\2\2ko\7\31\2\2lm\7\31\2\2mo\7\32\2\2nk\3\2\2"+
		"\2nl\3\2\2\2o\25\3\2\2\2pq\7\7\2\2qu\5\20\t\2rs\7\7\2\2su\7(\2\2tp\3\2"+
		"\2\2tr\3\2\2\2u\27\3\2\2\2vw\7\31\2\2wx\7\"\2\2x}\5\n\6\2yz\7\31\2\2z"+
		"{\7\"\2\2{}\5\20\t\2|v\3\2\2\2|y\3\2\2\2}\31\3\2\2\2~\177\5\f\7\2\177"+
		"\u0080\7\31\2\2\u0080\33\3\2\2\2\u0081\u0082\5\20\t\2\u0082\u0083\7\""+
		"\2\2\u0083\u0087\5\22\n\2\u0084\u0085\5\2\2\2\u0085\u0086\5\24\13\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u0097\3\2\2\2\u008b\u008c\5\f\7\2\u008c"+
		"\u008d\5\20\t\2\u008d\u008e\7\"\2\2\u008e\u0092\5\22\n\2\u008f\u0090\5"+
		"\2\2\2\u0090\u0091\5\24\13\2\u0091\u0093\3\2\2\2\u0092\u008f\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0081\3\2\2\2\u0096\u008b\3\2\2\2\u0097\35\3\2\2\2\u0098\u0099"+
		"\5\22\n\2\u0099\u009a\5\b\5\2\u009a\u009b\5\24\13\2\u009b\u00a1\3\2\2"+
		"\2\u009c\u009d\5\22\n\2\u009d\u009e\5\b\5\2\u009e\u009f\7\32\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\37\3\2\2"+
		"\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\7\31\2\2\u00a4!\3\2\2\2\u00a5\u00a6"+
		"\7\b\2\2\u00a6#\3\2\2\2\u00a7\u00a8\7\t\2\2\u00a8%\3\2\2\2\u00a9\u00aa"+
		"\7\n\2\2\u00aa\'\3\2\2\2\u00ab\u00ac\7\13\2\2\u00ac\u00ad\7\31\2\2\u00ad"+
		")\3\2\2\2\u00ae\u00af\7\31\2\2\u00af\u00b0\7\f\2\2\u00b0\u00b3\5\"\22"+
		"\2\u00b1\u00b4\5\20\t\2\u00b2\u00b4\7\32\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5$\23\2\u00b6+\3\2\2\2"+
		"\u00b7\u00b8\5\f\7\2\u00b8\u00b9\7\31\2\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb"+
		"\5\20\t\2\u00bb\u00bc\7\r\2\2\u00bc\u00c3\3\2\2\2\u00bd\u00be\7\31\2\2"+
		"\u00be\u00bf\7\"\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c1\7\r\2\2\u00c1\u00c3"+
		"\3\2\2\2\u00c2\u00b7\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3-\3\2\2\2\u00c4"+
		"\u00c5\7\16\2\2\u00c5\u00c6\5&\24\2\u00c6\u00c7\5\20\t\2\u00c7/\3\2\2"+
		"\2\u00c8\u00c9\7\17\2\2\u00c9\u00ca\5\"\22\2\u00ca\u00cb\5\36\20\2\u00cb"+
		"\u00cc\5$\23\2\u00cc\u00cd\5\66\34\2\u00cd\61\3\2\2\2\u00ce\u00cf\7\20"+
		"\2\2\u00cf\63\3\2\2\2\u00d0\u00d1\7\21\2\2\u00d1\65\3\2\2\2\u00d2\u00d4"+
		"\5\62\32\2\u00d3\u00d5\5J&\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\5\64"+
		"\33\2\u00d9\67\3\2\2\2\u00da\u00db\7\22\2\2\u00db\u00dc\5\"\22\2\u00dc"+
		"\u00dd\5\36\20\2\u00dd\u00de\5$\23\2\u00de\u00df\5\66\34\2\u00df\u00e0"+
		"\5:\36\2\u00e09\3\2\2\2\u00e1\u00e2\7\23\2\2\u00e2\u00e7\5\66\34\2\u00e3"+
		"\u00e4\7\24\2\2\u00e4\u00e7\5\66\34\2\u00e5\u00e7\7(\2\2\u00e6\u00e1\3"+
		"\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7;\3\2\2\2\u00e8\u00ed"+
		"\5 \21\2\u00e9\u00ea\7 \2\2\u00ea\u00ec\5 \21\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3=\3\2\2\2\u00f4\u00f2\3\2\2\2"+
		"\u00f5\u00fa\7\31\2\2\u00f6\u00f7\7 \2\2\u00f7\u00f9\7\31\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fe\u0101\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100?\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0103\7\31\2\2\u0103\u0104\7\25\2\2\u0104A\3\2\2\2\u0105"+
		"\u0106\7\31\2\2\u0106\u0107\7\26\2\2\u0107C\3\2\2\2\u0108\u0109\7\27\2"+
		"\2\u0109\u010a\7\31\2\2\u010a\u010b\5\"\22\2\u010b\u010c\5> \2\u010c\u010d"+
		"\5$\23\2\u010dE\3\2\2\2\u010e\u010f\7\30\2\2\u010f\u0110\7\31\2\2\u0110"+
		"\u0111\5\"\22\2\u0111\u0112\5<\37\2\u0112\u0113\5$\23\2\u0113\u0114\5"+
		"\66\34\2\u0114G\3\2\2\2\u0115\u0116\5\f\7\2\u0116\u0117\7\31\2\2\u0117"+
		"\u0118\7\"\2\2\u0118\u0119\5\22\n\2\u0119\u011a\7\35\2\2\u011a\u011b\5"+
		"D#\2\u011bI\3\2\2\2\u011c\u012d\5\16\b\2\u011d\u012d\5D#\2\u011e\u012d"+
		"\5\34\17\2\u011f\u012d\5\36\20\2\u0120\u012d\5\60\31\2\u0121\u012d\58"+
		"\35\2\u0122\u012d\5\32\16\2\u0123\u012d\5H%\2\u0124\u012d\5*\26\2\u0125"+
		"\u012d\5,\27\2\u0126\u012d\5(\25\2\u0127\u012d\5.\30\2\u0128\u012d\5\30"+
		"\r\2\u0129\u012d\5\26\f\2\u012a\u012d\5@!\2\u012b\u012d\5B\"\2\u012c\u011c"+
		"\3\2\2\2\u012c\u011d\3\2\2\2\u012c\u011e\3\2\2\2\u012c\u011f\3\2\2\2\u012c"+
		"\u0120\3\2\2\2\u012c\u0121\3\2\2\2\u012c\u0122\3\2\2\2\u012c\u0123\3\2"+
		"\2\2\u012c\u0124\3\2\2\2\u012c\u0125\3\2\2\2\u012c\u0126\3\2\2\2\u012c"+
		"\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012b\3\2\2\2\u012dK\3\2\2\2\u012e\u0132\5J&\2\u012f\u0132"+
		"\5F$\2\u0130\u0132\5D#\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134M\3\2\2\2\27Xdint|\u0089\u0094\u0096\u00a0\u00b3\u00c2\u00d6"+
		"\u00e6\u00ed\u00f2\u00fa\u00ff\u012c\u0131\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}