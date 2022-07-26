package day15_Scanner_StringClass;

import java.util.Scanner;

public class StringInput {
public static void main(String[] args) {
	/*next vs nextLine();
	 * 
	 */
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter your first name");
	String firstname = scan.nextLine();
	
	System.out.println("Please enter your last name");
	String lastname = scan.nextLine();
	
	System.out.println("My full name is: "+firstname+" "+lastname);
	
	
	
	
}
}
