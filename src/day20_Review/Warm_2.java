package day20_Review;

import java.util.Scanner;

public class Warm_2 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	for(int i =1; i<=3; i++) {
	System.out.println("Enter your number");
	int inputNum = scan.nextInt();
	sum+=inputNum;
	}
	System.out.println("Your sum is "+sum);
}
}
