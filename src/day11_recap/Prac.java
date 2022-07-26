package day11_recap;

public class Prac {
public static void main (String []args) {
	
	/*  declare a variable called AGE
	 *  declare a boolean variable "GoodPerson"
	 * 
	 *  AGE >=18 ==> Cigarette
	 *  AGE >=21 ==> Hookah
	 *  AGE >=25 ==> Alcohol
	 *  AGE <18 ==> milk
	 * 
	 *  else // bad for your health
	 * 
	 */
	
	
	int age = 18;
	boolean GoodPerson =true;
	
	if(age>=18) {
	if(GoodPerson) {
		System.out.println("Alcohol is bad for your health");
	}
	else { //Goodperson=false, && age >=18
		System.out.println("You can buy Cigarettes");
		if(age>=21) {
			System.out.println("You can buy Hookah");
	}
     if(age>=25) {
    	 System.out.println("You can buy alcohol ");
     }
	}
    }else {
	System.out.println("buy milk");
	

    }
	
	
	
	/*  write a program that can find the number of days in a month (Assume that Feb has 28 days)
	 * 
	 * 
	 *  int month = 0~12;
	 *  
	 *  1       2      3        4         5      6    7          8        9           10       11    12 
	 *  Jan    Feb    March    April    May    June   July    August    September    Oct     Nov     Dec
	 *  31     28     31       30        31     30     31       31        30          31     30      31
	 * 
	 *  must used nested if
	 *  
	 *    28 days: 2
	 *    30 days: 4, 6, 9, 11
	 *    31 days: 1, 3, 5, 7, 8, 10, 12
	 */
	
	int month = 2;
	
	if(month > 0 && month < 13) {
		if(month==1) {
			System.out.println("31");
		}else if(month==2) {
			System.out.println("28");
		}else if (month == 3) {
			System.out.println("31");
		}else if(month==4) {
			System.out.println("30");
			}else if(month==5) {
				System.out.println("31");
			}else if (month==6) {
				System.out.println("30");
			}else if (month==7) {
				System.out.println("31");
			}else if (month==8) {
				System.out.println("31");
			}else if (month==9) {
				System.out.println("30");
			}else if (month==10) {
				System.out.println("31");
			}else if(month==11) {
				System.out.println("30");
			}else {
				System.out.println("31");
			}
		
		
		
		
		
	}
	else {
		System.out.println("Invalid Entry");
	}
	
	int months = 2;
	int year =2024;
	if(months>0 && months<13) {
	if (months==2) {
		if(year%4==0) {
			System.out.println("29 days and it's a leap year");
		}else {
			System.out.println("28 days");
		}
	}else if (months==4 || months==6) {
		System.out.println("30 days");
	}else if (months==9 || months==11) {
		System.out.println("30 days");
	}else {
		System.out.println("31 days");
	}
	}else 
		System.out.println("Invalid Entry");
	
	
	
	
	if(false) {
		System.out.println("hello");
	}else {
		System.out.println("Batch 12");
	}
	
	if(false) {
		System.out.println("hello");
	}else if(false) {
		System.out.println("Batch 12");
	}else {
		System.out.println("Cybertek");
	}
	
	
	
	
	
	
	
	
}}







