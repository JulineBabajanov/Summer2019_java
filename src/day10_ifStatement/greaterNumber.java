package day10_ifStatement;

public class greaterNumber {
public static void main (String []args) {
	
	int num1 = 20;
	int num2 = 30;
	int maxNum = 400;
	String max = "Largest Number";
	
	if (num1 < num2 && num1 <maxNum ) {
		System.out.println("max number is: "+maxNum);
	}if(num2 < num1 && num2 < maxNum) {
		System.out.println("max number is: "+maxNum);
	}if(maxNum > num1 && maxNum > num2) {
		System.out.println(maxNum +" is max number");
	}
	
	
	
	
}
}
