// Generated from /home/x/Área de Trabalho/lfa_language/PostHtml/Grammar/DrawScript.g4 by ANTLR 4.7
package posthtml;

import workload.Expr;
import workload.Sketch;
import workload.Operator;
import static workload.Expr.*;
import static workload.Sketch.*;
import workload.Op;
import java.util.LinkedList;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(DrawScriptParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DrawScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#createFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunc(DrawScriptParser.CreateFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(DrawScriptParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#whileExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(DrawScriptParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DrawScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#sttmtSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSttmtSeq(DrawScriptParser.SttmtSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DrawScriptParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DrawScriptParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(DrawScriptParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#disj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisj(DrawScriptParser.DisjContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#conj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConj(DrawScriptParser.ConjContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(DrawScriptParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(DrawScriptParser.AexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(DrawScriptParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(DrawScriptParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(DrawScriptParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(DrawScriptParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#design}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesign(DrawScriptParser.DesignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape(DrawScriptParser.ShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(DrawScriptParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(DrawScriptParser.ColorContext ctx);
}