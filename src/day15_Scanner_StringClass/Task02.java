package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task02 {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	/*/*Write a program that asks user to enter three numbers and returns the largest number.
	 * Do it with ternary
	 * 
	 */
	System.out.println("Please enter your first number");
	double n1 = input.nextDouble();
	
	System.out.println("Enter your second number");
	double n2 = input.nextDouble();
	
	System.out.println("Please enter your third number");
	double n3 = input.nextDouble();
	
	double Largest = (n1 > n2 && n1 > n3) ? n1 
			        :(n2 > n1 && n2 > n3) ? n2
			        :n3;
	System.out.println("The largest number is: "+ Largest);
	
	
	
	
	
}
}
