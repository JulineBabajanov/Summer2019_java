package day14_Scanner;

import java.util.Scanner;

//everything in scanner class is imported.

public class ScannerClass {
	public static void main(String[] args) {
		
	
	
	/*Scanner:it's a class that provides the methods to get user inputs
	 * Scanner class presented in package "java.util" package.
	 * 
	 * in order to use scanner class,the scanner class must be imported.
	 *     import java.util.Scanner;
	 *     
	 *     the import statement MUST be placed between package and class name.
	 *     
	 *     Declaration of scanner: Scanner VariableName = new Scanner(System.in);
	 *     VariableName: can reference an object of the scanner class
	 *     new Scanner(System.in): creates the object of the scanner class
	 */
	Scanner input= new Scanner(System.in);
	System.out.println("Enter a Byte Value 1");
	  byte byteNum = input.nextByte();
	  System.out.println("You have entered: "+ byteNum);
	  System.out.println("Enter a Byte Value 2");
	             byte byteNum2 = input.nextByte();
	             
	             System.out.println("You have entered: "+byteNum2);
	              System.out.println("Addition is: "+(byteNum + byteNum2) );
	
	              
	              
	  
	}
	
	

}
