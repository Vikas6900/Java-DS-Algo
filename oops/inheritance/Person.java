package oops.inheritance;

public class Person {
	protected String name;
	
	public Person(String name) {
		this.name = name;
		System.out.println("inside Person Constructor");
	}
	
	public void walk() {
		System.out.println("person " + name + " is Walking...");
	}
	public void eat() {
		System.out.println("person " + name + " is Eating...");
	}

	public static void laughing() {
		System.out.println("Person is Laughing...");
	}
}
