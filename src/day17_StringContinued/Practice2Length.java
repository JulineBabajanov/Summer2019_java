package day17_StringContinued;

import java.util.Scanner;

public class Practice2Length {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	
	System.out.println("Please enter 2 animals");
	String animal1=input.nextLine();
	String animal2=input.nextLine();
	String both= animal1.concat(animal2);
	int num1= both.length();
	System.out.println(animal1+" and "+animal2+" have "+num1+" characters");
	
	System.out.println("Please enter 2 flowers");
	String flower1=input.nextLine();
	String flower2=input.nextLine();
	String both1=flower1.concat(flower2);
	int num2= both1.length();
	System.out.println(num2);
	
	System.out.println("Please enter two names");
	String first=input.nextLine();
	String last= input.nextLine();
	String both2= first.concat(last);
	int num3=both2.length();
	System.out.println(num3);
}
}
