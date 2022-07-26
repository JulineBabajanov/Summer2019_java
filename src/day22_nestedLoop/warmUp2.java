package day22_nestedLoop;

import java.util.Scanner;

public class warmUp2 {
public static void main(String[] args) {
	
	/*
	 * write a program that can check if the String is palindrome.
	 * if its print "true", otherwise print "false"
	 * DO NOT USE FOR LOOP
	 * ex: input: level
	 * output: true, (because reversed value is still "level"
	 * 
	 */
	
	//abba ==> reversed is abba is considered palindrome
	/*original value is same as reversed is palindrome
	 * level == level    aziza==aziza  
	 * 
	 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a name");
	
	String original = scan.nextLine();
	String Reverse ="";  //level
	/*
	for(int i =original.length()-1;i>=0;i--) {
		//Reverse+=original.substring(i, i+1);
		Reverse+=original.charAt(i);
	}
	*/
	int i = original.length()-1;
	while(i>=0) {
		Reverse+=original.substring(i, i+1);
		Reverse+=original.charAt(i);
		i--;
	}
	//boolean result = original.equals(Reverse) ? true : false;
//	System.out.println(result);
	System.out.println(Reverse);
	
	//for(int i = 0; i<original.length();i++) {
	//	Reverse+=original.substring(i,i+1);
	//}
//	System.out.println(Reverse);
	
}
}
