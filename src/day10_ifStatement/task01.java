package day10_ifStatement;

public class task01 {
public static void main(String[] args) {
	
	
	int num1 = 100; 
	int num2 = 100;
	int max = 0;
	
	if(num1 > num2 ); {
		max = num1;
	
	}
	if(num2 > num1) {
		max=num2;
	}
	if(num1==num2) {
		max= num1;
		System.out.println("Both numbers are equal");
	}
	System.out.println("The maximum number between: "+num1+" and "+num2+" is "+max);
	
	
	
	
	
}
}
