package day16_Review;

import java.util.Scanner;

public class WarmUp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	/*write a java program that asks user to enter first and last names, then printout the users full name in all capital letters.
	 * 
	 * 
	 * 
	 */
	
	System.out.println("Enter your first name and last name");
	String firstName = scan.nextLine().toUpperCase();
	String lastName = scan.nextLine().toUpperCase();
	
	String fullname = lastName+", "+firstName;
	//fullname = fullname.toUpperCase();
	System.out.println("Your full name is: "+fullname);
	
	String fullname = firstName.concat(lastName);
	
	
}
}
