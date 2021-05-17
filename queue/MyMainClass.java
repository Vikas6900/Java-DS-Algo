package queue;

public class MyMainClass {

	public static void main(String[] args) {

		MyQueue<Integer> myq = new MyQueue<>();
		
		myq.enqueue(12);
		myq.enqueue(24);
		myq.enqueue(36);
		myq.enqueue(48);
		
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());

		myq.enqueue(60);
		
		System.out.println(myq.dequeue());

	}

}
