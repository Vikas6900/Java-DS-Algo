package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
	
	static {
		System.out.println("in Block 1");
	}
	
	static {
		System.out.println("in block 2");
	}

	public static void main(String[] args) {
		
		A ObjA = new A();
//		A.B ObjB = ObjA.new B();
		B ObjB = ObjA.new B();
		
//		A.C objC = new A.C();
		C objC = new A.C();
		
		System.out.println("in Main");
		
		
		
	}

}
