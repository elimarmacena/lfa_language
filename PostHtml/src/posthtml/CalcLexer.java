// Generated from C:\Users\elmr\Documents\GITHUB\lfa_language\PostHtml\Grammar\Calc.g4 by ANTLR 4.1
package posthtml;

import workload.Expr;
import workload.Sketch;
import workload.Operator;
import static workload.Expr.*;
import static workload.Sketch.*;
import workload.Op;
import java.util.LinkedList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERO", "'or'", "'and'", "'not'", "'if'", "'then'", "'else'", "'while'", 
		"'do'", "DRAWID", "IDENT", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
		"'('", "')'", "'{'", "'}'", "','", "';'", "'=='", "'!='", "'<'", "'<='", 
		"'>'", "'>='", "'square'", "'rectangle'", "'oval'", "'star'", "'pentagon'", 
		"'hexagon'", "'octagon'", "'heart'", "'CIRCLE'", "'triangle'", "'trapezio'", 
		"'red'", "'blue'", "'black'", "'purple'", "'white'", "'green'", "'pink'", 
		"'yellow'", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"DIGITS", "NUMERO", "OR", "AND", "NOT", "IF", "THEN", "ELSE", "WHILE", 
		"DO", "DRAWID", "IDENT", "GETS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", 
		"EXP", "LPAR", "RPAR", "LBRC", "RBRC", "COMMA", "SEMI", "EQU", "NEQ", 
		"LT", "LEQ", "GT", "GEQ", "SQUARE", "RECTANGLE", "OVAL", "STAR", "PENTAGON", 
		"HEXAGON", "OCTAGON", "HEART", "CIRCLE", "TRIANGLE", "TRAPEZIO", "RED", 
		"BLUE", "BLACK", "PURPLE", "WHITE", "GREEN", "PINK", "YELLOW", "WS", "COMMENT"
	};


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 50: WS_action((RuleContext)_localctx, actionIndex); break;

		case 51: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\65\u0162\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\6\2m\n\2\r\2\16\2n\3\3\3\3\3\3\5\3t\n\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u009d\n\f\3\r\3\r\7\r\u00a1\n\r\f\r\16\r\u00a4\13\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\6\64\u0152\n\64\r\64\16\64\u0153\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\7\65\u015c\n\65\f\65\16\65\u015f\13\65\3\65\3"+
		"\65\2\66\3\2\1\5\3\1\7\4\1\t\5\1\13\6\1\r\7\1\17\b\1\21\t\1\23\n\1\25"+
		"\13\1\27\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1#\22\1%\23\1\'\24\1)"+
		"\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67\34\19\35\1;\36\1=\37"+
		"\1? \1A!\1C\"\1E#\1G$\1I%\1K&\1M\'\1O(\1Q)\1S*\1U+\1W,\1Y-\1[.\1]/\1_"+
		"\60\1a\61\1c\62\1e\63\1g\64\2i\65\3\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C"+
		"\\aac|\5\2\13\f\17\17\"\"\3\2\f\f\u0166\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\3l\3\2\2\2\5p\3\2\2\2\7u\3\2\2\2\tx\3\2\2\2\13|\3\2\2\2\r\u0080"+
		"\3\2\2\2\17\u0083\3\2\2\2\21\u0088\3\2\2\2\23\u008d\3\2\2\2\25\u0093\3"+
		"\2\2\2\27\u009c\3\2\2\2\31\u009e\3\2\2\2\33\u00a5\3\2\2\2\35\u00a7\3\2"+
		"\2\2\37\u00a9\3\2\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2\2%\u00af\3\2\2\2\'\u00b1"+
		"\3\2\2\2)\u00b3\3\2\2\2+\u00b5\3\2\2\2-\u00b7\3\2\2\2/\u00b9\3\2\2\2\61"+
		"\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67\u00c2\3\2\2\29\u00c5"+
		"\3\2\2\2;\u00c7\3\2\2\2=\u00ca\3\2\2\2?\u00cc\3\2\2\2A\u00cf\3\2\2\2C"+
		"\u00d6\3\2\2\2E\u00e0\3\2\2\2G\u00e5\3\2\2\2I\u00ea\3\2\2\2K\u00f3\3\2"+
		"\2\2M\u00fb\3\2\2\2O\u0103\3\2\2\2Q\u0109\3\2\2\2S\u0110\3\2\2\2U\u0119"+
		"\3\2\2\2W\u0122\3\2\2\2Y\u0126\3\2\2\2[\u012b\3\2\2\2]\u0131\3\2\2\2_"+
		"\u0138\3\2\2\2a\u013e\3\2\2\2c\u0144\3\2\2\2e\u0149\3\2\2\2g\u0151\3\2"+
		"\2\2i\u0157\3\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"o\4\3\2\2\2ps\5\3\2\2qr\7\60\2\2rt\5\3\2\2sq\3\2\2\2st\3\2\2\2t\6\3\2"+
		"\2\2uv\7q\2\2vw\7t\2\2w\b\3\2\2\2xy\7c\2\2yz\7p\2\2z{\7f\2\2{\n\3\2\2"+
		"\2|}\7p\2\2}~\7q\2\2~\177\7v\2\2\177\f\3\2\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7h\2\2\u0082\16\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085\7j\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7p\2\2\u0087\20\3\2\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\22\3\2\2\2\u008d"+
		"\u008e\7y\2\2\u008e\u008f\7j\2\2\u008f\u0090\7k\2\2\u0090\u0091\7n\2\2"+
		"\u0091\u0092\7g\2\2\u0092\24\3\2\2\2\u0093\u0094\7f\2\2\u0094\u0095\7"+
		"q\2\2\u0095\26\3\2\2\2\u0096\u0097\7u\2\2\u0097\u0098\7m\2\2\u0098\u009d"+
		"\7v\2\2\u0099\u009a\7U\2\2\u009a\u009b\7M\2\2\u009b\u009d\7V\2\2\u009c"+
		"\u0096\3\2\2\2\u009c\u0099\3\2\2\2\u009d\30\3\2\2\2\u009e\u00a2\t\3\2"+
		"\2\u009f\u00a1\t\4\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\32\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\7?\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8\36\3\2\2\2\u00a9"+
		"\u00aa\7/\2\2\u00aa \3\2\2\2\u00ab\u00ac\7,\2\2\u00ac\"\3\2\2\2\u00ad"+
		"\u00ae\7\61\2\2\u00ae$\3\2\2\2\u00af\u00b0\7\'\2\2\u00b0&\3\2\2\2\u00b1"+
		"\u00b2\7`\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4*\3\2\2\2\u00b5\u00b6"+
		"\7+\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7"+
		"\177\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc\62\3\2\2\2\u00bd\u00be"+
		"\7=\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0\u00c1\7?\2\2\u00c1\66"+
		"\3\2\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c4\7?\2\2\u00c48\3\2\2\2\u00c5\u00c6"+
		"\7>\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8\u00c9\7?\2\2\u00c9<\3"+
		"\2\2\2\u00ca\u00cb\7@\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7s\2\2\u00d1\u00d2"+
		"\7w\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7g\2\2\u00d5"+
		"B\3\2\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7e\2\2\u00d9"+
		"\u00da\7v\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7i\2\2"+
		"\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2\u00dfD\3\2\2\2\u00e0\u00e1\7q\2"+
		"\2\u00e1\u00e2\7x\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7n\2\2\u00e4F\3\2"+
		"\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9"+
		"\7t\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7p\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7i\2\2\u00f0"+
		"\u00f1\7q\2\2\u00f1\u00f2\7p\2\2\u00f2J\3\2\2\2\u00f3\u00f4\7j\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7z\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7i\2\2"+
		"\u00f8\u00f9\7q\2\2\u00f9\u00fa\7p\2\2\u00faL\3\2\2\2\u00fb\u00fc\7q\2"+
		"\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100"+
		"\7i\2\2\u0100\u0101\7q\2\2\u0101\u0102\7p\2\2\u0102N\3\2\2\2\u0103\u0104"+
		"\7j\2\2\u0104\u0105\7g\2\2\u0105\u0106\7c\2\2\u0106\u0107\7t\2\2\u0107"+
		"\u0108\7v\2\2\u0108P\3\2\2\2\u0109\u010a\7E\2\2\u010a\u010b\7K\2\2\u010b"+
		"\u010c\7T\2\2\u010c\u010d\7E\2\2\u010d\u010e\7N\2\2\u010e\u010f\7G\2\2"+
		"\u010fR\3\2\2\2\u0110\u0111\7v\2\2\u0111\u0112\7t\2\2\u0112\u0113\7k\2"+
		"\2\u0113\u0114\7c\2\2\u0114\u0115\7p\2\2\u0115\u0116\7i\2\2\u0116\u0117"+
		"\7n\2\2\u0117\u0118\7g\2\2\u0118T\3\2\2\2\u0119\u011a\7v\2\2\u011a\u011b"+
		"\7t\2\2\u011b\u011c\7c\2\2\u011c\u011d\7r\2\2\u011d\u011e\7g\2\2\u011e"+
		"\u011f\7|\2\2\u011f\u0120\7k\2\2\u0120\u0121\7q\2\2\u0121V\3\2\2\2\u0122"+
		"\u0123\7t\2\2\u0123\u0124\7g\2\2\u0124\u0125\7f\2\2\u0125X\3\2\2\2\u0126"+
		"\u0127\7d\2\2\u0127\u0128\7n\2\2\u0128\u0129\7w\2\2\u0129\u012a\7g\2\2"+
		"\u012aZ\3\2\2\2\u012b\u012c\7d\2\2\u012c\u012d\7n\2\2\u012d\u012e\7c\2"+
		"\2\u012e\u012f\7e\2\2\u012f\u0130\7m\2\2\u0130\\\3\2\2\2\u0131\u0132\7"+
		"r\2\2\u0132\u0133\7w\2\2\u0133\u0134\7t\2\2\u0134\u0135\7r\2\2\u0135\u0136"+
		"\7n\2\2\u0136\u0137\7g\2\2\u0137^\3\2\2\2\u0138\u0139\7y\2\2\u0139\u013a"+
		"\7j\2\2\u013a\u013b\7k\2\2\u013b\u013c\7v\2\2\u013c\u013d\7g\2\2\u013d"+
		"`\3\2\2\2\u013e\u013f\7i\2\2\u013f\u0140\7t\2\2\u0140\u0141\7g\2\2\u0141"+
		"\u0142\7g\2\2\u0142\u0143\7p\2\2\u0143b\3\2\2\2\u0144\u0145\7r\2\2\u0145"+
		"\u0146\7k\2\2\u0146\u0147\7p\2\2\u0147\u0148\7m\2\2\u0148d\3\2\2\2\u0149"+
		"\u014a\7{\2\2\u014a\u014b\7g\2\2\u014b\u014c\7n\2\2\u014c\u014d\7n\2\2"+
		"\u014d\u014e\7q\2\2\u014e\u014f\7y\2\2\u014ff\3\2\2\2\u0150\u0152\t\5"+
		"\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b\64\2\2\u0156h\3\2\2\2"+
		"\u0157\u0158\7\61\2\2\u0158\u0159\7\61\2\2\u0159\u015d\3\2\2\2\u015a\u015c"+
		"\n\6\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\b\65"+
		"\3\2\u0161j\3\2\2\2\t\2ns\u009c\u00a2\u0153\u015d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}