package day16_Review;

import java.util.Scanner;

public class nextLine3 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your phone number");
	int num = scan.nextInt();
	System.out.println(num);
	System.out.println("Enter first name");
	String word = scan.next();
	System.out.println(word);
	scan.nextLine();
	System.out.println("Enter a sentence");
	String word1 = scan.nextLine();
	System.out.println(word1+" "+"is wrong");
}
}
