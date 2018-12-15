// Generated from C:\Users\joel-\Desktop\TRAB_LFA\PostHtml\Grammar\DrawScript.g4 by ANTLR 4.1
package posthtml;

import workload.Expr;
import workload.Sketch;
import workload.Operator;
import static workload.Expr.*;
import static workload.Sketch.*;
import workload.Op;
import java.util.LinkedList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawScriptParser}.
 */
public interface DrawScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(@NotNull DrawScriptParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(@NotNull DrawScriptParser.ArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(@NotNull DrawScriptParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(@NotNull DrawScriptParser.BexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(@NotNull DrawScriptParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(@NotNull DrawScriptParser.ShapeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(@NotNull DrawScriptParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(@NotNull DrawScriptParser.ColorContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#conj}.
	 * @param ctx the parse tree
	 */
	void enterConj(@NotNull DrawScriptParser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#conj}.
	 * @param ctx the parse tree
	 */
	void exitConj(@NotNull DrawScriptParser.ConjContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#sttmtSeq}.
	 * @param ctx the parse tree
	 */
	void enterSttmtSeq(@NotNull DrawScriptParser.SttmtSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#sttmtSeq}.
	 * @param ctx the parse tree
	 */
	void exitSttmtSeq(@NotNull DrawScriptParser.SttmtSeqContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(@NotNull DrawScriptParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(@NotNull DrawScriptParser.InicioContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(@NotNull DrawScriptParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(@NotNull DrawScriptParser.RelOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(@NotNull DrawScriptParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(@NotNull DrawScriptParser.ParcelaContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(@NotNull DrawScriptParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(@NotNull DrawScriptParser.AexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull DrawScriptParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull DrawScriptParser.TermoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#disj}.
	 * @param ctx the parse tree
	 */
	void enterDisj(@NotNull DrawScriptParser.DisjContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#disj}.
	 * @param ctx the parse tree
	 */
	void exitDisj(@NotNull DrawScriptParser.DisjContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(@NotNull DrawScriptParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(@NotNull DrawScriptParser.WhileExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#createFunc}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunc(@NotNull DrawScriptParser.CreateFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#createFunc}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunc(@NotNull DrawScriptParser.CreateFuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull DrawScriptParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull DrawScriptParser.FatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#design}.
	 * @param ctx the parse tree
	 */
	void enterDesign(@NotNull DrawScriptParser.DesignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#design}.
	 * @param ctx the parse tree
	 */
	void exitDesign(@NotNull DrawScriptParser.DesignContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull DrawScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull DrawScriptParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull DrawScriptParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull DrawScriptParser.PropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(@NotNull DrawScriptParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(@NotNull DrawScriptParser.IfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull DrawScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull DrawScriptParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull DrawScriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull DrawScriptParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull DrawScriptParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull DrawScriptParser.AssignContext ctx);
}