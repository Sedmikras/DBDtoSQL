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
		COM=1, LPAREN=2, RPAREN=3, EQUAL=4, QUOTE=5, DBD=6, DBD_GEN=7, FINISH=8, 
		END=9, DATASET=10, SEGM=11, FIELD=12, LCHILD=13, XDFLD=14, TITLE=15, WS=16, 
		String=17, Int=18, Number=19, Digit=20, PARAM_WS=21, CPARAM_WS=22, TEXT_String=23, 
		PARAM_COM=24, CPARAM_RPAREN=25;
	public static final int
		PARAM=1, CLOSED_PARAM=2, TEXT=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PARAM", "CLOSED_PARAM", "TEXT"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUAL", "QUOTE", "DBD", "DBD_GEN", "FINISH", "END", "DATASET", "SEGM", 
			"FIELD", "LCHILD", "XDFLD", "TITLE", "WS", "String", "Int", "Number", 
			"Digit", "PARAM_LPAREN", "PARAM_COM", "PARAM_WS", "PARAM_String", "PARAM_Int", 
			"CPARAM_LPAREN", "CPARAM_RPAREN", "CPARAM_COM", "CPARAM_WS", "CPARAM_String", 
			"CPARAM_Int", "TEXT_QUOTE", "TEXT_String"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'='", null, "'DBD'", "'DBDGEN'", "'FINISH'", 
			"'END'", "'DATASET'", "'SEGM'", "'FIELD'", "'LCHILD'", "'XDFLD'", "'TITLE'", 
			null, null, null, null, null, null, null, null, null, "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COM", "LPAREN", "RPAREN", "EQUAL", "QUOTE", "DBD", "DBD_GEN", 
			"FINISH", "END", "DATASET", "SEGM", "FIELD", "LCHILD", "XDFLD", "TITLE", 
			"WS", "String", "Int", "Number", "Digit", "PARAM_WS", "CPARAM_WS", "TEXT_String", 
			"PARAM_COM", "CPARAM_RPAREN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00e3\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\6\16\u0088\n\16\r\16\16\16\u0089\3\16\3\16\3\17\6\17\u008f"+
		"\n\17\r\17\16\17\u0090\3\20\3\20\7\20\u0095\n\20\f\20\16\20\u0098\13\20"+
		"\3\20\5\20\u009b\n\20\3\21\3\21\3\21\7\21\u00a0\n\21\f\21\16\21\u00a3"+
		"\13\21\5\21\u00a5\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\6\37\u00e0\n\37\r\37\16\37\u00e1\2\2 \6\6"+
		"\b\7\n\b\f\t\16\n\20\13\22\f\24\r\26\16\30\17\32\20\34\21\36\22 \23\""+
		"\24$\25&\26(\2*\32,\27.\2\60\2\62\2\64\33\66\28\30:\2<\2>\2@\31\6\2\3"+
		"\4\5\7\5\2\13\f\17\17\"\"\5\2\62;C\\c|\3\2\63;\3\2\62;\7\2\"\"//\62;C"+
		"\\c|\2\u00e6\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2"+
		"\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2"+
		"\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2"+
		"\2\2\2&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2"+
		"\2\4\62\3\2\2\2\4\64\3\2\2\2\4\66\3\2\2\2\48\3\2\2\2\4:\3\2\2\2\4<\3\2"+
		"\2\2\5>\3\2\2\2\5@\3\2\2\2\6B\3\2\2\2\bF\3\2\2\2\nJ\3\2\2\2\fN\3\2\2\2"+
		"\16U\3\2\2\2\20\\\3\2\2\2\22`\3\2\2\2\24h\3\2\2\2\26m\3\2\2\2\30s\3\2"+
		"\2\2\32z\3\2\2\2\34\u0080\3\2\2\2\36\u0087\3\2\2\2 \u008e\3\2\2\2\"\u009a"+
		"\3\2\2\2$\u009c\3\2\2\2&\u00a6\3\2\2\2(\u00a8\3\2\2\2*\u00ad\3\2\2\2,"+
		"\u00b2\3\2\2\2.\u00b7\3\2\2\2\60\u00bb\3\2\2\2\62\u00bf\3\2\2\2\64\u00c4"+
		"\3\2\2\2\66\u00c9\3\2\2\28\u00cd\3\2\2\2:\u00d1\3\2\2\2<\u00d5\3\2\2\2"+
		">\u00d9\3\2\2\2@\u00df\3\2\2\2BC\7?\2\2CD\3\2\2\2DE\b\2\2\2E\7\3\2\2\2"+
		"FG\7)\2\2GH\3\2\2\2HI\b\3\3\2I\t\3\2\2\2JK\7F\2\2KL\7D\2\2LM\7F\2\2M\13"+
		"\3\2\2\2NO\7F\2\2OP\7D\2\2PQ\7F\2\2QR\7I\2\2RS\7G\2\2ST\7P\2\2T\r\3\2"+
		"\2\2UV\7H\2\2VW\7K\2\2WX\7P\2\2XY\7K\2\2YZ\7U\2\2Z[\7J\2\2[\17\3\2\2\2"+
		"\\]\7G\2\2]^\7P\2\2^_\7F\2\2_\21\3\2\2\2`a\7F\2\2ab\7C\2\2bc\7V\2\2cd"+
		"\7C\2\2de\7U\2\2ef\7G\2\2fg\7V\2\2g\23\3\2\2\2hi\7U\2\2ij\7G\2\2jk\7I"+
		"\2\2kl\7O\2\2l\25\3\2\2\2mn\7H\2\2no\7K\2\2op\7G\2\2pq\7N\2\2qr\7F\2\2"+
		"r\27\3\2\2\2st\7N\2\2tu\7E\2\2uv\7J\2\2vw\7K\2\2wx\7N\2\2xy\7F\2\2y\31"+
		"\3\2\2\2z{\7Z\2\2{|\7F\2\2|}\7H\2\2}~\7N\2\2~\177\7F\2\2\177\33\3\2\2"+
		"\2\u0080\u0081\7V\2\2\u0081\u0082\7K\2\2\u0082\u0083\7V\2\2\u0083\u0084"+
		"\7N\2\2\u0084\u0085\7G\2\2\u0085\35\3\2\2\2\u0086\u0088\t\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\16\4\2\u008c\37\3\2\2\2\u008d\u008f"+
		"\t\3\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091!\3\2\2\2\u0092\u0096\t\4\2\2\u0093\u0095\5&\22\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u009b\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7\62\2\2"+
		"\u009a\u0092\3\2\2\2\u009a\u0099\3\2\2\2\u009b#\3\2\2\2\u009c\u00a4\5"+
		"\"\20\2\u009d\u00a1\7\60\2\2\u009e\u00a0\5&\22\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"%\3\2\2\2\u00a6\u00a7\t\5\2\2\u00a7\'\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\b\23\5\2\u00ab\u00ac\b\23\6\2\u00ac)\3\2\2"+
		"\2\u00ad\u00ae\7.\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\24\7\2\u00b0\u00b1"+
		"\b\24\b\2\u00b1+\3\2\2\2\u00b2\u00b3\5\36\16\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\b\25\b\2\u00b5\u00b6\b\25\4\2\u00b6-\3\2\2\2\u00b7\u00b8\5 \17"+
		"\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\26\t\2\u00ba/\3\2\2\2\u00bb\u00bc"+
		"\5\"\20\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\27\n\2\u00be\61\3\2\2\2\u00bf"+
		"\u00c0\7*\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\30\5\2\u00c2\u00c3\b\30"+
		"\6\2\u00c3\63\3\2\2\2\u00c4\u00c5\7+\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\b\31\13\2\u00c7\u00c8\b\31\b\2\u00c8\65\3\2\2\2\u00c9\u00ca\7.\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\b\32\7\2\u00cc\67\3\2\2\2\u00cd\u00ce\5\36"+
		"\16\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\33\4\2\u00d09\3\2\2\2\u00d1\u00d2"+
		"\5 \17\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\34\t\2\u00d4;\3\2\2\2\u00d5"+
		"\u00d6\5\"\20\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\35\n\2\u00d8=\3\2\2"+
		"\2\u00d9\u00da\7)\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\36\f\2\u00dc\u00dd"+
		"\b\36\b\2\u00dd?\3\2\2\2\u00de\u00e0\t\6\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2A\3\2\2\2"+
		"\r\2\3\4\5\u0089\u0090\u0096\u009a\u00a1\u00a4\u00e1\r\7\3\2\7\5\2\b\2"+
		"\2\t\4\2\7\4\2\t\3\2\6\2\2\t\23\2\t\24\2\t\5\2\t\7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}