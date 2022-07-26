package day15_Scanner_StringClass;

import java.util.Scanner;

//imports scanner class only from java.util

//import java.util.*; //imports all the classes from Java.util

public class ScannerClass {
	
	public static void main(String[] args) {
		
		/*scanner class is used for reading users input.
		 * Package name= java.util
		 * class name = Scanner
		 * the import statement must be placed between class and package
		 * 
		 * wild import: import java.util.* <=== imports all the classes within "java.util" package
		 * 
		 * Declaration of Scanner class:
		 * Scanner variableName= new Scanner (System.in)
		 */
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a byte value");
	    byte num=input.nextByte();//returns the user input as byte value
	
		
	//	variableName.nextShort("enter a short value"):  returns the user in put as short value
		System.out.println("Enter a short value");
		short num2=input.nextShort();
		
		System.out.println("Enter an int value");
		int num3=input.nextInt();
		
		System.out.println("Enter a long value");
		long num4=input.nextLong();
		
		System.out.println("Enter a boolean value");
		boolean result=input.nextBoolean();
		
		System.out.println("Enter a float value");
		float num5=input.nextFloat();
		
		System.out.println("Enter a double");
		double num6=input.nextDouble();
		
		System.out.println("Enter your name");
		 String str=input.nextLine();
		
		
		input.close();
		
		
		
		
		
		
		
		
		
	}

}
