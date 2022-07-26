package day10_ifStatement;

public class NestedIf {
public static void main (String[]args) {
	
	/*nested if :
	 * if (condition 1){
	 *    if (condition2){
	 *    }
	 *    }
	 * 
	 */
	
	if(true) {
		System.out.println("Hello Cybertek");
		if(false) {
			System.out.println("Hello World");
		}else {
			System.out.println("Hello Team SDET");
		}
	}
	
	
	/*  60 <= grade <70 ==D
	 *  70<= grade < 80 ==C
	 *  80 <= grade < 90 ==B
	 *  90<= grade <=100 ==A
	 *  grade < 60 == F
	 */
	int grade = 31;
	if(grade >= 0 && grade <=100) {
		System.out.println("You Passed");
		  if(grade>=90 && grade <=100) {
			  System.out.println("\twith an A");
		  }else if(grade >=80 && grade <90) {
			  System.out.println("\twith a B");
		  }else if(grade >=70 && grade < 80) {
			  System.out.println("\twith a C");
		  }else if (grade >=60 && grade < 70) {
			  System.out.println("\twith a D");
		  }else if(grade >=0 && grade <60);{
	      System.out.println("with a F");
	         else if(grade >=30 && grade <40) 
		   System.out.println("\t with a H");{
             }else if(grade >=0&& grade <60) {
			  System.out.println("\twith a F");
		  
			 
		
		  }
		
	
	else {
		System.out.println("Invalid score, error 404");
	}
	
	
}
}
