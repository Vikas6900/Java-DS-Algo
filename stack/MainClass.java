package stack;

//import java.util.Stack;

public class MainClass {

	public static void main(String[] args) throws Exception{

//		Stack<Integer> stack = new Stack<>();
//		
//		stack.push(12);
//		stack.push(24);
//		stack.push(36);
//		
//		int popped = stack.pop();
//		
//		int peeked = stack.peek();
//		
//		System.out.println("popped = " + popped + " peeked = " + peeked);
		
		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(12);
		stack.push(24);
		stack.push(36);
		
		int popped = stack.pop();
		
		int peeked = stack.peek();
		
		System.out.println("popped = " + popped + " peeked = " + peeked);
	}

}
