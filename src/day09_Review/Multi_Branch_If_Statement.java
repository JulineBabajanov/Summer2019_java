package day09_Review;

public class Multi_Branch_If_Statement {
public static void main(String[] args) {
	
	int score=59;
	if(score>=60) {
		System.out.println("Passed");
	}else {
		System.out.println("failed");
	}
	if(score>=90) {
		System.out.println("you have made an A+");
	}else {
		System.out.println("You have made less than 90");
	}
	
	//Triangle task if else 
	
	int angle1=60, angle2=60, angle3=60;
	boolean valid=(angle1+angle2+angle3)==180;
	
	if(valid) {
		System.out.println("its a valid triangle");
	}else {
		System.out.println("invalid triangle, do some math");
	}
	
	//multi branch if else
	
	//if, else if, else
	
	
	if (true) {
		System.out.println("if block");
	}
	else if(false) {
		System.out.println("else if block");
	}
	else {
		System.out.println("else block");
	}
	
	
	
	
}
}
