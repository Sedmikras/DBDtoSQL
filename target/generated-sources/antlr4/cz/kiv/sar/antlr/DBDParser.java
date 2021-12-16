// Generated from cz\kiv\sar\antlr\DBD.g4 by ANTLR 4.9.3
package cz.kiv.sar.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DBDParser extends Parser {
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
	public static final int
		RULE_source = 0, RULE_dbd = 1, RULE_dbd_params = 2, RULE_dbd_param = 3, 
		RULE_dbd_name = 4, RULE_dbd_access = 5, RULE_dbd_access_value = 6, RULE_dbd_rmname = 7, 
		RULE_dbd_rmname_value = 8, RULE_dbd_dbver = 9, RULE_dbd_passwd = 10, RULE_dbd_exit = 11, 
		RULE_dbd_version = 12, RULE_dbd_datxexit = 13, RULE_dbd_encoding = 14, 
		RULE_dbd_remarks = 15, RULE_access_method = 16, RULE_operating_method = 17, 
		RULE_dataset = 18, RULE_dataset_dd1 = 19, RULE_dataset_size = 20, RULE_segments = 21, 
		RULE_end = 22, RULE_bool_string = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "dbd", "dbd_params", "dbd_param", "dbd_name", "dbd_access", 
			"dbd_access_value", "dbd_rmname", "dbd_rmname_value", "dbd_dbver", "dbd_passwd", 
			"dbd_exit", "dbd_version", "dbd_datxexit", "dbd_encoding", "dbd_remarks", 
			"access_method", "operating_method", "dataset", "dataset_dd1", "dataset_size", 
			"segments", "end", "bool_string"
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

	@Override
	public String getGrammarFileName() { return "DBD.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DBDParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceContext extends ParserRuleContext {
		public DbdContext dbd() {
			return getRuleContext(DbdContext.class,0);
		}
		public DatasetContext dataset() {
			return getRuleContext(DatasetContext.class,0);
		}
		public SegmentsContext segments() {
			return getRuleContext(SegmentsContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			dbd();
			setState(49);
			dataset();
			setState(50);
			segments();
			setState(51);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DbdContext extends ParserRuleContext {
		public Dbd_paramsContext dbd_params() {
			return getRuleContext(Dbd_paramsContext.class,0);
		}
		public DbdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd(this);
		}
	}

	public final DbdContext dbd() throws RecognitionException {
		DbdContext _localctx = new DbdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dbd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			dbd_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_paramsContext extends ParserRuleContext {
		public Dbd_paramContext dbd_param() {
			return getRuleContext(Dbd_paramContext.class,0);
		}
		public Dbd_paramsContext dbd_params() {
			return getRuleContext(Dbd_paramsContext.class,0);
		}
		public Dbd_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_params(this);
		}
	}

	public final Dbd_paramsContext dbd_params() throws RecognitionException {
		Dbd_paramsContext _localctx = new Dbd_paramsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dbd_params);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				dbd_param();
				setState(57);
				match(T__1);
				setState(58);
				dbd_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				dbd_param();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_paramContext extends ParserRuleContext {
		public Dbd_nameContext dbd_name() {
			return getRuleContext(Dbd_nameContext.class,0);
		}
		public Dbd_accessContext dbd_access() {
			return getRuleContext(Dbd_accessContext.class,0);
		}
		public Dbd_rmnameContext dbd_rmname() {
			return getRuleContext(Dbd_rmnameContext.class,0);
		}
		public Dbd_dbverContext dbd_dbver() {
			return getRuleContext(Dbd_dbverContext.class,0);
		}
		public Dbd_passwdContext dbd_passwd() {
			return getRuleContext(Dbd_passwdContext.class,0);
		}
		public Dbd_exitContext dbd_exit() {
			return getRuleContext(Dbd_exitContext.class,0);
		}
		public Dbd_versionContext dbd_version() {
			return getRuleContext(Dbd_versionContext.class,0);
		}
		public Dbd_datxexitContext dbd_datxexit() {
			return getRuleContext(Dbd_datxexitContext.class,0);
		}
		public Dbd_encodingContext dbd_encoding() {
			return getRuleContext(Dbd_encodingContext.class,0);
		}
		public Dbd_remarksContext dbd_remarks() {
			return getRuleContext(Dbd_remarksContext.class,0);
		}
		public Dbd_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_param(this);
		}
	}

	public final Dbd_paramContext dbd_param() throws RecognitionException {
		Dbd_paramContext _localctx = new Dbd_paramContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dbd_param);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				dbd_name();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				dbd_access();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				dbd_rmname();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				dbd_dbver();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				dbd_passwd();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				dbd_exit();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				dbd_version();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				dbd_datxexit();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 9);
				{
				setState(71);
				dbd_encoding();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 10);
				{
				setState(72);
				dbd_remarks();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DBDParser.NAME, 0); }
		public Dbd_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_name(this);
		}
	}

	public final Dbd_nameContext dbd_name() throws RecognitionException {
		Dbd_nameContext _localctx = new Dbd_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dbd_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__2);
			setState(76);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_accessContext extends ParserRuleContext {
		public Dbd_access_valueContext dbd_access_value() {
			return getRuleContext(Dbd_access_valueContext.class,0);
		}
		public Dbd_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_access(this);
		}
	}

	public final Dbd_accessContext dbd_access() throws RecognitionException {
		Dbd_accessContext _localctx = new Dbd_accessContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dbd_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__3);
			setState(79);
			dbd_access_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_access_valueContext extends ParserRuleContext {
		public Access_methodContext access_method() {
			return getRuleContext(Access_methodContext.class,0);
		}
		public Operating_methodContext operating_method() {
			return getRuleContext(Operating_methodContext.class,0);
		}
		public Dbd_access_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_access_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_access_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_access_value(this);
		}
	}

	public final Dbd_access_valueContext dbd_access_value() throws RecognitionException {
		Dbd_access_valueContext _localctx = new Dbd_access_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dbd_access_value);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				access_method();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__4);
				setState(83);
				access_method();
				setState(84);
				match(T__1);
				setState(85);
				operating_method();
				setState(86);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_rmnameContext extends ParserRuleContext {
		public Dbd_rmname_valueContext dbd_rmname_value() {
			return getRuleContext(Dbd_rmname_valueContext.class,0);
		}
		public Dbd_rmnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_rmname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_rmname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_rmname(this);
		}
	}

	public final Dbd_rmnameContext dbd_rmname() throws RecognitionException {
		Dbd_rmnameContext _localctx = new Dbd_rmnameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dbd_rmname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
			setState(91);
			dbd_rmname_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_rmname_valueContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DBDParser.NAME, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(DBDParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DBDParser.NUMBER, i);
		}
		public Dbd_rmname_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_rmname_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_rmname_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_rmname_value(this);
		}
	}

	public final Dbd_rmname_valueContext dbd_rmname_value() throws RecognitionException {
		Dbd_rmname_valueContext _localctx = new Dbd_rmname_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dbd_rmname_value);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__4);
				setState(95);
				match(NAME);
				setState(96);
				match(T__1);
				setState(97);
				match(NUMBER);
				setState(98);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(T__4);
				setState(100);
				match(NAME);
				setState(101);
				match(T__1);
				setState(102);
				match(NUMBER);
				setState(103);
				match(T__1);
				setState(104);
				match(NUMBER);
				setState(105);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(T__4);
				setState(107);
				match(NAME);
				setState(108);
				match(T__1);
				setState(109);
				match(NUMBER);
				setState(110);
				match(T__1);
				setState(111);
				match(NUMBER);
				setState(112);
				match(T__1);
				setState(113);
				match(NUMBER);
				setState(114);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_dbverContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DBDParser.NUMBER, 0); }
		public Dbd_dbverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_dbver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_dbver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_dbver(this);
		}
	}

	public final Dbd_dbverContext dbd_dbver() throws RecognitionException {
		Dbd_dbverContext _localctx = new Dbd_dbverContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dbd_dbver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__7);
			setState(118);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_passwdContext extends ParserRuleContext {
		public Bool_stringContext bool_string() {
			return getRuleContext(Bool_stringContext.class,0);
		}
		public Dbd_passwdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_passwd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_passwd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_passwd(this);
		}
	}

	public final Dbd_passwdContext dbd_passwd() throws RecognitionException {
		Dbd_passwdContext _localctx = new Dbd_passwdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dbd_passwd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__8);
			setState(121);
			bool_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_exitContext extends ParserRuleContext {
		public Dbd_exitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_exit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_exit(this);
		}
	}

	public final Dbd_exitContext dbd_exit() throws RecognitionException {
		Dbd_exitContext _localctx = new Dbd_exitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dbd_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_versionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DBDParser.NAME, 0); }
		public Dbd_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_version(this);
		}
	}

	public final Dbd_versionContext dbd_version() throws RecognitionException {
		Dbd_versionContext _localctx = new Dbd_versionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dbd_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__10);
			setState(126);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_datxexitContext extends ParserRuleContext {
		public Bool_stringContext bool_string() {
			return getRuleContext(Bool_stringContext.class,0);
		}
		public Dbd_datxexitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_datxexit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_datxexit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_datxexit(this);
		}
	}

	public final Dbd_datxexitContext dbd_datxexit() throws RecognitionException {
		Dbd_datxexitContext _localctx = new Dbd_datxexitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dbd_datxexit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__11);
			setState(129);
			bool_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_encodingContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DBDParser.NAME, 0); }
		public Dbd_encodingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_encoding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_encoding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_encoding(this);
		}
	}

	public final Dbd_encodingContext dbd_encoding() throws RecognitionException {
		Dbd_encodingContext _localctx = new Dbd_encodingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dbd_encoding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__12);
			setState(132);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dbd_remarksContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Dbd_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDbd_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDbd_remarks(this);
		}
	}

	public final Dbd_remarksContext dbd_remarks() throws RecognitionException {
		Dbd_remarksContext _localctx = new Dbd_remarksContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dbd_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__13);
			setState(135);
			match(STRING);
			setState(136);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_methodContext extends ParserRuleContext {
		public Access_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterAccess_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitAccess_method(this);
		}
	}

	public final Access_methodContext access_method() throws RecognitionException {
		Access_methodContext _localctx = new Access_methodContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_access_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operating_methodContext extends ParserRuleContext {
		public Operating_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operating_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterOperating_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitOperating_method(this);
		}
	}

	public final Operating_methodContext operating_method() throws RecognitionException {
		Operating_methodContext _localctx = new Operating_methodContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operating_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasetContext extends ParserRuleContext {
		public Dataset_dd1Context dataset_dd1() {
			return getRuleContext(Dataset_dd1Context.class,0);
		}
		public DatasetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset(this);
		}
	}

	public final DatasetContext dataset() throws RecognitionException {
		DatasetContext _localctx = new DatasetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dataset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__32);
			setState(143);
			dataset_dd1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dataset_dd1Context extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DBDParser.NAME, 0); }
		public Dataset_dd1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_dd1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_dd1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_dd1(this);
		}
	}

	public final Dataset_dd1Context dataset_dd1() throws RecognitionException {
		Dataset_dd1Context _localctx = new Dataset_dd1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_dataset_dd1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__33);
			setState(146);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dataset_sizeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DBDParser.NUMBER, 0); }
		public Dataset_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_size(this);
		}
	}

	public final Dataset_sizeContext dataset_size() throws RecognitionException {
		Dataset_sizeContext _localctx = new Dataset_sizeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dataset_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__34);
			setState(149);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentsContext extends ParserRuleContext {
		public SegmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegments(this);
		}
	}

	public final SegmentsContext segments() throws RecognitionException {
		SegmentsContext _localctx = new SegmentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_segments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_stringContext extends ParserRuleContext {
		public Bool_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterBool_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitBool_string(this);
		}
	}

	public final Bool_stringContext bool_string() throws RecognitionException {
		Bool_stringContext _localctx = new Bool_stringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00a0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nv"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\2"+
		"\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\3\2\22\37\3"+
		"\2 \"\3\2\'(\2\u0095\2\62\3\2\2\2\4\67\3\2\2\2\6?\3\2\2\2\bK\3\2\2\2\n"+
		"M\3\2\2\2\fP\3\2\2\2\16Z\3\2\2\2\20\\\3\2\2\2\22u\3\2\2\2\24w\3\2\2\2"+
		"\26z\3\2\2\2\30}\3\2\2\2\32\177\3\2\2\2\34\u0082\3\2\2\2\36\u0085\3\2"+
		"\2\2 \u0088\3\2\2\2\"\u008c\3\2\2\2$\u008e\3\2\2\2&\u0090\3\2\2\2(\u0093"+
		"\3\2\2\2*\u0096\3\2\2\2,\u0099\3\2\2\2.\u009b\3\2\2\2\60\u009d\3\2\2\2"+
		"\62\63\5\4\3\2\63\64\5&\24\2\64\65\5,\27\2\65\66\5.\30\2\66\3\3\2\2\2"+
		"\678\7\3\2\289\5\6\4\29\5\3\2\2\2:;\5\b\5\2;<\7\4\2\2<=\5\6\4\2=@\3\2"+
		"\2\2>@\5\b\5\2?:\3\2\2\2?>\3\2\2\2@\7\3\2\2\2AL\5\n\6\2BL\5\f\7\2CL\5"+
		"\20\t\2DL\5\24\13\2EL\5\26\f\2FL\5\30\r\2GL\5\32\16\2HL\5\34\17\2IL\5"+
		"\36\20\2JL\5 \21\2KA\3\2\2\2KB\3\2\2\2KC\3\2\2\2KD\3\2\2\2KE\3\2\2\2K"+
		"F\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MN\7\5\2\2"+
		"NO\7)\2\2O\13\3\2\2\2PQ\7\6\2\2QR\5\16\b\2R\r\3\2\2\2S[\5\"\22\2TU\7\7"+
		"\2\2UV\5\"\22\2VW\7\4\2\2WX\5$\23\2XY\7\b\2\2Y[\3\2\2\2ZS\3\2\2\2ZT\3"+
		"\2\2\2[\17\3\2\2\2\\]\7\t\2\2]^\5\22\n\2^\21\3\2\2\2_v\7)\2\2`a\7\7\2"+
		"\2ab\7)\2\2bc\7\4\2\2cd\7+\2\2dv\7\b\2\2ef\7\7\2\2fg\7)\2\2gh\7\4\2\2"+
		"hi\7+\2\2ij\7\4\2\2jk\7+\2\2kv\7\b\2\2lm\7\7\2\2mn\7)\2\2no\7\4\2\2op"+
		"\7+\2\2pq\7\4\2\2qr\7+\2\2rs\7\4\2\2st\7+\2\2tv\7\b\2\2u_\3\2\2\2u`\3"+
		"\2\2\2ue\3\2\2\2ul\3\2\2\2v\23\3\2\2\2wx\7\n\2\2xy\7+\2\2y\25\3\2\2\2"+
		"z{\7\13\2\2{|\5\60\31\2|\27\3\2\2\2}~\7\f\2\2~\31\3\2\2\2\177\u0080\7"+
		"\r\2\2\u0080\u0081\7)\2\2\u0081\33\3\2\2\2\u0082\u0083\7\16\2\2\u0083"+
		"\u0084\5\60\31\2\u0084\35\3\2\2\2\u0085\u0086\7\17\2\2\u0086\u0087\7)"+
		"\2\2\u0087\37\3\2\2\2\u0088\u0089\7\20\2\2\u0089\u008a\7*\2\2\u008a\u008b"+
		"\7\21\2\2\u008b!\3\2\2\2\u008c\u008d\t\2\2\2\u008d#\3\2\2\2\u008e\u008f"+
		"\t\3\2\2\u008f%\3\2\2\2\u0090\u0091\7#\2\2\u0091\u0092\5(\25\2\u0092\'"+
		"\3\2\2\2\u0093\u0094\7$\2\2\u0094\u0095\7)\2\2\u0095)\3\2\2\2\u0096\u0097"+
		"\7%\2\2\u0097\u0098\7+\2\2\u0098+\3\2\2\2\u0099\u009a\7&\2\2\u009a-\3"+
		"\2\2\2\u009b\u009c\7&\2\2\u009c/\3\2\2\2\u009d\u009e\t\4\2\2\u009e\61"+
		"\3\2\2\2\6?KZu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}