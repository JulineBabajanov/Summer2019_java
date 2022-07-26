package day21_WhileLoops;

import java.util.Scanner;

public class practice {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	do {
	System.out.println("Enter first number");
	int a = scan.nextInt();
	
	System.out.println("Enter your second number");
	int b = scan.nextInt();
	
	System.out.println("addition is: "+(a+b));
	
	System.out.println("Do you want to continue? yes or no");
	String answer = scan.next();
	 if(answer.equalsIgnoreCase("no")) {
		 System.out.println("Thank you for playing!");
		 break;
	 }else {
		 System.out.println("Completed");
	 }
	}while (true);
	
}
}
