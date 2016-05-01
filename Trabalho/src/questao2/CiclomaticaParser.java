// Generated from Ciclomatica.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CiclomaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, ID=28, INT=29, NEWLINE=30, WS=31;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_whileblock = 2, RULE_ifblock = 3, RULE_elseifblock = 4, 
		RULE_catches = 5, RULE_catchClause = 6, RULE_forControl = 7, RULE_forInit = 8, 
		RULE_forExpression = 9, RULE_forUpdate = 10, RULE_parExpression = 11, 
		RULE_switchLabel = 12, RULE_switchBlock = 13, RULE_switchBlockStatementGroup = 14, 
		RULE_blockStatement = 15, RULE_block = 16, RULE_condition = 17, RULE_expr = 18, 
		RULE_ifexpr = 19, RULE_expression = 20, RULE_expressionList = 21;
	public static final String[] ruleNames = {
		"prog", "stat", "whileblock", "ifblock", "elseifblock", "catches", "catchClause", 
		"forControl", "forInit", "forExpression", "forUpdate", "parExpression", 
		"switchLabel", "switchBlock", "switchBlockStatementGroup", "blockStatement", 
		"block", "condition", "expr", "ifexpr", "expression", "expressionList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'while'", "'('", "')'", "'if'", "'else if'", "'for'", "'do'", "';'", 
		"'try'", "'finally'", "'switch'", "'='", "'{'", "'}'", "'catch'", "'case'", 
		"':'", "'default'", "'['", "']'", "'<'", "'>'", "'>='", "'<='", "'++'", 
		"'--'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "INT", "NEWLINE", "WS"
	};
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
	public String getGrammarFileName() { return "Ciclomatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CiclomaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				stat();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public WhileblockContext whileblock() {
			return getRuleContext(WhileblockContext.class,0);
		}
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public ElseifblockContext elseifblock() {
			return getRuleContext(ElseifblockContext.class,0);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public TerminalNode INT() { return getToken(CiclomaticaParser.INT, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode ID() { return getToken(CiclomaticaParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(CiclomaticaParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__0);
				setState(50);
				match(T__1);
				setState(51);
				expr();
				setState(52);
				match(T__2);
				setState(53);
				stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				whileblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T__3);
				setState(57);
				match(T__1);
				setState(58);
				ifexpr();
				setState(59);
				match(T__2);
				setState(60);
				stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(T__3);
				setState(63);
				match(T__1);
				setState(64);
				ifexpr();
				setState(65);
				match(T__2);
				setState(66);
				ifblock();
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(67);
					stat();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				match(T__4);
				setState(71);
				match(T__1);
				setState(72);
				expr();
				setState(73);
				match(T__2);
				setState(74);
				stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				elseifblock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				match(T__5);
				setState(78);
				match(T__1);
				setState(79);
				forControl();
				setState(80);
				match(T__2);
				setState(81);
				stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				match(T__6);
				setState(84);
				stat();
				setState(85);
				match(T__0);
				setState(86);
				parExpression();
				setState(87);
				match(T__7);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				match(T__8);
				setState(90);
				block();
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(91);
					catches();
					setState(92);
					match(T__9);
					setState(93);
					block();
					}
					break;
				case 2:
					{
					setState(95);
					catches();
					}
					break;
				case 3:
					{
					setState(96);
					match(T__9);
					setState(97);
					block();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				match(T__10);
				setState(101);
				match(T__1);
				setState(102);
				match(INT);
				setState(103);
				match(T__2);
				setState(104);
				switchBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(105);
				match(ID);
				setState(106);
				match(T__1);
				setState(107);
				match(T__2);
				setState(108);
				match(T__7);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(109);
				match(NEWLINE);
				setState(110);
				match(ID);
				setState(111);
				match(T__1);
				setState(112);
				match(T__2);
				setState(113);
				match(T__7);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(114);
				expr();
				setState(115);
				match(NEWLINE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(117);
				match(ID);
				setState(118);
				match(T__11);
				setState(119);
				expr();
				setState(120);
				match(NEWLINE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(122);
				match(NEWLINE);
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

	public static class WhileblockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitWhileblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileblockContext whileblock() throws RecognitionException {
		WhileblockContext _localctx = new WhileblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whileblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__12);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(126);
				stat();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfblockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitIfblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__12);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(135);
				stat();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifblockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElseifblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitElseifblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifblockContext elseifblock() throws RecognitionException {
		ElseifblockContext _localctx = new ElseifblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__12);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(144);
				stat();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			catchClause();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(153);
				catchClause();
				}
				}
				setState(158);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__14);
			setState(160);
			match(T__1);
			setState(161);
			expr();
			setState(162);
			match(T__2);
			setState(163);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(165);
				forInit();
				}
			}

			setState(168);
			match(T__7);
			setState(170);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(169);
				forExpression();
				}
			}

			setState(172);
			match(T__7);
			setState(174);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(173);
				forUpdate();
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

	public static class ForInitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CiclomaticaParser.ID, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ID);
			setState(177);
			match(T__11);
			setState(178);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CiclomaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CiclomaticaParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT() { return getToken(CiclomaticaParser.INT, 0); }
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forExpression);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ID);
				setState(181);
				expression(0);
				setState(182);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(ID);
				setState(185);
				expression(0);
				setState(186);
				match(INT);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CiclomaticaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ID);
			setState(191);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__1);
			setState(194);
			expr();
			setState(195);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CiclomaticaParser.INT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switchLabel);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__15);
				setState(198);
				match(INT);
				setState(199);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__17);
				setState(201);
				match(T__16);
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__12);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==T__17) {
				{
				{
				setState(211);
				switchLabel();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(219);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(224);
				blockStatement();
				}
				}
				setState(229);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			stat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__12);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(233);
				stat();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CiclomaticaParser.INT, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CiclomaticaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(CiclomaticaParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		try {
			setState(253);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(ID);
				setState(244);
				match(T__18);
				setState(245);
				expr();
				setState(246);
				match(T__19);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__1);
				setState(249);
				expr();
				setState(250);
				match(T__2);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(INT);
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

	public static class IfexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CiclomaticaParser.ID, 0); }
		public TerminalNode INT() { return getToken(CiclomaticaParser.INT, 0); }
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitIfexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifexpr);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(ID);
				setState(256);
				match(T__20);
				setState(257);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(ID);
				setState(259);
				match(T__21);
				setState(260);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(ID);
				setState(262);
				match(T__22);
				setState(263);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				match(ID);
				setState(265);
				match(T__23);
				setState(266);
				match(INT);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(293);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(278);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(271);
							match(T__20);
							setState(272);
							match(T__20);
							}
							break;
						case 2:
							{
							setState(273);
							match(T__21);
							setState(274);
							match(T__21);
							setState(275);
							match(T__21);
							}
							break;
						case 3:
							{
							setState(276);
							match(T__21);
							setState(277);
							match(T__21);
							}
							break;
						}
						setState(280);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(288);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(282);
							match(T__20);
							setState(283);
							match(T__11);
							}
							break;
						case 2:
							{
							setState(284);
							match(T__21);
							setState(285);
							match(T__11);
							}
							break;
						case 3:
							{
							setState(286);
							match(T__21);
							}
							break;
						case 4:
							{
							setState(287);
							match(T__20);
							}
							break;
						}
						setState(290);
						expression(2);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			expression(0);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(299);
				match(T__26);
				setState(300);
				expression(0);
				}
				}
				setState(305);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0135\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"e\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3~\n\3\3\4\3\4\7\4\u0082\n\4\f\4\16\4\u0085"+
		"\13\4\3\4\3\4\3\5\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\5\3\5\3\6\3"+
		"\6\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\7\3\7\7\7\u009d\n\7\f\7"+
		"\16\7\u00a0\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\5\t\u00a9\n\t\3\t\3\t\5\t"+
		"\u00ad\n\t\3\t\3\t\5\t\u00b1\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00bf\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00cd\n\16\3\17\3\17\7\17\u00d1\n\17\f\17\16\17"+
		"\u00d4\13\17\3\17\7\17\u00d7\n\17\f\17\16\17\u00da\13\17\3\17\3\17\3\20"+
		"\6\20\u00df\n\20\r\20\16\20\u00e0\3\20\7\20\u00e4\n\20\f\20\16\20\u00e7"+
		"\13\20\3\21\3\21\3\22\3\22\7\22\u00ed\n\22\f\22\16\22\u00f0\13\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0100\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u010e\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0119"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0123\n\26\3\26\3\26"+
		"\3\26\7\26\u0128\n\26\f\26\16\26\u012b\13\26\3\27\3\27\3\27\7\27\u0130"+
		"\n\27\f\27\16\27\u0133\13\27\3\27\2\3*\30\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,\2\3\3\2\33\34\u014c\2/\3\2\2\2\4}\3\2\2\2\6\177\3\2"+
		"\2\2\b\u0088\3\2\2\2\n\u0091\3\2\2\2\f\u009a\3\2\2\2\16\u00a1\3\2\2\2"+
		"\20\u00a8\3\2\2\2\22\u00b2\3\2\2\2\24\u00be\3\2\2\2\26\u00c0\3\2\2\2\30"+
		"\u00c3\3\2\2\2\32\u00cc\3\2\2\2\34\u00ce\3\2\2\2\36\u00de\3\2\2\2 \u00e8"+
		"\3\2\2\2\"\u00ea\3\2\2\2$\u00f3\3\2\2\2&\u00ff\3\2\2\2(\u010d\3\2\2\2"+
		"*\u010f\3\2\2\2,\u012c\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\61\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\64\7\3\2\2\64\65\7\4\2\2\65\66"+
		"\5&\24\2\66\67\7\5\2\2\678\5\4\3\28~\3\2\2\29~\5\6\4\2:;\7\6\2\2;<\7\4"+
		"\2\2<=\5(\25\2=>\7\5\2\2>?\5\4\3\2?~\3\2\2\2@A\7\6\2\2AB\7\4\2\2BC\5("+
		"\25\2CD\7\5\2\2DF\5\b\5\2EG\5\4\3\2FE\3\2\2\2FG\3\2\2\2G~\3\2\2\2HI\7"+
		"\7\2\2IJ\7\4\2\2JK\5&\24\2KL\7\5\2\2LM\5\4\3\2M~\3\2\2\2N~\5\n\6\2OP\7"+
		"\b\2\2PQ\7\4\2\2QR\5\20\t\2RS\7\5\2\2ST\5\4\3\2T~\3\2\2\2UV\7\t\2\2VW"+
		"\5\4\3\2WX\7\3\2\2XY\5\30\r\2YZ\7\n\2\2Z~\3\2\2\2[\\\7\13\2\2\\d\5\"\22"+
		"\2]^\5\f\7\2^_\7\f\2\2_`\5\"\22\2`e\3\2\2\2ae\5\f\7\2bc\7\f\2\2ce\5\""+
		"\22\2d]\3\2\2\2da\3\2\2\2db\3\2\2\2e~\3\2\2\2fg\7\r\2\2gh\7\4\2\2hi\7"+
		"\37\2\2ij\7\5\2\2j~\5\34\17\2kl\7\36\2\2lm\7\4\2\2mn\7\5\2\2n~\7\n\2\2"+
		"op\7 \2\2pq\7\36\2\2qr\7\4\2\2rs\7\5\2\2s~\7\n\2\2tu\5&\24\2uv\7 \2\2"+
		"v~\3\2\2\2wx\7\36\2\2xy\7\16\2\2yz\5&\24\2z{\7 \2\2{~\3\2\2\2|~\7 \2\2"+
		"}\63\3\2\2\2}9\3\2\2\2}:\3\2\2\2}@\3\2\2\2}H\3\2\2\2}N\3\2\2\2}O\3\2\2"+
		"\2}U\3\2\2\2}[\3\2\2\2}f\3\2\2\2}k\3\2\2\2}o\3\2\2\2}t\3\2\2\2}w\3\2\2"+
		"\2}|\3\2\2\2~\5\3\2\2\2\177\u0083\7\17\2\2\u0080\u0082\5\4\3\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\20\2\2\u0087\7\3\2\2"+
		"\2\u0088\u008c\7\17\2\2\u0089\u008b\5\4\3\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\20\2\2\u0090\t\3\2\2\2\u0091\u0095"+
		"\7\17\2\2\u0092\u0094\5\4\3\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\7\20\2\2\u0099\13\3\2\2\2\u009a\u009e\5\16\b\2\u009b"+
		"\u009d\5\16\b\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\r\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2"+
		"\7\21\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\5&\24\2\u00a4\u00a5\7\5\2\2"+
		"\u00a5\u00a6\5\"\22\2\u00a6\17\3\2\2\2\u00a7\u00a9\5\22\n\2\u00a8\u00a7"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\7\n\2\2\u00ab"+
		"\u00ad\5\24\13\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\u00b0\7\n\2\2\u00af\u00b1\5\26\f\2\u00b0\u00af\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b3\7\36\2\2\u00b3\u00b4\7\16"+
		"\2\2\u00b4\u00b5\5$\23\2\u00b5\23\3\2\2\2\u00b6\u00b7\7\36\2\2\u00b7\u00b8"+
		"\5*\26\2\u00b8\u00b9\7\36\2\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\7\36\2\2"+
		"\u00bb\u00bc\5*\26\2\u00bc\u00bd\7\37\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b6"+
		"\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\25\3\2\2\2\u00c0\u00c1\7\36\2\2\u00c1"+
		"\u00c2\5*\26\2\u00c2\27\3\2\2\2\u00c3\u00c4\7\4\2\2\u00c4\u00c5\5&\24"+
		"\2\u00c5\u00c6\7\5\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\7\22\2\2\u00c8\u00c9"+
		"\7\37\2\2\u00c9\u00cd\7\23\2\2\u00ca\u00cb\7\24\2\2\u00cb\u00cd\7\23\2"+
		"\2\u00cc\u00c7\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\33\3\2\2\2\u00ce\u00d2"+
		"\7\17\2\2\u00cf\u00d1\5\36\20\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2"+
		"\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d7\5\32\16\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00dc\7\20\2\2\u00dc\35\3\2\2\2\u00dd\u00df\5\32\16\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e4\5 \21\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\37\3\2\2"+
		"\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5\4\3\2\u00e9!\3\2\2\2\u00ea\u00ee"+
		"\7\17\2\2\u00eb\u00ed\5\4\3\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f2\7\20\2\2\u00f2#\3\2\2\2\u00f3\u00f4\7\37\2\2\u00f4"+
		"%\3\2\2\2\u00f5\u00f6\7\36\2\2\u00f6\u00f7\7\25\2\2\u00f7\u00f8\5&\24"+
		"\2\u00f8\u00f9\7\26\2\2\u00f9\u0100\3\2\2\2\u00fa\u00fb\7\4\2\2\u00fb"+
		"\u00fc\5&\24\2\u00fc\u00fd\7\5\2\2\u00fd\u0100\3\2\2\2\u00fe\u0100\7\37"+
		"\2\2\u00ff\u00f5\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\'\3\2\2\2\u0101\u0102\7\36\2\2\u0102\u0103\7\27\2\2\u0103\u010e\7\37"+
		"\2\2\u0104\u0105\7\36\2\2\u0105\u0106\7\30\2\2\u0106\u010e\7\37\2\2\u0107"+
		"\u0108\7\36\2\2\u0108\u0109\7\31\2\2\u0109\u010e\7\37\2\2\u010a\u010b"+
		"\7\36\2\2\u010b\u010c\7\32\2\2\u010c\u010e\7\37\2\2\u010d\u0101\3\2\2"+
		"\2\u010d\u0104\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u010a\3\2\2\2\u010e)"+
		"\3\2\2\2\u010f\u0129\b\26\1\2\u0110\u0118\f\4\2\2\u0111\u0112\7\27\2\2"+
		"\u0112\u0119\7\27\2\2\u0113\u0114\7\30\2\2\u0114\u0115\7\30\2\2\u0115"+
		"\u0119\7\30\2\2\u0116\u0117\7\30\2\2\u0117\u0119\7\30\2\2\u0118\u0111"+
		"\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0128\5*\26\5\u011b\u0122\f\3\2\2\u011c\u011d\7\27\2\2\u011d\u0123\7"+
		"\16\2\2\u011e\u011f\7\30\2\2\u011f\u0123\7\16\2\2\u0120\u0123\7\30\2\2"+
		"\u0121\u0123\7\27\2\2\u0122\u011c\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0128\5*\26\4\u0125"+
		"\u0126\f\5\2\2\u0126\u0128\t\2\2\2\u0127\u0110\3\2\2\2\u0127\u011b\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a+\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0131\5*\26\2"+
		"\u012d\u012e\7\35\2\2\u012e\u0130\5*\26\2\u012f\u012d\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132-\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\33\61Fd}\u0083\u008c\u0095\u009e\u00a8\u00ac\u00b0\u00be"+
		"\u00cc\u00d2\u00d8\u00e0\u00e5\u00ee\u00ff\u010d\u0118\u0122\u0127\u0129"+
		"\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}