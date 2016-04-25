// Generated from questao1/Sonda.g4 by ANTLR 4.5.3
package questao1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SondaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENTAO=1, APOS=2, NEWLINE=3, FRENTE=4, ESQUERDA=5, DIREITA=6, TRAS=7, N=8, 
		WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ENTAO", "APOS", "NEWLINE", "FRENTE", "ESQUERDA", "DIREITA", "TRAS", "N", 
		"WS"
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


	public SondaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sonda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3*\n\3\3\4\5\4-\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7_\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bi\n\b\3\t\6\t"+
		"l\n\t\r\t\16\tm\3\n\6\nq\n\n\r\n\16\nr\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\3\2\4\3\2\62;\4\2\13\13\"\"~\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\3\37\3\2\2\2\5)\3\2\2\2\7,\3\2\2\2\t<\3\2\2"+
		"\2\13N\3\2\2\2\r^\3\2\2\2\17h\3\2\2\2\21k\3\2\2\2\23p\3\2\2\2\25\26\7"+
		"g\2\2\26\27\7p\2\2\27\30\7v\2\2\30\31\7c\2\2\31 \7q\2\2\32\33\7G\2\2\33"+
		"\34\7P\2\2\34\35\7V\2\2\35\36\7C\2\2\36 \7Q\2\2\37\25\3\2\2\2\37\32\3"+
		"\2\2\2 \4\3\2\2\2!\"\7c\2\2\"#\7r\2\2#$\7q\2\2$*\7u\2\2%&\7C\2\2&\'\7"+
		"R\2\2\'(\7Q\2\2(*\7U\2\2)!\3\2\2\2)%\3\2\2\2*\6\3\2\2\2+-\7\17\2\2,+\3"+
		"\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\f\2\2/\b\3\2\2\2\60\61\7h\2\2\61\62\7t"+
		"\2\2\62\63\7g\2\2\63\64\7p\2\2\64\65\7v\2\2\65=\7g\2\2\66\67\7H\2\2\67"+
		"8\7T\2\289\7G\2\29:\7P\2\2:;\7V\2\2;=\7G\2\2<\60\3\2\2\2<\66\3\2\2\2="+
		"\n\3\2\2\2>?\7g\2\2?@\7u\2\2@A\7s\2\2AB\7w\2\2BC\7g\2\2CD\7t\2\2DE\7f"+
		"\2\2EO\7c\2\2FG\7G\2\2GH\7U\2\2HI\7S\2\2IJ\7W\2\2JK\7G\2\2KL\7T\2\2LM"+
		"\7F\2\2MO\7C\2\2N>\3\2\2\2NF\3\2\2\2O\f\3\2\2\2PQ\7f\2\2QR\7k\2\2RS\7"+
		"t\2\2ST\7g\2\2TU\7k\2\2UV\7v\2\2V_\7c\2\2WX\7F\2\2XY\7K\2\2YZ\7T\2\2Z"+
		"[\7G\2\2[\\\7K\2\2\\]\7V\2\2]_\7C\2\2^P\3\2\2\2^W\3\2\2\2_\16\3\2\2\2"+
		"`a\7v\2\2ab\7t\2\2bc\7c\2\2ci\7u\2\2de\7V\2\2ef\7T\2\2fg\7C\2\2gi\7U\2"+
		"\2h`\3\2\2\2hd\3\2\2\2i\20\3\2\2\2jl\t\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2n\22\3\2\2\2oq\t\3\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3"+
		"\2\2\2st\3\2\2\2tu\b\n\2\2u\24\3\2\2\2\f\2\37),<N^hmr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}