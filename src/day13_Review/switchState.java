package day13_Review;

public class switchState {
public static void main(String[] args) {
	
	
	//switch statement.. expression is not a boolean expression
	
	int group = 5;
	
	switch(group) {
		
		case 1:
			System.out.println("Group 1");
		break;
		case 2:
			System.out.println("Group 2");
		case 3:
			System.out.println("Group 3");
		case 4:
			System.out.println("Group 4");
	default :
		System.out.println("default");
	
	}
	
	int num = 6;
	
	switch(num) {
	
	case 7: 
	System.out.println("Sunday");
	break;
	case 5:
		System.out.println("Friday");
	break;
	case 1:
		System.out.println("Monday");
	break;
	case 2:
		System.out.println("Tuesday");
	break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	default:
		System.out.println("Not a valid day");
		break;
	}
	
	
	
	String days = ("Saturday");
	
	switch(days){
		
		case "Monday": 
			System.out.println("Monday");
		//break;
		case "Tuesday":
			System.out.println("Tuesday");
		break;
		case "Wednesday":
			System.out.println("Wedesday");
		break;
		case "Saturday":
			System.out.println("The weekend!!!!");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Sunday":
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Invalid day");
	}
	
	
	// or || logic in the switch statement
	
	char grade = 'D';
	
	switch (grade) {
	
	case 'A':
	case 'B':
	case 'C':
		System.out.println("Passed the exam");
	break;
	case 'D':
		System.out.println("Average");
		break;
	default:
		System.out.println("Failed the exam");
	
	}
	
  String human = "Immigrant";
  
  switch(human) {
  
  case "USA":
  case "US":
	  System.out.println("American");
  break;
  
  case "Immigrant":
	  System.out.println("Immigrant");
	  break;
	  
	 default:
		 System.out.println("Invalid human being answer");
  
  }
	
	
	
	
	
}
}
