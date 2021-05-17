package whileLoops;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n;
		
		int sum = 0;
		
		int noOfDigits =(int) Math.log10(n) + 1;
		System.out.println("digits = " + noOfDigits);
		
		while(temp > 0) {
			int lastDigit = temp % 10;
			temp /= 10;
			
			sum += lastDigit;
			System.out.println(lastDigit + " " + temp + " " + sum);
		}
		System.out.println("sum of digits of "+ n + " is " + sum);
	}

}
