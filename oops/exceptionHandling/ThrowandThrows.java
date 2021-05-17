package oops.exceptionHandling;

public class ThrowandThrows {

	public static void main(String[] args) {

		fun1();
	}
	static void fun1() {
		int a = 5;
		int b = 3;
		
		int c = a/b;
		
		System.out.println(c);
		
//		boolean isDanger = true;
//		if(isDanger) {
//			throw new ArrayIndexOutOfBoundsException("Danger Incoming....");
//		}
//		try {
//			fun2();
//		}catch(Exception e) {
//			System.out.println(e.getMessage() + " occured");
//		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After Delay");
	}
	
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger Incoming....");
		}
		
	}


}
