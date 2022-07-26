package day09_Review;

public class if_Else_Statement {
public static void main(String[] args) {
	
	
	//if condition is true executes first block... if false then else block gets executed
	
	//if & else:
	/* if(Condition){
	 *
	 * }else{
	 *   
	 * } 
	 */
	if (9>8) {
		System.out.println("9 is greater than 8");
	}
	if(9<8){
		System.out.println("9 is less than 8");
	}
	if(9==8){
		System.out.println("9 is equal to 8");
	}
	
	
	if(9<=8) {
		System.out.println("9 is less or equal to 8");
	}
	else {
		System.out.println("9 is  greater than 8");
	}
	
	
	if(false==!false) {
		System.out.println("if block");
	}
	else {
		System.out.println("else block");
	}
	
	
	
/*
 * if score<60==>failed
 * if score>=60 but score < 90 ==>passed
 * if score>90==>passed with distinction 
 * 
 * 
 * 
 * 
 * 
 */
	int score=99;
	
	if(score>=60) {
		System.out.println("Passed");
	}
	else {
		System.out.println("Failed");
	}
	if (score>=90) {
		System.out.println("you have made an A+, great job!");
	}else {
		System.out.println("you have made less than 90");
	}
	/*1. triangle: has three angles, and sum
	 *  of three angles MUST be equal to 180
	 * 
	 * 1. declare three variables angle1, angle2, angle3
	 * 2. write a program whether a triangle is valid or not
	 * 
	 * 
	 */
	int angle1=60, angle2=60, angle3=60;
	boolean valid=(angle1+angle2+angle3)==180;
	
	
	if (valid) {
		System.out.println("it is a valid triangle");
	}else {
		System.out.println("Invalid triangle, do some math");
	}
	
	
}
}
