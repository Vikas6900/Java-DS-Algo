package opperators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// right shift : 1101(13) -> 0110(6) -> 0011(3) -> 0001(1) -> 0000(0) -> 0000 --------
		// number is divided by 2 : floor[13/2] = 6
		int a = 5;
		int b = 6;
		int c = 10;
		int d = 13;
		
		
		int e = a & b;  // AND
		int f = c | d;  // OR
		int g = b >> 1; // right shift(divide) by 1 time
		int h = b << 1; // left shift(multiply) by 1 time
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);


	}

}
