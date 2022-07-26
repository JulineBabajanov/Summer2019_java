package day10_ifStatement;

public class nest_iff {
public static void main(String[] args) {
	
	int grade = 0;
	
	if(grade >=60 && grade<=100) {
		System.out.println("You passed with an ");
		
		if(grade>=90 && grade <=100) {
			System.out.println("A");
		}else if(grade >=80 && grade < 90) {
			System.out.println("B");
		}else if(grade >=70 && grade <80) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}
	else {
		if(grade<60) {
			System.out.println("You failed with an F");
		}else {
			System.out.println("Invalid score, error 404");
		}
	}

	
	
	
	
	
	
	
	
	
}
}
