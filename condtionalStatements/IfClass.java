package condtionalStatements;
import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {

		
		
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You Can Vote Now!!");
		}
	}

}
