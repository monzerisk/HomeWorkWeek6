package branching;

public class Question2 {
	
	public static void main(String[] args) {
		
		char gender = 'F';
		
		switch (gender) {
		case 'M' :
			System.out.println("Male");
			break;
		case'm' :
			System.out.println("Male");
			break;
		case'F' :
			System.out.println("Female");
			break;
		case 'f':
			System.out.println("Female");
			break;
			
			default:
			System.out.println("not a gender");
		}
		
		System.out.println("**************************");
		
		
			
			switch (gender) {
			case 'M' :
				System.out.println("Male");
				break;
			case'm' :
				System.out.println("Male");
				break;
			case'F' :
				System.out.println("Female");
				break;
			case 'f':
				System.out.println("Female");
				break;
				
				default:
				System.out.println("not a gender");
			}
		}

	
	}




