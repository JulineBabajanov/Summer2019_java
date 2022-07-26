package day16_Review;

import java.util.Scanner;

public class ConcatName {
public static void main(String[] args) {
	Scanner name = new Scanner (System.in);
	
	System.out.println("Please enter your first name");
	String firstName=name.nextLine().toUpperCase();
	
	System.out.println("Please enter your last name");
	String lastName=name.nextLine().toUpperCase();
	
	String fullName = firstName.concat(" "+lastName);
	
	System.out.println("Your full name is: " +fullName);
	
	System.out.println("What is your daughters first name");
	String daughterFirst = name.nextLine().toUpperCase();
	
	System.out.println("What is your daughters last name");
	String daughterLast = name.nextLine().toUpperCase();
	
	//String daughterFullName = daughterFirst.concat(" "+daughterLast).toUpperCase();
	
	String daughterFullName = daughterFirst+" "+daughterLast;
	
	System.out.println("Your daughters full name is: "+daughterFullName);
}
}
