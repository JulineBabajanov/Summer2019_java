package day17_StringContinued;

import java.util.Scanner;

public class warm_1 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter your first name and last name");
	String first = input.nextLine().toUpperCase();
	String last = input.nextLine().toUpperCase();
	
	String fullName = last.concat(", "+first);
	System.out.println(fullName);
	int Number = fullName.length();
	System.out.println(fullName+" contains the amount of "+Number+" characters");
	
	String fullname2 = first+" "+last;
	int lastIndex = fullname2.length()-1;
	System.out.println(fullname2.charAt(lastIndex));

}
}
