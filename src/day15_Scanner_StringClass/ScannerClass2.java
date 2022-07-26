package day15_Scanner_StringClass;

import java.util.Scanner;

public class ScannerClass2 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter a byte value");
	byte num = input.nextByte(); // returns user input as a byte value
	
	System.out.println("Enter a short value");
	short num2 = input.nextShort();
	
	System.out.println("Enter an int value");
	int num3 = input.nextInt();
	
	System.out.println("Enter a long value");
	long num4 = input.nextLong();
	
	System.out.println("Enter a boolean");
	boolean result = input.nextBoolean();
	
	System.out.println("Enter a float value");
	float num5 = input.nextFloat();
	
	System.out.println("Enter a double value");
	double num6 = input.nextDouble();
	

	
}
}
