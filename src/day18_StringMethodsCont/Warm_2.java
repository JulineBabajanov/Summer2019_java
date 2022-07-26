package day18_StringMethodsCont;

import java.util.Scanner;

public class Warm_2 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter your first name");
	String firstName = input.nextLine();
	firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
	System.out.println("Enter your last name");
	String lastName = input.nextLine();
	 lastName = lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase();
	String fullName = lastName+", "+firstName;
	System.out.println(fullName);
	
	
}
}
