package oops;

class Cat{
	boolean hasFur;
	String color,breed;
	
	int legs,eyes;
	
	public void walk() {
		System.out.println("Cat is Walking...");
	}
	public void eat() {
		System.out.println("Cat is Eating....");
	}
	public void description() {
		System.out.println("My Cat has " + legs + " legs and " + eyes + " eyes.");
	}
}

class Dog{
	
	String breed,name;
	
	public void jump() {
		System.out.println("My dog " + name + " jumped...");
	}
	public void description() {
		System.out.println("My dog's name is "+ name + " and is of " + breed + " breed.");
	}
	
}


public class MainClass {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.legs = 3;
		cat1.eyes = 2;
		
		cat2.legs = 4;
		cat2.eyes = 2;
		
		cat1.walk();
		cat2.eat();
		cat1.description();
		cat2.description();
		
//		Dog husky = new Dog();
//		Dog poodle = new Dog();
//		
//		husky.name = "Browny";
//		husky.breed = "Husky";
//		
//		poodle.name = "Moolchand";
//		poodle.breed = "Poodle";
//		
//		husky.jump();
//		husky.description();
//		
//		poodle.jump();
//		poodle.description();
		
		
	}

}
