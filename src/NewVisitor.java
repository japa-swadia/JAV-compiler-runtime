
public class NewVisitor extends JavBaseVisitor<Integer>{
	
	@Override public Integer visitArith_op(JavParser.Arith_opContext ctx) { 
		
		return visitChildren(ctx); }
	
	
	@Override public Integer visitBool_value(JavParser.Bool_valueContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitInt_value(JavParser.Int_valueContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitRel_op(JavParser.Rel_opContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitValue(JavParser.ValueContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitType(JavParser.TypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitDeclr(JavParser.DeclrContext ctx) { 
		//System.out.println("Inside Integer Declaration");
		String id = ctx.ID().getText();
		String val = ctx.value().getText();
		Main.sb.append("store "+id+" "+val+"\n");
		return 0;
		 }
	
	@Override public Integer visitVar(JavParser.VarContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitVar_1(JavParser.Var_1Context ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitVar_2(JavParser.Var_2Context ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitBack(JavParser.BackContext ctx) { 
		if(ctx.var()!=null){
			String res = ctx.var().getText();
			Main.sb.append("return "+res+"\n");}
		else {
			Main.sb.append("return"+"\n");}
		
		return visitChildren(ctx); }
	
	
	@Override public Integer visitAssign(JavParser.AssignContext ctx) { 
		String id = ctx.ID().getText();
		if(ctx.var()!=null)
		{
			String var = ctx.var().getText();
			Main.sb.append("store "+id+" "+var+"\n");
		}
		else if(ctx.value()!=null)
		{		
			String val = ctx.value().getText();
			Main.sb.append("store "+id+ ""+val+"\n");
		}
		
			return visitChildren(ctx); 
		}
	
	@Override public Integer visitParameter(JavParser.ParameterContext ctx) { 
		String id = ctx.ID().getText();
		Main.sb.append("store "+id+"\n");
					
		return visitChildren(ctx); }
	
	@Override public Integer visitArith_expr(JavParser.Arith_exprContext ctx) { 
		String var = ctx.var().getText();
		String var1 = ctx.var_1().getText();
		if(ctx.var_2()!=null)
		{
		String var2 = ctx.var_2(0).getText();
		String var3 = ctx.var_2(1).getText();
		String oper = ctx.arith_op(0).getText();
		String oper2 = ctx.arith_op(1).getText();
		Main.sb.append("load "+var2+"\n");
		Main.sb.append("load "+var3+"\n");
		
		if(oper2.equalsIgnoreCase("+"))
			{Main.sb.append("ADD"+"\n");}
		else if(oper2.equalsIgnoreCase("-"))
			{Main.sb.append("SUB"+"\n");}
		else if(oper2.equalsIgnoreCase("*"))
			{Main.sb.append("MUL"+"\n");}
		else if(oper2.equalsIgnoreCase("/"))
			{Main.sb.append("DIV"+"\n");}
		else if(oper2.equalsIgnoreCase("%"))
			{Main.sb.append("MOD"+"\n");}
		Main.sb.append("load "+var1+"\n");
		
		if(oper.equalsIgnoreCase("+"))
		{Main.sb.append("ADD"+"\n");}
		else if(oper.equalsIgnoreCase("-"))
		{Main.sb.append("SUB"+"\n");}
		else if(oper.equalsIgnoreCase("*"))
		{Main.sb.append("MUL"+"\n");}
		else if(oper.equalsIgnoreCase("/"))
		{Main.sb.append("DIV"+"\n");}
		else if(oper.equalsIgnoreCase("%"))
		{Main.sb.append("MOD"+"\n");}
		//String var3 = ctx.var_2().toString();
		}
		
		Main.sb.append("store "+var+"\n");
		
		return 0; }
	
	@Override public Integer visitGen_expr(JavParser.Gen_exprContext ctx) { 
		String var1 = ctx.var_1().getText();
		if(ctx.var_2()!=null)
		{
		String var2 = ctx.var_2().getText();
		String rel_oper = ctx.rel_op().getText();
		Main.sb.append("load "+var2+"\n");
		Main.sb.append("load "+var1+"\n");
		if(rel_oper.equalsIgnoreCase("=="))
		{Main.sb.append("EQ2"+"\n");}
		else if(rel_oper.equalsIgnoreCase("<"))
		{Main.sb.append("LT"+"\n");}
		else if(rel_oper.equalsIgnoreCase(">"))
		{Main.sb.append("GT"+"\n");}
		else if(rel_oper.equalsIgnoreCase("<="))
		{Main.sb.append("LT_EQ"+"\n");}
		else if(rel_oper.equalsIgnoreCase("<="))
		{Main.sb.append("GT_EQ"+"\n");}
		else if(rel_oper.equalsIgnoreCase("="))
		{Main.sb.append("EQ"+"\n");}
		else if(rel_oper.equalsIgnoreCase("!="))
		{Main.sb.append("NT_EQ"+"\n");}
		}
		if(ctx.Digit()!=null)
		{
			String var12 = ctx.var_1().getText();
			String dig = ctx.Digit().getText();
			String rel_oper2 = ctx.rel_op().getText();
			//Main.sb.append("load "+dig+"\n");
			Main.sb.append("load "+var12+"\n");
			if(rel_oper2.equalsIgnoreCase("=="))
			{Main.sb.append("EQ2"+"\n");}
			else if(rel_oper2.equalsIgnoreCase("<"))
			{Main.sb.append("LT"+"\n");}
			else if(rel_oper2.equalsIgnoreCase(">"))
			{Main.sb.append("GT"+"\n");}
			else if(rel_oper2.equalsIgnoreCase("<="))
			{Main.sb.append("LT_EQ"+"\n");}
			else if(rel_oper2.equalsIgnoreCase("<="))
			{Main.sb.append("GT_EQ"+"\n");}
			else if(rel_oper2.equalsIgnoreCase("="))
			{Main.sb.append("EQ"+"\n");}
			else if(rel_oper2.equalsIgnoreCase("!="))
			{Main.sb.append("NT_EQ"+"\n");}
		}
		return 0; }
	
	@Override public Integer visitParam(JavParser.ParamContext ctx) { 
		String id = ctx.ID().getText();
		Main.sb.append(" "+id+"\n");
		//String id = ctx.ID().getText();
		return 0; }
	
	@Override public Integer visitOpen_sq(JavParser.Open_sqContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitClose_sq(JavParser.Close_sqContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitDouble_colon(JavParser.Double_colonContext ctx) { return visitChildren(ctx); }
	
	
	@Override public Integer visitDisplay(JavParser.DisplayContext ctx) { 
		String var = ctx.var().getText();
		Main.sb.append("load "+var+"\n");
		Main.sb.append("print ");
		
		//visitVar(ctx.var());
		Main.sb.append(var+"\n");
		
		return visitChildren(ctx);
		
	}
	@Override public Integer visitLoop(JavParser.LoopContext ctx) { 
		Main.sb.append("loopstart"+"\n");
		visitGen_expr(ctx.gen_expr());
		Main.sb.append("IFTRUE"+"\n");
		visitBody(ctx.body());
		//Main.sb.append("IFFALSE"+"\n");
		Main.sb.append("loopend"+"\n");
		
		return 0; }
	
	@Override public Integer visitOpen_brace(JavParser.Open_braceContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitClose_brace(JavParser.Close_braceContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitBody(JavParser.BodyContext ctx) { 
//		visitStatement(ctx.statement());
		
		return visitChildren(ctx); }
	
	@Override public Integer visitIf_else(JavParser.If_elseContext ctx) { 
		visitGen_expr(ctx.gen_expr());
		Main.sb.append("IFTRUE"+"\n");
		visitBody(ctx.body());
		
		//Main.sb.append(b)
		visitEls(ctx.els());
		return 0;
	}
	
	@Override public Integer visitEls(JavParser.ElsContext ctx) { 
		Main.sb.append("IFFALSE"+"\n");
		visitBody(ctx.body());
		
		Main.sb.append("endif"+"\n");
		return 0; }
	
	@Override public Integer visitParameters(JavParser.ParametersContext ctx) { 
		String p1 = ctx.param(0).getText();
		String p2 =ctx.param(1).getText();
		visitParam(ctx.param(0));
		visitParam(ctx.param(1));
		return visitChildren(ctx); }
	
	
	@Override public Integer visitArguments(JavParser.ArgumentsContext ctx) { return visitChildren(ctx); }
	
	
	@Override public Integer visitMethodcall(JavParser.MethodcallContext ctx) { 
		String id = ctx.ID().getText();
		String arg = ctx.arguments().getText();
		Main.sb.append("Methodcall "+id+" "+arg+"\n");
		return visitChildren(ctx); }
	
	@Override public Integer visitMethodstmt(JavParser.MethodstmtContext ctx) { 
		String name = ctx.ID().getText();
		
		//String param1 = ctx.parameters().param(0).ID().getText();
		String param2 = ctx.parameters().getText();
		//String id1 = ctx.parameters().param(0).ID().getText();
		//String id2 = ctx.parameters().param(1).ID().getText();
		Main.sb.append("Methodstart "+name+" "+param2+"\n");
		
		
			
		visitBody(ctx.body());
		Main.sb.append("Methodend "+name+"\n");
		return 0; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitStatement(JavParser.StatementContext ctx) { 
		
		return visitChildren(ctx); }
	
	@Override public Integer visitInc(JavParser.IncContext ctx) { 
		Main.sb.append("IFFALSE"+"\n"+"break"+"\n");
		String id = ctx.ID().getText();
		Main.sb.append("inc "+id+"\n");
		return visitChildren(ctx); }
	
	@Override public Integer visitDec(JavParser.DecContext ctx) { 
		String id = ctx.ID().getText();
		Main.sb.append("dec "+id+"\n");
		return visitChildren(ctx); }
	
	@Override public Integer visitFact_call(JavParser.Fact_callContext ctx) { 
		String type = ctx.type().getText();
		String var2 = ctx.var_1().getText();
		String id = ctx.ID().getText();
		
		Main.sb.append("load "+var2+"\n");
		visitMethodcall(ctx.methodcall());
		Main.sb.append("MUL"+"\n");
		Main.sb.append("store "+id+"\n");
		//Main.sb.append("call "+method+"\n");
		return 0; }
	
	@Override public Integer visitStack_declr(JavParser.Stack_declrContext ctx) { 
		String id = ctx.ID().getText();
		Main.sb.append("stack "+id+"\n");
		
		return visitChildren(ctx); }
	
	@Override public Integer visitStack_push(JavParser.Stack_pushContext ctx) { 
		
		String id = ctx.ID().getText();
		if(ctx.Digit() != null){
			String dig = ctx.Digit().getText();
			Main.sb.append("push "+id+" "+dig+"\n");
		}
		else if(ctx.var() != null){
			String var = ctx.var().getText();
			Main.sb.append("push "+id+" "+var+"\n");
		}
		return 0;
		}
	
	@Override public Integer visitStack_pop(JavParser.Stack_popContext ctx) { 
		if(ctx.type() != null)
		{
			String type = ctx.type().getText();
			String id = ctx.ID().getText();
			
			Main.sb.append("pop "+id+"\n");
			Main.sb.append("load "+id+"\n");
		}
		else
		{
			String id = ctx.ID().getText();
			Main.sb.append("pop "+id+"\n");
			Main.sb.append("load "+id+"\n");
		}
		return 0; }
	

}
