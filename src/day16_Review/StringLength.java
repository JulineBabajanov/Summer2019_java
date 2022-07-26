package day16_Review;

import java.util.Scanner;

public class StringLength {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Welcome to your moms questionairre! Tell the truth!");
	
	System.out.println("What is your name?");
	String name = input.nextLine().toUpperCase();
	
	System.out.println();
	
	System.out.println("So nice to meet you, "+name+"!!!!!!");
	System.out.println();
	
	System.out.println("Tell me "+name+" how old are you?!?!");
	String age = input.nextLine();
	System.out.println();
	
	System.out.println("Wow! You are getting so big, "+name+"!!");
	
	System.out.println();
	
	System.out.println("What is your favorite food "+name+"?");
	String food =input.next();

	System.out.println("Yum! I love "+food+"!");	
	System.out.println();
	
	System.out.println("Who is your favorite Author?");
	
	String author = input.nextLine();
	System.out.println("Your favorite author is: "+author);
	
	System.out.println();
	
	System.out.println("What is your favorite book?");
	String book = input.nextLine();
	System.out.println("Your favorite book is: "+book);
	
	System.out.println();
	
	System.out.println("What is your favorite television show?");
	String show = input.nextLine();
	System.out.println("Your faovirte television show is: "+show);
	
	System.out.println();
	
	System.out.println("What is your hobby?");
	String hobby = input.nextLine();
	System.out.println("Your favorite hobby is: "+hobby);
	System.out.println();
	
	
	
	
	
	
	
	
}
}
