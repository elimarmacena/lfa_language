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
		DO=10, RETURN=11, SQUARE=12, RECTANGLE=13, OVAL=14, PENTAGON=15, OCTAGON=16, 
		CIRCLE=17, TRIANGLE=18, TRAPEZIO=19, RED=20, BLUE=21, BLACK=22, PURPLE=23, 
		WHITE=24, GREEN=25, PINK=26, YELLOW=27, DRAWID=28, KEYCREATEF=29, IDENT=30, 
		HEX_NUM=31, HASH=32, GETS=33, PLUS=34, MINUS=35, TIMES=36, DIVIDE=37, 
		MOD=38, EXP=39, LPAR=40, RPAR=41, LBRC=42, RBRC=43, COMMA=44, SEMI=45, 
		EQU=46, NEQ=47, LT=48, LEQ=49, GT=50, GEQ=51, WS=52, COMMENT=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"CUSTOM", "NUMERO", "'or'", "'and'", "'not'", "'if'", "'then'", "'else'", 
		"'while'", "'do'", "'return'", "'square'", "'rectangle'", "'oval'", "'pentagon'", 
		"'octagon'", "'circle'", "'triangle'", "'trapezio'", "'red'", "'blue'", 
		"'black'", "'purple'", "'white'", "'green'", "'pink'", "'yellow'", "'skt'", 
		"'def'", "IDENT", "HEX_NUM", "'#'", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'('", "')'", "'{'", "'}'", "','", "';'", "'=='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"CUSTOM", "DIGITS", "NUMERO", "OR", "AND", "NOT", "IF", "THEN", "ELSE", 
		"WHILE", "DO", "RETURN", "SQUARE", "RECTANGLE", "OVAL", "PENTAGON", "OCTAGON", 
		"CIRCLE", "TRIANGLE", "TRAPEZIO", "RED", "BLUE", "BLACK", "PURPLE", "WHITE", 
		"GREEN", "PINK", "YELLOW", "DRAWID", "KEYCREATEF", "IDENT", "HEX_NUM", 
		"HASH", "GETS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "EXP", "LPAR", 
		"RPAR", "LBRC", "RBRC", "COMMA", "SEMI", "EQU", "NEQ", "LT", "LEQ", "GT", 
		"GEQ", "WS", "COMMENT"
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
		case 52: WS_action((RuleContext)_localctx, actionIndex); break;

		case 53: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\67\u0168\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\5\2s\n\2\3\3\6\3v\n\3"+
		"\r\3\16\3w\3\4\3\4\3\4\5\4}\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3 \3 \7 \u011f\n \f \16 \u0122\13 \3!\3!\7!\u0126\n"+
		"!\f!\16!\u0129\13!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\6\66\u0158\n\66"+
		"\r\66\16\66\u0159\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0162\n\67\f\67\16"+
		"\67\u0165\13\67\3\67\3\67\28\3\3\1\5\2\1\7\4\1\t\5\1\13\6\1\r\7\1\17\b"+
		"\1\21\t\1\23\n\1\25\13\1\27\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1#"+
		"\22\1%\23\1\'\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67"+
		"\34\19\35\1;\36\1=\37\1? \1A!\1C\"\1E#\1G$\1I%\1K&\1M\'\1O(\1Q)\1S*\1"+
		"U+\1W,\1Y-\1[.\1]/\1_\60\1a\61\1c\62\1e\63\1g\64\1i\65\1k\66\2m\67\3\3"+
		"\2\b\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\62;aa\5\2\13\f\17\17\"\"\3"+
		"\2\f\f\u016d\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\3o\3\2\2\2\5u\3\2\2\2\7y\3\2\2\2\t~\3\2\2\2\13\u0081\3\2\2\2\r\u0085"+
		"\3\2\2\2\17\u0089\3\2\2\2\21\u008c\3\2\2\2\23\u0091\3\2\2\2\25\u0096\3"+
		"\2\2\2\27\u009c\3\2\2\2\31\u009f\3\2\2\2\33\u00a6\3\2\2\2\35\u00ad\3\2"+
		"\2\2\37\u00b7\3\2\2\2!\u00bc\3\2\2\2#\u00c5\3\2\2\2%\u00cd\3\2\2\2\'\u00d4"+
		"\3\2\2\2)\u00dd\3\2\2\2+\u00e6\3\2\2\2-\u00ea\3\2\2\2/\u00ef\3\2\2\2\61"+
		"\u00f5\3\2\2\2\63\u00fc\3\2\2\2\65\u0102\3\2\2\2\67\u0108\3\2\2\29\u010d"+
		"\3\2\2\2;\u0114\3\2\2\2=\u0118\3\2\2\2?\u011c\3\2\2\2A\u0123\3\2\2\2C"+
		"\u012a\3\2\2\2E\u012c\3\2\2\2G\u012e\3\2\2\2I\u0130\3\2\2\2K\u0132\3\2"+
		"\2\2M\u0134\3\2\2\2O\u0136\3\2\2\2Q\u0138\3\2\2\2S\u013a\3\2\2\2U\u013c"+
		"\3\2\2\2W\u013e\3\2\2\2Y\u0140\3\2\2\2[\u0142\3\2\2\2]\u0144\3\2\2\2_"+
		"\u0146\3\2\2\2a\u0149\3\2\2\2c\u014c\3\2\2\2e\u014e\3\2\2\2g\u0151\3\2"+
		"\2\2i\u0153\3\2\2\2k\u0157\3\2\2\2m\u015d\3\2\2\2or\5C\"\2ps\5? \2qs\5"+
		"A!\2rp\3\2\2\2rq\3\2\2\2s\4\3\2\2\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2x\6\3\2\2\2y|\5\5\3\2z{\7\60\2\2{}\5\5\3\2|z\3\2\2\2|"+
		"}\3\2\2\2}\b\3\2\2\2~\177\7q\2\2\177\u0080\7t\2\2\u0080\n\3\2\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7p\2\2\u0083\u0084\7f\2\2\u0084\f\3\2\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u0087\7q\2\2\u0087\u0088\7v\2\2\u0088\16\3\2\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7h\2\2\u008b\20\3\2\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7j\2\2\u008e\u008f\7g\2\2\u008f\u0090\7p\2\2\u0090\22\3\2\2\2\u0091"+
		"\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2"+
		"\u0095\24\3\2\2\2\u0096\u0097\7y\2\2\u0097\u0098\7j\2\2\u0098\u0099\7"+
		"k\2\2\u0099\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b\26\3\2\2\2\u009c\u009d"+
		"\7f\2\2\u009d\u009e\7q\2\2\u009e\30\3\2\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7p\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7s\2\2\u00a8"+
		"\u00a9\7w\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\34\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7"+
		"e\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4"+
		"\7i\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\36\3\2\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7n\2\2\u00bb"+
		" \3\2\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7i\2\2\u00c2\u00c3\7q\2\2"+
		"\u00c3\u00c4\7p\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7e"+
		"\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7i\2\2\u00ca\u00cb"+
		"\7q\2\2\u00cb\u00cc\7p\2\2\u00cc$\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf"+
		"\7k\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7n\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3&\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6"+
		"\u00d7\7k\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7i\2\2"+
		"\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc(\3\2\2\2\u00dd\u00de\7v\2"+
		"\2\u00de\u00df\7t\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2"+
		"\7g\2\2\u00e2\u00e3\7|\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7q\2\2\u00e5"+
		"*\3\2\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7f\2\2\u00e9"+
		",\3\2\2\2\u00ea\u00eb\7d\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7w\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7d\2\2\u00f0\u00f1\7n\2\2\u00f1"+
		"\u00f2\7c\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7m\2\2\u00f4\60\3\2\2\2\u00f5"+
		"\u00f6\7r\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7r\2\2"+
		"\u00f9\u00fa\7n\2\2\u00fa\u00fb\7g\2\2\u00fb\62\3\2\2\2\u00fc\u00fd\7"+
		"y\2\2\u00fd\u00fe\7j\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7v\2\2\u0100\u0101"+
		"\7g\2\2\u0101\64\3\2\2\2\u0102\u0103\7i\2\2\u0103\u0104\7t\2\2\u0104\u0105"+
		"\7g\2\2\u0105\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107\66\3\2\2\2\u0108\u0109"+
		"\7r\2\2\u0109\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c\7m\2\2\u010c"+
		"8\3\2\2\2\u010d\u010e\7{\2\2\u010e\u010f\7g\2\2\u010f\u0110\7n\2\2\u0110"+
		"\u0111\7n\2\2\u0111\u0112\7q\2\2\u0112\u0113\7y\2\2\u0113:\3\2\2\2\u0114"+
		"\u0115\7u\2\2\u0115\u0116\7m\2\2\u0116\u0117\7v\2\2\u0117<\3\2\2\2\u0118"+
		"\u0119\7f\2\2\u0119\u011a\7g\2\2\u011a\u011b\7h\2\2\u011b>\3\2\2\2\u011c"+
		"\u0120\t\3\2\2\u011d\u011f\t\4\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121@\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0127\t\5\2\2\u0124\u0126\t\4\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128B\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u012a\u012b\7%\2\2\u012bD\3\2\2\2\u012c\u012d\7?"+
		"\2\2\u012dF\3\2\2\2\u012e\u012f\7-\2\2\u012fH\3\2\2\2\u0130\u0131\7/\2"+
		"\2\u0131J\3\2\2\2\u0132\u0133\7,\2\2\u0133L\3\2\2\2\u0134\u0135\7\61\2"+
		"\2\u0135N\3\2\2\2\u0136\u0137\7\'\2\2\u0137P\3\2\2\2\u0138\u0139\7`\2"+
		"\2\u0139R\3\2\2\2\u013a\u013b\7*\2\2\u013bT\3\2\2\2\u013c\u013d\7+\2\2"+
		"\u013dV\3\2\2\2\u013e\u013f\7}\2\2\u013fX\3\2\2\2\u0140\u0141\7\177\2"+
		"\2\u0141Z\3\2\2\2\u0142\u0143\7.\2\2\u0143\\\3\2\2\2\u0144\u0145\7=\2"+
		"\2\u0145^\3\2\2\2\u0146\u0147\7?\2\2\u0147\u0148\7?\2\2\u0148`\3\2\2\2"+
		"\u0149\u014a\7#\2\2\u014a\u014b\7?\2\2\u014bb\3\2\2\2\u014c\u014d\7>\2"+
		"\2\u014dd\3\2\2\2\u014e\u014f\7>\2\2\u014f\u0150\7?\2\2\u0150f\3\2\2\2"+
		"\u0151\u0152\7@\2\2\u0152h\3\2\2\2\u0153\u0154\7@\2\2\u0154\u0155\7?\2"+
		"\2\u0155j\3\2\2\2\u0156\u0158\t\6\2\2\u0157\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\b\66\2\2\u015cl\3\2\2\2\u015d\u015e\7\61\2\2\u015e\u015f\7\61\2"+
		"\2\u015f\u0163\3\2\2\2\u0160\u0162\n\7\2\2\u0161\u0160\3\2\2\2\u0162\u0165"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\b\67\3\2\u0167n\3\2\2\2\n\2rw|\u0120\u0127"+
		"\u0159\u0163";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}