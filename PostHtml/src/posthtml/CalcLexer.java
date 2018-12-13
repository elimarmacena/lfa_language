// Generated from C:\Users\joel-\Desktop\lfa_language\PostHtml\Grammar\Calc.g4 by ANTLR 4.1
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
		CUSTOM=1, NUMERO=2, OR=3, AND=4, NOT=5, IF=6, THEN=7, ELSE=8, WHILE=9, 
		DO=10, SQUARE=11, RECTANGLE=12, OVAL=13, PENTAGON=14, OCTAGON=15, CIRCLE=16, 
		TRIANGLE=17, TRAPEZIO=18, RED=19, BLUE=20, BLACK=21, PURPLE=22, WHITE=23, 
		GREEN=24, PINK=25, YELLOW=26, DRAWID=27, KEYCREATEF=28, IDENT=29, HEX_NUM=30, 
		HASH=31, GETS=32, PLUS=33, MINUS=34, TIMES=35, DIVIDE=36, MOD=37, EXP=38, 
		LPAR=39, RPAR=40, LBRC=41, RBRC=42, COMMA=43, SEMI=44, EQU=45, NEQ=46, 
		LT=47, LEQ=48, GT=49, GEQ=50, WS=51, COMMENT=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"CUSTOM", "NUMERO", "'or'", "'and'", "'not'", "'if'", "'then'", "'else'", 
		"'while'", "'do'", "'square'", "'rectangle'", "'oval'", "'pentagon'", 
		"'octagon'", "'circle'", "'triangle'", "'trapezio'", "'red'", "'blue'", 
		"'black'", "'purple'", "'white'", "'green'", "'pink'", "'yellow'", "'skt'", 
		"'def'", "IDENT", "HEX_NUM", "'#'", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'('", "')'", "'{'", "'}'", "','", "';'", "'=='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"CUSTOM", "DIGITS", "NUMERO", "OR", "AND", "NOT", "IF", "THEN", "ELSE", 
		"WHILE", "DO", "SQUARE", "RECTANGLE", "OVAL", "PENTAGON", "OCTAGON", "CIRCLE", 
		"TRIANGLE", "TRAPEZIO", "RED", "BLUE", "BLACK", "PURPLE", "WHITE", "GREEN", 
		"PINK", "YELLOW", "DRAWID", "KEYCREATEF", "IDENT", "HEX_NUM", "HASH", 
		"GETS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "EXP", "LPAR", "RPAR", 
		"LBRC", "RBRC", "COMMA", "SEMI", "EQU", "NEQ", "LT", "LEQ", "GT", "GEQ", 
		"WS", "COMMENT"
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
		case 51: WS_action((RuleContext)_localctx, actionIndex); break;

		case 52: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\66\u015f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\5\2q\n\2\3\3\6\3t\n\3\r\3\16\3u"+
		"\3\4\3\4\3\4\5\4{\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u0116\n\37"+
		"\f\37\16\37\u0119\13\37\3 \3 \7 \u011d\n \f \16 \u0120\13 \3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\6\65\u014f\n\65\r\65\16\65\u0150\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\7\66\u0159\n\66\f\66\16\66\u015c\13\66\3\66\3\66\2\67\3\3\1\5"+
		"\2\1\7\4\1\t\5\1\13\6\1\r\7\1\17\b\1\21\t\1\23\n\1\25\13\1\27\f\1\31\r"+
		"\1\33\16\1\35\17\1\37\20\1!\21\1#\22\1%\23\1\'\24\1)\25\1+\26\1-\27\1"+
		"/\30\1\61\31\1\63\32\1\65\33\1\67\34\19\35\1;\36\1=\37\1? \1A!\1C\"\1"+
		"E#\1G$\1I%\1K&\1M\'\1O(\1Q)\1S*\1U+\1W,\1Y-\1[.\1]/\1_\60\1a\61\1c\62"+
		"\1e\63\1g\64\1i\65\2k\66\3\3\2\b\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"\62;aa\5\2\13\f\17\17\"\"\3\2\f\f\u0164\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5s\3\2\2\2\7w\3\2\2\2\t|\3\2\2\2\13\177"+
		"\3\2\2\2\r\u0083\3\2\2\2\17\u0087\3\2\2\2\21\u008a\3\2\2\2\23\u008f\3"+
		"\2\2\2\25\u0094\3\2\2\2\27\u009a\3\2\2\2\31\u009d\3\2\2\2\33\u00a4\3\2"+
		"\2\2\35\u00ae\3\2\2\2\37\u00b3\3\2\2\2!\u00bc\3\2\2\2#\u00c4\3\2\2\2%"+
		"\u00cb\3\2\2\2\'\u00d4\3\2\2\2)\u00dd\3\2\2\2+\u00e1\3\2\2\2-\u00e6\3"+
		"\2\2\2/\u00ec\3\2\2\2\61\u00f3\3\2\2\2\63\u00f9\3\2\2\2\65\u00ff\3\2\2"+
		"\2\67\u0104\3\2\2\29\u010b\3\2\2\2;\u010f\3\2\2\2=\u0113\3\2\2\2?\u011a"+
		"\3\2\2\2A\u0121\3\2\2\2C\u0123\3\2\2\2E\u0125\3\2\2\2G\u0127\3\2\2\2I"+
		"\u0129\3\2\2\2K\u012b\3\2\2\2M\u012d\3\2\2\2O\u012f\3\2\2\2Q\u0131\3\2"+
		"\2\2S\u0133\3\2\2\2U\u0135\3\2\2\2W\u0137\3\2\2\2Y\u0139\3\2\2\2[\u013b"+
		"\3\2\2\2]\u013d\3\2\2\2_\u0140\3\2\2\2a\u0143\3\2\2\2c\u0145\3\2\2\2e"+
		"\u0148\3\2\2\2g\u014a\3\2\2\2i\u014e\3\2\2\2k\u0154\3\2\2\2mp\5A!\2nq"+
		"\5=\37\2oq\5? \2pn\3\2\2\2po\3\2\2\2q\4\3\2\2\2rt\t\2\2\2sr\3\2\2\2tu"+
		"\3\2\2\2us\3\2\2\2uv\3\2\2\2v\6\3\2\2\2wz\5\5\3\2xy\7\60\2\2y{\5\5\3\2"+
		"zx\3\2\2\2z{\3\2\2\2{\b\3\2\2\2|}\7q\2\2}~\7t\2\2~\n\3\2\2\2\177\u0080"+
		"\7c\2\2\u0080\u0081\7p\2\2\u0081\u0082\7f\2\2\u0082\f\3\2\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7q\2\2\u0085\u0086\7v\2\2\u0086\16\3\2\2\2\u0087\u0088"+
		"\7k\2\2\u0088\u0089\7h\2\2\u0089\20\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c"+
		"\7j\2\2\u008c\u008d\7g\2\2\u008d\u008e\7p\2\2\u008e\22\3\2\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093"+
		"\24\3\2\2\2\u0094\u0095\7y\2\2\u0095\u0096\7j\2\2\u0096\u0097\7k\2\2\u0097"+
		"\u0098\7n\2\2\u0098\u0099\7g\2\2\u0099\26\3\2\2\2\u009a\u009b\7f\2\2\u009b"+
		"\u009c\7q\2\2\u009c\30\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7s\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\32\3\2\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7"+
		"e\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab"+
		"\7i\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad\34\3\2\2\2\u00ae\u00af"+
		"\7q\2\2\u00af\u00b0\7x\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\36\3\2\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7i\2\2\u00b9\u00ba\7q\2\2"+
		"\u00ba\u00bb\7p\2\2\u00bb \3\2\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7e\2"+
		"\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2"+
		"\7q\2\2\u00c2\u00c3\7p\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6"+
		"\7k\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7n\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7i\2\2"+
		"\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2\u00d3&\3\2\2\2\u00d4\u00d5\7v\2"+
		"\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9\u00da\7|\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"(\3\2\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7f\2\2\u00e0"+
		"*\3\2\2\2\u00e1\u00e2\7d\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7w\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5,\3\2\2\2\u00e6\u00e7\7d\2\2\u00e7\u00e8\7n\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7m\2\2\u00eb.\3\2\2\2\u00ec"+
		"\u00ed\7r\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7r\2\2"+
		"\u00f0\u00f1\7n\2\2\u00f1\u00f2\7g\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7"+
		"y\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8\62\3\2\2\2\u00f9\u00fa\7i\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7p\2\2\u00fe\64\3\2\2\2\u00ff\u0100"+
		"\7r\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7m\2\2\u0103"+
		"\66\3\2\2\2\u0104\u0105\7{\2\2\u0105\u0106\7g\2\2\u0106\u0107\7n\2\2\u0107"+
		"\u0108\7n\2\2\u0108\u0109\7q\2\2\u0109\u010a\7y\2\2\u010a8\3\2\2\2\u010b"+
		"\u010c\7u\2\2\u010c\u010d\7m\2\2\u010d\u010e\7v\2\2\u010e:\3\2\2\2\u010f"+
		"\u0110\7f\2\2\u0110\u0111\7g\2\2\u0111\u0112\7h\2\2\u0112<\3\2\2\2\u0113"+
		"\u0117\t\3\2\2\u0114\u0116\t\4\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118>\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u011a\u011e\t\5\2\2\u011b\u011d\t\4\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f@\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0121\u0122\7%\2\2\u0122B\3\2\2\2\u0123\u0124\7?"+
		"\2\2\u0124D\3\2\2\2\u0125\u0126\7-\2\2\u0126F\3\2\2\2\u0127\u0128\7/\2"+
		"\2\u0128H\3\2\2\2\u0129\u012a\7,\2\2\u012aJ\3\2\2\2\u012b\u012c\7\61\2"+
		"\2\u012cL\3\2\2\2\u012d\u012e\7\'\2\2\u012eN\3\2\2\2\u012f\u0130\7`\2"+
		"\2\u0130P\3\2\2\2\u0131\u0132\7*\2\2\u0132R\3\2\2\2\u0133\u0134\7+\2\2"+
		"\u0134T\3\2\2\2\u0135\u0136\7}\2\2\u0136V\3\2\2\2\u0137\u0138\7\177\2"+
		"\2\u0138X\3\2\2\2\u0139\u013a\7.\2\2\u013aZ\3\2\2\2\u013b\u013c\7=\2\2"+
		"\u013c\\\3\2\2\2\u013d\u013e\7?\2\2\u013e\u013f\7?\2\2\u013f^\3\2\2\2"+
		"\u0140\u0141\7#\2\2\u0141\u0142\7?\2\2\u0142`\3\2\2\2\u0143\u0144\7>\2"+
		"\2\u0144b\3\2\2\2\u0145\u0146\7>\2\2\u0146\u0147\7?\2\2\u0147d\3\2\2\2"+
		"\u0148\u0149\7@\2\2\u0149f\3\2\2\2\u014a\u014b\7@\2\2\u014b\u014c\7?\2"+
		"\2\u014ch\3\2\2\2\u014d\u014f\t\6\2\2\u014e\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\b\65\2\2\u0153j\3\2\2\2\u0154\u0155\7\61\2\2\u0155\u0156\7\61\2"+
		"\2\u0156\u015a\3\2\2\2\u0157\u0159\n\7\2\2\u0158\u0157\3\2\2\2\u0159\u015c"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015d\u015e\b\66\3\2\u015el\3\2\2\2\n\2puz\u0117\u011e"+
		"\u0150\u015a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}