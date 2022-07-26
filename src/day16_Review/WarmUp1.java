package day16_Review;

import java.util.Scanner;

public class WarmUp1 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	/*write a java program that asks user to enter first and last names
	 * then print out the users full name in all capital
	 * fullname: LastName FirstName
	 * 
	 * 
	 */
	
	System.out.println("Enter your first name and last name");
	
	String firstName = input.nextLine().toUpperCase(),
	        lastName = input.nextLine().toUpperCase();
	String fullName= firstName+" "+lastName;
	//fullName=       fullName.toUpperCase();
	System.out.println("Your full name is: "+fullName);
	
	System.out.println("Enter your spouse full name");
	String spouseFirstName = input.nextLine().toUpperCase(),
	       spouseLastName = input.nextLine().toUpperCase();
	 String spouseFull = spouseFirstName+" "+spouseLastName;
	 System.out.println("Your spouse fullname is "+spouseFull);
	 System.out.println("Enjoy the day together " +fullName+" and "+spouseFull+"!!!!!!");
	
	 
	
	
	
}
}
