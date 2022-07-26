package day10_ifStatement;

public class statusCode {
public static void main(String[] args) {
	
	int StatusCode =200;
	String finalResult = "Invalid Status Code";
	
	if (StatusCode==200) {
		finalResult= "ok";
	}if(StatusCode==201) {
		finalResult= "Created";
	}if(StatusCode==202) {
		finalResult="Accepted";
	}if (StatusCode==301) {
		finalResult="Moved Permanently";
	}if(StatusCode==303) {
		finalResult="See other";
	}if(StatusCode==304) {
		finalResult="Not Modified";
	}if(StatusCode==307) {
		finalResult="Temporary Redirect";
	}if(StatusCode==400) {
		finalResult="Bad Request";
	}if(StatusCode==401) {
		finalResult="Unauthorized";
	}if(StatusCode==403) {
		finalResult="Forbidden";
	}if(StatusCode==404) {
		finalResult="Not found";
	}if(StatusCode==410) {
		finalResult="Gone";
	}if(StatusCode==500) {
		finalResult="Internal Server Error";
	}if(StatusCode==503) {
		finalResult="Service Unavailable";
	}
	
	System.out.println("The Status code "+StatusCode+" for this browser is: "+finalResult);
	
	
}
}
