package officeHours;

import java.util.Scanner;

public class StringUpper {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the text:");
	
	String name = input.nextLine();
	
	
	System.out.println(name.length());
	System.out.println("Length is: +name");
	
	String sentence = "java is fun and easy to learn!";
	System.out.println(sentence.indexOf("t")); 
	
	System.out.println("Enter your email");
	String email = input.next();
	
	int indexOfat = email.indexOf('@');
	String id = email.substring(0, indexOfat);
	String domain = email.substring(indexOfat+1);
	System.out.println("Your email id is: "+id+" and your email domain is "+domain);
}
}
