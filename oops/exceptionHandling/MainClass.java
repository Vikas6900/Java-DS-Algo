package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {

		try {
//			int a = 5;
//			int b = 0;
			int d[] = new int[5];
			
//			int c = a/b;
//			
//			System.out.println(c);
			System.out.println(d[6]);
		}catch(ArithmeticException e) {   //don't have to write exception it will handle all the exception rather differentiate it as ArithmeticException and any other you think will occurr
			System.out.println(e.getMessage() + " occured,please check your code.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index should be in range of 0 to (size of array - 1)");
		}catch(IllegalArgumentException e) {
			System.out.println("check cating carefully");
		}finally {
			System.out.println("sorry for inconvenience.");
		}
		
		System.out.println("Very important code...");
		System.out.println("needs to run");
		
		//fun1();
	}
	
	static void fun1() {
		int a = 5;
		int b = 0;
		
		int c = a/b;
		
		System.out.println(c);
	}

}
