package day09_Review;

public class MoreIfStatement {
public static void main(String[] args) {
	
	int num1=100;
	int num2=300;
	int max=0;
	if(num1<num2) {
		max=num2;
	}
	System.out.println("Maximum number between "+ num1+" and "+ num2+ " is: "+max);
	
	//task 2
	
	int hours=12;
	int minutes=45;
	int seconds=30;
	
	String amOrPm="am";
	
	System.out.println(hours+":"+minutes+":"+seconds+" "+amOrPm); //hours:minutes:seconds am
	
	//tasks 3
	
	int n1=100, n2=500, n3=700;
	int maximum=0;
	
	//in order for n1 be the maximum: n1>n2&& n1>n3
	//in order for n2 be the max:     n2>n1 && n2>n3
	//in order for n3 to be the max:  n3>n1 && n3 >n2
	
	if(n1>n2&& n1>n3) {
		maximum=n1;
	}
	if(n2>n1 && n2>n3) {
		maximum=n2;
	}
	if(n3>n1 && n3 >n2) {
		maximum=n3;
	}
	String conclusion="The maximum number between "+n1+", "+n2+" and, "+n3+" is "+maximum;
			
	System.out.println(conclusion);
	
int statusCode=304;
String finalResult="";
if (statusCode==200) {
	finalResult="ok";
	
}
	if(statusCode==201) {
		finalResult="created";
	}
	if(statusCode==202) {
		finalResult="accepted";
	}
	if(statusCode==301) {
		finalResult="Moved Permanently";
	}
	if(statusCode==303) {
		finalResult="See Other";
	}
	if(statusCode==304) {
		finalResult="Not Modified";
	}
	if(statusCode==307) {
		finalResult="Temporary Redirect";
	}
	if(statusCode==400) {
		finalResult="Bad Request";
	}
	if(statusCode==401) {
		finalResult="Unauthorized";
	}
	if(statusCode==403) {
		finalResult="Forbidden";
	}
	if(statusCode==404) {
		finalResult="Not found";
	}
	if(statusCode==410) {
		finalResult="Gone";
	}
	if(statusCode==500) {
		finalResult="Internal Server Error";
	}
	if(statusCode==503) {
		finalResult="Service Unavailable";
	}
		
	
	String EndingResult="The Final Status code is: "+statusCode+ " with the result ending to be " + finalResult;
	System.out.println(EndingResult);
	
	//task 5
	/* number to be positive: number > 0
	 * number to be negative: number < 0
	 * number to be zero: number == 0
	 * 
	 */
	
	int number=-5000;
	String str="zero";
	if (number >0) {
		str="positive";
		
	}
	if(number<0) {
		str="negative";
		
	}
	
	System.out.println(number+" is "+str);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
