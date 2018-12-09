// Generated from C:\Users\elmr\Documents\GITHUB\lfa_language\PostHtml\Grammar\Calc.g4 by ANTLR 4.1
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
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, OR=2, AND=3, NOT=4, IF=5, THEN=6, ELSE=7, WHILE=8, DO=9, DRAWID=10, 
		IDENT=11, GETS=12, PLUS=13, MINUS=14, TIMES=15, DIVIDE=16, MOD=17, EXP=18, 
		LPAR=19, RPAR=20, LBRC=21, RBRC=22, COMMA=23, SEMI=24, EQU=25, NEQ=26, 
		LT=27, LEQ=28, GT=29, GEQ=30, SQUARE=31, RECTANGLE=32, OVAL=33, STAR=34, 
		PENTAGON=35, HEXAGON=36, OCTAGON=37, HEART=38, CIRCLE=39, TRIANGLE=40, 
		TRAPEZIO=41, RED=42, BLUE=43, BLACK=44, PURPLE=45, WHITE=46, GREEN=47, 
		PINK=48, YELLOW=49, WS=50, COMMENT=51;
	public static final String[] tokenNames = {
		"<INVALID>", "NUMERO", "'or'", "'and'", "'not'", "'if'", "'then'", "'else'", 
		"'while'", "'do'", "DRAWID", "IDENT", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'('", "')'", "'{'", "'}'", "','", "';'", "'=='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "'square'", "'rectangle'", "'oval'", "'star'", 
		"'pentagon'", "'hexagon'", "'octagon'", "'heart'", "'CIRCLE'", "'triangle'", 
		"'trapezio'", "'red'", "'blue'", "'black'", "'purple'", "'white'", "'green'", 
		"'pink'", "'yellow'", "WS", "COMMENT"
	};
	public static final int
		RULE_inicio = 0, RULE_statement = 1, RULE_ifExpr = 2, RULE_whileExpr = 3, 
		RULE_block = 4, RULE_sttmtSeq = 5, RULE_expr = 6, RULE_assign = 7, RULE_bexpr = 8, 
		RULE_disj = 9, RULE_conj = 10, RULE_relOp = 11, RULE_aexpr = 12, RULE_parcela = 13, 
		RULE_fator = 14, RULE_termo = 15, RULE_argList = 16, RULE_drawassing = 17, 
		RULE_draw = 18, RULE_design = 19, RULE_shape = 20, RULE_property = 21, 
		RULE_color = 22;
	public static final String[] ruleNames = {
		"inicio", "statement", "ifExpr", "whileExpr", "block", "sttmtSeq", "expr", 
		"assign", "bexpr", "disj", "conj", "relOp", "aexpr", "parcela", "fator", 
		"termo", "argList", "drawassing", "draw", "design", "shape", "property", 
		"color"
	};

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicioContext extends ParserRuleContext {
		public List<Expr> result;
		public StatementContext s;
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << DRAWID) | (1L << IDENT) | (1L << MINUS) | (1L << LPAR) | (1L << LBRC) | (1L << SQUARE) | (1L << RECTANGLE) | (1L << OVAL) | (1L << STAR) | (1L << PENTAGON) | (1L << HEXAGON) | (1L << OCTAGON) | (1L << HEART) | (1L << CIRCLE) | (1L << TRIANGLE) | (1L << TRAPEZIO))) != 0)) {
				{
				{
				setState(46); ((InicioContext)_localctx).s = statement();
				_localctx.result.add(((InicioContext)_localctx).s.result);
				}
				}
				setState(53);
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
		public DrawassingContext sa1;
		public DrawContext d2;
		public ExprContext e;
		public IfExprContext i;
		public WhileExprContext w;
		public BlockContext b;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CalcParser.SEMI, 0); }
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public DrawassingContext drawassing() {
			return getRuleContext(DrawassingContext.class,0);
		}
		public DrawContext draw() {
			return getRuleContext(DrawContext.class,0);
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
			setState(73);
			switch (_input.LA(1)) {
			case DRAWID:
				enterOuterAlt(_localctx, 1);
				{
				setState(54); ((StatementContext)_localctx).sa1 = drawassing();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).sa1.result;
				}
				break;
			case SQUARE:
			case RECTANGLE:
			case OVAL:
			case STAR:
			case PENTAGON:
			case HEXAGON:
			case OCTAGON:
			case HEART:
			case CIRCLE:
			case TRIANGLE:
			case TRAPEZIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); ((StatementContext)_localctx).d2 = draw();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).d2.result;
				}
				break;
			case NUMERO:
			case NOT:
			case IDENT:
			case MINUS:
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(60); ((StatementContext)_localctx).e = expr();
				setState(61); match(SEMI);
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).e.result;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(64); ((StatementContext)_localctx).i = ifExpr();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).i.result;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(67); ((StatementContext)_localctx).w = whileExpr();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).w.result;
				}
				break;
			case LBRC:
				enterOuterAlt(_localctx, 6);
				{
				setState(70); ((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).b.result;
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

	public static class IfExprContext extends ParserRuleContext {
		public Expr result;
		public BexprContext c;
		public StatementContext t;
		public StatementContext e;
		public TerminalNode ELSE() { return getToken(CalcParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CalcParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CalcParser.THEN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
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
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); match(IF);
				setState(76); ((IfExprContext)_localctx).c = bexpr();
				setState(77); match(THEN);
				setState(78); ((IfExprContext)_localctx).t = statement();
				((IfExprContext)_localctx).result =  mkIf(((IfExprContext)_localctx).c.result, ((IfExprContext)_localctx).t.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); match(IF);
				setState(82); ((IfExprContext)_localctx).c = bexpr();
				setState(83); match(THEN);
				setState(84); ((IfExprContext)_localctx).t = statement();
				setState(85); match(ELSE);
				setState(86); ((IfExprContext)_localctx).e = statement();
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
		public TerminalNode DO() { return getToken(CalcParser.DO, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CalcParser.WHILE, 0); }
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
			setState(91); match(WHILE);
			setState(92); ((WhileExprContext)_localctx).c = bexpr();
			setState(93); match(DO);
			setState(94); ((WhileExprContext)_localctx).d = statement();
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
			setState(97); match(LBRC);
			setState(98); ((BlockContext)_localctx).st = sttmtSeq();
			setState(99); match(RBRC);
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
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << DRAWID) | (1L << IDENT) | (1L << MINUS) | (1L << LPAR) | (1L << LBRC) | (1L << SQUARE) | (1L << RECTANGLE) | (1L << OVAL) | (1L << STAR) | (1L << PENTAGON) | (1L << HEXAGON) | (1L << OCTAGON) | (1L << HEART) | (1L << CIRCLE) | (1L << TRIANGLE) | (1L << TRAPEZIO))) != 0)) {
				{
				{
				setState(102); ((SttmtSeqContext)_localctx).s1 = statement();
				_localctx.sttmts.add(((SttmtSeqContext)_localctx).s1.result);
				}
				}
				setState(109);
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
		public AssignContext a;
		public BexprContext e;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
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
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); ((ExprContext)_localctx).a = assign();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).a.result;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); ((ExprContext)_localctx).e = bexpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).e.result;
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
		public Expr result;
		public Token IDENT;
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode GETS() { return getToken(CalcParser.GETS, 0); }
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(118); ((AssignContext)_localctx).IDENT = match(IDENT);
			setState(119); match(GETS);
			setState(120); ((AssignContext)_localctx).e = expr();
			((AssignContext)_localctx).result =  mkAssign((((AssignContext)_localctx).IDENT!=null?((AssignContext)_localctx).IDENT.getText():null), ((AssignContext)_localctx).e.result);
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
		public List<TerminalNode> OR() { return getTokens(CalcParser.OR); }
		public DisjContext disj(int i) {
			return getRuleContext(DisjContext.class,i);
		}
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
			setState(123); ((BexprContext)_localctx).d1 = disj();
			((BexprContext)_localctx).result =  ((BexprContext)_localctx).d1.result;
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(125); match(OR);
				setState(126); ((BexprContext)_localctx).d2 = disj();
				((BexprContext)_localctx).result =  mkComposite(Op.OR, _localctx.result, ((BexprContext)_localctx).d2.result);
				}
				}
				setState(133);
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
		public TerminalNode AND(int i) {
			return getToken(CalcParser.AND, i);
		}
		public ConjContext conj(int i) {
			return getRuleContext(ConjContext.class,i);
		}
		public List<ConjContext> conj() {
			return getRuleContexts(ConjContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(CalcParser.AND); }
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
			setState(134); ((DisjContext)_localctx).c1 = conj();
			((DisjContext)_localctx).result =  ((DisjContext)_localctx).c1.result;
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(136); match(AND);
				setState(137); ((DisjContext)_localctx).c2 = conj();
				((DisjContext)_localctx).result =  mkComposite(Op.AND, _localctx.result, ((DisjContext)_localctx).c2.result);
				}
				}
				setState(144);
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
			setState(145); ((ConjContext)_localctx).a1 = aexpr();
			((ConjContext)_localctx).result =  ((ConjContext)_localctx).a1.result;
			setState(151);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQU) | (1L << NEQ) | (1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ))) != 0)) {
				{
				setState(147); ((ConjContext)_localctx).o = relOp();
				setState(148); ((ConjContext)_localctx).a2 = aexpr();
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
		public TerminalNode GEQ() { return getToken(CalcParser.GEQ, 0); }
		public TerminalNode NEQ() { return getToken(CalcParser.NEQ, 0); }
		public TerminalNode LEQ() { return getToken(CalcParser.LEQ, 0); }
		public TerminalNode LT() { return getToken(CalcParser.LT, 0); }
		public TerminalNode GT() { return getToken(CalcParser.GT, 0); }
		public TerminalNode EQU() { return getToken(CalcParser.EQU, 0); }
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
			setState(165);
			switch (_input.LA(1)) {
			case EQU:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(EQU);
				((RelOpContext)_localctx).result =  Op.EQU;
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(NEQ);
				((RelOpContext)_localctx).result =  Op.NEQ;
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); match(LT);
				((RelOpContext)_localctx).result =  Op.LT;
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(159); match(LEQ);
				((RelOpContext)_localctx).result =  Op.LEQ;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 5);
				{
				setState(161); match(GT);
				((RelOpContext)_localctx).result =  Op.GT;
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(163); match(GEQ);
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
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public TerminalNode MINUS(int i) {
			return getToken(CalcParser.MINUS, i);
		}
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public List<TerminalNode> PLUS() { return getTokens(CalcParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(CalcParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CalcParser.PLUS, i);
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
			setState(167); ((AexprContext)_localctx).p1 = parcela();
			((AexprContext)_localctx).result =  ((AexprContext)_localctx).p1.result;
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(177);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(169); match(PLUS);
					setState(170); ((AexprContext)_localctx).p2 = parcela();
					((AexprContext)_localctx).result =  mkComposite(Op.PLUS, _localctx.result, ((AexprContext)_localctx).p2.result);
					}
					break;
				case MINUS:
					{
					setState(173); match(MINUS);
					setState(174); ((AexprContext)_localctx).p2 = parcela();
					((AexprContext)_localctx).result =  mkComposite(Op.MINUS, _localctx.result, ((AexprContext)_localctx).p2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(181);
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
		public TerminalNode DIVIDE(int i) {
			return getToken(CalcParser.DIVIDE, i);
		}
		public TerminalNode TIMES(int i) {
			return getToken(CalcParser.TIMES, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(CalcParser.TIMES); }
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CalcParser.DIVIDE); }
		public List<TerminalNode> MOD() { return getTokens(CalcParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(CalcParser.MOD, i);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
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
			setState(182); ((ParcelaContext)_localctx).f1 = fator();
			((ParcelaContext)_localctx).result =  ((ParcelaContext)_localctx).f1.result;
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				setState(196);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(184); match(TIMES);
					setState(185); ((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.TIMES, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				case DIVIDE:
					{
					setState(188); match(DIVIDE);
					setState(189); ((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.DIVIDE, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				case MOD:
					{
					setState(192); match(MOD);
					setState(193); ((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.MOD, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(200);
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
		public TerminalNode EXP() { return getToken(CalcParser.EXP, 0); }
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
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
			setState(201); ((FatorContext)_localctx).t1 = termo();
			((FatorContext)_localctx).result =  ((FatorContext)_localctx).t1.result;
			setState(207);
			_la = _input.LA(1);
			if (_la==EXP) {
				{
				setState(203); match(EXP);
				setState(204); ((FatorContext)_localctx).t2 = termo();
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
		public TerminalNode NOT() { return getToken(CalcParser.NOT, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(CalcParser.NUMERO, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalcParser.MINUS, 0); }
		public TerminalNode LPAR() { return getToken(CalcParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CalcParser.RPAR, 0); }
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
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
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(MINUS);
				setState(210); ((TermoContext)_localctx).t1 = termo();
				((TermoContext)_localctx).result =  mkComposite(Op.UMINUS, ((TermoContext)_localctx).t1.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); match(NOT);
				setState(214); ((TermoContext)_localctx).t1 = termo();
				((TermoContext)_localctx).result =  mkComposite(Op.NOT, ((TermoContext)_localctx).t1.result);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217); match(LPAR);
				setState(218); ((TermoContext)_localctx).e1 = expr();
				setState(219); match(RPAR);
				((TermoContext)_localctx).result =  ((TermoContext)_localctx).e1.result;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222); ((TermoContext)_localctx).NUMERO = match(NUMERO);
				((TermoContext)_localctx).result =  mkNumeric(Double.parseDouble((((TermoContext)_localctx).NUMERO!=null?((TermoContext)_localctx).NUMERO.getText():null)));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224); ((TermoContext)_localctx).IDENT = match(IDENT);
				((TermoContext)_localctx).result =  mkVar((((TermoContext)_localctx).IDENT!=null?((TermoContext)_localctx).IDENT.getText():null));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226); ((TermoContext)_localctx).IDENT = match(IDENT);
				setState(227); match(LPAR);
				setState(228); ((TermoContext)_localctx).a = argList();
				setState(229); match(RPAR);
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
			setState(246);
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
				setState(235); ((ArgListContext)_localctx).e1 = expr();
				_localctx.args.add(((ArgListContext)_localctx).e1.result);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(237); match(COMMA);
					setState(238); ((ArgListContext)_localctx).e2 = expr();
					_localctx.args.add(((ArgListContext)_localctx).e2.result);
					}
					}
					setState(245);
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

	public static class DrawassingContext extends ParserRuleContext {
		public Sketch result;
		public Token IDENT;
		public DrawContext d1;
		public TerminalNode DRAWID() { return getToken(CalcParser.DRAWID, 0); }
		public TerminalNode GETS() { return getToken(CalcParser.GETS, 0); }
		public DrawContext draw() {
			return getRuleContext(DrawContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public DrawassingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawassing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterDrawassing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitDrawassing(this);
		}
	}

	public final DrawassingContext drawassing() throws RecognitionException {
		DrawassingContext _localctx = new DrawassingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_drawassing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(DRAWID);
			setState(249); ((DrawassingContext)_localctx).IDENT = match(IDENT);
			setState(250); match(GETS);
			setState(251); ((DrawassingContext)_localctx).d1 = draw();
			((DrawassingContext)_localctx).result =  mkDrawAssing((((DrawassingContext)_localctx).IDENT!=null?((DrawassingContext)_localctx).IDENT.getText():null),((DrawassingContext)_localctx).d1.result);
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

	public static class DrawContext extends ParserRuleContext {
		public Sketch result;
		public DesignContext dd1;
		public DesignContext design() {
			return getRuleContext(DesignContext.class,0);
		}
		public DrawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterDraw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitDraw(this);
		}
	}

	public final DrawContext draw() throws RecognitionException {
		DrawContext _localctx = new DrawContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_draw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); ((DrawContext)_localctx).dd1 = design();
			((DrawContext)_localctx).result =  ((DrawContext)_localctx).dd1.result;
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
		enterRule(_localctx, 38, RULE_design);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); ((DesignContext)_localctx).ds1 = shape();
			setState(258); ((DesignContext)_localctx).dp1 = property();
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
		public Token STAR;
		public Token PENTAGON;
		public Token HEXAGON;
		public Token OCTAGON;
		public Token HEART;
		public Token CIRCLE;
		public Token TRIANGLE;
		public Token TRAPEZIO;
		public TerminalNode PENTAGON() { return getToken(CalcParser.PENTAGON, 0); }
		public TerminalNode RECTANGLE() { return getToken(CalcParser.RECTANGLE, 0); }
		public TerminalNode OCTAGON() { return getToken(CalcParser.OCTAGON, 0); }
		public TerminalNode TRIANGLE() { return getToken(CalcParser.TRIANGLE, 0); }
		public TerminalNode TRAPEZIO() { return getToken(CalcParser.TRAPEZIO, 0); }
		public TerminalNode HEART() { return getToken(CalcParser.HEART, 0); }
		public TerminalNode SQUARE() { return getToken(CalcParser.SQUARE, 0); }
		public TerminalNode STAR() { return getToken(CalcParser.STAR, 0); }
		public TerminalNode HEXAGON() { return getToken(CalcParser.HEXAGON, 0); }
		public TerminalNode OVAL() { return getToken(CalcParser.OVAL, 0); }
		public TerminalNode CIRCLE() { return getToken(CalcParser.CIRCLE, 0); }
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
		enterRule(_localctx, 40, RULE_shape);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case SQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); ((ShapeContext)_localctx).SQUARE = match(SQUARE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).SQUARE!=null?((ShapeContext)_localctx).SQUARE.getText():null));
				}
				break;
			case RECTANGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); ((ShapeContext)_localctx).RECTANGLE = match(RECTANGLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).RECTANGLE!=null?((ShapeContext)_localctx).RECTANGLE.getText():null));
				}
				break;
			case OVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(265); ((ShapeContext)_localctx).OVAL = match(OVAL);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).OVAL!=null?((ShapeContext)_localctx).OVAL.getText():null));
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(267); ((ShapeContext)_localctx).STAR = match(STAR);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).STAR!=null?((ShapeContext)_localctx).STAR.getText():null));
				}
				break;
			case PENTAGON:
				enterOuterAlt(_localctx, 5);
				{
				setState(269); ((ShapeContext)_localctx).PENTAGON = match(PENTAGON);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).PENTAGON!=null?((ShapeContext)_localctx).PENTAGON.getText():null));
				}
				break;
			case HEXAGON:
				enterOuterAlt(_localctx, 6);
				{
				setState(271); ((ShapeContext)_localctx).HEXAGON = match(HEXAGON);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).HEXAGON!=null?((ShapeContext)_localctx).HEXAGON.getText():null));
				}
				break;
			case OCTAGON:
				enterOuterAlt(_localctx, 7);
				{
				setState(273); ((ShapeContext)_localctx).OCTAGON = match(OCTAGON);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).OCTAGON!=null?((ShapeContext)_localctx).OCTAGON.getText():null));
				}
				break;
			case HEART:
				enterOuterAlt(_localctx, 8);
				{
				setState(275); ((ShapeContext)_localctx).HEART = match(HEART);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).HEART!=null?((ShapeContext)_localctx).HEART.getText():null));
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(277); ((ShapeContext)_localctx).CIRCLE = match(CIRCLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).CIRCLE!=null?((ShapeContext)_localctx).CIRCLE.getText():null));
				}
				break;
			case TRIANGLE:
				enterOuterAlt(_localctx, 10);
				{
				setState(279); ((ShapeContext)_localctx).TRIANGLE = match(TRIANGLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).TRIANGLE!=null?((ShapeContext)_localctx).TRIANGLE.getText():null));
				}
				break;
			case TRAPEZIO:
				enterOuterAlt(_localctx, 11);
				{
				setState(281); ((ShapeContext)_localctx).TRAPEZIO = match(TRAPEZIO);
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
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<TerminalNode> NUMERO() { return getTokens(CalcParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(CalcParser.NUMERO, i);
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
		enterRule(_localctx, 42, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); ((PropertyContext)_localctx).height = match(NUMERO);
			setState(286); ((PropertyContext)_localctx).width = match(NUMERO);
			setState(287); ((PropertyContext)_localctx).pColor = color();
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
		public TerminalNode BLACK() { return getToken(CalcParser.BLACK, 0); }
		public TerminalNode WHITE() { return getToken(CalcParser.WHITE, 0); }
		public TerminalNode RED() { return getToken(CalcParser.RED, 0); }
		public TerminalNode BLUE() { return getToken(CalcParser.BLUE, 0); }
		public TerminalNode YELLOW() { return getToken(CalcParser.YELLOW, 0); }
		public TerminalNode PINK() { return getToken(CalcParser.PINK, 0); }
		public TerminalNode GREEN() { return getToken(CalcParser.GREEN, 0); }
		public TerminalNode PURPLE() { return getToken(CalcParser.PURPLE, 0); }
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
		enterRule(_localctx, 44, RULE_color);
		try {
			setState(306);
			switch (_input.LA(1)) {
			case RED:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); ((ColorContext)_localctx).RED = match(RED);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).RED!=null?((ColorContext)_localctx).RED.getText():null));
				}
				break;
			case BLUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); ((ColorContext)_localctx).BLUE = match(BLUE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).BLUE!=null?((ColorContext)_localctx).BLUE.getText():null));
				}
				break;
			case BLACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(294); ((ColorContext)_localctx).BLACK = match(BLACK);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).BLACK!=null?((ColorContext)_localctx).BLACK.getText():null));
				}
				break;
			case PURPLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(296); ((ColorContext)_localctx).PURPLE = match(PURPLE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).PURPLE!=null?((ColorContext)_localctx).PURPLE.getText():null));
				}
				break;
			case YELLOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(298); ((ColorContext)_localctx).YELLOW = match(YELLOW);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).YELLOW!=null?((ColorContext)_localctx).YELLOW.getText():null));
				}
				break;
			case PINK:
				enterOuterAlt(_localctx, 6);
				{
				setState(300); ((ColorContext)_localctx).PINK = match(PINK);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).PINK!=null?((ColorContext)_localctx).PINK.getText():null));
				}
				break;
			case GREEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(302); ((ColorContext)_localctx).GREEN = match(GREEN);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).GREEN!=null?((ColorContext)_localctx).GREEN.getText():null));
				}
				break;
			case WHITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(304); ((ColorContext)_localctx).WHITE = match(WHITE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).WHITE!=null?((ColorContext)_localctx).WHITE.getText():null));
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\65\u0137\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\\\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bw\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0084"+
		"\n\n\f\n\16\n\u0087\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008f\n\13"+
		"\f\13\16\13\u0092\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009a\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b4\n\16\f\16\16\16\u00b7\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u00c7\n\17\f\17\16\17\u00ca\13\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00d2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00eb\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f4\n\22\f\22\16"+
		"\22\u00f7\13\22\5\22\u00f9\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u011e\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0135\n\30\3\30\2\31"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\u014e\2\65\3\2\2"+
		"\2\4K\3\2\2\2\6[\3\2\2\2\b]\3\2\2\2\nc\3\2\2\2\fm\3\2\2\2\16v\3\2\2\2"+
		"\20x\3\2\2\2\22}\3\2\2\2\24\u0088\3\2\2\2\26\u0093\3\2\2\2\30\u00a7\3"+
		"\2\2\2\32\u00a9\3\2\2\2\34\u00b8\3\2\2\2\36\u00cb\3\2\2\2 \u00ea\3\2\2"+
		"\2\"\u00f8\3\2\2\2$\u00fa\3\2\2\2&\u0100\3\2\2\2(\u0103\3\2\2\2*\u011d"+
		"\3\2\2\2,\u011f\3\2\2\2.\u0134\3\2\2\2\60\61\5\4\3\2\61\62\b\2\1\2\62"+
		"\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\3\3\2\2\2\67\65\3\2\2\289\5$\23\29:\b\3\1\2:L\3\2\2\2;<\5&\24\2<=\b\3"+
		"\1\2=L\3\2\2\2>?\5\16\b\2?@\7\32\2\2@A\b\3\1\2AL\3\2\2\2BC\5\6\4\2CD\b"+
		"\3\1\2DL\3\2\2\2EF\5\b\5\2FG\b\3\1\2GL\3\2\2\2HI\5\n\6\2IJ\b\3\1\2JL\3"+
		"\2\2\2K8\3\2\2\2K;\3\2\2\2K>\3\2\2\2KB\3\2\2\2KE\3\2\2\2KH\3\2\2\2L\5"+
		"\3\2\2\2MN\7\7\2\2NO\5\22\n\2OP\7\b\2\2PQ\5\4\3\2QR\b\4\1\2R\\\3\2\2\2"+
		"ST\7\7\2\2TU\5\22\n\2UV\7\b\2\2VW\5\4\3\2WX\7\t\2\2XY\5\4\3\2YZ\b\4\1"+
		"\2Z\\\3\2\2\2[M\3\2\2\2[S\3\2\2\2\\\7\3\2\2\2]^\7\n\2\2^_\5\22\n\2_`\7"+
		"\13\2\2`a\5\4\3\2ab\b\5\1\2b\t\3\2\2\2cd\7\27\2\2de\5\f\7\2ef\7\30\2\2"+
		"fg\b\6\1\2g\13\3\2\2\2hi\5\4\3\2ij\b\7\1\2jl\3\2\2\2kh\3\2\2\2lo\3\2\2"+
		"\2mk\3\2\2\2mn\3\2\2\2n\r\3\2\2\2om\3\2\2\2pq\5\20\t\2qr\b\b\1\2rw\3\2"+
		"\2\2st\5\22\n\2tu\b\b\1\2uw\3\2\2\2vp\3\2\2\2vs\3\2\2\2w\17\3\2\2\2xy"+
		"\7\r\2\2yz\7\16\2\2z{\5\16\b\2{|\b\t\1\2|\21\3\2\2\2}~\5\24\13\2~\u0085"+
		"\b\n\1\2\177\u0080\7\4\2\2\u0080\u0081\5\24\13\2\u0081\u0082\b\n\1\2\u0082"+
		"\u0084\3\2\2\2\u0083\177\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\23\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089"+
		"\5\26\f\2\u0089\u0090\b\13\1\2\u008a\u008b\7\5\2\2\u008b\u008c\5\26\f"+
		"\2\u008c\u008d\b\13\1\2\u008d\u008f\3\2\2\2\u008e\u008a\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\25\3\2\2"+
		"\2\u0092\u0090\3\2\2\2\u0093\u0094\5\32\16\2\u0094\u0099\b\f\1\2\u0095"+
		"\u0096\5\30\r\2\u0096\u0097\5\32\16\2\u0097\u0098\b\f\1\2\u0098\u009a"+
		"\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a\27\3\2\2\2\u009b"+
		"\u009c\7\33\2\2\u009c\u00a8\b\r\1\2\u009d\u009e\7\34\2\2\u009e\u00a8\b"+
		"\r\1\2\u009f\u00a0\7\35\2\2\u00a0\u00a8\b\r\1\2\u00a1\u00a2\7\36\2\2\u00a2"+
		"\u00a8\b\r\1\2\u00a3\u00a4\7\37\2\2\u00a4\u00a8\b\r\1\2\u00a5\u00a6\7"+
		" \2\2\u00a6\u00a8\b\r\1\2\u00a7\u009b\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7"+
		"\u009f\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00b5\b\16\1\2\u00ab"+
		"\u00ac\7\17\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00ae\b\16\1\2\u00ae\u00b4"+
		"\3\2\2\2\u00af\u00b0\7\20\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00b2\b\16\1"+
		"\2\u00b2\u00b4\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\33\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\5\36\20\2\u00b9\u00c8\b\17\1\2\u00ba\u00bb"+
		"\7\21\2\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd\b\17\1\2\u00bd\u00c7\3\2\2"+
		"\2\u00be\u00bf\7\22\2\2\u00bf\u00c0\5\36\20\2\u00c0\u00c1\b\17\1\2\u00c1"+
		"\u00c7\3\2\2\2\u00c2\u00c3\7\23\2\2\u00c3\u00c4\5\36\20\2\u00c4\u00c5"+
		"\b\17\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00be\3\2\2\2"+
		"\u00c6\u00c2\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\35\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5 \21\2\u00cc"+
		"\u00d1\b\20\1\2\u00cd\u00ce\7\24\2\2\u00ce\u00cf\5 \21\2\u00cf\u00d0\b"+
		"\20\1\2\u00d0\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\37\3\2\2\2\u00d3\u00d4\7\20\2\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\b\21"+
		"\1\2\u00d6\u00eb\3\2\2\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9\5 \21\2\u00d9"+
		"\u00da\b\21\1\2\u00da\u00eb\3\2\2\2\u00db\u00dc\7\25\2\2\u00dc\u00dd\5"+
		"\16\b\2\u00dd\u00de\7\26\2\2\u00de\u00df\b\21\1\2\u00df\u00eb\3\2\2\2"+
		"\u00e0\u00e1\7\3\2\2\u00e1\u00eb\b\21\1\2\u00e2\u00e3\7\r\2\2\u00e3\u00eb"+
		"\b\21\1\2\u00e4\u00e5\7\r\2\2\u00e5\u00e6\7\25\2\2\u00e6\u00e7\5\"\22"+
		"\2\u00e7\u00e8\7\26\2\2\u00e8\u00e9\b\21\1\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00d3\3\2\2\2\u00ea\u00d7\3\2\2\2\u00ea\u00db\3\2\2\2\u00ea\u00e0\3\2"+
		"\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e4\3\2\2\2\u00eb!\3\2\2\2\u00ec\u00f9"+
		"\3\2\2\2\u00ed\u00ee\5\16\b\2\u00ee\u00f5\b\22\1\2\u00ef\u00f0\7\31\2"+
		"\2\u00f0\u00f1\5\16\b\2\u00f1\u00f2\b\22\1\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00ef\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8"+
		"\u00ed\3\2\2\2\u00f9#\3\2\2\2\u00fa\u00fb\7\f\2\2\u00fb\u00fc\7\r\2\2"+
		"\u00fc\u00fd\7\16\2\2\u00fd\u00fe\5&\24\2\u00fe\u00ff\b\23\1\2\u00ff%"+
		"\3\2\2\2\u0100\u0101\5(\25\2\u0101\u0102\b\24\1\2\u0102\'\3\2\2\2\u0103"+
		"\u0104\5*\26\2\u0104\u0105\5,\27\2\u0105\u0106\b\25\1\2\u0106)\3\2\2\2"+
		"\u0107\u0108\7!\2\2\u0108\u011e\b\26\1\2\u0109\u010a\7\"\2\2\u010a\u011e"+
		"\b\26\1\2\u010b\u010c\7#\2\2\u010c\u011e\b\26\1\2\u010d\u010e\7$\2\2\u010e"+
		"\u011e\b\26\1\2\u010f\u0110\7%\2\2\u0110\u011e\b\26\1\2\u0111\u0112\7"+
		"&\2\2\u0112\u011e\b\26\1\2\u0113\u0114\7\'\2\2\u0114\u011e\b\26\1\2\u0115"+
		"\u0116\7(\2\2\u0116\u011e\b\26\1\2\u0117\u0118\7)\2\2\u0118\u011e\b\26"+
		"\1\2\u0119\u011a\7*\2\2\u011a\u011e\b\26\1\2\u011b\u011c\7+\2\2\u011c"+
		"\u011e\b\26\1\2\u011d\u0107\3\2\2\2\u011d\u0109\3\2\2\2\u011d\u010b\3"+
		"\2\2\2\u011d\u010d\3\2\2\2\u011d\u010f\3\2\2\2\u011d\u0111\3\2\2\2\u011d"+
		"\u0113\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u0119\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e+\3\2\2\2\u011f\u0120\7\3\2\2\u0120\u0121"+
		"\7\3\2\2\u0121\u0122\5.\30\2\u0122\u0123\b\27\1\2\u0123-\3\2\2\2\u0124"+
		"\u0125\7,\2\2\u0125\u0135\b\30\1\2\u0126\u0127\7-\2\2\u0127\u0135\b\30"+
		"\1\2\u0128\u0129\7.\2\2\u0129\u0135\b\30\1\2\u012a\u012b\7/\2\2\u012b"+
		"\u0135\b\30\1\2\u012c\u012d\7\63\2\2\u012d\u0135\b\30\1\2\u012e\u012f"+
		"\7\62\2\2\u012f\u0135\b\30\1\2\u0130\u0131\7\61\2\2\u0131\u0135\b\30\1"+
		"\2\u0132\u0133\7\60\2\2\u0133\u0135\b\30\1\2\u0134\u0124\3\2\2\2\u0134"+
		"\u0126\3\2\2\2\u0134\u0128\3\2\2\2\u0134\u012a\3\2\2\2\u0134\u012c\3\2"+
		"\2\2\u0134\u012e\3\2\2\2\u0134\u0130\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"/\3\2\2\2\25\65K[mv\u0085\u0090\u0099\u00a7\u00b3\u00b5\u00c6\u00c8\u00d1"+
		"\u00ea\u00f5\u00f8\u011d\u0134";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}