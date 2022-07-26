package day19_loop;

import java.util.Scanner;

public class Warm {
public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
	
  	System.out.println("Enter your user name");
    String user = scan.nextLine().toLowerCase();
    System.out.println("Enter your password");
    String pass = scan.nextLine();

    String username = "cybertek.Batch12@gmail.com";
    String password = "Javengers";
    
    if(user.endsWith("@gmail.com")) {
    	if(user.equalsIgnoreCase(username) && pass.equals(password)) {
    		System.out.println("Logged in successfully");
    	}else {
    		if(!user.equalsIgnoreCase(username) && !pass.equals(password)) {
    			System.out.println("both username and password are incorrect");
    		}else if(!user.equalsIgnoreCase(username)) {
    			System.out.println("invalid username");
    		}else {
    			System.out.println("invalid password");
    		}
    	}
    }else {
    	System.out.println("it's not a valid email address");
    }







}
}