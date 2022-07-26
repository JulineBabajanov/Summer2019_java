package day10_ifStatement;

public class single_IfStatement {
public static void main(String[] args) {
	
	/*single if:
	 * if(boolean expression){
	 *        //A
	 *        }
	 * 
	 */
	
	if(9>8) {
		System.out.println("9 is greater than 8");
	}
	
	if(9<8) {
		System.out.println("8 is greater than 9");
	}
	System.out.println("Test completed"); //does not belong to any if block
	
	
	
	
	
	//Task01:
	
	int num1 = 500;
	int num2 = 100;
	int max = 0; //local variables needs to be initialized before use
	
	if(num1 > num2) { //means that num1 is greater that num2
		//false so wont be executed
		max = num1;
		
	}
	if (num2 > num1 ) {
		max = num2;
	}
	if(num1==num2) {
		max = num2; 
		System.out.println("both numbers are equal");
	}
	System.out.println("The Maximum number between "+num1+" and "+num2+" is "+max);
	
	
	
	int hours = 12;
	int minute = 24;
	int second = 33;
	String amOrPm = "PM";
	System.out.println(hours+":"+minute+":"+second+" "+amOrPm);
	
	//Task 03
	
	int n1 = 100;
	int n2 = 2000;
	int n3 = 300;
	int maximum = 0; //local variables needs to be initialized before use
	
	if (n1 > n2 && n1 > n3) {
		maximum = n1;
		System.out.println("n1 is bigger");
	} if( n2 > n1 && n2 > n3) {
		maximum = n2;
		System.out.println("n2 is bigger");
	}if(n3 > n1 && n3 > n2) {
		maximum = n3;
		
	}
	String conclusion = "The Maximum number between "+n1+", "+ n2+", "+n3+" is "+maximum+".";
	  System.out.println(conclusion);
	
	
	int A;
	if(true) {
	A=12;
	}
	System.out.println(A);
	  
	
	double B=0;
	if(true) {
		B=100;
	}
	System.out.println(B);
	
			
	
	
}
}
