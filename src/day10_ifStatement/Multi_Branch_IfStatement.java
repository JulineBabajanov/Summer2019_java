package day10_ifStatement;

public class Multi_Branch_IfStatement {
public static void main (String [] args) {
	
	/* if - else if - else:
	 *    if(condition1){
	 *        syso: A
	 * }
	 *   else if(condition2){
	 *           syso: B
	 * }
	 * else{
	 *  syso: C
	 *  }
	 */
	
	/*Task 01: 
	 * 90<=GRADE ==> A
	 * 80<=GRADE <90 ==>B
	 * 70<= GRADE <80 ==>C
	 * 60<=GRADE < 70 ==>D
	 *    else ==>F
	 * 
	 */
	int grade = 98;
	
	if(grade >=90 && grade <= 100) {
		System.out.println("You have made an A");
	}
	else if(grade < 90 && grade >= 80) {
		System.out.println("You have made a B");
	}
	else if (grade < 80 && grade >= 70) {
		System.out.println("You have made a C");
	}
	else if (grade <70 && grade >= 60) {
		System.out.println("You have made a D");
	}
	else if (grade <60 && grade >= 50) {
		System.out.println("You have failed");
	}
	else {
		System.out.println("Invalid answer");
	}
	
	
	
	
	
	
}
}
