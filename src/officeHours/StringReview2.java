package officeHours;

import java.util.Scanner;

public class StringReview2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//get 2nd char
	
	System.out.println("Write a word: ");
	String word = scan.next();
	
	//I want to get the second char and use CharAt(index) method
	//I need to know the length of the word first
	//banana
	//012345
	
	int lengthOfWord = word.length();
	char secondLastChar = word.charAt(lengthOfWord-3);
	
	System.out.println(secondLastChar);
	
	
	
}
}
