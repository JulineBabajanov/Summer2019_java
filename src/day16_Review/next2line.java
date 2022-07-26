package day16_Review;

import java.util.Scanner;

public class next2line {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Please enter your zip code");
	int zipcode = input.nextInt();
	
	input.nextLine();
	
	System.out.println("Please enter your city name");
	String cityname = input.nextLine();

	
	//System.out.println("zip code is: "+zipcode);
	//System.out.println("city and state name are: "+cityname);

	
	System.out.println("Enter your phone number");
	int pn = input.nextInt();
	
	input.nextLine();
	
	System.out.println("Enter your state name");
	String state = input.nextLine();
	
	
	System.out.println("Your city is: "+cityname);
	System.out.println("Your zipcode is: "+zipcode);
	
	System.out.println("Your phont number is: "+pn);
	System.out.println("Your state is: "+state);

	
}
}
