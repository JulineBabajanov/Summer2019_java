package day10_ifStatement;

public class Task_5 {
public static void main(String[] args) {
	
	/* number to be positive : number >=0
	 * number to be negative : number <0
	 * number to be zero : number==0
	 */
	
	int number = 0;
	String str = "";
	
	if(number > -1) {
		str = "positive";
	}
	if(number < 0) {
		str = "negative";
	}
	if(number ==0) {
		str = "zero";
	}
	
	System.out.println("The number "+number+" is "+str);
	
}
}
