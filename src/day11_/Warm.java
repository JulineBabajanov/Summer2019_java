package day11_;

public class Warm {
public static void main(String[] args) {
	
	int Year = 2036;
	boolean LeapYear = Year %4 ==0;
	
	if(LeapYear) {
		System.out.println("Year "+Year + " is a leap year\n\n");
	}
	
	else {
		System.out.println("Year "+Year+" is not a leap year\n\n\n");
	}
	
	int grade = 550;
	boolean ValidGrade = grade >=0 && grade <= 100;
	
	
	
	if(ValidGrade) {
	if(grade <=100 && grade >=90) {
		System.out.println("You earned an A "+grade);
	}else if(grade <90 && grade >=80) {
		System.out.println("You made a B "+grade);
	}else if( grade <80 && grade >= 70) {
		System.out.println("You got a C "+grade);
	}else if(grade <70 && grade >=60) {
	 System.out.println("You have earned a D "+grade);
	}else  {
		System.out.println("You have failed with a F "+grade);
	}
	}else
		System.out.println("This is an invalid number");
	
	//Nested if: if condition can be evaluate to multiple scenarios. 
	//if multiple scenarios execution depends on a specific condition
	
	/* declare a variable Age
	 * declare boolean variable "Good Person";
	 * age >= 18 ==cigarettes
	 * age>= 21 hookah
	 * age>=25 == alcohol
	 * age < buy milk
	 */
	
	int Age = 21;
	boolean GoodPerson =false;
	
	if(Age >= 18) {
		if(GoodPerson) {
			System.out.println("Alcohol is bad for your health");
		}else {
			System.out.println("You can buy Cigarettes");
		if (Age>21) {
			System.out.println("You can buy Hookah");
		}
		if (Age>=25) {
			System.out.println("You can buy Alcohol");
		}}}
		else {
		System.out.println("Buy Milk");
	}}
/*jan 31, feb 28, mar 31, april 30 may 31, june 30, july 31 august 31 sept 30, oct 31, nov 30, dec 31
 * 
 * 28 days 2... 
 * 30 days 4, 6, 9, 11
 * 31 days 1, 3, 5, 7, 8, 10, 12
 * 
 */
{
      int month = 4;
      
      if(month > 0 && month < 13) {
    	  if (month == 1) {
    		  System.out.println("31 days");
    	  }else if (month==2) {
    		  System.out.println("28 days");
    	  }else if(month == 3) {
    		  System.out.println("31 days");
    	  }else if(month == 4) {
    		  System.out.println("30 days");
    	  }else if(month == 5) {
    		  System.out.println("31 days");
    	  }else if(month ==6) {
    		  System.out.println("30 days");
    	  }else if(month ==7) {
    		  System.out.println("31 days");
    	  }else if(month ==8) {
    		  System.out.println("31 days");
    	  }else if(month ==9) {
    		  System.out.println("30 days");
    	  }else if(month==10){
    		  System.out.println("31 days");
    	  }else if(month == 11) {
    		  System.out.println("30 days");
    	  }else if (month == 12) {
    		  System.out.println("31 days");
    	  }else {
    		  System.out.println("invalid number");
    	  }
      }
      }
      
      
      
      
      
      
      
      
      
      
      
}