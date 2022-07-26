package day17_StringContinued;

import java.util.Scanner;

public class WarmUP {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Please enter your first and last name");
	String first = input.nextLine().toUpperCase();
	String last = input.nextLine().toUpperCase();
	String fullName = first.concat(" "+last);
	  int num = fullName.length()-1;
	System.out.println("Your full name, "+fullName+ " has "+num+" characters");
	System.out.println(fullName.charAt(num));
	
input.close();
}
}
