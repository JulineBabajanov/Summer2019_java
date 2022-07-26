package day16_Review;

import java.util.Scanner;

public class rev1 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter your first name and last name");
	
	String firstName = scan.nextLine().toUpperCase(),
		    lastName = scan.nextLine().toUpperCase();
	
	String fullName = firstName+" "+lastName;
	//fullName = fullName.toUpperCase();
	System.out.println("Your full name is: "+fullName);
	
	
}
}
