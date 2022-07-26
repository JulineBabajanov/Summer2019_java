package day10_ifStatement;

public class Task05_Number {
public static void main (String[]args) {
	
	int num = -10 ;
	String print = "";
	if(num>0) {
		print = "positive";
	}
	if(num<0) {
		print = "negative";
	}
	if(num == 0) {
		print = "zero";
	}
	
	System.out.println("The number "+num+" is "+print);
	
	
}
}
