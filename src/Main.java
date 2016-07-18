import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.List;

public class Main {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		System.out.println("\n Starting main");
		// TODO Auto-generated method stub
		JavLexer lexer = new JavLexer(new ANTLRFileStream("SampleProgramMethod2.jav"));
		JavParser parser = new JavParser(new CommonTokenStream(lexer));
		
		try {
			ParseTree tree = parser.start();
			System.out.println(tree.toStringTree(parser));
			NewVisitor visitor = new NewVisitor();
			visitor.visit(tree);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f = new File("SampleProgram11.jav");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write(sb.toString());
		
		System.out.println(sb.toString());
	    bw.flush();
	    bw.close();

	}

}
