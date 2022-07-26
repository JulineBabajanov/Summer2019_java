package day15_Scanner_StringClass;

import java.util.Scanner;

public class String_Input {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter your first name");
	String firstName = scan.nextLine();
	System.out.println(firstName);
	
	System.out.println("Enter your last name");
	String lastName = scan.nextLine();
	System.out.println("Your full name is: "+firstName+" "+lastName);
	
	System.out.println("Please enter the first number");
	int num1 = scan.nextInt();
	System.out.println("Enter the second number");
	int num2 = scan.nextInt();
	int result = num1 + num2;
	System.out.println("Your first number "+num1+" plus your second number "+num2+" equals "+result);
	
     
	
	
	
	
}
}
