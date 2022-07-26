package day10_ifStatement;

public class statusCode1 {

public static void main(String[] args) {
	
int StatusCode = 202;
String result = "";

if(StatusCode==200) {
	result = "ok";
}if(StatusCode==201) {
	result = "Created";
}if(StatusCode==202) {
	result = "Accepted";
}if(StatusCode==301) {
	result="Moved Permanently";
}if(StatusCode==303) {
	result="See Other";
}if(StatusCode==304) {
	result="Not Modified";
}if(StatusCode==307) {
	result="Temporary Redirect";
}if(StatusCode==400) {
	result="Bad Request";
}if(StatusCode==401) {
	result = "Unauthorized";
}if(StatusCode==403) {
	result="Forbidden";
}if(StatusCode==404) {
	result="Not Found";
}if(StatusCode==410) {
	result="Gone";
}if(StatusCode==500) {
	result="Internal Server Error";
}if(StatusCode==503) {
	result="Service Unavailable";
}
	
	System.out.println("The status code "+StatusCode+" is: "+result);
	
}
	
}
