package day20_Review;

import java.util.Scanner;

public class WarmUp6 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int min = 99999999; //initialize the minimum value
	
	for(int i = 1; i<=5; i++){
	System.out.println("Enter a number");
	int InputNum = input.nextInt();
	if(InputNum < min ) { //1
		min = InputNum;
	}
	}
	System.out.println("minimum value is: "+min);
	
}
}
