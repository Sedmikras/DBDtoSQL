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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, NAME=54, STRING=55, ANY=56, Number=57, WS=58;
	public static final int
		RULE_source = 0, RULE_dbd = 1, RULE_dbd_params = 2, RULE_dbd_param = 3, 
		RULE_dbd_name = 4, RULE_dbd_access = 5, RULE_dbd_access_value = 6, RULE_dbd_rmname = 7, 
		RULE_dbd_rmname_value = 8, RULE_dbd_dbver = 9, RULE_dbd_passwd = 10, RULE_dbd_exit = 11, 
		RULE_dbd_version = 12, RULE_dbd_datxexit = 13, RULE_dbd_encoding = 14, 
		RULE_dbd_remarks = 15, RULE_access_method = 16, RULE_operating_method = 17, 
		RULE_dataset = 18, RULE_dataset_with_label = 19, RULE_dataset_without_label = 20, 
		RULE_dataset_params = 21, RULE_dataset_param = 22, RULE_dataset_dd1 = 23, 
		RULE_dataset_size = 24, RULE_dataset_block = 25, RULE_dataset_device = 26, 
		RULE_dataset_scan = 27, RULE_dataset_frspc = 28, RULE_dataset_searcha = 29, 
		RULE_dataset_remarks = 30, RULE_segment = 31, RULE_segment_definition = 32, 
		RULE_segment_params = 33, RULE_segment_param = 34, RULE_segment_name = 35, 
		RULE_segment_parent = 36, RULE_segment_bytes = 37, RULE_segment_ptr = 38, 
		RULE_field = 39, RULE_field_params = 40, RULE_field_param = 41, RULE_field_name = 42, 
		RULE_field_bytes = 43, RULE_field_start = 44, RULE_field_datatype = 45, 
		RULE_field_type = 46, RULE_end = 47, RULE_bool_string = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "dbd", "dbd_params", "dbd_param", "dbd_name", "dbd_access", 
			"dbd_access_value", "dbd_rmname", "dbd_rmname_value", "dbd_dbver", "dbd_passwd", 
			"dbd_exit", "dbd_version", "dbd_datxexit", "dbd_encoding", "dbd_remarks", 
			"access_method", "operating_method", "dataset", "dataset_with_label", 
			"dataset_without_label", "dataset_params", "dataset_param", "dataset_dd1", 
			"dataset_size", "dataset_block", "dataset_device", "dataset_scan", "dataset_frspc", 
			"dataset_searcha", "dataset_remarks", "segment", "segment_definition", 
			"segment_params", "segment_param", "segment_name", "segment_parent", 
			"segment_bytes", "segment_ptr", "field", "field_params", "field_param", 
			"field_name", "field_bytes", "field_start", "field_datatype", "field_type", 
			"end", "bool_string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DBD '", "','", "'NAME='", "'ACCESS='", "'('", "')'", "'RMNAME='", 
			"'DBVER='", "'PASSWD='", "'EXIT=(NONE)'", "'VERSION='", "'DATXEXIT='", 
			"'ENCODING='", "'REMARKS=''", "'''", "'GSAM'", "'HDAM'", "'HIDAM'", "'HISAM'", 
			"'SHISAM'", "'HSAM'", "'SHSAM'", "'INDEX'", "'LOGICAL'", "'MSDB'", "'PHDAM'", 
			"'PHIDAM'", "'PSINDEX'", "'DEDB'", "'BSAM'", "'VSAM'", "'OSAM'", "'DATASET '", 
			"'DD1='", "'SIZE='", "'BLOCK='", "'DEVICE='", "'SCAN='", "'FRSPC=('", 
			"'SEARCHA='", "'REMARKS='", "'SEGM '", "'PARENT='", "'BYTES='", "'PTR=(T)'", 
			"'FIELD '", "'NAME=('", "'START='", "'DATATYPE='", "'TYPE='", "'todo'", 
			"'YES'", "'NO'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NAME", "STRING", "ANY", "Number", 
			"WS"
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
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			dbd();
			setState(99);
			dataset();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(100);
				segment();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
			setState(108);
			match(T__0);
			setState(109);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				dbd_param();
				setState(112);
				match(T__1);
				setState(113);
				dbd_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				dbd_name();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				dbd_access();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				dbd_rmname();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				dbd_dbver();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				dbd_passwd();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				dbd_exit();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				dbd_version();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				dbd_datxexit();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 9);
				{
				setState(126);
				dbd_encoding();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 10);
				{
				setState(127);
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
			setState(130);
			match(T__2);
			setState(131);
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
			setState(133);
			match(T__3);
			setState(134);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__4);
				setState(137);
				access_method();
				setState(138);
				match(T__1);
				setState(139);
				operating_method();
				setState(140);
				match(T__5);
				}
				break;
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
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				access_method();
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
			setState(145);
			match(T__6);
			setState(146);
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
		public List<TerminalNode> STRING() { return getTokens(DBDParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DBDParser.STRING, i);
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
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__4);
				setState(149);
				match(NAME);
				setState(150);
				match(T__1);
				setState(151);
				match(STRING);
				setState(152);
				match(T__1);
				setState(153);
				match(STRING);
				setState(154);
				match(T__1);
				setState(155);
				match(STRING);
				setState(156);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__4);
				setState(158);
				match(NAME);
				setState(159);
				match(T__1);
				setState(160);
				match(STRING);
				setState(161);
				match(T__1);
				setState(162);
				match(STRING);
				setState(163);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(T__4);
				setState(165);
				match(NAME);
				setState(166);
				match(T__1);
				setState(167);
				match(STRING);
				setState(168);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(NAME);
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
		public TerminalNode Number() { return getToken(DBDParser.Number, 0); }
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
			setState(172);
			match(T__7);
			setState(173);
			match(Number);
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
			setState(175);
			match(T__8);
			setState(176);
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
			setState(178);
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
			setState(180);
			match(T__10);
			setState(181);
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
			setState(183);
			match(T__11);
			setState(184);
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
			setState(186);
			match(T__12);
			setState(187);
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
			setState(189);
			match(T__13);
			setState(190);
			match(STRING);
			setState(191);
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
			setState(193);
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
			setState(195);
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
		public Dataset_without_labelContext dataset_without_label() {
			return getRuleContext(Dataset_without_labelContext.class,0);
		}
		public Dataset_with_labelContext dataset_with_label() {
			return getRuleContext(Dataset_with_labelContext.class,0);
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				dataset_without_label();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				dataset_with_label();
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

	public static class Dataset_with_labelContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Dataset_paramsContext dataset_params() {
			return getRuleContext(Dataset_paramsContext.class,0);
		}
		public Dataset_with_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_with_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_with_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_with_label(this);
		}
	}

	public final Dataset_with_labelContext dataset_with_label() throws RecognitionException {
		Dataset_with_labelContext _localctx = new Dataset_with_labelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dataset_with_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(STRING);
			setState(202);
			match(T__32);
			setState(203);
			dataset_params();
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

	public static class Dataset_without_labelContext extends ParserRuleContext {
		public Dataset_paramsContext dataset_params() {
			return getRuleContext(Dataset_paramsContext.class,0);
		}
		public Dataset_without_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_without_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_without_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_without_label(this);
		}
	}

	public final Dataset_without_labelContext dataset_without_label() throws RecognitionException {
		Dataset_without_labelContext _localctx = new Dataset_without_labelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dataset_without_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__32);
			setState(206);
			dataset_params();
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

	public static class Dataset_paramsContext extends ParserRuleContext {
		public Dataset_paramContext dataset_param() {
			return getRuleContext(Dataset_paramContext.class,0);
		}
		public Dataset_paramsContext dataset_params() {
			return getRuleContext(Dataset_paramsContext.class,0);
		}
		public Dataset_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_params(this);
		}
	}

	public final Dataset_paramsContext dataset_params() throws RecognitionException {
		Dataset_paramsContext _localctx = new Dataset_paramsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dataset_params);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				dataset_param();
				setState(209);
				match(T__1);
				setState(210);
				dataset_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				dataset_param();
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

	public static class Dataset_paramContext extends ParserRuleContext {
		public Dataset_dd1Context dataset_dd1() {
			return getRuleContext(Dataset_dd1Context.class,0);
		}
		public Dataset_sizeContext dataset_size() {
			return getRuleContext(Dataset_sizeContext.class,0);
		}
		public Dataset_blockContext dataset_block() {
			return getRuleContext(Dataset_blockContext.class,0);
		}
		public Dataset_deviceContext dataset_device() {
			return getRuleContext(Dataset_deviceContext.class,0);
		}
		public Dataset_scanContext dataset_scan() {
			return getRuleContext(Dataset_scanContext.class,0);
		}
		public Dataset_frspcContext dataset_frspc() {
			return getRuleContext(Dataset_frspcContext.class,0);
		}
		public Dataset_searchaContext dataset_searcha() {
			return getRuleContext(Dataset_searchaContext.class,0);
		}
		public Dataset_remarksContext dataset_remarks() {
			return getRuleContext(Dataset_remarksContext.class,0);
		}
		public Dataset_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_param(this);
		}
	}

	public final Dataset_paramContext dataset_param() throws RecognitionException {
		Dataset_paramContext _localctx = new Dataset_paramContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dataset_param);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				dataset_dd1();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				dataset_size();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				dataset_block();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				dataset_device();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				dataset_scan();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				dataset_frspc();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				dataset_searcha();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				dataset_remarks();
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
		enterRule(_localctx, 46, RULE_dataset_dd1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__33);
			setState(226);
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
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
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
		enterRule(_localctx, 48, RULE_dataset_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__34);
			setState(229);
			match(STRING);
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

	public static class Dataset_blockContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Dataset_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_block(this);
		}
	}

	public final Dataset_blockContext dataset_block() throws RecognitionException {
		Dataset_blockContext _localctx = new Dataset_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dataset_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__35);
			setState(232);
			match(STRING);
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

	public static class Dataset_deviceContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Dataset_deviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_device; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_device(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_device(this);
		}
	}

	public final Dataset_deviceContext dataset_device() throws RecognitionException {
		Dataset_deviceContext _localctx = new Dataset_deviceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dataset_device);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__36);
			setState(235);
			match(STRING);
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

	public static class Dataset_scanContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Dataset_scanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_scan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_scan(this);
		}
	}

	public final Dataset_scanContext dataset_scan() throws RecognitionException {
		Dataset_scanContext _localctx = new Dataset_scanContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dataset_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__37);
			setState(238);
			match(STRING);
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

	public static class Dataset_frspcContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Dataset_frspcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_frspc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_frspc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_frspc(this);
		}
	}

	public final Dataset_frspcContext dataset_frspc() throws RecognitionException {
		Dataset_frspcContext _localctx = new Dataset_frspcContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dataset_frspc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__38);
			setState(241);
			match(STRING);
			setState(242);
			match(T__5);
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

	public static class Dataset_searchaContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(DBDParser.Number, 0); }
		public Dataset_searchaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_searcha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_searcha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_searcha(this);
		}
	}

	public final Dataset_searchaContext dataset_searcha() throws RecognitionException {
		Dataset_searchaContext _localctx = new Dataset_searchaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dataset_searcha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__39);
			setState(245);
			match(Number);
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

	public static class Dataset_remarksContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Dataset_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterDataset_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitDataset_remarks(this);
		}
	}

	public final Dataset_remarksContext dataset_remarks() throws RecognitionException {
		Dataset_remarksContext _localctx = new Dataset_remarksContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dataset_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__40);
			setState(248);
			match(STRING);
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

	public static class SegmentContext extends ParserRuleContext {
		public Segment_definitionContext segment_definition() {
			return getRuleContext(Segment_definitionContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			segment_definition();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(251);
				field();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Segment_definitionContext extends ParserRuleContext {
		public Segment_paramsContext segment_params() {
			return getRuleContext(Segment_paramsContext.class,0);
		}
		public Segment_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_definition(this);
		}
	}

	public final Segment_definitionContext segment_definition() throws RecognitionException {
		Segment_definitionContext _localctx = new Segment_definitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_segment_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__41);
			setState(258);
			segment_params();
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

	public static class Segment_paramsContext extends ParserRuleContext {
		public Segment_paramContext segment_param() {
			return getRuleContext(Segment_paramContext.class,0);
		}
		public Segment_paramsContext segment_params() {
			return getRuleContext(Segment_paramsContext.class,0);
		}
		public Segment_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_params(this);
		}
	}

	public final Segment_paramsContext segment_params() throws RecognitionException {
		Segment_paramsContext _localctx = new Segment_paramsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_segment_params);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				segment_param();
				setState(261);
				match(T__1);
				setState(262);
				segment_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				segment_param();
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

	public static class Segment_paramContext extends ParserRuleContext {
		public Segment_nameContext segment_name() {
			return getRuleContext(Segment_nameContext.class,0);
		}
		public Segment_parentContext segment_parent() {
			return getRuleContext(Segment_parentContext.class,0);
		}
		public Segment_bytesContext segment_bytes() {
			return getRuleContext(Segment_bytesContext.class,0);
		}
		public Segment_ptrContext segment_ptr() {
			return getRuleContext(Segment_ptrContext.class,0);
		}
		public Segment_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_param(this);
		}
	}

	public final Segment_paramContext segment_param() throws RecognitionException {
		Segment_paramContext _localctx = new Segment_paramContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_segment_param);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				segment_name();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				segment_parent();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				segment_bytes();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				segment_ptr();
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

	public static class Segment_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DBDParser.NAME, 0); }
		public Segment_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_name(this);
		}
	}

	public final Segment_nameContext segment_name() throws RecognitionException {
		Segment_nameContext _localctx = new Segment_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_segment_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__2);
			setState(274);
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

	public static class Segment_parentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Segment_parentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_parent(this);
		}
	}

	public final Segment_parentContext segment_parent() throws RecognitionException {
		Segment_parentContext _localctx = new Segment_parentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_segment_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__42);
			setState(277);
			match(STRING);
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

	public static class Segment_bytesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Segment_bytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_bytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_bytes(this);
		}
	}

	public final Segment_bytesContext segment_bytes() throws RecognitionException {
		Segment_bytesContext _localctx = new Segment_bytesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_segment_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__43);
			setState(280);
			match(STRING);
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

	public static class Segment_ptrContext extends ParserRuleContext {
		public Segment_ptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_ptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_ptr(this);
		}
	}

	public final Segment_ptrContext segment_ptr() throws RecognitionException {
		Segment_ptrContext _localctx = new Segment_ptrContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_segment_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__44);
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

	public static class FieldContext extends ParserRuleContext {
		public Field_paramsContext field_params() {
			return getRuleContext(Field_paramsContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__45);
			setState(285);
			field_params();
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

	public static class Field_paramsContext extends ParserRuleContext {
		public Field_paramContext field_param() {
			return getRuleContext(Field_paramContext.class,0);
		}
		public Field_paramsContext field_params() {
			return getRuleContext(Field_paramsContext.class,0);
		}
		public Field_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_params(this);
		}
	}

	public final Field_paramsContext field_params() throws RecognitionException {
		Field_paramsContext _localctx = new Field_paramsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_field_params);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				field_param();
				setState(288);
				match(T__1);
				setState(289);
				field_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				field_param();
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

	public static class Field_paramContext extends ParserRuleContext {
		public Field_nameContext field_name() {
			return getRuleContext(Field_nameContext.class,0);
		}
		public Field_bytesContext field_bytes() {
			return getRuleContext(Field_bytesContext.class,0);
		}
		public Field_startContext field_start() {
			return getRuleContext(Field_startContext.class,0);
		}
		public Field_datatypeContext field_datatype() {
			return getRuleContext(Field_datatypeContext.class,0);
		}
		public Field_typeContext field_type() {
			return getRuleContext(Field_typeContext.class,0);
		}
		public Field_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_param(this);
		}
	}

	public final Field_paramContext field_param() throws RecognitionException {
		Field_paramContext _localctx = new Field_paramContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_field_param);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				field_name();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				field_bytes();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				field_start();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				field_datatype();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				field_type();
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

	public static class Field_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DBDParser.NAME, 0); }
		public List<TerminalNode> STRING() { return getTokens(DBDParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DBDParser.STRING, i);
		}
		public Field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_name(this);
		}
	}

	public final Field_nameContext field_name() throws RecognitionException {
		Field_nameContext _localctx = new Field_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_field_name);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(T__2);
				setState(302);
				match(NAME);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(T__46);
				setState(304);
				match(STRING);
				setState(305);
				match(T__1);
				setState(306);
				match(STRING);
				setState(307);
				match(T__1);
				setState(308);
				match(STRING);
				setState(309);
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

	public static class Field_bytesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Field_bytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_bytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_bytes(this);
		}
	}

	public final Field_bytesContext field_bytes() throws RecognitionException {
		Field_bytesContext _localctx = new Field_bytesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_field_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__43);
			setState(313);
			match(STRING);
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

	public static class Field_startContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Field_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_start(this);
		}
	}

	public final Field_startContext field_start() throws RecognitionException {
		Field_startContext _localctx = new Field_startContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_field_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__47);
			setState(316);
			match(STRING);
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

	public static class Field_datatypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Field_datatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_datatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_datatype(this);
		}
	}

	public final Field_datatypeContext field_datatype() throws RecognitionException {
		Field_datatypeContext _localctx = new Field_datatypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_field_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__48);
			setState(319);
			match(STRING);
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

	public static class Field_typeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DBDParser.STRING, 0); }
		public Field_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_type(this);
		}
	}

	public final Field_typeContext field_type() throws RecognitionException {
		Field_typeContext _localctx = new Field_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_field_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__49);
			setState(322);
			match(STRING);
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
		enterRule(_localctx, 94, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__50);
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
		enterRule(_localctx, 96, RULE_bool_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u014b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\7\2h"+
		"\n\2\f\2\16\2k\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4w\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083\n\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00ad\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\5\24\u00ca\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00d8\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00e2\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3!\3!\7!\u00ff\n!\f!\16!\u0102\13!\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u010c"+
		"\n#\3$\3$\3$\3$\5$\u0112\n$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)"+
		"\3)\3*\3*\3*\3*\3*\5*\u0127\n*\3+\3+\3+\3+\3+\5+\u012e\n+\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\5,\u0139\n,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\5\3\2\22\37\3\2 \"\3\2"+
		"\66\67\2\u013c\2d\3\2\2\2\4n\3\2\2\2\6v\3\2\2\2\b\u0082\3\2\2\2\n\u0084"+
		"\3\2\2\2\f\u0087\3\2\2\2\16\u0091\3\2\2\2\20\u0093\3\2\2\2\22\u00ac\3"+
		"\2\2\2\24\u00ae\3\2\2\2\26\u00b1\3\2\2\2\30\u00b4\3\2\2\2\32\u00b6\3\2"+
		"\2\2\34\u00b9\3\2\2\2\36\u00bc\3\2\2\2 \u00bf\3\2\2\2\"\u00c3\3\2\2\2"+
		"$\u00c5\3\2\2\2&\u00c9\3\2\2\2(\u00cb\3\2\2\2*\u00cf\3\2\2\2,\u00d7\3"+
		"\2\2\2.\u00e1\3\2\2\2\60\u00e3\3\2\2\2\62\u00e6\3\2\2\2\64\u00e9\3\2\2"+
		"\2\66\u00ec\3\2\2\28\u00ef\3\2\2\2:\u00f2\3\2\2\2<\u00f6\3\2\2\2>\u00f9"+
		"\3\2\2\2@\u00fc\3\2\2\2B\u0103\3\2\2\2D\u010b\3\2\2\2F\u0111\3\2\2\2H"+
		"\u0113\3\2\2\2J\u0116\3\2\2\2L\u0119\3\2\2\2N\u011c\3\2\2\2P\u011e\3\2"+
		"\2\2R\u0126\3\2\2\2T\u012d\3\2\2\2V\u0138\3\2\2\2X\u013a\3\2\2\2Z\u013d"+
		"\3\2\2\2\\\u0140\3\2\2\2^\u0143\3\2\2\2`\u0146\3\2\2\2b\u0148\3\2\2\2"+
		"de\5\4\3\2ei\5&\24\2fh\5@!\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j"+
		"l\3\2\2\2ki\3\2\2\2lm\5`\61\2m\3\3\2\2\2no\7\3\2\2op\5\6\4\2p\5\3\2\2"+
		"\2qr\5\b\5\2rs\7\4\2\2st\5\6\4\2tw\3\2\2\2uw\5\b\5\2vq\3\2\2\2vu\3\2\2"+
		"\2w\7\3\2\2\2x\u0083\5\n\6\2y\u0083\5\f\7\2z\u0083\5\20\t\2{\u0083\5\24"+
		"\13\2|\u0083\5\26\f\2}\u0083\5\30\r\2~\u0083\5\32\16\2\177\u0083\5\34"+
		"\17\2\u0080\u0083\5\36\20\2\u0081\u0083\5 \21\2\u0082x\3\2\2\2\u0082y"+
		"\3\2\2\2\u0082z\3\2\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082"+
		"~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\t\3\2\2\2\u0084\u0085\7\5\2\2\u0085\u0086\78\2\2\u0086\13\3\2\2\2\u0087"+
		"\u0088\7\6\2\2\u0088\u0089\5\16\b\2\u0089\r\3\2\2\2\u008a\u008b\7\7\2"+
		"\2\u008b\u008c\5\"\22\2\u008c\u008d\7\4\2\2\u008d\u008e\5$\23\2\u008e"+
		"\u008f\7\b\2\2\u008f\u0092\3\2\2\2\u0090\u0092\5\"\22\2\u0091\u008a\3"+
		"\2\2\2\u0091\u0090\3\2\2\2\u0092\17\3\2\2\2\u0093\u0094\7\t\2\2\u0094"+
		"\u0095\5\22\n\2\u0095\21\3\2\2\2\u0096\u0097\7\7\2\2\u0097\u0098\78\2"+
		"\2\u0098\u0099\7\4\2\2\u0099\u009a\79\2\2\u009a\u009b\7\4\2\2\u009b\u009c"+
		"\79\2\2\u009c\u009d\7\4\2\2\u009d\u009e\79\2\2\u009e\u00ad\7\b\2\2\u009f"+
		"\u00a0\7\7\2\2\u00a0\u00a1\78\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\79\2"+
		"\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\79\2\2\u00a5\u00ad\7\b\2\2\u00a6\u00a7"+
		"\7\7\2\2\u00a7\u00a8\78\2\2\u00a8\u00a9\7\4\2\2\u00a9\u00aa\79\2\2\u00aa"+
		"\u00ad\7\b\2\2\u00ab\u00ad\78\2\2\u00ac\u0096\3\2\2\2\u00ac\u009f\3\2"+
		"\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00af"+
		"\7\n\2\2\u00af\u00b0\7;\2\2\u00b0\25\3\2\2\2\u00b1\u00b2\7\13\2\2\u00b2"+
		"\u00b3\5b\62\2\u00b3\27\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5\31\3\2\2\2\u00b6"+
		"\u00b7\7\r\2\2\u00b7\u00b8\78\2\2\u00b8\33\3\2\2\2\u00b9\u00ba\7\16\2"+
		"\2\u00ba\u00bb\5b\62\2\u00bb\35\3\2\2\2\u00bc\u00bd\7\17\2\2\u00bd\u00be"+
		"\78\2\2\u00be\37\3\2\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00c1\79\2\2\u00c1"+
		"\u00c2\7\21\2\2\u00c2!\3\2\2\2\u00c3\u00c4\t\2\2\2\u00c4#\3\2\2\2\u00c5"+
		"\u00c6\t\3\2\2\u00c6%\3\2\2\2\u00c7\u00ca\5*\26\2\u00c8\u00ca\5(\25\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\'\3\2\2\2\u00cb\u00cc\7"+
		"9\2\2\u00cc\u00cd\7#\2\2\u00cd\u00ce\5,\27\2\u00ce)\3\2\2\2\u00cf\u00d0"+
		"\7#\2\2\u00d0\u00d1\5,\27\2\u00d1+\3\2\2\2\u00d2\u00d3\5.\30\2\u00d3\u00d4"+
		"\7\4\2\2\u00d4\u00d5\5,\27\2\u00d5\u00d8\3\2\2\2\u00d6\u00d8\5.\30\2\u00d7"+
		"\u00d2\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8-\3\2\2\2\u00d9\u00e2\5\60\31"+
		"\2\u00da\u00e2\5\62\32\2\u00db\u00e2\5\64\33\2\u00dc\u00e2\5\66\34\2\u00dd"+
		"\u00e2\58\35\2\u00de\u00e2\5:\36\2\u00df\u00e2\5<\37\2\u00e0\u00e2\5>"+
		" \2\u00e1\u00d9\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1"+
		"\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e0\3\2\2\2\u00e2/\3\2\2\2\u00e3\u00e4\7$\2\2\u00e4\u00e5"+
		"\78\2\2\u00e5\61\3\2\2\2\u00e6\u00e7\7%\2\2\u00e7\u00e8\79\2\2\u00e8\63"+
		"\3\2\2\2\u00e9\u00ea\7&\2\2\u00ea\u00eb\79\2\2\u00eb\65\3\2\2\2\u00ec"+
		"\u00ed\7\'\2\2\u00ed\u00ee\79\2\2\u00ee\67\3\2\2\2\u00ef\u00f0\7(\2\2"+
		"\u00f0\u00f1\79\2\2\u00f19\3\2\2\2\u00f2\u00f3\7)\2\2\u00f3\u00f4\79\2"+
		"\2\u00f4\u00f5\7\b\2\2\u00f5;\3\2\2\2\u00f6\u00f7\7*\2\2\u00f7\u00f8\7"+
		";\2\2\u00f8=\3\2\2\2\u00f9\u00fa\7+\2\2\u00fa\u00fb\79\2\2\u00fb?\3\2"+
		"\2\2\u00fc\u0100\5B\"\2\u00fd\u00ff\5P)\2\u00fe\u00fd\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101A\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\7,\2\2\u0104\u0105\5D#\2\u0105C\3\2\2\2\u0106"+
		"\u0107\5F$\2\u0107\u0108\7\4\2\2\u0108\u0109\5D#\2\u0109\u010c\3\2\2\2"+
		"\u010a\u010c\5F$\2\u010b\u0106\3\2\2\2\u010b\u010a\3\2\2\2\u010cE\3\2"+
		"\2\2\u010d\u0112\5H%\2\u010e\u0112\5J&\2\u010f\u0112\5L\'\2\u0110\u0112"+
		"\5N(\2\u0111\u010d\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112G\3\2\2\2\u0113\u0114\7\5\2\2\u0114\u0115\78\2\2\u0115"+
		"I\3\2\2\2\u0116\u0117\7-\2\2\u0117\u0118\79\2\2\u0118K\3\2\2\2\u0119\u011a"+
		"\7.\2\2\u011a\u011b\79\2\2\u011bM\3\2\2\2\u011c\u011d\7/\2\2\u011dO\3"+
		"\2\2\2\u011e\u011f\7\60\2\2\u011f\u0120\5R*\2\u0120Q\3\2\2\2\u0121\u0122"+
		"\5T+\2\u0122\u0123\7\4\2\2\u0123\u0124\5R*\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0127\5T+\2\u0126\u0121\3\2\2\2\u0126\u0125\3\2\2\2\u0127S\3\2\2\2\u0128"+
		"\u012e\5V,\2\u0129\u012e\5X-\2\u012a\u012e\5Z.\2\u012b\u012e\5\\/\2\u012c"+
		"\u012e\5^\60\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012eU\3\2\2\2\u012f\u0130"+
		"\7\5\2\2\u0130\u0139\78\2\2\u0131\u0132\7\61\2\2\u0132\u0133\79\2\2\u0133"+
		"\u0134\7\4\2\2\u0134\u0135\79\2\2\u0135\u0136\7\4\2\2\u0136\u0137\79\2"+
		"\2\u0137\u0139\7\b\2\2\u0138\u012f\3\2\2\2\u0138\u0131\3\2\2\2\u0139W"+
		"\3\2\2\2\u013a\u013b\7.\2\2\u013b\u013c\79\2\2\u013cY\3\2\2\2\u013d\u013e"+
		"\7\62\2\2\u013e\u013f\79\2\2\u013f[\3\2\2\2\u0140\u0141\7\63\2\2\u0141"+
		"\u0142\79\2\2\u0142]\3\2\2\2\u0143\u0144\7\64\2\2\u0144\u0145\79\2\2\u0145"+
		"_\3\2\2\2\u0146\u0147\7\65\2\2\u0147a\3\2\2\2\u0148\u0149\t\4\2\2\u0149"+
		"c\3\2\2\2\20iv\u0082\u0091\u00ac\u00c9\u00d7\u00e1\u0100\u010b\u0111\u0126"+
		"\u012d\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}