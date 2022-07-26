package day19_loop;

import java.util.Scanner;

public class Warm_Up {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter username");
	String user = input.nextLine().toLowerCase();
	System.out.println("Enter your password");
	String pass = input.nextLine();
	String username = "cybertek.batch12@gmail.com";
	String password = "Javengers";
	
	if(user.endsWith("@gmail.com")) {
		if(user.equalsIgnoreCase(username) && password.equals(password) ) {
			System.out.println("Logged in Successfully");
		}else {
			if(!user.equalsIgnoreCase(username)&& !pass.equals(password))
			System.out.println("Invalid user name or password");
		}else if(user.equalsIgnoreCase(username)) {
			System.out.println("Invalid password");
		}else {
			System.out.println("Invalid password");
		}
	}else {
		System.out.println("it's not a valid email address");
	}	
}
}
