package day23_Arrays;

import java.util.Scanner;

public class Warmup1 {

	public static void main(String[] args) {

//		// 1. Write a program that can divide two numbers without using the division operator
    	int a = 10;
		int b = 3;
		System.out.println(a / b);

		int x = 20;
		int y = 6;
		int count = 0;
		while (x >= y) {
			x -= y;
			count++;
		}
			System.out.println(count);//result after dividing the two numbers
			System.out.println(20/6);
			System.out.println(x); //remainder

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = 0;
		if(num2!=0) {
			while (num1 >= num2) {
					num1 -= num2;
					result++;
			}
					System.out.println("division is: " + result+" with the remainder of: "+num1);
			
		}else {
			System.out.println("Invalid Entry");
		}
       }
	}
