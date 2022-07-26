package day14_Scanner;

public class WarmUp1 {
public static void main(String[] args) {
	
	
	/*write a program that can display the days
	 * m || T java
	 * thurs or fri selenium
	 * wed or sat sql class
	 * default day off
	 */
	
	String days = "Sundays";
	
	switch (days) {
	
	case "Monday":
	case "Tuesday":
		System.out.println("Today is Java class");
	break;
	
	case "Thursday":
	case "Friday":
		System.out.println("Today is Selenium class day");
	break;
	case "Wednesday":
	case "Saturday":
		System.out.println("SQL class day");
	break;
	default:
		System.out.println("Not a valid day");
		break;
	case "Sunday":
		System.out.println("Day off today!");
	
	}
	
	
	
	
}
}
