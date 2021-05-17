package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
//  Run-Time polymorphism.
		
		Dog d = new Dog();
		Pet p = d;
		Animal a = d;
		
		d.walk();
		p.walk();  //Calls the method of dog as in run time it checks for reference of p which is d and d is reference of dog. 
		
		System.out.println(d.name);
		System.out.println(p.name);
		
//  Compile-Time polymorphism
		
		Greeting();
		Greeting("Vikas");
		Greeting("Vikas",5);
		
	}
	
	public static void Greeting(String s, int count) {

		for(int i = 0;i < count; i++) {
			System.out.println(s);
		}
	}

	public static void Greeting(){
		System.out.println("Hii, There");
	}
	
	public static void Greeting(String s){
		System.out.println(s);
		
	}

}
