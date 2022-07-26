package day22_nestedLoop;

import java.util.Scanner;

public class CalculatorProgram {
public static void main(String[] args) {
	
	
	/*calculator program:
	 * write a program that asks user user if he/she wants to: *,/,%,-,+
	 * then ask user to enter two numbers
	 * then return the result to the console
	 * and then ask the user if they want to continue to do another math problem
	 * if yes then repeat previous steps
	 * if no exit the system
	 * other wise ask the user to re enter
	 */
	while(true) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Do you want to do multiplication subtraction addition or division or remainder?");
	String str = scan.next();
	
	if(str.equals("multiplication")) {
		while(true) {
			System.out.println("Enter two numbers");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Multiplication is: "+(a*b));
			System.out.println("Do you wish to continue?");
			String answer=scan.next().toLowerCase();
			while(!(answer.equals("yes")||answer.equals("no"))) {
				System.out.println("Invalid entry please enter yes or no");
				answer=scan.next();
			}if(str.equals("subtraction")) {
				while(true) {
					System.out.println("Enter two numbers");
					int c = scan.nextInt();
					int d = scan.nextInt();
					System.out.println("Subtraction is: "+(a-b));
					System.out.println("Do you wish to continue?");
					String answer1=scan.next().toLowerCase();
					while(!(answer1.equals("yes")||answer1.equals("no"))) {
						System.out.println("Invalid entry please enter yes or no");
						answer1=scan.next();
			if(answer1.equals("no")) {
				System.out.println("Have a nice day!!!!");
				break;
			}
		}
	}
}
}
	}}}}
