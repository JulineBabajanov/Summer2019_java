package day13_Review;

public class Task1 {
public static void main(String[] args) {
	
	String comp = "hp";
	
	switch (comp) {
	
	case "apple":
		System.out.println("Apple-no virus");
		break;
	case "dell":
		System.out.println("Tough one");
		break;
	case "acer":
		System.out.println("Cheap one");
	default:
		System.out.println("do not buy that one");
	}
	
	int day = 10;
	
	switch (day) {
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
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
	default:
		System.out.println("Not a given day");
	}
	
	
	
	
}
}
