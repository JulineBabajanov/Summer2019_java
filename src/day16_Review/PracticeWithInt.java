package day16_Review;

import java.util.Scanner;

public class PracticeWithInt {
public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	
	System.out.println("What is your name?");
	String name = num.nextLine();
	
	System.out.println("How old are you "+name+"?");
	int age = num.nextInt();
	
	System.out.println("What is your phone number "+name+"?");
	String phone =num.nextLine();
	
	System.out.println("What time is it "+name+"?");
	String time =num.nextLine();
	
	
	
}
}
