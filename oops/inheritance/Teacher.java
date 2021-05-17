package oops.inheritance;

public class Teacher extends Person {
	
	//to initialize name here we make construtor of teacher and call super() i.e. constructor of person.
	public Teacher(String name) {
		super(name);						//parent class constructor is called
		System.out.println("inside Teacher Constructor");
		
	}

	public void Teach() {
		System.out.println("Teacher " + name + " is Teaching...");
	}
	
	//override
	public void eat() {
		super.eat();          //first the eat of person is called and then exexute next line.
		System.out.println("Teacher " + name + " is Eating");
	}
	
	//override
	public void walk() {
		System.out.println("Teacher " + name + " is Walking");
	}
	
	public static void laughing() {
		System.out.println("Teacher is Laughing...");
	}
}
