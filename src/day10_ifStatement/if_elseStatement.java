package day10_ifStatement;

public class if_elseStatement {
public static void main(String[] args) {
	
	if(9>=10) {
		System.out.println("9 is greater or equal to than 8");
	}
	
	else {
		System.out.println("9 is less than 8");
	
	}	
	
	int score = 80;
	
	if(score >=60) {
		System.out.println("passed");
	}else {
		System.out.println("failed");
	}
	
	if(score >= 90 && score <101) {
		System.out.println("You got an A... good job!");
	}else {
		System.out.println("You didn't get an A... awful job");
	}
	
	
	int angle1 =180;
	int angle2 =0;
	int angle3= 0;
	
	boolean valid = (angle1+angle2+angle3)==180;
	
	if(valid) {
		System.out.println("it's a valid triangle");
	}else {
		System.out.println("Invalid triangle, do some math");
	}
	
}
}
