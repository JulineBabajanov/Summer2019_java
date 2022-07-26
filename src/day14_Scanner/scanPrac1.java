package day14_Scanner;

import java.util.Scanner;

//import java.util.Scanner;

public class scanPrac1 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	/* int n1 = 1100, n2 = 8000, n3 = 40000;
	
	int max = (n1 > n2 && n1 > n3) ? n1
			: (n2 > n1 && n2 > n3) ? n2
			: n3;
	
	System.out.println(max); */
	
	
	// Scanner class: it is a class that provides the methods to get user inputs. It is presented in a package "java.util" package and must be imported.
	// import java.util.Scanner; must be placed between package and class

	
	System.out.println("Enter a byte value");
	
	byte byteNum = input.nextByte();
	
	System.out.println("You have entered: "+byteNum);
	System.out.println("Enter another byte number");
	byte byteNum2 = input.nextByte();
	System.out.println("You have entered: "+byteNum2);
	
	System.out.println("Addition of byte1 and byte2 is: "+(byteNum+byteNum2));
	
	
}
}
