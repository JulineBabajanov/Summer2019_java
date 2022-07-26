package day22_nestedLoop;

import java.util.Scanner;

public class NestedLoopDivision {
public static void main(String[] args) {
	while(true) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter 2 numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("Division problem is "+(a/b));
	System.out.println("Do you wish to continue?");
	String answer = scan.next().toLowerCase();
	while(!(answer.equals("yes")||(answer.equals("no")))) {
		System.out.println("Invalid entry");
		System.out.println("Do you wish to continue?");
		answer=scan.next();
	}
	if(answer.equals("no")) {
		System.out.println("Have a nice day!!!!!");
		break;
	}
}
}
}