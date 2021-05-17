package oops.encapsulation;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 40) {
			System.out.println("You're not eligible");
		}else {
		this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null) {
			System.out.println("Enter valid name");
		}else {
		this.name = name;
		}
	}
	
}
