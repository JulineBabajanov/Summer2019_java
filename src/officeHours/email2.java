package officeHours;

import java.util.Scanner;

public class email2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter your email");
	
	String email = scan.next();
	
	int indexOfAT = email.indexOf('@');
	String id = email.substring(0, indexOfAT );
	String domain = email.substring(indexOfAT+1);
	System.out.println(id +" is your id "+ domain+" is your domain");
}
}
