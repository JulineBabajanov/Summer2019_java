package day10_ifStatement;

public class task4 {
public static void main(String[] args) {
	
	
	int StatusCode = 4044;
	String finalResult = "Invalid Status Code";
	
	if(StatusCode == 201) {
		finalResult = "Created";
	}
	
	if(StatusCode == 200) {
		finalResult = "OK";
	}
	if(StatusCode == 202) {
		finalResult= "Accepted";
	}
	if(StatusCode == 301 ) {
		finalResult="Moved Permanently";
	}
	if(StatusCode == 303) {
		finalResult= "See Other";
	}
	if(StatusCode==304) {
		finalResult="Not Modified";
	}
	if(StatusCode==307) {
		finalResult =" Temporary Redirect";
	}
	if(StatusCode==400) {
		finalResult="Bad Request";
	}
	if(StatusCode==401) {
		finalResult="Unauthorized";
	}
	if(StatusCode==403) {
		finalResult="Forbidden";
	}
	if(StatusCode==404) {
		finalResult="Not Found";
	}
	if(StatusCode==410) {
		finalResult="Gone";
	}
	
	if(StatusCode==500) {
		finalResult="Internal Server Error";
	}
	if(StatusCode==503) {
		finalResult="Service Unavailable";
	}
	System.out.println("Status code "+StatusCode+": "+finalResult);
}
}
