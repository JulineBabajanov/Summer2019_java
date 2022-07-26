package day20_Review;

import java.util.Scanner;

public class replit {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to Cybertek Apartments!");
    System.out.println("Number of bedrooms you are interested:");
    int numberOfBedrooms = scan.nextInt();
    int startingPrice=0;
    //WRITE YOUR CODE HERE
    
    if(startingPrice>1100){
      System.out.println("One Bedroom Selected");
    }
    else if(startingPrice>1850){
      System.out.println("Two Bedroom Selected");
    }
    else if(startingPrice>2550){
      System.out.println("Three Bedroom Selected");
    }
    else
    System.out.println("No such Bedrooms available");
    
	}

}
