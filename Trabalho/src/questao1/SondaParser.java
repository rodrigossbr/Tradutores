// Generated from Sonda.g4 by ANTLR 4.5.3
package questao1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SondaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENTAO=1, APOS=2, NEWLINE=3, FRENTE=4, ESQUERDA=5, DIREITA=6, TRAS=7, N=8, 
		WS=9;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_command = 2, RULE_basic = 3;
	public static final String[] ruleNames = {
		"prog", "stat", "command", "basic"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ENTAO", "APOS", "NEWLINE", "FRENTE", "ESQUERDA", "DIREITA", "TRAS", 
		"N", "WS"
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
	public String getGrammarFileName() { return "Sonda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SondaParser(TokenStream input) {
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
			if ( visitor instanceof SondaVisitor ) return ((SondaVisitor<? extends T>)visitor).visitProg(this);
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
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << FRENTE) | (1L << ESQUERDA) | (1L << DIREITA) | (1L << TRAS))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(SondaParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SondaVisitor ) return ((SondaVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintCmdContext extends StatContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SondaParser.NEWLINE, 0); }
		public PrintCmdContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SondaVisitor ) return ((SondaVisitor<? extends T>)visitor).visitPrintCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(17);
			switch (_input.LA(1)) {
			case FRENTE:
			case ESQUERDA:
			case DIREITA:
			case TRAS:
				_localctx = new PrintCmdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				command();
				setState(14);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(NEWLINE);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmdAposContext extends CommandContext {
		public List<BasicContext> basic() {
			return getRuleContexts(BasicContext.class);
		}
		public BasicContext basic(int i) {
			return getRuleContext(BasicContext.class,i);
		}
		public TerminalNode APOS() { return getToken(SondaParser.APOS, 0); }
		public CmdAposContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SondaVisitor ) return ((SondaVisitor<? extends T>)visitor).visitCmdApos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdBasicContext extends CommandContext {
		public BasicContext basic() {
			return getRuleContext(BasicContext.class,0);
		}
		public CmdBasicContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SondaVisitor ) return ((SondaVisitor<? extends T>)visitor).visitCmdBasic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdEntaoContext extends CommandContext {
		public List<BasicContext> basic() {
			return getRuleContexts(BasicContext.class);
		}
		public BasicContext basic(int i) {
			return getRuleContext(BasicContext.class,i);
		}
		public TerminalNode ENTAO() { return getToken(SondaParser.ENTAO, 0); }
		public CmdEntaoContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SondaVisitor ) return ((SondaVisitor<? extends T>)visitor).visitCmdEntao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new CmdEntaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				basic();
				setState(20);
				match(ENTAO);
				setState(21);
				basic();
				}
				break;
			case 2:
				_localctx = new CmdAposContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				basic();
				setState(24);
				match(APOS);
				setState(25);
				basic();
				}
				break;
			case 3:
				_localctx = new CmdBasicContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				basic();
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

	public static class BasicContext extends ParserRuleContext {
		public BasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic; }
	 
		public BasicContext() { }
		public void copyFrom(BasicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpBasicContext extends BasicContext {
		public Token opbasic;
		public TerminalNode N() { return getToken(SondaParser.N, 0); }
		public TerminalNode FRENTE() { return getToken(SondaParser.FRENTE, 0); }
		public TerminalNode ESQUERDA() { return getToken(SondaParser.ESQUERDA, 0); }
		public TerminalNode DIREITA() { return getToken(SondaParser.DIREITA, 0); }
		public TerminalNode TRAS() { return getToken(SondaParser.TRAS, 0); }
		public OpBasicContext(BasicContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SondaVisitor ) return ((SondaVisitor<? extends T>)visitor).visitOpBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicContext basic() throws RecognitionException {
		BasicContext _localctx = new BasicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_basic);
		int _la;
		try {
			_localctx = new OpBasicContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((OpBasicContext)_localctx).opbasic = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRENTE) | (1L << ESQUERDA) | (1L << DIREITA) | (1L << TRAS))) != 0)) ) {
				((OpBasicContext)_localctx).opbasic = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(31);
			match(N);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\3\3\3\3\5\3\24\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\2\2\6"+
		"\2\4\6\b\2\3\3\2\6\t#\2\13\3\2\2\2\4\23\3\2\2\2\6\36\3\2\2\2\b \3\2\2"+
		"\2\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3"+
		"\3\2\2\2\17\20\5\6\4\2\20\21\7\5\2\2\21\24\3\2\2\2\22\24\7\5\2\2\23\17"+
		"\3\2\2\2\23\22\3\2\2\2\24\5\3\2\2\2\25\26\5\b\5\2\26\27\7\3\2\2\27\30"+
		"\5\b\5\2\30\37\3\2\2\2\31\32\5\b\5\2\32\33\7\4\2\2\33\34\5\b\5\2\34\37"+
		"\3\2\2\2\35\37\5\b\5\2\36\25\3\2\2\2\36\31\3\2\2\2\36\35\3\2\2\2\37\7"+
		"\3\2\2\2 !\t\2\2\2!\"\7\n\2\2\"\t\3\2\2\2\5\r\23\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}