package day10_ifStatement;

public class nested_if2 {
public static void main(String[] args) {
	
	/* Nested if: if(condition1){
	 *                  if(condition2){
	 *                  //some code to run
	 * }
	 * }
	 * 
	 * 
	 */
	if(true) {
		System.out.println("Hello batch 12 ");
		if(false) {
			System.out.println("Hello programmers");
		}else {
			System.out.println("Hello Team SDET");
		}
	}
	}
}