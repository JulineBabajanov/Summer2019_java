package day21_WhileLoops;

import java.util.Scanner;

public class whileLoop {
public static void main(String[] args) {
	
	/*
	 * loop is used to repeat actions
	 * for(initialization, condition, iterator)
	 * 
	 * while(condition){     //while loop gets executed as long as condition is true
	 * statements;  
	 * }
	 * its a repeating if statement
	 */
	int a=9;
	while(a>8) {
		a--;
		System.out.println("Abraham "+a);
		
	}
	
	/*
	 * write a java program that can count how many times the word "book" is appeared in a String
	 * 
	 * ANY FOR LOOP CAN ALWAYS BE CONVERTED TO WHILE LOOP
	 */
	String sentence = "I like book, I read book book book book";
	//String sentence1=sentence;
	int count = 0;
	
	while(sentence.contains("book")) {
		count++;
		sentence = sentence.replaceFirst("book", "");
	}
	System.out.println(count);
	System.out.println(sentence);
	
	
	while(true) {
		System.out.println("Amina is good, Abraham is good, Aziza is good");
		break;//forcefully exits the loop
	}
	
	int i = 0;
	while(true) {
		//int i = 0;
		i++;
		System.out.println("hello: "+i);
		if(i==5) {
			break;
		}
	}
	/*
	 * use while loop to print all even numbers between 1-100
	 */
	
	for(int n=1; n<=100;n++) {
		if(n%2==0) {
			System.out.print(n+" ");
		}
	}
	//System.out.print(" ");
	System.out.println("");
	
	int j=1;
	while(j<=100) {
		if(j%2==0) {
		System.out.print(j+" ");
		
		}
		j++;
	}
	System.out.println();
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Starting number");
	int start = scan.nextInt(); //10
	
	System.out.println("ending number");
	int end=scan.nextInt(); //100
	
	/*for(int x = start; x<end;x++) {
		if(x%2==0) {
			System.out.println(x);
		}
	}
	*/
	System.out.println();
	
	int u = start;
	while(u<=end) {
		if(u%2==0) {
			System.out.println(u+" ");
		}
		u++;
	}
	
	
	
	
	
	
	
}
}
