package day20_Review;

import java.util.Scanner;

public class WarmUp2 {
public static void main(String[] args) {
	
	/*4. Write a program that asks user to enter number 5 times:
	 * 1. find the sum of those 5 inputs
	 * 2. find the max number and the min number
	 * 
	 * 
	 */
	Scanner input = new Scanner(System.in);
	int sum = 0;
	
	for(int i = 1; i<=5; i++) {
	System.out.println("Enter your number");
	int inputNum = input.nextInt();
	sum += inputNum;
	}
	System.out.println("sum is: "+sum);
	

}
}
