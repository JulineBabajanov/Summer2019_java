package day13_Review;

public class Switch_Statement2 {
public static void main(String[] args) {
	
	
	/* break statement is used to exit the switch statement
	 * if you don't have a break statement the code will continue to run until it finds another break statement or a closing curly brace.
	 * 
	 * default:  // gets executed when there is no case that matches with the given Expression
	 *    statement1;
	 *    statement2;
	 *    break;
	 *    
	 *    
	 *    switch(Expression){
	 *    case caseValue:
	 *    statement;
	 *    break;
	 *    }
	 * 
	 */
	
	
	int num = 5;
	
	switch(num) {
	
	case 7:
		System.out.println("the answer is 7");
		System.out.println("Sunday");
	    break; //used to exit the switch statement
	    
	default:
		System.out.println("Hello");
		break;
		
	case 8:
		System.out.println("5");
	}
	
	String days = "Wednesday";
	
	switch(days) {
	
	case "Monday":
		System.out.println("Today is Monday");
	    break;
	    
	case "Tuesday":
		System.out.println("Today is Tuesday");
	    break;
	    
	case "Wednesday":
		System.out.println("Today is Wednesday");
	
		
	case "Thursday":
		System.out.println("Today is Thursday");
	    break;
	    
	case "Friday":
		System.out.println("Today is Friday");
		break;
	case "Saturday":
		System.out.println("Today is Saturday");
		break;
		
	case "Sunday":
		System.out.println("Today is Sunday");
		break;
		
		default:
			System.out.println("Invalid entry");
	}
	
	
	
	char grade = 'F';
	
	switch(grade) {
	
	case 'A':
	case 'B':
		System.out.println("You passeed the exam");
	break;
	
	case 'C':
		System.out.println("Average");
	break;
	
	case 'D':
	case 'F':
		System.out.println("failed");
	break;
	
	default:
		System.out.println("invalid entry");
		break;
	}
	
	
	String US = "USA";
	if (US=="USA" || US=="America" || US=="US" ) {
		System.out.println("American");
	}else {
		System.out.println("Not American");
	}
	
	switch(US) {
	case "US":
	case "USA":
	case "American":
		System.out.println("American");
	break;	
	default:
		System.out.println("Not american");
	}
	
}
}
