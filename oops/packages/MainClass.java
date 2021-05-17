package oops.packages;

import oops.packages.models.Student;


public class MainClass {

	public static void main(String[] args) {

		Student obj = new Student("Vikas");
		//obj.name = "Vikaaaas"; ->as name is private in student class it will not be visible in main class.
		
		//obj.getPassword(); -> as it is private The method getPassword() from the type Student is not visible.       
		
		//obj.getPassword1(); -> as it is default The method getPassword1() is not visible outside the package.
		
		obj.getPassword2(); // it is public
	}

}
