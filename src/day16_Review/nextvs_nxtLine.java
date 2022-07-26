package day16_Review;

import java.util.Scanner;

public class nextvs_nxtLine {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your first name");
	
	String f = scan.nextLine();
	System.out.println("Enter your last name");
	String l = scan.nextLine();
	
	System.out.println("Your name is "+f+" "+l);
	
	
}
}
