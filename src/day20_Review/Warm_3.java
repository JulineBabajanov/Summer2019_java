package day20_Review;

import java.util.Scanner;

public class Warm_3 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	/*write a program that asks user to enter number 10 times:
	 * 1. find the maximum number
	 */
	
	int max = 999999999;
	
	for(int i = 1; i<=5;i++) {
		System.out.println("Enter a number");
		int inputNum = scan.nextInt();
		if(inputNum < max) {
		max=inputNum;
	}}
	System.out.println("Your min number is: "+max);
	
}
}
