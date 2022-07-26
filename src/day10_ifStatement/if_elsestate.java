package day10_ifStatement;

public class if_elsestate {
public static void main(String[] args) {
	
	
	if(9>=8) {
		System.out.println("9 is greater or equal to 8");
	}
	
	else {
		System.out.println("9 is less than 8");
	}
	
	if(false == !false) {
		System.out.println("if block");
	}
	else {
		System.out.println("else block");
	}
	
	/*task 01: if score is less than 60 you failed
	 * if score > 60 but less than 90 you passed
	 * if score is > 90 you passed with Distinction
	 * 
	 */
	
	int score = 101;
	
	if(score <60) {
		System.out.println("failed");
	}
	if(score >=60 && score < 90) {
		System.out.println("passed");
	}
	if(score >= 90 && score <=100) {
		System.out.println("passed with distinction");
	}
	
	/*
	 * triangle has 3 angles and all angles must be 180
	 * declare 3 variables angel1, 2 and 3
	 * write the program to check if triangle is valid or not
	 */
	
	int angle1 = 60, angle2 = 60, angle3 = 60;
	
	boolean valid = (angle1==60 &&angle2==60&&angle3==60);
	
	if(valid) {
		System.out.println("It's a valid triangle");
	}else {
		System.out.println("Invalid triangle, do some math");
	}
	
	
	
	
}
}
