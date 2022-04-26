// Generated from com\cent\antlr\cent\Cent.g4 by ANTLR 4.7.2
package com.cent.antlr.cent;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CentLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MULTI=4, PLUS=5, AND=6, OR=7, XOR=8, NOT=9, INT=10, 
		MINT=11, BINARY=12, MINUS=13, BINSTART=14, BINDIG=15, WS=16, NEWLINE=17, 
		ErrorChar=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MULTI", "PLUS", "AND", "OR", "XOR", "NOT", "INT", 
			"MINT", "BINARY", "MINUS", "BINSTART", "BINDIG", "WS", "NEWLINE", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'a'", "'*'", "'+'", "'&'", "'|'", "'^'", "'~'", 
			null, null, null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MULTI", "PLUS", "AND", "OR", "XOR", "NOT", "INT", 
			"MINT", "BINARY", "MINUS", "BINSTART", "BINDIG", "WS", "NEWLINE", "ErrorChar"
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


	public CentLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cent.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\7\13<\n\13\f\13\16\13?\13\13\3\13\5\13B\n\13\3"+
		"\f\3\f\3\f\3\r\3\r\6\rI\n\r\r\r\16\rJ\3\16\3\16\3\17\3\17\3\17\3\17\5"+
		"\17S\n\17\3\20\3\20\3\21\6\21X\n\21\r\21\16\21Y\3\21\3\21\3\22\6\22_\n"+
		"\22\r\22\16\22`\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\4\4\2\13\13\"\""+
		"\4\2\f\f\17\17\2i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3"+
		"\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\65\3\2\2\2\23\67\3\2"+
		"\2\2\25A\3\2\2\2\27C\3\2\2\2\31F\3\2\2\2\33L\3\2\2\2\35R\3\2\2\2\37T\3"+
		"\2\2\2!W\3\2\2\2#^\3\2\2\2%b\3\2\2\2\'(\7*\2\2(\4\3\2\2\2)*\7+\2\2*\6"+
		"\3\2\2\2+,\7c\2\2,\b\3\2\2\2-.\7,\2\2.\n\3\2\2\2/\60\7-\2\2\60\f\3\2\2"+
		"\2\61\62\7(\2\2\62\16\3\2\2\2\63\64\7~\2\2\64\20\3\2\2\2\65\66\7`\2\2"+
		"\66\22\3\2\2\2\678\7\u0080\2\28\24\3\2\2\29=\4\63;\2:<\4\62;\2;:\3\2\2"+
		"\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>B\3\2\2\2?=\3\2\2\2@B\7\62\2\2A9\3\2"+
		"\2\2A@\3\2\2\2B\26\3\2\2\2CD\7/\2\2DE\5\25\13\2E\30\3\2\2\2FH\5\35\17"+
		"\2GI\5\37\20\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\32\3\2\2\2LM\7"+
		"/\2\2M\34\3\2\2\2NO\7\62\2\2OS\7D\2\2PQ\7\62\2\2QS\7d\2\2RN\3\2\2\2RP"+
		"\3\2\2\2S\36\3\2\2\2TU\4\62\63\2U \3\2\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\b\21\2\2\\\"\3\2\2\2]_\t\3\2\2^]\3"+
		"\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a$\3\2\2\2bc\13\2\2\2c&\3\2\2\2\t"+
		"\2=AJRY`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}