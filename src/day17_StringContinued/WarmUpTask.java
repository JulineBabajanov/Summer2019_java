package day17_StringContinued;

import java.util.Scanner;

public class WarmUpTask {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	/*1. Declare Scanner class object
	 * 2. ask user to enter first and last name.
	 * 3. declare a string variable called full name
	 * 4. concat first and last name and assign it to full name
	 * 5. display in the console total numbers of characters 
	 * 
	 */
	
	
	System.out.println("Enter your first and last name");
    String firstName=input.nextLine();
    String lastName=input.nextLine();
     String fullName= firstName.concat(" "+lastName);
     int num  = fullName.length();
     
    System.out.println("Enter your city and state");
    String city=input.nextLine();
    String state=input.nextLine();
    String fullname2=city+" "+state;
    int num1 = fullname2.length();
    
    System.out.println(fullName+" contains "+num+" characters");
     System.out.println(fullname2+" contains "+num1+" characters");
     
     
     System.out.println("Enter your favorite country and one on your wish list");
     String country = input.nextLine();
     String country1 = input.nextLine();
     String both =country.concat(country1);
     int num3 = both.length();
     input.nextLine();
     int num4 = country.length();
     System.out.println("Your favorite country "+country+" has "+num4+" characters");
     System.out.println(both+" has "+ num3+ " characters");
     
     
     
     
     
     
    
	
}
}
