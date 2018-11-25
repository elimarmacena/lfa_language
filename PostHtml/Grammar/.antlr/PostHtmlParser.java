// Generated from c:\Users\elmr\Documents\GITHUB\lfa_language\PostHtml\Grammar\PostHtml.g4 by ANTLR 4.7.1

import posthtml.workload.*;
import static posthtml.workload.*;
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
public class PostHtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, INTEGER=3, SEMICOLON=4, SQUARE=5, RECTANGLE=6, OVAL=7, 
		STAR=8, PENTAGON=9, HEXAGON=10, OCTAGON=11, HEART=12, CIRCLE=13, TRIANGLE=14, 
		TRAPEZIO=15, RED=16, BLUE=17, BLACK=18, PURPLE=19, WHITE=20, GREEN=21, 
		PINK=22, YELLOW=23, WS=24;
	public static final int
		RULE_init = 0, RULE_draw = 1, RULE_block = 2, RULE_design = 3, RULE_shape = 4, 
		RULE_type = 5, RULE_property = 6, RULE_color = 7, RULE_height = 8, RULE_width = 9, 
		RULE_number = 10;
	public static final String[] ruleNames = {
		"init", "draw", "block", "design", "shape", "type", "property", "color", 
		"height", "width", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", null, "';'", "'square'", "'rectangle'", "'oval'", 
		"'star'", "'pentagon'", "'hexagon'", "'octagon'", "'heart'", "'CIRCLE'", 
		"'triangle'", "'trapezio'", "'red'", "'blue'", "'black'", "'purple'", 
		"'white'", "'green'", "'pink'", "'yellow'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "INTEGER", "SEMICOLON", "SQUARE", "RECTANGLE", "OVAL", 
		"STAR", "PENTAGON", "HEXAGON", "OCTAGON", "HEART", "CIRCLE", "TRIANGLE", 
		"TRAPEZIO", "RED", "BLUE", "BLACK", "PURPLE", "WHITE", "GREEN", "PINK", 
		"YELLOW", "WS"
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
	public String getGrammarFileName() { return "PostHtml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostHtmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public Sketch result;
		public DrawContext d1;
		public DrawContext draw() {
			return getRuleContext(DrawContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((InitContext)_localctx).d1 = draw();
			((InitContext)_localctx).result =  ((InitContext)_localctx).d1.result;
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
		public BlockContext b1;
		public TerminalNode BEGIN() { return getToken(PostHtmlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PostHtmlParser.END, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DrawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw; }
	}

	public final DrawContext draw() throws RecognitionException {
		DrawContext _localctx = new DrawContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_draw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(BEGIN);
			setState(26);
			((DrawContext)_localctx).b1 = block();
			setState(27);
			match(END);
			((DrawContext)_localctx).result =  ((DrawContext)_localctx).b1.result;
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
		public List<Sketch> result;
		public DesignContext bd;
		public List<TerminalNode> SEMICOLON() { return getTokens(PostHtmlParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PostHtmlParser.SEMICOLON, i);
		}
		public List<DesignContext> design() {
			return getRuleContexts(DesignContext.class);
		}
		public DesignContext design(int i) {
			return getRuleContext(DesignContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);

		  ((BlockContext)_localctx).result =  new LinkedList<Sketch>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				((BlockContext)_localctx).bd = design();
				_localctx.result.add(((BlockContext)_localctx).bd.result);
				setState(32);
				match(SEMICOLON);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQUARE) | (1L << RECTANGLE) | (1L << OVAL) | (1L << STAR) | (1L << PENTAGON) | (1L << HEXAGON) | (1L << OCTAGON) | (1L << HEART) | (1L << CIRCLE) | (1L << TRIANGLE) | (1L << TRAPEZIO))) != 0) );
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
	}

	public final DesignContext design() throws RecognitionException {
		DesignContext _localctx = new DesignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_design);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((DesignContext)_localctx).ds1 = shape();
			setState(39);
			((DesignContext)_localctx).dp1 = property();
			((DesignContext)_localctx).result =  mkDesing(((DesignContext)_localctx).ds1.result,((DesignContext)_localctx).dp1.result;
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
		public TypeContext t1;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((ShapeContext)_localctx).t1 = type();
			((ShapeContext)_localctx).result =  ((ShapeContext)_localctx).t1.result;
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
		public TerminalNode SQUARE() { return getToken(PostHtmlParser.SQUARE, 0); }
		public TerminalNode RECTANGLE() { return getToken(PostHtmlParser.RECTANGLE, 0); }
		public TerminalNode OVAL() { return getToken(PostHtmlParser.OVAL, 0); }
		public TerminalNode STAR() { return getToken(PostHtmlParser.STAR, 0); }
		public TerminalNode PENTAGON() { return getToken(PostHtmlParser.PENTAGON, 0); }
		public TerminalNode HEXAGON() { return getToken(PostHtmlParser.HEXAGON, 0); }
		public TerminalNode OCTAGON() { return getToken(PostHtmlParser.OCTAGON, 0); }
		public TerminalNode HEART() { return getToken(PostHtmlParser.HEART, 0); }
		public TerminalNode CIRCLE() { return getToken(PostHtmlParser.CIRCLE, 0); }
		public TerminalNode TRIANGLE() { return getToken(PostHtmlParser.TRIANGLE, 0); }
		public TerminalNode TRAPEZIO() { return getToken(PostHtmlParser.TRAPEZIO, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				((TypeContext)_localctx).SQUARE = match(SQUARE);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).SQUARE!=null?((TypeContext)_localctx).SQUARE.getText():null));
				}
				break;
			case RECTANGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				((TypeContext)_localctx).RECTANGLE = match(RECTANGLE);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).RECTANGLE!=null?((TypeContext)_localctx).RECTANGLE.getText():null));
				}
				break;
			case OVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				((TypeContext)_localctx).OVAL = match(OVAL);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).OVAL!=null?((TypeContext)_localctx).OVAL.getText():null));
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				((TypeContext)_localctx).STAR = match(STAR);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).STAR!=null?((TypeContext)_localctx).STAR.getText():null));
				}
				break;
			case PENTAGON:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				((TypeContext)_localctx).PENTAGON = match(PENTAGON);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).PENTAGON!=null?((TypeContext)_localctx).PENTAGON.getText():null));
				}
				break;
			case HEXAGON:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				((TypeContext)_localctx).HEXAGON = match(HEXAGON);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).HEXAGON!=null?((TypeContext)_localctx).HEXAGON.getText():null));
				}
				break;
			case OCTAGON:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				((TypeContext)_localctx).OCTAGON = match(OCTAGON);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).OCTAGON!=null?((TypeContext)_localctx).OCTAGON.getText():null));
				}
				break;
			case HEART:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				((TypeContext)_localctx).HEART = match(HEART);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).HEART!=null?((TypeContext)_localctx).HEART.getText():null));
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				((TypeContext)_localctx).CIRCLE = match(CIRCLE);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).CIRCLE!=null?((TypeContext)_localctx).CIRCLE.getText():null));
				}
				break;
			case TRIANGLE:
				enterOuterAlt(_localctx, 10);
				{
				setState(63);
				((TypeContext)_localctx).TRIANGLE = match(TRIANGLE);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).TRIANGLE!=null?((TypeContext)_localctx).TRIANGLE.getText():null));
				}
				break;
			case TRAPEZIO:
				enterOuterAlt(_localctx, 11);
				{
				setState(65);
				((TypeContext)_localctx).TRAPEZIO = match(TRAPEZIO);
				((TypeContext)_localctx).result =  mkShape((((TypeContext)_localctx).TRAPEZIO!=null?((TypeContext)_localctx).TRAPEZIO.getText():null));
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
		public HeightContext ph1;
		public WidthContext wp1;
		public ColorContext pc1;
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((PropertyContext)_localctx).ph1 = height();
			setState(70);
			((PropertyContext)_localctx).wp1 = width();
			setState(71);
			((PropertyContext)_localctx).pc1 = color();
			((PropertyContext)_localctx).result =  mkProperty(((PropertyContext)_localctx).ph1.result,((PropertyContext)_localctx).wp1.result,((PropertyContext)_localctx).pc1.result);
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
		public TerminalNode RED() { return getToken(PostHtmlParser.RED, 0); }
		public TerminalNode BLUE() { return getToken(PostHtmlParser.BLUE, 0); }
		public TerminalNode BLACK() { return getToken(PostHtmlParser.BLACK, 0); }
		public TerminalNode PURPLE() { return getToken(PostHtmlParser.PURPLE, 0); }
		public TerminalNode YELLOW() { return getToken(PostHtmlParser.YELLOW, 0); }
		public TerminalNode PINK() { return getToken(PostHtmlParser.PINK, 0); }
		public TerminalNode GREEN() { return getToken(PostHtmlParser.GREEN, 0); }
		public TerminalNode WHITE() { return getToken(PostHtmlParser.WHITE, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_color);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RED:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((ColorContext)_localctx).RED = match(RED);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).RED!=null?((ColorContext)_localctx).RED.getText():null));
				}
				break;
			case BLUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				((ColorContext)_localctx).BLUE = match(BLUE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).BLUE!=null?((ColorContext)_localctx).BLUE.getText():null));
				}
				break;
			case BLACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				((ColorContext)_localctx).BLACK = match(BLACK);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).BLACK!=null?((ColorContext)_localctx).BLACK.getText():null));
				}
				break;
			case PURPLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				((ColorContext)_localctx).PURPLE = match(PURPLE);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).PURPLE!=null?((ColorContext)_localctx).PURPLE.getText():null));
				}
				break;
			case YELLOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				((ColorContext)_localctx).YELLOW = match(YELLOW);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).YELLOW!=null?((ColorContext)_localctx).YELLOW.getText():null));
				}
				break;
			case PINK:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				((ColorContext)_localctx).PINK = match(PINK);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).PINK!=null?((ColorContext)_localctx).PINK.getText():null));
				}
				break;
			case GREEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				((ColorContext)_localctx).GREEN = match(GREEN);
				((ColorContext)_localctx).result =  mkColor((((ColorContext)_localctx).GREEN!=null?((ColorContext)_localctx).GREEN.getText():null));
				}
				break;
			case WHITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				((ColorContext)_localctx).WHITE = match(WHITE);
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

	public static class HeightContext extends ParserRuleContext {
		public Sketch result;
		public NumberContext nh1;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((HeightContext)_localctx).nh1 = number();
			((HeightContext)_localctx).result =  ((HeightContext)_localctx).nh1.result;
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

	public static class WidthContext extends ParserRuleContext {
		public Sketch result;
		public NumberContext wn1;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((WidthContext)_localctx).wn1 = number();
			((WidthContext)_localctx).result =  ((WidthContext)_localctx).wn1.result;
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

	public static class NumberContext extends ParserRuleContext {
		public Sketch result;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(PostHtmlParser.INTEGER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((NumberContext)_localctx).INTEGER = match(INTEGER);
			((NumberContext)_localctx).result =  mkNumber(Integer.parseInt((((NumberContext)_localctx).INTEGER!=null?((NumberContext)_localctx).INTEGER.getText():null)));
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4%\n\4\r\4\16"+
		"\4&\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7F\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t]\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\2\2n\2\30\3\2\2\2\4\33\3\2\2\2\6$\3\2\2\2\b(\3\2"+
		"\2\2\n,\3\2\2\2\fE\3\2\2\2\16G\3\2\2\2\20\\\3\2\2\2\22^\3\2\2\2\24a\3"+
		"\2\2\2\26d\3\2\2\2\30\31\5\4\3\2\31\32\b\2\1\2\32\3\3\2\2\2\33\34\7\3"+
		"\2\2\34\35\5\6\4\2\35\36\7\4\2\2\36\37\b\3\1\2\37\5\3\2\2\2 !\5\b\5\2"+
		"!\"\b\4\1\2\"#\7\6\2\2#%\3\2\2\2$ \3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2"+
		"\2\2\'\7\3\2\2\2()\5\n\6\2)*\5\16\b\2*+\b\5\1\2+\t\3\2\2\2,-\5\f\7\2-"+
		".\b\6\1\2.\13\3\2\2\2/\60\7\7\2\2\60F\b\7\1\2\61\62\7\b\2\2\62F\b\7\1"+
		"\2\63\64\7\t\2\2\64F\b\7\1\2\65\66\7\n\2\2\66F\b\7\1\2\678\7\13\2\28F"+
		"\b\7\1\29:\7\f\2\2:F\b\7\1\2;<\7\r\2\2<F\b\7\1\2=>\7\16\2\2>F\b\7\1\2"+
		"?@\7\17\2\2@F\b\7\1\2AB\7\20\2\2BF\b\7\1\2CD\7\21\2\2DF\b\7\1\2E/\3\2"+
		"\2\2E\61\3\2\2\2E\63\3\2\2\2E\65\3\2\2\2E\67\3\2\2\2E9\3\2\2\2E;\3\2\2"+
		"\2E=\3\2\2\2E?\3\2\2\2EA\3\2\2\2EC\3\2\2\2F\r\3\2\2\2GH\5\22\n\2HI\5\24"+
		"\13\2IJ\5\20\t\2JK\b\b\1\2K\17\3\2\2\2LM\7\22\2\2M]\b\t\1\2NO\7\23\2\2"+
		"O]\b\t\1\2PQ\7\24\2\2Q]\b\t\1\2RS\7\25\2\2S]\b\t\1\2TU\7\31\2\2U]\b\t"+
		"\1\2VW\7\30\2\2W]\b\t\1\2XY\7\27\2\2Y]\b\t\1\2Z[\7\26\2\2[]\b\t\1\2\\"+
		"L\3\2\2\2\\N\3\2\2\2\\P\3\2\2\2\\R\3\2\2\2\\T\3\2\2\2\\V\3\2\2\2\\X\3"+
		"\2\2\2\\Z\3\2\2\2]\21\3\2\2\2^_\5\26\f\2_`\b\n\1\2`\23\3\2\2\2ab\5\26"+
		"\f\2bc\b\13\1\2c\25\3\2\2\2de\7\5\2\2ef\b\f\1\2f\27\3\2\2\2\5&E\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}