// Generated from C:\Users\elmr\Documents\GITHUB\lfa_language\PostHtml\Grammar\Calc.g4 by ANTLR 4.1
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
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(@NotNull CalcParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(@NotNull CalcParser.ArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(@NotNull CalcParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(@NotNull CalcParser.BexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(@NotNull CalcParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(@NotNull CalcParser.ShapeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(@NotNull CalcParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(@NotNull CalcParser.ColorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#conj}.
	 * @param ctx the parse tree
	 */
	void enterConj(@NotNull CalcParser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#conj}.
	 * @param ctx the parse tree
	 */
	void exitConj(@NotNull CalcParser.ConjContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#sttmtSeq}.
	 * @param ctx the parse tree
	 */
	void enterSttmtSeq(@NotNull CalcParser.SttmtSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#sttmtSeq}.
	 * @param ctx the parse tree
	 */
	void exitSttmtSeq(@NotNull CalcParser.SttmtSeqContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(@NotNull CalcParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(@NotNull CalcParser.InicioContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(@NotNull CalcParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(@NotNull CalcParser.RelOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(@NotNull CalcParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(@NotNull CalcParser.ParcelaContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(@NotNull CalcParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(@NotNull CalcParser.AexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull CalcParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull CalcParser.TermoContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#disj}.
	 * @param ctx the parse tree
	 */
	void enterDisj(@NotNull CalcParser.DisjContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#disj}.
	 * @param ctx the parse tree
	 */
	void exitDisj(@NotNull CalcParser.DisjContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(@NotNull CalcParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(@NotNull CalcParser.WhileExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#createFunc}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunc(@NotNull CalcParser.CreateFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#createFunc}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunc(@NotNull CalcParser.CreateFuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull CalcParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull CalcParser.FatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#design}.
	 * @param ctx the parse tree
	 */
	void enterDesign(@NotNull CalcParser.DesignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#design}.
	 * @param ctx the parse tree
	 */
	void exitDesign(@NotNull CalcParser.DesignContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CalcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CalcParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull CalcParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull CalcParser.PropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(@NotNull CalcParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(@NotNull CalcParser.IfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull CalcParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull CalcParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CalcParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull CalcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull CalcParser.AssignContext ctx);
}