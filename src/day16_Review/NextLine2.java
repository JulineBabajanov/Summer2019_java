package day16_Review;

import java.util.Scanner;

public class NextLine2 {
public static void main(String[] args) {
	/*write a program that accepts zipcode, city, 
	 * state, phone number, and then displayed
	 * all those gathered information.
	 * Do not use next() method
	 */
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your zipcode");
	int zipcode = input.nextInt();
	
	input.nextLine();
	System.out.println("Please enter your city name");
	String cityname = input.nextLine();
	
	
	System.out.println("Your zipcode is: "+zipcode);
	System.out.println("Your city name is: "+cityname);
	
	System.out.println("Enter your phone number");
	int pn = input.nextInt();
	System.out.println("Your phone number is: "+pn);
	
	//input.nextLine(); //takes the "Enter" away
	System.out.println("Enter your state");
	String state =input.next();
	System.out.println("Your state is: "+state);
	
	
	
	
	
	
	
}
}
