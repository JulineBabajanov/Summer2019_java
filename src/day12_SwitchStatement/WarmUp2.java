package day12_SwitchStatement;

public class WarmUp2 {
public static void main(String[] args) {
	
	/* Declare 3 numbers
	 *  if n1 and n2 are equal
	 *   => n1&n2 are equal
	 *   
	 *   if n2 and n3 are equal
	 *   ==> n2&n3 are equal
	 *   
	 *   if n3 and n1 are equal
	 *   ==>n3&n1 are equal
	 *   
	 *   if all equal ==> all equal
	 *   if none are equal ==> none are equal
	 *   
	 *   Do not use single if statement
	 * 
	 */
	
	
	int n1 = 5;
	int n2 = 4;
	int n3 = 6;
	
	
	   if (n1 == n2 && n1!=n3 ) {
		System.out.println("n1 and n2 are equal");
	}else if(n1==n3&& n1!=n2) {
		System.out.println("n1 and n3 are equal");
	}else if(n2==n3&& n2!=n1) {
		System.out.println("n2 and n3 are equal");
	}else if(n1==n2 && n1==n3 && n2==n3) {
		System.out.println("all of them are equal");
	}else {
	
	System.out.println("none are equal");
}
	   
	 int num1=5, num2=6, num3=4;
	 
	 if (num1==num2 && num2==num3) {
		 System.out.println("All are equal");
	 }else if(num1==num2) {
		 System.out.println("num1 and num2 are equal");
	 }else if (num2==num3) {
		 System.out.println("num2 and num3 are equal");
	 }else if (num1==num3) {
		 System.out.println("num1 and num3 are equal");
	 }else {
		 System.out.println("none of them are equal");
	 }
	   
	   //third way: nested if
	 
	 int A = 30, B=20, C=20;
	 
	 if(A==B && B==C) {
		 System.out.println("All are equal");
	 }else {
		 if(A==B) {
			 System.out.println("A and B are equal");
		 }else if(A==C) {
			 System.out.println("A and C are equal");
		 }else if (B==C) {
			 System.out.println("B and C are equal");
		 }else {
			 System.out.println("None of them are equal");
		 }
	 }
	 
	/* 60~70 is D
	 *  70~80 is C
	 *  80~90 B
	 *  90~100 A ==done
	 *  0~59 F
	 * 
	 * 
	 */
	 int grade = 68;
	 if(grade>=0 && grade <=100) {
	  if(grade>=60) {
		  if(grade>=90) {
		  System.out.println("A");
	  }
		  else if(grade>= 80) {
		  System.out.println("B");
	  }
		  else if(grade >=70) {
		  System.out.println("C");
	  }else {
		  System.out.println("D");
		  
	  }
	  
	 }else  {
		 System.out.println("failed");
	 }
	 
	 } else {
		  System.out.println("Invalid entry");
	  }
	 
	   
}}