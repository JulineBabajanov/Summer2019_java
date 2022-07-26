package day18_StringMethodsCont;

import java.util.Scanner;

public class warm {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter your first and last name");
	String first = scan.nextLine().toUpperCase();
	String last = scan.nextLine().toUpperCase();
	
	String initials1 = "Your initials are "+  first.charAt(0)+"."+last.charAt(0)+".";
	
	System.out.println(initials1);
	 
	System.out.println("Enter your first and last name please");
    String firstName = scan.nextLine();
	String lastName = scan.nextLine();
	
	String initials = firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase()+".";
	System.out.println(initials);
	
	String LastLetters = (""+firstName.charAt(firstName.length()-1)
	+"."+lastName.charAt(lastName.length()-1));
	
	System.out.println("last letters "+LastLetters);
	
	
	
}
}
