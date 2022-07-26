package day16_Review;

import java.util.Scanner;

public class next_vs_nextLine2 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
System.out.println("Enter your first name");
String first = scan.next();

scan.nextLine();

System.out.println("Enter your last name");
String last = scan.next();

System.out.println("Your first name is "+first+" your last name is "+last);
	
	
}
}
