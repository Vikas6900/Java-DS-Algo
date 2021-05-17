package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
//		 
//		 String Hello = sc.nextLine();
//		 System.out.println(Hello);
		
		
		
		int princpal = sc.nextInt();
		
		float rate = sc.nextFloat();
		
		int time = sc.nextInt();
		
		float simpleInterest = princpal * rate * time / 100;
		
		System.out.println("The simple interest is " + simpleInterest);
				 
	}

}
