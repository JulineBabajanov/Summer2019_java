package day11_;

public class Month {
public static void main(String[] args) {
	/*1. write a program that can find the number of days in a month (Assume that Feb has 28 days)
	 * int month=0-12
	 * 
	 * Jan Feb March April May June July August Sept Oct Nov Dec
	 * 31   28  31    30    31  30   31   31    30    31  30  31
	 * 
	 * 
	 * Requirement is nested if
	 * 
	 */
	
	int month=12;
	
	if(month > 0 && month < 13) {
		if(month==1) {
			System.out.println("31 days");
	}
	else if(month==2) {
		System.out.println("28 days");
				
	}
	else if(month==3) {
		System.out.println("31 days");
	}
	else if(month==4) {
		System.out.println("30 days");
	}
	else if(month==5) {
		System.out.println("31 days");
	}
	else if(month==6) {
		System.out.println("30 days");
	}
	else if(month==7) {
		System.out.println("31 days");
	}
	else if(month%2==0) {
		System.out.println("31 days");
	}else {
		System.out.println("30 days");
	}
	
	int month2=13;
	int year=2000;
	if(month2 > 0 && month2 < 13) {
		if (month2==2) {
			if(year%4==0) {
				System.out.println("29 days");
			}
			else {
				System.out.println("28 days");
		
			}
		}
		else if(month2==4 || month2==6) {
			System.out.println("30 days");
		}
		else if(month2==9 ||month2==11) {
			System.out.println("30 days");
		}else {
			System.out.println("31 days");
		}
	}else {
			System.out.println("Invalid Entry");
		}
		
	}
	
	if(false) {
		System.out.println("hello");
	}
	else {
		System.out.println("Batch 12");
	}
	if(false) {
		System.out.println("hello");
	}
	else if(false) {
		System.out.println("Batch 12");
	}
	else {
		System.out.println("Cybertek");
	}
	
	
	
	
	
}
}

