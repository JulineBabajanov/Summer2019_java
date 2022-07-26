package day18_StringMethodsCont;

import java.util.Scanner;

public class PracInitAndFullName {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Please enter your first name");
	String name = input.nextLine();
	name = name.substring(0,1).toUpperCase();
	
	System.out.println("Enter your last name");
	String name1 = input.nextLine();
	name1 = name1.substring(0,1).toUpperCase();
	
	String initials = name +"."+name1+".";
	System.out.println(initials +" are the initials");
	
	System.out.println("Please enter your first name");
	String first = input.nextLine();
	first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
	System.out.println("Enter your last name");
	String last = input.nextLine();
	last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
	
	String both1 = first+" "+last;
	System.out.println(both1);
	
	System.out.println("Please enter your daughters first name");
	String daught = input.nextLine();
	System.out.println("enter last");
	String daught1 = input.nextLine();
	daught = daught.substring(0,1).toUpperCase()+daught.substring(1).toLowerCase();
	daught1 = daught1.substring(0,1).toUpperCase()+daught1.substring(1).toLowerCase();
	System.out.println(daught+" "+daught1);
}
}
