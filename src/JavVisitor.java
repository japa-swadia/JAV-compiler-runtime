// Generated from Jav.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavParser#arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_op(JavParser.Arith_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#bool_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_value(JavParser.Bool_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#int_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_value(JavParser.Int_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(JavParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JavParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#declr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclr(JavParser.DeclrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(JavParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#var_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_1(JavParser.Var_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#var_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_2(JavParser.Var_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#back}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack(JavParser.BackContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(JavParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(JavParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(JavParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#gen_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen_expr(JavParser.Gen_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(JavParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#open_sq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_sq(JavParser.Open_sqContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#close_sq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_sq(JavParser.Close_sqContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#double_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_colon(JavParser.Double_colonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#stack_declr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_declr(JavParser.Stack_declrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#stack_push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_push(JavParser.Stack_pushContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#stack_pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_pop(JavParser.Stack_popContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay(JavParser.DisplayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(JavParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#open_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_brace(JavParser.Open_braceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#close_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_brace(JavParser.Close_braceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(JavParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(JavParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#els}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEls(JavParser.ElsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(JavParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(JavParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(JavParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#methodcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodcall(JavParser.MethodcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#methodstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodstmt(JavParser.MethodstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#fact_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact_call(JavParser.Fact_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(JavParser.StartContext ctx);
}