package day11_;

public class WarmU {
public static void main(String[] args) {
	
	/*  check if the year is leap year
	 * 
	 */
	
	int year = 2003;
	boolean LeapYear = year%4==0;
	
	if(LeapYear) {
		System.out.println(year+" is a leap year.");
	}else {
		System.out.println(year+" not a leap year.");
	}
	
	int grade = 60;
	
	
	if(grade>=90 && grade <=100) {
		System.out.println("You earned an A");
	}else if(grade >=80 && grade <90) {
		System.out.println("B");
	}else if(grade >=70 && grade <80) {
		System.out.println("C");
	}else if(grade >=60 && grade <70) {
		System.out.println("D");
	}else if(grade >=50 && grade <60) {
		System.out.println("F");
	}else {
		System.out.println("Invalid entry");
	}
	
	
	int grade1 = 100;
	boolean A = grade1 >=90 && grade1 <=100;
	boolean B = grade1 >=80 && grade1 <90;
	boolean C = grade1 >=70 && grade1 <80;
	boolean D = grade1 >=60 && grade1 <70;
	boolean ValidGrade= grade1 >=50 && grade1 <=100;
	
	if(ValidGrade) {
		if(A) {
			System.out.println("You made an A");
		}else if(B) {
			System.out.println("You made a B");
		}else if(C) {
			System.out.println("You made a C");
		}else if (D) {
			System.out.println("You made a D");
		}else {
			System.out.println("You made an F");
		}
	}else {
		System.out.println("Not a suffiecient grade");
	}
	//  1       2      3       4        5      6      7      8      9     10      11     12
	// jan 31 feb 28 march 31 april 30 may 31 jun 30 jul 31 aug 31 sep 30 oct 30 nov 30 dec 31 
	// months 28 : 2    months 30: 4,6,9,11   months 31 days: 1,3,5,7,8,10,12
	
	
	int month = 13;
	
	if(month >0 && month <13) {
		if(month==1) {
			System.out.println("31");
		}
		else if(month==2) {
			System.out.println("28");	
	}else if(month==3) {
		System.out.println("31");
	}else if(month==4) {
		System.out.println("30");
	}else if(month ==5) {
		System.out.println("31");
	}else if(month==6) {
		System.out.println("30");
	}else if(month==7) {
		System.out.println("31");
	}else if(month==8) {
		System.out.println("31");
	}else if(month==9) {
		System.out.println("30");
	}else if(month==10) {
		System.out.println("30");
	}else if(month==11) {
		System.out.println("30");
	}else {
		System.out.println("31");
	}
			
	
	}
	else {
		System.out.println("Invalid Entry");
	
	
	
	
	int month2 = 2;
	int year1 = 2022;
	
	if(month2>0 && month2 <13) {
	
		if (month2==2) {
			if(year1%4==0) {
				System.out.println("29 days");
			}else {
		System.out.println("28 days");
			}
	}else if(month2==4 || month2 == 6 || month2 == 9 || month2 ==11) {
		System.out.println("30 days");
	}else {
		System.out.println("31 days");
	}
	
	
	
	}
	
	else {
		System.out.println("Invalid month");
	}
	
	
	
	
	
	
	
}}}
