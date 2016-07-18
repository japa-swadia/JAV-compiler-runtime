// Generated from Jav.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavParser}.
 */
public interface JavListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(JavParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(JavParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void enterBool_value(JavParser.Bool_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void exitBool_value(JavParser.Bool_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#int_value}.
	 * @param ctx the parse tree
	 */
	void enterInt_value(JavParser.Int_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#int_value}.
	 * @param ctx the parse tree
	 */
	void exitInt_value(JavParser.Int_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(JavParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(JavParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JavParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JavParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#declr}.
	 * @param ctx the parse tree
	 */
	void enterDeclr(JavParser.DeclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#declr}.
	 * @param ctx the parse tree
	 */
	void exitDeclr(JavParser.DeclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(JavParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(JavParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#var_1}.
	 * @param ctx the parse tree
	 */
	void enterVar_1(JavParser.Var_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#var_1}.
	 * @param ctx the parse tree
	 */
	void exitVar_1(JavParser.Var_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#var_2}.
	 * @param ctx the parse tree
	 */
	void enterVar_2(JavParser.Var_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#var_2}.
	 * @param ctx the parse tree
	 */
	void exitVar_2(JavParser.Var_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#back}.
	 * @param ctx the parse tree
	 */
	void enterBack(JavParser.BackContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#back}.
	 * @param ctx the parse tree
	 */
	void exitBack(JavParser.BackContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JavParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JavParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(JavParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(JavParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#gen_expr}.
	 * @param ctx the parse tree
	 */
	void enterGen_expr(JavParser.Gen_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#gen_expr}.
	 * @param ctx the parse tree
	 */
	void exitGen_expr(JavParser.Gen_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(JavParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(JavParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#open_sq}.
	 * @param ctx the parse tree
	 */
	void enterOpen_sq(JavParser.Open_sqContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#open_sq}.
	 * @param ctx the parse tree
	 */
	void exitOpen_sq(JavParser.Open_sqContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#close_sq}.
	 * @param ctx the parse tree
	 */
	void enterClose_sq(JavParser.Close_sqContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#close_sq}.
	 * @param ctx the parse tree
	 */
	void exitClose_sq(JavParser.Close_sqContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#double_colon}.
	 * @param ctx the parse tree
	 */
	void enterDouble_colon(JavParser.Double_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#double_colon}.
	 * @param ctx the parse tree
	 */
	void exitDouble_colon(JavParser.Double_colonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#stack_declr}.
	 * @param ctx the parse tree
	 */
	void enterStack_declr(JavParser.Stack_declrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#stack_declr}.
	 * @param ctx the parse tree
	 */
	void exitStack_declr(JavParser.Stack_declrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#stack_push}.
	 * @param ctx the parse tree
	 */
	void enterStack_push(JavParser.Stack_pushContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#stack_push}.
	 * @param ctx the parse tree
	 */
	void exitStack_push(JavParser.Stack_pushContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#stack_pop}.
	 * @param ctx the parse tree
	 */
	void enterStack_pop(JavParser.Stack_popContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#stack_pop}.
	 * @param ctx the parse tree
	 */
	void exitStack_pop(JavParser.Stack_popContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(JavParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(JavParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(JavParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(JavParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#open_brace}.
	 * @param ctx the parse tree
	 */
	void enterOpen_brace(JavParser.Open_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#open_brace}.
	 * @param ctx the parse tree
	 */
	void exitOpen_brace(JavParser.Open_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#close_brace}.
	 * @param ctx the parse tree
	 */
	void enterClose_brace(JavParser.Close_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#close_brace}.
	 * @param ctx the parse tree
	 */
	void exitClose_brace(JavParser.Close_braceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(JavParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(JavParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(JavParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(JavParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#els}.
	 * @param ctx the parse tree
	 */
	void enterEls(JavParser.ElsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#els}.
	 * @param ctx the parse tree
	 */
	void exitEls(JavParser.ElsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(JavParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(JavParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(JavParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(JavParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(JavParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(JavParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#methodcall}.
	 * @param ctx the parse tree
	 */
	void enterMethodcall(JavParser.MethodcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#methodcall}.
	 * @param ctx the parse tree
	 */
	void exitMethodcall(JavParser.MethodcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#methodstmt}.
	 * @param ctx the parse tree
	 */
	void enterMethodstmt(JavParser.MethodstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#methodstmt}.
	 * @param ctx the parse tree
	 */
	void exitMethodstmt(JavParser.MethodstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#fact_call}.
	 * @param ctx the parse tree
	 */
	void enterFact_call(JavParser.Fact_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#fact_call}.
	 * @param ctx the parse tree
	 */
	void exitFact_call(JavParser.Fact_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JavParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JavParser.StartContext ctx);
}