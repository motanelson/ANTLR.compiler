// Generated from ANTLR.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ANTLRParser}.
 */
public interface ANTLRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#grammarFile}.
	 * @param ctx the parse tree
	 */
	void enterGrammarFile(ANTLRParser.GrammarFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#grammarFile}.
	 * @param ctx the parse tree
	 */
	void exitGrammarFile(ANTLRParser.GrammarFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#grammarSpec}.
	 * @param ctx the parse tree
	 */
	void enterGrammarSpec(ANTLRParser.GrammarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#grammarSpec}.
	 * @param ctx the parse tree
	 */
	void exitGrammarSpec(ANTLRParser.GrammarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#grammarDecl}.
	 * @param ctx the parse tree
	 */
	void enterGrammarDecl(ANTLRParser.GrammarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#grammarDecl}.
	 * @param ctx the parse tree
	 */
	void exitGrammarDecl(ANTLRParser.GrammarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#ruleSpec}.
	 * @param ctx the parse tree
	 */
	void enterRuleSpec(ANTLRParser.RuleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#ruleSpec}.
	 * @param ctx the parse tree
	 */
	void exitRuleSpec(ANTLRParser.RuleSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#parserRuleSpec}.
	 * @param ctx the parse tree
	 */
	void enterParserRuleSpec(ANTLRParser.ParserRuleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#parserRuleSpec}.
	 * @param ctx the parse tree
	 */
	void exitParserRuleSpec(ANTLRParser.ParserRuleSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#lexerRuleSpec}.
	 * @param ctx the parse tree
	 */
	void enterLexerRuleSpec(ANTLRParser.LexerRuleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#lexerRuleSpec}.
	 * @param ctx the parse tree
	 */
	void exitLexerRuleSpec(ANTLRParser.LexerRuleSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(ANTLRParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(ANTLRParser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#lexerAlternative}.
	 * @param ctx the parse tree
	 */
	void enterLexerAlternative(ANTLRParser.LexerAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#lexerAlternative}.
	 * @param ctx the parse tree
	 */
	void exitLexerAlternative(ANTLRParser.LexerAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ANTLRParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ANTLRParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#lexerElement}.
	 * @param ctx the parse tree
	 */
	void enterLexerElement(ANTLRParser.LexerElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#lexerElement}.
	 * @param ctx the parse tree
	 */
	void exitLexerElement(ANTLRParser.LexerElementContext ctx);
}