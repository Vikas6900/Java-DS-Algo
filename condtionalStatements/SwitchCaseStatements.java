package condtionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {

		int dayOfWeek = 6;
		
		switch (dayOfWeek) {
		case 1:
			System.out.println("Sunday Leave");
			break;
		case 2:
		case 5:
			System.out.println("Volley Ball");
			break;
		case 3:
		case 6:
		case 7:
			System.out.println("Cricket");
			break;
		case 4:
			System.out.println("Leave");
			break;
		default:
			System.out.println("Not Defined");
		}
	}

}
