package day16_Review;

import java.util.Scanner;

public class BooleanPractice {
public static void main(String[] args) {
	Scanner yes = new Scanner(System.in);
	System.out.println("Please provide only a TRUE or False answer to the following statements");
	
	System.out.println("Are you a US Citizen?");
	boolean citizen = yes.nextBoolean();
	
	System.out.println("Did you travel outside the United States in the past 30 days?");
	boolean travel = yes.nextBoolean();
	
	System.out.println("Do you plan on traveling again soon?");
	boolean travel2 = yes.nextBoolean();
	
	System.out.println("Thank you for filling out the questionairre! Have a great day!");
}
}
