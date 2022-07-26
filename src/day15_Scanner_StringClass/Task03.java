package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		/*write a program that asks user to enter first name and then last name. 
		 * At the end system should display your full name.
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name");
        String n1 = input.nextLine();
        
        System.out.println("Enter your last name");
		String n2 = input.nextLine();
		
		String fullName = n1+" "+n2;
		System.out.println("Your full name is: "+fullName);
		
		input.close();
		
	}

}
