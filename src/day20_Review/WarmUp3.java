package day20_Review;

import java.util.Scanner;

public class WarmUp3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	/*4. Write a program that asks user to enter number 5 times:
	 *
	 * 2. find the max number and the min number
	 * 
	 */
	/*int sum = 0;
	
	for(int i = 1; i<=5; i++){
	System.out.println("Enter numbers");
	int inputNum = input.nextInt();
	sum+=inputNum;
}
	System.out.println("sum is: "+sum);
}
}
*/
	//WARM UP 3
	int max = 0;
	for(int i = 1; i<=5;i++) {
	System.out.println("Enter a number");
	int inputNum = input.nextInt();
	 if(inputNum>max) {
		 max = inputNum;
	 }
	}
	System.out.println("max value is: "+max);
	
	
}
}
	
	
	