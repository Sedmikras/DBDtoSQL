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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, String=139, Number=140, WS=141, Int=142, Digit=143;
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
			null, "'DBD '", "','", "'NAME='", "'ACCESS='", "'('", "')'", "'RMNAME='", 
			"'DBVER='", "'PASSWD='", "'EXIT=(NONE)'", "'VERSION='", "'DATXEXIT='", 
			"'ENCODING='", "'REMARKS='", "'GSAM'", "'HDAM'", "'HIDAM'", "'HISAM'", 
			"'SHISAM'", "'HSAM'", "'SHSAM'", "'INDEX'", "'LOGICAL'", "'MSDB'", "'PHDAM'", 
			"'PHIDAM'", "'PSINDEX'", "'DEDB'", "'BSAM'", "'VSAM'", "'OSAM'", "'DATASET '", 
			"'DD1='", "'SIZE='", "'BLOCK='", "'DEVICE='", "'SCAN='", "'FRSPC=('", 
			"'SEARCHA='", "'SEGM '", "'EXTERNALNAME='", "'PARENT='", "'SNGL'", "'DBLE'", 
			"'VIRTUAL'", "'PHYSICAL'", "'SOURCE=('", "'DATA'", "'BYTES='", "'FREQ='", 
			"'POINTER=('", "'PTR=('", "',LPARNT'", "',CTR'", "',PAIRED'", "'HIER'", 
			"'H'", "'HIERBWD'", "'HB'", "'TWIN'", "'T'", "'TWINBWD'", "'TB'", "'NOTWIN'", 
			"'NT'", "'LTWIN'", "'LT'", "'LTWINBWD'", "'LTB'", "'RULES=('", "'L'", 
			"'P'", "'V'", "'B'", "'LAST'", "'FIRST'", "'HERE'", "'COMPRTN=('", "'FIELD '", 
			"'SEQ'", "'U'", "'M'", "'EXTERALNAME='", "'MAXBYTES='", "'START='", "'STARTAFTER='", 
			"'RELSTART='", "'DATATYPE='", "'ARRAY'", "'BINARY'", "'BIT'", "'BYTE'", 
			"'UBYTE'", "'CHAR'", "'DATE'", "'DECIMAL('", "'DOUBLE'", "'FLOAT'", "'INT'", 
			"'UINT'", "'LONG'", "'ULONG'", "'OTHER'", "'SHORT'", "'USHORT'", "'STRUCT'", 
			"'TIME'", "'TIMESTAMP'", "'XML'", "'TYPE='", "'C'", "'X'", "'CASENAME='", 
			"'DEPENDSON='", "'MINOCCURS='", "'MAXOCCURS='", "'REDEFINES='", "'LCHILD '", 
			"'POINTER='", "'PTR='", "'NONE'", "'SYMB'", "'INDX'", "'PAIR='", "'RULES='", 
			"'XDFLD '", "'SEGMENT='", "'CONST='", "'SRCH='", "'SUBSEQ='", "'DDATA='", 
			"'NULLVAL='", "'EXTRTN='", "'DBDGEN'", "'FINISH'", "'END'", "'YES'", 
			"'NO'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "String", "Number", "WS", "Int", 
			"Digit"
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
			setState(220);
			dbd();
			setState(221);
			dataset();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
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
			setState(230);
			match(T__0);
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
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				dbd_param();
				setState(234);
				match(T__1);
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
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				dbd_name();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				dbd_access();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				dbd_rmname();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				dbd_dbver();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				dbd_passwd();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				dbd_exit();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				dbd_version();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(247);
				dbd_datxexit();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 9);
				{
				setState(248);
				dbd_encoding();
				}
				break;
			case T__13:
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(252);
			match(T__2);
			setState(253);
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
			setState(255);
			match(T__3);
			setState(256);
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__4);
				setState(259);
				access_method();
				setState(260);
				match(T__1);
				setState(261);
				operating_method();
				setState(262);
				match(T__5);
				}
				break;
			case T__14:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
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
			setState(267);
			match(T__6);
			setState(268);
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
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
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
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__4);
				setState(271);
				match(String);
				setState(272);
				match(T__1);
				setState(273);
				match(String);
				setState(274);
				match(T__1);
				setState(275);
				match(String);
				setState(276);
				match(T__1);
				setState(277);
				match(String);
				setState(278);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__4);
				setState(280);
				match(String);
				setState(281);
				match(T__1);
				setState(282);
				match(String);
				setState(283);
				match(T__1);
				setState(284);
				match(String);
				setState(285);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(T__4);
				setState(287);
				match(String);
				setState(288);
				match(T__1);
				setState(289);
				match(String);
				setState(290);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
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
			setState(294);
			match(T__7);
			setState(295);
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
			setState(297);
			match(T__8);
			setState(298);
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
			setState(300);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(302);
			match(T__10);
			setState(303);
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
			setState(305);
			match(T__11);
			setState(306);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(308);
			match(T__12);
			setState(309);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(311);
			match(T__13);
			setState(312);
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
			setState(314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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
			setState(316);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				dataset_without_label();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
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
			setState(322);
			match(String);
			setState(323);
			match(T__31);
			setState(324);
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
			setState(326);
			match(T__31);
			setState(327);
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
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				dataset_param();
				setState(330);
				match(T__1);
				setState(331);
				dataset_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
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
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				dataset_dd1();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				dataset_size();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				dataset_block();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				dataset_device();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				dataset_scan();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				dataset_frspc();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				dataset_searcha();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(343);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(346);
			match(T__32);
			setState(347);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(349);
			match(T__33);
			setState(350);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(352);
			match(T__34);
			setState(353);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(355);
			match(T__35);
			setState(356);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(358);
			match(T__36);
			setState(359);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(361);
			match(T__37);
			setState(362);
			match(String);
			setState(363);
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
			setState(365);
			match(T__38);
			setState(366);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(368);
			match(T__13);
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
			setState(371);
			segment_definition();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__78 || _la==T__117) {
				{
				setState(374);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__78:
					{
					setState(372);
					field();
					}
					break;
				case T__117:
					{
					setState(373);
					lchild();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(378);
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
			setState(379);
			match(T__39);
			setState(380);
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
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				segment_param();
				setState(383);
				match(T__1);
				setState(384);
				segment_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
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
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				segment_name();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				segment_external_name();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				segment_parent();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				segment_source();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				segment_bytes();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
				segment_freq();
				}
				break;
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 7);
				{
				setState(395);
				segment_ptr();
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 8);
				{
				setState(396);
				segment_rules();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 9);
				{
				setState(397);
				segment_exit();
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 10);
				{
				setState(398);
				segment_comprtn();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 11);
				{
				setState(399);
				segment_encoding();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 12);
				{
				setState(400);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
			setState(403);
			match(T__2);
			setState(404);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_external_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_external_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_external_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_external_name(this);
		}
	}

	public final Segment_external_nameContext segment_external_name() throws RecognitionException {
		Segment_external_nameContext _localctx = new Segment_external_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_segment_external_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__40);
			setState(407);
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
		public Segment_parent_valueContext segment_parent_value() {
			return getRuleContext(Segment_parent_valueContext.class,0);
		}
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
		enterRule(_localctx, 74, RULE_segment_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__41);
			setState(410);
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
		public Segment_parent_value_1Context segment_parent_value_1() {
			return getRuleContext(Segment_parent_value_1Context.class,0);
		}
		public Segment_parent_value_2Context segment_parent_value_2() {
			return getRuleContext(Segment_parent_value_2Context.class,0);
		}
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_parent_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_parent_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_parent_value(this);
		}
	}

	public final Segment_parent_valueContext segment_parent_value() throws RecognitionException {
		Segment_parent_valueContext _localctx = new Segment_parent_valueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_segment_parent_value);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(T__4);
				setState(413);
				segment_parent_value_1();
				setState(414);
				match(T__1);
				setState(415);
				segment_parent_value_2();
				setState(416);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(T__4);
				setState(419);
				segment_parent_value_1();
				setState(420);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
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
		public Segment_parent_type_1Context segment_parent_type_1() {
			return getRuleContext(Segment_parent_type_1Context.class,0);
		}
		public Segment_parent_value_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent_value_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_parent_value_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_parent_value_1(this);
		}
	}

	public final Segment_parent_value_1Context segment_parent_value_1() throws RecognitionException {
		Segment_parent_value_1Context _localctx = new Segment_parent_value_1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_segment_parent_value_1);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(String);
				setState(426);
				match(T__1);
				setState(427);
				segment_parent_type_1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
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
		public Segment_parent_type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_parent_type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_parent_type_1(this);
		}
	}

	public final Segment_parent_type_1Context segment_parent_type_1() throws RecognitionException {
		Segment_parent_type_1Context _localctx = new Segment_parent_type_1Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_segment_parent_type_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
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

	public static class Segment_parent_value_2Context extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public Segment_parent_type_2Context segment_parent_type_2() {
			return getRuleContext(Segment_parent_type_2Context.class,0);
		}
		public Segment_parent_value_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent_value_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_parent_value_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_parent_value_2(this);
		}
	}

	public final Segment_parent_value_2Context segment_parent_value_2() throws RecognitionException {
		Segment_parent_value_2Context _localctx = new Segment_parent_value_2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_segment_parent_value_2);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(T__4);
				setState(434);
				match(String);
				setState(435);
				match(T__1);
				setState(436);
				segment_parent_type_2();
				setState(437);
				match(T__1);
				setState(438);
				match(String);
				setState(439);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				match(T__4);
				setState(442);
				match(String);
				setState(443);
				match(T__1);
				setState(444);
				segment_parent_type_2();
				setState(445);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(T__4);
				setState(448);
				match(String);
				setState(449);
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

	public static class Segment_parent_type_2Context extends ParserRuleContext {
		public Segment_parent_type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_parent_type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_parent_type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_parent_type_2(this);
		}
	}

	public final Segment_parent_type_2Context segment_parent_type_2() throws RecognitionException {
		Segment_parent_type_2Context _localctx = new Segment_parent_type_2Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_segment_parent_type_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__45) ) {
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

	public static class Segment_sourceContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public Segment_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_source(this);
		}
	}

	public final Segment_sourceContext segment_source() throws RecognitionException {
		Segment_sourceContext _localctx = new Segment_sourceContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_segment_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__46);
			setState(455);
			match(String);
			setState(456);
			match(T__1);
			setState(457);
			match(T__47);
			setState(458);
			match(T__1);
			setState(459);
			match(String);
			setState(460);
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

	public static class Segment_bytesContext extends ParserRuleContext {
		public Segment_bytes_valueContext segment_bytes_value() {
			return getRuleContext(Segment_bytes_valueContext.class,0);
		}
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
		enterRule(_localctx, 88, RULE_segment_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__48);
			setState(463);
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
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public Segment_bytes_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_bytes_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_bytes_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_bytes_value(this);
		}
	}

	public final Segment_bytes_valueContext segment_bytes_value() throws RecognitionException {
		Segment_bytes_valueContext _localctx = new Segment_bytes_valueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_segment_bytes_value);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(T__4);
				setState(466);
				match(String);
				setState(467);
				match(T__1);
				setState(468);
				match(String);
				setState(469);
				match(T__5);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_freqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_freq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_freq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_freq(this);
		}
	}

	public final Segment_freqContext segment_freq() throws RecognitionException {
		Segment_freqContext _localctx = new Segment_freqContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_segment_freq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__49);
			setState(474);
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
		public Segment_ptr_valueContext segment_ptr_value() {
			return getRuleContext(Segment_ptr_valueContext.class,0);
		}
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
		enterRule(_localctx, 94, RULE_segment_ptr);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(T__50);
				setState(477);
				segment_ptr_value();
				setState(478);
				match(T__5);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(T__51);
				setState(481);
				segment_ptr_value();
				setState(482);
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

	public static class Segment_ptr_valueContext extends ParserRuleContext {
		public Segment_ptr_type_1Context segment_ptr_type_1() {
			return getRuleContext(Segment_ptr_type_1Context.class,0);
		}
		public Segment_ptr_type_2Context segment_ptr_type_2() {
			return getRuleContext(Segment_ptr_type_2Context.class,0);
		}
		public Segment_ptr_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_ptr_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_ptr_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_ptr_value(this);
		}
	}

	public final Segment_ptr_valueContext segment_ptr_value() throws RecognitionException {
		Segment_ptr_valueContext _localctx = new Segment_ptr_valueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_segment_ptr_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			segment_ptr_type_1();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(487);
				match(T__1);
				setState(488);
				segment_ptr_type_2();
				}
			}

			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(491);
				match(T__52);
				}
			}

			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(494);
				match(T__53);
				}
			}

			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(497);
				match(T__54);
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
		public Segment_ptr_type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_ptr_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_ptr_type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_ptr_type_1(this);
		}
	}

	public final Segment_ptr_type_1Context segment_ptr_type_1() throws RecognitionException {
		Segment_ptr_type_1Context _localctx = new Segment_ptr_type_1Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_segment_ptr_type_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (T__55 - 56)) | (1L << (T__56 - 56)) | (1L << (T__57 - 56)) | (1L << (T__58 - 56)) | (1L << (T__59 - 56)) | (1L << (T__60 - 56)) | (1L << (T__61 - 56)) | (1L << (T__62 - 56)) | (1L << (T__63 - 56)) | (1L << (T__64 - 56)))) != 0)) ) {
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

	public static class Segment_ptr_type_2Context extends ParserRuleContext {
		public Segment_ptr_type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_ptr_type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_ptr_type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_ptr_type_2(this);
		}
	}

	public final Segment_ptr_type_2Context segment_ptr_type_2() throws RecognitionException {
		Segment_ptr_type_2Context _localctx = new Segment_ptr_type_2Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_segment_ptr_type_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)))) != 0)) ) {
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

	public static class Segment_rulesContext extends ParserRuleContext {
		public Segment_rules_valueContext segment_rules_value() {
			return getRuleContext(Segment_rules_valueContext.class,0);
		}
		public Segment_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_rules(this);
		}
	}

	public final Segment_rulesContext segment_rules() throws RecognitionException {
		Segment_rulesContext _localctx = new Segment_rulesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_segment_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(T__69);
			setState(505);
			segment_rules_value();
			setState(506);
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
		public Segment_rules_type_4Context segment_rules_type_4() {
			return getRuleContext(Segment_rules_type_4Context.class,0);
		}
		public Segment_rules_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_rules_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_rules_value(this);
		}
	}

	public final Segment_rules_valueContext segment_rules_value() throws RecognitionException {
		Segment_rules_valueContext _localctx = new Segment_rules_valueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_segment_rules_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			segment_rules_type_1();
			setState(509);
			segment_rules_type_2();
			setState(510);
			segment_rules_type_3();
			setState(511);
			match(T__1);
			setState(512);
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
		public Segment_rules_type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_rules_type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_rules_type_1(this);
		}
	}

	public final Segment_rules_type_1Context segment_rules_type_1() throws RecognitionException {
		Segment_rules_type_1Context _localctx = new Segment_rules_type_1Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_segment_rules_type_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)))) != 0)) ) {
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

	public static class Segment_rules_type_2Context extends ParserRuleContext {
		public Segment_rules_type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules_type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_rules_type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_rules_type_2(this);
		}
	}

	public final Segment_rules_type_2Context segment_rules_type_2() throws RecognitionException {
		Segment_rules_type_2Context _localctx = new Segment_rules_type_2Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_segment_rules_type_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)) | (1L << (T__73 - 71)))) != 0)) ) {
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

	public static class Segment_rules_type_3Context extends ParserRuleContext {
		public Segment_rules_type_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules_type_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_rules_type_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_rules_type_3(this);
		}
	}

	public final Segment_rules_type_3Context segment_rules_type_3() throws RecognitionException {
		Segment_rules_type_3Context _localctx = new Segment_rules_type_3Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_segment_rules_type_3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)))) != 0)) ) {
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

	public static class Segment_rules_type_4Context extends ParserRuleContext {
		public Segment_rules_type_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_rules_type_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_rules_type_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_rules_type_4(this);
		}
	}

	public final Segment_rules_type_4Context segment_rules_type_4() throws RecognitionException {
		Segment_rules_type_4Context _localctx = new Segment_rules_type_4Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_segment_rules_type_4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__76 - 75)))) != 0)) ) {
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

	public static class Segment_exitContext extends ParserRuleContext {
		public Segment_exitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_exit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_exit(this);
		}
	}

	public final Segment_exitContext segment_exit() throws RecognitionException {
		Segment_exitContext _localctx = new Segment_exitContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_segment_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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

	public static class Segment_comprtnContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_comprtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_comprtn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_comprtn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_comprtn(this);
		}
	}

	public final Segment_comprtnContext segment_comprtn() throws RecognitionException {
		Segment_comprtnContext _localctx = new Segment_comprtnContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_segment_comprtn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(T__77);
			setState(525);
			match(String);
			setState(526);
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

	public static class Segment_encodingContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_encodingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_encoding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_encoding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_encoding(this);
		}
	}

	public final Segment_encodingContext segment_encoding() throws RecognitionException {
		Segment_encodingContext _localctx = new Segment_encodingContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_segment_encoding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(T__12);
			setState(529);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Segment_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterSegment_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitSegment_remarks(this);
		}
	}

	public final Segment_remarksContext segment_remarks() throws RecognitionException {
		Segment_remarksContext _localctx = new Segment_remarksContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_segment_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(T__13);
			setState(532);
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
		enterRule(_localctx, 122, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(T__78);
			setState(535);
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
		enterRule(_localctx, 124, RULE_field_params);
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				field_param();
				setState(538);
				match(T__1);
				setState(539);
				field_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
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
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_param(this);
		}
	}

	public final Field_paramContext field_param() throws RecognitionException {
		Field_paramContext _localctx = new Field_paramContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_field_param);
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				field_name();
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				field_external_name();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
				field_bytes();
				}
				break;
			case T__84:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				field_start();
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 5);
				{
				setState(548);
				field_max_bytes();
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 6);
				{
				setState(549);
				field_start_after();
				}
				break;
			case T__86:
				enterOuterAlt(_localctx, 7);
				{
				setState(550);
				field_rel_start();
				}
				break;
			case T__87:
				enterOuterAlt(_localctx, 8);
				{
				setState(551);
				field_datatype();
				}
				break;
			case T__109:
				enterOuterAlt(_localctx, 9);
				{
				setState(552);
				field_type();
				}
				break;
			case T__112:
				enterOuterAlt(_localctx, 10);
				{
				setState(553);
				field_case_name();
				}
				break;
			case T__113:
				enterOuterAlt(_localctx, 11);
				{
				setState(554);
				field_dependson();
				}
				break;
			case T__114:
				enterOuterAlt(_localctx, 12);
				{
				setState(555);
				field_min_occurs();
				}
				break;
			case T__115:
				enterOuterAlt(_localctx, 13);
				{
				setState(556);
				field_max_occurs();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 14);
				{
				setState(557);
				field_parent();
				}
				break;
			case T__116:
				enterOuterAlt(_localctx, 15);
				{
				setState(558);
				field_redefines();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 16);
				{
				setState(559);
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
		public Field_name_valueContext field_name_value() {
			return getRuleContext(Field_name_valueContext.class,0);
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
		enterRule(_localctx, 128, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(T__2);
			setState(563);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_name_value_typeContext field_name_value_type() {
			return getRuleContext(Field_name_value_typeContext.class,0);
		}
		public Field_name_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_name_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_name_value(this);
		}
	}

	public final Field_name_valueContext field_name_value() throws RecognitionException {
		Field_name_valueContext _localctx = new Field_name_valueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_field_name_value);
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(T__4);
				setState(566);
				match(String);
				setState(567);
				match(T__1);
				setState(568);
				match(T__79);
				setState(569);
				match(T__1);
				setState(570);
				field_name_value_type();
				setState(571);
				match(T__5);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
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
		public Field_name_value_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name_value_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_name_value_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_name_value_type(this);
		}
	}

	public final Field_name_value_typeContext field_name_value_type() throws RecognitionException {
		Field_name_value_typeContext _localctx = new Field_name_value_typeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_field_name_value_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==T__81) ) {
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

	public static class Field_external_nameContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_external_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_external_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_external_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_external_name(this);
		}
	}

	public final Field_external_nameContext field_external_name() throws RecognitionException {
		Field_external_nameContext _localctx = new Field_external_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_field_external_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(T__82);
			setState(579);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
		enterRule(_localctx, 136, RULE_field_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__48);
			setState(582);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_max_bytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_max_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_max_bytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_max_bytes(this);
		}
	}

	public final Field_max_bytesContext field_max_bytes() throws RecognitionException {
		Field_max_bytesContext _localctx = new Field_max_bytesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_field_max_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(T__83);
			setState(585);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
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
		enterRule(_localctx, 140, RULE_field_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T__84);
			setState(588);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_start_afterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_start_after; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_start_after(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_start_after(this);
		}
	}

	public final Field_start_afterContext field_start_after() throws RecognitionException {
		Field_start_afterContext _localctx = new Field_start_afterContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_field_start_after);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(T__85);
			setState(591);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_rel_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_rel_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_rel_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_rel_start(this);
		}
	}

	public final Field_rel_startContext field_rel_start() throws RecognitionException {
		Field_rel_startContext _localctx = new Field_rel_startContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_field_rel_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(T__86);
			setState(594);
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
		public Field_datatype_valueContext field_datatype_value() {
			return getRuleContext(Field_datatype_valueContext.class,0);
		}
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
		enterRule(_localctx, 146, RULE_field_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(T__87);
			setState(597);
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
		public Field_datatype_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_datatype_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_datatype_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_datatype_value(this);
		}
	}

	public final Field_datatype_valueContext field_datatype_value() throws RecognitionException {
		Field_datatype_valueContext _localctx = new Field_datatype_valueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_field_datatype_value);
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__88:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(T__88);
				}
				break;
			case T__89:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(T__89);
				}
				break;
			case T__90:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				match(T__90);
				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				match(T__91);
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				match(T__92);
				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				match(T__93);
				}
				break;
			case T__94:
				enterOuterAlt(_localctx, 7);
				{
				setState(605);
				match(T__94);
				}
				break;
			case T__95:
				enterOuterAlt(_localctx, 8);
				{
				setState(606);
				match(T__95);
				setState(607);
				match(String);
				setState(608);
				match(T__1);
				setState(609);
				match(String);
				setState(610);
				match(T__5);
				}
				break;
			case T__96:
				enterOuterAlt(_localctx, 9);
				{
				setState(611);
				match(T__96);
				}
				break;
			case T__97:
				enterOuterAlt(_localctx, 10);
				{
				setState(612);
				match(T__97);
				}
				break;
			case T__98:
				enterOuterAlt(_localctx, 11);
				{
				setState(613);
				match(T__98);
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 12);
				{
				setState(614);
				match(T__99);
				}
				break;
			case T__100:
				enterOuterAlt(_localctx, 13);
				{
				setState(615);
				match(T__100);
				}
				break;
			case T__101:
				enterOuterAlt(_localctx, 14);
				{
				setState(616);
				match(T__101);
				}
				break;
			case T__102:
				enterOuterAlt(_localctx, 15);
				{
				setState(617);
				match(T__102);
				}
				break;
			case T__103:
				enterOuterAlt(_localctx, 16);
				{
				setState(618);
				match(T__103);
				}
				break;
			case T__104:
				enterOuterAlt(_localctx, 17);
				{
				setState(619);
				match(T__104);
				}
				break;
			case T__105:
				enterOuterAlt(_localctx, 18);
				{
				setState(620);
				match(T__105);
				}
				break;
			case T__106:
				enterOuterAlt(_localctx, 19);
				{
				setState(621);
				match(T__106);
				}
				break;
			case T__107:
				enterOuterAlt(_localctx, 20);
				{
				setState(622);
				match(T__107);
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 21);
				{
				setState(623);
				match(T__108);
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

	public static class Field_typeContext extends ParserRuleContext {
		public Field_type_valueContext field_type_value() {
			return getRuleContext(Field_type_valueContext.class,0);
		}
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
		enterRule(_localctx, 150, RULE_field_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__109);
			setState(627);
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
		public Field_type_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_type_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_type_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_type_value(this);
		}
	}

	public final Field_type_valueContext field_type_value() throws RecognitionException {
		Field_type_valueContext _localctx = new Field_type_valueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_field_type_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__110 - 72)) | (1L << (T__111 - 72)))) != 0)) ) {
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

	public static class Field_case_nameContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_case_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_case_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_case_name(this);
		}
	}

	public final Field_case_nameContext field_case_name() throws RecognitionException {
		Field_case_nameContext _localctx = new Field_case_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_field_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(T__112);
			setState(632);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_dependsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_dependson; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_dependson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_dependson(this);
		}
	}

	public final Field_dependsonContext field_dependson() throws RecognitionException {
		Field_dependsonContext _localctx = new Field_dependsonContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_field_dependson);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(T__113);
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

	public static class Field_min_occursContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_min_occursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_min_occurs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_min_occurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_min_occurs(this);
		}
	}

	public final Field_min_occursContext field_min_occurs() throws RecognitionException {
		Field_min_occursContext _localctx = new Field_min_occursContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_field_min_occurs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(T__114);
			setState(638);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_max_occursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_max_occurs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_max_occurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_max_occurs(this);
		}
	}

	public final Field_max_occursContext field_max_occurs() throws RecognitionException {
		Field_max_occursContext _localctx = new Field_max_occursContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_field_max_occurs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(T__115);
			setState(641);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_parentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_parent(this);
		}
	}

	public final Field_parentContext field_parent() throws RecognitionException {
		Field_parentContext _localctx = new Field_parentContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_field_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(T__41);
			setState(644);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_redefinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_redefines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_redefines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_redefines(this);
		}
	}

	public final Field_redefinesContext field_redefines() throws RecognitionException {
		Field_redefinesContext _localctx = new Field_redefinesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_field_redefines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(T__116);
			setState(647);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Field_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterField_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitField_remarks(this);
		}
	}

	public final Field_remarksContext field_remarks() throws RecognitionException {
		Field_remarksContext _localctx = new Field_remarksContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_field_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(T__13);
			setState(650);
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
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild(this);
		}
	}

	public final LchildContext lchild() throws RecognitionException {
		LchildContext _localctx = new LchildContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_lchild);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(T__117);
			setState(653);
			lchild_params();
			setState(655); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(654);
				xdfld();
				}
				}
				setState(657); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__125 );
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
		public Lchild_paramsContext lchild_params() {
			return getRuleContext(Lchild_paramsContext.class,0);
		}
		public Lchild_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild_params(this);
		}
	}

	public final Lchild_paramsContext lchild_params() throws RecognitionException {
		Lchild_paramsContext _localctx = new Lchild_paramsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lchild_params);
		try {
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				lchild_param();
				setState(660);
				match(T__1);
				setState(661);
				lchild_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
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
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild_param(this);
		}
	}

	public final Lchild_paramContext lchild_param() throws RecognitionException {
		Lchild_paramContext _localctx = new Lchild_paramContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lchild_param);
		try {
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				lchild_name();
				}
				break;
			case T__118:
			case T__119:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				lchild_ptr();
				}
				break;
			case T__123:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				lchild_pair();
				}
				break;
			case T__124:
				enterOuterAlt(_localctx, 4);
				{
				setState(669);
				lchild_rules();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(670);
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
		public Lchild_name_paramsContext lchild_name_params() {
			return getRuleContext(Lchild_name_paramsContext.class,0);
		}
		public Lchild_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild_name(this);
		}
	}

	public final Lchild_nameContext lchild_name() throws RecognitionException {
		Lchild_nameContext _localctx = new Lchild_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_lchild_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(T__2);
			setState(674);
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
		public List<TerminalNode> String() { return getTokens(DBDParser.String); }
		public TerminalNode String(int i) {
			return getToken(DBDParser.String, i);
		}
		public Lchild_name_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_name_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild_name_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild_name_params(this);
		}
	}

	public final Lchild_name_paramsContext lchild_name_params() throws RecognitionException {
		Lchild_name_paramsContext _localctx = new Lchild_name_paramsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_lchild_name_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(T__4);
			setState(677);
			match(String);
			setState(678);
			match(T__1);
			setState(679);
			match(String);
			setState(680);
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

	public static class Lchild_ptrContext extends ParserRuleContext {
		public Lchild_ptr_typeContext lchild_ptr_type() {
			return getRuleContext(Lchild_ptr_typeContext.class,0);
		}
		public Lchild_ptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild_ptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild_ptr(this);
		}
	}

	public final Lchild_ptrContext lchild_ptr() throws RecognitionException {
		Lchild_ptrContext _localctx = new Lchild_ptrContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lchild_ptr);
		try {
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__118:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				match(T__118);
				setState(683);
				lchild_ptr_type();
				}
				break;
			case T__119:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(T__119);
				setState(685);
				lchild_ptr_type();
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

	public static class Lchild_ptr_typeContext extends ParserRuleContext {
		public Lchild_ptr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_ptr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild_ptr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild_ptr_type(this);
		}
	}

	public final Lchild_ptr_typeContext lchild_ptr_type() throws RecognitionException {
		Lchild_ptr_typeContext _localctx = new Lchild_ptr_typeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_lchild_ptr_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43 || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (T__120 - 121)) | (1L << (T__121 - 121)) | (1L << (T__122 - 121)))) != 0)) ) {
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

	public static class Lchild_pairContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Lchild_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild_pair(this);
		}
	}

	public final Lchild_pairContext lchild_pair() throws RecognitionException {
		Lchild_pairContext _localctx = new Lchild_pairContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_lchild_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(T__123);
			setState(691);
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
		public Lchild_rules_typeContext lchild_rules_type() {
			return getRuleContext(Lchild_rules_typeContext.class,0);
		}
		public Lchild_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild_rules(this);
		}
	}

	public final Lchild_rulesContext lchild_rules() throws RecognitionException {
		Lchild_rulesContext _localctx = new Lchild_rulesContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_lchild_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(T__124);
			setState(694);
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
		public Lchild_rules_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_rules_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild_rules_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild_rules_type(this);
		}
	}

	public final Lchild_rules_typeContext lchild_rules_type() throws RecognitionException {
		Lchild_rules_typeContext _localctx = new Lchild_rules_typeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_lchild_rules_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__76 - 75)))) != 0)) ) {
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

	public static class Lchild_remarksContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Lchild_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lchild_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterLchild_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitLchild_remarks(this);
		}
	}

	public final Lchild_remarksContext lchild_remarks() throws RecognitionException {
		Lchild_remarksContext _localctx = new Lchild_remarksContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_lchild_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(T__13);
			setState(699);
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
		public Xdfld_paramsContext xdfld_params() {
			return getRuleContext(Xdfld_paramsContext.class,0);
		}
		public XdfldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld(this);
		}
	}

	public final XdfldContext xdfld() throws RecognitionException {
		XdfldContext _localctx = new XdfldContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_xdfld);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(T__125);
			setState(702);
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
		public Xdfld_paramsContext xdfld_params() {
			return getRuleContext(Xdfld_paramsContext.class,0);
		}
		public Xdfld_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_params(this);
		}
	}

	public final Xdfld_paramsContext xdfld_params() throws RecognitionException {
		Xdfld_paramsContext _localctx = new Xdfld_paramsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_xdfld_params);
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				xdfld_param();
				setState(705);
				match(T__1);
				setState(706);
				xdfld_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
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
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_param(this);
		}
	}

	public final Xdfld_paramContext xdfld_param() throws RecognitionException {
		Xdfld_paramContext _localctx = new Xdfld_paramContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_xdfld_param);
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				xdfld_name();
				}
				break;
			case T__126:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				xdfld_segment();
				}
				break;
			case T__127:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				xdfld_const();
				}
				break;
			case T__128:
				enterOuterAlt(_localctx, 4);
				{
				setState(714);
				xdfld_srch();
				}
				break;
			case T__129:
				enterOuterAlt(_localctx, 5);
				{
				setState(715);
				xdfld_subseq();
				}
				break;
			case T__130:
				enterOuterAlt(_localctx, 6);
				{
				setState(716);
				xdfld_ddata();
				}
				break;
			case T__131:
				enterOuterAlt(_localctx, 7);
				{
				setState(717);
				xdfld_nullval();
				}
				break;
			case T__132:
				enterOuterAlt(_localctx, 8);
				{
				setState(718);
				xdfld_extrtn();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 9);
				{
				setState(719);
				xdfld_remarks();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 10);
				{
				setState(720);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_name(this);
		}
	}

	public final Xdfld_nameContext xdfld_name() throws RecognitionException {
		Xdfld_nameContext _localctx = new Xdfld_nameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_xdfld_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(T__2);
			setState(724);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_segment(this);
		}
	}

	public final Xdfld_segmentContext xdfld_segment() throws RecognitionException {
		Xdfld_segmentContext _localctx = new Xdfld_segmentContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_xdfld_segment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(T__126);
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

	public static class Xdfld_constContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_const(this);
		}
	}

	public final Xdfld_constContext xdfld_const() throws RecognitionException {
		Xdfld_constContext _localctx = new Xdfld_constContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_xdfld_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(T__127);
			setState(730);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_srchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_srch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_srch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_srch(this);
		}
	}

	public final Xdfld_srchContext xdfld_srch() throws RecognitionException {
		Xdfld_srchContext _localctx = new Xdfld_srchContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_xdfld_srch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__128);
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

	public static class Xdfld_subseqContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_subseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_subseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_subseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_subseq(this);
		}
	}

	public final Xdfld_subseqContext xdfld_subseq() throws RecognitionException {
		Xdfld_subseqContext _localctx = new Xdfld_subseqContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_xdfld_subseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(T__129);
			setState(736);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_ddataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_ddata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_ddata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_ddata(this);
		}
	}

	public final Xdfld_ddataContext xdfld_ddata() throws RecognitionException {
		Xdfld_ddataContext _localctx = new Xdfld_ddataContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_xdfld_ddata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(T__130);
			setState(739);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_nullvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_nullval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_nullval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_nullval(this);
		}
	}

	public final Xdfld_nullvalContext xdfld_nullval() throws RecognitionException {
		Xdfld_nullvalContext _localctx = new Xdfld_nullvalContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_xdfld_nullval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(T__131);
			setState(742);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_extrtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_extrtn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_extrtn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_extrtn(this);
		}
	}

	public final Xdfld_extrtnContext xdfld_extrtn() throws RecognitionException {
		Xdfld_extrtnContext _localctx = new Xdfld_extrtnContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_xdfld_extrtn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(T__132);
			setState(745);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_remarksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_remarks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_remarks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_remarks(this);
		}
	}

	public final Xdfld_remarksContext xdfld_remarks() throws RecognitionException {
		Xdfld_remarksContext _localctx = new Xdfld_remarksContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_xdfld_remarks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(T__13);
			setState(748);
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
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Xdfld_externalnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdfld_externalname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).enterXdfld_externalname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDListener ) ((DBDListener)listener).exitXdfld_externalname(this);
		}
	}

	public final Xdfld_externalnameContext xdfld_externalname() throws RecognitionException {
		Xdfld_externalnameContext _localctx = new Xdfld_externalnameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_xdfld_externalname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(T__40);
			setState(751);
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
		enterRule(_localctx, 216, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(T__133);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__134) {
				{
				setState(754);
				match(T__134);
				}
			}

			setState(757);
			match(T__135);
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
		enterRule(_localctx, 218, RULE_bool_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			_la = _input.LA(1);
			if ( !(_la==T__136 || _la==T__137) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0091\u02fc\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00fd\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u010c\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0127\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24"+
		"\u0143\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0151\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u015b\n"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\7!\u0179"+
		"\n!\f!\16!\u017c\13!\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u0186\n#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0194\n$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01aa\n(\3)\3)\3)\3)\5)\u01b0\n)\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01c5\n+\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\5/\u01da\n/\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01e7\n\61"+
		"\3\62\3\62\3\62\5\62\u01ec\n\62\3\62\5\62\u01ef\n\62\3\62\5\62\u01f2\n"+
		"\62\3\62\5\62\u01f5\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3"+
		"<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@\5@\u0221\n@\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0233\nA\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\5C\u0241\nC\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3"+
		"I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0273\nL\3M\3M\3M\3N\3N\3O\3O\3O\3"+
		"P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\6V\u0292"+
		"\nV\rV\16V\u0293\3W\3W\3W\3W\3W\5W\u029b\nW\3X\3X\3X\3X\3X\5X\u02a2\n"+
		"X\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\5[\u02b1\n[\3\\\3\\\3]\3]\3]"+
		"\3^\3^\3^\3_\3_\3`\3`\3`\3a\3a\3a\3b\3b\3b\3b\3b\5b\u02c8\nb\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\5c\u02d4\nc\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g\3g"+
		"\3h\3h\3h\3i\3i\3i\3j\3j\3j\3k\3k\3k\3l\3l\3l\3m\3m\3m\3n\3n\5n\u02f6"+
		"\nn\3n\3n\3o\3o\3o\2\2p\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\2\17\3\2\21\36\3\2\37"+
		"!\3\2-.\3\2/\60\3\2:C\3\2DG\3\2IK\3\2IL\3\2MO\3\2ST\4\2JJqr\4\2-.{}\3"+
		"\2\u008b\u008c\2\u02f5\2\u00de\3\2\2\2\4\u00e8\3\2\2\2\6\u00f0\3\2\2\2"+
		"\b\u00fc\3\2\2\2\n\u00fe\3\2\2\2\f\u0101\3\2\2\2\16\u010b\3\2\2\2\20\u010d"+
		"\3\2\2\2\22\u0126\3\2\2\2\24\u0128\3\2\2\2\26\u012b\3\2\2\2\30\u012e\3"+
		"\2\2\2\32\u0130\3\2\2\2\34\u0133\3\2\2\2\36\u0136\3\2\2\2 \u0139\3\2\2"+
		"\2\"\u013c\3\2\2\2$\u013e\3\2\2\2&\u0142\3\2\2\2(\u0144\3\2\2\2*\u0148"+
		"\3\2\2\2,\u0150\3\2\2\2.\u015a\3\2\2\2\60\u015c\3\2\2\2\62\u015f\3\2\2"+
		"\2\64\u0162\3\2\2\2\66\u0165\3\2\2\28\u0168\3\2\2\2:\u016b\3\2\2\2<\u016f"+
		"\3\2\2\2>\u0172\3\2\2\2@\u0175\3\2\2\2B\u017d\3\2\2\2D\u0185\3\2\2\2F"+
		"\u0193\3\2\2\2H\u0195\3\2\2\2J\u0198\3\2\2\2L\u019b\3\2\2\2N\u01a9\3\2"+
		"\2\2P\u01af\3\2\2\2R\u01b1\3\2\2\2T\u01c4\3\2\2\2V\u01c6\3\2\2\2X\u01c8"+
		"\3\2\2\2Z\u01d0\3\2\2\2\\\u01d9\3\2\2\2^\u01db\3\2\2\2`\u01e6\3\2\2\2"+
		"b\u01e8\3\2\2\2d\u01f6\3\2\2\2f\u01f8\3\2\2\2h\u01fa\3\2\2\2j\u01fe\3"+
		"\2\2\2l\u0204\3\2\2\2n\u0206\3\2\2\2p\u0208\3\2\2\2r\u020a\3\2\2\2t\u020c"+
		"\3\2\2\2v\u020e\3\2\2\2x\u0212\3\2\2\2z\u0215\3\2\2\2|\u0218\3\2\2\2~"+
		"\u0220\3\2\2\2\u0080\u0232\3\2\2\2\u0082\u0234\3\2\2\2\u0084\u0240\3\2"+
		"\2\2\u0086\u0242\3\2\2\2\u0088\u0244\3\2\2\2\u008a\u0247\3\2\2\2\u008c"+
		"\u024a\3\2\2\2\u008e\u024d\3\2\2\2\u0090\u0250\3\2\2\2\u0092\u0253\3\2"+
		"\2\2\u0094\u0256\3\2\2\2\u0096\u0272\3\2\2\2\u0098\u0274\3\2\2\2\u009a"+
		"\u0277\3\2\2\2\u009c\u0279\3\2\2\2\u009e\u027c\3\2\2\2\u00a0\u027f\3\2"+
		"\2\2\u00a2\u0282\3\2\2\2\u00a4\u0285\3\2\2\2\u00a6\u0288\3\2\2\2\u00a8"+
		"\u028b\3\2\2\2\u00aa\u028e\3\2\2\2\u00ac\u029a\3\2\2\2\u00ae\u02a1\3\2"+
		"\2\2\u00b0\u02a3\3\2\2\2\u00b2\u02a6\3\2\2\2\u00b4\u02b0\3\2\2\2\u00b6"+
		"\u02b2\3\2\2\2\u00b8\u02b4\3\2\2\2\u00ba\u02b7\3\2\2\2\u00bc\u02ba\3\2"+
		"\2\2\u00be\u02bc\3\2\2\2\u00c0\u02bf\3\2\2\2\u00c2\u02c7\3\2\2\2\u00c4"+
		"\u02d3\3\2\2\2\u00c6\u02d5\3\2\2\2\u00c8\u02d8\3\2\2\2\u00ca\u02db\3\2"+
		"\2\2\u00cc\u02de\3\2\2\2\u00ce\u02e1\3\2\2\2\u00d0\u02e4\3\2\2\2\u00d2"+
		"\u02e7\3\2\2\2\u00d4\u02ea\3\2\2\2\u00d6\u02ed\3\2\2\2\u00d8\u02f0\3\2"+
		"\2\2\u00da\u02f3\3\2\2\2\u00dc\u02f9\3\2\2\2\u00de\u00df\5\4\3\2\u00df"+
		"\u00e3\5&\24\2\u00e0\u00e2\5@!\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e7\5\u00dan\2\u00e7\3\3\2\2\2\u00e8\u00e9\7\3\2\2\u00e9"+
		"\u00ea\5\6\4\2\u00ea\5\3\2\2\2\u00eb\u00ec\5\b\5\2\u00ec\u00ed\7\4\2\2"+
		"\u00ed\u00ee\5\6\4\2\u00ee\u00f1\3\2\2\2\u00ef\u00f1\5\b\5\2\u00f0\u00eb"+
		"\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\7\3\2\2\2\u00f2\u00fd\5\n\6\2\u00f3"+
		"\u00fd\5\f\7\2\u00f4\u00fd\5\20\t\2\u00f5\u00fd\5\24\13\2\u00f6\u00fd"+
		"\5\26\f\2\u00f7\u00fd\5\30\r\2\u00f8\u00fd\5\32\16\2\u00f9\u00fd\5\34"+
		"\17\2\u00fa\u00fd\5\36\20\2\u00fb\u00fd\5 \21\2\u00fc\u00f2\3\2\2\2\u00fc"+
		"\u00f3\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2"+
		"\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\t\3\2\2\2\u00fe\u00ff\7\5\2\2"+
		"\u00ff\u0100\7\u008d\2\2\u0100\13\3\2\2\2\u0101\u0102\7\6\2\2\u0102\u0103"+
		"\5\16\b\2\u0103\r\3\2\2\2\u0104\u0105\7\7\2\2\u0105\u0106\5\"\22\2\u0106"+
		"\u0107\7\4\2\2\u0107\u0108\5$\23\2\u0108\u0109\7\b\2\2\u0109\u010c\3\2"+
		"\2\2\u010a\u010c\5\"\22\2\u010b\u0104\3\2\2\2\u010b\u010a\3\2\2\2\u010c"+
		"\17\3\2\2\2\u010d\u010e\7\t\2\2\u010e\u010f\5\22\n\2\u010f\21\3\2\2\2"+
		"\u0110\u0111\7\7\2\2\u0111\u0112\7\u008d\2\2\u0112\u0113\7\4\2\2\u0113"+
		"\u0114\7\u008d\2\2\u0114\u0115\7\4\2\2\u0115\u0116\7\u008d\2\2\u0116\u0117"+
		"\7\4\2\2\u0117\u0118\7\u008d\2\2\u0118\u0127\7\b\2\2\u0119\u011a\7\7\2"+
		"\2\u011a\u011b\7\u008d\2\2\u011b\u011c\7\4\2\2\u011c\u011d\7\u008d\2\2"+
		"\u011d\u011e\7\4\2\2\u011e\u011f\7\u008d\2\2\u011f\u0127\7\b\2\2\u0120"+
		"\u0121\7\7\2\2\u0121\u0122\7\u008d\2\2\u0122\u0123\7\4\2\2\u0123\u0124"+
		"\7\u008d\2\2\u0124\u0127\7\b\2\2\u0125\u0127\7\u008d\2\2\u0126\u0110\3"+
		"\2\2\2\u0126\u0119\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\23\3\2\2\2\u0128\u0129\7\n\2\2\u0129\u012a\7\u008e\2\2\u012a\25\3\2\2"+
		"\2\u012b\u012c\7\13\2\2\u012c\u012d\5\u00dco\2\u012d\27\3\2\2\2\u012e"+
		"\u012f\7\f\2\2\u012f\31\3\2\2\2\u0130\u0131\7\r\2\2\u0131\u0132\7\u008d"+
		"\2\2\u0132\33\3\2\2\2\u0133\u0134\7\16\2\2\u0134\u0135\5\u00dco\2\u0135"+
		"\35\3\2\2\2\u0136\u0137\7\17\2\2\u0137\u0138\7\u008d\2\2\u0138\37\3\2"+
		"\2\2\u0139\u013a\7\20\2\2\u013a\u013b\7\u008d\2\2\u013b!\3\2\2\2\u013c"+
		"\u013d\t\2\2\2\u013d#\3\2\2\2\u013e\u013f\t\3\2\2\u013f%\3\2\2\2\u0140"+
		"\u0143\5*\26\2\u0141\u0143\5(\25\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2"+
		"\2\2\u0143\'\3\2\2\2\u0144\u0145\7\u008d\2\2\u0145\u0146\7\"\2\2\u0146"+
		"\u0147\5,\27\2\u0147)\3\2\2\2\u0148\u0149\7\"\2\2\u0149\u014a\5,\27\2"+
		"\u014a+\3\2\2\2\u014b\u014c\5.\30\2\u014c\u014d\7\4\2\2\u014d\u014e\5"+
		",\27\2\u014e\u0151\3\2\2\2\u014f\u0151\5.\30\2\u0150\u014b\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151-\3\2\2\2\u0152\u015b\5\60\31\2\u0153\u015b\5\62\32"+
		"\2\u0154\u015b\5\64\33\2\u0155\u015b\5\66\34\2\u0156\u015b\58\35\2\u0157"+
		"\u015b\5:\36\2\u0158\u015b\5<\37\2\u0159\u015b\5> \2\u015a\u0152\3\2\2"+
		"\2\u015a\u0153\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156"+
		"\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"/\3\2\2\2\u015c\u015d\7#\2\2\u015d\u015e\7\u008d\2\2\u015e\61\3\2\2\2"+
		"\u015f\u0160\7$\2\2\u0160\u0161\7\u008d\2\2\u0161\63\3\2\2\2\u0162\u0163"+
		"\7%\2\2\u0163\u0164\7\u008d\2\2\u0164\65\3\2\2\2\u0165\u0166\7&\2\2\u0166"+
		"\u0167\7\u008d\2\2\u0167\67\3\2\2\2\u0168\u0169\7\'\2\2\u0169\u016a\7"+
		"\u008d\2\2\u016a9\3\2\2\2\u016b\u016c\7(\2\2\u016c\u016d\7\u008d\2\2\u016d"+
		"\u016e\7\b\2\2\u016e;\3\2\2\2\u016f\u0170\7)\2\2\u0170\u0171\7\u008e\2"+
		"\2\u0171=\3\2\2\2\u0172\u0173\7\20\2\2\u0173\u0174\7\u008d\2\2\u0174?"+
		"\3\2\2\2\u0175\u017a\5B\"\2\u0176\u0179\5|?\2\u0177\u0179\5\u00aaV\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017bA\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e"+
		"\7*\2\2\u017e\u017f\5D#\2\u017fC\3\2\2\2\u0180\u0181\5F$\2\u0181\u0182"+
		"\7\4\2\2\u0182\u0183\5D#\2\u0183\u0186\3\2\2\2\u0184\u0186\5F$\2\u0185"+
		"\u0180\3\2\2\2\u0185\u0184\3\2\2\2\u0186E\3\2\2\2\u0187\u0194\5H%\2\u0188"+
		"\u0194\5J&\2\u0189\u0194\5L\'\2\u018a\u0194\5X-\2\u018b\u0194\5Z.\2\u018c"+
		"\u0194\5^\60\2\u018d\u0194\5`\61\2\u018e\u0194\5h\65\2\u018f\u0194\5t"+
		";\2\u0190\u0194\5v<\2\u0191\u0194\5x=\2\u0192\u0194\5z>\2\u0193\u0187"+
		"\3\2\2\2\u0193\u0188\3\2\2\2\u0193\u0189\3\2\2\2\u0193\u018a\3\2\2\2\u0193"+
		"\u018b\3\2\2\2\u0193\u018c\3\2\2\2\u0193\u018d\3\2\2\2\u0193\u018e\3\2"+
		"\2\2\u0193\u018f\3\2\2\2\u0193\u0190\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0192\3\2\2\2\u0194G\3\2\2\2\u0195\u0196\7\5\2\2\u0196\u0197\7\u008d"+
		"\2\2\u0197I\3\2\2\2\u0198\u0199\7+\2\2\u0199\u019a\7\u008d\2\2\u019aK"+
		"\3\2\2\2\u019b\u019c\7,\2\2\u019c\u019d\5N(\2\u019dM\3\2\2\2\u019e\u019f"+
		"\7\7\2\2\u019f\u01a0\5P)\2\u01a0\u01a1\7\4\2\2\u01a1\u01a2\5T+\2\u01a2"+
		"\u01a3\7\b\2\2\u01a3\u01aa\3\2\2\2\u01a4\u01a5\7\7\2\2\u01a5\u01a6\5P"+
		")\2\u01a6\u01a7\7\b\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01aa\7\u008d\2\2\u01a9"+
		"\u019e\3\2\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aaO\3\2\2\2"+
		"\u01ab\u01ac\7\u008d\2\2\u01ac\u01ad\7\4\2\2\u01ad\u01b0\5R*\2\u01ae\u01b0"+
		"\7\u008d\2\2\u01af\u01ab\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0Q\3\2\2\2\u01b1"+
		"\u01b2\t\4\2\2\u01b2S\3\2\2\2\u01b3\u01b4\7\7\2\2\u01b4\u01b5\7\u008d"+
		"\2\2\u01b5\u01b6\7\4\2\2\u01b6\u01b7\5V,\2\u01b7\u01b8\7\4\2\2\u01b8\u01b9"+
		"\7\u008d\2\2\u01b9\u01ba\7\b\2\2\u01ba\u01c5\3\2\2\2\u01bb\u01bc\7\7\2"+
		"\2\u01bc\u01bd\7\u008d\2\2\u01bd\u01be\7\4\2\2\u01be\u01bf\5V,\2\u01bf"+
		"\u01c0\7\b\2\2\u01c0\u01c5\3\2\2\2\u01c1\u01c2\7\7\2\2\u01c2\u01c3\7\u008d"+
		"\2\2\u01c3\u01c5\7\b\2\2\u01c4\u01b3\3\2\2\2\u01c4\u01bb\3\2\2\2\u01c4"+
		"\u01c1\3\2\2\2\u01c5U\3\2\2\2\u01c6\u01c7\t\5\2\2\u01c7W\3\2\2\2\u01c8"+
		"\u01c9\7\61\2\2\u01c9\u01ca\7\u008d\2\2\u01ca\u01cb\7\4\2\2\u01cb\u01cc"+
		"\7\62\2\2\u01cc\u01cd\7\4\2\2\u01cd\u01ce\7\u008d\2\2\u01ce\u01cf\7\b"+
		"\2\2\u01cfY\3\2\2\2\u01d0\u01d1\7\63\2\2\u01d1\u01d2\5\\/\2\u01d2[\3\2"+
		"\2\2\u01d3\u01d4\7\7\2\2\u01d4\u01d5\7\u008d\2\2\u01d5\u01d6\7\4\2\2\u01d6"+
		"\u01d7\7\u008d\2\2\u01d7\u01da\7\b\2\2\u01d8\u01da\7\u008d\2\2\u01d9\u01d3"+
		"\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da]\3\2\2\2\u01db\u01dc\7\64\2\2\u01dc"+
		"\u01dd\7\u008d\2\2\u01dd_\3\2\2\2\u01de\u01df\7\65\2\2\u01df\u01e0\5b"+
		"\62\2\u01e0\u01e1\7\b\2\2\u01e1\u01e7\3\2\2\2\u01e2\u01e3\7\66\2\2\u01e3"+
		"\u01e4\5b\62\2\u01e4\u01e5\7\b\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01de\3\2"+
		"\2\2\u01e6\u01e2\3\2\2\2\u01e7a\3\2\2\2\u01e8\u01eb\5d\63\2\u01e9\u01ea"+
		"\7\4\2\2\u01ea\u01ec\5f\64\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01ef\7\67\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3"+
		"\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01f2\78\2\2\u01f1\u01f0\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\79\2\2\u01f4\u01f3\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5c\3\2\2\2\u01f6\u01f7\t\6\2\2\u01f7e\3\2"+
		"\2\2\u01f8\u01f9\t\7\2\2\u01f9g\3\2\2\2\u01fa\u01fb\7H\2\2\u01fb\u01fc"+
		"\5j\66\2\u01fc\u01fd\7\b\2\2\u01fdi\3\2\2\2\u01fe\u01ff\5l\67\2\u01ff"+
		"\u0200\5n8\2\u0200\u0201\5p9\2\u0201\u0202\7\4\2\2\u0202\u0203\5r:\2\u0203"+
		"k\3\2\2\2\u0204\u0205\t\b\2\2\u0205m\3\2\2\2\u0206\u0207\t\t\2\2\u0207"+
		"o\3\2\2\2\u0208\u0209\t\b\2\2\u0209q\3\2\2\2\u020a\u020b\t\n\2\2\u020b"+
		"s\3\2\2\2\u020c\u020d\7\f\2\2\u020du\3\2\2\2\u020e\u020f\7P\2\2\u020f"+
		"\u0210\7\u008d\2\2\u0210\u0211\7\b\2\2\u0211w\3\2\2\2\u0212\u0213\7\17"+
		"\2\2\u0213\u0214\7\u008d\2\2\u0214y\3\2\2\2\u0215\u0216\7\20\2\2\u0216"+
		"\u0217\7\u008d\2\2\u0217{\3\2\2\2\u0218\u0219\7Q\2\2\u0219\u021a\5~@\2"+
		"\u021a}\3\2\2\2\u021b\u021c\5\u0080A\2\u021c\u021d\7\4\2\2\u021d\u021e"+
		"\5~@\2\u021e\u0221\3\2\2\2\u021f\u0221\5\u0080A\2\u0220\u021b\3\2\2\2"+
		"\u0220\u021f\3\2\2\2\u0221\177\3\2\2\2\u0222\u0233\5\u0082B\2\u0223\u0233"+
		"\5\u0088E\2\u0224\u0233\5\u008aF\2\u0225\u0233\5\u008eH\2\u0226\u0233"+
		"\5\u008cG\2\u0227\u0233\5\u0090I\2\u0228\u0233\5\u0092J\2\u0229\u0233"+
		"\5\u0094K\2\u022a\u0233\5\u0098M\2\u022b\u0233\5\u009cO\2\u022c\u0233"+
		"\5\u009eP\2\u022d\u0233\5\u00a0Q\2\u022e\u0233\5\u00a2R\2\u022f\u0233"+
		"\5\u00a4S\2\u0230\u0233\5\u00a6T\2\u0231\u0233\5\u00a8U\2\u0232\u0222"+
		"\3\2\2\2\u0232\u0223\3\2\2\2\u0232\u0224\3\2\2\2\u0232\u0225\3\2\2\2\u0232"+
		"\u0226\3\2\2\2\u0232\u0227\3\2\2\2\u0232\u0228\3\2\2\2\u0232\u0229\3\2"+
		"\2\2\u0232\u022a\3\2\2\2\u0232\u022b\3\2\2\2\u0232\u022c\3\2\2\2\u0232"+
		"\u022d\3\2\2\2\u0232\u022e\3\2\2\2\u0232\u022f\3\2\2\2\u0232\u0230\3\2"+
		"\2\2\u0232\u0231\3\2\2\2\u0233\u0081\3\2\2\2\u0234\u0235\7\5\2\2\u0235"+
		"\u0236\5\u0084C\2\u0236\u0083\3\2\2\2\u0237\u0238\7\7\2\2\u0238\u0239"+
		"\7\u008d\2\2\u0239\u023a\7\4\2\2\u023a\u023b\7R\2\2\u023b\u023c\7\4\2"+
		"\2\u023c\u023d\5\u0086D\2\u023d\u023e\7\b\2\2\u023e\u0241\3\2\2\2\u023f"+
		"\u0241\7\u008d\2\2\u0240\u0237\3\2\2\2\u0240\u023f\3\2\2\2\u0241\u0085"+
		"\3\2\2\2\u0242\u0243\t\13\2\2\u0243\u0087\3\2\2\2\u0244\u0245\7U\2\2\u0245"+
		"\u0246\7\u008d\2\2\u0246\u0089\3\2\2\2\u0247\u0248\7\63\2\2\u0248\u0249"+
		"\7\u008d\2\2\u0249\u008b\3\2\2\2\u024a\u024b\7V\2\2\u024b\u024c\7\u008d"+
		"\2\2\u024c\u008d\3\2\2\2\u024d\u024e\7W\2\2\u024e\u024f\7\u008d\2\2\u024f"+
		"\u008f\3\2\2\2\u0250\u0251\7X\2\2\u0251\u0252\7\u008d\2\2\u0252\u0091"+
		"\3\2\2\2\u0253\u0254\7Y\2\2\u0254\u0255\7\u008d\2\2\u0255\u0093\3\2\2"+
		"\2\u0256\u0257\7Z\2\2\u0257\u0258\5\u0096L\2\u0258\u0095\3\2\2\2\u0259"+
		"\u0273\7[\2\2\u025a\u0273\7\\\2\2\u025b\u0273\7]\2\2\u025c\u0273\7^\2"+
		"\2\u025d\u0273\7_\2\2\u025e\u0273\7`\2\2\u025f\u0273\7a\2\2\u0260\u0261"+
		"\7b\2\2\u0261\u0262\7\u008d\2\2\u0262\u0263\7\4\2\2\u0263\u0264\7\u008d"+
		"\2\2\u0264\u0273\7\b\2\2\u0265\u0273\7c\2\2\u0266\u0273\7d\2\2\u0267\u0273"+
		"\7e\2\2\u0268\u0273\7f\2\2\u0269\u0273\7g\2\2\u026a\u0273\7h\2\2\u026b"+
		"\u0273\7i\2\2\u026c\u0273\7j\2\2\u026d\u0273\7k\2\2\u026e\u0273\7l\2\2"+
		"\u026f\u0273\7m\2\2\u0270\u0273\7n\2\2\u0271\u0273\7o\2\2\u0272\u0259"+
		"\3\2\2\2\u0272\u025a\3\2\2\2\u0272\u025b\3\2\2\2\u0272\u025c\3\2\2\2\u0272"+
		"\u025d\3\2\2\2\u0272\u025e\3\2\2\2\u0272\u025f\3\2\2\2\u0272\u0260\3\2"+
		"\2\2\u0272\u0265\3\2\2\2\u0272\u0266\3\2\2\2\u0272\u0267\3\2\2\2\u0272"+
		"\u0268\3\2\2\2\u0272\u0269\3\2\2\2\u0272\u026a\3\2\2\2\u0272\u026b\3\2"+
		"\2\2\u0272\u026c\3\2\2\2\u0272\u026d\3\2\2\2\u0272\u026e\3\2\2\2\u0272"+
		"\u026f\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273\u0097\3\2"+
		"\2\2\u0274\u0275\7p\2\2\u0275\u0276\5\u009aN\2\u0276\u0099\3\2\2\2\u0277"+
		"\u0278\t\f\2\2\u0278\u009b\3\2\2\2\u0279\u027a\7s\2\2\u027a\u027b\7\u008d"+
		"\2\2\u027b\u009d\3\2\2\2\u027c\u027d\7t\2\2\u027d\u027e\7\u008d\2\2\u027e"+
		"\u009f\3\2\2\2\u027f\u0280\7u\2\2\u0280\u0281\7\u008d\2\2\u0281\u00a1"+
		"\3\2\2\2\u0282\u0283\7v\2\2\u0283\u0284\7\u008d\2\2\u0284\u00a3\3\2\2"+
		"\2\u0285\u0286\7,\2\2\u0286\u0287\7\u008d\2\2\u0287\u00a5\3\2\2\2\u0288"+
		"\u0289\7w\2\2\u0289\u028a\7\u008d\2\2\u028a\u00a7\3\2\2\2\u028b\u028c"+
		"\7\20\2\2\u028c\u028d\7\u008d\2\2\u028d\u00a9\3\2\2\2\u028e\u028f\7x\2"+
		"\2\u028f\u0291\5\u00acW\2\u0290\u0292\5\u00c0a\2\u0291\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u00ab\3\2"+
		"\2\2\u0295\u0296\5\u00aeX\2\u0296\u0297\7\4\2\2\u0297\u0298\5\u00acW\2"+
		"\u0298\u029b\3\2\2\2\u0299\u029b\5\u00aeX\2\u029a\u0295\3\2\2\2\u029a"+
		"\u0299\3\2\2\2\u029b\u00ad\3\2\2\2\u029c\u02a2\5\u00b0Y\2\u029d\u02a2"+
		"\5\u00b4[\2\u029e\u02a2\5\u00b8]\2\u029f\u02a2\5\u00ba^\2\u02a0\u02a2"+
		"\5\u00be`\2\u02a1\u029c\3\2\2\2\u02a1\u029d\3\2\2\2\u02a1\u029e\3\2\2"+
		"\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u00af\3\2\2\2\u02a3\u02a4"+
		"\7\5\2\2\u02a4\u02a5\5\u00b2Z\2\u02a5\u00b1\3\2\2\2\u02a6\u02a7\7\7\2"+
		"\2\u02a7\u02a8\7\u008d\2\2\u02a8\u02a9\7\4\2\2\u02a9\u02aa\7\u008d\2\2"+
		"\u02aa\u02ab\7\b\2\2\u02ab\u00b3\3\2\2\2\u02ac\u02ad\7y\2\2\u02ad\u02b1"+
		"\5\u00b6\\\2\u02ae\u02af\7z\2\2\u02af\u02b1\5\u00b6\\\2\u02b0\u02ac\3"+
		"\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u00b5\3\2\2\2\u02b2\u02b3\t\r\2\2\u02b3"+
		"\u00b7\3\2\2\2\u02b4\u02b5\7~\2\2\u02b5\u02b6\7\u008d\2\2\u02b6\u00b9"+
		"\3\2\2\2\u02b7\u02b8\7\177\2\2\u02b8\u02b9\5\u00bc_\2\u02b9\u00bb\3\2"+
		"\2\2\u02ba\u02bb\t\n\2\2\u02bb\u00bd\3\2\2\2\u02bc\u02bd\7\20\2\2\u02bd"+
		"\u02be\7\u008d\2\2\u02be\u00bf\3\2\2\2\u02bf\u02c0\7\u0080\2\2\u02c0\u02c1"+
		"\5\u00c2b\2\u02c1\u00c1\3\2\2\2\u02c2\u02c3\5\u00c4c\2\u02c3\u02c4\7\4"+
		"\2\2\u02c4\u02c5\5\u00c2b\2\u02c5\u02c8\3\2\2\2\u02c6\u02c8\5\u00c4c\2"+
		"\u02c7\u02c2\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8\u00c3\3\2\2\2\u02c9\u02d4"+
		"\5\u00c6d\2\u02ca\u02d4\5\u00c8e\2\u02cb\u02d4\5\u00caf\2\u02cc\u02d4"+
		"\5\u00ccg\2\u02cd\u02d4\5\u00ceh\2\u02ce\u02d4\5\u00d0i\2\u02cf\u02d4"+
		"\5\u00d2j\2\u02d0\u02d4\5\u00d4k\2\u02d1\u02d4\5\u00d6l\2\u02d2\u02d4"+
		"\5\u00d8m\2\u02d3\u02c9\3\2\2\2\u02d3\u02ca\3\2\2\2\u02d3\u02cb\3\2\2"+
		"\2\u02d3\u02cc\3\2\2\2\u02d3\u02cd\3\2\2\2\u02d3\u02ce\3\2\2\2\u02d3\u02cf"+
		"\3\2\2\2\u02d3\u02d0\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"\u00c5\3\2\2\2\u02d5\u02d6\7\5\2\2\u02d6\u02d7\7\u008d\2\2\u02d7\u00c7"+
		"\3\2\2\2\u02d8\u02d9\7\u0081\2\2\u02d9\u02da\7\u008d\2\2\u02da\u00c9\3"+
		"\2\2\2\u02db\u02dc\7\u0082\2\2\u02dc\u02dd\7\u008d\2\2\u02dd\u00cb\3\2"+
		"\2\2\u02de\u02df\7\u0083\2\2\u02df\u02e0\7\u008d\2\2\u02e0\u00cd\3\2\2"+
		"\2\u02e1\u02e2\7\u0084\2\2\u02e2\u02e3\7\u008d\2\2\u02e3\u00cf\3\2\2\2"+
		"\u02e4\u02e5\7\u0085\2\2\u02e5\u02e6\7\u008d\2\2\u02e6\u00d1\3\2\2\2\u02e7"+
		"\u02e8\7\u0086\2\2\u02e8\u02e9\7\u008d\2\2\u02e9\u00d3\3\2\2\2\u02ea\u02eb"+
		"\7\u0087\2\2\u02eb\u02ec\7\u008d\2\2\u02ec\u00d5\3\2\2\2\u02ed\u02ee\7"+
		"\20\2\2\u02ee\u02ef\7\u008d\2\2\u02ef\u00d7\3\2\2\2\u02f0\u02f1\7+\2\2"+
		"\u02f1\u02f2\7\u008d\2\2\u02f2\u00d9\3\2\2\2\u02f3\u02f5\7\u0088\2\2\u02f4"+
		"\u02f6\7\u0089\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7"+
		"\3\2\2\2\u02f7\u02f8\7\u008a\2\2\u02f8\u00db\3\2\2\2\u02f9\u02fa\t\16"+
		"\2\2\u02fa\u00dd\3\2\2\2\"\u00e3\u00f0\u00fc\u010b\u0126\u0142\u0150\u015a"+
		"\u0178\u017a\u0185\u0193\u01a9\u01af\u01c4\u01d9\u01e6\u01eb\u01ee\u01f1"+
		"\u01f4\u0220\u0232\u0240\u0272\u0293\u029a\u02a1\u02b0\u02c7\u02d3\u02f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}