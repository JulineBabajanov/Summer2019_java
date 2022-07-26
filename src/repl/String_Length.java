package repl;

import java.util.Scanner;

public class String_Length {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Please enter your name");
	String name = s.nextLine();
	
	System.out.println(name.length());
	
	System.out.println("Enter your last name");
	String lastName=s.nextLine();
	
	
	System.out.println("How old are you "+name+" "+lastName+"?");
    String age = s.nextLine();
    
    System.out.println("Nice to meet you "+name+" "+lastName+"!!!");
	
}
}
