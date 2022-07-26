package day18_StringMethodsCont;

import java.util.Scanner;

public class PracticeInitials {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your first and last name so I can return you your initials!");
	String firstName = input.nextLine();
	String lastName = input.nextLine();
	String initials = firstName.substring(0,1).concat(".")+lastName.substring(0,1).concat(".");
	initials = initials.toUpperCase();
	System.out.println("Hi "+firstName+" "+lastName+"!!! Your initials are "+initials);
	
	System.out.println("Please enter your moms first and last name");
	String firstMom = input.nextLine();
	String lastMom = input.nextLine();
	String initMom = firstMom.substring(0,1).concat(".")+lastMom.substring(0,1).concat(".");
	initMom=initMom.toUpperCase();
	System.out.println("Hello "+firstMom+" "+lastMom+" your initials are "+initMom+"!!!! Have a nice day!");
	initMom=input.nextLine();
	System.out.println("Hello please enter your fathers first and last name!");
	String name1 = input.nextLine();
	String name2 = input.nextLine();
	String dad = name1.charAt(0)+"."+name2.charAt(0)+".";
	dad = dad.toUpperCase();
	System.out.println("Your dads initials are "+dad);
	
	System.out.println("Please enter the babys name and we will return her initials");
	String baby1 = input.nextLine();
	String baby2 = input.nextLine();
	String baby = baby1.substring(0,1)+"."+baby2.substring(0,1)+".";
	baby = baby.toUpperCase();
	System.out.println(baby+" are the initials of the babys name");
	
	System.out.println("Please enter your brothers first and last name!");
	String brother1 = input.nextLine();
	String brother2 = input.nextLine();
	String broBoth = brother1.charAt(0)+"."+brother2.charAt(0)+".";
	broBoth = broBoth.toUpperCase();
	System.out.println("Your brothers initials are "+broBoth);
	
	System.out.println("Please enter your friends first and last name");
	String friend1 = input.nextLine();
	String friend2 = input.nextLine();
	String friend3 = friend1.substring(0, 1)+"."+friend2.substring(0, 1)+".";
	friend3 = friend3.toUpperCase();
	
	System.out.println("Your friends name "+friend1+" "+friend2+" has the initials of "+friend3);
}
}
