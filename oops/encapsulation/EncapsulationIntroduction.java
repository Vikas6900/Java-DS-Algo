package oops.encapsulation;

public class EncapsulationIntroduction {

	public static void main(String[] args) {

		Student obj = new Student();
		
//		obj.name = "Vikas";
//		obj.age = 21;
		
		obj.setName("Vikas");
		System.out.println(obj.getName());
		
		obj.setAge(21);
		System.out.println(obj.getAge());
	}

}
