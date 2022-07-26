package day19_loop;

import java.util.Scanner;

public class WarmUp {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	/*Given: cybertek.batch12@gmail.com
	 * password: Javengers
	 * 
	 * write a program for the login functionality of the mail account.(user input is required)
	 * -username can be entered either in upper or lower case
	 * -password MUST be entered as it is
	 * -if the username does not end with "@gmail.com"
	 *     print "its not a valid email address"
	 *  -if the username end with gmail but user name or password did not match: 
	 *       print "Invalid user name or password"
	 *  -if the username and passwords are correct: print "logged in successfully"
	 * 
	 */
	
	System.out.println("Enter your email");
	String user = input.nextLine().toLowerCase();
	System.out.println(user);
	System.out.println("Enter your password");
	String pass = input.nextLine();
	
	String username = "cybertek.BaTCh12@gmail.com";
    String password = "Javengers";

    if(user.endsWith("@gmail.com")) 
    	
    	if(user.equalsIgnoreCase(username)&& pass.equals(password))
    		System.out.println("Logged in successfully");
    else 
      if (!user.equalsIgnoreCase(username)&& !pass.equals(password))
    	System.out.println("Invalid username and password");
      else if(!user.equalsIgnoreCase(username))
    	System.out.println("Invalid username");
    else
    	System.out.println("Invalid password");
    	
    	else 
    	System.out.println("it's not a valid email address");
    	
	
    
    

    
    
    		
    
    
}
}