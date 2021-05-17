package opperators;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int a = 20;
		int b = 49;
		// to find a[square] + b[square]
		int c = a * a + b * b + 2 * a * b;
		int d = (a + b) * (a + b);
		double e = (double)b / (double)a;
		int f = b % a;
		int g = b++; // g=b and then b = b+1
		int h = ++b; // first b= b + 1 and then h=b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g + " " + b );
		System.out.println(h + " " + b );


	}

}
