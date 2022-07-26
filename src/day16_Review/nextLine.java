package day16_Review;

import java.util.Scanner;

public class nextLine {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//System.out.println("Enter your phone number and name");
	//int phonenum = scan.nextInt();
	
                  //scan.nextLine();
	//String name = scan.nextLine();
	//nextLine will take everything in scanner's memory up to the new line
	//including "Enter"
	//String num = scan.nextLine(); nextLine method accepts the "enter" from the keyboard
	
	System.out.println("Enter your phone number");
    int phoneNumber = scan.nextInt();
	System.out.println("You phone number is: "+phoneNumber);
	
	System.out.println("Enter your name");
	String name = scan.nextLine();
	
}
}
