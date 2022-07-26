package day16_Review;

import java.util.Scanner;

public class NextInPrax {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your phone number");
	int pn = input.nextInt();
	System.out.println("You phone number is "+pn);
	
	input.nextLine(); //this will take out the enter
	System.out.println("Enter your name");
	String name = input.nextLine();

	//nextLine() method will take everything in Scanners memory including the "Enter" up to the new line.
	 
	
	
	
	
}
}
