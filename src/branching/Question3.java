package branching;

public class Question3 {
	
	public static void main(String[] args) {
		
		int number = 1;
		
		switch (number % 2) {
		
		case 0:
			System.out.println("Number is Even");
			
			break;
			
		case 1:
			System.out.println("Numver is Odd");
			
			break;
			
			default:
				System.out.println("undetermined");
				
		}
	}

}

