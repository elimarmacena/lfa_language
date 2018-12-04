// Generated from C:\Users\joel-\Desktop\lfa_language\PostHtml\Grammar\Calc.g4 by ANTLR 4.1
package posthtml;

import workload.Expr;
import workload.Operator;
import static workload.Expr.*;
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
		NUMERO=1, OR=2, AND=3, NOT=4, IF=5, THEN=6, ELSE=7, WHILE=8, DO=9, IDENT=10, 
		GETS=11, PLUS=12, MINUS=13, TIMES=14, DIVIDE=15, MOD=16, EXP=17, LPAR=18, 
		RPAR=19, LBRC=20, RBRC=21, COMMA=22, SEMI=23, EQU=24, NEQ=25, LT=26, LEQ=27, 
		GT=28, GEQ=29, WS=30, COMMENT=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERO", "'or'", "'and'", "'not'", "'if'", "'then'", "'else'", "'while'", 
		"'do'", "IDENT", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'('", 
		"')'", "'{'", "'}'", "','", "';'", "'=='", "'!='", "'<'", "'<='", "'>'", 
		"'>='", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"DIGITS", "NUMERO", "OR", "AND", "NOT", "IF", "THEN", "ELSE", "WHILE", 
		"DO", "IDENT", "GETS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "EXP", 
		"LPAR", "RPAR", "LBRC", "RBRC", "COMMA", "SEMI", "EQU", "NEQ", "LT", "LEQ", 
		"GT", "GEQ", "WS", "COMMENT"
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
		case 30: WS_action((RuleContext)_localctx, actionIndex); break;

		case 31: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2!\u00b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\6\2E\n\2\r\2\16\2F\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\7\fq\n\f\f\f\16\f"+
		"t\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \6 \u00a1\n \r \16 \u00a2\3 \3 \3!\3!\3!\3!\7!\u00ab\n!\f!\16"+
		"!\u00ae\13!\3!\3!\2\"\3\2\1\5\3\1\7\4\1\t\5\1\13\6\1\r\7\1\17\b\1\21\t"+
		"\1\23\n\1\25\13\1\27\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1#\22\1%\23"+
		"\1\'\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67\34\19\35"+
		"\1;\36\1=\37\1? \2A!\3\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\3\2\f\f\u00b4\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3D\3\2\2\2\5H\3"+
		"\2\2\2\7M\3\2\2\2\tP\3\2\2\2\13T\3\2\2\2\rX\3\2\2\2\17[\3\2\2\2\21`\3"+
		"\2\2\2\23e\3\2\2\2\25k\3\2\2\2\27n\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2\35"+
		"y\3\2\2\2\37{\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3"+
		"\2\2\2)\u0085\3\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61"+
		"\u008d\3\2\2\2\63\u008f\3\2\2\2\65\u0092\3\2\2\2\67\u0095\3\2\2\29\u0097"+
		"\3\2\2\2;\u009a\3\2\2\2=\u009c\3\2\2\2?\u00a0\3\2\2\2A\u00a6\3\2\2\2C"+
		"E\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\4\3\2\2\2HK\5\3\2\2"+
		"IJ\7\60\2\2JL\5\3\2\2KI\3\2\2\2KL\3\2\2\2L\6\3\2\2\2MN\7q\2\2NO\7t\2\2"+
		"O\b\3\2\2\2PQ\7c\2\2QR\7p\2\2RS\7f\2\2S\n\3\2\2\2TU\7p\2\2UV\7q\2\2VW"+
		"\7v\2\2W\f\3\2\2\2XY\7k\2\2YZ\7h\2\2Z\16\3\2\2\2[\\\7v\2\2\\]\7j\2\2]"+
		"^\7g\2\2^_\7p\2\2_\20\3\2\2\2`a\7g\2\2ab\7n\2\2bc\7u\2\2cd\7g\2\2d\22"+
		"\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k\2\2hi\7n\2\2ij\7g\2\2j\24\3\2\2\2kl\7"+
		"f\2\2lm\7q\2\2m\26\3\2\2\2nr\t\3\2\2oq\t\4\2\2po\3\2\2\2qt\3\2\2\2rp\3"+
		"\2\2\2rs\3\2\2\2s\30\3\2\2\2tr\3\2\2\2uv\7?\2\2v\32\3\2\2\2wx\7-\2\2x"+
		"\34\3\2\2\2yz\7/\2\2z\36\3\2\2\2{|\7,\2\2| \3\2\2\2}~\7\61\2\2~\"\3\2"+
		"\2\2\177\u0080\7\'\2\2\u0080$\3\2\2\2\u0081\u0082\7`\2\2\u0082&\3\2\2"+
		"\2\u0083\u0084\7*\2\2\u0084(\3\2\2\2\u0085\u0086\7+\2\2\u0086*\3\2\2\2"+
		"\u0087\u0088\7}\2\2\u0088,\3\2\2\2\u0089\u008a\7\177\2\2\u008a.\3\2\2"+
		"\2\u008b\u008c\7.\2\2\u008c\60\3\2\2\2\u008d\u008e\7=\2\2\u008e\62\3\2"+
		"\2\2\u008f\u0090\7?\2\2\u0090\u0091\7?\2\2\u0091\64\3\2\2\2\u0092\u0093"+
		"\7#\2\2\u0093\u0094\7?\2\2\u0094\66\3\2\2\2\u0095\u0096\7>\2\2\u00968"+
		"\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099\7?\2\2\u0099:\3\2\2\2\u009a\u009b"+
		"\7@\2\2\u009b<\3\2\2\2\u009c\u009d\7@\2\2\u009d\u009e\7?\2\2\u009e>\3"+
		"\2\2\2\u009f\u00a1\t\5\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b "+
		"\2\2\u00a5@\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00ac"+
		"\3\2\2\2\u00a9\u00ab\n\6\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b0\b!\3\2\u00b0B\3\2\2\2\b\2FKr\u00a2\u00ac";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}