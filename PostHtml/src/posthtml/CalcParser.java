// Generated from /home/x/Área de Trabalho/lfa_language/PostHtml/Grammar/Calc.g4 by ANTLR 4.7
package posthtml;

import workload.Expr;
import workload.Sketch;
import workload.Operator;
import static workload.Expr.*;
import static workload.Sketch.*;
import workload.Op;
import java.util.LinkedList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CUSTOM=1, NUMERO=2, OR=3, AND=4, NOT=5, IF=6, THEN=7, ELSE=8, WHILE=9, 
		DO=10, SQUARE=11, RECTANGLE=12, OVAL=13, PENTAGON=14, OCTAGON=15, CIRCLE=16, 
		TRIANGLE=17, TRAPEZIO=18, RED=19, BLUE=20, BLACK=21, PURPLE=22, WHITE=23, 
		GREEN=24, PINK=25, YELLOW=26, DRAWID=27, IDENT=28, HEX_NUM=29, HASH=30, 
		GETS=31, PLUS=32, MINUS=33, TIMES=34, DIVIDE=35, MOD=36, EXP=37, LPAR=38, 
		RPAR=39, LBRC=40, RBRC=41, COMMA=42, SEMI=43, EQU=44, NEQ=45, LT=46, LEQ=47, 
		GT=48, GEQ=49, WS=50, COMMENT=51;
	public static final int
		RULE_inicio = 0, RULE_statement = 1, RULE_ifExpr = 2, RULE_whileExpr = 3, 
		RULE_block = 4, RULE_sttmtSeq = 5, RULE_expr = 6, RULE_assign = 7, RULE_bexpr = 8, 
		RULE_disj = 9, RULE_conj = 10, RULE_relOp = 11, RULE_aexpr = 12, RULE_parcela = 13, 
		RULE_fator = 14, RULE_termo = 15, RULE_argList = 16, RULE_design = 17, 
		RULE_shape = 18, RULE_property = 19, RULE_color = 20;
	public static final String[] ruleNames = {
		"inicio", "statement", "ifExpr", "whileExpr", "block", "sttmtSeq", "expr", 
		"assign", "bexpr", "disj", "conj", "relOp", "aexpr", "parcela", "fator", 
		"termo", "argList", "design", "shape", "property", "color"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'or'", "'and'", "'not'", "'if'", "'then'", "'else'", 
		"'while'", "'do'", "'square'", "'rectangle'", "'oval'", "'pentagon'", 
		"'octagon'", "'circle'", "'triangle'", "'trapezio'", "'red'", "'blue'", 
		"'black'", "'purple'", "'white'", "'green'", "'pink'", "'yellow'", null, 
		null, null, "'#'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'('", 
		"')'", "'{'", "'}'", "','", "';'", "'=='", "'!='", "'<'", "'<='", "'>'", 
		"'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CUSTOM", "NUMERO", "OR", "AND", "NOT", "IF", "THEN", "ELSE", "WHILE", 
		"DO", "SQUARE", "RECTANGLE", "OVAL", "PENTAGON", "OCTAGON", "CIRCLE", 
		"TRIANGLE", "TRAPEZIO", "RED", "BLUE", "BLACK", "PURPLE", "WHITE", "GREEN", 
		"PINK", "YELLOW", "DRAWID", "IDENT", "HEX_NUM", "HASH", "GETS", "PLUS", 
		"MINUS", "TIMES", "DIVIDE", "MOD", "EXP", "LPAR", "RPAR", "LBRC", "RBRC", 
		"COMMA", "SEMI", "EQU", "NEQ", "LT", "LEQ", "GT", "GEQ", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicioContext extends ParserRuleContext {
		public List<Expr> result;
		public StatementContext s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);

		    ((InicioContext)_localctx).result =  new LinkedList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << DRAWID) | (1L << IDENT) | (1L << MINUS) | (1L << LPAR) | (1L << LBRC))) != 0)) {
				{
				{
				setState(42);
				((InicioContext)_localctx).s = statement();
				_localctx.result.add(((InicioContext)_localctx).s.result);
				}
				}
				setState(49);
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

	public static class StatementContext extends ParserRuleContext {
		public Expr result;
		public ExprContext e;
		public AssignContext a;
		public IfExprContext i;
		public WhileExprContext w;
		public BlockContext b;
		public TerminalNode SEMI() { return getToken(CalcParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((StatementContext)_localctx).e = expr();
				setState(51);
				match(SEMI);
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).e.result;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				((StatementContext)_localctx).a = assign();
				setState(55);
				match(SEMI);
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).a.result;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				((StatementContext)_localctx).i = ifExpr();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).i.result;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				((StatementContext)_localctx).w = whileExpr();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).w.result;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).b.result;
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

	public static class IfExprContext extends ParserRuleContext {
		public Expr result;
		public BexprContext c;
		public StatementContext t;
		public StatementContext e;
		public TerminalNode IF() { return getToken(CalcParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CalcParser.THEN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CalcParser.ELSE, 0); }
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifExpr);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(IF);
				setState(70);
				((IfExprContext)_localctx).c = bexpr();
				setState(71);
				match(THEN);
				setState(72);
				((IfExprContext)_localctx).t = statement();
				((IfExprContext)_localctx).result =  mkIf(((IfExprContext)_localctx).c.result, ((IfExprContext)_localctx).t.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(IF);
				setState(76);
				((IfExprContext)_localctx).c = bexpr();
				setState(77);
				match(THEN);
				setState(78);
				((IfExprContext)_localctx).t = statement();
				setState(79);
				match(ELSE);
				setState(80);
				((IfExprContext)_localctx).e = statement();
				((IfExprContext)_localctx).result =  mkIf(((IfExprContext)_localctx).c.result, ((IfExprContext)_localctx).t.result, ((IfExprContext)_localctx).e.result);
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

	public static class WhileExprContext extends ParserRuleContext {
		public Expr result;
		public BexprContext c;
		public StatementContext d;
		public TerminalNode WHILE() { return getToken(CalcParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(CalcParser.DO, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitWhileExpr(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(WHILE);
			setState(86);
			((WhileExprContext)_localctx).c = bexpr();
			setState(87);
			match(DO);
			setState(88);
			((WhileExprContext)_localctx).d = statement();
			((WhileExprContext)_localctx).result =  mkWhile(((WhileExprContext)_localctx).c.result, ((WhileExprContext)_localctx).d.result);
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

	public static class BlockContext extends ParserRuleContext {
		public Expr result;
		public SttmtSeqContext st;
		public TerminalNode LBRC() { return getToken(CalcParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(CalcParser.RBRC, 0); }
		public SttmtSeqContext sttmtSeq() {
			return getRuleContext(SttmtSeqContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(LBRC);
			setState(92);
			((BlockContext)_localctx).st = sttmtSeq();
			setState(93);
			match(RBRC);
			((BlockContext)_localctx).result =  mkBlock(((BlockContext)_localctx).st.sttmts);
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

	public static class SttmtSeqContext extends ParserRuleContext {
		public List<Expr> sttmts;
		public StatementContext s1;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SttmtSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sttmtSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterSttmtSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitSttmtSeq(this);
		}
	}

	public final SttmtSeqContext sttmtSeq() throws RecognitionException {
		SttmtSeqContext _localctx = new SttmtSeqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sttmtSeq);

		    ((SttmtSeqContext)_localctx).sttmts =  new LinkedList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << DRAWID) | (1L << IDENT) | (1L << MINUS) | (1L << LPAR) | (1L << LBRC))) != 0)) {
				{
				{
				setState(96);
				((SttmtSeqContext)_localctx).s1 = statement();
				_localctx.sttmts.add(((SttmtSeqContext)_localctx).s1.result);
				}
				}
				setState(103);
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

	public static class ExprContext extends ParserRuleContext {
		public Expr result;
		public BexprContext e;
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((ExprContext)_localctx).e = bexpr();
			((ExprContext)_localctx).result =  ((ExprContext)_localctx).e.result;
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
		public Expr result;
		public Token IDENT;
		public ExprContext e;
		public DesignContext d1;
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public TerminalNode GETS() { return getToken(CalcParser.GETS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DRAWID() { return getToken(CalcParser.DRAWID, 0); }
		public DesignContext design() {
			return getRuleContext(DesignContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((AssignContext)_localctx).IDENT = match(IDENT);
				setState(108);
				match(GETS);
				setState(109);
				((AssignContext)_localctx).e = expr();
				((AssignContext)_localctx).result =  mkAssign((((AssignContext)_localctx).IDENT!=null?((AssignContext)_localctx).IDENT.getText():null), ((AssignContext)_localctx).e.result);
				}
				break;
			case DRAWID:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(DRAWID);
				setState(113);
				((AssignContext)_localctx).IDENT = match(IDENT);
				setState(114);
				match(GETS);
				setState(115);
				((AssignContext)_localctx).d1 = design();
				((AssignContext)_localctx).result =  mkDrawAssing((((AssignContext)_localctx).IDENT!=null?((AssignContext)_localctx).IDENT.getText():null),((AssignContext)_localctx).d1.result);
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

	public static class BexprContext extends ParserRuleContext {
		public Expr result;
		public DisjContext d1;
		public DisjContext d2;
		public List<DisjContext> disj() {
			return getRuleContexts(DisjContext.class);
		}
		public DisjContext disj(int i) {
			return getRuleContext(DisjContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CalcParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CalcParser.OR, i);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBexpr(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((BexprContext)_localctx).d1 = disj();
			((BexprContext)_localctx).result =  ((BexprContext)_localctx).d1.result;
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(122);
				match(OR);
				setState(123);
				((BexprContext)_localctx).d2 = disj();
				((BexprContext)_localctx).result =  mkComposite(Op.OR, _localctx.result, ((BexprContext)_localctx).d2.result);
				}
				}
				setState(130);
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

	public static class DisjContext extends ParserRuleContext {
		public Expr result;
		public ConjContext c1;
		public ConjContext c2;
		public List<ConjContext> conj() {
			return getRuleContexts(ConjContext.class);
		}
		public ConjContext conj(int i) {
			return getRuleContext(ConjContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CalcParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CalcParser.AND, i);
		}
		public DisjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterDisj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitDisj(this);
		}
	}

	public final DisjContext disj() throws RecognitionException {
		DisjContext _localctx = new DisjContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_disj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((DisjContext)_localctx).c1 = conj();
			((DisjContext)_localctx).result =  ((DisjContext)_localctx).c1.result;
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(133);
				match(AND);
				setState(134);
				((DisjContext)_localctx).c2 = conj();
				((DisjContext)_localctx).result =  mkComposite(Op.AND, _localctx.result, ((DisjContext)_localctx).c2.result);
				}
				}
				setState(141);
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

	public static class ConjContext extends ParserRuleContext {
		public Expr result;
		public AexprContext a1;
		public RelOpContext o;
		public AexprContext a2;
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public ConjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterConj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitConj(this);
		}
	}

	public final ConjContext conj() throws RecognitionException {
		ConjContext _localctx = new ConjContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((ConjContext)_localctx).a1 = aexpr();
			((ConjContext)_localctx).result =  ((ConjContext)_localctx).a1.result;
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQU) | (1L << NEQ) | (1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ))) != 0)) {
				{
				setState(144);
				((ConjContext)_localctx).o = relOp();
				setState(145);
				((ConjContext)_localctx).a2 = aexpr();
				((ConjContext)_localctx).result =  mkComposite(((ConjContext)_localctx).o.result, _localctx.result, ((ConjContext)_localctx).a2.result);
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

	public static class RelOpContext extends ParserRuleContext {
		public Operator result;
		public TerminalNode EQU() { return getToken(CalcParser.EQU, 0); }
		public TerminalNode NEQ() { return getToken(CalcParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(CalcParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(CalcParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(CalcParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(CalcParser.GEQ, 0); }
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitRelOp(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relOp);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQU:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(EQU);
				((RelOpContext)_localctx).result =  Op.EQU;
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(NEQ);
				((RelOpContext)_localctx).result =  Op.NEQ;
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(LT);
				((RelOpContext)_localctx).result =  Op.LT;
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(LEQ);
				((RelOpContext)_localctx).result =  Op.LEQ;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(GT);
				((RelOpContext)_localctx).result =  Op.GT;
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(GEQ);
				((RelOpContext)_localctx).result =  Op.GEQ;
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

	public static class AexprContext extends ParserRuleContext {
		public Expr result;
		public ParcelaContext p1;
		public ParcelaContext p2;
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CalcParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CalcParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CalcParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CalcParser.MINUS, i);
		}
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterAexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitAexpr(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((AexprContext)_localctx).p1 = parcela();
			((AexprContext)_localctx).result =  ((AexprContext)_localctx).p1.result;
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(174);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(166);
					match(PLUS);
					setState(167);
					((AexprContext)_localctx).p2 = parcela();
					((AexprContext)_localctx).result =  mkComposite(Op.PLUS, _localctx.result, ((AexprContext)_localctx).p2.result);
					}
					break;
				case MINUS:
					{
					setState(170);
					match(MINUS);
					setState(171);
					((AexprContext)_localctx).p2 = parcela();
					((AexprContext)_localctx).result =  mkComposite(Op.MINUS, _localctx.result, ((AexprContext)_localctx).p2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(178);
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

	public static class ParcelaContext extends ParserRuleContext {
		public Expr result;
		public FatorContext f1;
		public FatorContext f2;
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(CalcParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(CalcParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CalcParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CalcParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(CalcParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(CalcParser.MOD, i);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parcela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((ParcelaContext)_localctx).f1 = fator();
			((ParcelaContext)_localctx).result =  ((ParcelaContext)_localctx).f1.result;
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(181);
					match(TIMES);
					setState(182);
					((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.TIMES, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				case DIVIDE:
					{
					setState(185);
					match(DIVIDE);
					setState(186);
					((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.DIVIDE, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				case MOD:
					{
					setState(189);
					match(MOD);
					setState(190);
					((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.MOD, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(197);
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

	public static class FatorContext extends ParserRuleContext {
		public Expr result;
		public TermoContext t1;
		public TermoContext t2;
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public TerminalNode EXP() { return getToken(CalcParser.EXP, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((FatorContext)_localctx).t1 = termo();
			((FatorContext)_localctx).result =  ((FatorContext)_localctx).t1.result;
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXP) {
				{
				setState(200);
				match(EXP);
				setState(201);
				((FatorContext)_localctx).t2 = termo();
				((FatorContext)_localctx).result =  mkComposite(Op.EXP, _localctx.result, ((FatorContext)_localctx).t2.result);
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

	public static class TermoContext extends ParserRuleContext {
		public Expr result;
		public TermoContext t1;
		public ExprContext e1;
		public Token NUMERO;
		public Token IDENT;
		public ArgListContext a;
		public TerminalNode MINUS() { return getToken(CalcParser.MINUS, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CalcParser.NOT, 0); }
		public TerminalNode LPAR() { return getToken(CalcParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CalcParser.RPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(CalcParser.NUMERO, 0); }
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termo);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(MINUS);
				setState(207);
				((TermoContext)_localctx).t1 = termo();
				((TermoContext)_localctx).result =  mkComposite(Op.UMINUS, ((TermoContext)_localctx).t1.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(NOT);
				setState(211);
				((TermoContext)_localctx).t1 = termo();
				((TermoContext)_localctx).result =  mkComposite(Op.NOT, ((TermoContext)_localctx).t1.result);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(LPAR);
				setState(215);
				((TermoContext)_localctx).e1 = expr();
				setState(216);
				match(RPAR);
				((TermoContext)_localctx).result =  ((TermoContext)_localctx).e1.result;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				((TermoContext)_localctx).NUMERO = match(NUMERO);
				((TermoContext)_localctx).result =  mkNumeric(Double.parseDouble((((TermoContext)_localctx).NUMERO!=null?((TermoContext)_localctx).NUMERO.getText():null)));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				((TermoContext)_localctx).IDENT = match(IDENT);
				((TermoContext)_localctx).result =  mkVar((((TermoContext)_localctx).IDENT!=null?((TermoContext)_localctx).IDENT.getText():null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				((TermoContext)_localctx).IDENT = match(IDENT);
				setState(224);
				match(LPAR);
				setState(225);
				((TermoContext)_localctx).a = argList();
				setState(226);
				match(RPAR);
				((TermoContext)_localctx).result =  mkFunCall((((TermoContext)_localctx).IDENT!=null?((TermoContext)_localctx).IDENT.getText():null), ((TermoContext)_localctx).a.args);
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

	public static class ArgListContext extends ParserRuleContext {
		public List<Expr> args;
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalcParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalcParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argList);

		    ((ArgListContext)_localctx).args =  new LinkedList<Expr>();

		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NUMERO:
			case NOT:
			case IDENT:
			case MINUS:
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				((ArgListContext)_localctx).e1 = expr();
				_localctx.args.add(((ArgListContext)_localctx).e1.result);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(234);
					match(COMMA);
					setState(235);
					((ArgListContext)_localctx).e2 = expr();
					_localctx.args.add(((ArgListContext)_localctx).e2.result);
					}
					}
					setState(242);
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

	public static class DesignContext extends ParserRuleContext {
		public Sketch result;
		public ShapeContext ds1;
		public PropertyContext dp1;
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public DesignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_design; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterDesign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitDesign(this);
		}
	}

	public final DesignContext design() throws RecognitionException {
		DesignContext _localctx = new DesignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_design);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((DesignContext)_localctx).ds1 = shape();
			setState(246);
			((DesignContext)_localctx).dp1 = property();
			((DesignContext)_localctx).result =  mkDesign(((DesignContext)_localctx).ds1.result,((DesignContext)_localctx).dp1.result);
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

	public static class ShapeContext extends ParserRuleContext {
		public Sketch result;
		public Token SQUARE;
		public Token RECTANGLE;
		public Token OVAL;
		public Token PENTAGON;
		public Token OCTAGON;
		public Token CIRCLE;
		public Token TRIANGLE;
		public Token TRAPEZIO;
		public TerminalNode SQUARE() { return getToken(CalcParser.SQUARE, 0); }
		public TerminalNode RECTANGLE() { return getToken(CalcParser.RECTANGLE, 0); }
		public TerminalNode OVAL() { return getToken(CalcParser.OVAL, 0); }
		public TerminalNode PENTAGON() { return getToken(CalcParser.PENTAGON, 0); }
		public TerminalNode OCTAGON() { return getToken(CalcParser.OCTAGON, 0); }
		public TerminalNode CIRCLE() { return getToken(CalcParser.CIRCLE, 0); }
		public TerminalNode TRIANGLE() { return getToken(CalcParser.TRIANGLE, 0); }
		public TerminalNode TRAPEZIO() { return getToken(CalcParser.TRAPEZIO, 0); }
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitShape(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_shape);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				((ShapeContext)_localctx).SQUARE = match(SQUARE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).SQUARE!=null?((ShapeContext)_localctx).SQUARE.getText():null));
				}
				break;
			case RECTANGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				((ShapeContext)_localctx).RECTANGLE = match(RECTANGLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).RECTANGLE!=null?((ShapeContext)_localctx).RECTANGLE.getText():null));
				}
				break;
			case OVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				((ShapeContext)_localctx).OVAL = match(OVAL);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).OVAL!=null?((ShapeContext)_localctx).OVAL.getText():null));
				}
				break;
			case PENTAGON:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				((ShapeContext)_localctx).PENTAGON = match(PENTAGON);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).PENTAGON!=null?((ShapeContext)_localctx).PENTAGON.getText():null));
				}
				break;
			case OCTAGON:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				((ShapeContext)_localctx).OCTAGON = match(OCTAGON);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).OCTAGON!=null?((ShapeContext)_localctx).OCTAGON.getText():null));
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				((ShapeContext)_localctx).CIRCLE = match(CIRCLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).CIRCLE!=null?((ShapeContext)_localctx).CIRCLE.getText():null));
				}
				break;
			case TRIANGLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				((ShapeContext)_localctx).TRIANGLE = match(TRIANGLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).TRIANGLE!=null?((ShapeContext)_localctx).TRIANGLE.getText():null));
				}
				break;
			case TRAPEZIO:
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				((ShapeContext)_localctx).TRAPEZIO = match(TRAPEZIO);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).TRAPEZIO!=null?((ShapeContext)_localctx).TRAPEZIO.getText():null));
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

	public static class PropertyContext extends ParserRuleContext {
		public Sketch result;
		public Token height;
		public Token width;
		public ColorContext pColor;
		public List<TerminalNode> NUMERO() { return getTokens(CalcParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(CalcParser.NUMERO, i);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((PropertyContext)_localctx).height = match(NUMERO);
			setState(268);
			((PropertyContext)_localctx).width = match(NUMERO);
			setState(269);
			((PropertyContext)_localctx).pColor = color();
			((PropertyContext)_localctx).result =  mkProperty(mkNumeric(Double.parseDouble((((PropertyContext)_localctx).height!=null?((PropertyContext)_localctx).height.getText():null))),mkNumeric(Double.parseDouble((((PropertyContext)_localctx).width!=null?((PropertyContext)_localctx).width.getText():null))),((PropertyContext)_localctx).pColor.result);
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

	public static class ColorContext extends ParserRuleContext {
		public Sketch result;
		public Token RED;
		public Token BLUE;
		public Token BLACK;
		public Token PURPLE;
		public Token YELLOW;
		public Token PINK;
		public Token GREEN;
		public Token WHITE;
		public Token CUSTOM;
		public TerminalNode RED() { return getToken(CalcParser.RED, 0); }
		public TerminalNode BLUE() { return getToken(CalcParser.BLUE, 0); }
		public TerminalNode BLACK() { return getToken(CalcParser.BLACK, 0); }
		public TerminalNode PURPLE() { return getToken(CalcParser.PURPLE, 0); }
		public TerminalNode YELLOW() { return getToken(CalcParser.YELLOW, 0); }
		public TerminalNode PINK() { return getToken(CalcParser.PINK, 0); }
		public TerminalNode GREEN() { return getToken(CalcParser.GREEN, 0); }
		public TerminalNode WHITE() { return getToken(CalcParser.WHITE, 0); }
		public TerminalNode CUSTOM() { return getToken(CalcParser.CUSTOM, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_color);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RED:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				((ColorContext)_localctx).RED = match(RED);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).RED!=null?((ColorContext)_localctx).RED.getText():null));
				}
				break;
			case BLUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				((ColorContext)_localctx).BLUE = match(BLUE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).BLUE!=null?((ColorContext)_localctx).BLUE.getText():null));
				}
				break;
			case BLACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				((ColorContext)_localctx).BLACK = match(BLACK);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).BLACK!=null?((ColorContext)_localctx).BLACK.getText():null));
				}
				break;
			case PURPLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				((ColorContext)_localctx).PURPLE = match(PURPLE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).PURPLE!=null?((ColorContext)_localctx).PURPLE.getText():null));
				}
				break;
			case YELLOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				((ColorContext)_localctx).YELLOW = match(YELLOW);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).YELLOW!=null?((ColorContext)_localctx).YELLOW.getText():null));
				}
				break;
			case PINK:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				((ColorContext)_localctx).PINK = match(PINK);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).PINK!=null?((ColorContext)_localctx).PINK.getText():null));
				}
				break;
			case GREEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				((ColorContext)_localctx).GREEN = match(GREEN);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).GREEN!=null?((ColorContext)_localctx).GREEN.getText():null));
				}
				break;
			case WHITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(286);
				((ColorContext)_localctx).WHITE = match(WHITE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).WHITE!=null?((ColorContext)_localctx).WHITE.getText():null));
				}
				break;
			case CUSTOM:
				enterOuterAlt(_localctx, 9);
				{
				setState(288);
				((ColorContext)_localctx).CUSTOM = match(CUSTOM);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).CUSTOM!=null?((ColorContext)_localctx).CUSTOM.getText():null));
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0127\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\7\7f\n\7\f\7\16\7i\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0081\n\n\f\n\16\n\u0084"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008c\n\13\f\13\16\13\u008f\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00b1\n\16\f\16\16\16\u00b4\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c4\n\17"+
		"\f\17\16\17\u00c7\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cf\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e8\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00f1\n\22\f\22\16\22\u00f4\13\22\5\22"+
		"\u00f6\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010c\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0125\n\26\3\26\2\2\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\2\u013d\2\61\3\2\2\2\4E\3\2\2\2"+
		"\6U\3\2\2\2\bW\3\2\2\2\n]\3\2\2\2\fg\3\2\2\2\16j\3\2\2\2\20x\3\2\2\2\22"+
		"z\3\2\2\2\24\u0085\3\2\2\2\26\u0090\3\2\2\2\30\u00a4\3\2\2\2\32\u00a6"+
		"\3\2\2\2\34\u00b5\3\2\2\2\36\u00c8\3\2\2\2 \u00e7\3\2\2\2\"\u00f5\3\2"+
		"\2\2$\u00f7\3\2\2\2&\u010b\3\2\2\2(\u010d\3\2\2\2*\u0124\3\2\2\2,-\5\4"+
		"\3\2-.\b\2\1\2.\60\3\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64\65\5\16\b\2\65\66\7-\2\2\66\67\b"+
		"\3\1\2\67F\3\2\2\289\5\20\t\29:\7-\2\2:;\b\3\1\2;F\3\2\2\2<=\5\6\4\2="+
		">\b\3\1\2>F\3\2\2\2?@\5\b\5\2@A\b\3\1\2AF\3\2\2\2BC\5\n\6\2CD\b\3\1\2"+
		"DF\3\2\2\2E\64\3\2\2\2E8\3\2\2\2E<\3\2\2\2E?\3\2\2\2EB\3\2\2\2F\5\3\2"+
		"\2\2GH\7\b\2\2HI\5\22\n\2IJ\7\t\2\2JK\5\4\3\2KL\b\4\1\2LV\3\2\2\2MN\7"+
		"\b\2\2NO\5\22\n\2OP\7\t\2\2PQ\5\4\3\2QR\7\n\2\2RS\5\4\3\2ST\b\4\1\2TV"+
		"\3\2\2\2UG\3\2\2\2UM\3\2\2\2V\7\3\2\2\2WX\7\13\2\2XY\5\22\n\2YZ\7\f\2"+
		"\2Z[\5\4\3\2[\\\b\5\1\2\\\t\3\2\2\2]^\7*\2\2^_\5\f\7\2_`\7+\2\2`a\b\6"+
		"\1\2a\13\3\2\2\2bc\5\4\3\2cd\b\7\1\2df\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2h\r\3\2\2\2ig\3\2\2\2jk\5\22\n\2kl\b\b\1\2l\17\3\2\2\2"+
		"mn\7\36\2\2no\7!\2\2op\5\16\b\2pq\b\t\1\2qy\3\2\2\2rs\7\35\2\2st\7\36"+
		"\2\2tu\7!\2\2uv\5$\23\2vw\b\t\1\2wy\3\2\2\2xm\3\2\2\2xr\3\2\2\2y\21\3"+
		"\2\2\2z{\5\24\13\2{\u0082\b\n\1\2|}\7\5\2\2}~\5\24\13\2~\177\b\n\1\2\177"+
		"\u0081\3\2\2\2\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\23\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086"+
		"\5\26\f\2\u0086\u008d\b\13\1\2\u0087\u0088\7\6\2\2\u0088\u0089\5\26\f"+
		"\2\u0089\u008a\b\13\1\2\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\25\3\2\2"+
		"\2\u008f\u008d\3\2\2\2\u0090\u0091\5\32\16\2\u0091\u0096\b\f\1\2\u0092"+
		"\u0093\5\30\r\2\u0093\u0094\5\32\16\2\u0094\u0095\b\f\1\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27\3\2\2\2\u0098"+
		"\u0099\7.\2\2\u0099\u00a5\b\r\1\2\u009a\u009b\7/\2\2\u009b\u00a5\b\r\1"+
		"\2\u009c\u009d\7\60\2\2\u009d\u00a5\b\r\1\2\u009e\u009f\7\61\2\2\u009f"+
		"\u00a5\b\r\1\2\u00a0\u00a1\7\62\2\2\u00a1\u00a5\b\r\1\2\u00a2\u00a3\7"+
		"\63\2\2\u00a3\u00a5\b\r\1\2\u00a4\u0098\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4"+
		"\u009c\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00b2\b\16\1\2\u00a8"+
		"\u00a9\7\"\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ab\b\16\1\2\u00ab\u00b1"+
		"\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\b\16\1\2"+
		"\u00af\u00b1\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\33\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\5\36\20\2\u00b6\u00c5\b\17\1\2\u00b7\u00b8"+
		"\7$\2\2\u00b8\u00b9\5\36\20\2\u00b9\u00ba\b\17\1\2\u00ba\u00c4\3\2\2\2"+
		"\u00bb\u00bc\7%\2\2\u00bc\u00bd\5\36\20\2\u00bd\u00be\b\17\1\2\u00be\u00c4"+
		"\3\2\2\2\u00bf\u00c0\7&\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\b\17\1\2"+
		"\u00c2\u00c4\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bf"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\35\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5 \21\2\u00c9\u00ce\b\20\1"+
		"\2\u00ca\u00cb\7\'\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\b\20\1\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\37\3\2\2"+
		"\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\5 \21\2\u00d2\u00d3\b\21\1\2\u00d3\u00e8"+
		"\3\2\2\2\u00d4\u00d5\7\7\2\2\u00d5\u00d6\5 \21\2\u00d6\u00d7\b\21\1\2"+
		"\u00d7\u00e8\3\2\2\2\u00d8\u00d9\7(\2\2\u00d9\u00da\5\16\b\2\u00da\u00db"+
		"\7)\2\2\u00db\u00dc\b\21\1\2\u00dc\u00e8\3\2\2\2\u00dd\u00de\7\4\2\2\u00de"+
		"\u00e8\b\21\1\2\u00df\u00e0\7\36\2\2\u00e0\u00e8\b\21\1\2\u00e1\u00e2"+
		"\7\36\2\2\u00e2\u00e3\7(\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\7)\2\2\u00e5"+
		"\u00e6\b\21\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00d0\3\2\2\2\u00e7\u00d4\3"+
		"\2\2\2\u00e7\u00d8\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7"+
		"\u00e1\3\2\2\2\u00e8!\3\2\2\2\u00e9\u00f6\3\2\2\2\u00ea\u00eb\5\16\b\2"+
		"\u00eb\u00f2\b\22\1\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\5\16\b\2\u00ee\u00ef"+
		"\b\22\1\2\u00ef\u00f1\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1\u00f4\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f6#\3\2\2\2\u00f7"+
		"\u00f8\5&\24\2\u00f8\u00f9\5(\25\2\u00f9\u00fa\b\23\1\2\u00fa%\3\2\2\2"+
		"\u00fb\u00fc\7\r\2\2\u00fc\u010c\b\24\1\2\u00fd\u00fe\7\16\2\2\u00fe\u010c"+
		"\b\24\1\2\u00ff\u0100\7\17\2\2\u0100\u010c\b\24\1\2\u0101\u0102\7\20\2"+
		"\2\u0102\u010c\b\24\1\2\u0103\u0104\7\21\2\2\u0104\u010c\b\24\1\2\u0105"+
		"\u0106\7\22\2\2\u0106\u010c\b\24\1\2\u0107\u0108\7\23\2\2\u0108\u010c"+
		"\b\24\1\2\u0109\u010a\7\24\2\2\u010a\u010c\b\24\1\2\u010b\u00fb\3\2\2"+
		"\2\u010b\u00fd\3\2\2\2\u010b\u00ff\3\2\2\2\u010b\u0101\3\2\2\2\u010b\u0103"+
		"\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\'\3\2\2\2\u010d\u010e\7\4\2\2\u010e\u010f\7\4\2\2\u010f\u0110\5*\26\2"+
		"\u0110\u0111\b\25\1\2\u0111)\3\2\2\2\u0112\u0113\7\25\2\2\u0113\u0125"+
		"\b\26\1\2\u0114\u0115\7\26\2\2\u0115\u0125\b\26\1\2\u0116\u0117\7\27\2"+
		"\2\u0117\u0125\b\26\1\2\u0118\u0119\7\30\2\2\u0119\u0125\b\26\1\2\u011a"+
		"\u011b\7\34\2\2\u011b\u0125\b\26\1\2\u011c\u011d\7\33\2\2\u011d\u0125"+
		"\b\26\1\2\u011e\u011f\7\32\2\2\u011f\u0125\b\26\1\2\u0120\u0121\7\31\2"+
		"\2\u0121\u0125\b\26\1\2\u0122\u0123\7\3\2\2\u0123\u0125\b\26\1\2\u0124"+
		"\u0112\3\2\2\2\u0124\u0114\3\2\2\2\u0124\u0116\3\2\2\2\u0124\u0118\3\2"+
		"\2\2\u0124\u011a\3\2\2\2\u0124\u011c\3\2\2\2\u0124\u011e\3\2\2\2\u0124"+
		"\u0120\3\2\2\2\u0124\u0122\3\2\2\2\u0125+\3\2\2\2\25\61EUgx\u0082\u008d"+
		"\u0096\u00a4\u00b0\u00b2\u00c3\u00c5\u00ce\u00e7\u00f2\u00f5\u010b\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}