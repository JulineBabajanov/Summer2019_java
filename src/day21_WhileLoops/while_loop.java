package day21_WhileLoops;

import java.util.Scanner;

public class while_loop {
public static void main(String[] args) {
	
	/*loop is used to repeat actions
	 * for(initialization; condition; iterator)
	 * while loop:
	 * while(condition){   //loop gets executed as long as the condition is true.
	 * statements;
	 * }
	 */
	
	int a = 9;
	while ( a > 8) {
		//a--;
		System.out.println("Hello "+ a);
		--a;
	}
	
	//Write a java program that can count how many times the word "book" is appeared in a String
	
	String sentence = "I like book, I read book book";
	
	int count = 0;
	
	while(sentence.contains("book")) {
		count++;
		sentence = sentence.replaceFirst("book", "");
	}
	System.out.println(count);
	
	System.out.println(sentence);
	
	int j = 0;
	
	while(true) {
		
		j++;
		System.out.println("hello: "+j);
		if(j==5) {
			break;	
		}
		
	}
	
	//for(int z = 1; z <=100; z++) {
		//if(z%2==0) {
			//System.out.println(z+" ");
		//}
	//}
	int x = 1;
	while(x<=100) {
		if(x%2==0) {
			System.out.print(x+" ");
			
		}
		x++;
	}
	System.out.println();
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Starting number");
	
	int start = scan.nextInt();
	
	System.out.println("Ending number");
	int end = scan.nextInt();
	
	
	for(int u=start; u<=end;u++) {
		if(u%2==0) {
			System.out.print(u+" ");
		}
	}
	
	System.out.println();
	int t = start;
	while(t<=end) {
	if(t%2==0) {
		System.out.print(t+" ");
	}
	t++;
	}
	
	
}
}
