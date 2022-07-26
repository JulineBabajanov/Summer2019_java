package day18_StringMethodsCont;

import java.util.Scanner;

public class initials {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter your first name");
	String firstName = scan.nextLine();
	firstName = firstName.substring(0, 1).toUpperCase();
	System.out.println("Enter your last name");
	String lastName = scan.nextLine();
	lastName = lastName.substring(0, 1).toUpperCase();
	String initials = firstName+"."+lastName+".";
	
	System.out.println("Your initials are "+initials);
}
}
