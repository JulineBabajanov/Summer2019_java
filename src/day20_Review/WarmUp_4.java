package day20_Review;

import java.util.Scanner;

public class WarmUp_4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
			int min = 999999999;
	        
	         for(int i =1; i<=2; i++) {
			System.out.println("Enter a number");
	        int InputNum= scan.nextInt();
	         if(InputNum < min) {
	        	 min = InputNum;
	         }
	         }
	         System.out.println("min number is: "+min);
}
}
