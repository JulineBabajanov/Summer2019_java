package day22_nestedLoop;

import java.util.Scanner;

public class NestedLoopTask3 {
public static void main(String[] args) {
	while(true) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Please enter two numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("Multiplication is "+(a*b));
	System.out.println("Do you wish to continue?");
	String answer = scan.next();
	
	while(!(answer.equals("no")||(answer.equals("yes")))) {
		System.out.println("Invalid entry");
		System.out.println("Do you wish to continue?");
		answer=scan.next();
	}
	if(answer.equals("no")) {
		System.out.println("Have a nice day");
		break;
	}
	
	}	
}
}
