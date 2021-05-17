package condtionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter operand 1:");
		int a = sc.nextInt();
		
		System.out.println("Enter operand 2:");
		int b = sc.nextInt();
		
		System.out.println("Enter operation");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(op) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
			default:
				System.out.println("operation undefined...");
		}
		System.out.println("result = " + result);
	}

}
