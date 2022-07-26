package day14_Scanner;
import java.util.Scanner;
public class pracScan {
public static void main (String[]args) {
	
	
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your first name");
	String firstName = input.nextLine();
	
	System.out.println("Enter your middle name");
	String middle = input.nextLine();
	
	System.out.print("Enter your last name");
	String lastName = input.nextLine();
	System.out.println("Your full name is: "+firstName+" "+middle+" "+lastName);
	
}
}
