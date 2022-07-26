package day10_ifStatement;

public class no_curlyBraces {
public static void main(String[] args) {
	
	/* Nested if: 
	 *  if(condition){
	 *       if(condition2 ){
	 *         //some code
	 * 
	 */
	
	
	if (false) {
		System.out.println("Hello Cybertek");
		if(false) {
			System.out.println("Hello World");
		}else {
			System.out.println("HELLO TEAM SDET");
		}
	}
	
	
	/*  grade <= 60 && grade <70
	 *  grade <= 70 && grade <80
	 *  grade <= 80 && grade <90
	 *  grade <=90 && grade <=100
	 * 
	 */
	
	
	int grade = 0;
	
	if(grade >=60 && grade <=100) {
		System.out.println("You passed: ");
		if(grade>=90 && grade <=100) {
			System.out.println("\twith an A");
		}else if(grade>=80 && grade <90) {
			System.out.println("\twith a B");
		}else if(grade>=70 && grade <80) {
			System.out.println("\twith a C");
		}else if(grade >=60 && grade < 70) {
			System.out.println("\t with a D");
		}
		}
		else {
			if(grade<60) {
	System.out.println("you failed");
	
			}else {
				System.out.println("Invalid score, error 404");
			}
	
	
	
}
}}
