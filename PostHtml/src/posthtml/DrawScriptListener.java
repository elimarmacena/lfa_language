// Generated from /home/x/Área de Trabalho/lfa_language/PostHtml/Grammar/DrawScript.g4 by ANTLR 4.7
package posthtml;

import workload.Expr;
import workload.Sketch;
import workload.Operator;
import static workload.Expr.*;
import static workload.Sketch.*;
import workload.Op;
import java.util.LinkedList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawScriptParser}.
 */
public interface DrawScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(DrawScriptParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(DrawScriptParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DrawScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DrawScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#createFunc}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunc(DrawScriptParser.CreateFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#createFunc}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunc(DrawScriptParser.CreateFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(DrawScriptParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(DrawScriptParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(DrawScriptParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(DrawScriptParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DrawScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DrawScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#sttmtSeq}.
	 * @param ctx the parse tree
	 */
	void enterSttmtSeq(DrawScriptParser.SttmtSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#sttmtSeq}.
	 * @param ctx the parse tree
	 */
	void exitSttmtSeq(DrawScriptParser.SttmtSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DrawScriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DrawScriptParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DrawScriptParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DrawScriptParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(DrawScriptParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(DrawScriptParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#disj}.
	 * @param ctx the parse tree
	 */
	void enterDisj(DrawScriptParser.DisjContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#disj}.
	 * @param ctx the parse tree
	 */
	void exitDisj(DrawScriptParser.DisjContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#conj}.
	 * @param ctx the parse tree
	 */
	void enterConj(DrawScriptParser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#conj}.
	 * @param ctx the parse tree
	 */
	void exitConj(DrawScriptParser.ConjContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(DrawScriptParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(DrawScriptParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(DrawScriptParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(DrawScriptParser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(DrawScriptParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(DrawScriptParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(DrawScriptParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(DrawScriptParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(DrawScriptParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(DrawScriptParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(DrawScriptParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(DrawScriptParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#design}.
	 * @param ctx the parse tree
	 */
	void enterDesign(DrawScriptParser.DesignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#design}.
	 * @param ctx the parse tree
	 */
	void exitDesign(DrawScriptParser.DesignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(DrawScriptParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(DrawScriptParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(DrawScriptParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(DrawScriptParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(DrawScriptParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(DrawScriptParser.ColorContext ctx);
}