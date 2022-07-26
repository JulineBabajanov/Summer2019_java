package day15_Scanner_StringClass;

import java.util.Scanner;

public class Scanner_Class {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	System.out.println("Enter byte number");
	    byte num = input.nextByte();
	System.out.println(num*5);
	System.out.println("Enter short value");
	short num1 = input.nextShort();
	System.out.println(num1+5);
	
	System.out.println("Enter an int number");
	int num2 = input.nextInt();	
	System.out.println(num2);
	
	System.out.println("Enter long value");
	long num3 = input.nextLong();
	System.out.println("Thank you for entering a long number "+num3);
	
	System.out.println("Enter a boolean value");
	boolean result = input.nextBoolean();
	System.out.println(result);
	
	System.out.println("Enter a float number");
	float num4 = input.nextFloat();
	System.out.println(num4);
	
	System.out.println("Enter a double number");
	double num5 = input.nextDouble();
	System.out.println(num5);
	

	
	
}
}
