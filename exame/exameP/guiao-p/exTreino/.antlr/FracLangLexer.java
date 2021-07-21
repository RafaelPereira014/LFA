// Generated from /home/parallels/Desktop/LFA2/guiao-p/exTreino/FracLang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FracLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, STRING=13, VAL=14, ID=15, NUM=16, WS=17, 
		COMMENT=18, ERROR=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "STRING", "VAL", "ID", "NUM", "WS", "COMMENT", 
			"ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'<='", "'display'", "'('", "')'", "'+'", "'-'", "'*'", 
			"':'", "'read'", "'reduce'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "VAL", "ID", "NUM", "WS", "COMMENT", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public FracLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FracLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\7\16S\n\16\f\16\16"+
		"\16V\13\16\3\16\3\16\3\17\3\17\3\17\5\17]\n\17\3\20\6\20`\n\20\r\20\16"+
		"\20a\3\21\6\21e\n\21\r\21\16\21f\3\22\6\22j\n\22\r\22\16\22k\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\7\23t\n\23\f\23\16\23w\13\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\4Tu\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\5\3\2c|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\2\u0083\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7.\3"+
		"\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23"+
		"@\3\2\2\2\25B\3\2\2\2\27G\3\2\2\2\31N\3\2\2\2\33P\3\2\2\2\35Y\3\2\2\2"+
		"\37_\3\2\2\2!d\3\2\2\2#i\3\2\2\2%o\3\2\2\2\'|\3\2\2\2)*\7=\2\2*\4\3\2"+
		"\2\2+,\7>\2\2,-\7?\2\2-\6\3\2\2\2./\7f\2\2/\60\7k\2\2\60\61\7u\2\2\61"+
		"\62\7r\2\2\62\63\7n\2\2\63\64\7c\2\2\64\65\7{\2\2\65\b\3\2\2\2\66\67\7"+
		"*\2\2\67\n\3\2\2\289\7+\2\29\f\3\2\2\2:;\7-\2\2;\16\3\2\2\2<=\7/\2\2="+
		"\20\3\2\2\2>?\7,\2\2?\22\3\2\2\2@A\7<\2\2A\24\3\2\2\2BC\7t\2\2CD\7g\2"+
		"\2DE\7c\2\2EF\7f\2\2F\26\3\2\2\2GH\7t\2\2HI\7g\2\2IJ\7f\2\2JK\7w\2\2K"+
		"L\7e\2\2LM\7g\2\2M\30\3\2\2\2NO\7\61\2\2O\32\3\2\2\2PT\7$\2\2QS\13\2\2"+
		"\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2TR\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7$\2"+
		"\2X\34\3\2\2\2Y\\\5\37\20\2Z]\5\37\20\2[]\5!\21\2\\Z\3\2\2\2\\[\3\2\2"+
		"\2]\36\3\2\2\2^`\t\2\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b \3\2"+
		"\2\2ce\t\3\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\"\3\2\2\2hj\t"+
		"\4\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\22\2\2n$"+
		"\3\2\2\2op\7/\2\2pq\7/\2\2qu\3\2\2\2rt\13\2\2\2sr\3\2\2\2tw\3\2\2\2uv"+
		"\3\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\f\2\2yz\3\2\2\2z{\b\23\2\2"+
		"{&\3\2\2\2|}\13\2\2\2}(\3\2\2\2\t\2T\\afku\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}