package day16_Review;

import java.util.Scanner;

public class nextLine_2 {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter your zipcode");
	int zip = input.nextInt();
	input.nextLine();
	System.out.println("Enter your city");
	String city = input.nextLine();
	
	System.out.println("Enter your phone number");
	int phone = input.nextInt();
	
	input.nextLine();
	
	System.out.println("Enter your state");
	String state = input.nextLine();
	System.out.println("state is "+state);
	System.out.println("Your phone number is "+phone);
	System.out.println("Your zipcode is: "+zip);
	System.out.println("Your city is: "+city);
	
}
}
