package day18_StringMethodsCont;

import java.util.Scanner;

public class Warm5 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter your first and last name");
	String firstName = input.nextLine();
	String lastName = input.nextLine();
	
	//String initials = firstName.substring(0,1).toUpperCase() +"."+ lastName.substring(0,1).toUpperCase()+".";
	
	
	//System.out.println(initials+" are your initials");
	
	int FirstNameIndex = firstName.length()-1;
	int LastNameIndex = lastName.length()-1;
	
	String LastLetters = ""+firstName.charAt(FirstNameIndex)+"."+lastName.charAt(LastNameIndex)+".";
	
	
	System.out.println(LastLetters.toUpperCase());
	
}
}
