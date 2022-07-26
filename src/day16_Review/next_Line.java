package day16_Review;

import java.util.Scanner;

public class next_Line {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
   System.out.println("enter your phone number");
	
	int num = scan.nextInt();
	System.out.println("Enter your house number");
	int house = scan.nextInt();
	
	int home = scan.nextInt();
	scan.nextLine();
	String street = scan.nextLine();
	
	
}
}
