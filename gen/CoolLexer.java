// Generated from C:/Users/Viola/IdeaProjects/Lexer/src\CoolLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, DARROW=2, INT_CONST=3, SELF=4, SELF_TYPE=5, TYPEID=6, OBJECTID=7, 
		BOOL_CONST=8, LPAREN=9, RPAREN=10, COLON=11, ATSYM=12, COMMA=13, PLUS=14, 
		MINUS=15, STAR=16, SLASH=17, TILDE=18, LT=19, EQUALS=20, LBRACE=21, RBRACE=22, 
		DOT=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, IN=30, INHERITS=31, 
		LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, ESAC=38, OF=39, 
		NEW=40, ISVOID=41, NOT=42, STRING=43, WS=44, ERROR=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMICOLON", "DARROW", "INT_CONST", "SELF", "SELF_TYPE", "TYPEID", "OBJECTID", 
			"BOOL_CONST", "LPAREN", "RPAREN", "COLON", "ATSYM", "COMMA", "PLUS", 
			"MINUS", "STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", 
			"DOT", "LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
			"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", 
			"ISVOID", "NOT", "STRING", "WS", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'=>'", null, "'self'", "'SELF_TYPE'", null, null, null, 
			"'('", "')'", "':'", "'@'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", 
			"'<'", "'='", "'{'", "'}'", "'.'", "'<='", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "DARROW", "INT_CONST", "SELF", "SELF_TYPE", "TYPEID", 
			"OBJECTID", "BOOL_CONST", "LPAREN", "RPAREN", "COLON", "ATSYM", "COMMA", 
			"PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", 
			"RBRACE", "DOT", "LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
			"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", 
			"ISVOID", "NOT", "STRING", "WS", "ERROR"
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0117\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\4\6\4d\n\4\r\4\16\4e\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\7\7y\n\7\f"+
		"\7\16\7|\13\7\3\b\3\b\7\b\u0080\n\b\f\b\16\b\u0083\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\3,\3,\7,\u0108\n,\f,\16,\u010b\13,\3,\3,\3-\6-\u0110"+
		"\n-\r-\16-\u0111\3-\3-\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2"+
		"\32\3\2\62;\3\2C\\\6\2\62;C\\aac|\3\2c|\4\2\62;C|\4\2TTtt\4\2WWww\4\2"+
		"GGgg\4\2CCcc\4\2NNnn\4\2UUuu\4\2EEee\4\2HHhh\4\2KKkk\4\2PPpp\4\2JJjj\4"+
		"\2VVvv\4\2QQqq\4\2RRrr\4\2YYyy\4\2XXxx\4\2FFff\n\2\13\f\17\17\"#*+..\62"+
		";C\\c|\5\2\13\f\17\17\"\"\2\u011c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7c\3\2\2\2\tg\3\2\2\2\13l\3\2\2\2\rv\3\2"+
		"\2\2\17}\3\2\2\2\21\u008d\3\2\2\2\23\u008f\3\2\2\2\25\u0091\3\2\2\2\27"+
		"\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u009b"+
		"\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2"+
		")\u00a5\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61\u00ad"+
		"\3\2\2\2\63\u00b0\3\2\2\2\65\u00b3\3\2\2\2\67\u00b9\3\2\2\29\u00be\3\2"+
		"\2\2;\u00c1\3\2\2\2=\u00c4\3\2\2\2?\u00c7\3\2\2\2A\u00d0\3\2\2\2C\u00d4"+
		"\3\2\2\2E\u00d9\3\2\2\2G\u00de\3\2\2\2I\u00e3\3\2\2\2K\u00e9\3\2\2\2M"+
		"\u00ee\3\2\2\2O\u00f3\3\2\2\2Q\u00f6\3\2\2\2S\u00fa\3\2\2\2U\u0101\3\2"+
		"\2\2W\u0105\3\2\2\2Y\u010f\3\2\2\2[\u0115\3\2\2\2]^\7=\2\2^\4\3\2\2\2"+
		"_`\7?\2\2`a\7@\2\2a\6\3\2\2\2bd\t\2\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2f\b\3\2\2\2gh\7u\2\2hi\7g\2\2ij\7n\2\2jk\7h\2\2k\n\3\2\2\2l"+
		"m\7U\2\2mn\7G\2\2no\7N\2\2op\7H\2\2pq\7a\2\2qr\7V\2\2rs\7[\2\2st\7R\2"+
		"\2tu\7G\2\2u\f\3\2\2\2vz\t\3\2\2wy\t\4\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2"+
		"\2z{\3\2\2\2{\16\3\2\2\2|z\3\2\2\2}\u0081\t\5\2\2~\u0080\t\6\2\2\177~"+
		"\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\20\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7v\2\2\u0085\u0086\t\7\2\2"+
		"\u0086\u0087\t\b\2\2\u0087\u008e\t\t\2\2\u0088\u0089\7h\2\2\u0089\u008a"+
		"\t\n\2\2\u008a\u008b\t\13\2\2\u008b\u008c\t\f\2\2\u008c\u008e\t\t\2\2"+
		"\u008d\u0084\3\2\2\2\u008d\u0088\3\2\2\2\u008e\22\3\2\2\2\u008f\u0090"+
		"\7*\2\2\u0090\24\3\2\2\2\u0091\u0092\7+\2\2\u0092\26\3\2\2\2\u0093\u0094"+
		"\7<\2\2\u0094\30\3\2\2\2\u0095\u0096\7B\2\2\u0096\32\3\2\2\2\u0097\u0098"+
		"\7.\2\2\u0098\34\3\2\2\2\u0099\u009a\7-\2\2\u009a\36\3\2\2\2\u009b\u009c"+
		"\7/\2\2\u009c \3\2\2\2\u009d\u009e\7,\2\2\u009e\"\3\2\2\2\u009f\u00a0"+
		"\7\61\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7\u0080\2\2\u00a2&\3\2\2\2\u00a3"+
		"\u00a4\7>\2\2\u00a4(\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6*\3\2\2\2\u00a7\u00a8"+
		"\7}\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aa.\3\2\2\2\u00ab\u00ac"+
		"\7\60\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7?\2\2\u00af"+
		"\62\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1\u00b2\7/\2\2\u00b2\64\3\2\2\2\u00b3"+
		"\u00b4\t\r\2\2\u00b4\u00b5\t\13\2\2\u00b5\u00b6\t\n\2\2\u00b6\u00b7\t"+
		"\f\2\2\u00b7\u00b8\t\f\2\2\u00b8\66\3\2\2\2\u00b9\u00ba\t\t\2\2\u00ba"+
		"\u00bb\t\13\2\2\u00bb\u00bc\t\f\2\2\u00bc\u00bd\t\t\2\2\u00bd8\3\2\2\2"+
		"\u00be\u00bf\t\16\2\2\u00bf\u00c0\t\17\2\2\u00c0:\3\2\2\2\u00c1\u00c2"+
		"\t\17\2\2\u00c2\u00c3\t\16\2\2\u00c3<\3\2\2\2\u00c4\u00c5\t\17\2\2\u00c5"+
		"\u00c6\t\20\2\2\u00c6>\3\2\2\2\u00c7\u00c8\t\17\2\2\u00c8\u00c9\t\20\2"+
		"\2\u00c9\u00ca\t\21\2\2\u00ca\u00cb\t\t\2\2\u00cb\u00cc\t\7\2\2\u00cc"+
		"\u00cd\t\17\2\2\u00cd\u00ce\t\22\2\2\u00ce\u00cf\t\f\2\2\u00cf@\3\2\2"+
		"\2\u00d0\u00d1\t\13\2\2\u00d1\u00d2\t\t\2\2\u00d2\u00d3\t\22\2\2\u00d3"+
		"B\3\2\2\2\u00d4\u00d5\t\13\2\2\u00d5\u00d6\t\23\2\2\u00d6\u00d7\t\23\2"+
		"\2\u00d7\u00d8\t\24\2\2\u00d8D\3\2\2\2\u00d9\u00da\t\24\2\2\u00da\u00db"+
		"\t\23\2\2\u00db\u00dc\t\23\2\2\u00dc\u00dd\t\13\2\2\u00ddF\3\2\2\2\u00de"+
		"\u00df\t\22\2\2\u00df\u00e0\t\21\2\2\u00e0\u00e1\t\t\2\2\u00e1\u00e2\t"+
		"\20\2\2\u00e2H\3\2\2\2\u00e3\u00e4\t\25\2\2\u00e4\u00e5\t\21\2\2\u00e5"+
		"\u00e6\t\17\2\2\u00e6\u00e7\t\13\2\2\u00e7\u00e8\t\t\2\2\u00e8J\3\2\2"+
		"\2\u00e9\u00ea\t\r\2\2\u00ea\u00eb\t\n\2\2\u00eb\u00ec\t\f\2\2\u00ec\u00ed"+
		"\t\t\2\2\u00edL\3\2\2\2\u00ee\u00ef\t\t\2\2\u00ef\u00f0\t\f\2\2\u00f0"+
		"\u00f1\t\n\2\2\u00f1\u00f2\t\r\2\2\u00f2N\3\2\2\2\u00f3\u00f4\t\23\2\2"+
		"\u00f4\u00f5\t\16\2\2\u00f5P\3\2\2\2\u00f6\u00f7\t\20\2\2\u00f7\u00f8"+
		"\t\t\2\2\u00f8\u00f9\t\25\2\2\u00f9R\3\2\2\2\u00fa\u00fb\t\17\2\2\u00fb"+
		"\u00fc\t\f\2\2\u00fc\u00fd\t\26\2\2\u00fd\u00fe\t\23\2\2\u00fe\u00ff\t"+
		"\17\2\2\u00ff\u0100\t\27\2\2\u0100T\3\2\2\2\u0101\u0102\t\20\2\2\u0102"+
		"\u0103\t\23\2\2\u0103\u0104\t\22\2\2\u0104V\3\2\2\2\u0105\u0109\7$\2\2"+
		"\u0106\u0108\t\30\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010d\7$\2\2\u010dX\3\2\2\2\u010e\u0110\t\31\2\2\u010f\u010e\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\b-\2\2\u0114Z\3\2\2\2\u0115\u0116\13\2\2\2\u0116"+
		"\\\3\2\2\2\t\2ez\u0081\u008d\u0109\u0111\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}