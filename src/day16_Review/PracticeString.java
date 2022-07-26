package day16_Review;

import java.util.Scanner;

public class PracticeString {
public static void main(String[] args) {
	Scanner hello = new Scanner(System.in);
	System.out.println("Enter your phone number please!");
	String num = hello.nextLine();
	
	System.out.println("Enter your first name please!");
	String name = hello.nextLine();
	
	System.out.println("Your cell number is "+num);
	
	System.out.println("How old are you?");
	int age = hello.nextInt();
	
	System.out.println("You are "+age+" and have your own cell phone?!?!?! That is really bad "+name+"!!!!");
}
}
