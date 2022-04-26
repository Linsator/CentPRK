// Generated from com\cent\antlr\cent\Cent.g4 by ANTLR 4.7.2
package com.cent.antlr.cent;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MULTI=4, PLUS=5, AND=6, OR=7, XOR=8, NOT=9, INT=10, 
		MINT=11, BINARY=12, MINUS=13, BINSTART=14, BINDIG=15, WS=16, NEWLINE=17, 
		ErrorChar=18;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_list = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr", "list"
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

	@Override
	public String getGrammarFileName() { return "Cent.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CentParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CentParser.NEWLINE, i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CentVisitor ) return ((CentVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
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
				setState(6);
				expr(0);
				setState(7);
				match(NEWLINE);
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << NOT) | (1L << INT) | (1L << MINT) | (1L << BINARY))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParexprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CentVisitor ) return ((CentVisitor<? extends T>)visitor).visitParexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeafexprContext extends ExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public LeafexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CentVisitor ) return ((CentVisitor<? extends T>)visitor).visitLeafexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpexprContext extends ExprContext {
		public ExprContext left;
		public Token operator;
		public ExprContext right;
		public TerminalNode NOT() { return getToken(CentParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(CentParser.MULTI, 0); }
		public TerminalNode PLUS() { return getToken(CentParser.PLUS, 0); }
		public TerminalNode AND() { return getToken(CentParser.AND, 0); }
		public TerminalNode OR() { return getToken(CentParser.OR, 0); }
		public TerminalNode XOR() { return getToken(CentParser.XOR, 0); }
		public OpexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CentVisitor ) return ((CentVisitor<? extends T>)visitor).visitOpexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrexprContext extends ExprContext {
		public ExprContext left;
		public Token operator;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(CentParser.NOT, 0); }
		public ErrexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CentVisitor ) return ((CentVisitor<? extends T>)visitor).visitErrexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(14);
				match(T__0);
				setState(15);
				expr(0);
				setState(16);
				match(T__1);
				}
				break;
			case NOT:
				{
				_localctx = new OpexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				((OpexprContext)_localctx).operator = match(NOT);
				setState(19);
				((OpexprContext)_localctx).right = expr(8);
				}
				break;
			case T__2:
			case INT:
			case MINT:
			case BINARY:
				{
				_localctx = new LeafexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(41);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new OpexprContext(new ExprContext(_parentctx, _parentState));
						((OpexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(23);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(24);
						((OpexprContext)_localctx).operator = match(MULTI);
						setState(25);
						((OpexprContext)_localctx).right = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new OpexprContext(new ExprContext(_parentctx, _parentState));
						((OpexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(26);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(27);
						((OpexprContext)_localctx).operator = match(PLUS);
						setState(28);
						((OpexprContext)_localctx).right = expr(7);
						}
						break;
					case 3:
						{
						_localctx = new OpexprContext(new ExprContext(_parentctx, _parentState));
						((OpexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(29);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(30);
						((OpexprContext)_localctx).operator = match(AND);
						setState(31);
						((OpexprContext)_localctx).right = expr(6);
						}
						break;
					case 4:
						{
						_localctx = new OpexprContext(new ExprContext(_parentctx, _parentState));
						((OpexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(32);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(33);
						((OpexprContext)_localctx).operator = match(OR);
						setState(34);
						((OpexprContext)_localctx).right = expr(5);
						}
						break;
					case 5:
						{
						_localctx = new OpexprContext(new ExprContext(_parentctx, _parentState));
						((OpexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36);
						((OpexprContext)_localctx).operator = match(XOR);
						setState(37);
						((OpexprContext)_localctx).right = expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ErrexprContext(new ExprContext(_parentctx, _parentState));
						((ErrexprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(38);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(39);
						((ErrexprContext)_localctx).operator = match(NOT);
						setState(40);
						((ErrexprContext)_localctx).right = expr(2);
						}
						break;
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode MINT() { return getToken(CentParser.MINT, 0); }
		public List<TerminalNode> INT() { return getTokens(CentParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CentParser.INT, i);
		}
		public TerminalNode BINARY() { return getToken(CentParser.BINARY, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CentVisitor ) return ((CentVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(MINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(BINARY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT) {
					{
					{
					setState(49);
					match(INT);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(T__2);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\30\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3\4\3\4\7\4\65\n"+
		"\4\f\4\16\48\13\4\3\4\5\4;\n\4\3\4\2\3\4\5\2\4\6\2\2\2F\2\13\3\2\2\2\4"+
		"\27\3\2\2\2\6:\3\2\2\2\b\t\5\4\3\2\t\n\7\23\2\2\n\f\3\2\2\2\13\b\3\2\2"+
		"\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\20\b\3\1\2\20"+
		"\21\7\3\2\2\21\22\5\4\3\2\22\23\7\4\2\2\23\30\3\2\2\2\24\25\7\13\2\2\25"+
		"\30\5\4\3\n\26\30\5\6\4\2\27\17\3\2\2\2\27\24\3\2\2\2\27\26\3\2\2\2\30"+
		"-\3\2\2\2\31\32\f\t\2\2\32\33\7\6\2\2\33,\5\4\3\n\34\35\f\b\2\2\35\36"+
		"\7\7\2\2\36,\5\4\3\t\37 \f\7\2\2 !\7\b\2\2!,\5\4\3\b\"#\f\6\2\2#$\7\t"+
		"\2\2$,\5\4\3\7%&\f\5\2\2&\'\7\n\2\2\',\5\4\3\6()\f\3\2\2)*\7\13\2\2*,"+
		"\5\4\3\4+\31\3\2\2\2+\34\3\2\2\2+\37\3\2\2\2+\"\3\2\2\2+%\3\2\2\2+(\3"+
		"\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/-\3\2\2\2\60;\7\r\2\2"+
		"\61;\7\f\2\2\62;\7\16\2\2\63\65\7\f\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29;\7\5\2\2:\60\3\2\2\2:"+
		"\61\3\2\2\2:\62\3\2\2\2:\66\3\2\2\2;\7\3\2\2\2\b\r\27+-\66:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}