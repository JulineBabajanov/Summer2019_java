package day14_Scanner;

public class WarmUp2 {
public static void main(String[] args) {
	
	String day = "Wednesday";
	
	switch (day) {
	
	case "Monday":
	
	case "Tuesday":
		System.out.println("Java class days");
	break;
	
	case "Thursday":
		
	case "Friday":
		System.out.println("Selenium class day");
	break;
	
	case "Wednesday":
	
	case "Saturday":
	System.out.println("SQL class days");
	break;
	
	case "Sunday":
		System.out.println("day off");
		break;
		
	default:
		System.out.println("Error");
	
	}
	
	int HTTPS = 502;
	
	switch (HTTPS) {
	
	case 202:
		System.out.println("ok");
		break;
	case 503:
		System.out.println("Service Unavailable");
	    break;
	case 502:
		System.out.println("Internal Service Error");
	break;
	default:
		System.out.println("Unavailable");
	break;
	case 403:
		System.out.println("Forbidden");
	break;
	case 400:
		System.out.println("Bad Request");
	}
	
	
	
	
	
	
}
}
