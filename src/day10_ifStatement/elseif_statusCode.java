package day10_ifStatement;

public class elseif_statusCode {
public static void main(String[] args) {
	
	int StatusCode = 4004;
	String result = "";
	
	
	if(StatusCode==200) {
		result="OK";
	}else if(StatusCode==201) {
		result="Created";
	}else if(StatusCode==202) {
		result="Accepted";
	}else if(StatusCode==301) {
		result="Moved Permanently";
	}else if(StatusCode==303) {
		result="See other";
	}else if(StatusCode==304) {
		result="Not Modified";
	}
	else if(StatusCode==307) {
		result="Temporary Redirect";
	}else if(StatusCode==400) {
		result="Bad request";
	}else if(StatusCode==401) {
		result="Unauthorized";
	}else if(StatusCode==403) {
		result="Forbidden";
	}else if(StatusCode==404) {
		result="Not found";
	}else if(StatusCode==410) {
		result = "Gone";
	}else if(StatusCode==500) {
		result="Internal Server Error";
	}else if(StatusCode==503) {
		result="Service Unavailable";
	}else {
		result="Not an option";
	}
	
	System.out.println("Status Code "+StatusCode+" is the result of "+result);
	
	//Task02:
	
	int time = 24;
	
	if(time >=0 && time <=12) {
		System.out.println("Good morning");
	}else if(time >=13 && time <=15) {
		System.out.println("Good afternoon");
	}else if(time >15 && time <=23) {
		System.out.println("Goodnight");
	}else {
		System.out.println("Wrong time");
	}
	
	int num1 = 0, num2 = 20, num3 = 200;
	
	if(num1 > num2 && num1 > num3 ) {
		System.out.println(num1+" num1 is the bigger number out of "+num1+", "+num2+", "+num3);
	}else if(num2 > num1 && num2 > num3) {
		System.out.println(num2+" num2 is the bigger number out of "+num1+", "+num2+", "+num3);
	}else if (num3 > num1 && num3 > num2) {
		System.out.println(num3+" num3 is the bigger number out of "+num1+", "+num2+", "+num3);
	}else if(num3==num2 && num3 > num1) {
		System.out.println(num3+" and "+num2+" are the bigger numbers");
	}
	else if( num3 == num1 && num3 > num2) {
		System.out.println(num3+" and "+num1 +" are the bigger numbers");
	}
	else if(num2 == num1 && num2 > num3) {
		System.out.println(num1+" and "+num2+" are the bigger numbers");
	}else {
		System.out.println("All are equal.");
	}
	
	
	
	
}
}
