package day17_StringContinued;

import java.util.Scanner;

public class warmUp2 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner (System.in);
	
    System.out.println("Enter your first name");
	String firstName = scan.nextLine();
	
	System.out.println("Enter your last name");
	String lastName = scan.nextLine();
	
	String fullName = firstName +" "+ lastName;
	
	System.out.println("Your full name is: "+fullName);
	
	
	
}
}
