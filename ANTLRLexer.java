// Generated from ANTLR.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TOKEN_ID=11, ID=12, STRING=13, COMMENT=14, LINE_COMMENT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "TOKEN_ID", "ID", "STRING", "COMMENT", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "':'", "'|'", "'('", "')'", "'*'", "'+'", "'?'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TOKEN_ID", 
			"ID", "STRING", "COMMENT", "LINE_COMMENT", "WS"
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


	public ANTLRLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANTLR.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\7\f@\n\f\f\f\16\fC\13\f\3\r\3\r\7\r"+
		"G\n\r\f\r\16\rJ\13\r\3\16\3\16\3\16\3\16\7\16P\n\16\f\16\16\16S\13\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\7\17[\n\17\f\17\16\17^\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20i\n\20\f\20\16\20l\13\20\3\20"+
		"\3\20\3\21\6\21q\n\21\r\21\16\21r\3\21\3\21\3\\\2\22\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\t\3\2"+
		"C\\\5\2\62;C\\aa\5\2C\\aac|\6\2\62;C\\aac|\4\2))^^\4\2\f\f\17\17\5\2\13"+
		"\f\17\17\"\"\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\3#\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63"+
		"\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\239\3\2\2\2\25;\3\2\2\2\27=\3\2\2"+
		"\2\31D\3\2\2\2\33K\3\2\2\2\35V\3\2\2\2\37d\3\2\2\2!p\3\2\2\2#$\7i\2\2"+
		"$%\7t\2\2%&\7c\2\2&\'\7o\2\2\'(\7o\2\2()\7c\2\2)*\7t\2\2*\4\3\2\2\2+,"+
		"\7=\2\2,\6\3\2\2\2-.\7<\2\2.\b\3\2\2\2/\60\7~\2\2\60\n\3\2\2\2\61\62\7"+
		"*\2\2\62\f\3\2\2\2\63\64\7+\2\2\64\16\3\2\2\2\65\66\7,\2\2\66\20\3\2\2"+
		"\2\678\7-\2\28\22\3\2\2\29:\7A\2\2:\24\3\2\2\2;<\7\60\2\2<\26\3\2\2\2"+
		"=A\t\2\2\2>@\t\3\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\30\3\2\2"+
		"\2CA\3\2\2\2DH\t\4\2\2EG\t\5\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2"+
		"\2I\32\3\2\2\2JH\3\2\2\2KQ\7)\2\2LP\n\6\2\2MN\7^\2\2NP\13\2\2\2OL\3\2"+
		"\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7)"+
		"\2\2U\34\3\2\2\2VW\7\61\2\2WX\7,\2\2X\\\3\2\2\2Y[\13\2\2\2ZY\3\2\2\2["+
		"^\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7,\2\2`a\7\61\2"+
		"\2ab\3\2\2\2bc\b\17\2\2c\36\3\2\2\2de\7\61\2\2ef\7\61\2\2fj\3\2\2\2gi"+
		"\n\7\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2m"+
		"n\b\20\2\2n \3\2\2\2oq\t\b\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"st\3\2\2\2tu\b\21\2\2u\"\3\2\2\2\n\2AHOQ\\jr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}