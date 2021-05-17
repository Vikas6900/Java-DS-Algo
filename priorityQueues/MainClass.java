package priorityQueues;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {


		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("Kiwi");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Banana");
		
		System.out.println(pq);   //they can be in any order inside but comes out sorted.
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		
	}

}
