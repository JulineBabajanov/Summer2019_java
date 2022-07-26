package day10_ifStatement;

public class else_if {
public static void main(String[] args) {
	
	/*  if
	 * else if
	 * else
	 * 
	 */
	
/*	if(true) {
		System.out.println("if block");
	}else if(false) {
		System.out.println("else if block");
	}else {
		System.out.println("else block");
	}
	
	
	/*  90<=Grade 
	 *  80<=Grade <90
	 *  70<=Grade <80
	 *  60<=Grade <70
	 *  else F
	 *  
	 *  
	 */
	/*
	
	int grade = 50;
	
	if(grade >=90 && grade <101) {
		System.out.println("You have earned an A");
	} else if(grade >=80 && grade <90) {
		System.out.println("You have earned a B");
	}else if(grade >=70 && grade <80) {
		System.out.println("You have earned a C");
	}else if(grade >=60 && grade <70) {
		System.out.println("You earned a D");
	}else if(grade >49 && grade<60) {
		System.out.println("You failed with a: F");
	}else
	System.out.println("Not a valid answer");
	
	*/
	
	/*
	int StatusCode =401;
	
	if(StatusCode == 200) {
		System.out.println("OK");
	}else if(StatusCode==201){
		System.out.println("Created");
	}else if(StatusCode==202) {
		System.out.println("Accepted");
	}else if(StatusCode==301) {
		System.out.println("Moved Permanently");
	}else if(StatusCode==303) {
		System.out.println("See other");
	}else if(StatusCode==304) {
		System.out.println("Not Modified");
	}else if(StatusCode==307) {
		System.out.println("Temporary Redirect");
	}else if(StatusCode==400) {
		System.out.println("Bad Request");
	}else if(StatusCode==401) {
		System.out.println("Unauthorized");
	}else if(StatusCode==403) {
		System.out.println("Forbidden");
	}else if (StatusCode==404) {
		System.out.println("Not found");
	}else if(StatusCode==410) {
		System.out.println("Gone");
	}else if(StatusCode==500) {
		System.out.println("Internal Server Error");
	}else if(StatusCode==503) {
		System.out.println("Service Unavailable");
	}else {
		System.out.println("We ran into a problem");
	}
	*/
	
	int time = -13;
	
	if(time>=0 && time <=12) {
		System.out.println("Goodmorning!!");
	}else if(time >=13 && time <=15) {
		System.out.println("Good Afternoon");
	}else if(time >=16 && time <=23) {
		System.out.println("Goodnight!");
	}else {
		System.out.println("Error Code: 404");
	}
	
	
	int num1 = -1003;
	int num2 = -1003;
	int num3 = -1003;
	
	if(num1>num2 && num1 >num3) {
		System.out.println(num1+" is biggest number out of "+num1+" "+num2+" "+num3);
	}else if(num2>num1 && num2 > num3) {
		System.out.println(num2+" is the largest number out of "+num1+" "+num2+" "+num3);
	}else if (num3 > num1 && num3 > num2) {
		System.out.println(num3+" is the largest number out of "+num1+" "+num2+" "+num3);
	}else if(num3==num2 && num3>num1) {
		System.out.println(num3+" and "+num2+" are equal and the largest numbers");
	}else if(num3==num1 && num3>num2) {
		System.out.println(num3+" and "+num1+" are equal and the largest numbers");
	}else if(num2==num1 && num2>num3) {
		System.out.println(num2+" and "+num1+" are equal");
	}else {
		System.out.println("all are equal numbers");
	}
	
	
}
}
