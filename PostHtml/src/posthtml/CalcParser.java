// Generated from C:\Users\joel-\Desktop\lfa_language\PostHtml\Grammar\Calc.g4 by ANTLR 4.1
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
		CUSTOM=1, NUMERO=2, OR=3, AND=4, NOT=5, IF=6, THEN=7, ELSE=8, WHILE=9, 
		DO=10, RETURN=11, SQUARE=12, RECTANGLE=13, OVAL=14, PENTAGON=15, OCTAGON=16, 
		CIRCLE=17, TRIANGLE=18, TRAPEZIO=19, RED=20, BLUE=21, BLACK=22, PURPLE=23, 
		WHITE=24, GREEN=25, PINK=26, YELLOW=27, DRAWID=28, KEYCREATEF=29, IDENT=30, 
		HEX_NUM=31, HASH=32, GETS=33, PLUS=34, MINUS=35, TIMES=36, DIVIDE=37, 
		MOD=38, EXP=39, LPAR=40, RPAR=41, LBRC=42, RBRC=43, COMMA=44, SEMI=45, 
		EQU=46, NEQ=47, LT=48, LEQ=49, GT=50, GEQ=51, WS=52, COMMENT=53;
	public static final String[] tokenNames = {
		"<INVALID>", "CUSTOM", "NUMERO", "'or'", "'and'", "'not'", "'if'", "'then'", 
		"'else'", "'while'", "'do'", "'return'", "'square'", "'rectangle'", "'oval'", 
		"'pentagon'", "'octagon'", "'circle'", "'triangle'", "'trapezio'", "'red'", 
		"'blue'", "'black'", "'purple'", "'white'", "'green'", "'pink'", "'yellow'", 
		"'skt'", "'def'", "IDENT", "HEX_NUM", "'#'", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'^'", "'('", "')'", "'{'", "'}'", "','", "';'", "'=='", 
		"'!='", "'<'", "'<='", "'>'", "'>='", "WS", "COMMENT"
	};
	public static final int
		RULE_inicio = 0, RULE_statement = 1, RULE_createFunc = 2, RULE_ifExpr = 3, 
		RULE_whileExpr = 4, RULE_block = 5, RULE_sttmtSeq = 6, RULE_expr = 7, 
		RULE_assign = 8, RULE_bexpr = 9, RULE_disj = 10, RULE_conj = 11, RULE_relOp = 12, 
		RULE_aexpr = 13, RULE_parcela = 14, RULE_fator = 15, RULE_termo = 16, 
		RULE_argList = 17, RULE_design = 18, RULE_shape = 19, RULE_property = 20, 
		RULE_color = 21;
	public static final String[] ruleNames = {
		"inicio", "statement", "createFunc", "ifExpr", "whileExpr", "block", "sttmtSeq", 
		"expr", "assign", "bexpr", "disj", "conj", "relOp", "aexpr", "parcela", 
		"fator", "termo", "argList", "design", "shape", "property", "color"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << DRAWID) | (1L << KEYCREATEF) | (1L << IDENT) | (1L << MINUS) | (1L << LPAR) | (1L << LBRC))) != 0)) {
				{
				{
				setState(44); ((InicioContext)_localctx).s = statement();
				_localctx.result.add(((InicioContext)_localctx).s.result);
				}
				}
				setState(51);
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
		public CreateFuncContext f;
		public IfExprContext i;
		public WhileExprContext w;
		public BlockContext b;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CreateFuncContext createFunc() {
			return getRuleContext(CreateFuncContext.class,0);
		}
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CalcParser.SEMI, 0); }
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
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
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); ((StatementContext)_localctx).e = expr();
				setState(53); match(SEMI);
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).e.result;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); ((StatementContext)_localctx).a = assign();
				setState(57); match(SEMI);
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).a.result;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60); ((StatementContext)_localctx).f = createFunc();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).f.result;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63); ((StatementContext)_localctx).i = ifExpr();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).i.result;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66); ((StatementContext)_localctx).w = whileExpr();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).w.result;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69); ((StatementContext)_localctx).b = block();
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

	public static class CreateFuncContext extends ParserRuleContext {
		public Expr result;
		public Token IDENT;
		public ArgListContext a;
		public BlockContext block;
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode KEYCREATEF() { return getToken(CalcParser.KEYCREATEF, 0); }
		public TerminalNode LPAR() { return getToken(CalcParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CalcParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public CreateFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterCreateFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitCreateFunc(this);
		}
	}

	public final CreateFuncContext createFunc() throws RecognitionException {
		CreateFuncContext _localctx = new CreateFuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(KEYCREATEF);
			setState(75); ((CreateFuncContext)_localctx).IDENT = match(IDENT);
			setState(76); match(LPAR);
			setState(77); ((CreateFuncContext)_localctx).a = argList();
			setState(78); match(RPAR);
			setState(79); ((CreateFuncContext)_localctx).block = block();
			((CreateFuncContext)_localctx).result =  mkFunction((((CreateFuncContext)_localctx).IDENT!=null?((CreateFuncContext)_localctx).IDENT.getText():null), ((CreateFuncContext)_localctx).block.result, ((CreateFuncContext)_localctx).a.args);
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
		enterRule(_localctx, 6, RULE_ifExpr);
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); match(IF);
				setState(83); ((IfExprContext)_localctx).c = bexpr();
				setState(84); match(THEN);
				setState(85); ((IfExprContext)_localctx).t = statement();
				((IfExprContext)_localctx).result =  mkIf(((IfExprContext)_localctx).c.result, ((IfExprContext)_localctx).t.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); match(IF);
				setState(89); ((IfExprContext)_localctx).c = bexpr();
				setState(90); match(THEN);
				setState(91); ((IfExprContext)_localctx).t = statement();
				setState(92); match(ELSE);
				setState(93); ((IfExprContext)_localctx).e = statement();
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
		enterRule(_localctx, 8, RULE_whileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(WHILE);
			setState(99); ((WhileExprContext)_localctx).c = bexpr();
			setState(100); match(DO);
			setState(101); ((WhileExprContext)_localctx).d = statement();
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
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(LBRC);
			setState(105); ((BlockContext)_localctx).st = sttmtSeq();
			setState(106); match(RBRC);
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
		enterRule(_localctx, 12, RULE_sttmtSeq);

		    ((SttmtSeqContext)_localctx).sttmts =  new LinkedList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << DRAWID) | (1L << KEYCREATEF) | (1L << IDENT) | (1L << MINUS) | (1L << LPAR) | (1L << LBRC))) != 0)) {
				{
				{
				setState(109); ((SttmtSeqContext)_localctx).s1 = statement();
				_localctx.sttmts.add(((SttmtSeqContext)_localctx).s1.result);
				}
				}
				setState(116);
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
		public BexprContext r;
		public TerminalNode RETURN() { return getToken(CalcParser.RETURN, 0); }
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
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case NUMERO:
			case NOT:
			case IDENT:
			case MINUS:
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); ((ExprContext)_localctx).e = bexpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).e.result;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(RETURN);
				setState(121); ((ExprContext)_localctx).r = bexpr();
				((ExprContext)_localctx).result =  mkReturn(((ExprContext)_localctx).r.result);
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

	public static class AssignContext extends ParserRuleContext {
		public Expr result;
		public Token IDENT;
		public ExprContext e;
		public DesignContext d1;
		public DesignContext design() {
			return getRuleContext(DesignContext.class,0);
		}
		public TerminalNode DRAWID() { return getToken(CalcParser.DRAWID, 0); }
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
		enterRule(_localctx, 16, RULE_assign);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); ((AssignContext)_localctx).IDENT = match(IDENT);
				setState(127); match(GETS);
				setState(128); ((AssignContext)_localctx).e = expr();
				((AssignContext)_localctx).result =  mkAssign((((AssignContext)_localctx).IDENT!=null?((AssignContext)_localctx).IDENT.getText():null), ((AssignContext)_localctx).e.result);
				}
				break;
			case DRAWID:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); match(DRAWID);
				setState(132); ((AssignContext)_localctx).IDENT = match(IDENT);
				setState(133); match(GETS);
				setState(134); ((AssignContext)_localctx).d1 = design();
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
		enterRule(_localctx, 18, RULE_bexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); ((BexprContext)_localctx).d1 = disj();
			((BexprContext)_localctx).result =  ((BexprContext)_localctx).d1.result;
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(141); match(OR);
				setState(142); ((BexprContext)_localctx).d2 = disj();
				((BexprContext)_localctx).result =  mkComposite(Op.OR, _localctx.result, ((BexprContext)_localctx).d2.result);
				}
				}
				setState(149);
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
		enterRule(_localctx, 20, RULE_disj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); ((DisjContext)_localctx).c1 = conj();
			((DisjContext)_localctx).result =  ((DisjContext)_localctx).c1.result;
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(152); match(AND);
				setState(153); ((DisjContext)_localctx).c2 = conj();
				((DisjContext)_localctx).result =  mkComposite(Op.AND, _localctx.result, ((DisjContext)_localctx).c2.result);
				}
				}
				setState(160);
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
		enterRule(_localctx, 22, RULE_conj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); ((ConjContext)_localctx).a1 = aexpr();
			((ConjContext)_localctx).result =  ((ConjContext)_localctx).a1.result;
			setState(167);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQU) | (1L << NEQ) | (1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ))) != 0)) {
				{
				setState(163); ((ConjContext)_localctx).o = relOp();
				setState(164); ((ConjContext)_localctx).a2 = aexpr();
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
		enterRule(_localctx, 24, RULE_relOp);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case EQU:
				enterOuterAlt(_localctx, 1);
				{
				setState(169); match(EQU);
				((RelOpContext)_localctx).result =  Op.EQU;
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); match(NEQ);
				((RelOpContext)_localctx).result =  Op.NEQ;
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(173); match(LT);
				((RelOpContext)_localctx).result =  Op.LT;
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(175); match(LEQ);
				((RelOpContext)_localctx).result =  Op.LEQ;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 5);
				{
				setState(177); match(GT);
				((RelOpContext)_localctx).result =  Op.GT;
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(179); match(GEQ);
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
		enterRule(_localctx, 26, RULE_aexpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183); ((AexprContext)_localctx).p1 = parcela();
			((AexprContext)_localctx).result =  ((AexprContext)_localctx).p1.result;
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(193);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(185); match(PLUS);
						setState(186); ((AexprContext)_localctx).p2 = parcela();
						((AexprContext)_localctx).result =  mkComposite(Op.PLUS, _localctx.result, ((AexprContext)_localctx).p2.result);
						}
						break;
					case MINUS:
						{
						setState(189); match(MINUS);
						setState(190); ((AexprContext)_localctx).p2 = parcela();
						((AexprContext)_localctx).result =  mkComposite(Op.MINUS, _localctx.result, ((AexprContext)_localctx).p2.result);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 28, RULE_parcela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); ((ParcelaContext)_localctx).f1 = fator();
			((ParcelaContext)_localctx).result =  ((ParcelaContext)_localctx).f1.result;
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				setState(212);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(200); match(TIMES);
					setState(201); ((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.TIMES, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				case DIVIDE:
					{
					setState(204); match(DIVIDE);
					setState(205); ((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.DIVIDE, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				case MOD:
					{
					setState(208); match(MOD);
					setState(209); ((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.MOD, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(216);
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
		enterRule(_localctx, 30, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); ((FatorContext)_localctx).t1 = termo();
			((FatorContext)_localctx).result =  ((FatorContext)_localctx).t1.result;
			setState(223);
			_la = _input.LA(1);
			if (_la==EXP) {
				{
				setState(219); match(EXP);
				setState(220); ((FatorContext)_localctx).t2 = termo();
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
		enterRule(_localctx, 32, RULE_termo);
		try {
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); match(MINUS);
				setState(226); ((TermoContext)_localctx).t1 = termo();
				((TermoContext)_localctx).result =  mkComposite(Op.UMINUS, ((TermoContext)_localctx).t1.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); match(NOT);
				setState(230); ((TermoContext)_localctx).t1 = termo();
				((TermoContext)_localctx).result =  mkComposite(Op.NOT, ((TermoContext)_localctx).t1.result);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233); match(LPAR);
				setState(234); ((TermoContext)_localctx).e1 = expr();
				setState(235); match(RPAR);
				((TermoContext)_localctx).result =  ((TermoContext)_localctx).e1.result;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238); ((TermoContext)_localctx).NUMERO = match(NUMERO);
				((TermoContext)_localctx).result =  mkNumeric(Double.parseDouble((((TermoContext)_localctx).NUMERO!=null?((TermoContext)_localctx).NUMERO.getText():null)));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240); ((TermoContext)_localctx).IDENT = match(IDENT);
				((TermoContext)_localctx).result =  mkVar((((TermoContext)_localctx).IDENT!=null?((TermoContext)_localctx).IDENT.getText():null));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242); ((TermoContext)_localctx).IDENT = match(IDENT);
				setState(243); match(LPAR);
				setState(244); ((TermoContext)_localctx).a = argList();
				setState(245); match(RPAR);
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
		enterRule(_localctx, 34, RULE_argList);

		    ((ArgListContext)_localctx).args =  new LinkedList<Expr>();

		int _la;
		try {
			setState(262);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NUMERO:
			case NOT:
			case RETURN:
			case IDENT:
			case MINUS:
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); ((ArgListContext)_localctx).e1 = expr();
				_localctx.args.add(((ArgListContext)_localctx).e1.result);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(253); match(COMMA);
					setState(254); ((ArgListContext)_localctx).e2 = expr();
					_localctx.args.add(((ArgListContext)_localctx).e2.result);
					}
					}
					setState(261);
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
		enterRule(_localctx, 36, RULE_design);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); ((DesignContext)_localctx).ds1 = shape();
			setState(265); ((DesignContext)_localctx).dp1 = property();
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
		public TerminalNode PENTAGON() { return getToken(CalcParser.PENTAGON, 0); }
		public TerminalNode RECTANGLE() { return getToken(CalcParser.RECTANGLE, 0); }
		public TerminalNode OCTAGON() { return getToken(CalcParser.OCTAGON, 0); }
		public TerminalNode TRIANGLE() { return getToken(CalcParser.TRIANGLE, 0); }
		public TerminalNode TRAPEZIO() { return getToken(CalcParser.TRAPEZIO, 0); }
		public TerminalNode SQUARE() { return getToken(CalcParser.SQUARE, 0); }
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
		enterRule(_localctx, 38, RULE_shape);
		try {
			setState(284);
			switch (_input.LA(1)) {
			case SQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); ((ShapeContext)_localctx).SQUARE = match(SQUARE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).SQUARE!=null?((ShapeContext)_localctx).SQUARE.getText():null));
				}
				break;
			case RECTANGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(270); ((ShapeContext)_localctx).RECTANGLE = match(RECTANGLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).RECTANGLE!=null?((ShapeContext)_localctx).RECTANGLE.getText():null));
				}
				break;
			case OVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(272); ((ShapeContext)_localctx).OVAL = match(OVAL);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).OVAL!=null?((ShapeContext)_localctx).OVAL.getText():null));
				}
				break;
			case PENTAGON:
				enterOuterAlt(_localctx, 4);
				{
				setState(274); ((ShapeContext)_localctx).PENTAGON = match(PENTAGON);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).PENTAGON!=null?((ShapeContext)_localctx).PENTAGON.getText():null));
				}
				break;
			case OCTAGON:
				enterOuterAlt(_localctx, 5);
				{
				setState(276); ((ShapeContext)_localctx).OCTAGON = match(OCTAGON);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).OCTAGON!=null?((ShapeContext)_localctx).OCTAGON.getText():null));
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(278); ((ShapeContext)_localctx).CIRCLE = match(CIRCLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).CIRCLE!=null?((ShapeContext)_localctx).CIRCLE.getText():null));
				}
				break;
			case TRIANGLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(280); ((ShapeContext)_localctx).TRIANGLE = match(TRIANGLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).TRIANGLE!=null?((ShapeContext)_localctx).TRIANGLE.getText():null));
				}
				break;
			case TRAPEZIO:
				enterOuterAlt(_localctx, 8);
				{
				setState(282); ((ShapeContext)_localctx).TRAPEZIO = match(TRAPEZIO);
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
		public ExprContext height;
		public ColorContext pColor;
		public ExprContext width;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 40, RULE_property);
		try {
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286); ((PropertyContext)_localctx).height = expr();
				setState(287); ((PropertyContext)_localctx).pColor = color();
				((PropertyContext)_localctx).result =  mkProperty(((PropertyContext)_localctx).height.result,((PropertyContext)_localctx).pColor.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290); ((PropertyContext)_localctx).height = expr();
				setState(291); ((PropertyContext)_localctx).width = expr();
				setState(292); ((PropertyContext)_localctx).pColor = color();
				((PropertyContext)_localctx).result =  mkProperty(((PropertyContext)_localctx).height.result,((PropertyContext)_localctx).width.result,((PropertyContext)_localctx).pColor.result);
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
		public TerminalNode BLACK() { return getToken(CalcParser.BLACK, 0); }
		public TerminalNode WHITE() { return getToken(CalcParser.WHITE, 0); }
		public TerminalNode CUSTOM() { return getToken(CalcParser.CUSTOM, 0); }
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
		enterRule(_localctx, 42, RULE_color);
		try {
			setState(315);
			switch (_input.LA(1)) {
			case RED:
				enterOuterAlt(_localctx, 1);
				{
				setState(297); ((ColorContext)_localctx).RED = match(RED);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).RED!=null?((ColorContext)_localctx).RED.getText():null));
				}
				break;
			case BLUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(299); ((ColorContext)_localctx).BLUE = match(BLUE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).BLUE!=null?((ColorContext)_localctx).BLUE.getText():null));
				}
				break;
			case BLACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(301); ((ColorContext)_localctx).BLACK = match(BLACK);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).BLACK!=null?((ColorContext)_localctx).BLACK.getText():null));
				}
				break;
			case PURPLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(303); ((ColorContext)_localctx).PURPLE = match(PURPLE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).PURPLE!=null?((ColorContext)_localctx).PURPLE.getText():null));
				}
				break;
			case YELLOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(305); ((ColorContext)_localctx).YELLOW = match(YELLOW);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).YELLOW!=null?((ColorContext)_localctx).YELLOW.getText():null));
				}
				break;
			case PINK:
				enterOuterAlt(_localctx, 6);
				{
				setState(307); ((ColorContext)_localctx).PINK = match(PINK);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).PINK!=null?((ColorContext)_localctx).PINK.getText():null));
				}
				break;
			case GREEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(309); ((ColorContext)_localctx).GREEN = match(GREEN);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).GREEN!=null?((ColorContext)_localctx).GREEN.getText():null));
				}
				break;
			case WHITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(311); ((ColorContext)_localctx).WHITE = match(WHITE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).WHITE!=null?((ColorContext)_localctx).WHITE.getText():null));
				}
				break;
			case CUSTOM:
				enterOuterAlt(_localctx, 9);
				{
				setState(313); ((ColorContext)_localctx).CUSTOM = match(CUSTOM);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\67\u0140\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5c\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bs\n\b\f\b"+
		"\16\bv\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0094\n\13\f\13\16\13\u0097\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009f"+
		"\n\f\f\f\16\f\u00a2\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00aa\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b8\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c4\n\17\f\17"+
		"\16\17\u00c7\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\7\20\u00d7\n\20\f\20\16\20\u00da\13\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00e2\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00fb\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0104"+
		"\n\23\f\23\16\23\u0107\13\23\5\23\u0109\n\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u011f\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u012a\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013e\n\27\3\27\2\30\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u0158\2\63\3\2\2\2\4J\3\2\2\2\6L"+
		"\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fj\3\2\2\2\16t\3\2\2\2\20~\3\2\2\2\22\u008b"+
		"\3\2\2\2\24\u008d\3\2\2\2\26\u0098\3\2\2\2\30\u00a3\3\2\2\2\32\u00b7\3"+
		"\2\2\2\34\u00b9\3\2\2\2\36\u00c8\3\2\2\2 \u00db\3\2\2\2\"\u00fa\3\2\2"+
		"\2$\u0108\3\2\2\2&\u010a\3\2\2\2(\u011e\3\2\2\2*\u0129\3\2\2\2,\u013d"+
		"\3\2\2\2./\5\4\3\2/\60\b\2\1\2\60\62\3\2\2\2\61.\3\2\2\2\62\65\3\2\2\2"+
		"\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66\67\5\20\t\2"+
		"\678\7/\2\289\b\3\1\29K\3\2\2\2:;\5\22\n\2;<\7/\2\2<=\b\3\1\2=K\3\2\2"+
		"\2>?\5\6\4\2?@\b\3\1\2@K\3\2\2\2AB\5\b\5\2BC\b\3\1\2CK\3\2\2\2DE\5\n\6"+
		"\2EF\b\3\1\2FK\3\2\2\2GH\5\f\7\2HI\b\3\1\2IK\3\2\2\2J\66\3\2\2\2J:\3\2"+
		"\2\2J>\3\2\2\2JA\3\2\2\2JD\3\2\2\2JG\3\2\2\2K\5\3\2\2\2LM\7\37\2\2MN\7"+
		" \2\2NO\7*\2\2OP\5$\23\2PQ\7+\2\2QR\5\f\7\2RS\b\4\1\2S\7\3\2\2\2TU\7\b"+
		"\2\2UV\5\24\13\2VW\7\t\2\2WX\5\4\3\2XY\b\5\1\2Yc\3\2\2\2Z[\7\b\2\2[\\"+
		"\5\24\13\2\\]\7\t\2\2]^\5\4\3\2^_\7\n\2\2_`\5\4\3\2`a\b\5\1\2ac\3\2\2"+
		"\2bT\3\2\2\2bZ\3\2\2\2c\t\3\2\2\2de\7\13\2\2ef\5\24\13\2fg\7\f\2\2gh\5"+
		"\4\3\2hi\b\6\1\2i\13\3\2\2\2jk\7,\2\2kl\5\16\b\2lm\7-\2\2mn\b\7\1\2n\r"+
		"\3\2\2\2op\5\4\3\2pq\b\b\1\2qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2t"+
		"u\3\2\2\2u\17\3\2\2\2vt\3\2\2\2wx\5\24\13\2xy\b\t\1\2y\177\3\2\2\2z{\7"+
		"\r\2\2{|\5\24\13\2|}\b\t\1\2}\177\3\2\2\2~w\3\2\2\2~z\3\2\2\2\177\21\3"+
		"\2\2\2\u0080\u0081\7 \2\2\u0081\u0082\7#\2\2\u0082\u0083\5\20\t\2\u0083"+
		"\u0084\b\n\1\2\u0084\u008c\3\2\2\2\u0085\u0086\7\36\2\2\u0086\u0087\7"+
		" \2\2\u0087\u0088\7#\2\2\u0088\u0089\5&\24\2\u0089\u008a\b\n\1\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u0085\3\2\2\2\u008c\23\3\2\2"+
		"\2\u008d\u008e\5\26\f\2\u008e\u0095\b\13\1\2\u008f\u0090\7\5\2\2\u0090"+
		"\u0091\5\26\f\2\u0091\u0092\b\13\1\2\u0092\u0094\3\2\2\2\u0093\u008f\3"+
		"\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\25\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\30\r\2\u0099\u00a0\b\f\1"+
		"\2\u009a\u009b\7\6\2\2\u009b\u009c\5\30\r\2\u009c\u009d\b\f\1\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009a\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4"+
		"\5\34\17\2\u00a4\u00a9\b\r\1\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7\5\34"+
		"\17\2\u00a7\u00a8\b\r\1\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\7\60\2\2\u00ac\u00b8\b\16"+
		"\1\2\u00ad\u00ae\7\61\2\2\u00ae\u00b8\b\16\1\2\u00af\u00b0\7\62\2\2\u00b0"+
		"\u00b8\b\16\1\2\u00b1\u00b2\7\63\2\2\u00b2\u00b8\b\16\1\2\u00b3\u00b4"+
		"\7\64\2\2\u00b4\u00b8\b\16\1\2\u00b5\u00b6\7\65\2\2\u00b6\u00b8\b\16\1"+
		"\2\u00b7\u00ab\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b1"+
		"\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\33\3\2\2\2\u00b9"+
		"\u00ba\5\36\20\2\u00ba\u00c5\b\17\1\2\u00bb\u00bc\7$\2\2\u00bc\u00bd\5"+
		"\36\20\2\u00bd\u00be\b\17\1\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\7%\2\2\u00c0"+
		"\u00c1\5\36\20\2\u00c1\u00c2\b\17\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00bb"+
		"\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5 \21"+
		"\2\u00c9\u00d8\b\20\1\2\u00ca\u00cb\7&\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd"+
		"\b\20\1\2\u00cd\u00d7\3\2\2\2\u00ce\u00cf\7\'\2\2\u00cf\u00d0\5 \21\2"+
		"\u00d0\u00d1\b\20\1\2\u00d1\u00d7\3\2\2\2\u00d2\u00d3\7(\2\2\u00d3\u00d4"+
		"\5 \21\2\u00d4\u00d5\b\20\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00ca\3\2\2\2"+
		"\u00d6\u00ce\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\37\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\5\"\22\2\u00dc\u00e1\b\21\1\2\u00dd\u00de\7)\2\2\u00de\u00df\5"+
		"\"\22\2\u00df\u00e0\b\21\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00e4\7%\2\2\u00e4\u00e5\5\"\22\2"+
		"\u00e5\u00e6\b\22\1\2\u00e6\u00fb\3\2\2\2\u00e7\u00e8\7\7\2\2\u00e8\u00e9"+
		"\5\"\22\2\u00e9\u00ea\b\22\1\2\u00ea\u00fb\3\2\2\2\u00eb\u00ec\7*\2\2"+
		"\u00ec\u00ed\5\20\t\2\u00ed\u00ee\7+\2\2\u00ee\u00ef\b\22\1\2\u00ef\u00fb"+
		"\3\2\2\2\u00f0\u00f1\7\4\2\2\u00f1\u00fb\b\22\1\2\u00f2\u00f3\7 \2\2\u00f3"+
		"\u00fb\b\22\1\2\u00f4\u00f5\7 \2\2\u00f5\u00f6\7*\2\2\u00f6\u00f7\5$\23"+
		"\2\u00f7\u00f8\7+\2\2\u00f8\u00f9\b\22\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00e3"+
		"\3\2\2\2\u00fa\u00e7\3\2\2\2\u00fa\u00eb\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa"+
		"\u00f2\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fb#\3\2\2\2\u00fc\u0109\3\2\2\2"+
		"\u00fd\u00fe\5\20\t\2\u00fe\u0105\b\23\1\2\u00ff\u0100\7.\2\2\u0100\u0101"+
		"\5\20\t\2\u0101\u0102\b\23\1\2\u0102\u0104\3\2\2\2\u0103\u00ff\3\2\2\2"+
		"\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u00fc\3\2\2\2\u0108\u00fd\3\2\2\2\u0109"+
		"%\3\2\2\2\u010a\u010b\5(\25\2\u010b\u010c\5*\26\2\u010c\u010d\b\24\1\2"+
		"\u010d\'\3\2\2\2\u010e\u010f\7\16\2\2\u010f\u011f\b\25\1\2\u0110\u0111"+
		"\7\17\2\2\u0111\u011f\b\25\1\2\u0112\u0113\7\20\2\2\u0113\u011f\b\25\1"+
		"\2\u0114\u0115\7\21\2\2\u0115\u011f\b\25\1\2\u0116\u0117\7\22\2\2\u0117"+
		"\u011f\b\25\1\2\u0118\u0119\7\23\2\2\u0119\u011f\b\25\1\2\u011a\u011b"+
		"\7\24\2\2\u011b\u011f\b\25\1\2\u011c\u011d\7\25\2\2\u011d\u011f\b\25\1"+
		"\2\u011e\u010e\3\2\2\2\u011e\u0110\3\2\2\2\u011e\u0112\3\2\2\2\u011e\u0114"+
		"\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u011a\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f)\3\2\2\2\u0120\u0121\5\20\t\2\u0121\u0122\5,\27\2"+
		"\u0122\u0123\b\26\1\2\u0123\u012a\3\2\2\2\u0124\u0125\5\20\t\2\u0125\u0126"+
		"\5\20\t\2\u0126\u0127\5,\27\2\u0127\u0128\b\26\1\2\u0128\u012a\3\2\2\2"+
		"\u0129\u0120\3\2\2\2\u0129\u0124\3\2\2\2\u012a+\3\2\2\2\u012b\u012c\7"+
		"\26\2\2\u012c\u013e\b\27\1\2\u012d\u012e\7\27\2\2\u012e\u013e\b\27\1\2"+
		"\u012f\u0130\7\30\2\2\u0130\u013e\b\27\1\2\u0131\u0132\7\31\2\2\u0132"+
		"\u013e\b\27\1\2\u0133\u0134\7\35\2\2\u0134\u013e\b\27\1\2\u0135\u0136"+
		"\7\34\2\2\u0136\u013e\b\27\1\2\u0137\u0138\7\33\2\2\u0138\u013e\b\27\1"+
		"\2\u0139\u013a\7\32\2\2\u013a\u013e\b\27\1\2\u013b\u013c\7\3\2\2\u013c"+
		"\u013e\b\27\1\2\u013d\u012b\3\2\2\2\u013d\u012d\3\2\2\2\u013d\u012f\3"+
		"\2\2\2\u013d\u0131\3\2\2\2\u013d\u0133\3\2\2\2\u013d\u0135\3\2\2\2\u013d"+
		"\u0137\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013b\3\2\2\2\u013e-\3\2\2\2"+
		"\27\63Jbt~\u008b\u0095\u00a0\u00a9\u00b7\u00c3\u00c5\u00d6\u00d8\u00e1"+
		"\u00fa\u0105\u0108\u011e\u0129\u013d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}