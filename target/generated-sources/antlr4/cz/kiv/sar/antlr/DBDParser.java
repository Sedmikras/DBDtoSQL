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
		DATASET=9, SEGM=10, FIELD=11, LCHILD=12, XDFLD=13, WS=14, String=15, Int=16, 
		Number=17, Digit=18, PARAM_WS=19, CPARAM_WS=20, PARAM_COM=21, CPARAM_RPAREN=22;
	public static final int
		RULE_source = 0, RULE_dbd = 1, RULE_params = 2, RULE_param = 3, RULE_param_name = 4, 
		RULE_value = 5, RULE_values = 6, RULE_dataset = 7, RULE_dataset_with_label = 8, 
		RULE_dataset_without_label = 9, RULE_segment = 10, RULE_segment_definition = 11, 
		RULE_field = 12, RULE_lchild = 13, RULE_xdfld = 14, RULE_end = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "dbd", "params", "param", "param_name", "value", "values", 
			"dataset", "dataset_with_label", "dataset_without_label", "segment", 
			"segment_definition", "field", "lchild", "xdfld", "end"
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
			setState(32);
			dbd();
			setState(33);
			dataset();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEGM) {
				{
				{
				setState(34);
				segment();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
			setState(42);
			match(DBD);
			setState(43);
			params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				param();
				setState(46);
				match(COM);
				setState(47);
				params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				param();
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

	public static class ParamContext extends ParserRuleContext {
		public Param_nameContext param_name() {
			return getRuleContext(Param_nameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(DBDParser.EQUAL, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			param_name();
			setState(53);
			match(EQUAL);
			setState(54);
			values();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_nameContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public Param_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterParam_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitParam_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitParam_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_nameContext param_name() throws RecognitionException {
		Param_nameContext _localctx = new Param_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(DBDParser.String, 0); }
		public TerminalNode LPAREN() { return getToken(DBDParser.LPAREN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBDParser.RPAREN, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(String);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(String);
				setState(60);
				match(LPAREN);
				setState(61);
				values();
				setState(62);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(LPAREN);
				setState(65);
				values();
				setState(66);
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

	public static class ValuesContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COM() { return getToken(DBDParser.COM, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBDParserListener ) ((DBDParserListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBDParserVisitor ) return ((DBDParserVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_values);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				value();
				setState(71);
				match(COM);
				setState(72);
				values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				value();
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
		enterRule(_localctx, 14, RULE_dataset);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATASET:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				dataset_without_label();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
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
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		enterRule(_localctx, 16, RULE_dataset_with_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(String);
			setState(82);
			match(DATASET);
			setState(83);
			params();
			}
		}
		catch (RecognitionException re) {
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
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		enterRule(_localctx, 18, RULE_dataset_without_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(DATASET);
			setState(86);
			params();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 20, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			segment_definition();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FIELD || _la==LCHILD) {
				{
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FIELD:
					{
					setState(89);
					field();
					}
					break;
				case LCHILD:
					{
					setState(90);
					lchild();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(95);
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
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		enterRule(_localctx, 22, RULE_segment_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(SEGM);
			setState(97);
			params();
			}
		}
		catch (RecognitionException re) {
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
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		enterRule(_localctx, 24, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(FIELD);
			setState(100);
			params();
			}
		}
		catch (RecognitionException re) {
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
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		enterRule(_localctx, 26, RULE_lchild);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(LCHILD);
			setState(103);
			params();
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				xdfld();
				}
				}
				setState(107); 
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

	public static class XdfldContext extends ParserRuleContext {
		public TerminalNode XDFLD() { return getToken(DBDParser.XDFLD, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		enterRule(_localctx, 28, RULE_xdfld);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(XDFLD);
			setState(110);
			params();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(DBD_GEN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINISH) {
				{
				setState(113);
				match(FINISH);
				}
			}

			setState(116);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\7\2"+
		"&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\65\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"G\n\7\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\t\3\t\5\tR\n\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\7\f^\n\f\f\f\16\fa\13\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\6\17l\n\17\r\17\16\17m\3\20\3\20\3\20\3\21\3\21\5"+
		"\21u\n\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\2\2r\2\"\3\2\2\2\4,\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\n:\3\2\2\2\f"+
		"F\3\2\2\2\16M\3\2\2\2\20Q\3\2\2\2\22S\3\2\2\2\24W\3\2\2\2\26Z\3\2\2\2"+
		"\30b\3\2\2\2\32e\3\2\2\2\34h\3\2\2\2\36o\3\2\2\2 r\3\2\2\2\"#\5\4\3\2"+
		"#\'\5\20\t\2$&\5\26\f\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3"+
		"\2\2\2)\'\3\2\2\2*+\5 \21\2+\3\3\2\2\2,-\7\7\2\2-.\5\6\4\2.\5\3\2\2\2"+
		"/\60\5\b\5\2\60\61\7\3\2\2\61\62\5\6\4\2\62\65\3\2\2\2\63\65\5\b\5\2\64"+
		"/\3\2\2\2\64\63\3\2\2\2\65\7\3\2\2\2\66\67\5\n\6\2\678\7\6\2\289\5\16"+
		"\b\29\t\3\2\2\2:;\7\21\2\2;\13\3\2\2\2<G\7\21\2\2=>\7\21\2\2>?\7\4\2\2"+
		"?@\5\16\b\2@A\7\5\2\2AG\3\2\2\2BC\7\4\2\2CD\5\16\b\2DE\7\5\2\2EG\3\2\2"+
		"\2F<\3\2\2\2F=\3\2\2\2FB\3\2\2\2G\r\3\2\2\2HI\5\f\7\2IJ\7\3\2\2JK\5\16"+
		"\b\2KN\3\2\2\2LN\5\f\7\2MH\3\2\2\2ML\3\2\2\2N\17\3\2\2\2OR\5\24\13\2P"+
		"R\5\22\n\2QO\3\2\2\2QP\3\2\2\2R\21\3\2\2\2ST\7\21\2\2TU\7\13\2\2UV\5\6"+
		"\4\2V\23\3\2\2\2WX\7\13\2\2XY\5\6\4\2Y\25\3\2\2\2Z_\5\30\r\2[^\5\32\16"+
		"\2\\^\5\34\17\2][\3\2\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\27"+
		"\3\2\2\2a_\3\2\2\2bc\7\f\2\2cd\5\6\4\2d\31\3\2\2\2ef\7\r\2\2fg\5\6\4\2"+
		"g\33\3\2\2\2hi\7\16\2\2ik\5\6\4\2jl\5\36\20\2kj\3\2\2\2lm\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2n\35\3\2\2\2op\7\17\2\2pq\5\6\4\2q\37\3\2\2\2rt\7\b\2"+
		"\2su\7\t\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\n\2\2w!\3\2\2\2\13\'\64"+
		"FMQ]_mt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}