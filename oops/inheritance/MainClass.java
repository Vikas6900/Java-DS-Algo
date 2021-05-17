package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
//		Singer s1 = new Singer("Sonu Nigam");
		
//		Person p = t;    //upcasting,as teacher is  a person.
		
//		Person p = new Person();
		
		Teacher t =  new Teacher("Jayendrath Mangrolia");
//		Person p = t;
//		Teacher t1 =(Teacher) p;   //downcasting   person may be a teacher.
//		
//		System.out.println(t1 instanceof Teacher);  // true
//		System.out.println(s1 instanceof Singer);   // true
//		System.out.println(t instanceof Person);    // t instance of teacher and teacher instance of person so ultimately true. 
//		System.out.println(t1 instanceof Person);   // t1 instance of teacher therefore instance of person so true.
//		System.out.println(p instanceof Singer);    // p comes from teacher hence false.
//		System.out.println(p instanceof Teacher);   // true as p comes from teacher
		
//		t.name = "Jayendrath Mangrolia";			// done via constructor afterwards
		t.eat();                                    // super keyword
//		t.walk();		
//		t.Teach();
//		t.laughing();		
//		Singer s = new Singer();		
//		s.name = "Sonu Nigam";		
//		s.Sing();		
//		s.eat();
				
	}

}
