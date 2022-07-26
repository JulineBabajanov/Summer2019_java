package day11_recap;

public class WarmUp {
public static void main(String[] args) {
	/* declare an int variable "Year"
	 *  write a java program that can check if the year is a leap
	 *  
	 *   if a year can be divided by 4 ==>leap
	 *  do not use SINGLE IF STATEMENT
	 *  
	 *  
	 */

	int Year = 2019; //leap
	boolean LeapYear = Year %4==0;
	
	if(LeapYear) {
		System.out.println("Year "+Year+" is a leap year");
	}else {
		System.out.println("Year "+Year+" is NOT a leap year");
	}
	
	/* warm up 2
	 * grade calculator
	 *  A ==> 90~100
	 *  B ==> 80-89
	 *  C ==> 70-79
	 *  D ==> 60-69
	 *  F ==> 0-59
	 * 
	 * 
	 */
	int grade = -10;
	
	boolean A = grade >=90 && grade <=100;
	boolean B = grade >=80 && grade <=89;
	boolean C = grade >=70 && grade <=79;
	boolean D = grade >=60 && grade <=69;
	boolean F = grade >50 && grade <=59;
	
	if(A) {
		System.out.println("You made A");
	}else if (B) {
		System.out.println("You made B");
	}else if(C) {
		System.out.println("You made C");
	}else if (D) {
		System.out.println("You made D");
	}else if (F) {
		System.out.println("You made F");
     }else {
    	 System.out.println("error 404");
     }
}
}
