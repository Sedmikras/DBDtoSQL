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
		NAME=9, ACCESS=10, RMNAME=11, DBVER=12, PASSWD=13, EXIT=14, NONE=15, VERSION=16, 
		DATXEXIT=17, ENCODING=18, REMARKS=19, DATASET=20, DD1=21, SIZE=22, BLOCK=23, 
		DEVICE=24, SCAN=25, FRSPC=26, SEARCHA=27, SEGM=28, EXTERNAL_NAME=29, PARENT=30, 
		SOURCE=31, BYTES=32, DATA=33, FREQ=34, POINTER=35, RULES=36, COMPRTN=37, 
		FIELD=38, MAXBYTES=39, START=40, STARTAFTER=41, RELSTART=42, DATATYPE=43, 
		TYPE=44, CASENAME=45, DEPENDSON=46, MINOCCURS=47, MAXOCCURS=48, REDEFINES=49, 
		LCHILD=50, PAIR=51, XDFLD=52, SEGMENT=53, CONST=54, SRCH=55, SUBSEQ=56, 
		DDATA=57, NULLVAL=58, EXTRTN=59, WS=60, String=61, Int=62, Number=63, 
		Digit=64, PARAM_WS=65, CPARAM_WS=66, PARAM_COM=67, CPARAM_RPAREN=68;
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
			"EQUAL", "DBD", "DBD_GEN", "FINISH", "END", "NAME", "ACCESS", "RMNAME", 
			"DBVER", "PASSWD", "EXIT", "NONE", "VERSION", "DATXEXIT", "ENCODING", 
			"REMARKS", "DATASET", "DD1", "SIZE", "BLOCK", "DEVICE", "SCAN", "FRSPC", 
			"SEARCHA", "SEGM", "EXTERNAL_NAME", "PARENT", "SOURCE", "BYTES", "DATA", 
			"FREQ", "POINTER", "RULES", "COMPRTN", "FIELD", "MAXBYTES", "START", 
			"STARTAFTER", "RELSTART", "DATATYPE", "TYPE", "CASENAME", "DEPENDSON", 
			"MINOCCURS", "MAXOCCURS", "REDEFINES", "LCHILD", "PAIR", "XDFLD", "SEGMENT", 
			"CONST", "SRCH", "SUBSEQ", "DDATA", "NULLVAL", "EXTRTN", "WS", "String", 
			"Int", "Number", "Digit", "PARAM_LPAREN", "PARAM_COM", "PARAM_WS", "PARAM_String", 
			"PARAM_Int", "CPARAM_LPAREN", "CPARAM_RPAREN", "CPARAM_COM", "CPARAM_WS", 
			"CPARAM_String", "CPARAM_Int"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'='", "'DBD'", "'DBDGEN'", "'FINISH'", "'END'", 
			"'NAME'", "'ACCESS'", "'RMNAME'", "'DBVER'", "'PASSWD'", "'EXIT'", "'NONE'", 
			"'VERSION'", "'DATXEXIT'", "'ENCODING'", "'REMARKS'", "'DATASET'", "'DD1'", 
			"'SIZE'", "'BLOCK'", "'DEVICE'", "'SCAN'", "'FRSPC'", "'SEARCHA'", "'SEGM'", 
			"'EXTERNALNAME'", "'PARENT'", "'SOURCE'", "'BYTES'", "'DATA'", "'FREQ'", 
			null, "'RULES'", "'COMPRTN'", "'FIELD'", "'MAXBYTES'", "'START'", "'STARTAFTER'", 
			"'RELSTART'", "'DATATYPE'", "'TYPE'", "'CASENAME'", "'DEPENDSON'", "'MINOCCURS'", 
			"'MAXOCCURS'", "'REDEFINES'", "'LCHILD'", "'PAIR'", "'XDFLD'", "'SEGMENT'", 
			"'CONST'", "'SRCH'", "'SUBSEQ'", "'DDATA'", "'NULLVAL'", "'EXTRTN'", 
			null, null, null, null, null, null, null, null, "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COM", "LPAREN", "RPAREN", "EQUAL", "DBD", "DBD_GEN", "FINISH", 
			"END", "NAME", "ACCESS", "RMNAME", "DBVER", "PASSWD", "EXIT", "NONE", 
			"VERSION", "DATXEXIT", "ENCODING", "REMARKS", "DATASET", "DD1", "SIZE", 
			"BLOCK", "DEVICE", "SCAN", "FRSPC", "SEARCHA", "SEGM", "EXTERNAL_NAME", 
			"PARENT", "SOURCE", "BYTES", "DATA", "FREQ", "POINTER", "RULES", "COMPRTN", 
			"FIELD", "MAXBYTES", "START", "STARTAFTER", "RELSTART", "DATATYPE", "TYPE", 
			"CASENAME", "DEPENDSON", "MINOCCURS", "MAXOCCURS", "REDEFINES", "LCHILD", 
			"PAIR", "XDFLD", "SEGMENT", "CONST", "SRCH", "SUBSEQ", "DDATA", "NULLVAL", 
			"EXTRTN", "WS", "String", "Int", "Number", "Digit", "PARAM_WS", "CPARAM_WS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u0272\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0167\n!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\6:\u0221\n:\r:\16:\u0222\3"+
		":\3:\3;\6;\u0228\n;\r;\16;\u0229\3<\3<\7<\u022e\n<\f<\16<\u0231\13<\3"+
		"<\5<\u0234\n<\3=\3=\3=\7=\u0239\n=\f=\16=\u023c\13=\5=\u023e\n=\3>\3>"+
		"\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C"+
		"\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3I"+
		"\3I\3I\3I\2\2J\5\6\7\7\t\b\13\t\r\n\17\13\21\f\23\r\25\16\27\17\31\20"+
		"\33\21\35\22\37\23!\24#\25%\26\'\27)\30+\31-\32/\33\61\34\63\35\65\36"+
		"\67\379 ;!=\"?#A$C%E&G\'I(K)M*O+Q,S-U.W/Y\60[\61]\62_\63a\64c\65e\66g"+
		"\67i8k9m:o;q<s=u>w?y@{A}B\177\2\u0081E\u0083C\u0085\2\u0087\2\u0089\2"+
		"\u008bF\u008d\2\u008fD\u0091\2\u0093\2\5\2\3\4\6\5\2\13\f\17\17\"\"\5"+
		"\2\62;C\\c|\3\2\63;\3\2\62;\2\u0276\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\3\u0081\3\2\2"+
		"\2\3\u0083\3\2\2\2\3\u0085\3\2\2\2\3\u0087\3\2\2\2\4\u0089\3\2\2\2\4\u008b"+
		"\3\2\2\2\4\u008d\3\2\2\2\4\u008f\3\2\2\2\4\u0091\3\2\2\2\4\u0093\3\2\2"+
		"\2\5\u0095\3\2\2\2\7\u0099\3\2\2\2\t\u009d\3\2\2\2\13\u00a4\3\2\2\2\r"+
		"\u00ab\3\2\2\2\17\u00af\3\2\2\2\21\u00b4\3\2\2\2\23\u00bb\3\2\2\2\25\u00c2"+
		"\3\2\2\2\27\u00c8\3\2\2\2\31\u00cf\3\2\2\2\33\u00d4\3\2\2\2\35\u00d9\3"+
		"\2\2\2\37\u00e1\3\2\2\2!\u00ea\3\2\2\2#\u00f3\3\2\2\2%\u00fb\3\2\2\2\'"+
		"\u0103\3\2\2\2)\u0107\3\2\2\2+\u010c\3\2\2\2-\u0112\3\2\2\2/\u0119\3\2"+
		"\2\2\61\u011e\3\2\2\2\63\u0124\3\2\2\2\65\u012c\3\2\2\2\67\u0131\3\2\2"+
		"\29\u013e\3\2\2\2;\u0145\3\2\2\2=\u014c\3\2\2\2?\u0152\3\2\2\2A\u0157"+
		"\3\2\2\2C\u0166\3\2\2\2E\u0168\3\2\2\2G\u016e\3\2\2\2I\u0176\3\2\2\2K"+
		"\u017c\3\2\2\2M\u0185\3\2\2\2O\u018b\3\2\2\2Q\u0196\3\2\2\2S\u019f\3\2"+
		"\2\2U\u01a8\3\2\2\2W\u01ad\3\2\2\2Y\u01b6\3\2\2\2[\u01c0\3\2\2\2]\u01ca"+
		"\3\2\2\2_\u01d4\3\2\2\2a\u01de\3\2\2\2c\u01e5\3\2\2\2e\u01ea\3\2\2\2g"+
		"\u01f0\3\2\2\2i\u01f8\3\2\2\2k\u01fe\3\2\2\2m\u0203\3\2\2\2o\u020a\3\2"+
		"\2\2q\u0210\3\2\2\2s\u0218\3\2\2\2u\u0220\3\2\2\2w\u0227\3\2\2\2y\u0233"+
		"\3\2\2\2{\u0235\3\2\2\2}\u023f\3\2\2\2\177\u0241\3\2\2\2\u0081\u0246\3"+
		"\2\2\2\u0083\u024b\3\2\2\2\u0085\u0250\3\2\2\2\u0087\u0254\3\2\2\2\u0089"+
		"\u0258\3\2\2\2\u008b\u025d\3\2\2\2\u008d\u0262\3\2\2\2\u008f\u0266\3\2"+
		"\2\2\u0091\u026a\3\2\2\2\u0093\u026e\3\2\2\2\u0095\u0096\7?\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\b\2\2\2\u0098\6\3\2\2\2\u0099\u009a\7F\2\2"+
		"\u009a\u009b\7D\2\2\u009b\u009c\7F\2\2\u009c\b\3\2\2\2\u009d\u009e\7F"+
		"\2\2\u009e\u009f\7D\2\2\u009f\u00a0\7F\2\2\u00a0\u00a1\7I\2\2\u00a1\u00a2"+
		"\7G\2\2\u00a2\u00a3\7P\2\2\u00a3\n\3\2\2\2\u00a4\u00a5\7H\2\2\u00a5\u00a6"+
		"\7K\2\2\u00a6\u00a7\7P\2\2\u00a7\u00a8\7K\2\2\u00a8\u00a9\7U\2\2\u00a9"+
		"\u00aa\7J\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\7G\2\2\u00ac\u00ad\7P\2\2\u00ad"+
		"\u00ae\7F\2\2\u00ae\16\3\2\2\2\u00af\u00b0\7P\2\2\u00b0\u00b1\7C\2\2\u00b1"+
		"\u00b2\7O\2\2\u00b2\u00b3\7G\2\2\u00b3\20\3\2\2\2\u00b4\u00b5\7C\2\2\u00b5"+
		"\u00b6\7E\2\2\u00b6\u00b7\7E\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9\7U\2\2"+
		"\u00b9\u00ba\7U\2\2\u00ba\22\3\2\2\2\u00bb\u00bc\7T\2\2\u00bc\u00bd\7"+
		"O\2\2\u00bd\u00be\7P\2\2\u00be\u00bf\7C\2\2\u00bf\u00c0\7O\2\2\u00c0\u00c1"+
		"\7G\2\2\u00c1\24\3\2\2\2\u00c2\u00c3\7F\2\2\u00c3\u00c4\7D\2\2\u00c4\u00c5"+
		"\7X\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7\7T\2\2\u00c7\26\3\2\2\2\u00c8\u00c9"+
		"\7R\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb\7U\2\2\u00cb\u00cc\7U\2\2\u00cc"+
		"\u00cd\7Y\2\2\u00cd\u00ce\7F\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\7G\2\2\u00d0"+
		"\u00d1\7Z\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d3\7V\2\2\u00d3\32\3\2\2\2\u00d4"+
		"\u00d5\7P\2\2\u00d5\u00d6\7Q\2\2\u00d6\u00d7\7P\2\2\u00d7\u00d8\7G\2\2"+
		"\u00d8\34\3\2\2\2\u00d9\u00da\7X\2\2\u00da\u00db\7G\2\2\u00db\u00dc\7"+
		"T\2\2\u00dc\u00dd\7U\2\2\u00dd\u00de\7K\2\2\u00de\u00df\7Q\2\2\u00df\u00e0"+
		"\7P\2\2\u00e0\36\3\2\2\2\u00e1\u00e2\7F\2\2\u00e2\u00e3\7C\2\2\u00e3\u00e4"+
		"\7V\2\2\u00e4\u00e5\7Z\2\2\u00e5\u00e6\7G\2\2\u00e6\u00e7\7Z\2\2\u00e7"+
		"\u00e8\7K\2\2\u00e8\u00e9\7V\2\2\u00e9 \3\2\2\2\u00ea\u00eb\7G\2\2\u00eb"+
		"\u00ec\7P\2\2\u00ec\u00ed\7E\2\2\u00ed\u00ee\7Q\2\2\u00ee\u00ef\7F\2\2"+
		"\u00ef\u00f0\7K\2\2\u00f0\u00f1\7P\2\2\u00f1\u00f2\7I\2\2\u00f2\"\3\2"+
		"\2\2\u00f3\u00f4\7T\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\7O\2\2\u00f6\u00f7"+
		"\7C\2\2\u00f7\u00f8\7T\2\2\u00f8\u00f9\7M\2\2\u00f9\u00fa\7U\2\2\u00fa"+
		"$\3\2\2\2\u00fb\u00fc\7F\2\2\u00fc\u00fd\7C\2\2\u00fd\u00fe\7V\2\2\u00fe"+
		"\u00ff\7C\2\2\u00ff\u0100\7U\2\2\u0100\u0101\7G\2\2\u0101\u0102\7V\2\2"+
		"\u0102&\3\2\2\2\u0103\u0104\7F\2\2\u0104\u0105\7F\2\2\u0105\u0106\7\63"+
		"\2\2\u0106(\3\2\2\2\u0107\u0108\7U\2\2\u0108\u0109\7K\2\2\u0109\u010a"+
		"\7\\\2\2\u010a\u010b\7G\2\2\u010b*\3\2\2\2\u010c\u010d\7D\2\2\u010d\u010e"+
		"\7N\2\2\u010e\u010f\7Q\2\2\u010f\u0110\7E\2\2\u0110\u0111\7M\2\2\u0111"+
		",\3\2\2\2\u0112\u0113\7F\2\2\u0113\u0114\7G\2\2\u0114\u0115\7X\2\2\u0115"+
		"\u0116\7K\2\2\u0116\u0117\7E\2\2\u0117\u0118\7G\2\2\u0118.\3\2\2\2\u0119"+
		"\u011a\7U\2\2\u011a\u011b\7E\2\2\u011b\u011c\7C\2\2\u011c\u011d\7P\2\2"+
		"\u011d\60\3\2\2\2\u011e\u011f\7H\2\2\u011f\u0120\7T\2\2\u0120\u0121\7"+
		"U\2\2\u0121\u0122\7R\2\2\u0122\u0123\7E\2\2\u0123\62\3\2\2\2\u0124\u0125"+
		"\7U\2\2\u0125\u0126\7G\2\2\u0126\u0127\7C\2\2\u0127\u0128\7T\2\2\u0128"+
		"\u0129\7E\2\2\u0129\u012a\7J\2\2\u012a\u012b\7C\2\2\u012b\64\3\2\2\2\u012c"+
		"\u012d\7U\2\2\u012d\u012e\7G\2\2\u012e\u012f\7I\2\2\u012f\u0130\7O\2\2"+
		"\u0130\66\3\2\2\2\u0131\u0132\7G\2\2\u0132\u0133\7Z\2\2\u0133\u0134\7"+
		"V\2\2\u0134\u0135\7G\2\2\u0135\u0136\7T\2\2\u0136\u0137\7P\2\2\u0137\u0138"+
		"\7C\2\2\u0138\u0139\7N\2\2\u0139\u013a\7P\2\2\u013a\u013b\7C\2\2\u013b"+
		"\u013c\7O\2\2\u013c\u013d\7G\2\2\u013d8\3\2\2\2\u013e\u013f\7R\2\2\u013f"+
		"\u0140\7C\2\2\u0140\u0141\7T\2\2\u0141\u0142\7G\2\2\u0142\u0143\7P\2\2"+
		"\u0143\u0144\7V\2\2\u0144:\3\2\2\2\u0145\u0146\7U\2\2\u0146\u0147\7Q\2"+
		"\2\u0147\u0148\7W\2\2\u0148\u0149\7T\2\2\u0149\u014a\7E\2\2\u014a\u014b"+
		"\7G\2\2\u014b<\3\2\2\2\u014c\u014d\7D\2\2\u014d\u014e\7[\2\2\u014e\u014f"+
		"\7V\2\2\u014f\u0150\7G\2\2\u0150\u0151\7U\2\2\u0151>\3\2\2\2\u0152\u0153"+
		"\7F\2\2\u0153\u0154\7C\2\2\u0154\u0155\7V\2\2\u0155\u0156\7C\2\2\u0156"+
		"@\3\2\2\2\u0157\u0158\7H\2\2\u0158\u0159\7T\2\2\u0159\u015a\7G\2\2\u015a"+
		"\u015b\7S\2\2\u015bB\3\2\2\2\u015c\u015d\7R\2\2\u015d\u015e\7Q\2\2\u015e"+
		"\u015f\7K\2\2\u015f\u0160\7P\2\2\u0160\u0161\7V\2\2\u0161\u0162\7G\2\2"+
		"\u0162\u0167\7T\2\2\u0163\u0164\7R\2\2\u0164\u0165\7V\2\2\u0165\u0167"+
		"\7T\2\2\u0166\u015c\3\2\2\2\u0166\u0163\3\2\2\2\u0167D\3\2\2\2\u0168\u0169"+
		"\7T\2\2\u0169\u016a\7W\2\2\u016a\u016b\7N\2\2\u016b\u016c\7G\2\2\u016c"+
		"\u016d\7U\2\2\u016dF\3\2\2\2\u016e\u016f\7E\2\2\u016f\u0170\7Q\2\2\u0170"+
		"\u0171\7O\2\2\u0171\u0172\7R\2\2\u0172\u0173\7T\2\2\u0173\u0174\7V\2\2"+
		"\u0174\u0175\7P\2\2\u0175H\3\2\2\2\u0176\u0177\7H\2\2\u0177\u0178\7K\2"+
		"\2\u0178\u0179\7G\2\2\u0179\u017a\7N\2\2\u017a\u017b\7F\2\2\u017bJ\3\2"+
		"\2\2\u017c\u017d\7O\2\2\u017d\u017e\7C\2\2\u017e\u017f\7Z\2\2\u017f\u0180"+
		"\7D\2\2\u0180\u0181\7[\2\2\u0181\u0182\7V\2\2\u0182\u0183\7G\2\2\u0183"+
		"\u0184\7U\2\2\u0184L\3\2\2\2\u0185\u0186\7U\2\2\u0186\u0187\7V\2\2\u0187"+
		"\u0188\7C\2\2\u0188\u0189\7T\2\2\u0189\u018a\7V\2\2\u018aN\3\2\2\2\u018b"+
		"\u018c\7U\2\2\u018c\u018d\7V\2\2\u018d\u018e\7C\2\2\u018e\u018f\7T\2\2"+
		"\u018f\u0190\7V\2\2\u0190\u0191\7C\2\2\u0191\u0192\7H\2\2\u0192\u0193"+
		"\7V\2\2\u0193\u0194\7G\2\2\u0194\u0195\7T\2\2\u0195P\3\2\2\2\u0196\u0197"+
		"\7T\2\2\u0197\u0198\7G\2\2\u0198\u0199\7N\2\2\u0199\u019a\7U\2\2\u019a"+
		"\u019b\7V\2\2\u019b\u019c\7C\2\2\u019c\u019d\7T\2\2\u019d\u019e\7V\2\2"+
		"\u019eR\3\2\2\2\u019f\u01a0\7F\2\2\u01a0\u01a1\7C\2\2\u01a1\u01a2\7V\2"+
		"\2\u01a2\u01a3\7C\2\2\u01a3\u01a4\7V\2\2\u01a4\u01a5\7[\2\2\u01a5\u01a6"+
		"\7R\2\2\u01a6\u01a7\7G\2\2\u01a7T\3\2\2\2\u01a8\u01a9\7V\2\2\u01a9\u01aa"+
		"\7[\2\2\u01aa\u01ab\7R\2\2\u01ab\u01ac\7G\2\2\u01acV\3\2\2\2\u01ad\u01ae"+
		"\7E\2\2\u01ae\u01af\7C\2\2\u01af\u01b0\7U\2\2\u01b0\u01b1\7G\2\2\u01b1"+
		"\u01b2\7P\2\2\u01b2\u01b3\7C\2\2\u01b3\u01b4\7O\2\2\u01b4\u01b5\7G\2\2"+
		"\u01b5X\3\2\2\2\u01b6\u01b7\7F\2\2\u01b7\u01b8\7G\2\2\u01b8\u01b9\7R\2"+
		"\2\u01b9\u01ba\7G\2\2\u01ba\u01bb\7P\2\2\u01bb\u01bc\7F\2\2\u01bc\u01bd"+
		"\7U\2\2\u01bd\u01be\7Q\2\2\u01be\u01bf\7P\2\2\u01bfZ\3\2\2\2\u01c0\u01c1"+
		"\7O\2\2\u01c1\u01c2\7K\2\2\u01c2\u01c3\7P\2\2\u01c3\u01c4\7Q\2\2\u01c4"+
		"\u01c5\7E\2\2\u01c5\u01c6\7E\2\2\u01c6\u01c7\7W\2\2\u01c7\u01c8\7T\2\2"+
		"\u01c8\u01c9\7U\2\2\u01c9\\\3\2\2\2\u01ca\u01cb\7O\2\2\u01cb\u01cc\7C"+
		"\2\2\u01cc\u01cd\7Z\2\2\u01cd\u01ce\7Q\2\2\u01ce\u01cf\7E\2\2\u01cf\u01d0"+
		"\7E\2\2\u01d0\u01d1\7W\2\2\u01d1\u01d2\7T\2\2\u01d2\u01d3\7U\2\2\u01d3"+
		"^\3\2\2\2\u01d4\u01d5\7T\2\2\u01d5\u01d6\7G\2\2\u01d6\u01d7\7F\2\2\u01d7"+
		"\u01d8\7G\2\2\u01d8\u01d9\7H\2\2\u01d9\u01da\7K\2\2\u01da\u01db\7P\2\2"+
		"\u01db\u01dc\7G\2\2\u01dc\u01dd\7U\2\2\u01dd`\3\2\2\2\u01de\u01df\7N\2"+
		"\2\u01df\u01e0\7E\2\2\u01e0\u01e1\7J\2\2\u01e1\u01e2\7K\2\2\u01e2\u01e3"+
		"\7N\2\2\u01e3\u01e4\7F\2\2\u01e4b\3\2\2\2\u01e5\u01e6\7R\2\2\u01e6\u01e7"+
		"\7C\2\2\u01e7\u01e8\7K\2\2\u01e8\u01e9\7T\2\2\u01e9d\3\2\2\2\u01ea\u01eb"+
		"\7Z\2\2\u01eb\u01ec\7F\2\2\u01ec\u01ed\7H\2\2\u01ed\u01ee\7N\2\2\u01ee"+
		"\u01ef\7F\2\2\u01eff\3\2\2\2\u01f0\u01f1\7U\2\2\u01f1\u01f2\7G\2\2\u01f2"+
		"\u01f3\7I\2\2\u01f3\u01f4\7O\2\2\u01f4\u01f5\7G\2\2\u01f5\u01f6\7P\2\2"+
		"\u01f6\u01f7\7V\2\2\u01f7h\3\2\2\2\u01f8\u01f9\7E\2\2\u01f9\u01fa\7Q\2"+
		"\2\u01fa\u01fb\7P\2\2\u01fb\u01fc\7U\2\2\u01fc\u01fd\7V\2\2\u01fdj\3\2"+
		"\2\2\u01fe\u01ff\7U\2\2\u01ff\u0200\7T\2\2\u0200\u0201\7E\2\2\u0201\u0202"+
		"\7J\2\2\u0202l\3\2\2\2\u0203\u0204\7U\2\2\u0204\u0205\7W\2\2\u0205\u0206"+
		"\7D\2\2\u0206\u0207\7U\2\2\u0207\u0208\7G\2\2\u0208\u0209\7S\2\2\u0209"+
		"n\3\2\2\2\u020a\u020b\7F\2\2\u020b\u020c\7F\2\2\u020c\u020d\7C\2\2\u020d"+
		"\u020e\7V\2\2\u020e\u020f\7C\2\2\u020fp\3\2\2\2\u0210\u0211\7P\2\2\u0211"+
		"\u0212\7W\2\2\u0212\u0213\7N\2\2\u0213\u0214\7N\2\2\u0214\u0215\7X\2\2"+
		"\u0215\u0216\7C\2\2\u0216\u0217\7N\2\2\u0217r\3\2\2\2\u0218\u0219\7G\2"+
		"\2\u0219\u021a\7Z\2\2\u021a\u021b\7V\2\2\u021b\u021c\7T\2\2\u021c\u021d"+
		"\7V\2\2\u021d\u021e\7P\2\2\u021et\3\2\2\2\u021f\u0221\t\2\2\2\u0220\u021f"+
		"\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0225\b:\3\2\u0225v\3\2\2\2\u0226\u0228\t\3\2\2\u0227"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022ax\3\2\2\2\u022b\u022f\t\4\2\2\u022c\u022e\5}>\2\u022d\u022c"+
		"\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0234\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0234\7\62\2\2\u0233\u022b\3"+
		"\2\2\2\u0233\u0232\3\2\2\2\u0234z\3\2\2\2\u0235\u023d\5y<\2\u0236\u023a"+
		"\7\60\2\2\u0237\u0239\5}>\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2"+
		"\2\2\u023d\u0236\3\2\2\2\u023d\u023e\3\2\2\2\u023e|\3\2\2\2\u023f\u0240"+
		"\t\5\2\2\u0240~\3\2\2\2\u0241\u0242\7*\2\2\u0242\u0243\3\2\2\2\u0243\u0244"+
		"\b?\4\2\u0244\u0245\b?\5\2\u0245\u0080\3\2\2\2\u0246\u0247\7.\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\b@\6\2\u0249\u024a\b@\7\2\u024a\u0082\3\2\2"+
		"\2\u024b\u024c\5u:\2\u024c\u024d\3\2\2\2\u024d\u024e\bA\7\2\u024e\u024f"+
		"\bA\3\2\u024f\u0084\3\2\2\2\u0250\u0251\5w;\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\bB\b\2\u0253\u0086\3\2\2\2\u0254\u0255\5y<\2\u0255\u0256\3\2\2"+
		"\2\u0256\u0257\bC\t\2\u0257\u0088\3\2\2\2\u0258\u0259\7*\2\2\u0259\u025a"+
		"\3\2\2\2\u025a\u025b\bD\4\2\u025b\u025c\bD\5\2\u025c\u008a\3\2\2\2\u025d"+
		"\u025e\7+\2\2\u025e\u025f\3\2\2\2\u025f\u0260\bE\n\2\u0260\u0261\bE\7"+
		"\2\u0261\u008c\3\2\2\2\u0262\u0263\7.\2\2\u0263\u0264\3\2\2\2\u0264\u0265"+
		"\bF\6\2\u0265\u008e\3\2\2\2\u0266\u0267\5u:\2\u0267\u0268\3\2\2\2\u0268"+
		"\u0269\bG\3\2\u0269\u0090\3\2\2\2\u026a\u026b\5w;\2\u026b\u026c\3\2\2"+
		"\2\u026c\u026d\bH\b\2\u026d\u0092\3\2\2\2\u026e\u026f\5y<\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0271\bI\t\2\u0271\u0094\3\2\2\2\f\2\3\4\u0166\u0222\u0229"+
		"\u022f\u0233\u023a\u023d\13\7\3\2\b\2\2\t\4\2\7\4\2\t\3\2\6\2\2\t?\2\t"+
		"@\2\t\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}