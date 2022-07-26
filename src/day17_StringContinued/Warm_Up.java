package day17_StringContinued;

import java.util.Scanner;

public class Warm_Up {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter your first and last name");
	String f = input.nextLine().toUpperCase();
	String l = input.nextLine();
	String fullName = f.concat(" "+l);
	int num = fullName.length()-1;
	System.out.println("Your name has "+num+" characters");
	System.out.println(fullName.charAt(12));
	System.out.println(fullName);
	//input.close();
}
}
