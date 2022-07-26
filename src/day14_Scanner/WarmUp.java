package day14_Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		
		/* 1. write a program that can display the days
		 * if the day is mon or tues. should display java class days
		 * if the day is thurs or fri should display selenium class days
		 * if the day is wednesday or sat it is sql class days
		 * other wise day off
		 * do not use if statement
		 * 
		 * 
		 * 
		 * in switch statement you can not use boolean, float, double and long
		 * 
		 */
		
		String day="Thursday";
		
		switch (day) {
		case "Monday":
		case "Tuesday":
			System.out.println("Java class");
			break;
		
		case "Wednesday":
		case "Saturday":
			System.out.println("SQL");
			break;
			
		case "Thursday":
		case "Friday":
			System.out.println("Selenium class");
			break;
		
		default:
			System.out.println("Today is my day off");
		
		
		
		
		
		}
		
		
		
	}
	
	
	
	

}
