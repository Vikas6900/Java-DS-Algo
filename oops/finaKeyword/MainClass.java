package oops.finaKeyword;

public class MainClass /* extends Student1*/ {
	
	//final String ROLL_NO = "21";  //it is a global var and final so must be initialized.
	
	/*public void getDescription() {
		System.out.println("inside main class");
	}*/

	public static void main(String[] args) {

		//final String NAME;   // it is a local variable hence it is ok if we don't initalise it.
		//name = "Agarwal";
		
		
		final Student1 obj1 = new Student1();
		Student1 obj2 = new Student1();
		//obj1 = obj2;   //The reference of obj1 is given to obj2.but after final we cannot do it
		
		// we can change the properties of final obj
		
		obj1.Name = "Vikas";

		//MainClass main = new MainClass();
		
		//main.getDescription();
		
		
		
		
		
	}

}
