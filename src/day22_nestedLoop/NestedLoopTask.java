package day22_nestedLoop;

import java.util.Scanner;

public class NestedLoopTask {
public static void main(String[] args) {
	while(true) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter two numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("Addition is "+(a+b));
	System.out.println("Do you want to continue?");
	String answer = scan.next();
	while(!(answer.equals("yes")||answer.equals("no"))) {
		System.out.println("Invalid Entry. Please re-enter");
		System.out.println("Do you want to continue?");
		answer = scan.next();
	}	
	 if(answer.equals("no")) {
		System.out.println("Have a nice day!");
		break;
	}
	}
	
	
	
}
}
