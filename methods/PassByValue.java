package methods;

class Dog{
	int legs;
	
}

public class PassByValue {
	public static void main(String[] args) {
//		int c = 34;
//		int d = 12;
//		
//		swap(c,d);
//		
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
		
//		Dog c = new Dog();
//		c.legs = 4;
//		Dog d = new Dog();
//		d.legs = 3;
//		
//		
//		swap(c,d);
		
//		System.out.println(c.legs + " " + d.legs);
		
		Dog a = new Dog();
		a.legs = 4;
		
		changeDog(a);
		
		System.out.println(a.legs);
		
		
	}
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a );
		System.out.println("b = " + b );
	}
	
	static void swap(Dog a,Dog b) {
		Dog temp = a;
		a = b;
		b = temp;
	}
	
	static void changeDog(Dog dog) {
		dog.legs = 6;
	}

}
