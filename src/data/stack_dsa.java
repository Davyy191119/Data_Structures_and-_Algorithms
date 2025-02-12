
package data;


import java.util.Stack;

@SuppressWarnings("unused")
public class stack_dsa {

	
	public stack_dsa() {
		
	}

	public static void main(String[] args) {
	
		Stack <String > stack =new Stack <String>();
		//System.out.println(stack.empty());
		
		
		stack.push ("kyu");
		stack.push ("thika");
		stack.push ("kasongo");
		stack.push ("traore");
		stack.push ("oreshnik");
		stack.push (" elon musk");
		stack.push ("donald trump");
		//System.out.println(stack.peek());
		String us_president=stack.pop();
		String richest_man=stack.pop();
		String fastest=stack.pop();
		String best_president=stack.pop();
		String bad_president=stack.pop();
		
		
		System.out.println(us_president);
		System.out.println(fastest);
		System.out.println(richest_man);
		System.out.println(best_president);
		System.out.println(bad_president);
		//System.out.println(us_president);
	System.out.println(stack);
	for (int i=0 ;i<10;i++) {
		System.out.println(stack.search("kyu"));
		
		/**uses of stack:
		 * undo /redo features in windows @ctrl+z
		 * moving back and foward through browser history 
		 * backtracking algorithms 
		 * 	
		 */
	}
	
	}

}
