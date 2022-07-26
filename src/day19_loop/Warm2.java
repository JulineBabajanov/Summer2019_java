package day19_loop;

import java.util.Scanner;

public class Warm2 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter a usename");
	String user = scan.nextLine().toLowerCase();
	System.out.println("Enter your password");
	String pass = scan.nextLine();
	String username = "cybertek.batch12@gmail.com";
	String password = "Javengers";
	
	if(user.endsWith("@gmail.com")) {
		if(user.equalsIgnoreCase(username)&& pass.equals(password)) {
			System.out.println("Logged in successfully");
		}else {
			if(!user.equalsIgnoreCase(username)&& !pass.equals(password)) {
				System.out.println("Both user name and passwords are incorrect");
			}else if(!user.equalsIgnoreCase(username)){
				System.out.println("invalid username");
			}else {
				System.out.println("invalid password");
			}
			}
		
	}else {
		System.out.println("It is not a valid email address");
	}
	
}
}
