package queue;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();
		
		q.add(12);
		q.add(24);
		q.add(36);
		
		System.out.println(q);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.element());
		System.out.println(q.remove());
		
		//System.out.println(q.remove());
		
		System.out.println(q.poll());
		
		//System.out.println(q.element());
		
		System.out.println(q.peek());
	}

}
