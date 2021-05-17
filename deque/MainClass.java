package deque;
import java.util.ArrayDeque;

public class MainClass {
	
	public static void main(String[] args) {

	ArrayDeque<Integer> ad  = new ArrayDeque<>();
	
//	ad.addFirst(5);
//	ad.addFirst(10);
//	
//	ad.pop();
//	System.out.println(ad.peek());
	
	ad.push(5);
	ad.push(10);
	System.out.println(ad.pop());
	System.out.println(ad.pop());

	
	}
}
