package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task_02 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter a number");
	double n1 = input.nextDouble();
	
	System.out.println("Enter number 2");
	double n2 = input.nextDouble();
	
	System.out.println("Enter number 3");
	double n3 = input.nextDouble();
	
	double Largest = (n1>n2 && n1 > n3)? n1 : 
		             (n2 > n1 && n2 > n3) ? n2 : 
		             n3;
	
	System.out.println("Largest number is: "+Largest);
	
}
}
