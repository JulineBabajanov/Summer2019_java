package day21_WhileLoops;

import java.util.Scanner;

public class prac1 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	do {
	System.out.println("Enter a number");
	int a = scan.nextInt();
	
	System.out.println("Enter a second number");
	int b = scan.nextInt();
	
	System.out.println("addition is: "+(a+b));
	System.out.println("Do you want to continue");
	String answer = scan.next();
	if(answer.equalsIgnoreCase("no")) {
		System.out.println("Have a nice day");
		break;
	}else if (answer.equalsIgnoreCase("yes")){
		
	}else {
		System.out.println("Wrong answer");
		break;
	}
	}while(true);
	

	
	
}
}
