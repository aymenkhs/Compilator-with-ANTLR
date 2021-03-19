// Generated from C:/Users/aymen/Documents/SII/tpcompil/TinyLanguage_SII/src/grammar\tiny_parser.g4 by ANTLR 4.9.1
package generated_files;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tiny_parserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INTEGER=20, REAL=21, PRODUCT=22, DIV=23, PLUS=24, 
		MINUS=25, AFFECTATION=26, COMPARAISON=27, IDF=28, PROGRAMNAME=29, WHITESPACE=30, 
		NEWLINE=31, STRING=32, INLINECOMMENT=33, BLOCKCOMMENT=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "DIGIT", "LOWERCASE", "UPPERCASE", "INTEGER", "REAL", 
			"PRODUCT", "DIV", "PLUS", "MINUS", "AFFECTATION", "COMPARAISON", "IDF", 
			"PROGRAMNAME", "WHITESPACE", "NEWLINE", "STRING", "INLINECOMMENT", "BLOCKCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'compil'", "'('", "')'", "'{'", "'start'", "'}'", "';'", "'intCompil'", 
			"'floatCompil'", "'StringCompil'", "','", "'printCompil'", "'scanCompil'", 
			"'if'", "'else if'", "'then'", "'else'", "'do'", "'while'", null, null, 
			"'*'", "'/'", "'+'", "'-'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INTEGER", "REAL", "PRODUCT", 
			"DIV", "PLUS", "MINUS", "AFFECTATION", "COMPARAISON", "IDF", "PROGRAMNAME", 
			"WHITESPACE", "NEWLINE", "STRING", "INLINECOMMENT", "BLOCKCOMMENT"
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


	public tiny_parserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tiny_parser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u014a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\7\30\u00c7\n\30\f\30\16\30\u00ca\13\30\3\30\5\30"+
		"\u00cd\n\30\3\31\3\31\3\31\7\31\u00d2\n\31\f\31\16\31\u00d5\13\31\3\31"+
		"\3\31\7\31\u00d9\n\31\f\31\16\31\u00dc\13\31\3\31\3\31\7\31\u00e0\n\31"+
		"\f\31\16\31\u00e3\13\31\5\31\u00e5\n\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u00fc\n\37\3 \3 \5 \u0100\n \3 \3 \3 \7 \u0105\n \f \16 \u0108"+
		"\13 \3!\3!\5!\u010c\n!\3!\3!\5!\u0110\n!\7!\u0112\n!\f!\16!\u0115\13!"+
		"\3\"\6\"\u0118\n\"\r\"\16\"\u0119\3\"\3\"\3#\5#\u011f\n#\3#\3#\6#\u0123"+
		"\n#\r#\16#\u0124\3#\3#\3$\3$\7$\u012b\n$\f$\16$\u012e\13$\3$\3$\3%\3%"+
		"\3%\3%\7%\u0136\n%\f%\16%\u0139\13%\3%\3%\3&\3&\3&\3&\7&\u0141\n&\f&\16"+
		"&\u0144\13&\3&\3&\3&\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\26\61"+
		"\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$\3\2\13\3\2\62;\3"+
		"\2c|\3\2C\\\3\2\63;\4\2>>@@\4\2\13\13\"\"\3\2$$\4\2\f\f\17\17\4\2,,\61"+
		"\61\2\u015f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\3M\3\2\2\2\5T\3\2\2\2\7V\3\2\2\2\tX\3\2\2\2\13Z\3\2\2\2\r`\3\2\2\2\17"+
		"b\3\2\2\2\21d\3\2\2\2\23n\3\2\2\2\25z\3\2\2\2\27\u0087\3\2\2\2\31\u0089"+
		"\3\2\2\2\33\u0095\3\2\2\2\35\u00a0\3\2\2\2\37\u00a3\3\2\2\2!\u00ab\3\2"+
		"\2\2#\u00b0\3\2\2\2%\u00b5\3\2\2\2\'\u00b8\3\2\2\2)\u00be\3\2\2\2+\u00c0"+
		"\3\2\2\2-\u00c2\3\2\2\2/\u00cc\3\2\2\2\61\u00e4\3\2\2\2\63\u00e6\3\2\2"+
		"\2\65\u00e8\3\2\2\2\67\u00ea\3\2\2\29\u00ec\3\2\2\2;\u00ee\3\2\2\2=\u00fb"+
		"\3\2\2\2?\u00ff\3\2\2\2A\u0109\3\2\2\2C\u0117\3\2\2\2E\u0122\3\2\2\2G"+
		"\u0128\3\2\2\2I\u0131\3\2\2\2K\u013c\3\2\2\2MN\7e\2\2NO\7q\2\2OP\7o\2"+
		"\2PQ\7r\2\2QR\7k\2\2RS\7n\2\2S\4\3\2\2\2TU\7*\2\2U\6\3\2\2\2VW\7+\2\2"+
		"W\b\3\2\2\2XY\7}\2\2Y\n\3\2\2\2Z[\7u\2\2[\\\7v\2\2\\]\7c\2\2]^\7t\2\2"+
		"^_\7v\2\2_\f\3\2\2\2`a\7\177\2\2a\16\3\2\2\2bc\7=\2\2c\20\3\2\2\2de\7"+
		"k\2\2ef\7p\2\2fg\7v\2\2gh\7E\2\2hi\7q\2\2ij\7o\2\2jk\7r\2\2kl\7k\2\2l"+
		"m\7n\2\2m\22\3\2\2\2no\7h\2\2op\7n\2\2pq\7q\2\2qr\7c\2\2rs\7v\2\2st\7"+
		"E\2\2tu\7q\2\2uv\7o\2\2vw\7r\2\2wx\7k\2\2xy\7n\2\2y\24\3\2\2\2z{\7U\2"+
		"\2{|\7v\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7i\2\2\u0080\u0081"+
		"\7E\2\2\u0081\u0082\7q\2\2\u0082\u0083\7o\2\2\u0083\u0084\7r\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7n\2\2\u0086\26\3\2\2\2\u0087\u0088\7.\2\2\u0088"+
		"\30\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e\u008f\7E\2\2\u008f\u0090\7q\2\2"+
		"\u0090\u0091\7o\2\2\u0091\u0092\7r\2\2\u0092\u0093\7k\2\2\u0093\u0094"+
		"\7n\2\2\u0094\32\3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097\7e\2\2\u0097\u0098"+
		"\7c\2\2\u0098\u0099\7p\2\2\u0099\u009a\7E\2\2\u009a\u009b\7q\2\2\u009b"+
		"\u009c\7o\2\2\u009c\u009d\7r\2\2\u009d\u009e\7k\2\2\u009e\u009f\7n\2\2"+
		"\u009f\34\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7h\2\2\u00a2\36\3\2\2"+
		"\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7\"\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa"+
		" \3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\"\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6"+
		"\u00b7\7q\2\2\u00b7&\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7j\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd(\3\2\2\2\u00be"+
		"\u00bf\t\2\2\2\u00bf*\3\2\2\2\u00c0\u00c1\t\3\2\2\u00c1,\3\2\2\2\u00c2"+
		"\u00c3\t\4\2\2\u00c3.\3\2\2\2\u00c4\u00c8\t\5\2\2\u00c5\u00c7\5)\25\2"+
		"\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\62\2\2"+
		"\u00cc\u00c4\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\60\3\2\2\2\u00ce\u00cf"+
		"\7\62\2\2\u00cf\u00d3\7\60\2\2\u00d0\u00d2\5)\25\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00e5"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00da\t\5\2\2\u00d7\u00d9\5)\25\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1\7\60\2\2\u00de"+
		"\u00e0\5)\25\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00ce\3\2\2\2\u00e4\u00d6\3\2\2\2\u00e5\62\3\2\2\2\u00e6\u00e7\7,\2\2"+
		"\u00e7\64\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7"+
		"-\2\2\u00eb8\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7?"+
		"\2\2\u00ef<\3\2\2\2\u00f0\u00fc\t\6\2\2\u00f1\u00f2\7>\2\2\u00f2\u00fc"+
		"\7?\2\2\u00f3\u00f4\7@\2\2\u00f4\u00fc\7?\2\2\u00f5\u00f6\7>\2\2\u00f6"+
		"\u00fc\7@\2\2\u00f7\u00f8\7#\2\2\u00f8\u00fc\7?\2\2\u00f9\u00fa\7?\2\2"+
		"\u00fa\u00fc\7?\2\2\u00fb\u00f0\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f3"+
		"\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		">\3\2\2\2\u00fd\u0100\5+\26\2\u00fe\u0100\5-\27\2\u00ff\u00fd\3\2\2\2"+
		"\u00ff\u00fe\3\2\2\2\u0100\u0106\3\2\2\2\u0101\u0105\5-\27\2\u0102\u0105"+
		"\5+\26\2\u0103\u0105\5)\25\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107@\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0113\5-\27\2\u010a\u010c"+
		"\7a\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u0110\5-\27\2\u010e\u0110\5+\26\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2"+
		"\2\2\u0110\u0112\3\2\2\2\u0111\u010b\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114B\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0116\u0118\t\7\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b\"\2\2\u011c"+
		"D\3\2\2\2\u011d\u011f\7\17\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120\u0123\7\f\2\2\u0121\u0123\7\17\2\2\u0122\u011e"+
		"\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b#\2\2\u0127F\3\2\2\2\u0128"+
		"\u012c\7$\2\2\u0129\u012b\n\b\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\7$\2\2\u0130H\3\2\2\2\u0131\u0132\7\61\2\2"+
		"\u0132\u0133\7\61\2\2\u0133\u0137\3\2\2\2\u0134\u0136\n\t\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\b%\2\2\u013bJ\3\2\2\2\u013c"+
		"\u013d\7\61\2\2\u013d\u013e\7,\2\2\u013e\u0142\3\2\2\2\u013f\u0141\n\n"+
		"\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7,"+
		"\2\2\u0146\u0147\7\61\2\2\u0147\u0148\3\2\2\2\u0148\u0149\b&\2\2\u0149"+
		"L\3\2\2\2\27\2\u00c8\u00cc\u00d3\u00da\u00e1\u00e4\u00fb\u00ff\u0104\u0106"+
		"\u010b\u010f\u0113\u0119\u011e\u0122\u0124\u012c\u0137\u0142\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}