// Generated from Csharp.g4 by ANTLR 4.5.1
package tradutorCsharp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CsharpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
		USING=46, NAMESPACE=47, GET=48, SET=49, ID=50, OBEJCTID=51, INT=52, NEWLINE=53, 
		WS=54;
	public static final int
		RULE_usingDeclaration = 0, RULE_namespaceDeclaration = 1, RULE_prog = 2, 
		RULE_classIdentifier = 3, RULE_multipleParameters = 4, RULE_returnType = 5, 
		RULE_stat = 6, RULE_multipleVariable = 7, RULE_createNewObject = 8, RULE_whileblock = 9, 
		RULE_ifblock = 10, RULE_elseifblock = 11, RULE_catches = 12, RULE_catchClause = 13, 
		RULE_forControl = 14, RULE_forInit = 15, RULE_forExpression = 16, RULE_forUpdate = 17, 
		RULE_parExpression = 18, RULE_switchLabel = 19, RULE_switchBlock = 20, 
		RULE_switchBlockStatementGroup = 21, RULE_blockStatement = 22, RULE_block = 23, 
		RULE_condition = 24, RULE_expr = 25, RULE_variableInCode = 26, RULE_construtor = 27, 
		RULE_variableAndMethodsGetSet = 28, RULE_parametersType = 29, RULE_methodParameters = 30, 
		RULE_methodClass = 31, RULE_ifexpr = 32, RULE_multipleExpr = 33, RULE_expression = 34, 
		RULE_expressionList = 35;
	public static final String[] ruleNames = {
		"usingDeclaration", "namespaceDeclaration", "prog", "classIdentifier", 
		"multipleParameters", "returnType", "stat", "multipleVariable", "createNewObject", 
		"whileblock", "ifblock", "elseifblock", "catches", "catchClause", "forControl", 
		"forInit", "forExpression", "forUpdate", "parExpression", "switchLabel", 
		"switchBlock", "switchBlockStatementGroup", "blockStatement", "block", 
		"condition", "expr", "variableInCode", "construtor", "variableAndMethodsGetSet", 
		"parametersType", "methodParameters", "methodClass", "ifexpr", "multipleExpr", 
		"expression", "expressionList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "'{'", "'}'", "'-'", "'public'", "'class'", "':'", 
		"','", "'void'", "'int'", "'string'", "'float'", "'boolean'", "'while'", 
		"'('", "')'", "'if'", "'else if'", "'else'", "'for'", "'do'", "'try'", 
		"'finally'", "'switch'", "'='", "'_'", "'new'", "'catch'", "'case'", "'default'", 
		"'['", "']'", "'()'", "'<'", "'>'", "'bool'", "'decimal'", "'object'", 
		"'>='", "'<='", "'||'", "'&&'", "'++'", "'--'", "'using'", "'namespace'", 
		"'get'", "'set'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "USING", "NAMESPACE", 
		"GET", "SET", "ID", "OBEJCTID", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Csharp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CsharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class UsingDeclarationContext extends ParserRuleContext {
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CsharpParser.EOF, 0); }
		public TerminalNode USING() { return getToken(CsharpParser.USING, 0); }
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CsharpParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CsharpParser.NEWLINE, i);
		}
		public UsingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitUsingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDeclarationContext usingDeclaration() throws RecognitionException {
		UsingDeclarationContext _localctx = new UsingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_usingDeclaration);
		int _la;
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(72);
					match(USING);
					setState(73);
					match(ID);
					setState(74);
					match(T__0);
					setState(75);
					match(ID);
					setState(76);
					match(T__0);
					setState(77);
					match(ID);
					setState(78);
					match(T__1);
					}
				}

				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(81);
					match(NEWLINE);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
				namespaceDeclaration();
				setState(88);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(90);
					match(NEWLINE);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				namespaceDeclaration();
				setState(97);
				match(EOF);
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

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(CsharpParser.NAMESPACE, 0); }
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public ClassIdentifierContext classIdentifier() {
			return getRuleContext(ClassIdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CsharpParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CsharpParser.NEWLINE, i);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespaceDeclaration);
		int _la;
		try {
			int _alt;
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(NAMESPACE);
				setState(102);
				match(ID);
				setState(103);
				match(T__0);
				setState(104);
				match(ID);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(105);
					match(NEWLINE);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__2);
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(112);
						match(NEWLINE);
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(118);
				classIdentifier();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(119);
					match(NEWLINE);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(T__3);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(126);
					match(NEWLINE);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(NAMESPACE);
				setState(133);
				match(ID);
				setState(134);
				match(T__4);
				setState(135);
				match(ID);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(136);
					match(NEWLINE);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(T__2);
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(143);
						match(NEWLINE);
						}
						} 
					}
					setState(148);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(149);
				classIdentifier();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(150);
					match(NEWLINE);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(T__3);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(157);
					match(NEWLINE);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(NAMESPACE);
				setState(164);
				match(ID);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(165);
					match(NEWLINE);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(T__2);
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(172);
						match(NEWLINE);
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(178);
				classIdentifier();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(179);
					match(NEWLINE);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__3);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(186);
					match(NEWLINE);
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ProgContext extends ParserRuleContext {
		public List<UsingDeclarationContext> usingDeclaration() {
			return getRuleContexts(UsingDeclarationContext.class);
		}
		public UsingDeclarationContext usingDeclaration(int i) {
			return getRuleContext(UsingDeclarationContext.class,i);
		}
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public List<ClassIdentifierContext> classIdentifier() {
			return getRuleContexts(ClassIdentifierContext.class);
		}
		public ClassIdentifierContext classIdentifier(int i) {
			return getRuleContext(ClassIdentifierContext.class,i);
		}
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		int _la;
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << USING) | (1L << NAMESPACE) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(194);
					usingDeclaration();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				namespaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(201);
					classIdentifier();
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 || _la==NEWLINE );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					stat();
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0) );
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

	public static class ClassIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CsharpParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CsharpParser.NEWLINE, i);
		}
		public ClassIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitClassIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassIdentifierContext classIdentifier() throws RecognitionException {
		ClassIdentifierContext _localctx = new ClassIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classIdentifier);
		int _la;
		try {
			int _alt;
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__5);
				setState(214);
				match(T__6);
				setState(215);
				match(ID);
				setState(216);
				match(T__2);
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(217);
					stat();
					}
					}
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0) );
				setState(222);
				match(T__3);
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223);
						match(NEWLINE);
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(T__5);
				setState(230);
				match(T__6);
				setState(231);
				match(ID);
				setState(232);
				match(T__7);
				setState(233);
				match(ID);
				setState(234);
				match(T__2);
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(235);
					stat();
					}
					}
					setState(238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0) );
				setState(240);
				match(T__3);
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(241);
						match(NEWLINE);
						}
						} 
					}
					setState(246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(T__5);
				setState(248);
				match(T__6);
				setState(249);
				match(ID);
				setState(250);
				match(T__7);
				setState(251);
				match(ID);
				setState(254);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(252);
					match(T__8);
					setState(253);
					match(ID);
					}
				}

				setState(256);
				match(T__2);
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(257);
					stat();
					}
					}
					setState(260); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0) );
				setState(262);
				match(T__3);
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(263);
						match(NEWLINE);
						}
						} 
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
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

	public static class MultipleParametersContext extends ParserRuleContext {
		public List<ReturnTypeContext> returnType() {
			return getRuleContexts(ReturnTypeContext.class);
		}
		public ReturnTypeContext returnType(int i) {
			return getRuleContext(ReturnTypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public MultipleParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitMultipleParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleParametersContext multipleParameters() throws RecognitionException {
		MultipleParametersContext _localctx = new MultipleParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multipleParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			returnType();
			setState(273);
			match(ID);
			setState(278);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(274);
				match(T__8);
				setState(275);
				returnType();
				setState(276);
				match(ID);
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		public TerminalNode INT() { return getToken(CsharpParser.INT, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public CreateNewObjectContext createNewObject() {
			return getRuleContext(CreateNewObjectContext.class,0);
		}
		public MultipleVariableContext multipleVariable() {
			return getRuleContext(MultipleVariableContext.class,0);
		}
		public MultipleExprContext multipleExpr() {
			return getRuleContext(MultipleExprContext.class,0);
		}
		public VariableAndMethodsGetSetContext variableAndMethodsGetSet() {
			return getRuleContext(VariableAndMethodsGetSetContext.class,0);
		}
		public ConstrutorContext construtor() {
			return getRuleContext(ConstrutorContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CsharpParser.NEWLINE, 0); }
		public TerminalNode WS() { return getToken(CsharpParser.WS, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat);
		try {
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(T__14);
				setState(283);
				match(T__15);
				setState(284);
				expr();
				setState(285);
				match(T__16);
				setState(286);
				stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				whileblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(T__17);
				setState(290);
				match(T__15);
				setState(291);
				ifexpr();
				setState(292);
				match(T__16);
				setState(293);
				stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(T__17);
				setState(296);
				match(T__15);
				setState(297);
				ifexpr();
				setState(298);
				match(T__16);
				setState(299);
				ifblock();
				setState(301);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(300);
					stat();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(T__18);
				setState(304);
				match(T__15);
				setState(305);
				expr();
				setState(306);
				match(T__16);
				setState(307);
				stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				elseifblock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				match(T__19);
				setState(311);
				stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
				match(T__19);
				setState(313);
				match(T__2);
				setState(314);
				stat();
				setState(315);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(317);
				match(T__20);
				setState(318);
				match(T__15);
				setState(319);
				forControl();
				setState(320);
				match(T__16);
				setState(321);
				stat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(323);
				match(T__21);
				setState(324);
				stat();
				setState(325);
				match(T__14);
				setState(326);
				parExpression();
				setState(327);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(329);
				match(T__22);
				setState(330);
				block();
				setState(338);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(331);
					catches();
					setState(332);
					match(T__23);
					setState(333);
					block();
					}
					break;
				case 2:
					{
					setState(335);
					catches();
					}
					break;
				case 3:
					{
					setState(336);
					match(T__23);
					setState(337);
					block();
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(340);
				match(T__24);
				setState(341);
				match(T__15);
				setState(342);
				match(INT);
				setState(343);
				match(T__16);
				setState(344);
				switchBlock();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(345);
				match(ID);
				setState(346);
				match(T__15);
				setState(347);
				match(T__16);
				setState(348);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(349);
				match(ID);
				setState(350);
				match(T__0);
				setState(351);
				match(ID);
				setState(352);
				match(T__15);
				setState(353);
				match(T__16);
				setState(354);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(355);
				match(ID);
				setState(356);
				match(T__15);
				setState(357);
				match(T__16);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(358);
				createNewObject();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(359);
				multipleVariable();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(360);
				multipleExpr();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(361);
				variableAndMethodsGetSet();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(362);
				construtor();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(363);
				match(NEWLINE);
				setState(364);
				match(ID);
				setState(365);
				match(T__15);
				setState(366);
				match(T__16);
				setState(367);
				match(T__1);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(368);
				expr();
				setState(369);
				match(NEWLINE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(371);
				match(ID);
				setState(372);
				match(T__25);
				setState(373);
				expr();
				setState(374);
				match(NEWLINE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(376);
				match(NEWLINE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(377);
				match(WS);
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

	public static class MultipleVariableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public MultipleVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitMultipleVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleVariableContext multipleVariable() throws RecognitionException {
		MultipleVariableContext _localctx = new MultipleVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multipleVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ID);
			setState(383);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(381);
				match(T__26);
				setState(382);
				match(ID);
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

	public static class CreateNewObjectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public MultipleParametersContext multipleParameters() {
			return getRuleContext(MultipleParametersContext.class,0);
		}
		public CreateNewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createNewObject; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitCreateNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateNewObjectContext createNewObject() throws RecognitionException {
		CreateNewObjectContext _localctx = new CreateNewObjectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createNewObject);
		try {
			setState(401);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(ID);
				setState(386);
				match(ID);
				setState(387);
				match(T__25);
				setState(388);
				match(T__27);
				setState(389);
				match(ID);
				setState(390);
				match(T__15);
				setState(391);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(ID);
				setState(393);
				match(ID);
				setState(394);
				match(T__25);
				setState(395);
				match(T__27);
				setState(396);
				match(ID);
				setState(397);
				match(T__15);
				setState(398);
				multipleParameters();
				setState(399);
				match(T__16);
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitWhileblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileblockContext whileblock() throws RecognitionException {
		WhileblockContext _localctx = new WhileblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T__2);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(404);
				stat();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitIfblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__2);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(413);
				stat();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitElseifblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifblockContext elseifblock() throws RecognitionException {
		ElseifblockContext _localctx = new ElseifblockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__2);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(422);
				stat();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			catchClause();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(431);
				catchClause();
				}
				}
				setState(436);
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__28);
			setState(438);
			match(T__15);
			setState(439);
			expr();
			setState(440);
			match(T__16);
			setState(441);
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(443);
				forInit();
				}
			}

			setState(446);
			match(T__1);
			setState(448);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(447);
				forExpression();
				}
			}

			setState(450);
			match(T__1);
			setState(452);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(451);
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
		public TerminalNode ID() { return getToken(CsharpParser.ID, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(ID);
			setState(455);
			match(T__25);
			setState(456);
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
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT() { return getToken(CsharpParser.INT, 0); }
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forExpression);
		try {
			setState(466);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(ID);
				setState(459);
				expression(0);
				setState(460);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(ID);
				setState(463);
				expression(0);
				setState(464);
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
		public TerminalNode ID() { return getToken(CsharpParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(ID);
			setState(469);
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__15);
			setState(472);
			expr();
			setState(473);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INT() { return getToken(CsharpParser.INT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switchLabel);
		try {
			setState(480);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(T__29);
				setState(476);
				match(INT);
				setState(477);
				match(T__7);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(T__30);
				setState(479);
				match(T__7);
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__2);
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__30) {
				{
				{
				setState(489);
				switchLabel();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(497);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(502);
				blockStatement();
				}
				}
				setState(507);
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(T__2);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(511);
				stat();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INT() { return getToken(CsharpParser.INT, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
		public TerminalNode ID() { return getToken(CsharpParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(CsharpParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		try {
			setState(531);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(ID);
				setState(522);
				match(T__31);
				setState(523);
				expr();
				setState(524);
				match(T__32);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(T__15);
				setState(527);
				expr();
				setState(528);
				match(T__16);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
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

	public static class VariableInCodeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public TerminalNode NEWLINE() { return getToken(CsharpParser.NEWLINE, 0); }
		public VariableInCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitVariableInCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInCodeContext variableInCode() throws RecognitionException {
		VariableInCodeContext _localctx = new VariableInCodeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableInCode);
		try {
			setState(538);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(ID);
				setState(534);
				match(T__25);
				setState(535);
				match(ID);
				setState(536);
				match(T__1);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
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

	public static class ConstrutorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CsharpParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CsharpParser.NEWLINE, i);
		}
		public List<VariableInCodeContext> variableInCode() {
			return getRuleContexts(VariableInCodeContext.class);
		}
		public VariableInCodeContext variableInCode(int i) {
			return getRuleContext(VariableInCodeContext.class,i);
		}
		public List<ParametersTypeContext> parametersType() {
			return getRuleContexts(ParametersTypeContext.class);
		}
		public ParametersTypeContext parametersType(int i) {
			return getRuleContext(ParametersTypeContext.class,i);
		}
		public ConstrutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitConstrutor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrutorContext construtor() throws RecognitionException {
		ConstrutorContext _localctx = new ConstrutorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_construtor);
		int _la;
		try {
			int _alt;
			setState(682);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(T__5);
				setState(541);
				match(ID);
				setState(542);
				match(T__33);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(543);
					match(NEWLINE);
					}
					}
					setState(548);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(549);
				match(T__2);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(550);
					match(NEWLINE);
					}
					}
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(556);
				match(T__3);
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(557);
						match(NEWLINE);
						}
						} 
					}
					setState(562);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(T__5);
				setState(564);
				match(ID);
				setState(565);
				match(T__33);
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(566);
					match(NEWLINE);
					}
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(572);
				match(T__2);
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(573);
						match(NEWLINE);
						}
						} 
					}
					setState(578);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(579);
						variableInCode();
						}
						} 
					}
					setState(584);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(585);
					match(NEWLINE);
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591);
				match(T__3);
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(592);
						match(NEWLINE);
						}
						} 
					}
					setState(597);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				match(T__5);
				setState(599);
				match(ID);
				setState(600);
				match(T__15);
				setState(601);
				parametersType();
				setState(602);
				match(ID);
				setState(603);
				match(T__16);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(604);
					match(NEWLINE);
					}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(610);
				match(T__2);
				setState(612); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(611);
					variableInCode();
					}
					}
					setState(614); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NEWLINE );
				setState(616);
				match(T__3);
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(617);
						match(NEWLINE);
						}
						} 
					}
					setState(622);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				match(T__5);
				setState(624);
				match(ID);
				setState(625);
				match(T__15);
				setState(626);
				parametersType();
				setState(627);
				match(ID);
				setState(628);
				match(T__8);
				setState(629);
				parametersType();
				setState(630);
				match(ID);
				setState(631);
				match(T__16);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(632);
					match(NEWLINE);
					}
					}
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(638);
				match(T__2);
				setState(640); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(639);
					variableInCode();
					}
					}
					setState(642); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NEWLINE );
				setState(644);
				match(T__3);
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(645);
						match(NEWLINE);
						}
						} 
					}
					setState(650);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(651);
				match(T__5);
				setState(652);
				match(ID);
				setState(653);
				match(T__15);
				setState(654);
				parametersType();
				setState(655);
				match(ID);
				setState(656);
				match(T__8);
				setState(657);
				parametersType();
				setState(658);
				match(ID);
				setState(659);
				match(T__8);
				setState(660);
				parametersType();
				setState(661);
				match(ID);
				setState(662);
				match(T__16);
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(663);
					match(NEWLINE);
					}
					}
					setState(668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(669);
				match(T__2);
				setState(671); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(670);
					variableInCode();
					}
					}
					setState(673); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NEWLINE );
				setState(675);
				match(T__3);
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(676);
						match(NEWLINE);
						}
						} 
					}
					setState(681);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
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

	public static class VariableAndMethodsGetSetContext extends ParserRuleContext {
		public ParametersTypeContext parametersType() {
			return getRuleContext(ParametersTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public TerminalNode GET() { return getToken(CsharpParser.GET, 0); }
		public TerminalNode SET() { return getToken(CsharpParser.SET, 0); }
		public VariableAndMethodsGetSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAndMethodsGetSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitVariableAndMethodsGetSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAndMethodsGetSetContext variableAndMethodsGetSet() throws RecognitionException {
		VariableAndMethodsGetSetContext _localctx = new VariableAndMethodsGetSetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableAndMethodsGetSet);
		try {
			setState(706);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				match(T__5);
				setState(685);
				parametersType();
				setState(686);
				match(ID);
				setState(687);
				match(T__2);
				setState(688);
				match(GET);
				setState(689);
				match(T__1);
				setState(690);
				match(SET);
				setState(691);
				match(T__1);
				setState(692);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				match(T__5);
				setState(695);
				match(ID);
				setState(696);
				match(T__34);
				setState(697);
				match(ID);
				setState(698);
				match(T__35);
				setState(699);
				match(ID);
				setState(700);
				match(T__2);
				setState(701);
				match(GET);
				setState(702);
				match(T__1);
				setState(703);
				match(SET);
				setState(704);
				match(T__1);
				setState(705);
				match(T__3);
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

	public static class ParametersTypeContext extends ParserRuleContext {
		public ParametersTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitParametersType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersTypeContext parametersType() throws RecognitionException {
		ParametersTypeContext _localctx = new ParametersTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parametersType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class MethodParametersContext extends ParserRuleContext {
		public List<ParametersTypeContext> parametersType() {
			return getRuleContexts(ParametersTypeContext.class);
		}
		public ParametersTypeContext parametersType(int i) {
			return getRuleContext(ParametersTypeContext.class,i);
		}
		public List<MultipleVariableContext> multipleVariable() {
			return getRuleContexts(MultipleVariableContext.class);
		}
		public MultipleVariableContext multipleVariable(int i) {
			return getRuleContext(MultipleVariableContext.class,i);
		}
		public MethodParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitMethodParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParametersContext methodParameters() throws RecognitionException {
		MethodParametersContext _localctx = new MethodParametersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			parametersType();
			setState(711);
			multipleVariable();
			setState(716);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(712);
				match(T__8);
				setState(713);
				parametersType();
				setState(714);
				multipleVariable();
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

	public static class MethodClassContext extends ParserRuleContext {
		public MultipleVariableContext multipleVariable() {
			return getRuleContext(MultipleVariableContext.class,0);
		}
		public MethodParametersContext methodParameters() {
			return getRuleContext(MethodParametersContext.class,0);
		}
		public MethodClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodClass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitMethodClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodClassContext methodClass() throws RecognitionException {
		MethodClassContext _localctx = new MethodClassContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_methodClass);
		try {
			setState(727);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				multipleVariable();
				setState(719);
				match(T__15);
				setState(720);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				multipleVariable();
				setState(723);
				match(T__15);
				setState(724);
				methodParameters();
				setState(725);
				match(T__16);
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

	public static class IfexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CsharpParser.ID, 0); }
		public TerminalNode INT() { return getToken(CsharpParser.INT, 0); }
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitIfexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifexpr);
		try {
			setState(741);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				match(ID);
				setState(730);
				match(T__34);
				setState(731);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(ID);
				setState(733);
				match(T__35);
				setState(734);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				match(ID);
				setState(736);
				match(T__39);
				setState(737);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(738);
				match(ID);
				setState(739);
				match(T__40);
				setState(740);
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

	public static class MultipleExprContext extends ParserRuleContext {
		public List<IfexprContext> ifexpr() {
			return getRuleContexts(IfexprContext.class);
		}
		public IfexprContext ifexpr(int i) {
			return getRuleContext(IfexprContext.class,i);
		}
		public MultipleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitMultipleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleExprContext multipleExpr() throws RecognitionException {
		MultipleExprContext _localctx = new MultipleExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multipleExpr);
		try {
			setState(751);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				ifexpr();
				{
				setState(744);
				match(T__41);
				setState(745);
				ifexpr();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				ifexpr();
				{
				setState(748);
				match(T__42);
				setState(749);
				ifexpr();
				}
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(777);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(754);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(762);
						switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
						case 1:
							{
							setState(755);
							match(T__34);
							setState(756);
							match(T__34);
							}
							break;
						case 2:
							{
							setState(757);
							match(T__35);
							setState(758);
							match(T__35);
							setState(759);
							match(T__35);
							}
							break;
						case 3:
							{
							setState(760);
							match(T__35);
							setState(761);
							match(T__35);
							}
							break;
						}
						setState(764);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(765);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(772);
						switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
							{
							setState(766);
							match(T__34);
							setState(767);
							match(T__25);
							}
							break;
						case 2:
							{
							setState(768);
							match(T__35);
							setState(769);
							match(T__25);
							}
							break;
						case 3:
							{
							setState(770);
							match(T__35);
							}
							break;
						case 4:
							{
							setState(771);
							match(T__34);
							}
							break;
						}
						setState(774);
						expression(2);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(775);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(776);
						_la = _input.LA(1);
						if ( !(_la==T__43 || _la==T__44) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			expression(0);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(783);
				match(T__8);
				setState(784);
				expression(0);
				}
				}
				setState(789);
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
		case 34:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0319\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2R\n\2\3\2"+
		"\7\2U\n\2\f\2\16\2X\13\2\3\2\3\2\3\2\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\3"+
		"\2\3\2\5\2f\n\2\3\3\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\7"+
		"\3t\n\3\f\3\16\3w\13\3\3\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\3\3\7\3\u0082"+
		"\n\3\f\3\16\3\u0085\13\3\3\3\3\3\3\3\3\3\3\3\7\3\u008c\n\3\f\3\16\3\u008f"+
		"\13\3\3\3\3\3\7\3\u0093\n\3\f\3\16\3\u0096\13\3\3\3\3\3\7\3\u009a\n\3"+
		"\f\3\16\3\u009d\13\3\3\3\3\3\7\3\u00a1\n\3\f\3\16\3\u00a4\13\3\3\3\3\3"+
		"\3\3\7\3\u00a9\n\3\f\3\16\3\u00ac\13\3\3\3\3\3\7\3\u00b0\n\3\f\3\16\3"+
		"\u00b3\13\3\3\3\3\3\7\3\u00b7\n\3\f\3\16\3\u00ba\13\3\3\3\3\3\7\3\u00be"+
		"\n\3\f\3\16\3\u00c1\13\3\5\3\u00c3\n\3\3\4\7\4\u00c6\n\4\f\4\16\4\u00c9"+
		"\13\4\3\4\3\4\6\4\u00cd\n\4\r\4\16\4\u00ce\3\4\6\4\u00d2\n\4\r\4\16\4"+
		"\u00d3\5\4\u00d6\n\4\3\5\3\5\3\5\3\5\3\5\6\5\u00dd\n\5\r\5\16\5\u00de"+
		"\3\5\3\5\7\5\u00e3\n\5\f\5\16\5\u00e6\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\6\5\u00ef\n\5\r\5\16\5\u00f0\3\5\3\5\7\5\u00f5\n\5\f\5\16\5\u00f8\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0101\n\5\3\5\3\5\6\5\u0105\n\5\r\5"+
		"\16\5\u0106\3\5\3\5\7\5\u010b\n\5\f\5\16\5\u010e\13\5\3\5\5\5\u0111\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0119\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0130\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0155\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u017d\n\b\3\t\3\t\3\t\5\t\u0182\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0194\n"+
		"\n\3\13\3\13\7\13\u0198\n\13\f\13\16\13\u019b\13\13\3\13\3\13\3\f\3\f"+
		"\7\f\u01a1\n\f\f\f\16\f\u01a4\13\f\3\f\3\f\3\r\3\r\7\r\u01aa\n\r\f\r\16"+
		"\r\u01ad\13\r\3\r\3\r\3\16\3\16\7\16\u01b3\n\16\f\16\16\16\u01b6\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\5\20\u01bf\n\20\3\20\3\20\5\20\u01c3"+
		"\n\20\3\20\3\20\5\20\u01c7\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u01d5\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u01e3\n\25\3\26\3\26\7\26\u01e7\n\26\f"+
		"\26\16\26\u01ea\13\26\3\26\7\26\u01ed\n\26\f\26\16\26\u01f0\13\26\3\26"+
		"\3\26\3\27\6\27\u01f5\n\27\r\27\16\27\u01f6\3\27\7\27\u01fa\n\27\f\27"+
		"\16\27\u01fd\13\27\3\30\3\30\3\31\3\31\7\31\u0203\n\31\f\31\16\31\u0206"+
		"\13\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0216\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u021d\n\34\3\35\3"+
		"\35\3\35\3\35\7\35\u0223\n\35\f\35\16\35\u0226\13\35\3\35\3\35\7\35\u022a"+
		"\n\35\f\35\16\35\u022d\13\35\3\35\3\35\7\35\u0231\n\35\f\35\16\35\u0234"+
		"\13\35\3\35\3\35\3\35\3\35\7\35\u023a\n\35\f\35\16\35\u023d\13\35\3\35"+
		"\3\35\7\35\u0241\n\35\f\35\16\35\u0244\13\35\3\35\7\35\u0247\n\35\f\35"+
		"\16\35\u024a\13\35\3\35\7\35\u024d\n\35\f\35\16\35\u0250\13\35\3\35\3"+
		"\35\7\35\u0254\n\35\f\35\16\35\u0257\13\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\7\35\u0260\n\35\f\35\16\35\u0263\13\35\3\35\3\35\6\35\u0267\n"+
		"\35\r\35\16\35\u0268\3\35\3\35\7\35\u026d\n\35\f\35\16\35\u0270\13\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u027c\n\35\f\35"+
		"\16\35\u027f\13\35\3\35\3\35\6\35\u0283\n\35\r\35\16\35\u0284\3\35\3\35"+
		"\7\35\u0289\n\35\f\35\16\35\u028c\13\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u029b\n\35\f\35\16\35\u029e\13"+
		"\35\3\35\3\35\6\35\u02a2\n\35\r\35\16\35\u02a3\3\35\3\35\7\35\u02a8\n"+
		"\35\f\35\16\35\u02ab\13\35\5\35\u02ad\n\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u02c5\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u02cf\n "+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u02da\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\5\"\u02e8\n\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02f2\n#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u02fd\n$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0307"+
		"\n$\3$\3$\3$\7$\u030c\n$\f$\16$\u030f\13$\3%\3%\3%\7%\u0314\n%\f%\16%"+
		"\u0317\13%\3%\2\3F&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFH\2\5\3\2\f\20\4\2\r\16\')\3\2./\u036a\2e\3\2\2\2\4\u00c2"+
		"\3\2\2\2\6\u00d5\3\2\2\2\b\u0110\3\2\2\2\n\u0112\3\2\2\2\f\u011a\3\2\2"+
		"\2\16\u017c\3\2\2\2\20\u017e\3\2\2\2\22\u0193\3\2\2\2\24\u0195\3\2\2\2"+
		"\26\u019e\3\2\2\2\30\u01a7\3\2\2\2\32\u01b0\3\2\2\2\34\u01b7\3\2\2\2\36"+
		"\u01be\3\2\2\2 \u01c8\3\2\2\2\"\u01d4\3\2\2\2$\u01d6\3\2\2\2&\u01d9\3"+
		"\2\2\2(\u01e2\3\2\2\2*\u01e4\3\2\2\2,\u01f4\3\2\2\2.\u01fe\3\2\2\2\60"+
		"\u0200\3\2\2\2\62\u0209\3\2\2\2\64\u0215\3\2\2\2\66\u021c\3\2\2\28\u02ac"+
		"\3\2\2\2:\u02c4\3\2\2\2<\u02c6\3\2\2\2>\u02c8\3\2\2\2@\u02d9\3\2\2\2B"+
		"\u02e7\3\2\2\2D\u02f1\3\2\2\2F\u02f3\3\2\2\2H\u0310\3\2\2\2JK\7\60\2\2"+
		"KL\7\64\2\2LM\7\3\2\2MN\7\64\2\2NO\7\3\2\2OP\7\64\2\2PR\7\4\2\2QJ\3\2"+
		"\2\2QR\3\2\2\2RV\3\2\2\2SU\7\67\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3"+
		"\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\5\4\3\2Z[\7\2\2\3[f\3\2\2\2\\^\7\67\2\2]"+
		"\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\5\4\3\2"+
		"cd\7\2\2\3df\3\2\2\2eQ\3\2\2\2e_\3\2\2\2f\3\3\2\2\2gh\7\61\2\2hi\7\64"+
		"\2\2ij\7\3\2\2jn\7\64\2\2km\7\67\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3"+
		"\2\2\2oq\3\2\2\2pn\3\2\2\2qu\7\5\2\2rt\7\67\2\2sr\3\2\2\2tw\3\2\2\2us"+
		"\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2x|\5\b\5\2y{\7\67\2\2zy\3\2\2\2"+
		"{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0083\7\6\2"+
		"\2\u0080\u0082\7\67\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u00c3\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7\64\2\2\u0088\u0089\7\7\2\2\u0089"+
		"\u008d\7\64\2\2\u008a\u008c\7\67\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0094\7\5\2\2\u0091\u0093\7\67\2\2\u0092\u0091\3"+
		"\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009b\5\b\5\2\u0098\u009a\7\67"+
		"\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a2\7\6"+
		"\2\2\u009f\u00a1\7\67\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00c3\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00aa\7\64\2\2\u00a7\u00a9\7\67\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\7\5\2\2\u00ae"+
		"\u00b0\7\67\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b8\5\b\5\2\u00b5\u00b7\7\67\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bf\7\6\2\2\u00bc\u00be\7\67\2\2\u00bd\u00bc\3"+
		"\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2g\3\2\2\2\u00c2\u0086\3\2\2\2"+
		"\u00c2\u00a5\3\2\2\2\u00c3\5\3\2\2\2\u00c4\u00c6\5\2\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00d6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00d6\5\4\3\2\u00cb\u00cd\5\b"+
		"\5\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d6\3\2\2\2\u00d0\u00d2\5\16\b\2\u00d1\u00d0\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00c7\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00cc\3\2"+
		"\2\2\u00d5\u00d1\3\2\2\2\u00d6\7\3\2\2\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9"+
		"\7\t\2\2\u00d9\u00da\7\64\2\2\u00da\u00dc\7\5\2\2\u00db\u00dd\5\16\b\2"+
		"\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e4\7\6\2\2\u00e1\u00e3\7\67\2\2"+
		"\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u0111\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\b\2\2\u00e8"+
		"\u00e9\7\t\2\2\u00e9\u00ea\7\64\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\7"+
		"\64\2\2\u00ec\u00ee\7\5\2\2\u00ed\u00ef\5\16\b\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f6\7\6\2\2\u00f3\u00f5\7\67\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u0111\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\b\2\2\u00fa\u00fb\7\t\2\2\u00fb"+
		"\u00fc\7\64\2\2\u00fc\u00fd\7\n\2\2\u00fd\u0100\7\64\2\2\u00fe\u00ff\7"+
		"\13\2\2\u00ff\u0101\7\64\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0104\7\5\2\2\u0103\u0105\5\16\b\2\u0104\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010c\7\6\2\2\u0109\u010b\7\67\2\2\u010a\u0109\3"+
		"\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0111\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\7\67\2\2\u0110\u00d7\3"+
		"\2\2\2\u0110\u00e7\3\2\2\2\u0110\u00f9\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\t\3\2\2\2\u0112\u0113\5\f\7\2\u0113\u0118\7\64\2\2\u0114\u0115\7\13\2"+
		"\2\u0115\u0116\5\f\7\2\u0116\u0117\7\64\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0114\3\2\2\2\u0118\u0119\3\2\2\2\u0119\13\3\2\2\2\u011a\u011b\t\2\2"+
		"\2\u011b\r\3\2\2\2\u011c\u011d\7\21\2\2\u011d\u011e\7\22\2\2\u011e\u011f"+
		"\5\64\33\2\u011f\u0120\7\23\2\2\u0120\u0121\5\16\b\2\u0121\u017d\3\2\2"+
		"\2\u0122\u017d\5\24\13\2\u0123\u0124\7\24\2\2\u0124\u0125\7\22\2\2\u0125"+
		"\u0126\5B\"\2\u0126\u0127\7\23\2\2\u0127\u0128\5\16\b\2\u0128\u017d\3"+
		"\2\2\2\u0129\u012a\7\24\2\2\u012a\u012b\7\22\2\2\u012b\u012c\5B\"\2\u012c"+
		"\u012d\7\23\2\2\u012d\u012f\5\26\f\2\u012e\u0130\5\16\b\2\u012f\u012e"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u017d\3\2\2\2\u0131\u0132\7\25\2\2"+
		"\u0132\u0133\7\22\2\2\u0133\u0134\5\64\33\2\u0134\u0135\7\23\2\2\u0135"+
		"\u0136\5\16\b\2\u0136\u017d\3\2\2\2\u0137\u017d\5\30\r\2\u0138\u0139\7"+
		"\26\2\2\u0139\u017d\5\16\b\2\u013a\u013b\7\26\2\2\u013b\u013c\7\5\2\2"+
		"\u013c\u013d\5\16\b\2\u013d\u013e\7\6\2\2\u013e\u017d\3\2\2\2\u013f\u0140"+
		"\7\27\2\2\u0140\u0141\7\22\2\2\u0141\u0142\5\36\20\2\u0142\u0143\7\23"+
		"\2\2\u0143\u0144\5\16\b\2\u0144\u017d\3\2\2\2\u0145\u0146\7\30\2\2\u0146"+
		"\u0147\5\16\b\2\u0147\u0148\7\21\2\2\u0148\u0149\5&\24\2\u0149\u014a\7"+
		"\4\2\2\u014a\u017d\3\2\2\2\u014b\u014c\7\31\2\2\u014c\u0154\5\60\31\2"+
		"\u014d\u014e\5\32\16\2\u014e\u014f\7\32\2\2\u014f\u0150\5\60\31\2\u0150"+
		"\u0155\3\2\2\2\u0151\u0155\5\32\16\2\u0152\u0153\7\32\2\2\u0153\u0155"+
		"\5\60\31\2\u0154\u014d\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0152\3\2\2\2"+
		"\u0155\u017d\3\2\2\2\u0156\u0157\7\33\2\2\u0157\u0158\7\22\2\2\u0158\u0159"+
		"\7\66\2\2\u0159\u015a\7\23\2\2\u015a\u017d\5*\26\2\u015b\u015c\7\64\2"+
		"\2\u015c\u015d\7\22\2\2\u015d\u015e\7\23\2\2\u015e\u017d\7\4\2\2\u015f"+
		"\u0160\7\64\2\2\u0160\u0161\7\3\2\2\u0161\u0162\7\64\2\2\u0162\u0163\7"+
		"\22\2\2\u0163\u0164\7\23\2\2\u0164\u017d\7\4\2\2\u0165\u0166\7\64\2\2"+
		"\u0166\u0167\7\22\2\2\u0167\u017d\7\23\2\2\u0168\u017d\5\22\n\2\u0169"+
		"\u017d\5\20\t\2\u016a\u017d\5D#\2\u016b\u017d\5:\36\2\u016c\u017d\58\35"+
		"\2\u016d\u016e\7\67\2\2\u016e\u016f\7\64\2\2\u016f\u0170\7\22\2\2\u0170"+
		"\u0171\7\23\2\2\u0171\u017d\7\4\2\2\u0172\u0173\5\64\33\2\u0173\u0174"+
		"\7\67\2\2\u0174\u017d\3\2\2\2\u0175\u0176\7\64\2\2\u0176\u0177\7\34\2"+
		"\2\u0177\u0178\5\64\33\2\u0178\u0179\7\67\2\2\u0179\u017d\3\2\2\2\u017a"+
		"\u017d\7\67\2\2\u017b\u017d\78\2\2\u017c\u011c\3\2\2\2\u017c\u0122\3\2"+
		"\2\2\u017c\u0123\3\2\2\2\u017c\u0129\3\2\2\2\u017c\u0131\3\2\2\2\u017c"+
		"\u0137\3\2\2\2\u017c\u0138\3\2\2\2\u017c\u013a\3\2\2\2\u017c\u013f\3\2"+
		"\2\2\u017c\u0145\3\2\2\2\u017c\u014b\3\2\2\2\u017c\u0156\3\2\2\2\u017c"+
		"\u015b\3\2\2\2\u017c\u015f\3\2\2\2\u017c\u0165\3\2\2\2\u017c\u0168\3\2"+
		"\2\2\u017c\u0169\3\2\2\2\u017c\u016a\3\2\2\2\u017c\u016b\3\2\2\2\u017c"+
		"\u016c\3\2\2\2\u017c\u016d\3\2\2\2\u017c\u0172\3\2\2\2\u017c\u0175\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d\17\3\2\2\2\u017e\u0181"+
		"\7\64\2\2\u017f\u0180\7\35\2\2\u0180\u0182\7\64\2\2\u0181\u017f\3\2\2"+
		"\2\u0181\u0182\3\2\2\2\u0182\21\3\2\2\2\u0183\u0184\7\64\2\2\u0184\u0185"+
		"\7\64\2\2\u0185\u0186\7\34\2\2\u0186\u0187\7\36\2\2\u0187\u0188\7\64\2"+
		"\2\u0188\u0189\7\22\2\2\u0189\u0194\7\23\2\2\u018a\u018b\7\64\2\2\u018b"+
		"\u018c\7\64\2\2\u018c\u018d\7\34\2\2\u018d\u018e\7\36\2\2\u018e\u018f"+
		"\7\64\2\2\u018f\u0190\7\22\2\2\u0190\u0191\5\n\6\2\u0191\u0192\7\23\2"+
		"\2\u0192\u0194\3\2\2\2\u0193\u0183\3\2\2\2\u0193\u018a\3\2\2\2\u0194\23"+
		"\3\2\2\2\u0195\u0199\7\5\2\2\u0196\u0198\5\16\b\2\u0197\u0196\3\2\2\2"+
		"\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7\6\2\2\u019d\25\3\2\2\2\u019e"+
		"\u01a2\7\5\2\2\u019f\u01a1\5\16\b\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3"+
		"\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a6\7\6\2\2\u01a6\27\3\2\2\2\u01a7\u01ab\7\5\2"+
		"\2\u01a8\u01aa\5\16\b\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ae\u01af\7\6\2\2\u01af\31\3\2\2\2\u01b0\u01b4\5\34\17\2\u01b1"+
		"\u01b3\5\34\17\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3"+
		"\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\33\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b8\7\37\2\2\u01b8\u01b9\7\22\2\2\u01b9\u01ba\5\64\33\2\u01ba\u01bb"+
		"\7\23\2\2\u01bb\u01bc\5\60\31\2\u01bc\35\3\2\2\2\u01bd\u01bf\5 \21\2\u01be"+
		"\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\7\4"+
		"\2\2\u01c1\u01c3\5\"\22\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c6\7\4\2\2\u01c5\u01c7\5$\23\2\u01c6\u01c5\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7\37\3\2\2\2\u01c8\u01c9\7\64\2\2\u01c9\u01ca"+
		"\7\34\2\2\u01ca\u01cb\5\62\32\2\u01cb!\3\2\2\2\u01cc\u01cd\7\64\2\2\u01cd"+
		"\u01ce\5F$\2\u01ce\u01cf\7\64\2\2\u01cf\u01d5\3\2\2\2\u01d0\u01d1\7\64"+
		"\2\2\u01d1\u01d2\5F$\2\u01d2\u01d3\7\66\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01cc\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d5#\3\2\2\2\u01d6\u01d7\7\64\2\2"+
		"\u01d7\u01d8\5F$\2\u01d8%\3\2\2\2\u01d9\u01da\7\22\2\2\u01da\u01db\5\64"+
		"\33\2\u01db\u01dc\7\23\2\2\u01dc\'\3\2\2\2\u01dd\u01de\7 \2\2\u01de\u01df"+
		"\7\66\2\2\u01df\u01e3\7\n\2\2\u01e0\u01e1\7!\2\2\u01e1\u01e3\7\n\2\2\u01e2"+
		"\u01dd\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3)\3\2\2\2\u01e4\u01e8\7\5\2\2"+
		"\u01e5\u01e7\5,\27\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ee\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ed\5(\25\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f2\7\6\2\2\u01f2+\3\2\2\2\u01f3\u01f5\5(\25\2\u01f4\u01f3\3\2\2\2"+
		"\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fb"+
		"\3\2\2\2\u01f8\u01fa\5.\30\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc-\3\2\2\2\u01fd\u01fb\3\2\2\2"+
		"\u01fe\u01ff\5\16\b\2\u01ff/\3\2\2\2\u0200\u0204\7\5\2\2\u0201\u0203\5"+
		"\16\b\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7\6"+
		"\2\2\u0208\61\3\2\2\2\u0209\u020a\7\66\2\2\u020a\63\3\2\2\2\u020b\u020c"+
		"\7\64\2\2\u020c\u020d\7\"\2\2\u020d\u020e\5\64\33\2\u020e\u020f\7#\2\2"+
		"\u020f\u0216\3\2\2\2\u0210\u0211\7\22\2\2\u0211\u0212\5\64\33\2\u0212"+
		"\u0213\7\23\2\2\u0213\u0216\3\2\2\2\u0214\u0216\7\66\2\2\u0215\u020b\3"+
		"\2\2\2\u0215\u0210\3\2\2\2\u0215\u0214\3\2\2\2\u0216\65\3\2\2\2\u0217"+
		"\u0218\7\64\2\2\u0218\u0219\7\34\2\2\u0219\u021a\7\64\2\2\u021a\u021d"+
		"\7\4\2\2\u021b\u021d\7\67\2\2\u021c\u0217\3\2\2\2\u021c\u021b\3\2\2\2"+
		"\u021d\67\3\2\2\2\u021e\u021f\7\b\2\2\u021f\u0220\7\64\2\2\u0220\u0224"+
		"\7$\2\2\u0221\u0223\7\67\2\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2"+
		"\2\2\u0227\u022b\7\5\2\2\u0228\u022a\7\67\2\2\u0229\u0228\3\2\2\2\u022a"+
		"\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2"+
		"\2\2\u022d\u022b\3\2\2\2\u022e\u0232\7\6\2\2\u022f\u0231\7\67\2\2\u0230"+
		"\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u02ad\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7\b\2\2\u0236"+
		"\u0237\7\64\2\2\u0237\u023b\7$\2\2\u0238\u023a\7\67\2\2\u0239\u0238\3"+
		"\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0242\7\5\2\2\u023f\u0241\7\67"+
		"\2\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0248\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0247\5\66"+
		"\34\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\u024e\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024d\7\67"+
		"\2\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0255\7\6"+
		"\2\2\u0252\u0254\7\67\2\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u02ad\3\2\2\2\u0257\u0255\3\2"+
		"\2\2\u0258\u0259\7\b\2\2\u0259\u025a\7\64\2\2\u025a\u025b\7\22\2\2\u025b"+
		"\u025c\5<\37\2\u025c\u025d\7\64\2\2\u025d\u0261\7\23\2\2\u025e\u0260\7"+
		"\67\2\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0266\7\5"+
		"\2\2\u0265\u0267\5\66\34\2\u0266\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026e\7\6"+
		"\2\2\u026b\u026d\7\67\2\2\u026c\u026b\3\2\2\2\u026d\u0270\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u02ad\3\2\2\2\u0270\u026e\3\2"+
		"\2\2\u0271\u0272\7\b\2\2\u0272\u0273\7\64\2\2\u0273\u0274\7\22\2\2\u0274"+
		"\u0275\5<\37\2\u0275\u0276\7\64\2\2\u0276\u0277\7\13\2\2\u0277\u0278\5"+
		"<\37\2\u0278\u0279\7\64\2\2\u0279\u027d\7\23\2\2\u027a\u027c\7\67\2\2"+
		"\u027b\u027a\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e"+
		"\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0282\7\5\2\2\u0281"+
		"\u0283\5\66\34\2\u0282\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0282\3"+
		"\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028a\7\6\2\2\u0287"+
		"\u0289\7\67\2\2\u0288\u0287\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3"+
		"\2\2\2\u028a\u028b\3\2\2\2\u028b\u02ad\3\2\2\2\u028c\u028a\3\2\2\2\u028d"+
		"\u028e\7\b\2\2\u028e\u028f\7\64\2\2\u028f\u0290\7\22\2\2\u0290\u0291\5"+
		"<\37\2\u0291\u0292\7\64\2\2\u0292\u0293\7\13\2\2\u0293\u0294\5<\37\2\u0294"+
		"\u0295\7\64\2\2\u0295\u0296\7\13\2\2\u0296\u0297\5<\37\2\u0297\u0298\7"+
		"\64\2\2\u0298\u029c\7\23\2\2\u0299\u029b\7\67\2\2\u029a\u0299\3\2\2\2"+
		"\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f"+
		"\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a1\7\5\2\2\u02a0\u02a2\5\66\34\2"+
		"\u02a1\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a9\7\6\2\2\u02a6\u02a8\7\67\2\2"+
		"\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa"+
		"\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u021e\3\2\2\2\u02ac"+
		"\u0235\3\2\2\2\u02ac\u0258\3\2\2\2\u02ac\u0271\3\2\2\2\u02ac\u028d\3\2"+
		"\2\2\u02ad9\3\2\2\2\u02ae\u02af\7\b\2\2\u02af\u02b0\5<\37\2\u02b0\u02b1"+
		"\7\64\2\2\u02b1\u02b2\7\5\2\2\u02b2\u02b3\7\62\2\2\u02b3\u02b4\7\4\2\2"+
		"\u02b4\u02b5\7\63\2\2\u02b5\u02b6\7\4\2\2\u02b6\u02b7\7\6\2\2\u02b7\u02c5"+
		"\3\2\2\2\u02b8\u02b9\7\b\2\2\u02b9\u02ba\7\64\2\2\u02ba\u02bb\7%\2\2\u02bb"+
		"\u02bc\7\64\2\2\u02bc\u02bd\7&\2\2\u02bd\u02be\7\64\2\2\u02be\u02bf\7"+
		"\5\2\2\u02bf\u02c0\7\62\2\2\u02c0\u02c1\7\4\2\2\u02c1\u02c2\7\63\2\2\u02c2"+
		"\u02c3\7\4\2\2\u02c3\u02c5\7\6\2\2\u02c4\u02ae\3\2\2\2\u02c4\u02b8\3\2"+
		"\2\2\u02c5;\3\2\2\2\u02c6\u02c7\t\3\2\2\u02c7=\3\2\2\2\u02c8\u02c9\5<"+
		"\37\2\u02c9\u02ce\5\20\t\2\u02ca\u02cb\7\13\2\2\u02cb\u02cc\5<\37\2\u02cc"+
		"\u02cd\5\20\t\2\u02cd\u02cf\3\2\2\2\u02ce\u02ca\3\2\2\2\u02ce\u02cf\3"+
		"\2\2\2\u02cf?\3\2\2\2\u02d0\u02d1\5\20\t\2\u02d1\u02d2\7\22\2\2\u02d2"+
		"\u02d3\7\23\2\2\u02d3\u02da\3\2\2\2\u02d4\u02d5\5\20\t\2\u02d5\u02d6\7"+
		"\22\2\2\u02d6\u02d7\5> \2\u02d7\u02d8\7\23\2\2\u02d8\u02da\3\2\2\2\u02d9"+
		"\u02d0\3\2\2\2\u02d9\u02d4\3\2\2\2\u02daA\3\2\2\2\u02db\u02dc\7\64\2\2"+
		"\u02dc\u02dd\7%\2\2\u02dd\u02e8\7\66\2\2\u02de\u02df\7\64\2\2\u02df\u02e0"+
		"\7&\2\2\u02e0\u02e8\7\66\2\2\u02e1\u02e2\7\64\2\2\u02e2\u02e3\7*\2\2\u02e3"+
		"\u02e8\7\66\2\2\u02e4\u02e5\7\64\2\2\u02e5\u02e6\7+\2\2\u02e6\u02e8\7"+
		"\66\2\2\u02e7\u02db\3\2\2\2\u02e7\u02de\3\2\2\2\u02e7\u02e1\3\2\2\2\u02e7"+
		"\u02e4\3\2\2\2\u02e8C\3\2\2\2\u02e9\u02ea\5B\"\2\u02ea\u02eb\7,\2\2\u02eb"+
		"\u02ec\5B\"\2\u02ec\u02f2\3\2\2\2\u02ed\u02ee\5B\"\2\u02ee\u02ef\7-\2"+
		"\2\u02ef\u02f0\5B\"\2\u02f0\u02f2\3\2\2\2\u02f1\u02e9\3\2\2\2\u02f1\u02ed"+
		"\3\2\2\2\u02f2E\3\2\2\2\u02f3\u030d\b$\1\2\u02f4\u02fc\f\4\2\2\u02f5\u02f6"+
		"\7%\2\2\u02f6\u02fd\7%\2\2\u02f7\u02f8\7&\2\2\u02f8\u02f9\7&\2\2\u02f9"+
		"\u02fd\7&\2\2\u02fa\u02fb\7&\2\2\u02fb\u02fd\7&\2\2\u02fc\u02f5\3\2\2"+
		"\2\u02fc\u02f7\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u030c"+
		"\5F$\5\u02ff\u0306\f\3\2\2\u0300\u0301\7%\2\2\u0301\u0307\7\34\2\2\u0302"+
		"\u0303\7&\2\2\u0303\u0307\7\34\2\2\u0304\u0307\7&\2\2\u0305\u0307\7%\2"+
		"\2\u0306\u0300\3\2\2\2\u0306\u0302\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0305"+
		"\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030c\5F$\4\u0309\u030a\f\5\2\2\u030a"+
		"\u030c\t\4\2\2\u030b\u02f4\3\2\2\2\u030b\u02ff\3\2\2\2\u030b\u0309\3\2"+
		"\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"G\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0315\5F$\2\u0311\u0312\7\13\2\2\u0312"+
		"\u0314\5F$\2\u0313\u0311\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2"+
		"\2\u0315\u0316\3\2\2\2\u0316I\3\2\2\2\u0317\u0315\3\2\2\2QQV_enu|\u0083"+
		"\u008d\u0094\u009b\u00a2\u00aa\u00b1\u00b8\u00bf\u00c2\u00c7\u00ce\u00d3"+
		"\u00d5\u00de\u00e4\u00f0\u00f6\u0100\u0106\u010c\u0110\u0118\u012f\u0154"+
		"\u017c\u0181\u0193\u0199\u01a2\u01ab\u01b4\u01be\u01c2\u01c6\u01d4\u01e2"+
		"\u01e8\u01ee\u01f6\u01fb\u0204\u0215\u021c\u0224\u022b\u0232\u023b\u0242"+
		"\u0248\u024e\u0255\u0261\u0268\u026e\u027d\u0284\u028a\u029c\u02a3\u02a9"+
		"\u02ac\u02c4\u02ce\u02d9\u02e7\u02f1\u02fc\u0306\u030b\u030d\u0315";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}