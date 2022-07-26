package day17_StringContinued;

import java.util.Scanner;

public class PracticeLength {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter your first and last name");

	String first=scan.nextLine();
	String last=scan.nextLine();
	
	String both=first.concat(last);
	int num=both.length();
	System.out.println(num);
	
	System.out.println("Please enter your city and state");
	String city=scan.nextLine();
	String state=scan.nextLine();
	String both2=city.concat(state);
	int num1=both2.length();
	System.out.println(num1);
	
	System.out.println("Please enter two foods");
	String food1=scan.nextLine();
	String food2=scan.nextLine();
	String both3=food1.concat(food2);
	int num2= both3.length();
	System.out.println(num2+" is how many characters there are total");
	
	System.out.println("Please enter 2 flowers");
	String flower1=scan.nextLine();
	String flower2=scan.nextLine();
	String twoFlowers=flower1.concat(flower2);
	int num4= twoFlowers.length();
	System.out.println(num4);
	
	System.out.println("Please enter two animals");
	String animal1=scan.nextLine();
	String animal2=scan.nextLine();
	String bothanimals=animal1.concat(animal2);
	int num5=bothanimals.length();
	System.out.println(num5+" has that many characters");
	
	
	
	
}
}
