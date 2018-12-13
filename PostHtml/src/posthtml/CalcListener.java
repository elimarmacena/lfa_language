package posthtml;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(CalcParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(CalcParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(CalcParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(CalcParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(CalcParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(CalcParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CalcParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CalcParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#sttmtSeq}.
	 * @param ctx the parse tree
	 */
	void enterSttmtSeq(CalcParser.SttmtSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#sttmtSeq}.
	 * @param ctx the parse tree
	 */
	void exitSttmtSeq(CalcParser.SttmtSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(CalcParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(CalcParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#disj}.
	 * @param ctx the parse tree
	 */
	void enterDisj(CalcParser.DisjContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#disj}.
	 * @param ctx the parse tree
	 */
	void exitDisj(CalcParser.DisjContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#conj}.
	 * @param ctx the parse tree
	 */
	void enterConj(CalcParser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#conj}.
	 * @param ctx the parse tree
	 */
	void exitConj(CalcParser.ConjContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(CalcParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(CalcParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(CalcParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(CalcParser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(CalcParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(CalcParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(CalcParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(CalcParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(CalcParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(CalcParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(CalcParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(CalcParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#design}.
	 * @param ctx the parse tree
	 */
	void enterDesign(CalcParser.DesignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#design}.
	 * @param ctx the parse tree
	 */
	void exitDesign(CalcParser.DesignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(CalcParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(CalcParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CalcParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CalcParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(CalcParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(CalcParser.ColorContext ctx);
}