package day10_ifStatement;

public class multiBranch_if_Statement {
public static void main (String [] args) {
	
	/* if - else if - else:
	 *  if(condition1){
	 *     //A
	 *  }else if (condition2){
	 *     //B
	 *  }else{
	 *    //C
	 *    }
	 * ONLY ONE BLOCK GETS EXECUTED AND JAVA READS FROM TOP TO BOTTOM ONLY
	 */
	
	if(false) {
		System.out.println("if block");
	}else if (false) {
		System.out.println("else if block");
	}else
		System.out.println("else block");
	
	
	int grade = 890;
	
	
	if (grade >=90 && grade <=100) {
		System.out.println("You made an A");
	}else if( grade >=80 && grade <=90 ) {
		System.out.println("You made a B");
	}else if (grade >=70 && grade <=80 ) {
		System.out.println("You made a C");
	}else if (grade >=60 && grade <=70) {
		System.out.println("You made a D");
	}else if(grade >= 50 && grade <=49)
		System.out.println("You made an F");
	else {
		System.out.println("Invalid Grade");
	}
}	
	
	
	
	
	
	
	
	
	
	
	
}
