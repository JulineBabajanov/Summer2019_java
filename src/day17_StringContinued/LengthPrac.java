package day17_StringContinued;

import java.util.Scanner;

public class LengthPrac {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your daughters names");
	String daughter1=input.nextLine().toUpperCase();
	String daughter2=input.nextLine().toUpperCase();
	String both=daughter1+daughter2;
	int num1=both.length();
	System.out.println(num1+" is how many characters are in "+daughter1+" and "+daughter2);
	
	System.out.println("Enter the boys in the house");
	String boy1=input.nextLine();
	String boy2=input.nextLine();
	String both2= boy1+boy2;
	int num2=both2.length();
	System.out.println("Both boys have "+num2+" characters in their names all together");
	
	System.out.println("Enter two animals");
	String anim1=input.nextLine();
	String anim2=input.nextLine();
	String both3=anim1.concat(anim2);
	int num3= both3.length();
	System.out.println(num3);
	
	
	
	System.out.println("Enter two pieces of candy");
	String candy1=input.nextLine();
	String candy2=input.nextLine();
	String both4=candy1.concat(candy2);
	int num8=both4.length()-4;
	System.out.println("There are this many characters in your favorite pieces of candy "+num8);
	
	
	
	
	
	
	
	
	
	
}
}
