package day18_StringMethodsCont;

import java.util.Scanner;

public class MoreInitialPrac {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Please enter your name");
	String firstName =input.nextLine();
	String lastName = input.nextLine();
	String fullName = firstName.charAt(0)+"."+lastName.charAt(0)+".";
	fullName = fullName.toUpperCase();
	System.out.println(fullName);
	
	System.out.println("Please enter your childs first and last name");
	String name1 = input.nextLine();
	String name2 = input.nextLine();
	String full3 = name1.charAt(0)+"."+name2.charAt(0)+".";
	full3 = full3.toUpperCase();
	int num8 = full3.length();
	System.out.println(full3+" "+" there are "+num8+" initials and periods");
	
	System.out.println("enter your brothers name");
	String bro1 = input.nextLine();
	String bro2 = input.nextLine();
	int FirstNameIndex = bro1.length()-1;
	int LastNameIndex = bro2.length()-1;
	String lastLetters = ""+bro1.charAt(FirstNameIndex)+"."+bro2.charAt(LastNameIndex)+".";
	lastLetters = lastLetters.toUpperCase();
	System.out.println(bro1+bro2+" are last letters of "+lastLetters);
	String bro3 = bro1.substring(0,1)+"."+bro2.substring(0,1)+".";
	bro3 = bro3.toUpperCase();
	System.out.println("Your brothers initials are "+bro3);
	
	
	String lastLetters2 = bro3;
	System.out.println("Last letters: "+ lastLetters2);
	
	
	
	
	
}
}
