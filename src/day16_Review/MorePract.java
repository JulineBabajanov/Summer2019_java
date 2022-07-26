package day16_Review;

import java.util.Scanner;

public class MorePract {
public static void main(String[] args) {
	Scanner passport = new Scanner (System.in);
	
	System.out.println("Are you going on vacation next year?");
	String yes = passport.nextLine();
	
	System.out.println("Where do you plan on going?");
	String location = passport.nextLine();
	
	System.out.println("How much will your vacation cost all together?");
	String cost = passport.nextLine();
	
	System.out.println("Wow that is very expensive to go away for that much money!");
}
}
