// Generated from questao2/Ciclomatica.g4 by ANTLR 4.5.3
package questao2;
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, ID=30, INT=31, NEWLINE=32, 
		WS=33;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_ternaryBlock = 2, RULE_whileblock = 3, 
		RULE_ifblock = 4, RULE_elseifblock = 5, RULE_catches = 6, RULE_catchClause = 7, 
		RULE_forControl = 8, RULE_forInit = 9, RULE_forExpression = 10, RULE_forUpdate = 11, 
		RULE_parExpression = 12, RULE_switchLabel = 13, RULE_switchBlock = 14, 
		RULE_switchBlockStatementGroup = 15, RULE_blockStatement = 16, RULE_block = 17, 
		RULE_condition = 18, RULE_expr = 19, RULE_ifexpr = 20, RULE_expression = 21, 
		RULE_expressionList = 22;
	public static final String[] ruleNames = {
		"prog", "stat", "ternaryBlock", "whileblock", "ifblock", "elseifblock", 
		"catches", "catchClause", "forControl", "forInit", "forExpression", "forUpdate", 
		"parExpression", "switchLabel", "switchBlock", "switchBlockStatementGroup", 
		"blockStatement", "block", "condition", "expr", "ifexpr", "expression", 
		"expressionList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'while'", "'('", "')'", "'?'", "'if'", "'else if'", "'for'", "'do'", 
		"';'", "'try'", "'finally'", "'switch'", "'='", "' : '", "'{'", "'}'", 
		"'catch'", "'case'", "':'", "'default'", "'['", "']'", "'<'", "'>'", "'>='", 
		"'<='", "'++'", "'--'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ID", "INT", "NEWLINE", "WS"
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
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				stat();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public WhileblockContext whileblock() {
			return getRuleContext(WhileblockContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public TernaryBlockContext ternaryBlock() {
			return getRuleContext(TernaryBlockContext.class,0);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(T__0);
				setState(52);
				match(T__1);
				setState(53);
				expr();
				setState(54);
				match(T__2);
				setState(55);
				whileblock();
				setState(56);
				stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				ifexpr();
				setState(59);
				match(T__3);
				setState(60);
				ternaryBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(T__4);
				setState(63);
				match(T__1);
				setState(64);
				ifexpr();
				setState(65);
				match(T__2);
				setState(66);
				stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(T__4);
				setState(69);
				match(T__1);
				setState(70);
				ifexpr();
				setState(71);
				match(T__2);
				setState(72);
				ifblock();
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(73);
					stat();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(T__5);
				setState(77);
				match(T__1);
				setState(78);
				expr();
				setState(79);
				match(T__2);
				setState(80);
				elseifblock();
				setState(81);
				stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				match(T__6);
				setState(84);
				match(T__1);
				setState(85);
				forControl();
				setState(86);
				match(T__2);
				setState(87);
				stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				match(T__7);
				setState(90);
				stat();
				setState(91);
				match(T__0);
				setState(92);
				parExpression();
				setState(93);
				match(T__8);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				match(T__9);
				setState(96);
				block();
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(97);
					catches();
					setState(98);
					match(T__10);
					setState(99);
					block();
					}
					break;
				case 2:
					{
					setState(101);
					catches();
					}
					break;
				case 3:
					{
					setState(102);
					match(T__10);
					setState(103);
					block();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				match(T__11);
				setState(107);
				match(T__1);
				setState(108);
				match(INT);
				setState(109);
				match(T__2);
				setState(110);
				switchBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
				match(ID);
				setState(112);
				match(T__1);
				setState(113);
				match(T__2);
				setState(114);
				match(T__8);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(115);
				match(NEWLINE);
				setState(116);
				match(ID);
				setState(117);
				match(T__1);
				setState(118);
				match(T__2);
				setState(119);
				match(T__8);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(120);
				expr();
				setState(121);
				match(NEWLINE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(123);
				match(ID);
				setState(124);
				match(T__12);
				setState(125);
				expr();
				setState(126);
				match(NEWLINE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(128);
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

	public static class TernaryBlockContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CiclomaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CiclomaticaParser.ID, i);
		}
		public TernaryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CiclomaticaVisitor ) return ((CiclomaticaVisitor<? extends T>)visitor).visitTernaryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryBlockContext ternaryBlock() throws RecognitionException {
		TernaryBlockContext _localctx = new TernaryBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ternaryBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ID);
			setState(132);
			match(T__13);
			setState(133);
			match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 6, RULE_whileblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__14);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(136);
				stat();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 8, RULE_ifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__14);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(145);
				stat();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 10, RULE_elseifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__14);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(154);
				stat();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 12, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			catchClause();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(163);
				catchClause();
				}
				}
				setState(168);
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
		enterRule(_localctx, 14, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__16);
			setState(170);
			match(T__1);
			setState(171);
			expr();
			setState(172);
			match(T__2);
			setState(173);
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
		enterRule(_localctx, 16, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(175);
				forInit();
				}
			}

			setState(178);
			match(T__8);
			setState(180);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(179);
				forExpression();
				}
			}

			setState(182);
			match(T__8);
			setState(184);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(183);
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
		enterRule(_localctx, 18, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ID);
			setState(187);
			match(T__12);
			setState(188);
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
		enterRule(_localctx, 20, RULE_forExpression);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(ID);
				setState(191);
				expression(0);
				setState(192);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(ID);
				setState(195);
				expression(0);
				setState(196);
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
		enterRule(_localctx, 22, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			setState(201);
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
		enterRule(_localctx, 24, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__1);
			setState(204);
			expr();
			setState(205);
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
		enterRule(_localctx, 26, RULE_switchLabel);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__17);
				setState(208);
				match(INT);
				setState(209);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__19);
				setState(211);
				match(T__18);
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
		enterRule(_localctx, 28, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__14);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__19) {
				{
				{
				setState(221);
				switchLabel();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(229);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(234);
				blockStatement();
				}
				}
				setState(239);
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
		enterRule(_localctx, 32, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__14);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(243);
				stat();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(263);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(ID);
				setState(254);
				match(T__20);
				setState(255);
				expr();
				setState(256);
				match(T__21);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(T__1);
				setState(259);
				expr();
				setState(260);
				match(T__2);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
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
		enterRule(_localctx, 40, RULE_ifexpr);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(ID);
				setState(266);
				match(T__22);
				setState(267);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(ID);
				setState(269);
				match(T__23);
				setState(270);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(ID);
				setState(272);
				match(T__24);
				setState(273);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(ID);
				setState(275);
				match(T__25);
				setState(276);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(288);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(281);
							match(T__22);
							setState(282);
							match(T__22);
							}
							break;
						case 2:
							{
							setState(283);
							match(T__23);
							setState(284);
							match(T__23);
							setState(285);
							match(T__23);
							}
							break;
						case 3:
							{
							setState(286);
							match(T__23);
							setState(287);
							match(T__23);
							}
							break;
						}
						setState(290);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(298);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(292);
							match(T__22);
							setState(293);
							match(T__12);
							}
							break;
						case 2:
							{
							setState(294);
							match(T__23);
							setState(295);
							match(T__12);
							}
							break;
						case 3:
							{
							setState(296);
							match(T__23);
							}
							break;
						case 4:
							{
							setState(297);
							match(T__22);
							}
							break;
						}
						setState(300);
						expression(2);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(302);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(307);
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
		enterRule(_localctx, 44, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			expression(0);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(309);
				match(T__28);
				setState(310);
				expression(0);
				}
				}
				setState(315);
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
		case 21:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u013f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3k\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\7\5\u008c\n\5\f\5\16\5\u008f\13\5\3\5\3\5\3\6\3\6"+
		"\7\6\u0095\n\6\f\6\16\6\u0098\13\6\3\6\3\6\3\7\3\7\7\7\u009e\n\7\f\7\16"+
		"\7\u00a1\13\7\3\7\3\7\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\5\n\u00b3\n\n\3\n\3\n\5\n\u00b7\n\n\3\n\3\n\5\n"+
		"\u00bb\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c9"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00d7"+
		"\n\17\3\20\3\20\7\20\u00db\n\20\f\20\16\20\u00de\13\20\3\20\7\20\u00e1"+
		"\n\20\f\20\16\20\u00e4\13\20\3\20\3\20\3\21\6\21\u00e9\n\21\r\21\16\21"+
		"\u00ea\3\21\7\21\u00ee\n\21\f\21\16\21\u00f1\13\21\3\22\3\22\3\23\3\23"+
		"\7\23\u00f7\n\23\f\23\16\23\u00fa\13\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010a\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0118\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0123\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u012d\n\27\3\27\3\27\3\27\7\27\u0132\n\27\f"+
		"\27\16\27\u0135\13\27\3\30\3\30\3\30\7\30\u013a\n\30\f\30\16\30\u013d"+
		"\13\30\3\30\2\3,\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\3\3\2\35\36\u0154\2\61\3\2\2\2\4\u0083\3\2\2\2\6\u0085\3\2\2\2\b\u0089"+
		"\3\2\2\2\n\u0092\3\2\2\2\f\u009b\3\2\2\2\16\u00a4\3\2\2\2\20\u00ab\3\2"+
		"\2\2\22\u00b2\3\2\2\2\24\u00bc\3\2\2\2\26\u00c8\3\2\2\2\30\u00ca\3\2\2"+
		"\2\32\u00cd\3\2\2\2\34\u00d6\3\2\2\2\36\u00d8\3\2\2\2 \u00e8\3\2\2\2\""+
		"\u00f2\3\2\2\2$\u00f4\3\2\2\2&\u00fd\3\2\2\2(\u0109\3\2\2\2*\u0117\3\2"+
		"\2\2,\u0119\3\2\2\2.\u0136\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\66\7\3\2\2\66\67\7"+
		"\4\2\2\678\5(\25\289\7\5\2\29:\5\b\5\2:;\5\4\3\2;\u0084\3\2\2\2<=\5*\26"+
		"\2=>\7\6\2\2>?\5\6\4\2?\u0084\3\2\2\2@A\7\7\2\2AB\7\4\2\2BC\5*\26\2CD"+
		"\7\5\2\2DE\5\4\3\2E\u0084\3\2\2\2FG\7\7\2\2GH\7\4\2\2HI\5*\26\2IJ\7\5"+
		"\2\2JL\5\n\6\2KM\5\4\3\2LK\3\2\2\2LM\3\2\2\2M\u0084\3\2\2\2NO\7\b\2\2"+
		"OP\7\4\2\2PQ\5(\25\2QR\7\5\2\2RS\5\f\7\2ST\5\4\3\2T\u0084\3\2\2\2UV\7"+
		"\t\2\2VW\7\4\2\2WX\5\22\n\2XY\7\5\2\2YZ\5\4\3\2Z\u0084\3\2\2\2[\\\7\n"+
		"\2\2\\]\5\4\3\2]^\7\3\2\2^_\5\32\16\2_`\7\13\2\2`\u0084\3\2\2\2ab\7\f"+
		"\2\2bj\5$\23\2cd\5\16\b\2de\7\r\2\2ef\5$\23\2fk\3\2\2\2gk\5\16\b\2hi\7"+
		"\r\2\2ik\5$\23\2jc\3\2\2\2jg\3\2\2\2jh\3\2\2\2k\u0084\3\2\2\2lm\7\16\2"+
		"\2mn\7\4\2\2no\7!\2\2op\7\5\2\2p\u0084\5\36\20\2qr\7 \2\2rs\7\4\2\2st"+
		"\7\5\2\2t\u0084\7\13\2\2uv\7\"\2\2vw\7 \2\2wx\7\4\2\2xy\7\5\2\2y\u0084"+
		"\7\13\2\2z{\5(\25\2{|\7\"\2\2|\u0084\3\2\2\2}~\7 \2\2~\177\7\17\2\2\177"+
		"\u0080\5(\25\2\u0080\u0081\7\"\2\2\u0081\u0084\3\2\2\2\u0082\u0084\7\""+
		"\2\2\u0083\65\3\2\2\2\u0083<\3\2\2\2\u0083@\3\2\2\2\u0083F\3\2\2\2\u0083"+
		"N\3\2\2\2\u0083U\3\2\2\2\u0083[\3\2\2\2\u0083a\3\2\2\2\u0083l\3\2\2\2"+
		"\u0083q\3\2\2\2\u0083u\3\2\2\2\u0083z\3\2\2\2\u0083}\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\5\3\2\2\2\u0085\u0086\7 \2\2\u0086\u0087\7\20\2\2\u0087"+
		"\u0088\7 \2\2\u0088\7\3\2\2\2\u0089\u008d\7\21\2\2\u008a\u008c\5\4\3\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\22\2\2"+
		"\u0091\t\3\2\2\2\u0092\u0096\7\21\2\2\u0093\u0095\5\4\3\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\22\2\2\u009a\13\3\2\2"+
		"\2\u009b\u009f\7\21\2\2\u009c\u009e\5\4\3\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\22\2\2\u00a3\r\3\2\2\2\u00a4\u00a8"+
		"\5\20\t\2\u00a5\u00a7\5\20\t\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ac\7\23\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00ae\5(\25\2"+
		"\u00ae\u00af\7\5\2\2\u00af\u00b0\5$\23\2\u00b0\21\3\2\2\2\u00b1\u00b3"+
		"\5\24\13\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00b6\7\13\2\2\u00b5\u00b7\5\26\f\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\7\13\2\2\u00b9\u00bb\5\30\r\2"+
		"\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\23\3\2\2\2\u00bc\u00bd"+
		"\7 \2\2\u00bd\u00be\7\17\2\2\u00be\u00bf\5&\24\2\u00bf\25\3\2\2\2\u00c0"+
		"\u00c1\7 \2\2\u00c1\u00c2\5,\27\2\u00c2\u00c3\7 \2\2\u00c3\u00c9\3\2\2"+
		"\2\u00c4\u00c5\7 \2\2\u00c5\u00c6\5,\27\2\u00c6\u00c7\7!\2\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\27\3\2\2\2\u00ca"+
		"\u00cb\7 \2\2\u00cb\u00cc\5,\27\2\u00cc\31\3\2\2\2\u00cd\u00ce\7\4\2\2"+
		"\u00ce\u00cf\5(\25\2\u00cf\u00d0\7\5\2\2\u00d0\33\3\2\2\2\u00d1\u00d2"+
		"\7\24\2\2\u00d2\u00d3\7!\2\2\u00d3\u00d7\7\25\2\2\u00d4\u00d5\7\26\2\2"+
		"\u00d5\u00d7\7\25\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\35"+
		"\3\2\2\2\u00d8\u00dc\7\21\2\2\u00d9\u00db\5 \21\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e2"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\5\34\17\2\u00e0\u00df\3\2\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\22\2\2\u00e6\37\3\2\2\2\u00e7"+
		"\u00e9\5\34\17\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\5\"\22\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0!\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5\4\3\2\u00f3#\3\2"+
		"\2\2\u00f4\u00f8\7\21\2\2\u00f5\u00f7\5\4\3\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\22\2\2\u00fc%\3\2\2\2\u00fd\u00fe"+
		"\7!\2\2\u00fe\'\3\2\2\2\u00ff\u0100\7 \2\2\u0100\u0101\7\27\2\2\u0101"+
		"\u0102\5(\25\2\u0102\u0103\7\30\2\2\u0103\u010a\3\2\2\2\u0104\u0105\7"+
		"\4\2\2\u0105\u0106\5(\25\2\u0106\u0107\7\5\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u010a\7!\2\2\u0109\u00ff\3\2\2\2\u0109\u0104\3\2\2\2\u0109\u0108\3\2"+
		"\2\2\u010a)\3\2\2\2\u010b\u010c\7 \2\2\u010c\u010d\7\31\2\2\u010d\u0118"+
		"\7!\2\2\u010e\u010f\7 \2\2\u010f\u0110\7\32\2\2\u0110\u0118\7!\2\2\u0111"+
		"\u0112\7 \2\2\u0112\u0113\7\33\2\2\u0113\u0118\7!\2\2\u0114\u0115\7 \2"+
		"\2\u0115\u0116\7\34\2\2\u0116\u0118\7!\2\2\u0117\u010b\3\2\2\2\u0117\u010e"+
		"\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0114\3\2\2\2\u0118+\3\2\2\2\u0119"+
		"\u0133\b\27\1\2\u011a\u0122\f\4\2\2\u011b\u011c\7\31\2\2\u011c\u0123\7"+
		"\31\2\2\u011d\u011e\7\32\2\2\u011e\u011f\7\32\2\2\u011f\u0123\7\32\2\2"+
		"\u0120\u0121\7\32\2\2\u0121\u0123\7\32\2\2\u0122\u011b\3\2\2\2\u0122\u011d"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0132\5,\27\5\u0125"+
		"\u012c\f\3\2\2\u0126\u0127\7\31\2\2\u0127\u012d\7\17\2\2\u0128\u0129\7"+
		"\32\2\2\u0129\u012d\7\17\2\2\u012a\u012d\7\32\2\2\u012b\u012d\7\31\2\2"+
		"\u012c\u0126\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0132\5,\27\4\u012f\u0130\f\5\2\2\u0130"+
		"\u0132\t\2\2\2\u0131\u011a\3\2\2\2\u0131\u0125\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"-\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u013b\5,\27\2\u0137\u0138\7\37\2\2"+
		"\u0138\u013a\5,\27\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c/\3\2\2\2\u013d\u013b\3\2\2\2\33\63"+
		"Lj\u0083\u008d\u0096\u009f\u00a8\u00b2\u00b6\u00ba\u00c8\u00d6\u00dc\u00e2"+
		"\u00ea\u00ef\u00f8\u0109\u0117\u0122\u012c\u0131\u0133\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}