package day10_ifStatement;

public class Task05 {
public static void main(String [] args) {
	
	int number = 0;
	String str = "zero";
	
	/*number to be positive : number > 0
	 * 
	 */
	if(number>0) {
		str = "positive";
		System.out.println(number+" is "+str);
	}if(number<0) {
		str="negative";
		System.out.println(number+" is "+str);
	}
	System.out.println(number+" is "+str);
	
	
	
	int number2 = 0;
	
	if (number2 > 0) {
		System.out.println("positive");
	}if(number2 < 0) {
		System.out.println("negative");
	}if(number2==0) {
		System.out.println("Zero");
	}
	
}
}
