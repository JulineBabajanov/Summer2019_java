package day14_Scanner;

import java.util.Scanner;

public class prompt {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	
	System.out.println("Enter your name");
	String firstName = scan.nextLine();
	
	System.out.println("Enter your age");
	byte num = scan.nextByte();
	
	System.out.println("Your first name is "+firstName+" and you are "+num+" years old");
	
	System.out.println("Enter a byte number");
	byte num1 = scan.nextByte();
	System.out.println("Enter a second byte number");
	byte num2 = scan.nextByte();
	System.out.println(num1 +" plus "+num2+" equals "+(num1+num2));
	
	
	System.out.println("Enter three numbers");
	byte num3 = scan.nextByte();
	byte num4 = scan.nextByte();
	byte num5 = scan.nextByte();
	
	if(num3>num4 && num3 > num5) {
		System.out.println(num3+" is the biggest number");
	}else if(num4 >num3 && num4 >num5) {
		System.out.println(num4+" is the greatest number");
	}else {
		System.out.println(num5+" is the biggest number");
	}
	scan.nextLine();
	System.out.println("Enter your first name");
	String name = scan.nextLine();
	System.out.println("Enter your last name");
	String name2 = scan.nextLine();
	System.out.println("Your full name is: "+name+" "+name2);
	
}
}
