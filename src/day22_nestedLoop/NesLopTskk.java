package day22_nestedLoop;

import java.util.Scanner;

public class NesLopTskk {
public static void main(String[] args) {
	while(true) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter two numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("Multiplication is: "+(a*b));
	
	System.out.println("Do you want to continue?");
	scan.next();
	String answer = scan.nextLine().toLowerCase();
	
	while(!(answer.equals("yes")) || answer.equals("no")); {
		System.out.println("wrong answer");
		System.out.println("Do you want to continue?");
		
		answer= scan.next().toLowerCase();
	}
	if(answer.equals("no")) {
	System.out.println("Have a nice day!");
	break;
	}
	}
	
}
}
