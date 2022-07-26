package day14_Scanner;

import java.util.Scanner;

public class ScannerClass2 {
public static void main (String[]args) {
	
	/* it's a class that provieds the methods to get users input
	 * 
	 * the import statement must be placed between package and classname
	 * 
	 * Scanner VariableName = new Scanner (System.in);
	 */
	
	
	Scanner input = new Scanner (System.in);
	System.out.println("Enter a Byte value");
	byte byteNum = input.nextByte();
	
	System.out.println("You have entered: "+byteNum);
	System.out.println("Enter a byte number 2");
	byte byteNum2 = input.nextByte();
	System.out.println("you have entered a total of: "+(byteNum+byteNum2));
}
}
