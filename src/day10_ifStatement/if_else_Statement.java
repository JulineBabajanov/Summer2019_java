package day10_ifStatement;

public class if_else_Statement {
public static void main(String[] args) {
	
	/* if & else
	 *   if(Condition){
	 *   //A   if block gets exectured if the condition is true
	 *   }
	 *   else{
	 *   //B gets executed if A block is false
	 *   }
	 * 
	 */
	
	
	if ( 9 > 8) {
		System.out.println("9 is greater than 8");
	}if ( 9< 8) {
		System.out.println("9 is less than 8");
	} if( 9==8) {
		System.out.println("9 is equal to 8");
	}
	
	
if (9>=8) {
	System.out.println("9 is greater or equal to 8");
}else {
	System.out.println("9 is less than 8");
}
	
	if(false==!false) {
		System.out.println("if block");
	}else
		System.out.println("else block");
	/*
	 *   Task01:
	 *   if score is less than 60 ==> "failed
	 *   if score is >= 60 but score < 90 ==> pass
	 *   if score >=90 ==> pass with distinction
	 * 
	 */
	
	int score = 59;
	
	if (score >=60) {
		System.out.println("Passed");
	}else {
		System.out.println("Failed");
	}if(score>=90) {
		System.out.println("you have made A+, good job");
	}else {
		System.out.println("You have made less than 90");
	}
	
	
	/* 1. triangle: has three angles, and sum of three angles MUST be equal to 180
	 *  1. declare 3 variables called angle1, angle2, angle3
	 *  2. write a program to check if the triangle is valid or not
	 *  
	 * 
	 */
	
	int angle1 = 55, angle2 = 60, angle3 = 65;
	
	boolean valid = (angle1+angle2+angle3) == 180;
	
	if (valid) {
		System.out.println("it's a valid triangle");
	}else {
		System.out.println("invalid triangle, do some math");
	}
	
	
	
	
	
	
	
	
}
}
