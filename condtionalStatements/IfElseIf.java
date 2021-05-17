package condtionalStatements;

public class IfElseIf {

	public static void main(String[] args) {
		int no=45;
		
		if(no >= 1 && no <= 10) {
			System.out.println("number between 1 and 10");
		}else if(no > 10  && no <= 20) {
			System.out.println("number between 10 and 20");
		}else if(no > 20 && no <= 30) {
			System.out.println("number between 20 and 30");
		}else {
			System.out.println("number greater than 30");
		}
	}

}
