package day11_recap;

public class grade {
public static void main(String[] args) {
	
	int grade = 85;
	
	if(grade <=100 && grade > 89) {
		System.out.println("Grade is an A with a percentage of "+ grade);
	}else if (grade < 90 && grade >=80) {
		System.out.println("Grade is a B with a percentage of "+grade);
	}else if (grade <80 && grade >=70) {
		System.out.println("Grade is a C with a percentage of "+grade);
	}else if (grade < 70 && grade >= 60) {
		System.out.println("Grade is a D with a percentage of "+grade);
	}else if (grade <60 && grade >=0 ) {
		System.out.println("Grade is a F with a percentage of "+grade);
	}else {
		System.out.println("Invalid Answer");
	}
	
	
	
	
	
	
	
	
	
	
}
}
