package day10_ifStatement;

public class task1 {
public static void main(String[] args) {
	
	int hour = 10;
	int minute = 24;
	int seconds = 33;
	String amOrpm = "PM";
	
	if(hour <25 && minute < 61 && seconds < 61) {
	
	System.out.println(hour+":"+minute+":"+seconds+" "+amOrpm);
	}
	
	if(hour > 24 || minute > 60 || seconds > 60) {
		System.out.println("Invalid time");
	}
	
	
	
	
}
}
