package day13_Review;

public class SwitchStatement {
	public static void main(String[] args) {
		
		
		/*switch(Expression){
		 * case CaseValue:
		 * statement1;
		 * statement2;
		 * break;
		 * 
		 * case CaseValue:
		 * statement1:
		 * statement2:
		 * break: (used for exiting the switch statement.
		 * if you dont have a break statement, code will continue to run
		 * until next break statement or }
		 * 
		 * default:
		 * statement1;
		 * statement2;
		 * break;
		 * 
		 * 
		 * }you can have as many cases as you want. 1 or 2 or 100
		 * caseValue must match with the switch expressions dataType
		 * 
		 * 
		 */
		
		int num=5;
		
		switch (num) {
		case 7:
			System.out.println("Sunday");
		    break; //its used for exiting the switch statement after the case is executed.
		    
		    default: System.out.println("Invalid Entry");
		    break;
		    
		    case 5: 
		    	System.out.println("Friday");
		    	break;
		}
		
		String days = "Tuesday";
		
		switch (days) {
		
		case "Monday":
			System.out.println("Monday is fun day");
			break;
		case "Tuesday":
		System.out.println("Tuesday is a great day");
		break;
		
		case "Wednesday":
			System.out.println("Wednesday is day off from school");
			break;
			
		default: System.out.println("Invalid");
		break;
		
		}
		
		char grade='A';
		switch (grade) {
		
		case 'A':
			System.out.println("did great");
			break;
		case 'B':
			System.out.println("passed the exam");
			break;
			
		default: 
			System.out.println("failed the exam");
		}
		
		String US="USA";
		if(US=="USA"|| US=="American"||US=="US") {
			System.out.println("American");
		} else {
			System.out.println("Not American");
		}
		
		switch(US) {
		case "US": 
		case "USA":
		case "American":
		
			System.out.println("American");
		break;
		default:
			System.out.println("Not American");
			break;
		}
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
	}

}
