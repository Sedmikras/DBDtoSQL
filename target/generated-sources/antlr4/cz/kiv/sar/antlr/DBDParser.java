// Generated from cz\kiv\sar\antlr\DBDParser.g4 by ANTLR 4.9.3
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
		RULE_segment_external_name = 36, RULE_segment_parent = 37, RULE_segment_parent_value = 38, 
		RULE_segment_parent_value_1 = 39, RULE_segment_parent_type_1 = 40, RULE_segment_parent_value_2 = 41, 
		RULE_segment_parent_type_2 = 42, RULE_segment_source = 43, RULE_segment_bytes = 44, 
		RULE_segment_bytes_value = 45, RULE_segment_freq = 46, RULE_segment_ptr = 47, 
		RULE_segment_ptr_value = 48, RULE_segment_ptr_type_1 = 49, RULE_segment_ptr_type_2 = 50, 
		RULE_segment_rules = 51, RULE_segment_rules_value = 52, RULE_segment_rules_type_1 = 53, 
		RULE_segment_rules_type_2 = 54, RULE_segment_rules_type_3 = 55, RULE_segment_rules_type_4 = 56, 
		RULE_segment_exit = 57, RULE_segment_comprtn = 58, RULE_segment_encoding = 59, 
		RULE_segment_remarks = 60, RULE_field = 61, RULE_field_params = 62, RULE_field_param = 63, 
		RULE_field_name = 64, RULE_field_name_value = 65, RULE_field_name_value_type = 66, 
		RULE_field_external_name = 67, RULE_field_bytes = 68, RULE_field_max_bytes = 69, 
		RULE_field_start = 70, RULE_field_start_after = 71, RULE_field_rel_start = 72, 
		RULE_field_datatype = 73, RULE_field_datatype_value = 74, RULE_field_type = 75, 
		RULE_field_type_value = 76, RULE_field_case_name = 77, RULE_field_dependson = 78, 
		RULE_field_min_occurs = 79, RULE_field_max_occurs = 80, RULE_field_parent = 81, 
		RULE_field_redefines = 82, RULE_field_remarks = 83, RULE_lchild = 84, 
		RULE_lchild_params = 85, RULE_lchild_param = 86, RULE_lchild_name = 87, 
		RULE_lchild_name_params = 88, RULE_lchild_ptr = 89, RULE_lchild_ptr_type = 90, 
		RULE_lchild_pair = 91, RULE_lchild_rules = 92, RULE_lchild_rules_type = 93, 
		RULE_lchild_remarks = 94, RULE_xdfld = 95, RULE_xdfld_params = 96, RULE_xdfld_param = 97, 
		RULE_xdfld_name = 98, RULE_xdfld_segment = 99, RULE_xdfld_const = 100, 
		RULE_xdfld_srch = 101, RULE_xdfld_subseq = 102, RULE_xdfld_ddata = 103, 
		RULE_xdfld_nullval = 104, RULE_xdfld_extrtn = 105, RULE_xdfld_remarks = 106, 
		RULE_xdfld_externalname = 107, RULE_end = 108, RULE_bool_string = 109;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "dbd", "dbd_params", "dbd_param", "dbd_name", "dbd_access", 
			"dbd_access_value", "dbd_rmname", "dbd_rmname_value", "dbd_dbver", "dbd_passwd", 
			"dbd_exit", "dbd_version", "dbd_datxexit", "dbd_encoding", "dbd_remarks", 
			"access_method", "operating_method", "dataset", "dataset_with_label", 
			"dataset_without_label", "dataset_params", "dataset_param", "dataset_dd1", 
			"dataset_size", "dataset_block", "dataset_device", "dataset_scan", "dataset_frspc", 
			"dataset_searcha", "dataset_remarks", "segment", "segment_definition", 
			"segment_params", "segment_param", "segment_name", "segment_external_name", 
			"segment_parent", "segment_parent_value", "segment_parent_value_1", "segment_parent_type_1", 
			"segment_parent_value_2", "segment_parent_type_2", "segment_source", 
			"segment_bytes", "segment_bytes_value", "segment_freq", "segment_ptr", 
			"segment_ptr_value", "segment_ptr_type_1", "segment_ptr_type_2", "segment_rules", 
			"segment_rules_value", "segment_rules_type_1", "segment_rules_type_2", 
			"segment_rules_type_3", "segment_rules_type_4", "segment_exit", "segment_comprtn", 
			"segment_encoding", "segment_remarks", "field", "field_params", "field_param", 
			"field_name", "field_name_value", "field_name_value_type", "field_external_name", 
			"field_bytes", "field_max_bytes", "field_start", "field_start_after", 
			"field_rel_start", "field_datatype", "field_datatype_value", "field_type", 
			"field_type_value", "field_case_name", "field_dependson", "field_min_occurs", 
			"field_max_occurs", "field_parent", "field_redefines", "field_remarks", 
			"lchild", "lchild_params", "lchild_param", "lchild_name", "lchild_name_params", 
			"lchild_ptr", "lchild_ptr_type", "lchild_pair", "lchild_rules", "lchild_rules_type", 
			"lchild_remarks", "xdfld", "xdfld_params", "xdfld_param", "xdfld_name", 
			"xdfld_segment", "xdfld_const", "xdfld_srch", "xdfld_subseq", "xdfld_ddata", 
			"xdfld_nullval", "xdfld_extrtn", "xdfld_remarks", "xdfld_externalname", 
			"end", "bool_string"
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

	@Override
	public String getGrammarFileName() { return "DBDParser.g4"; }

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
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			dbd();
			setState(221);
			dataset();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEGM) {
				{
				{
				setState(222);
				segment();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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
		public TerminalNode DBD() { return getToken(DBDParser.DBD, 0); }
		public Dbd_paramsContext dbd_params() {
			return getRuleContext(Dbd_paramsContext.class,0);
		}
		public DbdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbdContext dbd() throws RecognitionException {
		DbdContext _localctx = new DbdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dbd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(DBD);
			setState(231);
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
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public Dbd_paramsContext dbd_params() {
			return getRuleContext(Dbd_paramsContext.class,0);
		}
		public Dbd_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_paramsContext dbd_params() throws RecognitionException {
		Dbd_paramsContext _localctx = new Dbd_paramsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dbd_params);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				dbd_param();
				setState(234);
				match(COM);
				setState(235);
				dbd_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
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
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_paramContext dbd_param() throws RecognitionException {
		Dbd_paramContext _localctx = new Dbd_paramContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dbd_param);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				dbd_name();
				}
				break;
			case ACCESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				dbd_access();
				}
				break;
			case RMNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				dbd_rmname();
				}
				break;
			case DBVER:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				dbd_dbver();
				}
				break;
			case PASSWD:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				dbd_passwd();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				dbd_exit();
				}
				break;
			case VERSION:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				dbd_version();
				}
				break;
			case DATXEXIT:
				enterOuterAlt(_localctx, 8);
				{
				setState(247);
				dbd_datxexit();
				}
				break;
			case ENCODING:
				enterOuterAlt(_localctx, 9);
				{
				setState(248);
				dbd_encoding();
				}
				break;
			case REMARKS:
				enterOuterAlt(_localctx, 10);
				{
				setState(249);
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
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Dbd_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_nameContext dbd_name() throws RecognitionException {
		Dbd_nameContext _localctx = new Dbd_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dbd_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(NAME);
			setState(253);
			match(EQUAL);
			setState(254);
			match(String);
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
		public TerminalNode ACCESS() { return getToken(DBDParser.ACCESS, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Dbd_access_valueContext dbd_access_value() {
			return getRuleContext(Dbd_access_valueContext.class,0);
		}
		public Dbd_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_accessContext dbd_access() throws RecognitionException {
		Dbd_accessContext _localctx = new Dbd_accessContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dbd_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ACCESS);
			setState(257);
			match(EQUAL);
			setState(258);
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
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public Access_methodContext access_method() {
			return getRuleContext(Access_methodContext.class,0);
		}
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public Operating_methodContext operating_method() {
			return getRuleContext(Operating_methodContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Dbd_access_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_access_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_access_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_access_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_access_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_access_valueContext dbd_access_value() throws RecognitionException {
		Dbd_access_valueContext _localctx = new Dbd_access_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dbd_access_value);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(LPAREN);
				setState(261);
				access_method();
				setState(262);
				match(COM);
				setState(263);
				operating_method();
				setState(264);
				match(RPAREN);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
		public TerminalNode RMNAME() { return getToken(DBDParser.RMNAME, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Dbd_rmname_valueContext dbd_rmname_value() {
			return getRuleContext(Dbd_rmname_valueContext.class,0);
		}
		public Dbd_rmnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_rmname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_rmname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_rmname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_rmname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_rmnameContext dbd_rmname() throws RecognitionException {
		Dbd_rmnameContext _localctx = new Dbd_rmnameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dbd_rmname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(RMNAME);
			setState(270);
			match(EQUAL);
			setState(271);
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
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public List<TerminalNode> COM() { return getTokens(DBDParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(DBDParser.COM, i);
		}
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Dbd_rmname_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_rmname_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_rmname_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_rmname_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_rmname_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_rmname_valueContext dbd_rmname_value() throws RecognitionException {
		Dbd_rmname_valueContext _localctx = new Dbd_rmname_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dbd_rmname_value);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(LPAREN);
				setState(274);
				match(String);
				setState(275);
				match(COM);
				setState(276);
				match(String);
				setState(277);
				match(COM);
				setState(278);
				match(String);
				setState(279);
				match(COM);
				setState(280);
				match(String);
				setState(281);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(LPAREN);
				setState(283);
				match(String);
				setState(284);
				match(COM);
				setState(285);
				match(String);
				setState(286);
				match(COM);
				setState(287);
				match(String);
				setState(288);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(LPAREN);
				setState(290);
				match(String);
				setState(291);
				match(COM);
				setState(292);
				match(String);
				setState(293);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(String);
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
		public TerminalNode DBVER() { return getToken(DBDParser.DBVER, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode Number() { return getToken(DBDParser.Number, 0); }
		public Dbd_dbverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_dbver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_dbver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_dbver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_dbver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_dbverContext dbd_dbver() throws RecognitionException {
		Dbd_dbverContext _localctx = new Dbd_dbverContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dbd_dbver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(DBVER);
			setState(298);
			match(EQUAL);
			setState(299);
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
		public TerminalNode PASSWD() { return getToken(DBDParser.PASSWD, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Bool_stringContext bool_string() {
			return getRuleContext(Bool_stringContext.class,0);
		}
		public Dbd_passwdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_passwd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_passwd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_passwd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_passwd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_passwdContext dbd_passwd() throws RecognitionException {
		Dbd_passwdContext _localctx = new Dbd_passwdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dbd_passwd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(PASSWD);
			setState(302);
			match(EQUAL);
			setState(303);
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
		public TerminalNode EXIT() { return getToken(DBDParser.EXIT, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public TerminalNode NONE() { return getToken(DBDParser.NONE, 0); }
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Dbd_exitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_exit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_exit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_exit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_exitContext dbd_exit() throws RecognitionException {
		Dbd_exitContext _localctx = new Dbd_exitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dbd_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(EXIT);
			setState(306);
			match(EQUAL);
			setState(307);
			match(LPAREN);
			setState(308);
			match(NONE);
			setState(309);
			match(RPAREN);
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
		public TerminalNode VERSION() { return getToken(DBDParser.VERSION, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Dbd_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_version(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_version(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_versionContext dbd_version() throws RecognitionException {
		Dbd_versionContext _localctx = new Dbd_versionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dbd_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(VERSION);
			setState(312);
			match(EQUAL);
			setState(313);
			match(String);
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
		public TerminalNode DATXEXIT() { return getToken(DBDParser.DATXEXIT, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Bool_stringContext bool_string() {
			return getRuleContext(Bool_stringContext.class,0);
		}
		public Dbd_datxexitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_datxexit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_datxexit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_datxexit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_datxexit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_datxexitContext dbd_datxexit() throws RecognitionException {
		Dbd_datxexitContext _localctx = new Dbd_datxexitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dbd_datxexit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(DATXEXIT);
			setState(316);
			match(EQUAL);
			setState(317);
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
		public TerminalNode ENCODING() { return getToken(DBDParser.ENCODING, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Dbd_encodingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_encoding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_encoding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_encoding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_encoding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_encodingContext dbd_encoding() throws RecognitionException {
		Dbd_encodingContext _localctx = new Dbd_encodingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dbd_encoding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ENCODING);
			setState(320);
			match(EQUAL);
			setState(321);
			match(String);
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
		public TerminalNode REMARKS() { return getToken(DBDParser.REMARKS, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Dbd_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbd_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDbd_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDbd_remarks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDbd_remarks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dbd_remarksContext dbd_remarks() throws RecognitionException {
		Dbd_remarksContext _localctx = new Dbd_remarksContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dbd_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(REMARKS);
			setState(324);
			match(EQUAL);
			setState(325);
			match(String);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Access_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterAccess_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitAccess_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitAccess_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_methodContext access_method() throws RecognitionException {
		Access_methodContext _localctx = new Access_methodContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_access_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(String);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Operating_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operating_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterOperating_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitOperating_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitOperating_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operating_methodContext operating_method() throws RecognitionException {
		Operating_methodContext _localctx = new Operating_methodContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operating_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(String);
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
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetContext dataset() throws RecognitionException {
		DatasetContext _localctx = new DatasetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dataset);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATASET:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				dataset_without_label();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public TerminalNode DATASET() { return getToken(DBDParser.DATASET, 0); }
		public Dataset_paramsContext dataset_params() {
			return getRuleContext(Dataset_paramsContext.class,0);
		}
		public Dataset_with_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_with_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_with_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_with_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_with_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_with_labelContext dataset_with_label() throws RecognitionException {
		Dataset_with_labelContext _localctx = new Dataset_with_labelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dataset_with_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(String);
			setState(336);
			match(DATASET);
			setState(337);
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
		public TerminalNode DATASET() { return getToken(DBDParser.DATASET, 0); }
		public Dataset_paramsContext dataset_params() {
			return getRuleContext(Dataset_paramsContext.class,0);
		}
		public Dataset_without_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_without_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_without_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_without_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_without_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_without_labelContext dataset_without_label() throws RecognitionException {
		Dataset_without_labelContext _localctx = new Dataset_without_labelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dataset_without_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(DATASET);
			setState(340);
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
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public Dataset_paramsContext dataset_params() {
			return getRuleContext(Dataset_paramsContext.class,0);
		}
		public Dataset_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_paramsContext dataset_params() throws RecognitionException {
		Dataset_paramsContext _localctx = new Dataset_paramsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dataset_params);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				dataset_param();
				setState(343);
				match(COM);
				setState(344);
				dataset_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
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
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_paramContext dataset_param() throws RecognitionException {
		Dataset_paramContext _localctx = new Dataset_paramContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dataset_param);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DD1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				dataset_dd1();
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				dataset_size();
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				dataset_block();
				}
				break;
			case DEVICE:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				dataset_device();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				dataset_scan();
				}
				break;
			case FRSPC:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				dataset_frspc();
				}
				break;
			case SEARCHA:
				enterOuterAlt(_localctx, 7);
				{
				setState(355);
				dataset_searcha();
				}
				break;
			case REMARKS:
				enterOuterAlt(_localctx, 8);
				{
				setState(356);
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
		public TerminalNode DD1() { return getToken(DBDParser.DD1, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Dataset_dd1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_dd1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_dd1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_dd1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_dd1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_dd1Context dataset_dd1() throws RecognitionException {
		Dataset_dd1Context _localctx = new Dataset_dd1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_dataset_dd1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(DD1);
			setState(360);
			match(EQUAL);
			setState(361);
			match(String);
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
		public TerminalNode SIZE() { return getToken(DBDParser.SIZE, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Dataset_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_size(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_size(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_sizeContext dataset_size() throws RecognitionException {
		Dataset_sizeContext _localctx = new Dataset_sizeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dataset_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(SIZE);
			setState(364);
			match(EQUAL);
			setState(365);
			match(String);
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
		public TerminalNode BLOCK() { return getToken(DBDParser.BLOCK, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Dataset_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_blockContext dataset_block() throws RecognitionException {
		Dataset_blockContext _localctx = new Dataset_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dataset_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(BLOCK);
			setState(368);
			match(EQUAL);
			setState(369);
			match(String);
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
		public TerminalNode DEVICE() { return getToken(DBDParser.DEVICE, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Dataset_deviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_device; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_device(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_device(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_device(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_deviceContext dataset_device() throws RecognitionException {
		Dataset_deviceContext _localctx = new Dataset_deviceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dataset_device);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(DEVICE);
			setState(372);
			match(EQUAL);
			setState(373);
			match(String);
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
		public TerminalNode SCAN() { return getToken(DBDParser.SCAN, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Dataset_scanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_scan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_scan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_scan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_scanContext dataset_scan() throws RecognitionException {
		Dataset_scanContext _localctx = new Dataset_scanContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dataset_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(SCAN);
			setState(376);
			match(EQUAL);
			setState(377);
			match(String);
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
		public TerminalNode FRSPC() { return getToken(DBDParser.FRSPC, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Dataset_frspcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_frspc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_frspc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_frspc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_frspc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_frspcContext dataset_frspc() throws RecognitionException {
		Dataset_frspcContext _localctx = new Dataset_frspcContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dataset_frspc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(FRSPC);
			setState(380);
			match(EQUAL);
			setState(381);
			match(LPAREN);
			setState(382);
			match(String);
			setState(383);
			match(RPAREN);
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
		public TerminalNode SEARCHA() { return getToken(DBDParser.SEARCHA, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode Number() { return getToken(DBDParser.Number, 0); }
		public Dataset_searchaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_searcha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_searcha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_searcha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_searcha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_searchaContext dataset_searcha() throws RecognitionException {
		Dataset_searchaContext _localctx = new Dataset_searchaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dataset_searcha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(SEARCHA);
			setState(386);
			match(EQUAL);
			setState(387);
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
		public TerminalNode REMARKS() { return getToken(DBDParser.REMARKS, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Dataset_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterDataset_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitDataset_remarks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitDataset_remarks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_remarksContext dataset_remarks() throws RecognitionException {
		Dataset_remarksContext _localctx = new Dataset_remarksContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dataset_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(REMARKS);
			setState(390);
			match(EQUAL);
			setState(391);
			match(String);
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
		public List<LchildContext> lchild() {
			return getRuleContexts(LchildContext.class);
		}
		public LchildContext lchild(int i) {
			return getRuleContext(LchildContext.class,i);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			segment_definition();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FIELD || _la==LCHILD) {
				{
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FIELD:
					{
					setState(394);
					field();
					}
					break;
				case LCHILD:
					{
					setState(395);
					lchild();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(400);
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
		public TerminalNode SEGM() { return getToken(DBDParser.SEGM, 0); }
		public Segment_paramsContext segment_params() {
			return getRuleContext(Segment_paramsContext.class,0);
		}
		public Segment_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_definitionContext segment_definition() throws RecognitionException {
		Segment_definitionContext _localctx = new Segment_definitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_segment_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(SEGM);
			setState(402);
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
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public Segment_paramsContext segment_params() {
			return getRuleContext(Segment_paramsContext.class,0);
		}
		public Segment_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_paramsContext segment_params() throws RecognitionException {
		Segment_paramsContext _localctx = new Segment_paramsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_segment_params);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				segment_param();
				setState(405);
				match(COM);
				setState(406);
				segment_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
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
		public Segment_external_nameContext segment_external_name() {
			return getRuleContext(Segment_external_nameContext.class,0);
		}
		public Segment_parentContext segment_parent() {
			return getRuleContext(Segment_parentContext.class,0);
		}
		public Segment_sourceContext segment_source() {
			return getRuleContext(Segment_sourceContext.class,0);
		}
		public Segment_bytesContext segment_bytes() {
			return getRuleContext(Segment_bytesContext.class,0);
		}
		public Segment_freqContext segment_freq() {
			return getRuleContext(Segment_freqContext.class,0);
		}
		public Segment_ptrContext segment_ptr() {
			return getRuleContext(Segment_ptrContext.class,0);
		}
		public Segment_rulesContext segment_rules() {
			return getRuleContext(Segment_rulesContext.class,0);
		}
		public Segment_exitContext segment_exit() {
			return getRuleContext(Segment_exitContext.class,0);
		}
		public Segment_comprtnContext segment_comprtn() {
			return getRuleContext(Segment_comprtnContext.class,0);
		}
		public Segment_encodingContext segment_encoding() {
			return getRuleContext(Segment_encodingContext.class,0);
		}
		public Segment_remarksContext segment_remarks() {
			return getRuleContext(Segment_remarksContext.class,0);
		}
		public Segment_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_paramContext segment_param() throws RecognitionException {
		Segment_paramContext _localctx = new Segment_paramContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_segment_param);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				segment_name();
				}
				break;
			case EXTERNAL_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				segment_external_name();
				}
				break;
			case PARENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				segment_parent();
				}
				break;
			case SOURCE:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				segment_source();
				}
				break;
			case BYTES:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				segment_bytes();
				}
				break;
			case FREQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				segment_freq();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 7);
				{
				setState(417);
				segment_ptr();
				}
				break;
			case RULES:
				enterOuterAlt(_localctx, 8);
				{
				setState(418);
				segment_rules();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 9);
				{
				setState(419);
				segment_exit();
				}
				break;
			case COMPRTN:
				enterOuterAlt(_localctx, 10);
				{
				setState(420);
				segment_comprtn();
				}
				break;
			case ENCODING:
				enterOuterAlt(_localctx, 11);
				{
				setState(421);
				segment_encoding();
				}
				break;
			case REMARKS:
				enterOuterAlt(_localctx, 12);
				{
				setState(422);
				segment_remarks();
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
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_nameContext segment_name() throws RecognitionException {
		Segment_nameContext _localctx = new Segment_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_segment_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(NAME);
			setState(426);
			match(EQUAL);
			setState(427);
			match(String);
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

	public static class Segment_external_nameContext extends ParserRuleContext {
		public TerminalNode EXTERNAL_NAME() { return getToken(DBDParser.EXTERNAL_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_external_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_external_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_external_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_external_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_external_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_external_nameContext segment_external_name() throws RecognitionException {
		Segment_external_nameContext _localctx = new Segment_external_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_segment_external_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(EXTERNAL_NAME);
			setState(430);
			match(EQUAL);
			setState(431);
			match(String);
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
		public TerminalNode PARENT() { return getToken(DBDParser.PARENT, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Segment_parent_valueContext segment_parent_value() {
			return getRuleContext(Segment_parent_valueContext.class,0);
		}
		public Segment_parentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_parent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_parent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_parentContext segment_parent() throws RecognitionException {
		Segment_parentContext _localctx = new Segment_parentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_segment_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(PARENT);
			setState(434);
			match(EQUAL);
			setState(435);
			segment_parent_value();
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

	public static class Segment_parent_valueContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public Segment_parent_value_1Context segment_parent_value_1() {
			return getRuleContext(Segment_parent_value_1Context.class,0);
		}
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public Segment_parent_value_2Context segment_parent_value_2() {
			return getRuleContext(Segment_parent_value_2Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_parent_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_parent_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_parent_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_parent_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_parent_valueContext segment_parent_value() throws RecognitionException {
		Segment_parent_valueContext _localctx = new Segment_parent_valueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_segment_parent_value);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(LPAREN);
				setState(438);
				segment_parent_value_1();
				setState(439);
				match(COM);
				setState(440);
				segment_parent_value_2();
				setState(441);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(LPAREN);
				setState(444);
				segment_parent_value_1();
				setState(445);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(String);
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

	public static class Segment_parent_value_1Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public Segment_parent_type_1Context segment_parent_type_1() {
			return getRuleContext(Segment_parent_type_1Context.class,0);
		}
		public Segment_parent_value_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent_value_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_parent_value_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_parent_value_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_parent_value_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_parent_value_1Context segment_parent_value_1() throws RecognitionException {
		Segment_parent_value_1Context _localctx = new Segment_parent_value_1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_segment_parent_value_1);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(String);
				setState(451);
				match(COM);
				setState(452);
				segment_parent_type_1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(String);
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

	public static class Segment_parent_type_1Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_parent_type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_parent_type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_parent_type_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_parent_type_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_parent_type_1Context segment_parent_type_1() throws RecognitionException {
		Segment_parent_type_1Context _localctx = new Segment_parent_type_1Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_segment_parent_type_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(String);
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

	public static class Segment_parent_value_2Context extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public List<TerminalNode> COM() { return getTokens(DBDParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(DBDParser.COM, i);
		}
		public Segment_parent_type_2Context segment_parent_type_2() {
			return getRuleContext(Segment_parent_type_2Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Segment_parent_value_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent_value_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_parent_value_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_parent_value_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_parent_value_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_parent_value_2Context segment_parent_value_2() throws RecognitionException {
		Segment_parent_value_2Context _localctx = new Segment_parent_value_2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_segment_parent_value_2);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(LPAREN);
				setState(459);
				match(String);
				setState(460);
				match(COM);
				setState(461);
				segment_parent_type_2();
				setState(462);
				match(COM);
				setState(463);
				match(String);
				setState(464);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(LPAREN);
				setState(467);
				match(String);
				setState(468);
				match(COM);
				setState(469);
				segment_parent_type_2();
				setState(470);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				match(LPAREN);
				setState(473);
				match(String);
				setState(474);
				match(RPAREN);
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

	public static class Segment_parent_type_2Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_parent_type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent_type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_parent_type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_parent_type_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_parent_type_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_parent_type_2Context segment_parent_type_2() throws RecognitionException {
		Segment_parent_type_2Context _localctx = new Segment_parent_type_2Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_segment_parent_type_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(String);
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

	public static class Segment_sourceContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(DBDParser.SOURCE, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public List<TerminalNode> COM() { return getTokens(DBDParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(DBDParser.COM, i);
		}
		public TerminalNode DATA() { return getToken(DBDParser.DATA, 0); }
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Segment_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_sourceContext segment_source() throws RecognitionException {
		Segment_sourceContext _localctx = new Segment_sourceContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_segment_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(SOURCE);
			setState(480);
			match(EQUAL);
			setState(481);
			match(LPAREN);
			setState(482);
			match(String);
			setState(483);
			match(COM);
			setState(484);
			match(DATA);
			setState(485);
			match(COM);
			setState(486);
			match(String);
			setState(487);
			match(RPAREN);
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
		public TerminalNode BYTES() { return getToken(DBDParser.BYTES, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Segment_bytes_valueContext segment_bytes_value() {
			return getRuleContext(Segment_bytes_valueContext.class,0);
		}
		public Segment_bytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_bytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_bytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_bytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_bytesContext segment_bytes() throws RecognitionException {
		Segment_bytesContext _localctx = new Segment_bytesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_segment_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(BYTES);
			setState(490);
			match(EQUAL);
			setState(491);
			segment_bytes_value();
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

	public static class Segment_bytes_valueContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Segment_bytes_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_bytes_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_bytes_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_bytes_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_bytes_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_bytes_valueContext segment_bytes_value() throws RecognitionException {
		Segment_bytes_valueContext _localctx = new Segment_bytes_valueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_segment_bytes_value);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(LPAREN);
				setState(494);
				match(String);
				setState(495);
				match(COM);
				setState(496);
				match(String);
				setState(497);
				match(RPAREN);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(String);
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

	public static class Segment_freqContext extends ParserRuleContext {
		public TerminalNode FREQ() { return getToken(DBDParser.FREQ, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_freqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_freq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_freq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_freq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_freq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_freqContext segment_freq() throws RecognitionException {
		Segment_freqContext _localctx = new Segment_freqContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_segment_freq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(FREQ);
			setState(502);
			match(EQUAL);
			setState(503);
			match(String);
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
		public TerminalNode POINTER() { return getToken(DBDParser.POINTER, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public Segment_ptr_valueContext segment_ptr_value() {
			return getRuleContext(Segment_ptr_valueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Segment_ptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_ptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_ptr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_ptr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_ptrContext segment_ptr() throws RecognitionException {
		Segment_ptrContext _localctx = new Segment_ptrContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_segment_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(POINTER);
			setState(506);
			match(EQUAL);
			setState(507);
			match(LPAREN);
			setState(508);
			segment_ptr_value();
			setState(509);
			match(RPAREN);
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

	public static class Segment_ptr_valueContext extends ParserRuleContext {
		public Segment_ptr_type_1Context segment_ptr_type_1() {
			return getRuleContext(Segment_ptr_type_1Context.class,0);
		}
		public List<TerminalNode> COM() { return getTokens(DBDParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(DBDParser.COM, i);
		}
		public Segment_ptr_type_2Context segment_ptr_type_2() {
			return getRuleContext(Segment_ptr_type_2Context.class,0);
		}
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public Segment_ptr_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_ptr_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_ptr_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_ptr_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_ptr_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_ptr_valueContext segment_ptr_value() throws RecognitionException {
		Segment_ptr_valueContext _localctx = new Segment_ptr_valueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_segment_ptr_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			segment_ptr_type_1();
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(512);
				match(COM);
				setState(513);
				segment_ptr_type_2();
				}
				break;
			}
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(516);
				match(COM);
				setState(517);
				match(String);
				}
				break;
			}
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(520);
				match(COM);
				setState(521);
				match(String);
				}
				break;
			}
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COM) {
				{
				setState(524);
				match(COM);
				setState(525);
				match(String);
				}
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

	public static class Segment_ptr_type_1Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_ptr_type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_ptr_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_ptr_type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_ptr_type_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_ptr_type_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_ptr_type_1Context segment_ptr_type_1() throws RecognitionException {
		Segment_ptr_type_1Context _localctx = new Segment_ptr_type_1Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_segment_ptr_type_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(String);
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

	public static class Segment_ptr_type_2Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_ptr_type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_ptr_type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_ptr_type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_ptr_type_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_ptr_type_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_ptr_type_2Context segment_ptr_type_2() throws RecognitionException {
		Segment_ptr_type_2Context _localctx = new Segment_ptr_type_2Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_segment_ptr_type_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(String);
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

	public static class Segment_rulesContext extends ParserRuleContext {
		public TerminalNode RULES() { return getToken(DBDParser.RULES, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public Segment_rules_valueContext segment_rules_value() {
			return getRuleContext(Segment_rules_valueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Segment_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_rules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_rules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_rulesContext segment_rules() throws RecognitionException {
		Segment_rulesContext _localctx = new Segment_rulesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_segment_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(RULES);
			setState(533);
			match(EQUAL);
			setState(534);
			match(LPAREN);
			setState(535);
			segment_rules_value();
			setState(536);
			match(RPAREN);
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

	public static class Segment_rules_valueContext extends ParserRuleContext {
		public Segment_rules_type_1Context segment_rules_type_1() {
			return getRuleContext(Segment_rules_type_1Context.class,0);
		}
		public Segment_rules_type_2Context segment_rules_type_2() {
			return getRuleContext(Segment_rules_type_2Context.class,0);
		}
		public Segment_rules_type_3Context segment_rules_type_3() {
			return getRuleContext(Segment_rules_type_3Context.class,0);
		}
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public Segment_rules_type_4Context segment_rules_type_4() {
			return getRuleContext(Segment_rules_type_4Context.class,0);
		}
		public Segment_rules_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_rules_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_rules_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_rules_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_rules_valueContext segment_rules_value() throws RecognitionException {
		Segment_rules_valueContext _localctx = new Segment_rules_valueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_segment_rules_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			segment_rules_type_1();
			setState(539);
			segment_rules_type_2();
			setState(540);
			segment_rules_type_3();
			setState(541);
			match(COM);
			setState(542);
			segment_rules_type_4();
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

	public static class Segment_rules_type_1Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_rules_type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_rules_type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_rules_type_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_rules_type_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_rules_type_1Context segment_rules_type_1() throws RecognitionException {
		Segment_rules_type_1Context _localctx = new Segment_rules_type_1Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_segment_rules_type_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(String);
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

	public static class Segment_rules_type_2Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_rules_type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules_type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_rules_type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_rules_type_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_rules_type_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_rules_type_2Context segment_rules_type_2() throws RecognitionException {
		Segment_rules_type_2Context _localctx = new Segment_rules_type_2Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_segment_rules_type_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(String);
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

	public static class Segment_rules_type_3Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_rules_type_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules_type_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_rules_type_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_rules_type_3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_rules_type_3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_rules_type_3Context segment_rules_type_3() throws RecognitionException {
		Segment_rules_type_3Context _localctx = new Segment_rules_type_3Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_segment_rules_type_3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(String);
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

	public static class Segment_rules_type_4Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_rules_type_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules_type_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_rules_type_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_rules_type_4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_rules_type_4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_rules_type_4Context segment_rules_type_4() throws RecognitionException {
		Segment_rules_type_4Context _localctx = new Segment_rules_type_4Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_segment_rules_type_4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(String);
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

	public static class Segment_exitContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(DBDParser.EXIT, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public TerminalNode NONE() { return getToken(DBDParser.NONE, 0); }
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Segment_exitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_exit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_exit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_exit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_exitContext segment_exit() throws RecognitionException {
		Segment_exitContext _localctx = new Segment_exitContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_segment_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(EXIT);
			setState(553);
			match(EQUAL);
			setState(554);
			match(LPAREN);
			setState(555);
			match(NONE);
			setState(556);
			match(RPAREN);
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

	public static class Segment_comprtnContext extends ParserRuleContext {
		public TerminalNode COMPRTN() { return getToken(DBDParser.COMPRTN, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Segment_comprtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_comprtn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_comprtn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_comprtn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_comprtn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_comprtnContext segment_comprtn() throws RecognitionException {
		Segment_comprtnContext _localctx = new Segment_comprtnContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_segment_comprtn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(COMPRTN);
			setState(559);
			match(EQUAL);
			setState(560);
			match(LPAREN);
			setState(561);
			match(String);
			setState(562);
			match(RPAREN);
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

	public static class Segment_encodingContext extends ParserRuleContext {
		public TerminalNode ENCODING() { return getToken(DBDParser.ENCODING, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_encodingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_encoding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_encoding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_encoding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_encoding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_encodingContext segment_encoding() throws RecognitionException {
		Segment_encodingContext _localctx = new Segment_encodingContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_segment_encoding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(ENCODING);
			setState(565);
			match(EQUAL);
			setState(566);
			match(String);
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

	public static class Segment_remarksContext extends ParserRuleContext {
		public TerminalNode REMARKS() { return getToken(DBDParser.REMARKS, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterSegment_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitSegment_remarks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitSegment_remarks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segment_remarksContext segment_remarks() throws RecognitionException {
		Segment_remarksContext _localctx = new Segment_remarksContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_segment_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(REMARKS);
			setState(569);
			match(EQUAL);
			setState(570);
			match(String);
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
		public TerminalNode FIELD() { return getToken(DBDParser.FIELD, 0); }
		public Field_paramsContext field_params() {
			return getRuleContext(Field_paramsContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(FIELD);
			setState(573);
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
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public Field_paramsContext field_params() {
			return getRuleContext(Field_paramsContext.class,0);
		}
		public Field_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_paramsContext field_params() throws RecognitionException {
		Field_paramsContext _localctx = new Field_paramsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_field_params);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				field_param();
				setState(576);
				match(COM);
				setState(577);
				field_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
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
		public Field_external_nameContext field_external_name() {
			return getRuleContext(Field_external_nameContext.class,0);
		}
		public Field_bytesContext field_bytes() {
			return getRuleContext(Field_bytesContext.class,0);
		}
		public Field_startContext field_start() {
			return getRuleContext(Field_startContext.class,0);
		}
		public Field_max_bytesContext field_max_bytes() {
			return getRuleContext(Field_max_bytesContext.class,0);
		}
		public Field_start_afterContext field_start_after() {
			return getRuleContext(Field_start_afterContext.class,0);
		}
		public Field_rel_startContext field_rel_start() {
			return getRuleContext(Field_rel_startContext.class,0);
		}
		public Field_datatypeContext field_datatype() {
			return getRuleContext(Field_datatypeContext.class,0);
		}
		public Field_typeContext field_type() {
			return getRuleContext(Field_typeContext.class,0);
		}
		public Field_case_nameContext field_case_name() {
			return getRuleContext(Field_case_nameContext.class,0);
		}
		public Field_dependsonContext field_dependson() {
			return getRuleContext(Field_dependsonContext.class,0);
		}
		public Field_min_occursContext field_min_occurs() {
			return getRuleContext(Field_min_occursContext.class,0);
		}
		public Field_max_occursContext field_max_occurs() {
			return getRuleContext(Field_max_occursContext.class,0);
		}
		public Field_parentContext field_parent() {
			return getRuleContext(Field_parentContext.class,0);
		}
		public Field_redefinesContext field_redefines() {
			return getRuleContext(Field_redefinesContext.class,0);
		}
		public Field_remarksContext field_remarks() {
			return getRuleContext(Field_remarksContext.class,0);
		}
		public Field_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_paramContext field_param() throws RecognitionException {
		Field_paramContext _localctx = new Field_paramContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_field_param);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				field_name();
				}
				break;
			case EXTERNAL_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				field_external_name();
				}
				break;
			case BYTES:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				field_bytes();
				}
				break;
			case START:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				field_start();
				}
				break;
			case MAXBYTES:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
				field_max_bytes();
				}
				break;
			case STARTAFTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(587);
				field_start_after();
				}
				break;
			case RELSTART:
				enterOuterAlt(_localctx, 7);
				{
				setState(588);
				field_rel_start();
				}
				break;
			case DATATYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(589);
				field_datatype();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 9);
				{
				setState(590);
				field_type();
				}
				break;
			case CASENAME:
				enterOuterAlt(_localctx, 10);
				{
				setState(591);
				field_case_name();
				}
				break;
			case DEPENDSON:
				enterOuterAlt(_localctx, 11);
				{
				setState(592);
				field_dependson();
				}
				break;
			case MINOCCURS:
				enterOuterAlt(_localctx, 12);
				{
				setState(593);
				field_min_occurs();
				}
				break;
			case MAXOCCURS:
				enterOuterAlt(_localctx, 13);
				{
				setState(594);
				field_max_occurs();
				}
				break;
			case PARENT:
				enterOuterAlt(_localctx, 14);
				{
				setState(595);
				field_parent();
				}
				break;
			case REDEFINES:
				enterOuterAlt(_localctx, 15);
				{
				setState(596);
				field_redefines();
				}
				break;
			case REMARKS:
				enterOuterAlt(_localctx, 16);
				{
				setState(597);
				field_remarks();
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
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Field_name_valueContext field_name_value() {
			return getRuleContext(Field_name_valueContext.class,0);
		}
		public Field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_nameContext field_name() throws RecognitionException {
		Field_nameContext _localctx = new Field_nameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(NAME);
			setState(601);
			match(EQUAL);
			setState(602);
			field_name_value();
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

	public static class Field_name_valueContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public List<TerminalNode> COM() { return getTokens(DBDParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(DBDParser.COM, i);
		}
		public Field_name_value_typeContext field_name_value_type() {
			return getRuleContext(Field_name_value_typeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Field_name_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_name_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_name_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_name_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_name_valueContext field_name_value() throws RecognitionException {
		Field_name_valueContext _localctx = new Field_name_valueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_field_name_value);
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(LPAREN);
				setState(605);
				match(String);
				setState(606);
				match(COM);
				setState(607);
				match(String);
				setState(608);
				match(COM);
				setState(609);
				field_name_value_type();
				setState(610);
				match(RPAREN);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(String);
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

	public static class Field_name_value_typeContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_name_value_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name_value_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_name_value_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_name_value_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_name_value_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_name_value_typeContext field_name_value_type() throws RecognitionException {
		Field_name_value_typeContext _localctx = new Field_name_value_typeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_field_name_value_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(String);
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

	public static class Field_external_nameContext extends ParserRuleContext {
		public TerminalNode EXTERNAL_NAME() { return getToken(DBDParser.EXTERNAL_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_external_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_external_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_external_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_external_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_external_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_external_nameContext field_external_name() throws RecognitionException {
		Field_external_nameContext _localctx = new Field_external_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_field_external_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(EXTERNAL_NAME);
			setState(618);
			match(EQUAL);
			setState(619);
			match(String);
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
		public TerminalNode BYTES() { return getToken(DBDParser.BYTES, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_bytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_bytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_bytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_bytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_bytesContext field_bytes() throws RecognitionException {
		Field_bytesContext _localctx = new Field_bytesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_field_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(BYTES);
			setState(622);
			match(EQUAL);
			setState(623);
			match(String);
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

	public static class Field_max_bytesContext extends ParserRuleContext {
		public TerminalNode MAXBYTES() { return getToken(DBDParser.MAXBYTES, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_max_bytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_max_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_max_bytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_max_bytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_max_bytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_max_bytesContext field_max_bytes() throws RecognitionException {
		Field_max_bytesContext _localctx = new Field_max_bytesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_field_max_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(MAXBYTES);
			setState(626);
			match(EQUAL);
			setState(627);
			match(String);
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
		public TerminalNode START() { return getToken(DBDParser.START, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_startContext field_start() throws RecognitionException {
		Field_startContext _localctx = new Field_startContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_field_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(START);
			setState(630);
			match(EQUAL);
			setState(631);
			match(String);
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

	public static class Field_start_afterContext extends ParserRuleContext {
		public TerminalNode STARTAFTER() { return getToken(DBDParser.STARTAFTER, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_start_afterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_start_after; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_start_after(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_start_after(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_start_after(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_start_afterContext field_start_after() throws RecognitionException {
		Field_start_afterContext _localctx = new Field_start_afterContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_field_start_after);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(STARTAFTER);
			setState(634);
			match(EQUAL);
			setState(635);
			match(String);
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

	public static class Field_rel_startContext extends ParserRuleContext {
		public TerminalNode RELSTART() { return getToken(DBDParser.RELSTART, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_rel_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_rel_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_rel_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_rel_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_rel_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_rel_startContext field_rel_start() throws RecognitionException {
		Field_rel_startContext _localctx = new Field_rel_startContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_field_rel_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(RELSTART);
			setState(638);
			match(EQUAL);
			setState(639);
			match(String);
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
		public TerminalNode DATATYPE() { return getToken(DBDParser.DATATYPE, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Field_datatype_valueContext field_datatype_value() {
			return getRuleContext(Field_datatype_valueContext.class,0);
		}
		public Field_datatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_datatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_datatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_datatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_datatypeContext field_datatype() throws RecognitionException {
		Field_datatypeContext _localctx = new Field_datatypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_field_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(DATATYPE);
			setState(642);
			match(EQUAL);
			setState(643);
			field_datatype_value();
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

	public static class Field_datatype_valueContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Field_datatype_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_datatype_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_datatype_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_datatype_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_datatype_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_datatype_valueContext field_datatype_value() throws RecognitionException {
		Field_datatype_valueContext _localctx = new Field_datatype_valueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_field_datatype_value);
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(String);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(String);
				setState(647);
				match(LPAREN);
				setState(648);
				match(String);
				setState(649);
				match(COM);
				setState(650);
				match(String);
				setState(651);
				match(RPAREN);
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

	public static class Field_typeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(DBDParser.TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Field_type_valueContext field_type_value() {
			return getRuleContext(Field_type_valueContext.class,0);
		}
		public Field_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_typeContext field_type() throws RecognitionException {
		Field_typeContext _localctx = new Field_typeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_field_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(TYPE);
			setState(655);
			match(EQUAL);
			setState(656);
			field_type_value();
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

	public static class Field_type_valueContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_type_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_type_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_type_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_type_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_type_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_type_valueContext field_type_value() throws RecognitionException {
		Field_type_valueContext _localctx = new Field_type_valueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_field_type_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(String);
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

	public static class Field_case_nameContext extends ParserRuleContext {
		public TerminalNode CASENAME() { return getToken(DBDParser.CASENAME, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_case_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_case_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_case_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_case_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_case_nameContext field_case_name() throws RecognitionException {
		Field_case_nameContext _localctx = new Field_case_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_field_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(CASENAME);
			setState(661);
			match(EQUAL);
			setState(662);
			match(String);
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

	public static class Field_dependsonContext extends ParserRuleContext {
		public TerminalNode DEPENDSON() { return getToken(DBDParser.DEPENDSON, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_dependsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_dependson; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_dependson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_dependson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_dependson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_dependsonContext field_dependson() throws RecognitionException {
		Field_dependsonContext _localctx = new Field_dependsonContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_field_dependson);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(DEPENDSON);
			setState(665);
			match(EQUAL);
			setState(666);
			match(String);
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

	public static class Field_min_occursContext extends ParserRuleContext {
		public TerminalNode MINOCCURS() { return getToken(DBDParser.MINOCCURS, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_min_occursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_min_occurs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_min_occurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_min_occurs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_min_occurs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_min_occursContext field_min_occurs() throws RecognitionException {
		Field_min_occursContext _localctx = new Field_min_occursContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_field_min_occurs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(MINOCCURS);
			setState(669);
			match(EQUAL);
			setState(670);
			match(String);
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

	public static class Field_max_occursContext extends ParserRuleContext {
		public TerminalNode MAXOCCURS() { return getToken(DBDParser.MAXOCCURS, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_max_occursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_max_occurs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_max_occurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_max_occurs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_max_occurs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_max_occursContext field_max_occurs() throws RecognitionException {
		Field_max_occursContext _localctx = new Field_max_occursContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_field_max_occurs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(MAXOCCURS);
			setState(673);
			match(EQUAL);
			setState(674);
			match(String);
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

	public static class Field_parentContext extends ParserRuleContext {
		public TerminalNode PARENT() { return getToken(DBDParser.PARENT, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_parentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_parent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_parent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_parentContext field_parent() throws RecognitionException {
		Field_parentContext _localctx = new Field_parentContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_field_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(PARENT);
			setState(677);
			match(EQUAL);
			setState(678);
			match(String);
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

	public static class Field_redefinesContext extends ParserRuleContext {
		public TerminalNode REDEFINES() { return getToken(DBDParser.REDEFINES, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_redefinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_redefines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_redefines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_redefines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_redefines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_redefinesContext field_redefines() throws RecognitionException {
		Field_redefinesContext _localctx = new Field_redefinesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_field_redefines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(REDEFINES);
			setState(681);
			match(EQUAL);
			setState(682);
			match(String);
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

	public static class Field_remarksContext extends ParserRuleContext {
		public TerminalNode REMARKS() { return getToken(DBDParser.REMARKS, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterField_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitField_remarks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitField_remarks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_remarksContext field_remarks() throws RecognitionException {
		Field_remarksContext _localctx = new Field_remarksContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_field_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(REMARKS);
			setState(685);
			match(EQUAL);
			setState(686);
			match(String);
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

	public static class LchildContext extends ParserRuleContext {
		public TerminalNode LCHILD() { return getToken(DBDParser.LCHILD, 0); }
		public Lchild_paramsContext lchild_params() {
			return getRuleContext(Lchild_paramsContext.class,0);
		}
		public List<XdfldContext> xdfld() {
			return getRuleContexts(XdfldContext.class);
		}
		public XdfldContext xdfld(int i) {
			return getRuleContext(XdfldContext.class,i);
		}
		public LchildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LchildContext lchild() throws RecognitionException {
		LchildContext _localctx = new LchildContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_lchild);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(LCHILD);
			setState(689);
			lchild_params();
			setState(691); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(690);
				xdfld();
				}
				}
				setState(693); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==XDFLD );
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

	public static class Lchild_paramsContext extends ParserRuleContext {
		public Lchild_paramContext lchild_param() {
			return getRuleContext(Lchild_paramContext.class,0);
		}
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public Lchild_paramsContext lchild_params() {
			return getRuleContext(Lchild_paramsContext.class,0);
		}
		public Lchild_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lchild_paramsContext lchild_params() throws RecognitionException {
		Lchild_paramsContext _localctx = new Lchild_paramsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lchild_params);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				lchild_param();
				setState(696);
				match(COM);
				setState(697);
				lchild_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				lchild_param();
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

	public static class Lchild_paramContext extends ParserRuleContext {
		public Lchild_nameContext lchild_name() {
			return getRuleContext(Lchild_nameContext.class,0);
		}
		public Lchild_ptrContext lchild_ptr() {
			return getRuleContext(Lchild_ptrContext.class,0);
		}
		public Lchild_pairContext lchild_pair() {
			return getRuleContext(Lchild_pairContext.class,0);
		}
		public Lchild_rulesContext lchild_rules() {
			return getRuleContext(Lchild_rulesContext.class,0);
		}
		public Lchild_remarksContext lchild_remarks() {
			return getRuleContext(Lchild_remarksContext.class,0);
		}
		public Lchild_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lchild_paramContext lchild_param() throws RecognitionException {
		Lchild_paramContext _localctx = new Lchild_paramContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lchild_param);
		try {
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				lchild_name();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				lchild_ptr();
				}
				break;
			case PAIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(704);
				lchild_pair();
				}
				break;
			case RULES:
				enterOuterAlt(_localctx, 4);
				{
				setState(705);
				lchild_rules();
				}
				break;
			case REMARKS:
				enterOuterAlt(_localctx, 5);
				{
				setState(706);
				lchild_remarks();
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

	public static class Lchild_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DBDParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Lchild_name_paramsContext lchild_name_params() {
			return getRuleContext(Lchild_name_paramsContext.class,0);
		}
		public Lchild_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lchild_nameContext lchild_name() throws RecognitionException {
		Lchild_nameContext _localctx = new Lchild_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_lchild_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(NAME);
			setState(710);
			match(EQUAL);
			setState(711);
			lchild_name_params();
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

	public static class Lchild_name_paramsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public Lchild_name_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_name_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild_name_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild_name_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild_name_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lchild_name_paramsContext lchild_name_params() throws RecognitionException {
		Lchild_name_paramsContext _localctx = new Lchild_name_paramsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_lchild_name_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(LPAREN);
			setState(714);
			match(String);
			setState(715);
			match(COM);
			setState(716);
			match(String);
			setState(717);
			match(RPAREN);
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

	public static class Lchild_ptrContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(DBDParser.POINTER, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Lchild_ptr_typeContext lchild_ptr_type() {
			return getRuleContext(Lchild_ptr_typeContext.class,0);
		}
		public Lchild_ptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild_ptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild_ptr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild_ptr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lchild_ptrContext lchild_ptr() throws RecognitionException {
		Lchild_ptrContext _localctx = new Lchild_ptrContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lchild_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(POINTER);
			setState(720);
			match(EQUAL);
			setState(721);
			lchild_ptr_type();
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

	public static class Lchild_ptr_typeContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Lchild_ptr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_ptr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild_ptr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild_ptr_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild_ptr_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lchild_ptr_typeContext lchild_ptr_type() throws RecognitionException {
		Lchild_ptr_typeContext _localctx = new Lchild_ptr_typeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_lchild_ptr_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(String);
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

	public static class Lchild_pairContext extends ParserRuleContext {
		public TerminalNode PAIR() { return getToken(DBDParser.PAIR, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Lchild_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lchild_pairContext lchild_pair() throws RecognitionException {
		Lchild_pairContext _localctx = new Lchild_pairContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_lchild_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(PAIR);
			setState(726);
			match(EQUAL);
			setState(727);
			match(String);
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

	public static class Lchild_rulesContext extends ParserRuleContext {
		public TerminalNode RULES() { return getToken(DBDParser.RULES, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public Lchild_rules_typeContext lchild_rules_type() {
			return getRuleContext(Lchild_rules_typeContext.class,0);
		}
		public Lchild_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild_rules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild_rules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lchild_rulesContext lchild_rules() throws RecognitionException {
		Lchild_rulesContext _localctx = new Lchild_rulesContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_lchild_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(RULES);
			setState(730);
			match(EQUAL);
			setState(731);
			lchild_rules_type();
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

	public static class Lchild_rules_typeContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Lchild_rules_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_rules_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild_rules_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild_rules_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild_rules_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lchild_rules_typeContext lchild_rules_type() throws RecognitionException {
		Lchild_rules_typeContext _localctx = new Lchild_rules_typeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_lchild_rules_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(String);
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

	public static class Lchild_remarksContext extends ParserRuleContext {
		public TerminalNode REMARKS() { return getToken(DBDParser.REMARKS, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Lchild_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterLchild_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitLchild_remarks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitLchild_remarks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lchild_remarksContext lchild_remarks() throws RecognitionException {
		Lchild_remarksContext _localctx = new Lchild_remarksContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_lchild_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(REMARKS);
			setState(736);
			match(EQUAL);
			setState(737);
			match(String);
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

	public static class XdfldContext extends ParserRuleContext {
		public TerminalNode XDFLD() { return getToken(DBDParser.XDFLD, 0); }
		public Xdfld_paramsContext xdfld_params() {
			return getRuleContext(Xdfld_paramsContext.class,0);
		}
		public XdfldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XdfldContext xdfld() throws RecognitionException {
		XdfldContext _localctx = new XdfldContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_xdfld);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(XDFLD);
			setState(740);
			xdfld_params();
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

	public static class Xdfld_paramsContext extends ParserRuleContext {
		public Xdfld_paramContext xdfld_param() {
			return getRuleContext(Xdfld_paramContext.class,0);
		}
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public Xdfld_paramsContext xdfld_params() {
			return getRuleContext(Xdfld_paramsContext.class,0);
		}
		public Xdfld_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_paramsContext xdfld_params() throws RecognitionException {
		Xdfld_paramsContext _localctx = new Xdfld_paramsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_xdfld_params);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				xdfld_param();
				setState(743);
				match(COM);
				setState(744);
				xdfld_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				xdfld_param();
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

	public static class Xdfld_paramContext extends ParserRuleContext {
		public Xdfld_nameContext xdfld_name() {
			return getRuleContext(Xdfld_nameContext.class,0);
		}
		public Xdfld_segmentContext xdfld_segment() {
			return getRuleContext(Xdfld_segmentContext.class,0);
		}
		public Xdfld_constContext xdfld_const() {
			return getRuleContext(Xdfld_constContext.class,0);
		}
		public Xdfld_srchContext xdfld_srch() {
			return getRuleContext(Xdfld_srchContext.class,0);
		}
		public Xdfld_subseqContext xdfld_subseq() {
			return getRuleContext(Xdfld_subseqContext.class,0);
		}
		public Xdfld_ddataContext xdfld_ddata() {
			return getRuleContext(Xdfld_ddataContext.class,0);
		}
		public Xdfld_nullvalContext xdfld_nullval() {
			return getRuleContext(Xdfld_nullvalContext.class,0);
		}
		public Xdfld_extrtnContext xdfld_extrtn() {
			return getRuleContext(Xdfld_extrtnContext.class,0);
		}
		public Xdfld_remarksContext xdfld_remarks() {
			return getRuleContext(Xdfld_remarksContext.class,0);
		}
		public Xdfld_externalnameContext xdfld_externalname() {
			return getRuleContext(Xdfld_externalnameContext.class,0);
		}
		public Xdfld_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_paramContext xdfld_param() throws RecognitionException {
		Xdfld_paramContext _localctx = new Xdfld_paramContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_xdfld_param);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				xdfld_name();
				}
				break;
			case SEGMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				xdfld_segment();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(751);
				xdfld_const();
				}
				break;
			case SRCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(752);
				xdfld_srch();
				}
				break;
			case SUBSEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(753);
				xdfld_subseq();
				}
				break;
			case DDATA:
				enterOuterAlt(_localctx, 6);
				{
				setState(754);
				xdfld_ddata();
				}
				break;
			case NULLVAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(755);
				xdfld_nullval();
				}
				break;
			case EXTRTN:
				enterOuterAlt(_localctx, 8);
				{
				setState(756);
				xdfld_extrtn();
				}
				break;
			case REMARKS:
				enterOuterAlt(_localctx, 9);
				{
				setState(757);
				xdfld_remarks();
				}
				break;
			case EXTERNAL_NAME:
				enterOuterAlt(_localctx, 10);
				{
				setState(758);
				xdfld_externalname();
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

	public static class Xdfld_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DBDParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_nameContext xdfld_name() throws RecognitionException {
		Xdfld_nameContext _localctx = new Xdfld_nameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_xdfld_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(NAME);
			setState(762);
			match(EQUAL);
			setState(763);
			match(String);
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

	public static class Xdfld_segmentContext extends ParserRuleContext {
		public TerminalNode SEGMENT() { return getToken(DBDParser.SEGMENT, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_segment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_segment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_segmentContext xdfld_segment() throws RecognitionException {
		Xdfld_segmentContext _localctx = new Xdfld_segmentContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_xdfld_segment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(SEGMENT);
			setState(766);
			match(EQUAL);
			setState(767);
			match(String);
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

	public static class Xdfld_constContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(DBDParser.CONST, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_constContext xdfld_const() throws RecognitionException {
		Xdfld_constContext _localctx = new Xdfld_constContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_xdfld_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(CONST);
			setState(770);
			match(EQUAL);
			setState(771);
			match(String);
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

	public static class Xdfld_srchContext extends ParserRuleContext {
		public TerminalNode SRCH() { return getToken(DBDParser.SRCH, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_srchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_srch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_srch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_srch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_srch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_srchContext xdfld_srch() throws RecognitionException {
		Xdfld_srchContext _localctx = new Xdfld_srchContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_xdfld_srch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(SRCH);
			setState(774);
			match(EQUAL);
			setState(775);
			match(String);
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

	public static class Xdfld_subseqContext extends ParserRuleContext {
		public TerminalNode SUBSEQ() { return getToken(DBDParser.SUBSEQ, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_subseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_subseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_subseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_subseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_subseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_subseqContext xdfld_subseq() throws RecognitionException {
		Xdfld_subseqContext _localctx = new Xdfld_subseqContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_xdfld_subseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(SUBSEQ);
			setState(778);
			match(EQUAL);
			setState(779);
			match(String);
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

	public static class Xdfld_ddataContext extends ParserRuleContext {
		public TerminalNode DDATA() { return getToken(DBDParser.DDATA, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_ddataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_ddata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_ddata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_ddata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_ddata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_ddataContext xdfld_ddata() throws RecognitionException {
		Xdfld_ddataContext _localctx = new Xdfld_ddataContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_xdfld_ddata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(DDATA);
			setState(782);
			match(EQUAL);
			setState(783);
			match(String);
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

	public static class Xdfld_nullvalContext extends ParserRuleContext {
		public TerminalNode NULLVAL() { return getToken(DBDParser.NULLVAL, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_nullvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_nullval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_nullval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_nullval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_nullval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_nullvalContext xdfld_nullval() throws RecognitionException {
		Xdfld_nullvalContext _localctx = new Xdfld_nullvalContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_xdfld_nullval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(NULLVAL);
			setState(786);
			match(EQUAL);
			setState(787);
			match(String);
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

	public static class Xdfld_extrtnContext extends ParserRuleContext {
		public TerminalNode EXTRTN() { return getToken(DBDParser.EXTRTN, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_extrtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_extrtn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_extrtn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_extrtn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_extrtn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_extrtnContext xdfld_extrtn() throws RecognitionException {
		Xdfld_extrtnContext _localctx = new Xdfld_extrtnContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_xdfld_extrtn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(EXTRTN);
			setState(790);
			match(EQUAL);
			setState(791);
			match(String);
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

	public static class Xdfld_remarksContext extends ParserRuleContext {
		public TerminalNode REMARKS() { return getToken(DBDParser.REMARKS, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_remarks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_remarks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_remarksContext xdfld_remarks() throws RecognitionException {
		Xdfld_remarksContext _localctx = new Xdfld_remarksContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_xdfld_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(REMARKS);
			setState(794);
			match(EQUAL);
			setState(795);
			match(String);
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

	public static class Xdfld_externalnameContext extends ParserRuleContext {
		public TerminalNode EXTERNAL_NAME() { return getToken(DBDParser.EXTERNAL_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_externalnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_externalname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterXdfld_externalname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitXdfld_externalname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitXdfld_externalname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xdfld_externalnameContext xdfld_externalname() throws RecognitionException {
		Xdfld_externalnameContext _localctx = new Xdfld_externalnameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_xdfld_externalname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(EXTERNAL_NAME);
			setState(798);
			match(EQUAL);
			setState(799);
			match(String);
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
		public TerminalNode DBD_GEN() { return getToken(DBDParser.DBD_GEN, 0); }
		public TerminalNode END() { return getToken(DBDParser.END, 0); }
		public TerminalNode FINISH() { return getToken(DBDParser.FINISH, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(DBD_GEN);
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINISH) {
				{
				setState(802);
				match(FINISH);
				}
			}

			setState(805);
			match(END);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Bool_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterBool_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitBool_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitBool_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_stringContext bool_string() throws RecognitionException {
		Bool_stringContext _localctx = new Bool_stringContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_bool_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(String);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u032c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\3\2\3\2\3\2\7\2\u00e2\n\2\f\2\16\2\u00e5\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u00f1\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00fd\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u010e\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u012a\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u0150\n\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u015e"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0168\n\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\7!\u018f\n!\f!\16!\u0192\13!\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\5#\u019c\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01aa\n$\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\5(\u01c3\n(\3)\3)\3)\3)\5)\u01c9\n)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01de\n+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\5/\u01f6\n/\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\5\62\u0205\n\62\3\62\3\62\5\62"+
		"\u0209\n\62\3\62\3\62\5\62\u020d\n\62\3\62\3\62\5\62\u0211\n\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@\5@\u0247\n@\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0259\nA\3B\3B\3B\3B\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\5C\u0268\nC\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3"+
		"G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3"+
		"L\3L\5L\u028f\nL\3M\3M\3M\3M\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3"+
		"Q\3R\3R\3R\3R\3S\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\6V\u02b6\n"+
		"V\rV\16V\u02b7\3W\3W\3W\3W\3W\5W\u02bf\nW\3X\3X\3X\3X\3X\5X\u02c6\nX\3"+
		"Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3]\3]\3]\3]\3^\3^\3^"+
		"\3^\3_\3_\3`\3`\3`\3`\3a\3a\3a\3b\3b\3b\3b\3b\5b\u02ee\nb\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\5c\u02fa\nc\3d\3d\3d\3d\3e\3e\3e\3e\3f\3f\3f\3f\3g"+
		"\3g\3g\3g\3h\3h\3h\3h\3i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\3k\3l\3l\3l\3l"+
		"\3m\3m\3m\3m\3n\3n\5n\u0326\nn\3n\3n\3o\3o\3o\2\2p\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\2\2\2\u0310\2\u00de\3\2\2\2\4\u00e8\3\2\2\2\6\u00f0\3\2\2\2\b\u00fc\3"+
		"\2\2\2\n\u00fe\3\2\2\2\f\u0102\3\2\2\2\16\u010d\3\2\2\2\20\u010f\3\2\2"+
		"\2\22\u0129\3\2\2\2\24\u012b\3\2\2\2\26\u012f\3\2\2\2\30\u0133\3\2\2\2"+
		"\32\u0139\3\2\2\2\34\u013d\3\2\2\2\36\u0141\3\2\2\2 \u0145\3\2\2\2\"\u0149"+
		"\3\2\2\2$\u014b\3\2\2\2&\u014f\3\2\2\2(\u0151\3\2\2\2*\u0155\3\2\2\2,"+
		"\u015d\3\2\2\2.\u0167\3\2\2\2\60\u0169\3\2\2\2\62\u016d\3\2\2\2\64\u0171"+
		"\3\2\2\2\66\u0175\3\2\2\28\u0179\3\2\2\2:\u017d\3\2\2\2<\u0183\3\2\2\2"+
		">\u0187\3\2\2\2@\u018b\3\2\2\2B\u0193\3\2\2\2D\u019b\3\2\2\2F\u01a9\3"+
		"\2\2\2H\u01ab\3\2\2\2J\u01af\3\2\2\2L\u01b3\3\2\2\2N\u01c2\3\2\2\2P\u01c8"+
		"\3\2\2\2R\u01ca\3\2\2\2T\u01dd\3\2\2\2V\u01df\3\2\2\2X\u01e1\3\2\2\2Z"+
		"\u01eb\3\2\2\2\\\u01f5\3\2\2\2^\u01f7\3\2\2\2`\u01fb\3\2\2\2b\u0201\3"+
		"\2\2\2d\u0212\3\2\2\2f\u0214\3\2\2\2h\u0216\3\2\2\2j\u021c\3\2\2\2l\u0222"+
		"\3\2\2\2n\u0224\3\2\2\2p\u0226\3\2\2\2r\u0228\3\2\2\2t\u022a\3\2\2\2v"+
		"\u0230\3\2\2\2x\u0236\3\2\2\2z\u023a\3\2\2\2|\u023e\3\2\2\2~\u0246\3\2"+
		"\2\2\u0080\u0258\3\2\2\2\u0082\u025a\3\2\2\2\u0084\u0267\3\2\2\2\u0086"+
		"\u0269\3\2\2\2\u0088\u026b\3\2\2\2\u008a\u026f\3\2\2\2\u008c\u0273\3\2"+
		"\2\2\u008e\u0277\3\2\2\2\u0090\u027b\3\2\2\2\u0092\u027f\3\2\2\2\u0094"+
		"\u0283\3\2\2\2\u0096\u028e\3\2\2\2\u0098\u0290\3\2\2\2\u009a\u0294\3\2"+
		"\2\2\u009c\u0296\3\2\2\2\u009e\u029a\3\2\2\2\u00a0\u029e\3\2\2\2\u00a2"+
		"\u02a2\3\2\2\2\u00a4\u02a6\3\2\2\2\u00a6\u02aa\3\2\2\2\u00a8\u02ae\3\2"+
		"\2\2\u00aa\u02b2\3\2\2\2\u00ac\u02be\3\2\2\2\u00ae\u02c5\3\2\2\2\u00b0"+
		"\u02c7\3\2\2\2\u00b2\u02cb\3\2\2\2\u00b4\u02d1\3\2\2\2\u00b6\u02d5\3\2"+
		"\2\2\u00b8\u02d7\3\2\2\2\u00ba\u02db\3\2\2\2\u00bc\u02df\3\2\2\2\u00be"+
		"\u02e1\3\2\2\2\u00c0\u02e5\3\2\2\2\u00c2\u02ed\3\2\2\2\u00c4\u02f9\3\2"+
		"\2\2\u00c6\u02fb\3\2\2\2\u00c8\u02ff\3\2\2\2\u00ca\u0303\3\2\2\2\u00cc"+
		"\u0307\3\2\2\2\u00ce\u030b\3\2\2\2\u00d0\u030f\3\2\2\2\u00d2\u0313\3\2"+
		"\2\2\u00d4\u0317\3\2\2\2\u00d6\u031b\3\2\2\2\u00d8\u031f\3\2\2\2\u00da"+
		"\u0323\3\2\2\2\u00dc\u0329\3\2\2\2\u00de\u00df\5\4\3\2\u00df\u00e3\5&"+
		"\24\2\u00e0\u00e2\5@!\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\5\u00dan\2\u00e7\3\3\2\2\2\u00e8\u00e9\7\7\2\2\u00e9"+
		"\u00ea\5\6\4\2\u00ea\5\3\2\2\2\u00eb\u00ec\5\b\5\2\u00ec\u00ed\7\3\2\2"+
		"\u00ed\u00ee\5\6\4\2\u00ee\u00f1\3\2\2\2\u00ef\u00f1\5\b\5\2\u00f0\u00eb"+
		"\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\7\3\2\2\2\u00f2\u00fd\5\n\6\2\u00f3"+
		"\u00fd\5\f\7\2\u00f4\u00fd\5\20\t\2\u00f5\u00fd\5\24\13\2\u00f6\u00fd"+
		"\5\26\f\2\u00f7\u00fd\5\30\r\2\u00f8\u00fd\5\32\16\2\u00f9\u00fd\5\34"+
		"\17\2\u00fa\u00fd\5\36\20\2\u00fb\u00fd\5 \21\2\u00fc\u00f2\3\2\2\2\u00fc"+
		"\u00f3\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2"+
		"\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\t\3\2\2\2\u00fe\u00ff\7\13\2"+
		"\2\u00ff\u0100\7\6\2\2\u0100\u0101\7?\2\2\u0101\13\3\2\2\2\u0102\u0103"+
		"\7\f\2\2\u0103\u0104\7\6\2\2\u0104\u0105\5\16\b\2\u0105\r\3\2\2\2\u0106"+
		"\u0107\7\4\2\2\u0107\u0108\5\"\22\2\u0108\u0109\7\3\2\2\u0109\u010a\5"+
		"$\23\2\u010a\u010b\7\5\2\2\u010b\u010e\3\2\2\2\u010c\u010e\5\"\22\2\u010d"+
		"\u0106\3\2\2\2\u010d\u010c\3\2\2\2\u010e\17\3\2\2\2\u010f\u0110\7\r\2"+
		"\2\u0110\u0111\7\6\2\2\u0111\u0112\5\22\n\2\u0112\21\3\2\2\2\u0113\u0114"+
		"\7\4\2\2\u0114\u0115\7?\2\2\u0115\u0116\7\3\2\2\u0116\u0117\7?\2\2\u0117"+
		"\u0118\7\3\2\2\u0118\u0119\7?\2\2\u0119\u011a\7\3\2\2\u011a\u011b\7?\2"+
		"\2\u011b\u012a\7\5\2\2\u011c\u011d\7\4\2\2\u011d\u011e\7?\2\2\u011e\u011f"+
		"\7\3\2\2\u011f\u0120\7?\2\2\u0120\u0121\7\3\2\2\u0121\u0122\7?\2\2\u0122"+
		"\u012a\7\5\2\2\u0123\u0124\7\4\2\2\u0124\u0125\7?\2\2\u0125\u0126\7\3"+
		"\2\2\u0126\u0127\7?\2\2\u0127\u012a\7\5\2\2\u0128\u012a\7?\2\2\u0129\u0113"+
		"\3\2\2\2\u0129\u011c\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"\23\3\2\2\2\u012b\u012c\7\16\2\2\u012c\u012d\7\6\2\2\u012d\u012e\7A\2"+
		"\2\u012e\25\3\2\2\2\u012f\u0130\7\17\2\2\u0130\u0131\7\6\2\2\u0131\u0132"+
		"\5\u00dco\2\u0132\27\3\2\2\2\u0133\u0134\7\20\2\2\u0134\u0135\7\6\2\2"+
		"\u0135\u0136\7\4\2\2\u0136\u0137\7\21\2\2\u0137\u0138\7\5\2\2\u0138\31"+
		"\3\2\2\2\u0139\u013a\7\22\2\2\u013a\u013b\7\6\2\2\u013b\u013c\7?\2\2\u013c"+
		"\33\3\2\2\2\u013d\u013e\7\23\2\2\u013e\u013f\7\6\2\2\u013f\u0140\5\u00dc"+
		"o\2\u0140\35\3\2\2\2\u0141\u0142\7\24\2\2\u0142\u0143\7\6\2\2\u0143\u0144"+
		"\7?\2\2\u0144\37\3\2\2\2\u0145\u0146\7\25\2\2\u0146\u0147\7\6\2\2\u0147"+
		"\u0148\7?\2\2\u0148!\3\2\2\2\u0149\u014a\7?\2\2\u014a#\3\2\2\2\u014b\u014c"+
		"\7?\2\2\u014c%\3\2\2\2\u014d\u0150\5*\26\2\u014e\u0150\5(\25\2\u014f\u014d"+
		"\3\2\2\2\u014f\u014e\3\2\2\2\u0150\'\3\2\2\2\u0151\u0152\7?\2\2\u0152"+
		"\u0153\7\26\2\2\u0153\u0154\5,\27\2\u0154)\3\2\2\2\u0155\u0156\7\26\2"+
		"\2\u0156\u0157\5,\27\2\u0157+\3\2\2\2\u0158\u0159\5.\30\2\u0159\u015a"+
		"\7\3\2\2\u015a\u015b\5,\27\2\u015b\u015e\3\2\2\2\u015c\u015e\5.\30\2\u015d"+
		"\u0158\3\2\2\2\u015d\u015c\3\2\2\2\u015e-\3\2\2\2\u015f\u0168\5\60\31"+
		"\2\u0160\u0168\5\62\32\2\u0161\u0168\5\64\33\2\u0162\u0168\5\66\34\2\u0163"+
		"\u0168\58\35\2\u0164\u0168\5:\36\2\u0165\u0168\5<\37\2\u0166\u0168\5>"+
		" \2\u0167\u015f\3\2\2\2\u0167\u0160\3\2\2\2\u0167\u0161\3\2\2\2\u0167"+
		"\u0162\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0166\3\2\2\2\u0168/\3\2\2\2\u0169\u016a\7\27\2\2\u016a\u016b"+
		"\7\6\2\2\u016b\u016c\7?\2\2\u016c\61\3\2\2\2\u016d\u016e\7\30\2\2\u016e"+
		"\u016f\7\6\2\2\u016f\u0170\7?\2\2\u0170\63\3\2\2\2\u0171\u0172\7\31\2"+
		"\2\u0172\u0173\7\6\2\2\u0173\u0174\7?\2\2\u0174\65\3\2\2\2\u0175\u0176"+
		"\7\32\2\2\u0176\u0177\7\6\2\2\u0177\u0178\7?\2\2\u0178\67\3\2\2\2\u0179"+
		"\u017a\7\33\2\2\u017a\u017b\7\6\2\2\u017b\u017c\7?\2\2\u017c9\3\2\2\2"+
		"\u017d\u017e\7\34\2\2\u017e\u017f\7\6\2\2\u017f\u0180\7\4\2\2\u0180\u0181"+
		"\7?\2\2\u0181\u0182\7\5\2\2\u0182;\3\2\2\2\u0183\u0184\7\35\2\2\u0184"+
		"\u0185\7\6\2\2\u0185\u0186\7A\2\2\u0186=\3\2\2\2\u0187\u0188\7\25\2\2"+
		"\u0188\u0189\7\6\2\2\u0189\u018a\7?\2\2\u018a?\3\2\2\2\u018b\u0190\5B"+
		"\"\2\u018c\u018f\5|?\2\u018d\u018f\5\u00aaV\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191A\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7\36\2\2\u0194\u0195"+
		"\5D#\2\u0195C\3\2\2\2\u0196\u0197\5F$\2\u0197\u0198\7\3\2\2\u0198\u0199"+
		"\5D#\2\u0199\u019c\3\2\2\2\u019a\u019c\5F$\2\u019b\u0196\3\2\2\2\u019b"+
		"\u019a\3\2\2\2\u019cE\3\2\2\2\u019d\u01aa\5H%\2\u019e\u01aa\5J&\2\u019f"+
		"\u01aa\5L\'\2\u01a0\u01aa\5X-\2\u01a1\u01aa\5Z.\2\u01a2\u01aa\5^\60\2"+
		"\u01a3\u01aa\5`\61\2\u01a4\u01aa\5h\65\2\u01a5\u01aa\5t;\2\u01a6\u01aa"+
		"\5v<\2\u01a7\u01aa\5x=\2\u01a8\u01aa\5z>\2\u01a9\u019d\3\2\2\2\u01a9\u019e"+
		"\3\2\2\2\u01a9\u019f\3\2\2\2\u01a9\u01a0\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9"+
		"\u01a2\3\2\2\2\u01a9\u01a3\3\2\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a5\3\2"+
		"\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"G\3\2\2\2\u01ab\u01ac\7\13\2\2\u01ac\u01ad\7\6\2\2\u01ad\u01ae\7?\2\2"+
		"\u01aeI\3\2\2\2\u01af\u01b0\7\37\2\2\u01b0\u01b1\7\6\2\2\u01b1\u01b2\7"+
		"?\2\2\u01b2K\3\2\2\2\u01b3\u01b4\7 \2\2\u01b4\u01b5\7\6\2\2\u01b5\u01b6"+
		"\5N(\2\u01b6M\3\2\2\2\u01b7\u01b8\7\4\2\2\u01b8\u01b9\5P)\2\u01b9\u01ba"+
		"\7\3\2\2\u01ba\u01bb\5T+\2\u01bb\u01bc\7\5\2\2\u01bc\u01c3\3\2\2\2\u01bd"+
		"\u01be\7\4\2\2\u01be\u01bf\5P)\2\u01bf\u01c0\7\5\2\2\u01c0\u01c3\3\2\2"+
		"\2\u01c1\u01c3\7?\2\2\u01c2\u01b7\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c2\u01c1"+
		"\3\2\2\2\u01c3O\3\2\2\2\u01c4\u01c5\7?\2\2\u01c5\u01c6\7\3\2\2\u01c6\u01c9"+
		"\5R*\2\u01c7\u01c9\7?\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"Q\3\2\2\2\u01ca\u01cb\7?\2\2\u01cbS\3\2\2\2\u01cc\u01cd\7\4\2\2\u01cd"+
		"\u01ce\7?\2\2\u01ce\u01cf\7\3\2\2\u01cf\u01d0\5V,\2\u01d0\u01d1\7\3\2"+
		"\2\u01d1\u01d2\7?\2\2\u01d2\u01d3\7\5\2\2\u01d3\u01de\3\2\2\2\u01d4\u01d5"+
		"\7\4\2\2\u01d5\u01d6\7?\2\2\u01d6\u01d7\7\3\2\2\u01d7\u01d8\5V,\2\u01d8"+
		"\u01d9\7\5\2\2\u01d9\u01de\3\2\2\2\u01da\u01db\7\4\2\2\u01db\u01dc\7?"+
		"\2\2\u01dc\u01de\7\5\2\2\u01dd\u01cc\3\2\2\2\u01dd\u01d4\3\2\2\2\u01dd"+
		"\u01da\3\2\2\2\u01deU\3\2\2\2\u01df\u01e0\7?\2\2\u01e0W\3\2\2\2\u01e1"+
		"\u01e2\7!\2\2\u01e2\u01e3\7\6\2\2\u01e3\u01e4\7\4\2\2\u01e4\u01e5\7?\2"+
		"\2\u01e5\u01e6\7\3\2\2\u01e6\u01e7\7#\2\2\u01e7\u01e8\7\3\2\2\u01e8\u01e9"+
		"\7?\2\2\u01e9\u01ea\7\5\2\2\u01eaY\3\2\2\2\u01eb\u01ec\7\"\2\2\u01ec\u01ed"+
		"\7\6\2\2\u01ed\u01ee\5\\/\2\u01ee[\3\2\2\2\u01ef\u01f0\7\4\2\2\u01f0\u01f1"+
		"\7?\2\2\u01f1\u01f2\7\3\2\2\u01f2\u01f3\7?\2\2\u01f3\u01f6\7\5\2\2\u01f4"+
		"\u01f6\7?\2\2\u01f5\u01ef\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6]\3\2\2\2\u01f7"+
		"\u01f8\7$\2\2\u01f8\u01f9\7\6\2\2\u01f9\u01fa\7?\2\2\u01fa_\3\2\2\2\u01fb"+
		"\u01fc\7%\2\2\u01fc\u01fd\7\6\2\2\u01fd\u01fe\7\4\2\2\u01fe\u01ff\5b\62"+
		"\2\u01ff\u0200\7\5\2\2\u0200a\3\2\2\2\u0201\u0204\5d\63\2\u0202\u0203"+
		"\7\3\2\2\u0203\u0205\5f\64\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0208\3\2\2\2\u0206\u0207\7\3\2\2\u0207\u0209\7?\2\2\u0208\u0206\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u020b\7\3\2\2\u020b"+
		"\u020d\7?\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0210\3\2"+
		"\2\2\u020e\u020f\7\3\2\2\u020f\u0211\7?\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211c\3\2\2\2\u0212\u0213\7?\2\2\u0213e\3\2\2\2\u0214"+
		"\u0215\7?\2\2\u0215g\3\2\2\2\u0216\u0217\7&\2\2\u0217\u0218\7\6\2\2\u0218"+
		"\u0219\7\4\2\2\u0219\u021a\5j\66\2\u021a\u021b\7\5\2\2\u021bi\3\2\2\2"+
		"\u021c\u021d\5l\67\2\u021d\u021e\5n8\2\u021e\u021f\5p9\2\u021f\u0220\7"+
		"\3\2\2\u0220\u0221\5r:\2\u0221k\3\2\2\2\u0222\u0223\7?\2\2\u0223m\3\2"+
		"\2\2\u0224\u0225\7?\2\2\u0225o\3\2\2\2\u0226\u0227\7?\2\2\u0227q\3\2\2"+
		"\2\u0228\u0229\7?\2\2\u0229s\3\2\2\2\u022a\u022b\7\20\2\2\u022b\u022c"+
		"\7\6\2\2\u022c\u022d\7\4\2\2\u022d\u022e\7\21\2\2\u022e\u022f\7\5\2\2"+
		"\u022fu\3\2\2\2\u0230\u0231\7\'\2\2\u0231\u0232\7\6\2\2\u0232\u0233\7"+
		"\4\2\2\u0233\u0234\7?\2\2\u0234\u0235\7\5\2\2\u0235w\3\2\2\2\u0236\u0237"+
		"\7\24\2\2\u0237\u0238\7\6\2\2\u0238\u0239\7?\2\2\u0239y\3\2\2\2\u023a"+
		"\u023b\7\25\2\2\u023b\u023c\7\6\2\2\u023c\u023d\7?\2\2\u023d{\3\2\2\2"+
		"\u023e\u023f\7(\2\2\u023f\u0240\5~@\2\u0240}\3\2\2\2\u0241\u0242\5\u0080"+
		"A\2\u0242\u0243\7\3\2\2\u0243\u0244\5~@\2\u0244\u0247\3\2\2\2\u0245\u0247"+
		"\5\u0080A\2\u0246\u0241\3\2\2\2\u0246\u0245\3\2\2\2\u0247\177\3\2\2\2"+
		"\u0248\u0259\5\u0082B\2\u0249\u0259\5\u0088E\2\u024a\u0259\5\u008aF\2"+
		"\u024b\u0259\5\u008eH\2\u024c\u0259\5\u008cG\2\u024d\u0259\5\u0090I\2"+
		"\u024e\u0259\5\u0092J\2\u024f\u0259\5\u0094K\2\u0250\u0259\5\u0098M\2"+
		"\u0251\u0259\5\u009cO\2\u0252\u0259\5\u009eP\2\u0253\u0259\5\u00a0Q\2"+
		"\u0254\u0259\5\u00a2R\2\u0255\u0259\5\u00a4S\2\u0256\u0259\5\u00a6T\2"+
		"\u0257\u0259\5\u00a8U\2\u0258\u0248\3\2\2\2\u0258\u0249\3\2\2\2\u0258"+
		"\u024a\3\2\2\2\u0258\u024b\3\2\2\2\u0258\u024c\3\2\2\2\u0258\u024d\3\2"+
		"\2\2\u0258\u024e\3\2\2\2\u0258\u024f\3\2\2\2\u0258\u0250\3\2\2\2\u0258"+
		"\u0251\3\2\2\2\u0258\u0252\3\2\2\2\u0258\u0253\3\2\2\2\u0258\u0254\3\2"+
		"\2\2\u0258\u0255\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259"+
		"\u0081\3\2\2\2\u025a\u025b\7\13\2\2\u025b\u025c\7\6\2\2\u025c\u025d\5"+
		"\u0084C\2\u025d\u0083\3\2\2\2\u025e\u025f\7\4\2\2\u025f\u0260\7?\2\2\u0260"+
		"\u0261\7\3\2\2\u0261\u0262\7?\2\2\u0262\u0263\7\3\2\2\u0263\u0264\5\u0086"+
		"D\2\u0264\u0265\7\5\2\2\u0265\u0268\3\2\2\2\u0266\u0268\7?\2\2\u0267\u025e"+
		"\3\2\2\2\u0267\u0266\3\2\2\2\u0268\u0085\3\2\2\2\u0269\u026a\7?\2\2\u026a"+
		"\u0087\3\2\2\2\u026b\u026c\7\37\2\2\u026c\u026d\7\6\2\2\u026d\u026e\7"+
		"?\2\2\u026e\u0089\3\2\2\2\u026f\u0270\7\"\2\2\u0270\u0271\7\6\2\2\u0271"+
		"\u0272\7?\2\2\u0272\u008b\3\2\2\2\u0273\u0274\7)\2\2\u0274\u0275\7\6\2"+
		"\2\u0275\u0276\7?\2\2\u0276\u008d\3\2\2\2\u0277\u0278\7*\2\2\u0278\u0279"+
		"\7\6\2\2\u0279\u027a\7?\2\2\u027a\u008f\3\2\2\2\u027b\u027c\7+\2\2\u027c"+
		"\u027d\7\6\2\2\u027d\u027e\7?\2\2\u027e\u0091\3\2\2\2\u027f\u0280\7,\2"+
		"\2\u0280\u0281\7\6\2\2\u0281\u0282\7?\2\2\u0282\u0093\3\2\2\2\u0283\u0284"+
		"\7-\2\2\u0284\u0285\7\6\2\2\u0285\u0286\5\u0096L\2\u0286\u0095\3\2\2\2"+
		"\u0287\u028f\7?\2\2\u0288\u0289\7?\2\2\u0289\u028a\7\4\2\2\u028a\u028b"+
		"\7?\2\2\u028b\u028c\7\3\2\2\u028c\u028d\7?\2\2\u028d\u028f\7\5\2\2\u028e"+
		"\u0287\3\2\2\2\u028e\u0288\3\2\2\2\u028f\u0097\3\2\2\2\u0290\u0291\7."+
		"\2\2\u0291\u0292\7\6\2\2\u0292\u0293\5\u009aN\2\u0293\u0099\3\2\2\2\u0294"+
		"\u0295\7?\2\2\u0295\u009b\3\2\2\2\u0296\u0297\7/\2\2\u0297\u0298\7\6\2"+
		"\2\u0298\u0299\7?\2\2\u0299\u009d\3\2\2\2\u029a\u029b\7\60\2\2\u029b\u029c"+
		"\7\6\2\2\u029c\u029d\7?\2\2\u029d\u009f\3\2\2\2\u029e\u029f\7\61\2\2\u029f"+
		"\u02a0\7\6\2\2\u02a0\u02a1\7?\2\2\u02a1\u00a1\3\2\2\2\u02a2\u02a3\7\62"+
		"\2\2\u02a3\u02a4\7\6\2\2\u02a4\u02a5\7?\2\2\u02a5\u00a3\3\2\2\2\u02a6"+
		"\u02a7\7 \2\2\u02a7\u02a8\7\6\2\2\u02a8\u02a9\7?\2\2\u02a9\u00a5\3\2\2"+
		"\2\u02aa\u02ab\7\63\2\2\u02ab\u02ac\7\6\2\2\u02ac\u02ad\7?\2\2\u02ad\u00a7"+
		"\3\2\2\2\u02ae\u02af\7\25\2\2\u02af\u02b0\7\6\2\2\u02b0\u02b1\7?\2\2\u02b1"+
		"\u00a9\3\2\2\2\u02b2\u02b3\7\64\2\2\u02b3\u02b5\5\u00acW\2\u02b4\u02b6"+
		"\5\u00c0a\2\u02b5\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b5\3\2\2"+
		"\2\u02b7\u02b8\3\2\2\2\u02b8\u00ab\3\2\2\2\u02b9\u02ba\5\u00aeX\2\u02ba"+
		"\u02bb\7\3\2\2\u02bb\u02bc\5\u00acW\2\u02bc\u02bf\3\2\2\2\u02bd\u02bf"+
		"\5\u00aeX\2\u02be\u02b9\3\2\2\2\u02be\u02bd\3\2\2\2\u02bf\u00ad\3\2\2"+
		"\2\u02c0\u02c6\5\u00b0Y\2\u02c1\u02c6\5\u00b4[\2\u02c2\u02c6\5\u00b8]"+
		"\2\u02c3\u02c6\5\u00ba^\2\u02c4\u02c6\5\u00be`\2\u02c5\u02c0\3\2\2\2\u02c5"+
		"\u02c1\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2"+
		"\2\2\u02c6\u00af\3\2\2\2\u02c7\u02c8\7\13\2\2\u02c8\u02c9\7\6\2\2\u02c9"+
		"\u02ca\5\u00b2Z\2\u02ca\u00b1\3\2\2\2\u02cb\u02cc\7\4\2\2\u02cc\u02cd"+
		"\7?\2\2\u02cd\u02ce\7\3\2\2\u02ce\u02cf\7?\2\2\u02cf\u02d0\7\5\2\2\u02d0"+
		"\u00b3\3\2\2\2\u02d1\u02d2\7%\2\2\u02d2\u02d3\7\6\2\2\u02d3\u02d4\5\u00b6"+
		"\\\2\u02d4\u00b5\3\2\2\2\u02d5\u02d6\7?\2\2\u02d6\u00b7\3\2\2\2\u02d7"+
		"\u02d8\7\65\2\2\u02d8\u02d9\7\6\2\2\u02d9\u02da\7?\2\2\u02da\u00b9\3\2"+
		"\2\2\u02db\u02dc\7&\2\2\u02dc\u02dd\7\6\2\2\u02dd\u02de\5\u00bc_\2\u02de"+
		"\u00bb\3\2\2\2\u02df\u02e0\7?\2\2\u02e0\u00bd\3\2\2\2\u02e1\u02e2\7\25"+
		"\2\2\u02e2\u02e3\7\6\2\2\u02e3\u02e4\7?\2\2\u02e4\u00bf\3\2\2\2\u02e5"+
		"\u02e6\7\66\2\2\u02e6\u02e7\5\u00c2b\2\u02e7\u00c1\3\2\2\2\u02e8\u02e9"+
		"\5\u00c4c\2\u02e9\u02ea\7\3\2\2\u02ea\u02eb\5\u00c2b\2\u02eb\u02ee\3\2"+
		"\2\2\u02ec\u02ee\5\u00c4c\2\u02ed\u02e8\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ee"+
		"\u00c3\3\2\2\2\u02ef\u02fa\5\u00c6d\2\u02f0\u02fa\5\u00c8e\2\u02f1\u02fa"+
		"\5\u00caf\2\u02f2\u02fa\5\u00ccg\2\u02f3\u02fa\5\u00ceh\2\u02f4\u02fa"+
		"\5\u00d0i\2\u02f5\u02fa\5\u00d2j\2\u02f6\u02fa\5\u00d4k\2\u02f7\u02fa"+
		"\5\u00d6l\2\u02f8\u02fa\5\u00d8m\2\u02f9\u02ef\3\2\2\2\u02f9\u02f0\3\2"+
		"\2\2\u02f9\u02f1\3\2\2\2\u02f9\u02f2\3\2\2\2\u02f9\u02f3\3\2\2\2\u02f9"+
		"\u02f4\3\2\2\2\u02f9\u02f5\3\2\2\2\u02f9\u02f6\3\2\2\2\u02f9\u02f7\3\2"+
		"\2\2\u02f9\u02f8\3\2\2\2\u02fa\u00c5\3\2\2\2\u02fb\u02fc\7\13\2\2\u02fc"+
		"\u02fd\7\6\2\2\u02fd\u02fe\7?\2\2\u02fe\u00c7\3\2\2\2\u02ff\u0300\7\67"+
		"\2\2\u0300\u0301\7\6\2\2\u0301\u0302\7?\2\2\u0302\u00c9\3\2\2\2\u0303"+
		"\u0304\78\2\2\u0304\u0305\7\6\2\2\u0305\u0306\7?\2\2\u0306\u00cb\3\2\2"+
		"\2\u0307\u0308\79\2\2\u0308\u0309\7\6\2\2\u0309\u030a\7?\2\2\u030a\u00cd"+
		"\3\2\2\2\u030b\u030c\7:\2\2\u030c\u030d\7\6\2\2\u030d\u030e\7?\2\2\u030e"+
		"\u00cf\3\2\2\2\u030f\u0310\7;\2\2\u0310\u0311\7\6\2\2\u0311\u0312\7?\2"+
		"\2\u0312\u00d1\3\2\2\2\u0313\u0314\7<\2\2\u0314\u0315\7\6\2\2\u0315\u0316"+
		"\7?\2\2\u0316\u00d3\3\2\2\2\u0317\u0318\7=\2\2\u0318\u0319\7\6\2\2\u0319"+
		"\u031a\7?\2\2\u031a\u00d5\3\2\2\2\u031b\u031c\7\25\2\2\u031c\u031d\7\6"+
		"\2\2\u031d\u031e\7?\2\2\u031e\u00d7\3\2\2\2\u031f\u0320\7\37\2\2\u0320"+
		"\u0321\7\6\2\2\u0321\u0322\7?\2\2\u0322\u00d9\3\2\2\2\u0323\u0325\7\b"+
		"\2\2\u0324\u0326\7\t\2\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0327\3\2\2\2\u0327\u0328\7\n\2\2\u0328\u00db\3\2\2\2\u0329\u032a\7?"+
		"\2\2\u032a\u00dd\3\2\2\2 \u00e3\u00f0\u00fc\u010d\u0129\u014f\u015d\u0167"+
		"\u018e\u0190\u019b\u01a9\u01c2\u01c8\u01dd\u01f5\u0204\u0208\u020c\u0210"+
		"\u0246\u0258\u0267\u028e\u02b7\u02be\u02c5\u02ed\u02f9\u0325";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}