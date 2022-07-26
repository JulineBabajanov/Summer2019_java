package day18_StringMethodsCont;

import java.util.Scanner;

public class WarmUp {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	/* Write a program that asks user first and last names. Then print out the initials of the user.
	 * Ex. Enter your first and last names:
	 * Cybertek
	 * batch12
	 * 
	 * output:: initial is: CB
	 * 
	 */
	
	System.out.println("Enter your first and last name");
	/*String firstName= input.nextLine();
	String lastName= input.nextLine();
	
//	String initials = firstName.substring(0,1).concat(".")+lastName.substring(0,1).concat(".");
    String initials = firstName.charAt(3)+"."+lastName.charAt(0)+".";
	initials = initials.toUpperCase();
    
	System.out.println("Initials is: "+initials);
	
	
	System.out.println("Enter your last name and first name");
	String name1 = input.nextLine().toUpperCase();
	String name2 = input.nextLine().toUpperCase();
	
	String initials1 = name1.charAt(0)+"."+name2.charAt(0)+".";
	
	System.out.println(initials1);
	*/
	String firstName= input.nextLine().toUpperCase();
	String lastName= input.nextLine().toUpperCase();
	String initials = firstName.substring(0,1).concat(".")+lastName.substring(0,1).concat(".");
	System.out.println(initials);
	
	System.out.println("Please enter the name of your mom");
	String init1=input.nextLine().toUpperCase();
	String init2=input.nextLine().toUpperCase();
	String init=init1.substring(0,1)+"."+init2.substring(0,1)+".";
	System.out.println(init);
	
	
	System.out.println("Please enter your dads name");
	String name = input.nextLine().toUpperCase();
	String name2 = input.nextLine().toUpperCase();
	String initials1 = name.substring(0,1)+"."+name2.substring(0,1)+".";
	System.out.println(initials1);
	
	System.out.println("Please enter your husbands name");
	String hus = input.nextLine().toUpperCase();
	String hus1 =input.nextLine().toUpperCase();
	String husb = hus.substring(0,1)+"."+hus1.substring(0,1)+".";
	
	System.out.println(husb);
	

	

	
	
	
	
}
}
