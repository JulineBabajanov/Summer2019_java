package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task01 {
public static void main(String[] args) {
	
	Scanner input= new Scanner (System.in);
			/*write a program that calculates the sum of two numbers entered by the user.
			 * 
			 * 
			 */
	
	System.out.println("Enter the first number");
	int num1 = input.nextInt();
	
	System.out.println("Enter your second number");
	int num2 = input.nextInt();
	
	System.out.println("The sum of your first and second number are "+ (num1+num2));
	
	
	
	
	
}
}
