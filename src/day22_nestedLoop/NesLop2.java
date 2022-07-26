package day22_nestedLoop;

import java.util.Scanner;

public class NesLop2 {
public static void main(String[] args) {
	while(true) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter two numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("Multiplication is: "+(a*b));
	System.out.println("Do you want to continue?");
	scan.nextLine();
	String answer = scan.nextLine().toLowerCase();

	while(!(answer.contentEquals("yes")|| answer.contentEquals("no"))) {
		System.out.println("Invalid entry, do you want to continue?");
		answer = scan.nextLine().toLowerCase();
	}
	if(answer.contentEquals("no")) {
		break;
	}
	
	}
	
	
	
	System.out.println("Thank you and have a nice day!");
	
	
}
}
