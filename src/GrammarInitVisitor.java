// Generated from C:/Users/kasia/IdeaProjects/kompilatorki_java/antlr4\GrammarInit.g4 by ANTLR 4.10.1
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarInitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarInitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#startowy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartowy(GrammarInitParser.StartowyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(GrammarInitParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GrammarInitParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(GrammarInitParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#else_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stat(GrammarInitParser.Else_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(GrammarInitParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(GrammarInitParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#for_inside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_inside(GrammarInitParser.For_insideContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#do_while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop(GrammarInitParser.Do_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(GrammarInitParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GrammarInitParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#try_catch_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_stat(GrammarInitParser.Try_catch_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#return_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stat(GrammarInitParser.Return_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#komentarz_poj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomentarz_poj(GrammarInitParser.Komentarz_pojContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#komentarz_wiel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomentarz_wiel(GrammarInitParser.Komentarz_wielContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(GrammarInitParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(GrammarInitParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GrammarInitParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(GrammarInitParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GrammarInitParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(GrammarInitParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#fun_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_arg(GrammarInitParser.Fun_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarInitParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(GrammarInitParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarInitParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(GrammarInitParser.DecrementContext ctx);
}