// Generated from ANTLR.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TOKEN_ID=11, ID=12, STRING=13, COMMENT=14, LINE_COMMENT=15, WS=16;
	public static final int
		RULE_grammarFile = 0, RULE_grammarSpec = 1, RULE_grammarDecl = 2, RULE_ruleSpec = 3, 
		RULE_parserRuleSpec = 4, RULE_lexerRuleSpec = 5, RULE_alternative = 6, 
		RULE_lexerAlternative = 7, RULE_element = 8, RULE_lexerElement = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"grammarFile", "grammarSpec", "grammarDecl", "ruleSpec", "parserRuleSpec", 
			"lexerRuleSpec", "alternative", "lexerAlternative", "element", "lexerElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "':'", "'|'", "'('", "')'", "'*'", "'+'", "'?'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TOKEN_ID", 
			"ID", "STRING", "COMMENT", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "ANTLR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ANTLRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammarFileContext extends ParserRuleContext {
		public GrammarSpecContext grammarSpec() {
			return getRuleContext(GrammarSpecContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ANTLRParser.EOF, 0); }
		public GrammarFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).enterGrammarFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).exitGrammarFile(this);
		}
	}

	public final GrammarFileContext grammarFile() throws RecognitionException {
		GrammarFileContext _localctx = new GrammarFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			grammarSpec();
			setState(21);
			match(EOF);
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

	public static class GrammarSpecContext extends ParserRuleContext {
		public GrammarDeclContext grammarDecl() {
			return getRuleContext(GrammarDeclContext.class,0);
		}
		public List<RuleSpecContext> ruleSpec() {
			return getRuleContexts(RuleSpecContext.class);
		}
		public RuleSpecContext ruleSpec(int i) {
			return getRuleContext(RuleSpecContext.class,i);
		}
		public List<LexerRuleSpecContext> lexerRuleSpec() {
			return getRuleContexts(LexerRuleSpecContext.class);
		}
		public LexerRuleSpecContext lexerRuleSpec(int i) {
			return getRuleContext(LexerRuleSpecContext.class,i);
		}
		public GrammarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).enterGrammarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).exitGrammarSpec(this);
		}
	}

	public final GrammarSpecContext grammarSpec() throws RecognitionException {
		GrammarSpecContext _localctx = new GrammarSpecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			grammarDecl();
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					ruleSpec();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_ID) {
				{
				{
				setState(30);
				lexerRuleSpec();
				}
				}
				setState(35);
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

	public static class GrammarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ANTLRParser.ID, 0); }
		public GrammarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).enterGrammarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).exitGrammarDecl(this);
		}
	}

	public final GrammarDeclContext grammarDecl() throws RecognitionException {
		GrammarDeclContext _localctx = new GrammarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(ID);
			setState(38);
			match(T__1);
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

	public static class RuleSpecContext extends ParserRuleContext {
		public ParserRuleSpecContext parserRuleSpec() {
			return getRuleContext(ParserRuleSpecContext.class,0);
		}
		public LexerRuleSpecContext lexerRuleSpec() {
			return getRuleContext(LexerRuleSpecContext.class,0);
		}
		public RuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).enterRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).exitRuleSpec(this);
		}
	}

	public final RuleSpecContext ruleSpec() throws RecognitionException {
		RuleSpecContext _localctx = new RuleSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ruleSpec);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				parserRuleSpec();
				}
				break;
			case TOKEN_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				lexerRuleSpec();
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

	public static class ParserRuleSpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ANTLRParser.ID, 0); }
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public ParserRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).enterParserRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).exitParserRuleSpec(this);
		}
	}

	public final ParserRuleSpecContext parserRuleSpec() throws RecognitionException {
		ParserRuleSpecContext _localctx = new ParserRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parserRuleSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ID);
			setState(45);
			match(T__2);
			setState(46);
			alternative();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(47);
				match(T__3);
				setState(48);
				alternative();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__1);
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

	public static class LexerRuleSpecContext extends ParserRuleContext {
		public TerminalNode TOKEN_ID() { return getToken(ANTLRParser.TOKEN_ID, 0); }
		public List<LexerAlternativeContext> lexerAlternative() {
			return getRuleContexts(LexerAlternativeContext.class);
		}
		public LexerAlternativeContext lexerAlternative(int i) {
			return getRuleContext(LexerAlternativeContext.class,i);
		}
		public LexerRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).enterLexerRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).exitLexerRuleSpec(this);
		}
	}

	public final LexerRuleSpecContext lexerRuleSpec() throws RecognitionException {
		LexerRuleSpecContext _localctx = new LexerRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lexerRuleSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(TOKEN_ID);
			setState(57);
			match(T__2);
			setState(58);
			lexerAlternative();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(59);
				match(T__3);
				setState(60);
				lexerAlternative();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__1);
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

	public static class AlternativeContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).exitAlternative(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				element(0);
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ID) | (1L << STRING))) != 0) );
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

	public static class LexerAlternativeContext extends ParserRuleContext {
		public List<LexerElementContext> lexerElement() {
			return getRuleContexts(LexerElementContext.class);
		}
		public LexerElementContext lexerElement(int i) {
			return getRuleContext(LexerElementContext.class,i);
		}
		public LexerAlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAlternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).enterLexerAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).exitLexerAlternative(this);
		}
	}

	public final LexerAlternativeContext lexerAlternative() throws RecognitionException {
		LexerAlternativeContext _localctx = new LexerAlternativeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lexerAlternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				lexerElement(0);
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << TOKEN_ID) | (1L << STRING))) != 0) );
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ANTLRParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ANTLRParser.STRING, 0); }
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		return element(0);
	}

	private ElementContext element(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElementContext _localctx = new ElementContext(_ctx, _parentState);
		ElementContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_element, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(79);
				match(ID);
				}
				break;
			case STRING:
				{
				setState(80);
				match(STRING);
				}
				break;
			case T__4:
				{
				setState(81);
				match(T__4);
				setState(82);
				alternative();
				setState(83);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ElementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(87);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(88);
						match(T__6);
						}
						break;
					case 2:
						{
						_localctx = new ElementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(89);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(90);
						match(T__7);
						}
						break;
					case 3:
						{
						_localctx = new ElementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(91);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(92);
						match(T__8);
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class LexerElementContext extends ParserRuleContext {
		public TerminalNode TOKEN_ID() { return getToken(ANTLRParser.TOKEN_ID, 0); }
		public TerminalNode STRING() { return getToken(ANTLRParser.STRING, 0); }
		public LexerElementContext lexerElement() {
			return getRuleContext(LexerElementContext.class,0);
		}
		public LexerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).enterLexerElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRListener ) ((ANTLRListener)listener).exitLexerElement(this);
		}
	}

	public final LexerElementContext lexerElement() throws RecognitionException {
		return lexerElement(0);
	}

	private LexerElementContext lexerElement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LexerElementContext _localctx = new LexerElementContext(_ctx, _parentState);
		LexerElementContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_lexerElement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_ID:
				{
				setState(99);
				match(TOKEN_ID);
				}
				break;
			case STRING:
				{
				setState(100);
				match(STRING);
				}
				break;
			case T__9:
				{
				setState(101);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new LexerElementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lexerElement);
						setState(104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(105);
						match(T__6);
						}
						break;
					case 2:
						{
						_localctx = new LexerElementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lexerElement);
						setState(106);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(107);
						match(T__7);
						}
						break;
					case 3:
						{
						_localctx = new LexerElementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lexerElement);
						setState(108);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(109);
						match(T__8);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return element_sempred((ElementContext)_localctx, predIndex);
		case 9:
			return lexerElement_sempred((LexerElementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean element_sempred(ElementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lexerElement_sempred(LexerElementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\7\3\"\n\3\f\3\16\3"+
		"%\13\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5-\n\5\3\6\3\6\3\6\3\6\3\6\7\6\64\n\6"+
		"\f\6\16\6\67\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7@\n\7\f\7\16\7C\13\7"+
		"\3\7\3\7\3\b\6\bH\n\b\r\b\16\bI\3\t\6\tM\n\t\r\t\16\tN\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\nX\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n`\n\n\f\n\16\nc\13\n"+
		"\3\13\3\13\3\13\3\13\5\13i\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13q\n"+
		"\13\f\13\16\13t\13\13\3\13\2\4\22\24\f\2\4\6\b\n\f\16\20\22\24\2\2\2|"+
		"\2\26\3\2\2\2\4\31\3\2\2\2\6&\3\2\2\2\b,\3\2\2\2\n.\3\2\2\2\f:\3\2\2\2"+
		"\16G\3\2\2\2\20L\3\2\2\2\22W\3\2\2\2\24h\3\2\2\2\26\27\5\4\3\2\27\30\7"+
		"\2\2\3\30\3\3\2\2\2\31\35\5\6\4\2\32\34\5\b\5\2\33\32\3\2\2\2\34\37\3"+
		"\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 \"\5\f\7"+
		"\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&\'\7"+
		"\3\2\2\'(\7\16\2\2()\7\4\2\2)\7\3\2\2\2*-\5\n\6\2+-\5\f\7\2,*\3\2\2\2"+
		",+\3\2\2\2-\t\3\2\2\2./\7\16\2\2/\60\7\5\2\2\60\65\5\16\b\2\61\62\7\6"+
		"\2\2\62\64\5\16\b\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3"+
		"\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\4\2\29\13\3\2\2\2:;\7\r\2\2;<\7\5"+
		"\2\2<A\5\20\t\2=>\7\6\2\2>@\5\20\t\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\4\2\2E\r\3\2\2\2FH\5\22\n\2GF\3\2\2\2H"+
		"I\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\17\3\2\2\2KM\5\24\13\2LK\3\2\2\2MN\3\2"+
		"\2\2NL\3\2\2\2NO\3\2\2\2O\21\3\2\2\2PQ\b\n\1\2QX\7\16\2\2RX\7\17\2\2S"+
		"T\7\7\2\2TU\5\16\b\2UV\7\b\2\2VX\3\2\2\2WP\3\2\2\2WR\3\2\2\2WS\3\2\2\2"+
		"Xa\3\2\2\2YZ\f\5\2\2Z`\7\t\2\2[\\\f\4\2\2\\`\7\n\2\2]^\f\3\2\2^`\7\13"+
		"\2\2_Y\3\2\2\2_[\3\2\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\23\3"+
		"\2\2\2ca\3\2\2\2de\b\13\1\2ei\7\r\2\2fi\7\17\2\2gi\7\f\2\2hd\3\2\2\2h"+
		"f\3\2\2\2hg\3\2\2\2ir\3\2\2\2jk\f\5\2\2kq\7\t\2\2lm\f\4\2\2mq\7\n\2\2"+
		"no\f\3\2\2oq\7\13\2\2pj\3\2\2\2pl\3\2\2\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2s\25\3\2\2\2tr\3\2\2\2\17\35#,\65AINW_ahpr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}