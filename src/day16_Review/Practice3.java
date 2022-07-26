package day16_Review;

import java.util.Scanner;

public class Practice3 {
public static void main(String[] args) {
	Scanner good = new Scanner (System.in);
	
	System.out.println("Where do you want to go on Vacation too?");
	String vacay = good.nextLine();
	System.out.println("I have heard a lot of nice things about that location!");
	
	System.out.println("When were you looking to go?");
	String date = good.nextLine();
	
	System.out.println("OH, wow! That is very soon!");
	
	System.out.println("What will the weather be like in that month in "+vacay+"?");
	String weather = good.nextLine();
	
	System.out.println("Wow you are very lucky to get away from this very cold Pittsburgh Weather!!! Can you pack me in your suit case?");
}
}
