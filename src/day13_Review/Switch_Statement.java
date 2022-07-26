package day13_Review;

public class Switch_Statement {
public static void main(String[] args) {
	
	int num = 5;
	
	switch (num) {
	
	case 7:
		System.out.println("Sunday");
		break;
		
	default:
		System.out.println("Invalid Entry");
	   break;
	    
	case 10-5:
		System.out.println("Friday");
	break;
	}
	System.out.println("\n");
	
	String days = "Sday";
	
	switch (days) {
	
	case "Sunday":
		System.out.println("Today is the weekend");
	    break;
	case "Monday":
		System.out.println("Today everyone needs coffee to function well");
	    System.out.println("Nobodys favorite day");
	break;
	case "Tuesday":
		System.out.println("Getting a little closer to the weekend");
		break;
	case "Wednesday":
		System.out.println("Hump Day");
		break;
	case "Thursday":
		System.out.println("Hurry up Friday!");
		break;
	case "Friday":
		System.out.println("Everyone favorite day");
		break;
	default:
		System.out.println("Not a valid day");
		break;
	case "Saturday":
		System.out.println("Happy Weekend!!!!!");
          break;
	}
	
	/*Four data types are not accepted
	 * double, float = 10f... must be evaluated to a single value only
	 * long because you can declare L or l
	 * boolean because words true or false 10 > 9 
	 */
	
	
	String parks ="KennyWood";
	
	switch(parks) {
	case "KennyWood":
		System.out.println("Best Fries");
	}
	
	char grade = 'A';
	
	switch (grade) {
	
	case 'A':
	case 'B':
		System.out.println("Great grade!");
	break;
	
	default:
		System.out.println("Failed the exam");
	}
	
	String US = "US";
	if(US=="USA" || US=="America") {
		System.out.println("American");
	}else {
		System.out.println("Not American");
	}
	
	switch(US) {
	case "USA":
	case "America":
	case "US":
			System.out.println("American");
	break;
	default:
		System.out.println("Not American");
	}
	
	
	
}
}
