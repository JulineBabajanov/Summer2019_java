package day16_Review;

import java.util.Scanner;

public class WarmUp2 {
public static void main (String []args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter first name");
	String firstname = input.nextLine(); //.toUpperCase
	
	System.out.println("Enter last name");
	String lastname = input.nextLine(); //.toUpperCase
	
	String fullname = lastname+", "+firstname;
	//fullname = fullname.toUpperCase();
	System.out.println("Your full name is "+fullname.toUpperCase());
	
	
	
	
}
}
