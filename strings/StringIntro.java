package strings;

public class StringIntro {

	public static void main(String[] args) {

		
//		String name2 = "Vikas";
//		String anotherName = new String("Vikas");
//		
//		System.out.println(name == anotherName); // name->SPA & anotherName->Heaparea
//		System.out.println(name == name2);  // both are having same value stored in spa
//		
		
		String name = "Vikas Vimal Agarwal";
		String name2 = new String("Vikas Vimal Agarwal");
		
		System.out.println(name.length());  // length function (counts space as a char too)
		System.out.println(name.charAt(0));  // charAt function
		System.out.println(name.substring(6));  // substring function with only beginIndex
		System.out.println(name.substring(0,5));  // substring function with beginIndex and endIndex
//		System.out.println(name.substring(0,1));
//		System.out.println(name.substring(0,19));		
		System.out.println(name.contains("Vika"));  // contains function
		System.out.println(name == name2);          // checks with memory
		System.out.println(name.equals(name2));    // equals function checks with values ,retuns false even with a extra spae
		System.out.println(name.isEmpty());   // isEmpty function
		System.out.println(name + " is God"); // concat using "+"
		System.out.println(name.concat(" is God")); // concat function
		System.out.println(name.replace('V', 'v')); // replace function
		
		// split function , splits the cars from "," and save in allCars array.
		String cars = "Hyundai,Maruti,Swift,Wagonar,Ferrari,Lamborghini";
		String allCars[] = cars.split(",");
		for(String car: allCars) {
			System.out.println(car);
		}
		
		//indexOf function
		System.out.println(name.indexOf('V'));	
		System.out.println(name.indexOf('z'));	
		
		// toLowerCase function  Result: vikas vimal agarwal
		System.out.println(name.toLowerCase());

		// toUpperCase function  Result: VIKAS VIMAL AGARWAL
		System.out.println(name.toUpperCase());
		
		//Trim function
		String hello = "         Vikas       ";    
		System.out.println(hello);          //result:         Vikas       
		System.out.println(hello.trim());    // result:Vikas
	}

}
