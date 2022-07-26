package day10_ifStatement;

public class MULTifSTATE {
public static void main (String [] args) {
	
	if(true) {
		System.out.println("if block");
	}
	else if(true) {
		System.out.println("else if block");
	}
	else {
		System.out.println("else block");
	}
	
	int grade =-70;
	String str = "You made a ";
	if (grade >= 90 && grade <=100 ) {
		System.out.println(str+"A, wonderful!");
	}
	else if(grade < 90 && grade >=80 ) {
		System.out.println(str+"B, good");
	}
	else if(grade <80 && grade >= 70) {
		System.out.println(str+"C, average");
	}else if (grade >=60 && grade <=69) {
		System.out.println(str+"D, really?");
	}
	else if(grade <60 && grade > 0 ) {
		System.out.println(str+"F, study more");
	}
	else {
		System.out.println("invalid entry");
	}
	
	
	
	
	
	
	
	
	
	
}
}
