package day18_StringMethodsCont;

import java.util.Scanner;

public class Warm1 {
public static void main(String[]args) {
	

	Scanner scan = new Scanner (System.in);
	
	/* mUhTar
	 * cYBerTek
	 * 
	 * output should be Muhtar Cybertek
	 */
	
	System.out.println("Enter your first and last name");
	String firstName = scan.nextLine();
	firstName = firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
	String lastName = scan.nextLine();
	lastName = lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase();
	String name = firstName+" "+lastName;
	System.out.println(name);
	
	String fName = scan.nextLine();
	String lName = scan.nextLine();
	
	fName = (""+fName.charAt(0)).toUpperCase()+fName.substring(1).toLowerCase();
	lName = (""+lName.charAt(0)).toUpperCase()+lName.substring(1).toLowerCase();
	String fullName = fName+" "+lName;
	System.out.println(fullName);
	
	
	
	
	
	
	
}
}
