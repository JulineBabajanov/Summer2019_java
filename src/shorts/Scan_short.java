package shorts;

import java.util.Scanner;

public class Scan_short {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your name");
	String firstName = input.nextLine();
	
	System.out.println("Nice to meet you, "+firstName+"!");
	
	Scanner age = new Scanner(System.in);
	System.out.println("How old are you?");
	
	int age1 = age.nextInt();
	System.out.println(age1+"????!!!!! "+"Wow, that is very old, "+firstName+"!!!!!!!");
	
}
}
