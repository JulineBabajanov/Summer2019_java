package practice2;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {

		Scanner keyboard=new Scanner (System.in);
		
		
		int total=0;
		System.out.println("Enter a positive integer");
		int nextNum=keyboard.nextInt();
		
		while(nextNum>0) {
			total= total+ nextNum;
			nextNum=keyboard.nextInt();
			
		}
		
		System.out.println("Sum of all numbers: "+ total);
	}

}
