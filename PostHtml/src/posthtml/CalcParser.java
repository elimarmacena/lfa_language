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
		DO=10, SQUARE=11, RECTANGLE=12, OVAL=13, PENTAGON=14, OCTAGON=15, CIRCLE=16, 
		TRIANGLE=17, TRAPEZIO=18, RED=19, BLUE=20, BLACK=21, PURPLE=22, WHITE=23, 
		GREEN=24, PINK=25, YELLOW=26, DRAWID=27, KEYCREATEF=28, IDENT=29, HEX_NUM=30, 
		HASH=31, GETS=32, PLUS=33, MINUS=34, TIMES=35, DIVIDE=36, MOD=37, EXP=38, 
		LPAR=39, RPAR=40, LBRC=41, RBRC=42, COMMA=43, SEMI=44, EQU=45, NEQ=46, 
		LT=47, LEQ=48, GT=49, GEQ=50, WS=51, COMMENT=52;
	public static final String[] tokenNames = {
		"<INVALID>", "CUSTOM", "NUMERO", "'or'", "'and'", "'not'", "'if'", "'then'", 
		"'else'", "'while'", "'do'", "'square'", "'rectangle'", "'oval'", "'pentagon'", 
		"'octagon'", "'circle'", "'triangle'", "'trapezio'", "'red'", "'blue'", 
		"'black'", "'purple'", "'white'", "'green'", "'pink'", "'yellow'", "'skt'", 
		"'def'", "IDENT", "HEX_NUM", "'#'", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'('", "')'", "'{'", "'}'", "','", "';'", "'=='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "WS", "COMMENT"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << DRAWID) | (1L << KEYCREATEF) | (1L << IDENT) | (1L << MINUS) | (1L << LPAR) | (1L << LBRC))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << DRAWID) | (1L << KEYCREATEF) | (1L << IDENT) | (1L << MINUS) | (1L << LPAR) | (1L << LBRC))) != 0)) {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(117); ((ExprContext)_localctx).e = bexpr();
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
			setState(131);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); ((AssignContext)_localctx).IDENT = match(IDENT);
				setState(121); match(GETS);
				setState(122); ((AssignContext)_localctx).e = expr();
				((AssignContext)_localctx).result =  mkAssign((((AssignContext)_localctx).IDENT!=null?((AssignContext)_localctx).IDENT.getText():null), ((AssignContext)_localctx).e.result);
				}
				break;
			case DRAWID:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); match(DRAWID);
				setState(126); ((AssignContext)_localctx).IDENT = match(IDENT);
				setState(127); match(GETS);
				setState(128); ((AssignContext)_localctx).d1 = design();
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
			setState(133); ((BexprContext)_localctx).d1 = disj();
			((BexprContext)_localctx).result =  ((BexprContext)_localctx).d1.result;
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(135); match(OR);
				setState(136); ((BexprContext)_localctx).d2 = disj();
				((BexprContext)_localctx).result =  mkComposite(Op.OR, _localctx.result, ((BexprContext)_localctx).d2.result);
				}
				}
				setState(143);
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
			setState(144); ((DisjContext)_localctx).c1 = conj();
			((DisjContext)_localctx).result =  ((DisjContext)_localctx).c1.result;
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(146); match(AND);
				setState(147); ((DisjContext)_localctx).c2 = conj();
				((DisjContext)_localctx).result =  mkComposite(Op.AND, _localctx.result, ((DisjContext)_localctx).c2.result);
				}
				}
				setState(154);
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
			setState(155); ((ConjContext)_localctx).a1 = aexpr();
			((ConjContext)_localctx).result =  ((ConjContext)_localctx).a1.result;
			setState(161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQU) | (1L << NEQ) | (1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ))) != 0)) {
				{
				setState(157); ((ConjContext)_localctx).o = relOp();
				setState(158); ((ConjContext)_localctx).a2 = aexpr();
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
			setState(175);
			switch (_input.LA(1)) {
			case EQU:
				enterOuterAlt(_localctx, 1);
				{
				setState(163); match(EQU);
				((RelOpContext)_localctx).result =  Op.EQU;
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(165); match(NEQ);
				((RelOpContext)_localctx).result =  Op.NEQ;
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); match(LT);
				((RelOpContext)_localctx).result =  Op.LT;
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(169); match(LEQ);
				((RelOpContext)_localctx).result =  Op.LEQ;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 5);
				{
				setState(171); match(GT);
				((RelOpContext)_localctx).result =  Op.GT;
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(173); match(GEQ);
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
			setState(177); ((AexprContext)_localctx).p1 = parcela();
			((AexprContext)_localctx).result =  ((AexprContext)_localctx).p1.result;
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(187);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(179); match(PLUS);
						setState(180); ((AexprContext)_localctx).p2 = parcela();
						((AexprContext)_localctx).result =  mkComposite(Op.PLUS, _localctx.result, ((AexprContext)_localctx).p2.result);
						}
						break;
					case MINUS:
						{
						setState(183); match(MINUS);
						setState(184); ((AexprContext)_localctx).p2 = parcela();
						((AexprContext)_localctx).result =  mkComposite(Op.MINUS, _localctx.result, ((AexprContext)_localctx).p2.result);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(192); ((ParcelaContext)_localctx).f1 = fator();
			((ParcelaContext)_localctx).result =  ((ParcelaContext)_localctx).f1.result;
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				setState(206);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(194); match(TIMES);
					setState(195); ((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.TIMES, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				case DIVIDE:
					{
					setState(198); match(DIVIDE);
					setState(199); ((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.DIVIDE, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				case MOD:
					{
					setState(202); match(MOD);
					setState(203); ((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.MOD, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(210);
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
			setState(211); ((FatorContext)_localctx).t1 = termo();
			((FatorContext)_localctx).result =  ((FatorContext)_localctx).t1.result;
			setState(217);
			_la = _input.LA(1);
			if (_la==EXP) {
				{
				setState(213); match(EXP);
				setState(214); ((FatorContext)_localctx).t2 = termo();
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
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219); match(MINUS);
				setState(220); ((TermoContext)_localctx).t1 = termo();
				((TermoContext)_localctx).result =  mkComposite(Op.UMINUS, ((TermoContext)_localctx).t1.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); match(NOT);
				setState(224); ((TermoContext)_localctx).t1 = termo();
				((TermoContext)_localctx).result =  mkComposite(Op.NOT, ((TermoContext)_localctx).t1.result);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227); match(LPAR);
				setState(228); ((TermoContext)_localctx).e1 = expr();
				setState(229); match(RPAR);
				((TermoContext)_localctx).result =  ((TermoContext)_localctx).e1.result;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232); ((TermoContext)_localctx).NUMERO = match(NUMERO);
				((TermoContext)_localctx).result =  mkNumeric(Double.parseDouble((((TermoContext)_localctx).NUMERO!=null?((TermoContext)_localctx).NUMERO.getText():null)));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(234); ((TermoContext)_localctx).IDENT = match(IDENT);
				((TermoContext)_localctx).result =  mkVar((((TermoContext)_localctx).IDENT!=null?((TermoContext)_localctx).IDENT.getText():null));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(236); ((TermoContext)_localctx).IDENT = match(IDENT);
				setState(237); match(LPAR);
				setState(238); ((TermoContext)_localctx).a = argList();
				setState(239); match(RPAR);
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
			setState(256);
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
				setState(245); ((ArgListContext)_localctx).e1 = expr();
				_localctx.args.add(((ArgListContext)_localctx).e1.result);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(247); match(COMMA);
					setState(248); ((ArgListContext)_localctx).e2 = expr();
					_localctx.args.add(((ArgListContext)_localctx).e2.result);
					}
					}
					setState(255);
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
			setState(258); ((DesignContext)_localctx).ds1 = shape();
			setState(259); ((DesignContext)_localctx).dp1 = property();
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
			setState(278);
			switch (_input.LA(1)) {
			case SQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(262); ((ShapeContext)_localctx).SQUARE = match(SQUARE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).SQUARE!=null?((ShapeContext)_localctx).SQUARE.getText():null));
				}
				break;
			case RECTANGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(264); ((ShapeContext)_localctx).RECTANGLE = match(RECTANGLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).RECTANGLE!=null?((ShapeContext)_localctx).RECTANGLE.getText():null));
				}
				break;
			case OVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(266); ((ShapeContext)_localctx).OVAL = match(OVAL);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).OVAL!=null?((ShapeContext)_localctx).OVAL.getText():null));
				}
				break;
			case PENTAGON:
				enterOuterAlt(_localctx, 4);
				{
				setState(268); ((ShapeContext)_localctx).PENTAGON = match(PENTAGON);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).PENTAGON!=null?((ShapeContext)_localctx).PENTAGON.getText():null));
				}
				break;
			case OCTAGON:
				enterOuterAlt(_localctx, 5);
				{
				setState(270); ((ShapeContext)_localctx).OCTAGON = match(OCTAGON);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).OCTAGON!=null?((ShapeContext)_localctx).OCTAGON.getText():null));
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(272); ((ShapeContext)_localctx).CIRCLE = match(CIRCLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).CIRCLE!=null?((ShapeContext)_localctx).CIRCLE.getText():null));
				}
				break;
			case TRIANGLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(274); ((ShapeContext)_localctx).TRIANGLE = match(TRIANGLE);
				((ShapeContext)_localctx).result =  mkShape((((ShapeContext)_localctx).TRIANGLE!=null?((ShapeContext)_localctx).TRIANGLE.getText():null));
				}
				break;
			case TRAPEZIO:
				enterOuterAlt(_localctx, 8);
				{
				setState(276); ((ShapeContext)_localctx).TRAPEZIO = match(TRAPEZIO);
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
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280); ((PropertyContext)_localctx).height = expr();
				setState(281); ((PropertyContext)_localctx).pColor = color();
				((PropertyContext)_localctx).result =  mkProperty(((PropertyContext)_localctx).height.result,((PropertyContext)_localctx).pColor.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284); ((PropertyContext)_localctx).height = expr();
				setState(285); ((PropertyContext)_localctx).width = expr();
				setState(286); ((PropertyContext)_localctx).pColor = color();
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
			setState(309);
			switch (_input.LA(1)) {
			case RED:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); ((ColorContext)_localctx).RED = match(RED);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).RED!=null?((ColorContext)_localctx).RED.getText():null));
				}
				break;
			case BLUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(293); ((ColorContext)_localctx).BLUE = match(BLUE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).BLUE!=null?((ColorContext)_localctx).BLUE.getText():null));
				}
				break;
			case BLACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(295); ((ColorContext)_localctx).BLACK = match(BLACK);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).BLACK!=null?((ColorContext)_localctx).BLACK.getText():null));
				}
				break;
			case PURPLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(297); ((ColorContext)_localctx).PURPLE = match(PURPLE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).PURPLE!=null?((ColorContext)_localctx).PURPLE.getText():null));
				}
				break;
			case YELLOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(299); ((ColorContext)_localctx).YELLOW = match(YELLOW);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).YELLOW!=null?((ColorContext)_localctx).YELLOW.getText():null));
				}
				break;
			case PINK:
				enterOuterAlt(_localctx, 6);
				{
				setState(301); ((ColorContext)_localctx).PINK = match(PINK);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).PINK!=null?((ColorContext)_localctx).PINK.getText():null));
				}
				break;
			case GREEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(303); ((ColorContext)_localctx).GREEN = match(GREEN);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).GREEN!=null?((ColorContext)_localctx).GREEN.getText():null));
				}
				break;
			case WHITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(305); ((ColorContext)_localctx).WHITE = match(WHITE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).WHITE!=null?((ColorContext)_localctx).WHITE.getText():null));
				}
				break;
			case CUSTOM:
				enterOuterAlt(_localctx, 9);
				{
				setState(307); ((ColorContext)_localctx).CUSTOM = match(CUSTOM);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\66\u013a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5c\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bs\n\b\f\b"+
		"\16\bv\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0086\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008e\n\13\f\13\16\13"+
		"\u0091\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0099\n\f\f\f\16\f\u009c\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a4\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b2\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00be\n\17\f\17\16\17\u00c1\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00d1\n\20\f\20\16\20\u00d4\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00dc\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f5\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00fe\n\23\f\23\16\23\u0101\13"+
		"\23\5\23\u0103\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0119\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0124\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0138\n\27\3\27\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,\2\2\u0151\2\63\3\2\2\2\4J\3\2\2\2\6L\3\2\2\2\bb\3\2\2\2\nd\3"+
		"\2\2\2\fj\3\2\2\2\16t\3\2\2\2\20w\3\2\2\2\22\u0085\3\2\2\2\24\u0087\3"+
		"\2\2\2\26\u0092\3\2\2\2\30\u009d\3\2\2\2\32\u00b1\3\2\2\2\34\u00b3\3\2"+
		"\2\2\36\u00c2\3\2\2\2 \u00d5\3\2\2\2\"\u00f4\3\2\2\2$\u0102\3\2\2\2&\u0104"+
		"\3\2\2\2(\u0118\3\2\2\2*\u0123\3\2\2\2,\u0137\3\2\2\2./\5\4\3\2/\60\b"+
		"\2\1\2\60\62\3\2\2\2\61.\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66\67\5\20\t\2\678\7.\2\289\b\3\1\29K"+
		"\3\2\2\2:;\5\22\n\2;<\7.\2\2<=\b\3\1\2=K\3\2\2\2>?\5\6\4\2?@\b\3\1\2@"+
		"K\3\2\2\2AB\5\b\5\2BC\b\3\1\2CK\3\2\2\2DE\5\n\6\2EF\b\3\1\2FK\3\2\2\2"+
		"GH\5\f\7\2HI\b\3\1\2IK\3\2\2\2J\66\3\2\2\2J:\3\2\2\2J>\3\2\2\2JA\3\2\2"+
		"\2JD\3\2\2\2JG\3\2\2\2K\5\3\2\2\2LM\7\36\2\2MN\7\37\2\2NO\7)\2\2OP\5$"+
		"\23\2PQ\7*\2\2QR\5\f\7\2RS\b\4\1\2S\7\3\2\2\2TU\7\b\2\2UV\5\24\13\2VW"+
		"\7\t\2\2WX\5\4\3\2XY\b\5\1\2Yc\3\2\2\2Z[\7\b\2\2[\\\5\24\13\2\\]\7\t\2"+
		"\2]^\5\4\3\2^_\7\n\2\2_`\5\4\3\2`a\b\5\1\2ac\3\2\2\2bT\3\2\2\2bZ\3\2\2"+
		"\2c\t\3\2\2\2de\7\13\2\2ef\5\24\13\2fg\7\f\2\2gh\5\4\3\2hi\b\6\1\2i\13"+
		"\3\2\2\2jk\7+\2\2kl\5\16\b\2lm\7,\2\2mn\b\7\1\2n\r\3\2\2\2op\5\4\3\2p"+
		"q\b\b\1\2qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\17\3\2\2"+
		"\2vt\3\2\2\2wx\5\24\13\2xy\b\t\1\2y\21\3\2\2\2z{\7\37\2\2{|\7\"\2\2|}"+
		"\5\20\t\2}~\b\n\1\2~\u0086\3\2\2\2\177\u0080\7\35\2\2\u0080\u0081\7\37"+
		"\2\2\u0081\u0082\7\"\2\2\u0082\u0083\5&\24\2\u0083\u0084\b\n\1\2\u0084"+
		"\u0086\3\2\2\2\u0085z\3\2\2\2\u0085\177\3\2\2\2\u0086\23\3\2\2\2\u0087"+
		"\u0088\5\26\f\2\u0088\u008f\b\13\1\2\u0089\u008a\7\5\2\2\u008a\u008b\5"+
		"\26\f\2\u008b\u008c\b\13\1\2\u008c\u008e\3\2\2\2\u008d\u0089\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2\2"+
		"\2\u0091\u008f\3\2\2\2\u0092\u0093\5\30\r\2\u0093\u009a\b\f\1\2\u0094"+
		"\u0095\7\6\2\2\u0095\u0096\5\30\r\2\u0096\u0097\b\f\1\2\u0097\u0099\3"+
		"\2\2\2\u0098\u0094\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\27\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\5\34\17"+
		"\2\u009e\u00a3\b\r\1\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\5\34\17\2\u00a1"+
		"\u00a2\b\r\1\2\u00a2\u00a4\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\31\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\u00b2\b\16\1\2\u00a7\u00a8"+
		"\7\60\2\2\u00a8\u00b2\b\16\1\2\u00a9\u00aa\7\61\2\2\u00aa\u00b2\b\16\1"+
		"\2\u00ab\u00ac\7\62\2\2\u00ac\u00b2\b\16\1\2\u00ad\u00ae\7\63\2\2\u00ae"+
		"\u00b2\b\16\1\2\u00af\u00b0\7\64\2\2\u00b0\u00b2\b\16\1\2\u00b1\u00a5"+
		"\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\5\36\20"+
		"\2\u00b4\u00bf\b\17\1\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\5\36\20\2\u00b7"+
		"\u00b8\b\17\1\2\u00b8\u00be\3\2\2\2\u00b9\u00ba\7$\2\2\u00ba\u00bb\5\36"+
		"\20\2\u00bb\u00bc\b\17\1\2\u00bc\u00be\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd"+
		"\u00b9\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\35\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5 \21\2\u00c3\u00d2"+
		"\b\20\1\2\u00c4\u00c5\7%\2\2\u00c5\u00c6\5 \21\2\u00c6\u00c7\b\20\1\2"+
		"\u00c7\u00d1\3\2\2\2\u00c8\u00c9\7&\2\2\u00c9\u00ca\5 \21\2\u00ca\u00cb"+
		"\b\20\1\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd\7\'\2\2\u00cd\u00ce\5 \21\2"+
		"\u00ce\u00cf\b\20\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d0\u00c8"+
		"\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5\"\22"+
		"\2\u00d6\u00db\b\21\1\2\u00d7\u00d8\7(\2\2\u00d8\u00d9\5\"\22\2\u00d9"+
		"\u00da\b\21\1\2\u00da\u00dc\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc!\3\2\2\2\u00dd\u00de\7$\2\2\u00de\u00df\5\"\22\2\u00df\u00e0"+
		"\b\22\1\2\u00e0\u00f5\3\2\2\2\u00e1\u00e2\7\7\2\2\u00e2\u00e3\5\"\22\2"+
		"\u00e3\u00e4\b\22\1\2\u00e4\u00f5\3\2\2\2\u00e5\u00e6\7)\2\2\u00e6\u00e7"+
		"\5\20\t\2\u00e7\u00e8\7*\2\2\u00e8\u00e9\b\22\1\2\u00e9\u00f5\3\2\2\2"+
		"\u00ea\u00eb\7\4\2\2\u00eb\u00f5\b\22\1\2\u00ec\u00ed\7\37\2\2\u00ed\u00f5"+
		"\b\22\1\2\u00ee\u00ef\7\37\2\2\u00ef\u00f0\7)\2\2\u00f0\u00f1\5$\23\2"+
		"\u00f1\u00f2\7*\2\2\u00f2\u00f3\b\22\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00dd"+
		"\3\2\2\2\u00f4\u00e1\3\2\2\2\u00f4\u00e5\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f4"+
		"\u00ec\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f5#\3\2\2\2\u00f6\u0103\3\2\2\2"+
		"\u00f7\u00f8\5\20\t\2\u00f8\u00ff\b\23\1\2\u00f9\u00fa\7-\2\2\u00fa\u00fb"+
		"\5\20\t\2\u00fb\u00fc\b\23\1\2\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3\2\2\2"+
		"\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00f7\3\2\2\2\u0103"+
		"%\3\2\2\2\u0104\u0105\5(\25\2\u0105\u0106\5*\26\2\u0106\u0107\b\24\1\2"+
		"\u0107\'\3\2\2\2\u0108\u0109\7\r\2\2\u0109\u0119\b\25\1\2\u010a\u010b"+
		"\7\16\2\2\u010b\u0119\b\25\1\2\u010c\u010d\7\17\2\2\u010d\u0119\b\25\1"+
		"\2\u010e\u010f\7\20\2\2\u010f\u0119\b\25\1\2\u0110\u0111\7\21\2\2\u0111"+
		"\u0119\b\25\1\2\u0112\u0113\7\22\2\2\u0113\u0119\b\25\1\2\u0114\u0115"+
		"\7\23\2\2\u0115\u0119\b\25\1\2\u0116\u0117\7\24\2\2\u0117\u0119\b\25\1"+
		"\2\u0118\u0108\3\2\2\2\u0118\u010a\3\2\2\2\u0118\u010c\3\2\2\2\u0118\u010e"+
		"\3\2\2\2\u0118\u0110\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0114\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119)\3\2\2\2\u011a\u011b\5\20\t\2\u011b\u011c\5,\27\2"+
		"\u011c\u011d\b\26\1\2\u011d\u0124\3\2\2\2\u011e\u011f\5\20\t\2\u011f\u0120"+
		"\5\20\t\2\u0120\u0121\5,\27\2\u0121\u0122\b\26\1\2\u0122\u0124\3\2\2\2"+
		"\u0123\u011a\3\2\2\2\u0123\u011e\3\2\2\2\u0124+\3\2\2\2\u0125\u0126\7"+
		"\25\2\2\u0126\u0138\b\27\1\2\u0127\u0128\7\26\2\2\u0128\u0138\b\27\1\2"+
		"\u0129\u012a\7\27\2\2\u012a\u0138\b\27\1\2\u012b\u012c\7\30\2\2\u012c"+
		"\u0138\b\27\1\2\u012d\u012e\7\34\2\2\u012e\u0138\b\27\1\2\u012f\u0130"+
		"\7\33\2\2\u0130\u0138\b\27\1\2\u0131\u0132\7\32\2\2\u0132\u0138\b\27\1"+
		"\2\u0133\u0134\7\31\2\2\u0134\u0138\b\27\1\2\u0135\u0136\7\3\2\2\u0136"+
		"\u0138\b\27\1\2\u0137\u0125\3\2\2\2\u0137\u0127\3\2\2\2\u0137\u0129\3"+
		"\2\2\2\u0137\u012b\3\2\2\2\u0137\u012d\3\2\2\2\u0137\u012f\3\2\2\2\u0137"+
		"\u0131\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138-\3\2\2\2"+
		"\26\63Jbt\u0085\u008f\u009a\u00a3\u00b1\u00bd\u00bf\u00d0\u00d2\u00db"+
		"\u00f4\u00ff\u0102\u0118\u0123\u0137";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}