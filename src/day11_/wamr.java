package day11_;

public class wamr {
public static void main(String[] args) {
	/*28: 2
	 * 30 4, 6, 9, 11
	 * 31 1, 3, 5, 7, 8, 10, 12
	 */
	
	int month = 9;
	
	if(month >0 && month < 13) {
		if(month ==1) {
			System.out.println("31 days");
		}else if (month == 2) {
			System.out.println("28 days");
		}else if (month == 3) {
			System.out.println("31 days");
		}else if(month == 4) {
			System.out.println("30 days");
		}else if(month == 5) {
			System.out.println("31 days");
		}else if( month == 6 ) {
			System.out.println("30 days");
		}else if( month == 7) {
			System.out.println("31 days");
		}else if(month%2==0) {
			System.out.println("31 days");
		}else {
			System.out.println("30 days");
		}
	}
	else {
		System.out.println("Invalid Entry");
	}
	
	
	int Month2 = 2;
	int year = 2021;
	if(Month2 >0 && Month2 <13)
		
		
	if(Month2 == 2) {
		if(year%4==0) {
			System.out.println("29 days "+year);
		}else {
			System.out.println("28 days "+year);
		}
		
	}else if(Month2 == 4 || Month2 == 6) {
		System.out.println("30 days");
	}else if (Month2 == 9 || Month2 == 11) {
		System.out.println("30 days");
	}else {
		System.out.println("31 days for month "+Month2);
	}
	
	else {
		System.out.println("Invalid Entry, please enter a month number between 1 and 12");
	}
	
	if(true) {
		System.out.println("hello");
	}else {
		System.out.println("Batch 12");
	}
	
	
	if(false) {
		System.out.println("Hello");
	}else if(false) {
		System.out.println("batch 12");
	}
	else {
		System.out.println("Cybertek");
	}
	int X = 10;
	
	if (X < 0) {
		System.out.println("Greater than 5");
	}else if (X==10) {
		System.out.println("equal to 10");
	}
	
	
	
}
}
