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
		T__45=46, T__46=47, T__47=48, T__48=49, USING=50, NAMESPACE=51, GET=52, 
		SET=53, ID=54, OBEJCTID=55, INT=56, NEWLINE=57, WS=58;
	public static final int
		RULE_usingDeclaration = 0, RULE_namespaceDeclaration = 1, RULE_prog = 2, 
		RULE_classIdentifier = 3, RULE_modifierType = 4, RULE_objectType = 5, 
		RULE_multipleParameters = 6, RULE_csharpType = 7, RULE_stat = 8, RULE_multipleVariable = 9, 
		RULE_createNewObject = 10, RULE_whileblock = 11, RULE_ifblock = 12, RULE_elseifblock = 13, 
		RULE_catches = 14, RULE_catchClause = 15, RULE_forControl = 16, RULE_forInit = 17, 
		RULE_forExpression = 18, RULE_forUpdate = 19, RULE_parExpression = 20, 
		RULE_switchLabel = 21, RULE_switchBlock = 22, RULE_switchBlockStatementGroup = 23, 
		RULE_blockStatement = 24, RULE_block = 25, RULE_condition = 26, RULE_expr = 27, 
		RULE_variableInCode = 28, RULE_construtor = 29, RULE_variableAndMethodsGetSet = 30, 
		RULE_methodParameters = 31, RULE_methodClass = 32, RULE_ifexpr = 33, RULE_multipleExpr = 34, 
		RULE_expression = 35, RULE_expressionList = 36;
	public static final String[] ruleNames = {
		"usingDeclaration", "namespaceDeclaration", "prog", "classIdentifier", 
		"modifierType", "objectType", "multipleParameters", "csharpType", "stat", 
		"multipleVariable", "createNewObject", "whileblock", "ifblock", "elseifblock", 
		"catches", "catchClause", "forControl", "forInit", "forExpression", "forUpdate", 
		"parExpression", "switchLabel", "switchBlock", "switchBlockStatementGroup", 
		"blockStatement", "block", "condition", "expr", "variableInCode", "construtor", 
		"variableAndMethodsGetSet", "methodParameters", "methodClass", "ifexpr", 
		"multipleExpr", "expression", "expressionList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "'{'", "'}'", "'-'", "'class'", "':'", "','", "'public'", 
		"'private'", "'protected'", "'void'", "'int'", "'string'", "'bool'", "'decimal'", 
		"'float'", "'boolean'", "'object'", "'List'", "'<'", "'>'", "'IList'", 
		"'while'", "'('", "')'", "'if'", "'else if'", "'else'", "'for'", "'do'", 
		"'try'", "'finally'", "'switch'", "'='", "'_'", "'new'", "'catch'", "'case'", 
		"'default'", "'['", "']'", "'()'", "'>='", "'<='", "'||'", "'&&'", "'++'", 
		"'--'", "'using'", "'namespace'", "'get'", "'set'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "USING", "NAMESPACE", "GET", "SET", "ID", "OBEJCTID", "INT", 
		"NEWLINE", "WS"
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
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(74);
					match(USING);
					setState(75);
					match(ID);
					setState(76);
					match(T__0);
					setState(77);
					match(ID);
					setState(78);
					match(T__0);
					setState(79);
					match(ID);
					setState(80);
					match(T__1);
					}
				}

				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(83);
					match(NEWLINE);
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				namespaceDeclaration();
				setState(90);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(92);
					match(NEWLINE);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				namespaceDeclaration();
				setState(99);
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
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(NAMESPACE);
				setState(104);
				match(ID);
				setState(105);
				match(T__0);
				setState(106);
				match(ID);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(107);
					match(NEWLINE);
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(T__2);
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						match(NEWLINE);
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(120);
				classIdentifier();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(121);
					match(NEWLINE);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__3);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(128);
					match(NEWLINE);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(NAMESPACE);
				setState(135);
				match(ID);
				setState(136);
				match(T__4);
				setState(137);
				match(ID);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(138);
					match(NEWLINE);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(T__2);
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(145);
						match(NEWLINE);
						}
						} 
					}
					setState(150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(151);
				classIdentifier();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(152);
					match(NEWLINE);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__3);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(159);
					match(NEWLINE);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(NAMESPACE);
				setState(166);
				match(ID);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(167);
					match(NEWLINE);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(T__2);
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(174);
						match(NEWLINE);
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(180);
				classIdentifier();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(181);
					match(NEWLINE);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(T__3);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(188);
					match(NEWLINE);
					}
					}
					setState(193);
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
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << USING) | (1L << NAMESPACE) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(196);
					usingDeclaration();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				namespaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(203);
					classIdentifier();
					}
					}
					setState(206); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << NEWLINE))) != 0) );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(208);
					stat();
					}
					}
					setState(211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0) );
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
		public ModifierTypeContext modifierType() {
			return getRuleContext(ModifierTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CsharpParser.ID, 0); }
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
		public List<ObjectTypeContext> objectType() {
			return getRuleContexts(ObjectTypeContext.class);
		}
		public ObjectTypeContext objectType(int i) {
			return getRuleContext(ObjectTypeContext.class,i);
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
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				modifierType();
				setState(216);
				match(T__5);
				setState(217);
				match(ID);
				setState(218);
				match(T__2);
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(219);
					stat();
					}
					}
					setState(222); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0) );
				setState(224);
				match(T__3);
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(225);
						match(NEWLINE);
						}
						} 
					}
					setState(230);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				modifierType();
				setState(232);
				match(T__5);
				setState(233);
				match(ID);
				setState(234);
				match(T__6);
				setState(235);
				objectType();
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(236);
						match(T__7);
						setState(237);
						objectType();
						}
						} 
					}
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(243);
					match(NEWLINE);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__2);
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					stat();
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0) );
				setState(255);
				match(T__3);
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(256);
						match(NEWLINE);
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
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

	public static class ModifierTypeContext extends ParserRuleContext {
		public ModifierTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitModifierType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierTypeContext modifierType() throws RecognitionException {
		ModifierTypeContext _localctx = new ModifierTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifierType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CsharpParser.ID, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objectType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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

	public static class MultipleParametersContext extends ParserRuleContext {
		public List<CsharpTypeContext> csharpType() {
			return getRuleContexts(CsharpTypeContext.class);
		}
		public CsharpTypeContext csharpType(int i) {
			return getRuleContext(CsharpTypeContext.class,i);
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
		enterRule(_localctx, 12, RULE_multipleParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			csharpType();
			setState(270);
			match(ID);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(271);
					match(T__7);
					setState(272);
					csharpType();
					setState(273);
					match(ID);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class CsharpTypeContext extends ParserRuleContext {
		public CsharpTypeContext csharpType() {
			return getRuleContext(CsharpTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CsharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CsharpParser.ID, i);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public CsharpTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharpType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsharpVisitor ) return ((CsharpVisitor<? extends T>)visitor).visitCsharpType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsharpTypeContext csharpType() throws RecognitionException {
		CsharpTypeContext _localctx = new CsharpTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_csharpType);
		try {
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(T__13);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(T__14);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(T__15);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(T__16);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(286);
				match(T__17);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(287);
				match(T__18);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(288);
				match(T__19);
				setState(289);
				match(T__20);
				setState(290);
				csharpType();
				setState(291);
				match(T__21);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(293);
				match(T__19);
				setState(294);
				match(T__20);
				setState(295);
				match(ID);
				setState(296);
				match(T__21);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(297);
				match(T__22);
				setState(298);
				match(T__20);
				setState(299);
				csharpType();
				setState(300);
				match(T__21);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(302);
				match(T__22);
				setState(303);
				match(T__20);
				setState(304);
				match(ID);
				setState(305);
				match(T__21);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(306);
				match(ID);
				setState(307);
				match(T__20);
				setState(308);
				csharpType();
				setState(309);
				match(T__21);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(311);
				match(ID);
				setState(312);
				match(T__20);
				setState(313);
				match(ID);
				setState(314);
				match(T__21);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(315);
				objectType();
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
		enterRule(_localctx, 16, RULE_stat);
		try {
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(T__23);
				setState(319);
				match(T__24);
				setState(320);
				expr();
				setState(321);
				match(T__25);
				setState(322);
				stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				whileblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(T__26);
				setState(326);
				match(T__24);
				setState(327);
				ifexpr();
				setState(328);
				match(T__25);
				setState(329);
				stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				match(T__26);
				setState(332);
				match(T__24);
				setState(333);
				ifexpr();
				setState(334);
				match(T__25);
				setState(335);
				ifblock();
				setState(337);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(336);
					stat();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				match(T__27);
				setState(340);
				match(T__24);
				setState(341);
				expr();
				setState(342);
				match(T__25);
				setState(343);
				stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(345);
				elseifblock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				match(T__28);
				setState(347);
				stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(348);
				match(T__28);
				setState(349);
				match(T__2);
				setState(350);
				stat();
				setState(351);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(353);
				match(T__29);
				setState(354);
				match(T__24);
				setState(355);
				forControl();
				setState(356);
				match(T__25);
				setState(357);
				stat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(359);
				match(T__30);
				setState(360);
				stat();
				setState(361);
				match(T__23);
				setState(362);
				parExpression();
				setState(363);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(365);
				match(T__31);
				setState(366);
				block();
				setState(374);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(367);
					catches();
					setState(368);
					match(T__32);
					setState(369);
					block();
					}
					break;
				case 2:
					{
					setState(371);
					catches();
					}
					break;
				case 3:
					{
					setState(372);
					match(T__32);
					setState(373);
					block();
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(376);
				match(T__33);
				setState(377);
				match(T__24);
				setState(378);
				match(INT);
				setState(379);
				match(T__25);
				setState(380);
				switchBlock();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(381);
				match(ID);
				setState(382);
				match(T__24);
				setState(383);
				match(T__25);
				setState(384);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(385);
				match(ID);
				setState(386);
				match(T__0);
				setState(387);
				match(ID);
				setState(388);
				match(T__24);
				setState(389);
				match(T__25);
				setState(390);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(391);
				match(ID);
				setState(392);
				match(T__24);
				setState(393);
				match(T__25);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(394);
				createNewObject();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(395);
				multipleVariable();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(396);
				multipleExpr();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(397);
				variableAndMethodsGetSet();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(398);
				construtor();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(399);
				match(NEWLINE);
				setState(400);
				match(ID);
				setState(401);
				match(T__24);
				setState(402);
				match(T__25);
				setState(403);
				match(T__1);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(404);
				expr();
				setState(405);
				match(NEWLINE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(407);
				match(ID);
				setState(408);
				match(T__34);
				setState(409);
				expr();
				setState(410);
				match(NEWLINE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(412);
				match(NEWLINE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(413);
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
		enterRule(_localctx, 18, RULE_multipleVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(ID);
			setState(419);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(417);
				match(T__35);
				setState(418);
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
		enterRule(_localctx, 20, RULE_createNewObject);
		try {
			setState(437);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(ID);
				setState(422);
				match(ID);
				setState(423);
				match(T__34);
				setState(424);
				match(T__36);
				setState(425);
				match(ID);
				setState(426);
				match(T__24);
				setState(427);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(ID);
				setState(429);
				match(ID);
				setState(430);
				match(T__34);
				setState(431);
				match(T__36);
				setState(432);
				match(ID);
				setState(433);
				match(T__24);
				setState(434);
				multipleParameters();
				setState(435);
				match(T__25);
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
		enterRule(_localctx, 22, RULE_whileblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__2);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(440);
				stat();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
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
		enterRule(_localctx, 24, RULE_ifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__2);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(449);
				stat();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
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
		enterRule(_localctx, 26, RULE_elseifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(T__2);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(458);
				stat();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
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
		enterRule(_localctx, 28, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			catchClause();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(467);
				catchClause();
				}
				}
				setState(472);
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
		enterRule(_localctx, 30, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__37);
			setState(474);
			match(T__24);
			setState(475);
			expr();
			setState(476);
			match(T__25);
			setState(477);
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
		enterRule(_localctx, 32, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(479);
				forInit();
				}
			}

			setState(482);
			match(T__1);
			setState(484);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(483);
				forExpression();
				}
			}

			setState(486);
			match(T__1);
			setState(488);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(487);
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
		enterRule(_localctx, 34, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(ID);
			setState(491);
			match(T__34);
			setState(492);
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
		enterRule(_localctx, 36, RULE_forExpression);
		try {
			setState(502);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(ID);
				setState(495);
				expression(0);
				setState(496);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(ID);
				setState(499);
				expression(0);
				setState(500);
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
		enterRule(_localctx, 38, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(ID);
			setState(505);
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
		enterRule(_localctx, 40, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(T__24);
			setState(508);
			expr();
			setState(509);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_switchLabel);
		try {
			setState(516);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(T__38);
				setState(512);
				match(INT);
				setState(513);
				match(T__6);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(T__39);
				setState(515);
				match(T__6);
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
		enterRule(_localctx, 44, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__2);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38 || _la==T__39) {
				{
				{
				setState(525);
				switchLabel();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
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
		enterRule(_localctx, 46, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(534); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(533);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(536); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(538);
				blockStatement();
				}
				}
				setState(543);
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
		enterRule(_localctx, 48, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
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
		enterRule(_localctx, 50, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(T__2);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << ID) | (1L << INT) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(547);
				stat();
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553);
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
		enterRule(_localctx, 52, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		enterRule(_localctx, 54, RULE_expr);
		try {
			setState(567);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(ID);
				setState(558);
				match(T__40);
				setState(559);
				expr();
				setState(560);
				match(T__41);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				match(T__24);
				setState(563);
				expr();
				setState(564);
				match(T__25);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
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
		enterRule(_localctx, 56, RULE_variableInCode);
		try {
			setState(574);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(ID);
				setState(570);
				match(T__34);
				setState(571);
				match(ID);
				setState(572);
				match(T__1);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
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
		public ModifierTypeContext modifierType() {
			return getRuleContext(ModifierTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CsharpParser.ID, 0); }
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
		public MultipleParametersContext multipleParameters() {
			return getRuleContext(MultipleParametersContext.class,0);
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
		enterRule(_localctx, 58, RULE_construtor);
		int _la;
		try {
			int _alt;
			setState(658);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				modifierType();
				setState(577);
				match(ID);
				setState(578);
				match(T__42);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(579);
					match(NEWLINE);
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(585);
				match(T__2);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(586);
					match(NEWLINE);
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
				match(T__3);
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(593);
						match(NEWLINE);
						}
						} 
					}
					setState(598);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				modifierType();
				setState(600);
				match(ID);
				setState(601);
				match(T__42);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(602);
					match(NEWLINE);
					}
					}
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(608);
				match(T__2);
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(609);
						match(NEWLINE);
						}
						} 
					}
					setState(614);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(615);
						variableInCode();
						}
						} 
					}
					setState(620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(621);
					match(NEWLINE);
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(627);
				match(T__3);
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(628);
						match(NEWLINE);
						}
						} 
					}
					setState(633);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				modifierType();
				setState(635);
				match(ID);
				setState(636);
				match(T__24);
				setState(637);
				multipleParameters();
				setState(638);
				match(T__25);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(639);
					match(NEWLINE);
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(645);
				match(T__2);
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(646);
					variableInCode();
					}
					}
					setState(649); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NEWLINE );
				setState(651);
				match(T__3);
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(652);
						match(NEWLINE);
						}
						} 
					}
					setState(657);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		public ModifierTypeContext modifierType() {
			return getRuleContext(ModifierTypeContext.class,0);
		}
		public CsharpTypeContext csharpType() {
			return getRuleContext(CsharpTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CsharpParser.ID, 0); }
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
		enterRule(_localctx, 60, RULE_variableAndMethodsGetSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			modifierType();
			setState(661);
			csharpType();
			setState(662);
			match(ID);
			setState(663);
			match(T__2);
			setState(664);
			match(GET);
			setState(665);
			match(T__1);
			setState(666);
			match(SET);
			setState(667);
			match(T__1);
			setState(668);
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

	public static class MethodParametersContext extends ParserRuleContext {
		public List<CsharpTypeContext> csharpType() {
			return getRuleContexts(CsharpTypeContext.class);
		}
		public CsharpTypeContext csharpType(int i) {
			return getRuleContext(CsharpTypeContext.class,i);
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
		enterRule(_localctx, 62, RULE_methodParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			csharpType();
			setState(671);
			multipleVariable();
			setState(676);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(672);
				match(T__7);
				setState(673);
				csharpType();
				setState(674);
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
		enterRule(_localctx, 64, RULE_methodClass);
		try {
			setState(687);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				multipleVariable();
				setState(679);
				match(T__24);
				setState(680);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				multipleVariable();
				setState(683);
				match(T__24);
				setState(684);
				methodParameters();
				setState(685);
				match(T__25);
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
		enterRule(_localctx, 66, RULE_ifexpr);
		try {
			setState(701);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				match(ID);
				setState(690);
				match(T__20);
				setState(691);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				match(ID);
				setState(693);
				match(T__21);
				setState(694);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				match(ID);
				setState(696);
				match(T__43);
				setState(697);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(698);
				match(ID);
				setState(699);
				match(T__44);
				setState(700);
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
		enterRule(_localctx, 68, RULE_multipleExpr);
		try {
			setState(711);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				ifexpr();
				{
				setState(704);
				match(T__45);
				setState(705);
				ifexpr();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				ifexpr();
				{
				setState(708);
				match(T__46);
				setState(709);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(737);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(714);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(722);
						switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
						case 1:
							{
							setState(715);
							match(T__20);
							setState(716);
							match(T__20);
							}
							break;
						case 2:
							{
							setState(717);
							match(T__21);
							setState(718);
							match(T__21);
							setState(719);
							match(T__21);
							}
							break;
						case 3:
							{
							setState(720);
							match(T__21);
							setState(721);
							match(T__21);
							}
							break;
						}
						setState(724);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(725);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(732);
						switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
						case 1:
							{
							setState(726);
							match(T__20);
							setState(727);
							match(T__34);
							}
							break;
						case 2:
							{
							setState(728);
							match(T__21);
							setState(729);
							match(T__34);
							}
							break;
						case 3:
							{
							setState(730);
							match(T__21);
							}
							break;
						case 4:
							{
							setState(731);
							match(T__20);
							}
							break;
						}
						setState(734);
						expression(2);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(736);
						_la = _input.LA(1);
						if ( !(_la==T__47 || _la==T__48) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
		enterRule(_localctx, 72, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			expression(0);
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(743);
				match(T__7);
				setState(744);
				expression(0);
				}
				}
				setState(749);
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
		case 35:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\u02f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2T\n"+
		"\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\2\3\2\7\2`\n\2\f\2\16\2c\13\2"+
		"\3\2\3\2\3\2\5\2h\n\2\3\3\3\3\3\3\3\3\3\3\7\3o\n\3\f\3\16\3r\13\3\3\3"+
		"\3\3\7\3v\n\3\f\3\16\3y\13\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3"+
		"\3\3\7\3\u0084\n\3\f\3\16\3\u0087\13\3\3\3\3\3\3\3\3\3\3\3\7\3\u008e\n"+
		"\3\f\3\16\3\u0091\13\3\3\3\3\3\7\3\u0095\n\3\f\3\16\3\u0098\13\3\3\3\3"+
		"\3\7\3\u009c\n\3\f\3\16\3\u009f\13\3\3\3\3\3\7\3\u00a3\n\3\f\3\16\3\u00a6"+
		"\13\3\3\3\3\3\3\3\7\3\u00ab\n\3\f\3\16\3\u00ae\13\3\3\3\3\3\7\3\u00b2"+
		"\n\3\f\3\16\3\u00b5\13\3\3\3\3\3\7\3\u00b9\n\3\f\3\16\3\u00bc\13\3\3\3"+
		"\3\3\7\3\u00c0\n\3\f\3\16\3\u00c3\13\3\5\3\u00c5\n\3\3\4\7\4\u00c8\n\4"+
		"\f\4\16\4\u00cb\13\4\3\4\3\4\6\4\u00cf\n\4\r\4\16\4\u00d0\3\4\6\4\u00d4"+
		"\n\4\r\4\16\4\u00d5\5\4\u00d8\n\4\3\5\3\5\3\5\3\5\3\5\6\5\u00df\n\5\r"+
		"\5\16\5\u00e0\3\5\3\5\7\5\u00e5\n\5\f\5\16\5\u00e8\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u00f1\n\5\f\5\16\5\u00f4\13\5\3\5\7\5\u00f7\n\5\f\5"+
		"\16\5\u00fa\13\5\3\5\3\5\6\5\u00fe\n\5\r\5\16\5\u00ff\3\5\3\5\7\5\u0104"+
		"\n\5\f\5\16\5\u0107\13\5\3\5\5\5\u010a\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0116\n\b\f\b\16\b\u0119\13\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u013f\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0154\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0179\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01a1\n\n\3\13\3\13\3\13"+
		"\5\13\u01a6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u01b8\n\f\3\r\3\r\7\r\u01bc\n\r\f\r\16\r\u01bf\13\r\3\r"+
		"\3\r\3\16\3\16\7\16\u01c5\n\16\f\16\16\16\u01c8\13\16\3\16\3\16\3\17\3"+
		"\17\7\17\u01ce\n\17\f\17\16\17\u01d1\13\17\3\17\3\17\3\20\3\20\7\20\u01d7"+
		"\n\20\f\20\16\20\u01da\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\5\22\u01e3"+
		"\n\22\3\22\3\22\5\22\u01e7\n\22\3\22\3\22\5\22\u01eb\n\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01f9\n\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0207\n\27"+
		"\3\30\3\30\7\30\u020b\n\30\f\30\16\30\u020e\13\30\3\30\7\30\u0211\n\30"+
		"\f\30\16\30\u0214\13\30\3\30\3\30\3\31\6\31\u0219\n\31\r\31\16\31\u021a"+
		"\3\31\7\31\u021e\n\31\f\31\16\31\u0221\13\31\3\32\3\32\3\33\3\33\7\33"+
		"\u0227\n\33\f\33\16\33\u022a\13\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u023a\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0241\n\36\3\37\3\37\3\37\3\37\7\37\u0247\n\37\f\37\16\37\u024a"+
		"\13\37\3\37\3\37\7\37\u024e\n\37\f\37\16\37\u0251\13\37\3\37\3\37\7\37"+
		"\u0255\n\37\f\37\16\37\u0258\13\37\3\37\3\37\3\37\3\37\7\37\u025e\n\37"+
		"\f\37\16\37\u0261\13\37\3\37\3\37\7\37\u0265\n\37\f\37\16\37\u0268\13"+
		"\37\3\37\7\37\u026b\n\37\f\37\16\37\u026e\13\37\3\37\7\37\u0271\n\37\f"+
		"\37\16\37\u0274\13\37\3\37\3\37\7\37\u0278\n\37\f\37\16\37\u027b\13\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0283\n\37\f\37\16\37\u0286\13\37"+
		"\3\37\3\37\6\37\u028a\n\37\r\37\16\37\u028b\3\37\3\37\7\37\u0290\n\37"+
		"\f\37\16\37\u0293\13\37\5\37\u0295\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3!\5!\u02a7\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u02b2\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02c0\n#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\5$\u02ca\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u02d5\n%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u02df\n%\3%\3%\3%\7%\u02e4\n%\f%\16%\u02e7\13%"+
		"\3&\3&\3&\7&\u02ec\n&\f&\16&\u02ef\13&\3&\4\u00f2\u0117\3H\'\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\4\3\2\13"+
		"\r\3\2\62\63\u0344\2g\3\2\2\2\4\u00c4\3\2\2\2\6\u00d7\3\2\2\2\b\u0109"+
		"\3\2\2\2\n\u010b\3\2\2\2\f\u010d\3\2\2\2\16\u010f\3\2\2\2\20\u013e\3\2"+
		"\2\2\22\u01a0\3\2\2\2\24\u01a2\3\2\2\2\26\u01b7\3\2\2\2\30\u01b9\3\2\2"+
		"\2\32\u01c2\3\2\2\2\34\u01cb\3\2\2\2\36\u01d4\3\2\2\2 \u01db\3\2\2\2\""+
		"\u01e2\3\2\2\2$\u01ec\3\2\2\2&\u01f8\3\2\2\2(\u01fa\3\2\2\2*\u01fd\3\2"+
		"\2\2,\u0206\3\2\2\2.\u0208\3\2\2\2\60\u0218\3\2\2\2\62\u0222\3\2\2\2\64"+
		"\u0224\3\2\2\2\66\u022d\3\2\2\28\u0239\3\2\2\2:\u0240\3\2\2\2<\u0294\3"+
		"\2\2\2>\u0296\3\2\2\2@\u02a0\3\2\2\2B\u02b1\3\2\2\2D\u02bf\3\2\2\2F\u02c9"+
		"\3\2\2\2H\u02cb\3\2\2\2J\u02e8\3\2\2\2LM\7\64\2\2MN\78\2\2NO\7\3\2\2O"+
		"P\78\2\2PQ\7\3\2\2QR\78\2\2RT\7\4\2\2SL\3\2\2\2ST\3\2\2\2TX\3\2\2\2UW"+
		"\7;\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\"+
		"\5\4\3\2\\]\7\2\2\3]h\3\2\2\2^`\7;\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2a"+
		"b\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\5\4\3\2ef\7\2\2\3fh\3\2\2\2gS\3\2\2\2"+
		"ga\3\2\2\2h\3\3\2\2\2ij\7\65\2\2jk\78\2\2kl\7\3\2\2lp\78\2\2mo\7;\2\2"+
		"nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2sw\7\5\2\2"+
		"tv\7;\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2"+
		"z~\5\b\5\2{}\7;\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0085\7\6\2\2\u0082\u0084\7;\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u00c5\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\65\2\2\u0089"+
		"\u008a\78\2\2\u008a\u008b\7\7\2\2\u008b\u008f\78\2\2\u008c\u008e\7;\2"+
		"\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0096\7\5\2\2\u0093"+
		"\u0095\7;\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009d\5\b\5\2\u009a\u009c\7;\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a4\7\6\2\2\u00a1\u00a3\7;\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00c5\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\65\2\2\u00a8\u00ac\7"+
		"8\2\2\u00a9\u00ab\7;\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b3\7\5\2\2\u00b0\u00b2\7;\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ba\5\b\5\2\u00b7\u00b9\7;\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c1\7\6\2\2\u00be"+
		"\u00c0\7;\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"i\3\2\2\2\u00c4\u0088\3\2\2\2\u00c4\u00a7\3\2\2\2\u00c5\5\3\2\2\2\u00c6"+
		"\u00c8\5\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00d8\5\4\3\2\u00cd\u00cf\5\b\5\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d8\3\2\2\2\u00d2"+
		"\u00d4\5\22\n\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00c9\3\2\2\2\u00d7"+
		"\u00cc\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\7\3\2\2\2"+
		"\u00d9\u00da\5\n\6\2\u00da\u00db\7\b\2\2\u00db\u00dc\78\2\2\u00dc\u00de"+
		"\7\5\2\2\u00dd\u00df\5\22\n\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e6"+
		"\7\6\2\2\u00e3\u00e5\7;\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u010a\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00ea\5\n\6\2\u00ea\u00eb\7\b\2\2\u00eb\u00ec\78\2\2\u00ec"+
		"\u00ed\7\t\2\2\u00ed\u00f2\5\f\7\2\u00ee\u00ef\7\n\2\2\u00ef\u00f1\5\f"+
		"\7\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f8\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7;"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\5"+
		"\2\2\u00fc\u00fe\5\22\n\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0105\7\6"+
		"\2\2\u0102\u0104\7;\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u010a\7;\2\2\u0109\u00d9\3\2\2\2\u0109\u00e9\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\t\3\2\2\2\u010b\u010c\t\2\2\2\u010c\13\3\2\2\2\u010d"+
		"\u010e\78\2\2\u010e\r\3\2\2\2\u010f\u0110\5\20\t\2\u0110\u0117\78\2\2"+
		"\u0111\u0112\7\n\2\2\u0112\u0113\5\20\t\2\u0113\u0114\78\2\2\u0114\u0116"+
		"\3\2\2\2\u0115\u0111\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0118\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\17\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u013f\7\16\2"+
		"\2\u011b\u013f\7\17\2\2\u011c\u013f\7\20\2\2\u011d\u013f\7\21\2\2\u011e"+
		"\u013f\7\22\2\2\u011f\u013f\7\23\2\2\u0120\u013f\7\24\2\2\u0121\u013f"+
		"\7\25\2\2\u0122\u0123\7\26\2\2\u0123\u0124\7\27\2\2\u0124\u0125\5\20\t"+
		"\2\u0125\u0126\7\30\2\2\u0126\u013f\3\2\2\2\u0127\u0128\7\26\2\2\u0128"+
		"\u0129\7\27\2\2\u0129\u012a\78\2\2\u012a\u013f\7\30\2\2\u012b\u012c\7"+
		"\31\2\2\u012c\u012d\7\27\2\2\u012d\u012e\5\20\t\2\u012e\u012f\7\30\2\2"+
		"\u012f\u013f\3\2\2\2\u0130\u0131\7\31\2\2\u0131\u0132\7\27\2\2\u0132\u0133"+
		"\78\2\2\u0133\u013f\7\30\2\2\u0134\u0135\78\2\2\u0135\u0136\7\27\2\2\u0136"+
		"\u0137\5\20\t\2\u0137\u0138\7\30\2\2\u0138\u013f\3\2\2\2\u0139\u013a\7"+
		"8\2\2\u013a\u013b\7\27\2\2\u013b\u013c\78\2\2\u013c\u013f\7\30\2\2\u013d"+
		"\u013f\5\f\7\2\u013e\u011a\3\2\2\2\u013e\u011b\3\2\2\2\u013e\u011c\3\2"+
		"\2\2\u013e\u011d\3\2\2\2\u013e\u011e\3\2\2\2\u013e\u011f\3\2\2\2\u013e"+
		"\u0120\3\2\2\2\u013e\u0121\3\2\2\2\u013e\u0122\3\2\2\2\u013e\u0127\3\2"+
		"\2\2\u013e\u012b\3\2\2\2\u013e\u0130\3\2\2\2\u013e\u0134\3\2\2\2\u013e"+
		"\u0139\3\2\2\2\u013e\u013d\3\2\2\2\u013f\21\3\2\2\2\u0140\u0141\7\32\2"+
		"\2\u0141\u0142\7\33\2\2\u0142\u0143\58\35\2\u0143\u0144\7\34\2\2\u0144"+
		"\u0145\5\22\n\2\u0145\u01a1\3\2\2\2\u0146\u01a1\5\30\r\2\u0147\u0148\7"+
		"\35\2\2\u0148\u0149\7\33\2\2\u0149\u014a\5D#\2\u014a\u014b\7\34\2\2\u014b"+
		"\u014c\5\22\n\2\u014c\u01a1\3\2\2\2\u014d\u014e\7\35\2\2\u014e\u014f\7"+
		"\33\2\2\u014f\u0150\5D#\2\u0150\u0151\7\34\2\2\u0151\u0153\5\32\16\2\u0152"+
		"\u0154\5\22\n\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u01a1\3"+
		"\2\2\2\u0155\u0156\7\36\2\2\u0156\u0157\7\33\2\2\u0157\u0158\58\35\2\u0158"+
		"\u0159\7\34\2\2\u0159\u015a\5\22\n\2\u015a\u01a1\3\2\2\2\u015b\u01a1\5"+
		"\34\17\2\u015c\u015d\7\37\2\2\u015d\u01a1\5\22\n\2\u015e\u015f\7\37\2"+
		"\2\u015f\u0160\7\5\2\2\u0160\u0161\5\22\n\2\u0161\u0162\7\6\2\2\u0162"+
		"\u01a1\3\2\2\2\u0163\u0164\7 \2\2\u0164\u0165\7\33\2\2\u0165\u0166\5\""+
		"\22\2\u0166\u0167\7\34\2\2\u0167\u0168\5\22\n\2\u0168\u01a1\3\2\2\2\u0169"+
		"\u016a\7!\2\2\u016a\u016b\5\22\n\2\u016b\u016c\7\32\2\2\u016c\u016d\5"+
		"*\26\2\u016d\u016e\7\4\2\2\u016e\u01a1\3\2\2\2\u016f\u0170\7\"\2\2\u0170"+
		"\u0178\5\64\33\2\u0171\u0172\5\36\20\2\u0172\u0173\7#\2\2\u0173\u0174"+
		"\5\64\33\2\u0174\u0179\3\2\2\2\u0175\u0179\5\36\20\2\u0176\u0177\7#\2"+
		"\2\u0177\u0179\5\64\33\2\u0178\u0171\3\2\2\2\u0178\u0175\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u01a1\3\2\2\2\u017a\u017b\7$\2\2\u017b\u017c\7\33"+
		"\2\2\u017c\u017d\7:\2\2\u017d\u017e\7\34\2\2\u017e\u01a1\5.\30\2\u017f"+
		"\u0180\78\2\2\u0180\u0181\7\33\2\2\u0181\u0182\7\34\2\2\u0182\u01a1\7"+
		"\4\2\2\u0183\u0184\78\2\2\u0184\u0185\7\3\2\2\u0185\u0186\78\2\2\u0186"+
		"\u0187\7\33\2\2\u0187\u0188\7\34\2\2\u0188\u01a1\7\4\2\2\u0189\u018a\7"+
		"8\2\2\u018a\u018b\7\33\2\2\u018b\u01a1\7\34\2\2\u018c\u01a1\5\26\f\2\u018d"+
		"\u01a1\5\24\13\2\u018e\u01a1\5F$\2\u018f\u01a1\5> \2\u0190\u01a1\5<\37"+
		"\2\u0191\u0192\7;\2\2\u0192\u0193\78\2\2\u0193\u0194\7\33\2\2\u0194\u0195"+
		"\7\34\2\2\u0195\u01a1\7\4\2\2\u0196\u0197\58\35\2\u0197\u0198\7;\2\2\u0198"+
		"\u01a1\3\2\2\2\u0199\u019a\78\2\2\u019a\u019b\7%\2\2\u019b\u019c\58\35"+
		"\2\u019c\u019d\7;\2\2\u019d\u01a1\3\2\2\2\u019e\u01a1\7;\2\2\u019f\u01a1"+
		"\7<\2\2\u01a0\u0140\3\2\2\2\u01a0\u0146\3\2\2\2\u01a0\u0147\3\2\2\2\u01a0"+
		"\u014d\3\2\2\2\u01a0\u0155\3\2\2\2\u01a0\u015b\3\2\2\2\u01a0\u015c\3\2"+
		"\2\2\u01a0\u015e\3\2\2\2\u01a0\u0163\3\2\2\2\u01a0\u0169\3\2\2\2\u01a0"+
		"\u016f\3\2\2\2\u01a0\u017a\3\2\2\2\u01a0\u017f\3\2\2\2\u01a0\u0183\3\2"+
		"\2\2\u01a0\u0189\3\2\2\2\u01a0\u018c\3\2\2\2\u01a0\u018d\3\2\2\2\u01a0"+
		"\u018e\3\2\2\2\u01a0\u018f\3\2\2\2\u01a0\u0190\3\2\2\2\u01a0\u0191\3\2"+
		"\2\2\u01a0\u0196\3\2\2\2\u01a0\u0199\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u019f\3\2\2\2\u01a1\23\3\2\2\2\u01a2\u01a5\78\2\2\u01a3\u01a4\7&\2\2"+
		"\u01a4\u01a6\78\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\25\3"+
		"\2\2\2\u01a7\u01a8\78\2\2\u01a8\u01a9\78\2\2\u01a9\u01aa\7%\2\2\u01aa"+
		"\u01ab\7\'\2\2\u01ab\u01ac\78\2\2\u01ac\u01ad\7\33\2\2\u01ad\u01b8\7\34"+
		"\2\2\u01ae\u01af\78\2\2\u01af\u01b0\78\2\2\u01b0\u01b1\7%\2\2\u01b1\u01b2"+
		"\7\'\2\2\u01b2\u01b3\78\2\2\u01b3\u01b4\7\33\2\2\u01b4\u01b5\5\16\b\2"+
		"\u01b5\u01b6\7\34\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01a7\3\2\2\2\u01b7\u01ae"+
		"\3\2\2\2\u01b8\27\3\2\2\2\u01b9\u01bd\7\5\2\2\u01ba\u01bc\5\22\n\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\7\6\2\2\u01c1"+
		"\31\3\2\2\2\u01c2\u01c6\7\5\2\2\u01c3\u01c5\5\22\n\2\u01c4\u01c3\3\2\2"+
		"\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7\6\2\2\u01ca\33\3\2\2\2\u01cb"+
		"\u01cf\7\5\2\2\u01cc\u01ce\5\22\n\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3"+
		"\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d2\u01d3\7\6\2\2\u01d3\35\3\2\2\2\u01d4\u01d8\5 \21"+
		"\2\u01d5\u01d7\5 \21\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\37\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01dc\7(\2\2\u01dc\u01dd\7\33\2\2\u01dd\u01de\58\35\2\u01de\u01df\7\34"+
		"\2\2\u01df\u01e0\5\64\33\2\u01e0!\3\2\2\2\u01e1\u01e3\5$\23\2\u01e2\u01e1"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\7\4\2\2\u01e5"+
		"\u01e7\5&\24\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\u01ea\7\4\2\2\u01e9\u01eb\5(\25\2\u01ea\u01e9\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb#\3\2\2\2\u01ec\u01ed\78\2\2\u01ed\u01ee\7%\2\2\u01ee"+
		"\u01ef\5\66\34\2\u01ef%\3\2\2\2\u01f0\u01f1\78\2\2\u01f1\u01f2\5H%\2\u01f2"+
		"\u01f3\78\2\2\u01f3\u01f9\3\2\2\2\u01f4\u01f5\78\2\2\u01f5\u01f6\5H%\2"+
		"\u01f6\u01f7\7:\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8\u01f4"+
		"\3\2\2\2\u01f9\'\3\2\2\2\u01fa\u01fb\78\2\2\u01fb\u01fc\5H%\2\u01fc)\3"+
		"\2\2\2\u01fd\u01fe\7\33\2\2\u01fe\u01ff\58\35\2\u01ff\u0200\7\34\2\2\u0200"+
		"+\3\2\2\2\u0201\u0202\7)\2\2\u0202\u0203\7:\2\2\u0203\u0207\7\t\2\2\u0204"+
		"\u0205\7*\2\2\u0205\u0207\7\t\2\2\u0206\u0201\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0207-\3\2\2\2\u0208\u020c\7\5\2\2\u0209\u020b\5\60\31\2\u020a\u0209"+
		"\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u0212\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\5,\27\2\u0210\u020f\3\2"+
		"\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7\6\2\2\u0216/\3\2\2\2"+
		"\u0217\u0219\5,\27\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021f\3\2\2\2\u021c\u021e\5\62\32\2"+
		"\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\61\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\5\22\n\2\u0223"+
		"\63\3\2\2\2\u0224\u0228\7\5\2\2\u0225\u0227\5\22\n\2\u0226\u0225\3\2\2"+
		"\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b"+
		"\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\7\6\2\2\u022c\65\3\2\2\2\u022d"+
		"\u022e\7:\2\2\u022e\67\3\2\2\2\u022f\u0230\78\2\2\u0230\u0231\7+\2\2\u0231"+
		"\u0232\58\35\2\u0232\u0233\7,\2\2\u0233\u023a\3\2\2\2\u0234\u0235\7\33"+
		"\2\2\u0235\u0236\58\35\2\u0236\u0237\7\34\2\2\u0237\u023a\3\2\2\2\u0238"+
		"\u023a\7:\2\2\u0239\u022f\3\2\2\2\u0239\u0234\3\2\2\2\u0239\u0238\3\2"+
		"\2\2\u023a9\3\2\2\2\u023b\u023c\78\2\2\u023c\u023d\7%\2\2\u023d\u023e"+
		"\78\2\2\u023e\u0241\7\4\2\2\u023f\u0241\7;\2\2\u0240\u023b\3\2\2\2\u0240"+
		"\u023f\3\2\2\2\u0241;\3\2\2\2\u0242\u0243\5\n\6\2\u0243\u0244\78\2\2\u0244"+
		"\u0248\7-\2\2\u0245\u0247\7;\2\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2"+
		"\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0248"+
		"\3\2\2\2\u024b\u024f\7\5\2\2\u024c\u024e\7;\2\2\u024d\u024c\3\2\2\2\u024e"+
		"\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2"+
		"\2\2\u0251\u024f\3\2\2\2\u0252\u0256\7\6\2\2\u0253\u0255\7;\2\2\u0254"+
		"\u0253\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257\u0295\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025a\5\n\6\2\u025a"+
		"\u025b\78\2\2\u025b\u025f\7-\2\2\u025c\u025e\7;\2\2\u025d\u025c\3\2\2"+
		"\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262"+
		"\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0266\7\5\2\2\u0263\u0265\7;\2\2\u0264"+
		"\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267\u026c\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026b\5:\36\2\u026a"+
		"\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u0272\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0271\7;\2\2\u0270"+
		"\u026f\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0279\7\6\2\2\u0276"+
		"\u0278\7;\2\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027a\u0295\3\2\2\2\u027b\u0279\3\2\2\2\u027c"+
		"\u027d\5\n\6\2\u027d\u027e\78\2\2\u027e\u027f\7\33\2\2\u027f\u0280\5\16"+
		"\b\2\u0280\u0284\7\34\2\2\u0281\u0283\7;\2\2\u0282\u0281\3\2\2\2\u0283"+
		"\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2"+
		"\2\2\u0286\u0284\3\2\2\2\u0287\u0289\7\5\2\2\u0288\u028a\5:\36\2\u0289"+
		"\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c\u028d\3\2\2\2\u028d\u0291\7\6\2\2\u028e\u0290\7;\2\2\u028f"+
		"\u028e\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2"+
		"\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0242\3\2\2\2\u0294"+
		"\u0259\3\2\2\2\u0294\u027c\3\2\2\2\u0295=\3\2\2\2\u0296\u0297\5\n\6\2"+
		"\u0297\u0298\5\20\t\2\u0298\u0299\78\2\2\u0299\u029a\7\5\2\2\u029a\u029b"+
		"\7\66\2\2\u029b\u029c\7\4\2\2\u029c\u029d\7\67\2\2\u029d\u029e\7\4\2\2"+
		"\u029e\u029f\7\6\2\2\u029f?\3\2\2\2\u02a0\u02a1\5\20\t\2\u02a1\u02a6\5"+
		"\24\13\2\u02a2\u02a3\7\n\2\2\u02a3\u02a4\5\20\t\2\u02a4\u02a5\5\24\13"+
		"\2\u02a5\u02a7\3\2\2\2\u02a6\u02a2\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7A"+
		"\3\2\2\2\u02a8\u02a9\5\24\13\2\u02a9\u02aa\7\33\2\2\u02aa\u02ab\7\34\2"+
		"\2\u02ab\u02b2\3\2\2\2\u02ac\u02ad\5\24\13\2\u02ad\u02ae\7\33\2\2\u02ae"+
		"\u02af\5@!\2\u02af\u02b0\7\34\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02a8\3\2"+
		"\2\2\u02b1\u02ac\3\2\2\2\u02b2C\3\2\2\2\u02b3\u02b4\78\2\2\u02b4\u02b5"+
		"\7\27\2\2\u02b5\u02c0\7:\2\2\u02b6\u02b7\78\2\2\u02b7\u02b8\7\30\2\2\u02b8"+
		"\u02c0\7:\2\2\u02b9\u02ba\78\2\2\u02ba\u02bb\7.\2\2\u02bb\u02c0\7:\2\2"+
		"\u02bc\u02bd\78\2\2\u02bd\u02be\7/\2\2\u02be\u02c0\7:\2\2\u02bf\u02b3"+
		"\3\2\2\2\u02bf\u02b6\3\2\2\2\u02bf\u02b9\3\2\2\2\u02bf\u02bc\3\2\2\2\u02c0"+
		"E\3\2\2\2\u02c1\u02c2\5D#\2\u02c2\u02c3\7\60\2\2\u02c3\u02c4\5D#\2\u02c4"+
		"\u02ca\3\2\2\2\u02c5\u02c6\5D#\2\u02c6\u02c7\7\61\2\2\u02c7\u02c8\5D#"+
		"\2\u02c8\u02ca\3\2\2\2\u02c9\u02c1\3\2\2\2\u02c9\u02c5\3\2\2\2\u02caG"+
		"\3\2\2\2\u02cb\u02e5\b%\1\2\u02cc\u02d4\f\4\2\2\u02cd\u02ce\7\27\2\2\u02ce"+
		"\u02d5\7\27\2\2\u02cf\u02d0\7\30\2\2\u02d0\u02d1\7\30\2\2\u02d1\u02d5"+
		"\7\30\2\2\u02d2\u02d3\7\30\2\2\u02d3\u02d5\7\30\2\2\u02d4\u02cd\3\2\2"+
		"\2\u02d4\u02cf\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02e4"+
		"\5H%\5\u02d7\u02de\f\3\2\2\u02d8\u02d9\7\27\2\2\u02d9\u02df\7%\2\2\u02da"+
		"\u02db\7\30\2\2\u02db\u02df\7%\2\2\u02dc\u02df\7\30\2\2\u02dd\u02df\7"+
		"\27\2\2\u02de\u02d8\3\2\2\2\u02de\u02da\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e4\5H%\4\u02e1\u02e2\f\5\2"+
		"\2\u02e2\u02e4\t\3\2\2\u02e3\u02cc\3\2\2\2\u02e3\u02d7\3\2\2\2\u02e3\u02e1"+
		"\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"I\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02ed\5H%\2\u02e9\u02ea\7\n\2\2\u02ea"+
		"\u02ec\5H%\2\u02eb\u02e9\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2"+
		"\2\u02ed\u02ee\3\2\2\2\u02eeK\3\2\2\2\u02ef\u02ed\3\2\2\2JSXagpw~\u0085"+
		"\u008f\u0096\u009d\u00a4\u00ac\u00b3\u00ba\u00c1\u00c4\u00c9\u00d0\u00d5"+
		"\u00d7\u00e0\u00e6\u00f2\u00f8\u00ff\u0105\u0109\u0117\u013e\u0153\u0178"+
		"\u01a0\u01a5\u01b7\u01bd\u01c6\u01cf\u01d8\u01e2\u01e6\u01ea\u01f8\u0206"+
		"\u020c\u0212\u021a\u021f\u0228\u0239\u0240\u0248\u024f\u0256\u025f\u0266"+
		"\u026c\u0272\u0279\u0284\u028b\u0291\u0294\u02a6\u02b1\u02bf\u02c9\u02d4"+
		"\u02de\u02e3\u02e5\u02ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}