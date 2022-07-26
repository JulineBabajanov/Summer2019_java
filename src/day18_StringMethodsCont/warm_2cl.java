package day18_StringMethodsCont;

import java.util.Scanner;

public class warm_2cl {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter your first name");
	
	String firstName = scan.nextLine();
	
	firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
	
	System.out.println("Enter your last name");
	String lastName = scan.nextLine();
	lastName = lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase();
	String fullName = firstName+" "+lastName;
	
	System.out.println("Your full name is: "+fullName);
}
}
