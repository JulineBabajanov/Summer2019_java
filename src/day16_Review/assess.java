package day16_Review;

import java.util.Scanner;

public class assess {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter your name");
	String name = input.nextLine();
	System.out.println("Welcome "+name+"!");
	System.out.println("How old are you?");
	int age = input.nextInt();
	System.out.println("Wow! You do not look "+age+" at all!");
	System.out.println("What city and state are you from?");
	String city = input.nextLine();
	String state = input.nextLine();
	System.out.println(city+" "+state+" are nice!");
	System.out.println("Enter your zipcode");
	int zip = input.nextInt();
	input.nextLine();
	System.out.println("Enter your phone number");
	String phone = input.nextLine();
	System.out.println("Thank you for entering "+phone);
}
}
