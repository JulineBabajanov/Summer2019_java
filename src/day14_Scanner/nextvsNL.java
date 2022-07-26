package day14_Scanner;

import java.util.Scanner;

public class nextvsNL {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	//next vs. nextLine
	
	System.out.println("Enter your first name");
	String firstName = scan.nextLine();
	
	System.out.println("Enter your last name");
	String lastName = scan.nextLine();
	
	System.out.println("Your name is "+firstName+" "+lastName);
	
	
	
	
	
	
	
	
	
	
	
}
}
