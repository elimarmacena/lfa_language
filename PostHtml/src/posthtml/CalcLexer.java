// Generated from /home/joelw/Área de Trabalho/LFA/lfa_language/PostHtml/Grammar/Calc.g4 by ANTLR 4.1
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
		NUMERO=1, OR=2, AND=3, NOT=4, IF=5, THEN=6, ELSE=7, WHILE=8, DO=9, SQUARE=10, 
		RECTANGLE=11, OVAL=12, PENTAGON=13, OCTAGON=14, CIRCLE=15, TRIANGLE=16, 
		TRAPEZIO=17, RED=18, BLUE=19, BLACK=20, PURPLE=21, WHITE=22, GREEN=23, 
		PINK=24, YELLOW=25, DRAWID=26, IDENT=27, GETS=28, PLUS=29, MINUS=30, TIMES=31, 
		DIVIDE=32, MOD=33, EXP=34, LPAR=35, RPAR=36, LBRC=37, RBRC=38, COMMA=39, 
		SEMI=40, EQU=41, NEQ=42, LT=43, LEQ=44, GT=45, GEQ=46, WS=47, COMMENT=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERO", "'or'", "'and'", "'not'", "'if'", "'then'", "'else'", "'while'", 
		"'do'", "'square'", "'rectangle'", "'oval'", "'pentagon'", "'octagon'", 
		"'CIRCLE'", "'triangle'", "'trapezio'", "'red'", "'blue'", "'black'", 
		"'purple'", "'white'", "'green'", "'pink'", "'yellow'", "DRAWID", "IDENT", 
		"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'('", "')'", "'{'", 
		"'}'", "','", "';'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "WS", 
		"COMMENT"
	};
	public static final String[] ruleNames = {
		"DIGITS", "NUMERO", "OR", "AND", "NOT", "IF", "THEN", "ELSE", "WHILE", 
		"DO", "SQUARE", "RECTANGLE", "OVAL", "PENTAGON", "OCTAGON", "CIRCLE", 
		"TRIANGLE", "TRAPEZIO", "RED", "BLUE", "BLACK", "PURPLE", "WHITE", "GREEN", 
		"PINK", "YELLOW", "DRAWID", "IDENT", "GETS", "PLUS", "MINUS", "TIMES", 
		"DIVIDE", "MOD", "EXP", "LPAR", "RPAR", "LBRC", "RBRC", "COMMA", "SEMI", 
		"EQU", "NEQ", "LT", "LEQ", "GT", "GEQ", "WS", "COMMENT"
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
		case 47: WS_action((RuleContext)_localctx, actionIndex); break;

		case 48: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\62\u0149\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\6\2g\n\2\r"+
		"\2\16\2h\3\3\3\3\3\3\5\3n\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0105\n\34\3\35\3\35\7\35\u0109\n"+
		"\35\f\35\16\35\u010c\13\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3"+
		"-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\6\61\u0139\n\61\r\61\16\61\u013a"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0143\n\62\f\62\16\62\u0146\13\62"+
		"\3\62\3\62\2\63\3\2\1\5\3\1\7\4\1\t\5\1\13\6\1\r\7\1\17\b\1\21\t\1\23"+
		"\n\1\25\13\1\27\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1#\22\1%\23\1\'"+
		"\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67\34\19\35\1;\36"+
		"\1=\37\1? \1A!\1C\"\1E#\1G$\1I%\1K&\1M\'\1O(\1Q)\1S*\1U+\1W,\1Y-\1[.\1"+
		"]/\1_\60\1a\61\2c\62\3\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\3\2\f\f\u014d\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3f\3\2\2\2\5j\3\2\2\2\7o\3\2\2\2\tr\3"+
		"\2\2\2\13v\3\2\2\2\rz\3\2\2\2\17}\3\2\2\2\21\u0082\3\2\2\2\23\u0087\3"+
		"\2\2\2\25\u008d\3\2\2\2\27\u0090\3\2\2\2\31\u0097\3\2\2\2\33\u00a1\3\2"+
		"\2\2\35\u00a6\3\2\2\2\37\u00af\3\2\2\2!\u00b7\3\2\2\2#\u00be\3\2\2\2%"+
		"\u00c7\3\2\2\2\'\u00d0\3\2\2\2)\u00d4\3\2\2\2+\u00d9\3\2\2\2-\u00df\3"+
		"\2\2\2/\u00e6\3\2\2\2\61\u00ec\3\2\2\2\63\u00f2\3\2\2\2\65\u00f7\3\2\2"+
		"\2\67\u0104\3\2\2\29\u0106\3\2\2\2;\u010d\3\2\2\2=\u010f\3\2\2\2?\u0111"+
		"\3\2\2\2A\u0113\3\2\2\2C\u0115\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I"+
		"\u011b\3\2\2\2K\u011d\3\2\2\2M\u011f\3\2\2\2O\u0121\3\2\2\2Q\u0123\3\2"+
		"\2\2S\u0125\3\2\2\2U\u0127\3\2\2\2W\u012a\3\2\2\2Y\u012d\3\2\2\2[\u012f"+
		"\3\2\2\2]\u0132\3\2\2\2_\u0134\3\2\2\2a\u0138\3\2\2\2c\u013e\3\2\2\2e"+
		"g\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\4\3\2\2\2jm\5\3\2\2"+
		"kl\7\60\2\2ln\5\3\2\2mk\3\2\2\2mn\3\2\2\2n\6\3\2\2\2op\7q\2\2pq\7t\2\2"+
		"q\b\3\2\2\2rs\7c\2\2st\7p\2\2tu\7f\2\2u\n\3\2\2\2vw\7p\2\2wx\7q\2\2xy"+
		"\7v\2\2y\f\3\2\2\2z{\7k\2\2{|\7h\2\2|\16\3\2\2\2}~\7v\2\2~\177\7j\2\2"+
		"\177\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081\20\3\2\2\2\u0082\u0083\7g\2"+
		"\2\u0083\u0084\7n\2\2\u0084\u0085\7u\2\2\u0085\u0086\7g\2\2\u0086\22\3"+
		"\2\2\2\u0087\u0088\7y\2\2\u0088\u0089\7j\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c\24\3\2\2\2\u008d\u008e\7f\2\2\u008e"+
		"\u008f\7q\2\2\u008f\26\3\2\2\2\u0090\u0091\7u\2\2\u0091\u0092\7s\2\2\u0092"+
		"\u0093\7w\2\2\u0093\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2\2"+
		"\u0096\30\3\2\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099\u009a\7"+
		"e\2\2\u009a\u009b\7v\2\2\u009b\u009c\7c\2\2\u009c\u009d\7p\2\2\u009d\u009e"+
		"\7i\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7g\2\2\u00a0\32\3\2\2\2\u00a1\u00a2"+
		"\7q\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5"+
		"\34\3\2\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad\7q\2\2"+
		"\u00ad\u00ae\7p\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7"+
		"e\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7i\2\2\u00b4\u00b5"+
		"\7q\2\2\u00b5\u00b6\7p\2\2\u00b6 \3\2\2\2\u00b7\u00b8\7E\2\2\u00b8\u00b9"+
		"\7K\2\2\u00b9\u00ba\7T\2\2\u00ba\u00bb\7E\2\2\u00bb\u00bc\7N\2\2\u00bc"+
		"\u00bd\7G\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0"+
		"\u00c1\7k\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7i\2\2"+
		"\u00c4\u00c5\7n\2\2\u00c5\u00c6\7g\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7v\2"+
		"\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7|\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7q\2\2\u00cf"+
		"&\3\2\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7f\2\2\u00d3"+
		"(\3\2\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7w\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8*\3\2\2\2\u00d9\u00da\7d\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7c\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7m\2\2\u00de,\3\2\2\2\u00df"+
		"\u00e0\7r\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7r\2\2"+
		"\u00e3\u00e4\7n\2\2\u00e4\u00e5\7g\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7y\2"+
		"\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\60\3\2\2\2\u00ec\u00ed\7i\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1\62\3\2\2\2\u00f2\u00f3"+
		"\7r\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7m\2\2\u00f6"+
		"\64\3\2\2\2\u00f7\u00f8\7{\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7n\2\2\u00fa"+
		"\u00fb\7n\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7y\2\2\u00fd\66\3\2\2\2\u00fe"+
		"\u00ff\7u\2\2\u00ff\u0100\7m\2\2\u0100\u0105\7v\2\2\u0101\u0102\7U\2\2"+
		"\u0102\u0103\7M\2\2\u0103\u0105\7V\2\2\u0104\u00fe\3\2\2\2\u0104\u0101"+
		"\3\2\2\2\u01058\3\2\2\2\u0106\u010a\t\3\2\2\u0107\u0109\t\4\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b:\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7?\2\2\u010e<\3\2"+
		"\2\2\u010f\u0110\7-\2\2\u0110>\3\2\2\2\u0111\u0112\7/\2\2\u0112@\3\2\2"+
		"\2\u0113\u0114\7,\2\2\u0114B\3\2\2\2\u0115\u0116\7\61\2\2\u0116D\3\2\2"+
		"\2\u0117\u0118\7\'\2\2\u0118F\3\2\2\2\u0119\u011a\7`\2\2\u011aH\3\2\2"+
		"\2\u011b\u011c\7*\2\2\u011cJ\3\2\2\2\u011d\u011e\7+\2\2\u011eL\3\2\2\2"+
		"\u011f\u0120\7}\2\2\u0120N\3\2\2\2\u0121\u0122\7\177\2\2\u0122P\3\2\2"+
		"\2\u0123\u0124\7.\2\2\u0124R\3\2\2\2\u0125\u0126\7=\2\2\u0126T\3\2\2\2"+
		"\u0127\u0128\7?\2\2\u0128\u0129\7?\2\2\u0129V\3\2\2\2\u012a\u012b\7#\2"+
		"\2\u012b\u012c\7?\2\2\u012cX\3\2\2\2\u012d\u012e\7>\2\2\u012eZ\3\2\2\2"+
		"\u012f\u0130\7>\2\2\u0130\u0131\7?\2\2\u0131\\\3\2\2\2\u0132\u0133\7@"+
		"\2\2\u0133^\3\2\2\2\u0134\u0135\7@\2\2\u0135\u0136\7?\2\2\u0136`\3\2\2"+
		"\2\u0137\u0139\t\5\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b\61\2\2"+
		"\u013db\3\2\2\2\u013e\u013f\7\61\2\2\u013f\u0140\7\61\2\2\u0140\u0144"+
		"\3\2\2\2\u0141\u0143\n\6\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0147\u0148\b\62\3\2\u0148d\3\2\2\2\t\2hm\u0104\u010a\u013a\u0144";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}