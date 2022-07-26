package day12_SwitchStatement;

public class Switch_Statement {
public static void main(String[] args) {
	
	/* switch (Expression){
	 *  case CaseValue: 
	 *      statement1
	 *      statement2
	 *      break;
	 *      
	 *      default: // only one per switch statement
	 *      statement
	 * }
	 * 
	 * break is used to exit the switch statement
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	int score = 1;
	
	if(score == 1) {
		System.out.println("1");
	}else if(score == 2) {
		System.out.println("2");
	}else {
		System.out.println("Invalid");
	}
	
	switch (score) {
	case 1:
		System.out.println("1");
		break;
	case 2: System.out.println("2");
	        System.out.println("good job");
		break;
		
	default: 
	System.out.println("Invalid Score");
	break;
	}
	
	
	switch (score) {
	case 1:
		System.out.println("1, good");
		System.out.println("Great job, keep it up");
		break;
	default: 
		System.out.println("Invalid Score");
		break;
	case 2: System.out.println("2"); // can only have 1 default statement 
	        System.out.println("good job");
		break;
		
	
	}
	

	
	String str = "Automation";
	
	switch (str) {
	case "JS":
		System.out.println("fun also");
		break;
	default:
		System.out.println("Invalid");
		break;
	case "C#":
		System.out.println("Programming language");
		break;
	case "Python":
		System.out.println("Python Programming language");
		break;
	case "Java":
		System.out.println("Fun language");
		break;
	case "Automation":	
		System.out.println("Also Fun");
		break;
	}
	
	char grade = 'A';
	
	switch (grade) {
	default:
		System.out.println("Failed");
	case 'B':
		System.out.println("Passed");
	case 'A':
		System.out.println("A");
		break;
	case 'C':
		System.out.println("Passed with C");
	}
	
	int age = 151;
	if(age>=0 && age <=150) {
	if(age>=18 ) {
		if(age >=70) {
			System.out.println("You are eligible to vote three times");
		}else if(age>=50) {
			System.out.println("You can vote two times");
		}else {
			System.out.println("You can vote one time");
		}
	}else {
		System.out.println("Not Eligible to vote");
	}
	
	}else {
		System.out.println("Invalid Entry");
	}
	
	
	
	
}
}
