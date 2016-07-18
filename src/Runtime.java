import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Runtime {

	public static void main(String[] args) throws IOException{
		String line ="";
		int result,loop_index = 0;
		boolean check_result = true, func_flag = false,loop_flag = false;		
		HashMap<String,String> current = new HashMap<>();
		HashMap<String,String> function = new HashMap<String,String>();
		Stack<String> currentStack = new Stack<String>();
		Stack<String> funccall = new Stack<String>();		
		ArrayList<String> func = new ArrayList<String>();
		ArrayList<String> loop = new ArrayList<String>();
		HashMap<String, Stack<String>> stackImp = new HashMap<String, Stack<String>>();
		Stack<String> temp;
		String tempString;
		//ArrayList<String> tempStringarray = new ArrayList<String>();
		String[] tempStringarray;
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/japas_000/workspace/Compiler/SampleProgram0.txt"));
		int index = 0, k = 0;
		while(!line.equals("Methodstart main") ) {
			line = br.readLine();
			
			func.add(index++,line);
		}		
		line = br.readLine();
		while(line != null) {
			String[] tokens = line.split(" ");
			switch(tokens[0]) {
				case "store": if(tokens.length == 3) {
									current.put(tokens[1], (tokens[2]));
								}
							  else {
								  temp = stackImp.get(tokens[3]);
								  current.put(tokens[1], temp.pop());
							  }
				
							  break;
				case "load" :if(!func_flag) {
								currentStack.push(current.get(tokens[1]));
							 }
							 else {
								 currentStack.push(function.get(tokens[1]));
							 }
							  break;
				case "mul" : result = Integer.parseInt(currentStack.pop()) * Integer.parseInt(currentStack.pop());
							 currentStack.push(result+"");					        
							 break;
				case "add" : result = Integer.parseInt(currentStack.pop()) + Integer.parseInt(currentStack.pop());
							 currentStack.push(result+"");					        
							 break;
				case "sub" : result = Integer.parseInt(currentStack.pop()) - Integer.parseInt(currentStack.pop());
							 currentStack.push(result+"");
							 break;
				case "div" : result = Integer.parseInt(currentStack.pop()) / Integer.parseInt(currentStack.pop());
							 currentStack.push(result+"");
							 break;
				case "print" : System.out.println(currentStack.pop());							   
							   break;
				case "EQ2" : if(currentStack.pop().equals(currentStack.pop())) {
									check_result = true;
							 }
							 else {
								 check_result = false;
							 }
							 break;
				case "printstr" : for(int i = 1; i < tokens.length; i++) {
									System.out.print(tokens[i]+" ");
								}
									System.out.println();
								break;
								
				case "IFTRUE" : if(!check_result) {
									if(loop_flag) {
										//while(!(line=loop[loop_index++]).equals("IFFALSE"));
										while(!(line=loop.get(loop_index++)).equals("IFFALSE"));
									}
									else if(!func_flag) {
											while(!(line=br.readLine().trim()).equals("IFFALSE"));
									}
									else {
											//while(!(line=func[k++]).equals("IFFALSE"));
										while(!(line=func.get(k++)).equals("IFFALSE"));
									}
								}
								break;
				case "IFFALSE" : if(check_result) {
									if(loop_flag) {
										//while(!(line=loop[loop_index++]).equals("endif"));
										while(!(line=loop.get(loop_index++)).equals("endif"));
									}
									else if(!func_flag) {
										while(!(line=br.readLine().trim()).equals("endif"));
									}
									else {
										//while(!(line=func[k++]).equals("endif"));
										while(!(line=func.get(k++)).equals("endif"));
									}
								}
								break;
				case "Methodcall" : func_flag = true;
								  k = 0;
								  tempString = tokens[2];
								  tempStringarray = tempString.split(",");
								  for(int i = 0; i < tempStringarray.length; i++) {
									  funccall.push(tempStringarray[i]);
								  }
								  break;
				case "Methodstart" : function.clear();
							  tempString = tokens[2];
							  tempStringarray = tempString.split(",");
							  for(int i = 0;i < tempStringarray.length; i++) {
								  function.put(tempStringarray[i].charAt(tempStringarray[i].length()- 1)+"",funccall.pop());
							  }
							  break;
				case "less" : if((Integer.parseInt(currentStack.pop()) < Integer.parseInt(currentStack.pop()))) {
									check_result = true;					
							  }
								else {
									check_result = false;
								}
							  break;
				case "lesseq" : if((Integer.parseInt(currentStack.pop()) <= Integer.parseInt(currentStack.pop()))) {
									check_result = true;					
								}
								else {
									check_result = false;
								}
								break;
				case "GT" : if((Integer.parseInt(currentStack.pop()) > Integer.parseInt(currentStack.pop()))) {
									check_result = true;					
								}
								else {
									check_result = false;
								}
								break;
				case "gratereq" : if((Integer.parseInt(currentStack.pop()) >= Integer.parseInt(currentStack.pop()))) {
									check_result = true;					
								}
								else {
									check_result = false;
								}
								break;	
				case "Methodend" : func_flag = false;
								 break;
				case "loopstart": while(!(line = br.readLine()).equals("loopend")) {
									//loop[loop_index++] = line;
									  loop.add(loop_index++, line);
									
								 }
								 loop_flag = true;
								 loop_index = 0;
								 break;
				case "break" : loop_flag = false;
							   break;
				case "inc" : current.put(tokens[1], (Integer.parseInt(current.get(tokens[1]))+1)+"");
						     loop_index = 0;
							 break;
				case "stack" : temp = new Stack<String>();
							   stackImp.put(tokens[1], temp);
							   break;
				case "push" : temp = stackImp.get(tokens[1]);
							  temp.add(tokens[2]);
							  stackImp.put(tokens[1],temp);
							  break;
							  
				case "Methodend Main":break;
				
			}
			
			if(loop_flag) {
				//line = loop[loop_index++];
				line = loop.get(loop_index++);
			}
			else if(!func_flag) {
				line = br.readLine();
			}
			else {
				//line = func[k++];
				line = func.get(k++);
			}
			
		}

	}

}