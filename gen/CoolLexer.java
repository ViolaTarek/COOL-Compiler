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
		SEMICOLON=1, DARROW=2, LPAREN=3, RPAREN=4, COLON=5, ATSYM=6, COMMA=7, 
		PLUS=8, MINUS=9, STAR=10, SLASH=11, TILDE=12, LT=13, EQUALS=14, LBRACE=15, 
		RBRACE=16, DOT=17, LE=18, ASSIGN=19, SELF=20, SELF_TYPE=21, CLASS=22, 
		ELSE=23, FI=24, IF=25, IN=26, INHERITS=27, LET=28, LOOP=29, POOL=30, THEN=31, 
		WHILE=32, CASE=33, ESAC=34, OF=35, NEW=36, ISVOID=37, NOT=38, BOOL_CONST=39, 
		INT_CONST=40, TYPEID=41, OBJECTID=42, STRING=43, WS=44, ERROR=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COLON", "ATSYM", "COMMA", 
			"PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", 
			"RBRACE", "DOT", "LE", "ASSIGN", "SELF", "SELF_TYPE", "CLASS", "ELSE", 
			"FI", "IF", "IN", "INHERITS", "LET", "LOOP", "POOL", "THEN", "WHILE", 
			"CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT", "BOOL_CONST", "INT_CONST", 
			"TYPEID", "OBJECTID", "STRING", "WS", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'=>'", "'('", "')'", "':'", "'@'", "','", "'+'", "'-'", 
			"'*'", "'/'", "'~'", "'<'", "'='", "'{'", "'}'", "'.'", "'<='", "'<-'", 
			"'self'", "'SELF_TYPE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COLON", "ATSYM", "COMMA", 
			"PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", 
			"RBRACE", "DOT", "LE", "ASSIGN", "SELF", "SELF_TYPE", "CLASS", "ELSE", 
			"FI", "IF", "IN", "INHERITS", "LET", "LOOP", "POOL", "THEN", "WHILE", 
			"CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT", "BOOL_CONST", "INT_CONST", 
			"TYPEID", "OBJECTID", "STRING", "WS", "ERROR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\5(\u00f1\n(\3)\6)\u00f4\n)\r)\16)\u00f5\3*\3*\7*\u00fa\n"+
		"*\f*\16*\u00fd\13*\3*\5*\u0100\n*\3+\3+\7+\u0104\n+\f+\16+\u0107\13+\3"+
		",\3,\7,\u010b\n,\f,\16,\u010e\13,\3,\3,\3-\6-\u0113\n-\r-\16-\u0114\3"+
		"-\3-\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\32\4\2EEee\4\2"+
		"NNnn\4\2CCcc\4\2UUuu\4\2GGgg\4\2HHhh\4\2KKkk\4\2PPpp\4\2JJjj\4\2TTtt\4"+
		"\2VVvv\4\2QQqq\4\2RRrr\4\2YYyy\4\2XXxx\4\2FFff\4\2WWww\3\2\62;\3\2C\\"+
		"\6\2\62;C\\aac|\3\2c|\4\2\62;C|\n\2\13\f\17\17\"#*+..\62;C\\c|\5\2\13"+
		"\f\17\17\"\"\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2"+
		"\2\2\5_\3\2\2\2\7b\3\2\2\2\td\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2\17j\3\2\2"+
		"\2\21l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33v\3\2"+
		"\2\2\35x\3\2\2\2\37z\3\2\2\2!|\3\2\2\2#~\3\2\2\2%\u0080\3\2\2\2\'\u0083"+
		"\3\2\2\2)\u0086\3\2\2\2+\u008b\3\2\2\2-\u0095\3\2\2\2/\u009b\3\2\2\2\61"+
		"\u00a0\3\2\2\2\63\u00a3\3\2\2\2\65\u00a6\3\2\2\2\67\u00a9\3\2\2\29\u00b2"+
		"\3\2\2\2;\u00b6\3\2\2\2=\u00bb\3\2\2\2?\u00c0\3\2\2\2A\u00c5\3\2\2\2C"+
		"\u00cb\3\2\2\2E\u00d0\3\2\2\2G\u00d5\3\2\2\2I\u00d8\3\2\2\2K\u00dc\3\2"+
		"\2\2M\u00e3\3\2\2\2O\u00f0\3\2\2\2Q\u00f3\3\2\2\2S\u00ff\3\2\2\2U\u0101"+
		"\3\2\2\2W\u0108\3\2\2\2Y\u0112\3\2\2\2[\u0118\3\2\2\2]^\7=\2\2^\4\3\2"+
		"\2\2_`\7?\2\2`a\7@\2\2a\6\3\2\2\2bc\7*\2\2c\b\3\2\2\2de\7+\2\2e\n\3\2"+
		"\2\2fg\7<\2\2g\f\3\2\2\2hi\7B\2\2i\16\3\2\2\2jk\7.\2\2k\20\3\2\2\2lm\7"+
		"-\2\2m\22\3\2\2\2no\7/\2\2o\24\3\2\2\2pq\7,\2\2q\26\3\2\2\2rs\7\61\2\2"+
		"s\30\3\2\2\2tu\7\u0080\2\2u\32\3\2\2\2vw\7>\2\2w\34\3\2\2\2xy\7?\2\2y"+
		"\36\3\2\2\2z{\7}\2\2{ \3\2\2\2|}\7\177\2\2}\"\3\2\2\2~\177\7\60\2\2\177"+
		"$\3\2\2\2\u0080\u0081\7>\2\2\u0081\u0082\7?\2\2\u0082&\3\2\2\2\u0083\u0084"+
		"\7>\2\2\u0084\u0085\7/\2\2\u0085(\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7n\2\2\u0089\u008a\7h\2\2\u008a*\3\2\2\2\u008b\u008c"+
		"\7U\2\2\u008c\u008d\7G\2\2\u008d\u008e\7N\2\2\u008e\u008f\7H\2\2\u008f"+
		"\u0090\7a\2\2\u0090\u0091\7V\2\2\u0091\u0092\7[\2\2\u0092\u0093\7R\2\2"+
		"\u0093\u0094\7G\2\2\u0094,\3\2\2\2\u0095\u0096\t\2\2\2\u0096\u0097\t\3"+
		"\2\2\u0097\u0098\t\4\2\2\u0098\u0099\t\5\2\2\u0099\u009a\t\5\2\2\u009a"+
		".\3\2\2\2\u009b\u009c\t\6\2\2\u009c\u009d\t\3\2\2\u009d\u009e\t\5\2\2"+
		"\u009e\u009f\t\6\2\2\u009f\60\3\2\2\2\u00a0\u00a1\t\7\2\2\u00a1\u00a2"+
		"\t\b\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\t\b\2\2\u00a4\u00a5\t\7\2\2\u00a5"+
		"\64\3\2\2\2\u00a6\u00a7\t\b\2\2\u00a7\u00a8\t\t\2\2\u00a8\66\3\2\2\2\u00a9"+
		"\u00aa\t\b\2\2\u00aa\u00ab\t\t\2\2\u00ab\u00ac\t\n\2\2\u00ac\u00ad\t\6"+
		"\2\2\u00ad\u00ae\t\13\2\2\u00ae\u00af\t\b\2\2\u00af\u00b0\t\f\2\2\u00b0"+
		"\u00b1\t\5\2\2\u00b18\3\2\2\2\u00b2\u00b3\t\3\2\2\u00b3\u00b4\t\6\2\2"+
		"\u00b4\u00b5\t\f\2\2\u00b5:\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7\u00b8\t"+
		"\r\2\2\u00b8\u00b9\t\r\2\2\u00b9\u00ba\t\16\2\2\u00ba<\3\2\2\2\u00bb\u00bc"+
		"\t\16\2\2\u00bc\u00bd\t\r\2\2\u00bd\u00be\t\r\2\2\u00be\u00bf\t\3\2\2"+
		"\u00bf>\3\2\2\2\u00c0\u00c1\t\f\2\2\u00c1\u00c2\t\n\2\2\u00c2\u00c3\t"+
		"\6\2\2\u00c3\u00c4\t\t\2\2\u00c4@\3\2\2\2\u00c5\u00c6\t\17\2\2\u00c6\u00c7"+
		"\t\n\2\2\u00c7\u00c8\t\b\2\2\u00c8\u00c9\t\3\2\2\u00c9\u00ca\t\6\2\2\u00ca"+
		"B\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc\u00cd\t\4\2\2\u00cd\u00ce\t\5\2\2"+
		"\u00ce\u00cf\t\6\2\2\u00cfD\3\2\2\2\u00d0\u00d1\t\6\2\2\u00d1\u00d2\t"+
		"\5\2\2\u00d2\u00d3\t\4\2\2\u00d3\u00d4\t\2\2\2\u00d4F\3\2\2\2\u00d5\u00d6"+
		"\t\r\2\2\u00d6\u00d7\t\7\2\2\u00d7H\3\2\2\2\u00d8\u00d9\t\t\2\2\u00d9"+
		"\u00da\t\6\2\2\u00da\u00db\t\17\2\2\u00dbJ\3\2\2\2\u00dc\u00dd\t\b\2\2"+
		"\u00dd\u00de\t\5\2\2\u00de\u00df\t\20\2\2\u00df\u00e0\t\r\2\2\u00e0\u00e1"+
		"\t\b\2\2\u00e1\u00e2\t\21\2\2\u00e2L\3\2\2\2\u00e3\u00e4\t\t\2\2\u00e4"+
		"\u00e5\t\r\2\2\u00e5\u00e6\t\f\2\2\u00e6N\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8"+
		"\u00e9\t\13\2\2\u00e9\u00ea\t\22\2\2\u00ea\u00f1\t\6\2\2\u00eb\u00ec\7"+
		"h\2\2\u00ec\u00ed\t\4\2\2\u00ed\u00ee\t\3\2\2\u00ee\u00ef\t\5\2\2\u00ef"+
		"\u00f1\t\6\2\2\u00f0\u00e7\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1P\3\2\2\2"+
		"\u00f2\u00f4\t\23\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6R\3\2\2\2\u00f7\u00fb\t\24\2\2\u00f8"+
		"\u00fa\t\25\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100T\3\2\2\2"+
		"\u0101\u0105\t\26\2\2\u0102\u0104\t\27\2\2\u0103\u0102\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106V\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010c\7$\2\2\u0109\u010b\t\30\2\2\u010a\u0109\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7$\2\2\u0110X\3\2\2\2\u0111"+
		"\u0113\t\31\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b-\2\2\u0117"+
		"Z\3\2\2\2\u0118\u0119\13\2\2\2\u0119\\\3\2\2\2\n\2\u00f0\u00f5\u00fb\u00ff"+
		"\u0105\u010c\u0114\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}