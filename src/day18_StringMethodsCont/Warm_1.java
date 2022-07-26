package day18_StringMethodsCont;

import java.util.Scanner;

public class Warm_1 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Enter your first and last name");
	String firstName = input.nextLine();
	String lastName = input.nextLine();
   // String initials = firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase()+".";
   String initials =""+ firstName.charAt(0)+"."+lastName.charAt(0)+".";
	
	initials = initials.toUpperCase();
	
	System.out.println(initials);
	
int FirstNameIndex = firstName.length()-1;
int LastNameIndex = lastName.length()-1;

String LastLetters = ""+firstName.charAt(FirstNameIndex)+"."+lastName.charAt(LastNameIndex);
LastLetters = LastLetters.toLowerCase();
System.out.println("Last letters are: "+LastLetters);
    
    
    
    
    
    
    
    
    
}
}
