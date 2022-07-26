package day20_Review;

import java.util.Scanner;

public class WarmUp4 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int min = 99999999;// store the minimum user input value
	
	for(int i = 1; i<=5; i++ ) {
	System.out.println("Enter a number");
	int num = input.nextInt();
	if(num<min){
		min = num;
	}
	}
	System.out.println("min value is: "+min);
}
}
