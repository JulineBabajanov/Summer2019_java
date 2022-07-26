package day22_nestedLoop;

import java.util.Scanner;

public class warmmy {
public static void main(String[] args) {
	
	/* When you have a value that is palindrome .... same spelling front and backwards such as level, aziza, dad, mom
	 * 
	 */
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter something!");
	String original = scan.nextLine();
	String original = "Aziza".trim();
	String Reverse ="";
	
	for(int p = original.length()-1; p >= 0; p-- ) {
		Reverse+= original.subSequence(p,  p+1);
		
	}
	boolean result = original.equalsIgnoreCase(Reverse) ? true: false;
	System.out.println(Reverse+", "+result);
	
	
	
	
	
	
	
	
	
	
}
}
