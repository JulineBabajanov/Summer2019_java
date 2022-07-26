package day10_ifStatement;

public class Nested_if {
public static void main(String[]args) {
	
	/* Nested if: 
	 *  if(condition1) {
	 *      if(condition2){
	 *      //some code to run
	 *      }
	 *      }
	 * 
	 */

	if(true) {
		System.out.println("Hello batch 12");
		if(false) {
			System.out.println("Hello programmers");	
			}else {
				System.out.println("Hello Team SDET");
				
				
				
				/*   60<= grade < 70 ==> D
				 *   70 < = grade < 80 ==> C
				 *   80 <= grade < 90 ==> B
				 *   90 <= grade <= 100 ==>A
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
			int grade = 60;
			
			if (grade >= 60 && grade <= 100 ) {
				System.out.println("You passed");
			 if(grade >=90 && grade <=100) {
					System.out.println("\tWith an A");
				}
				else if (grade >=80 && grade <90) {
					System.out.println("\twith a B");
				}
				else if (grade >=70 && grade <80) {
					System.out.println("\twith a C");
				}else if(grade>=60 && grade <=50) {
						System.out.println("\t with a D");
					}	else if (grade>=50 && grade <60){
						System.out.println("You made an F"); 
						}else if(grade<40 && grade >=30){ //greater than 100
							System.out.println("You made an G");
							
						}else if (grade <30 && grade >=20) {
							System.out.println("I");
					}else if (grade >=10 && grade <20) {
						System.out.println("J");
					}
				}
		}
	}
}
}
		