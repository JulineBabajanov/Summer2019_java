package day15_Scanner_StringClass;

import java.util.Scanner;

public class Tsk01 {
public static void main(String[] args) {
	
	int num = 5;
    String result = "";
	if(num >=0 && num<=9) {
		if(num == 9) {
			System.out.println("nine");
		}else if(num==8){
			System.out.println("eight");
		}else if(num==7){
			System.out.println("seven");
		}else if(num==6) {
			System.out.println("six");
		}else if(num==5) {
			result = "five";
		}else if(num==4) {
			System.out.println("four");
		}else if(num==3) {
			result = "three";
		}else if(num==2) {
			System.out.println("two");
		}else if(num==1) {
			System.out.println("one");
		}else {
			System.out.println("zero");
		}
		
		
		
	}else {
		System.out.println("Invalid");
	}
	
	System.out.println(result);
	
	int n =-6 ;
	String result2 = (n==9) ? "nine" : (n==1) ? "one" : (n==2) ? "two" 
			           : (n==3) ? "three" : (n==4) ? "four"
			            : (n==5) ? "five":(n==6)?"six":(n==7)? "seven"
			            :(n==8)? "eight": (n==0)?"zero":
			             "invalid ";
	
	System.out.println(result2);
}
}
