package day10_ifStatement;

public class ifElse_State {
public static void main(String[] args) {
	
	if(9<=8) {
		System.out.println("9 is less or equal to 8");
	}
	else {
		System.out.println("9 is greater than 8");
	}
	
	/* if score < 60 ==> failed
	 * if score > = 60 but score < 90 ==> pass
	 * if score >= 90 ==> passed with distinction
	 */
	
	int score = 59;
	
	if(score >=60) {
		System.out.println("Passed");
	}else {
		System.out.println("Failed");
	}
	
	int angle1 =65 , angle2 = 60, angle3 = 60 ;
	
	boolean valid = (angle1+angle2+angle3)==180 ;
	
	if(angle1==60 && angle2==60 && angle3 ==60) {
		System.out.println("It is a valid triangle");
	}else {
		System.out.println("Invalid triangle");
	}
	
	System.out.println(valid);
	
	
}
}
