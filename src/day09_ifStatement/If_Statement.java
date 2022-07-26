package day09_ifStatement;

public class If_Statement {
public static void main(String[] args) {
	
	//single if statement starts with if and must take a boolean expression
	
	/*if (boolean expression){
	   if block gets executed if the condition is true / codes to run
	}
	*/
	
	
	if(9<10) {
		System.out.println("Hello ");
		System.out.println("Happy Friday");
		System.out.println("Tomorrow is a day off");
	}
	
	
	if(2==2) {
		System.out.println("Hello Juline");
	}
	
	int X= 987654320;
	if(X%2==0) {
		System.out.println(X);
		System.out.println(X+" is an Even number");
	}
	
	
	
	if( X%2 != 0) {
		System.out.println(X);
		System.out.println("Its an odd number");
	}
	
	int Y = 23456780;
	if (Y%5==0) {
		System.out.println(Y+" can be divided by 5\n\n");
	}
	
	if(Y%5 !=0) {
		System.out.println(Y+ " cant be divided by 5\n\n");
	}
	
	String CEO = "Main Boss";
	String Kuzzat = "Main Boss";
	
	System.out.println(CEO == Kuzzat);
	if(Kuzzat == CEO) {
		System.out.println("Greatest Person in the World");
		System.out.println("First if block");
	}
	if(Kuzzat != CEO) {
		//false
		System.out.println("Greatest Person in the World2");
	}
	
	int TotalNumber = 100;
	boolean Cybertek = true;
	boolean BestSchool = true;
	
	if (Cybertek == BestSchool) {
		//  true
		TotalNumber +=500;
	}
	if(Cybertek != BestSchool) {
		//false so did not execute but if it did execute then number would be 50
		TotalNumber -=50;
	}
	System.out.println(TotalNumber);
	
	
	/* 1. declare a variable and initialize user age
	 *  2. write a program if the user is eligble to vote for 2020
	 *      vote age is 18
	 * 
	 */
	
	byte age = 78;
	byte voteAge=18;
	if(age >=voteAge) {
		System.out.println("Eleigible to vote");
		System.out.println("Dont vote for Donald Trump");
	}
	
	if (age < voteAge) {
		System.out.println("Not eligible to vote");
	}
	
	
	
}
}
