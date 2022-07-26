package day10_ifStatement;

public class httpStatus {
public static void main(String[] args) {
	
	int StatusCode = 4004;
	String finalResult = "Invalid Status Available";
	
	if(StatusCode == 200 ) {
		finalResult = "OK";
	}
	if(StatusCode == 201){
		finalResult = "Accepted";
	}
	if(StatusCode == 202) {
		finalResult = "Accepted";
	}
	if(StatusCode == 301) {
		finalResult = "Moved Permanently";
	}
	if(StatusCode == 303) {
		finalResult = "See Other";
	}
	if(StatusCode == 304) {
		finalResult = "Not Modified";
	}
	if(StatusCode == 307) {
		finalResult = "Temporary Redirect";
	}
	if(StatusCode == 400) {
		finalResult = "Bad Request";
	}
	if(StatusCode == 401) {
		finalResult = "Unauthorized";
	}
	if(StatusCode == 403) {
		finalResult = "Forbidden";
	}
	if(StatusCode ==404) {
		finalResult = "Not found";
	}
	if(StatusCode == 410) {
		finalResult = "Gone";
	}
	if(StatusCode == 500) {
		finalResult = "Internal Server Error";
	}
	if(StatusCode == 503) {
		finalResult = "Service Unavailable";
	}
	
	System.out.println("The Status Code "+StatusCode+" is "+finalResult);
	
	
}
}
