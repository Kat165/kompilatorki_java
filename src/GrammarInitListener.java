// Generated from C:/Users/kasia/IdeaProjects/kompilatorki_java/antlr4\GrammarInit.g4 by ANTLR 4.10.1
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarInitParser}.
 */
public interface GrammarInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#startowy}.
	 * @param ctx the parse tree
	 */
	void enterStartowy(GrammarInitParser.StartowyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#startowy}.
	 * @param ctx the parse tree
	 */
	void exitStartowy(GrammarInitParser.StartowyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GrammarInitParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GrammarInitParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarInitParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarInitParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(GrammarInitParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(GrammarInitParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#else_stat}.
	 * @param ctx the parse tree
	 */
	void enterElse_stat(GrammarInitParser.Else_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#else_stat}.
	 * @param ctx the parse tree
	 */
	void exitElse_stat(GrammarInitParser.Else_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(GrammarInitParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(GrammarInitParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(GrammarInitParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(GrammarInitParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#for_inside}.
	 * @param ctx the parse tree
	 */
	void enterFor_inside(GrammarInitParser.For_insideContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#for_inside}.
	 * @param ctx the parse tree
	 */
	void exitFor_inside(GrammarInitParser.For_insideContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop(GrammarInitParser.Do_while_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop(GrammarInitParser.Do_while_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(GrammarInitParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(GrammarInitParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GrammarInitParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GrammarInitParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#try_catch_stat}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_stat(GrammarInitParser.Try_catch_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#try_catch_stat}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_stat(GrammarInitParser.Try_catch_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stat(GrammarInitParser.Return_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stat(GrammarInitParser.Return_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#komentarz_poj}.
	 * @param ctx the parse tree
	 */
	void enterKomentarz_poj(GrammarInitParser.Komentarz_pojContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#komentarz_poj}.
	 * @param ctx the parse tree
	 */
	void exitKomentarz_poj(GrammarInitParser.Komentarz_pojContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#komentarz_wiel}.
	 * @param ctx the parse tree
	 */
	void enterKomentarz_wiel(GrammarInitParser.Komentarz_wielContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#komentarz_wiel}.
	 * @param ctx the parse tree
	 */
	void exitKomentarz_wiel(GrammarInitParser.Komentarz_wielContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(GrammarInitParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(GrammarInitParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(GrammarInitParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(GrammarInitParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GrammarInitParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GrammarInitParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(GrammarInitParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(GrammarInitParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(GrammarInitParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(GrammarInitParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(GrammarInitParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(GrammarInitParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#fun_arg}.
	 * @param ctx the parse tree
	 */
	void enterFun_arg(GrammarInitParser.Fun_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#fun_arg}.
	 * @param ctx the parse tree
	 */
	void exitFun_arg(GrammarInitParser.Fun_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarInitParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarInitParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(GrammarInitParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(GrammarInitParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarInitParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(GrammarInitParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarInitParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(GrammarInitParser.DecrementContext ctx);
}