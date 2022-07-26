package day24_JavaRecap;

import java.util.Scanner;

public class ArraysPractice {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	
	/*
	 * ask user to enter five numbers, then find the sum of those five numbers.
	 * Must use Array
	 */
	/*int [] numbers = new int [5];
	
	for(int i = numbers.length-1; i>=0; i--) {
		System.out.println("Enter a number");
		numbers[i]=scan.nextInt();
	}
	int sum= 0;
	for(int i =0;i<=numbers.length; i++) {
		System.out.print(numbers[i]+" ");
		//sum+=numbers[i];
	}
	//System.out.println(sum);
	
	System.out.println();
	/*
	 * ask user to enter 5 names. return the longest name in the String array
	 */
	String[] names = {"Seyfo", "Asiya", "Myra", "Kateryna", "Daulet", "Jakhongir Mansurovich Babajanov"};
	
	
	String LongestName="";
	int max=0;
	for(int i = 0; i<names.length;i++) {
		if(names[i].length()>max) {
			max=names[i].length();
			LongestName=names[i];
		}
	}
	
	System.out.println(max);
	
	System.out.println(LongestName);
	
	
	
	
	
	
}
}
