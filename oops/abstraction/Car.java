package oops.abstraction;

public abstract class Car {

	// abstract methods
	public abstract void accelerate();
	
	public abstract void brake();
	
	
	// concrete method
	public void honk() {
		System.out.println("Car is Honking...");
	}
}
