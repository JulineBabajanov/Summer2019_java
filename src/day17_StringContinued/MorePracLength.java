package day17_StringContinued;

import java.util.Scanner;

public class MorePracLength {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter your first and last name");
	String first=input.nextLine();
	String last=input.nextLine();
	String both=first.concat(last);
	int num1=both.length();
	System.out.println(first+" and "+last+" have "+num1+ " characters");
	
	System.out.println("Name 2 animals");
	String animal1=input.nextLine();
	String animal2=input.nextLine();
	String both1=animal1.concat(animal2);
	int num2=both1.length();
	System.out.println(num2);
	
	System.out.println("Please enter 2 foods");
     String food1=input.nextLine();
     String food2=input.nextLine();
     String both2=food1.concat(food2);
     int num3=both2.length();
     System.out.println(num3);
     
     System.out.println("Enter your daughters names");
     String daughter1=input.nextLine();
     String daughter2=input.nextLine();
     String bothDaughters= daughter1+daughter2;
     int num4= bothDaughters.length();
     System.out.println(num4);
}
}
