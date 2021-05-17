package oops.finaKeyword;

public class Student {
	
	final int ROLL_NO;
	final String F_NAME;
	final static String L_NAME;
	
	
	
	// Two Ways to initialaize Variable
	// 1.Initializer Block
	{
		ROLL_NO = 4;
	}
	
	// 1.1) To initialize static var static initializer block is used
	static {
		L_NAME = "Agarwal";
	}

	// 2.Constructor
	public Student() {
		F_NAME = "Vikas";
	}
}
