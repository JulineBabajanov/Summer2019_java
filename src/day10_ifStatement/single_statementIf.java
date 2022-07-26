package day10_ifStatement;

public class single_statementIf {
public static void main(String[] args) {
	
	
	// single if: 
	//if(boolean expression){
	////block statement
	 //}
     
	
	
	if(9>8) {
		
		System.out.println("9 is greater than 8");
	
	}	
	
	
	if(9<8) {
		System.out.println("8 is greater than 9"); //condition is false so won't print out statement
	}
	
	System.out.println("Test completed"); // does not belong to any if block
	
	
	int num1 = 20, num3 = 30;
	int max = 0;
	if(num1<num3) {
		max += num3;
		System.out.println(max+" is greatest");
	}
	
	int num4 = 40, num5 = 100;
	int max1 = 0;
	if(num4<num5) {
		max1 += num5;
		System.out.println(max1+ " is greater");
	}
	
	
	
	
	
	
	
	
	
}
}
