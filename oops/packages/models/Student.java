package oops.packages.models;

public class Student {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		getPassword();     //as it is private it will be accessible inside class.
		return name;
	}
	
	private String getPassword() {
		return "lxgdlqdlqwglkw";
	}
	
	String getPassword1() {
		return "123456";
	}
	
	public String getPassword2() {
		return "123456";
	}
}
