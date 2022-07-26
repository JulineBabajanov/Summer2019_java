package day16_Review;

import java.util.Scanner;

public class ShoppingList1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Item1 and its price: ");
	String Item1=scan.nextLine();
	double price1=scan.nextDouble();
	System.out.println("Your item "+Item1+" cost "+price1);
	
	scan.nextLine();
	System.out.println("Enter Item2 and its price");
	String Item2=scan.nextLine();
	double price2=scan.nextDouble();

	System.out.println("Your item "+Item2+" cost "+price2);
	
	scan.nextLine();
	System.out.println("Enter Item3 and its price");
	String Item3 = scan.nextLine();
	double price3=scan.nextDouble();
	
	System.out.println("Your item "+Item3+" cost "+price3);
	
	
	double TotalPrice = price1+price2+price3;
	
	System.out.println("Your total shopping bill for: "+Item1+", "+Item2+", and "+Item3+" is "+TotalPrice);
	
	
	
	
	
	
}
}
