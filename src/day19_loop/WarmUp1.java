package day19_loop;

import java.util.Scanner;

public class WarmUp1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your user name");
	String user = input.nextLine().toLowerCase();
    System.out.println("Please enter your password");
    String pass = input.nextLine();
    
    String username = "cybertek.batch12@gmail.com";
    String password = "Javengers";
   
    if(username.endsWith("@gmail.com")) {
    	if(user.equalsIgnoreCase(username) && pass.equals(password)) {
    		System.out.println("Logged in successfuly");
    	}else {
    		if(!user.equalsIgnoreCase(username) && !pass.equals(password)) {
    			System.out.println("both user name and passwords are incorrect");
    			
    			}else if(user.equalsIgnoreCase(username)) {
    				System.out.println("invalid password");
    			}else {
    				System.out.println("Invalid username");
    			}
    	}
    	
    }else {
    	System.out.println("its not a valid email address");
    }
}
}
