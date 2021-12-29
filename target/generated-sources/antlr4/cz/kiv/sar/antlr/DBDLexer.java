// Generated from cz\kiv\sar\antlr\DBDLexer.g4 by ANTLR 4.9.3
package cz.kiv.sar.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DBDLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COM=1, LPAREN=2, RPAREN=3, EQUAL=4, DBD=5, DBD_GEN=6, FINISH=7, END=8, 
		DATASET=9, SEGM=10, FIELD=11, LCHILD=12, XDFLD=13, WS=14, String=15, Int=16, 
		Number=17, Digit=18, PARAM_WS=19, CPARAM_WS=20, PARAM_COM=21, CPARAM_RPAREN=22;
	public static final int
		PARAM=1, CLOSED_PARAM=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PARAM", "CLOSED_PARAM"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUAL", "DBD", "DBD_GEN", "FINISH", "END", "DATASET", "SEGM", "FIELD", 
			"LCHILD", "XDFLD", "WS", "String", "Int", "Number", "Digit", "PARAM_LPAREN", 
			"PARAM_COM", "PARAM_WS", "PARAM_String", "PARAM_Int", "CPARAM_LPAREN", 
			"CPARAM_RPAREN", "CPARAM_COM", "CPARAM_WS", "CPARAM_String", "CPARAM_Int"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'='", "'DBD'", "'DBDGEN'", "'FINISH'", "'END'", 
			"'DATASET'", "'SEGM'", "'FIELD'", "'LCHILD'", "'XDFLD'", null, null, 
			null, null, null, null, null, null, "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COM", "LPAREN", "RPAREN", "EQUAL", "DBD", "DBD_GEN", "FINISH", 
			"END", "DATASET", "SEGM", "FIELD", "LCHILD", "XDFLD", "WS", "String", 
			"Int", "Number", "Digit", "PARAM_WS", "CPARAM_WS", "PARAM_COM", "CPARAM_RPAREN"
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


	public DBDLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DBDLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00c6\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f"+
		"u\n\f\r\f\16\fv\3\f\3\f\3\r\6\r|\n\r\r\r\16\r}\3\16\3\16\7\16\u0082\n"+
		"\16\f\16\16\16\u0085\13\16\3\16\5\16\u0088\n\16\3\17\3\17\3\17\7\17\u008d"+
		"\n\17\f\17\16\17\u0090\13\17\5\17\u0092\n\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\2\2\34\5\6\7\7\t\b\13\t\r\n\17\13\21\f\23\r\25\16"+
		"\27\17\31\20\33\21\35\22\37\23!\24#\2%\27\'\25)\2+\2-\2/\30\61\2\63\26"+
		"\65\2\67\2\5\2\3\4\6\5\2\13\f\17\17\"\"\5\2\62;C\\c|\3\2\63;\3\2\62;\2"+
		"\u00c9\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\3"+
		"%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\4-\3\2\2\2\4/\3\2\2\2\4\61"+
		"\3\2\2\2\4\63\3\2\2\2\4\65\3\2\2\2\4\67\3\2\2\2\59\3\2\2\2\7=\3\2\2\2"+
		"\tA\3\2\2\2\13H\3\2\2\2\rO\3\2\2\2\17S\3\2\2\2\21[\3\2\2\2\23`\3\2\2\2"+
		"\25f\3\2\2\2\27m\3\2\2\2\31t\3\2\2\2\33{\3\2\2\2\35\u0087\3\2\2\2\37\u0089"+
		"\3\2\2\2!\u0093\3\2\2\2#\u0095\3\2\2\2%\u009a\3\2\2\2\'\u009f\3\2\2\2"+
		")\u00a4\3\2\2\2+\u00a8\3\2\2\2-\u00ac\3\2\2\2/\u00b1\3\2\2\2\61\u00b6"+
		"\3\2\2\2\63\u00ba\3\2\2\2\65\u00be\3\2\2\2\67\u00c2\3\2\2\29:\7?\2\2:"+
		";\3\2\2\2;<\b\2\2\2<\6\3\2\2\2=>\7F\2\2>?\7D\2\2?@\7F\2\2@\b\3\2\2\2A"+
		"B\7F\2\2BC\7D\2\2CD\7F\2\2DE\7I\2\2EF\7G\2\2FG\7P\2\2G\n\3\2\2\2HI\7H"+
		"\2\2IJ\7K\2\2JK\7P\2\2KL\7K\2\2LM\7U\2\2MN\7J\2\2N\f\3\2\2\2OP\7G\2\2"+
		"PQ\7P\2\2QR\7F\2\2R\16\3\2\2\2ST\7F\2\2TU\7C\2\2UV\7V\2\2VW\7C\2\2WX\7"+
		"U\2\2XY\7G\2\2YZ\7V\2\2Z\20\3\2\2\2[\\\7U\2\2\\]\7G\2\2]^\7I\2\2^_\7O"+
		"\2\2_\22\3\2\2\2`a\7H\2\2ab\7K\2\2bc\7G\2\2cd\7N\2\2de\7F\2\2e\24\3\2"+
		"\2\2fg\7N\2\2gh\7E\2\2hi\7J\2\2ij\7K\2\2jk\7N\2\2kl\7F\2\2l\26\3\2\2\2"+
		"mn\7Z\2\2no\7F\2\2op\7H\2\2pq\7N\2\2qr\7F\2\2r\30\3\2\2\2su\t\2\2\2ts"+
		"\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\f\3\2y\32\3\2\2\2"+
		"z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\34\3\2\2\2\177\u0083"+
		"\t\4\2\2\u0080\u0082\5!\20\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0088\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0088\7\62\2\2\u0087\177\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\36\3\2\2\2\u0089\u0091\5\35\16\2\u008a\u008e\7\60\2\2\u008b\u008d\5!"+
		"\20\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u008a\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092 \3\2\2\2\u0093\u0094\t\5\2\2\u0094\"\3"+
		"\2\2\2\u0095\u0096\7*\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\21\4\2\u0098"+
		"\u0099\b\21\5\2\u0099$\3\2\2\2\u009a\u009b\7.\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009d\b\22\6\2\u009d\u009e\b\22\7\2\u009e&\3\2\2\2\u009f\u00a0"+
		"\5\31\f\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\23\7\2\u00a2\u00a3\b\23\3"+
		"\2\u00a3(\3\2\2\2\u00a4\u00a5\5\33\r\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\b\24\b\2\u00a7*\3\2\2\2\u00a8\u00a9\5\35\16\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\25\t\2\u00ab,\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad\u00ae\3\2\2\2"+
		"\u00ae\u00af\b\26\4\2\u00af\u00b0\b\26\5\2\u00b0.\3\2\2\2\u00b1\u00b2"+
		"\7+\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\27\n\2\u00b4\u00b5\b\27\7\2"+
		"\u00b5\60\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b"+
		"\30\6\2\u00b9\62\3\2\2\2\u00ba\u00bb\5\31\f\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\b\31\3\2\u00bd\64\3\2\2\2\u00be\u00bf\5\33\r\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\b\32\b\2\u00c1\66\3\2\2\2\u00c2\u00c3\5\35\16\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\b\33\t\2\u00c58\3\2\2\2\13\2\3\4v}\u0083\u0087"+
		"\u008e\u0091\13\7\3\2\b\2\2\t\4\2\7\4\2\t\3\2\6\2\2\t\21\2\t\22\2\t\5"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}