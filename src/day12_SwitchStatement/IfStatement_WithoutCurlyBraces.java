package day12_SwitchStatement;

public class IfStatement_WithoutCurlyBraces {
public static void main(String[] args) {
	
	//without curly brace: a single line of statement only
	if(true)
		System.out.println("Hello");
	 //  System.out.println("Hello"); without curly brace can not hold more than one statement or semi colon statement
	else
		System.out.println("World");
	
	if(true)
		if(true)
			System.out.println("Hello World");
		else
			System.out.println("Hello Cybertek");
	
	if(true)
		if(true)
			System.out.println("Hello Cybertek World");
		else
			System.out.println("Hello Cyb Tek");
	else
		System.out.println("INvalid");
	
	
	//multi-branch if:
	int grade=80;
	if(grade>=90) {
		System.out.println("A");
	}else if(grade>=80) {
		System.out.println("B");
	}else if(grade>=70) {
		System.out.println("C");
	}
	
	if (grade>=90) System.out.println("A");
	else if (grade>=80)System.out.println("B");
	else if(grade>=70)System.out.println("C");
	else System.out.println();// this else statement belongs to the "else if statements"
	
	System.out.println("Invalid");// this else statement belongs to the pre condition 
	}
	
	
}

