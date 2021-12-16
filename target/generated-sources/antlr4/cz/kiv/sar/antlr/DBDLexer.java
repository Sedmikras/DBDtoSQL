// Generated from cz\kiv\sar\antlr\DBD.g4 by ANTLR 4.9.3
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		NAME=39, STRING=40, NUMBER=41, ANY=42, WS=43;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "NAME", "STRING", "NUMBER", 
			"ANY", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DBD '", "','", "'NAME='", "'ACCESS='", "'('", "')'", "'RMNAME'", 
			"'DBVER='", "'PASSWD='", "'EXIT=(NONE)'", "'VERSION='", "'DATXEXIT='", 
			"'ENCODING='", "'REMARKS=''", "'''", "'GSAM'", "'HDAM'", "'HIDAM'", "'HISAM'", 
			"'SHISAM'", "'HSAM'", "'SHSAM'", "'INDEX'", "'LOGICAL'", "'MSDB'", "'PHDAM'", 
			"'PHIDAM'", "'PSINDEX'", "'DEDB'", "'BSAM'", "'VSAM'", "'OSAM'", "'DATASET '", 
			"'DD1='", "'SIZE='", "'todo'", "'YES'", "'NO'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NAME", "STRING", "NUMBER", "ANY", "WS"
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
	public String getGrammarFileName() { return "DBD.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u015f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\7(\u0144\n(\f"+
		"(\16(\u0147\13(\3)\3)\7)\u014b\n)\f)\16)\u014e\13)\3*\3*\7*\u0152\n*\f"+
		"*\16*\u0155\13*\3+\3+\3,\6,\u015a\n,\r,\16,\u015b\3,\3,\2\2-\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-\3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\63;\3\2\62;\5\2"+
		"\13\f\17\17\"\"\2\u0162\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5^\3\2\2\2\7`\3"+
		"\2\2\2\tf\3\2\2\2\13n\3\2\2\2\rp\3\2\2\2\17r\3\2\2\2\21y\3\2\2\2\23\u0080"+
		"\3\2\2\2\25\u0088\3\2\2\2\27\u0094\3\2\2\2\31\u009d\3\2\2\2\33\u00a7\3"+
		"\2\2\2\35\u00b1\3\2\2\2\37\u00bb\3\2\2\2!\u00bd\3\2\2\2#\u00c2\3\2\2\2"+
		"%\u00c7\3\2\2\2\'\u00cd\3\2\2\2)\u00d3\3\2\2\2+\u00da\3\2\2\2-\u00df\3"+
		"\2\2\2/\u00e5\3\2\2\2\61\u00eb\3\2\2\2\63\u00f3\3\2\2\2\65\u00f8\3\2\2"+
		"\2\67\u00fe\3\2\2\29\u0105\3\2\2\2;\u010d\3\2\2\2=\u0112\3\2\2\2?\u0117"+
		"\3\2\2\2A\u011c\3\2\2\2C\u0121\3\2\2\2E\u012a\3\2\2\2G\u012f\3\2\2\2I"+
		"\u0135\3\2\2\2K\u013a\3\2\2\2M\u013e\3\2\2\2O\u0141\3\2\2\2Q\u0148\3\2"+
		"\2\2S\u014f\3\2\2\2U\u0156\3\2\2\2W\u0159\3\2\2\2YZ\7F\2\2Z[\7D\2\2[\\"+
		"\7F\2\2\\]\7\"\2\2]\4\3\2\2\2^_\7.\2\2_\6\3\2\2\2`a\7P\2\2ab\7C\2\2bc"+
		"\7O\2\2cd\7G\2\2de\7?\2\2e\b\3\2\2\2fg\7C\2\2gh\7E\2\2hi\7E\2\2ij\7G\2"+
		"\2jk\7U\2\2kl\7U\2\2lm\7?\2\2m\n\3\2\2\2no\7*\2\2o\f\3\2\2\2pq\7+\2\2"+
		"q\16\3\2\2\2rs\7T\2\2st\7O\2\2tu\7P\2\2uv\7C\2\2vw\7O\2\2wx\7G\2\2x\20"+
		"\3\2\2\2yz\7F\2\2z{\7D\2\2{|\7X\2\2|}\7G\2\2}~\7T\2\2~\177\7?\2\2\177"+
		"\22\3\2\2\2\u0080\u0081\7R\2\2\u0081\u0082\7C\2\2\u0082\u0083\7U\2\2\u0083"+
		"\u0084\7U\2\2\u0084\u0085\7Y\2\2\u0085\u0086\7F\2\2\u0086\u0087\7?\2\2"+
		"\u0087\24\3\2\2\2\u0088\u0089\7G\2\2\u0089\u008a\7Z\2\2\u008a\u008b\7"+
		"K\2\2\u008b\u008c\7V\2\2\u008c\u008d\7?\2\2\u008d\u008e\7*\2\2\u008e\u008f"+
		"\7P\2\2\u008f\u0090\7Q\2\2\u0090\u0091\7P\2\2\u0091\u0092\7G\2\2\u0092"+
		"\u0093\7+\2\2\u0093\26\3\2\2\2\u0094\u0095\7X\2\2\u0095\u0096\7G\2\2\u0096"+
		"\u0097\7T\2\2\u0097\u0098\7U\2\2\u0098\u0099\7K\2\2\u0099\u009a\7Q\2\2"+
		"\u009a\u009b\7P\2\2\u009b\u009c\7?\2\2\u009c\30\3\2\2\2\u009d\u009e\7"+
		"F\2\2\u009e\u009f\7C\2\2\u009f\u00a0\7V\2\2\u00a0\u00a1\7Z\2\2\u00a1\u00a2"+
		"\7G\2\2\u00a2\u00a3\7Z\2\2\u00a3\u00a4\7K\2\2\u00a4\u00a5\7V\2\2\u00a5"+
		"\u00a6\7?\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7G\2\2\u00a8\u00a9\7P\2\2\u00a9"+
		"\u00aa\7E\2\2\u00aa\u00ab\7Q\2\2\u00ab\u00ac\7F\2\2\u00ac\u00ad\7K\2\2"+
		"\u00ad\u00ae\7P\2\2\u00ae\u00af\7I\2\2\u00af\u00b0\7?\2\2\u00b0\34\3\2"+
		"\2\2\u00b1\u00b2\7T\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4\7O\2\2\u00b4\u00b5"+
		"\7C\2\2\u00b5\u00b6\7T\2\2\u00b6\u00b7\7M\2\2\u00b7\u00b8\7U\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9\u00ba\7)\2\2\u00ba\36\3\2\2\2\u00bb\u00bc\7)\2\2\u00bc"+
		" \3\2\2\2\u00bd\u00be\7I\2\2\u00be\u00bf\7U\2\2\u00bf\u00c0\7C\2\2\u00c0"+
		"\u00c1\7O\2\2\u00c1\"\3\2\2\2\u00c2\u00c3\7J\2\2\u00c3\u00c4\7F\2\2\u00c4"+
		"\u00c5\7C\2\2\u00c5\u00c6\7O\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7J\2\2\u00c8"+
		"\u00c9\7K\2\2\u00c9\u00ca\7F\2\2\u00ca\u00cb\7C\2\2\u00cb\u00cc\7O\2\2"+
		"\u00cc&\3\2\2\2\u00cd\u00ce\7J\2\2\u00ce\u00cf\7K\2\2\u00cf\u00d0\7U\2"+
		"\2\u00d0\u00d1\7C\2\2\u00d1\u00d2\7O\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7"+
		"U\2\2\u00d4\u00d5\7J\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8"+
		"\7C\2\2\u00d8\u00d9\7O\2\2\u00d9*\3\2\2\2\u00da\u00db\7J\2\2\u00db\u00dc"+
		"\7U\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de\7O\2\2\u00de,\3\2\2\2\u00df\u00e0"+
		"\7U\2\2\u00e0\u00e1\7J\2\2\u00e1\u00e2\7U\2\2\u00e2\u00e3\7C\2\2\u00e3"+
		"\u00e4\7O\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7K\2\2\u00e6\u00e7\7P\2\2\u00e7"+
		"\u00e8\7F\2\2\u00e8\u00e9\7G\2\2\u00e9\u00ea\7Z\2\2\u00ea\60\3\2\2\2\u00eb"+
		"\u00ec\7N\2\2\u00ec\u00ed\7Q\2\2\u00ed\u00ee\7I\2\2\u00ee\u00ef\7K\2\2"+
		"\u00ef\u00f0\7E\2\2\u00f0\u00f1\7C\2\2\u00f1\u00f2\7N\2\2\u00f2\62\3\2"+
		"\2\2\u00f3\u00f4\7O\2\2\u00f4\u00f5\7U\2\2\u00f5\u00f6\7F\2\2\u00f6\u00f7"+
		"\7D\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7R\2\2\u00f9\u00fa\7J\2\2\u00fa\u00fb"+
		"\7F\2\2\u00fb\u00fc\7C\2\2\u00fc\u00fd\7O\2\2\u00fd\66\3\2\2\2\u00fe\u00ff"+
		"\7R\2\2\u00ff\u0100\7J\2\2\u0100\u0101\7K\2\2\u0101\u0102\7F\2\2\u0102"+
		"\u0103\7C\2\2\u0103\u0104\7O\2\2\u01048\3\2\2\2\u0105\u0106\7R\2\2\u0106"+
		"\u0107\7U\2\2\u0107\u0108\7K\2\2\u0108\u0109\7P\2\2\u0109\u010a\7F\2\2"+
		"\u010a\u010b\7G\2\2\u010b\u010c\7Z\2\2\u010c:\3\2\2\2\u010d\u010e\7F\2"+
		"\2\u010e\u010f\7G\2\2\u010f\u0110\7F\2\2\u0110\u0111\7D\2\2\u0111<\3\2"+
		"\2\2\u0112\u0113\7D\2\2\u0113\u0114\7U\2\2\u0114\u0115\7C\2\2\u0115\u0116"+
		"\7O\2\2\u0116>\3\2\2\2\u0117\u0118\7X\2\2\u0118\u0119\7U\2\2\u0119\u011a"+
		"\7C\2\2\u011a\u011b\7O\2\2\u011b@\3\2\2\2\u011c\u011d\7Q\2\2\u011d\u011e"+
		"\7U\2\2\u011e\u011f\7C\2\2\u011f\u0120\7O\2\2\u0120B\3\2\2\2\u0121\u0122"+
		"\7F\2\2\u0122\u0123\7C\2\2\u0123\u0124\7V\2\2\u0124\u0125\7C\2\2\u0125"+
		"\u0126\7U\2\2\u0126\u0127\7G\2\2\u0127\u0128\7V\2\2\u0128\u0129\7\"\2"+
		"\2\u0129D\3\2\2\2\u012a\u012b\7F\2\2\u012b\u012c\7F\2\2\u012c\u012d\7"+
		"\63\2\2\u012d\u012e\7?\2\2\u012eF\3\2\2\2\u012f\u0130\7U\2\2\u0130\u0131"+
		"\7K\2\2\u0131\u0132\7\\\2\2\u0132\u0133\7G\2\2\u0133\u0134\7?\2\2\u0134"+
		"H\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7q\2\2\u0137\u0138\7f\2\2\u0138"+
		"\u0139\7q\2\2\u0139J\3\2\2\2\u013a\u013b\7[\2\2\u013b\u013c\7G\2\2\u013c"+
		"\u013d\7U\2\2\u013dL\3\2\2\2\u013e\u013f\7P\2\2\u013f\u0140\7Q\2\2\u0140"+
		"N\3\2\2\2\u0141\u0145\t\2\2\2\u0142\u0144\t\3\2\2\u0143\u0142\3\2\2\2"+
		"\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146P\3"+
		"\2\2\2\u0147\u0145\3\2\2\2\u0148\u014c\t\2\2\2\u0149\u014b\t\3\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014dR\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0153\t\4\2\2\u0150\u0152"+
		"\t\5\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154T\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\13\2\2\2"+
		"\u0157V\3\2\2\2\u0158\u015a\t\6\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3"+
		"\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\b,\2\2\u015eX\3\2\2\2\7\2\u0145\u014c\u0153\u015b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}