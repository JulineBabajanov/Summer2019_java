package day20_Review;

import java.util.Scanner;

public class StringMethods2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String sentences = "Tomorrow we do not have class";
	System.out.println(sentences.charAt(0));
	System.out.println(sentences.charAt(sentences.length()-1));
	
	String result = ""+sentences.charAt(0)+
			sentences.charAt(sentences.length()-1);
	System.out.println(result);
	
	
	//starts and ends with: returns boolean, checks the starting and ending values
	System.out.println("Pleaes enter your email address");
	String GmailAddress = input.nextLine().toLowerCase();
	
	
	
	if(GmailAddress.endsWith("@gmail.com")) {
		System.out.println("It's a valid gmail address");
	} else {
		System.out.println("Its not a valid email");
	}
	
	System.out.println("Please enter a web addresss");
	String URL = input.nextLine().toLowerCase();
	
	if(URL.startsWith("www.") && URL.endsWith(".com")) {
		System.out.println("it's a valid web address");
	}else {
		System.out.println("it's an invalid web address");
	}
	//contains method  --checks if the given value is contained in the String or not
	
	String salary = "100$";
	boolean result2 = salary.contains("$");  //true
	
	System.out.println(result2);
	
	//concat to combine two strings and only takes strings values
	
	String SchoolName = "Cybertek";
	SchoolName = SchoolName.concat(" School");
	System.out.println(SchoolName);
	
	
	
	
	
	
	
	
	
	//String Gmail= "cybertekSchool@gmail.com";
	//boolean R=	Gmail.endsWith("@gmail.com");
	//System.out.println(R);
	
	
}
}
