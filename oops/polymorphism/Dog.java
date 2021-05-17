package oops.polymorphism;

public class Dog extends Pet {

	String name = "Dobby";  //it will not override the namme var of pet but will hide it from other subclsses.
	public void walk() {
		System.out.println("Dog is walking...");
	}
}
