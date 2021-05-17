package oops.inheritance;

public class Singer extends Person {

	public Singer(String name) {
		super(name);
	}

	public void Sing() {
		System.out.println("Singer " + name + " is Singing...");	
	}
	
	//override
	public void eat() {
		System.out.println("Singer " + name + " is Eating");
	}
	
	public static void laughing() {
		System.out.println("Singer is Laughing...");
	}
}
