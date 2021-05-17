package nestedForLoops;

import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		for(int i = 1 ; i <= n; i++) {
//			for(int j = n; j >= i; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//2 way. some changes in code of pattern 2 . instead of i we have n-i+1
		
		for(int i = 1 ; i <= n; i++) {
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
