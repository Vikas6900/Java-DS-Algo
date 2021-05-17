package oops;


class Vehicle{
	int wheels;
	int headlights;
	String color;
	
	
	// no argument constructor
	Vehicle(){
		wheels = 4;
		headlights = 2;
	}
											//when using both types in single class is known as 
											//constructor overloading.
	// Parameterized Constructor
	Vehicle(int wheels){
		this.wheels = wheels;
		headlights = 2;
	}
	
	Vehicle(int wheels,String color){
		this.wheels = wheels;
		this.color = color;
		headlights = 2;
	}
}

public class MyConstructor {
	
	MyConstructor(){
		System.out.println("obj created..");
	}

	public static void main(String[] args) {

//		MyConstructor obj = new MyConstructor();
		
		Vehicle car = new Vehicle();                   //no arg constructor is called
		Vehicle car2 = new Vehicle(4);                 // parameterized constructor is called
		Vehicle scooty = new Vehicle(2,"red");			   // parameterized constructor is called
		System.out.println(car.wheels + " wheels " + car2.wheels + " wheels " + scooty.wheels + " wheels with color " + scooty.color );
	}

}
