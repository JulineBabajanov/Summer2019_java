package day16_Review;

import java.util.Scanner;

public class doublePractice {
public static void main(String[] args) {
	Scanner price = new Scanner (System.in);
	
	System.out.println("Please enter the tomatos price");
	double tom = price.nextDouble();
	
	System.out.println("Please enter the pineapples price");
	double pine =price.nextDouble();
	System.out.println("Wow that is a very expensive pineapple for "+pine);
	
	System.out.println("Please enter the candys dollar amount");
	
	double candy = price.nextDouble();

	System.out.println("That is really expensive candy for the price of $"+ candy);
}
}
