package day20_Review;

public class WarmUp {
 public static void main(String[] args) {
	

	/*1.)find the sum of all the numbser between 1 to 1000
	 * .)1+1000/2*1000 = 500500
	 * 2.)find the sum of all even numbers between 1 to 1000
	 * 3.)find the sum of all odd numbers between 1 to 1000
	 * 
	 * 4.)write a program that asks user to enter number 10 times
	 * 1. find the sum of those 10 inputs
	 * 1. find the max number and the min number
	 * 5.) print all lower case and uppercase alphabets from the SCII table
	 * 
	 * for(inititalization, condition, iterator)
	 */
      int sum1=0;
	for(int i = 1; i<=1000; i++) {
		
		sum1+= i;
	}
	
	System.out.print("sum of all nums: "+sum1);
	System.out.println();
	//task 2
	int sum2=0;
	for(int i = 1; i<=1000; i++) {
	    if(i%2==0) {
	    	sum2 += i;
	}
	    System.out.print(" "+sum2);
	}
	System.out.println();
	
	int Sum2=0;
	for(int i=2; i<=1000; i+=2) {
		Sum2+=i;
	}
	
	System.out.println("sum of all even numbers: "+Sum2);
	System.out.println();
	//TASK3 
	
	int sum3=0;
	for(int i=1;i<1000;i++) {
		if(i%2 ==1) {
			sum3+=i;
		}
	}
	System.out.print("sum of odd numbers: "+sum3);
	System.out.println();
	
	int Sum3 = 0;
	for(int i = 1; i <= 1000; i+=2) {
		Sum3+=i;
	}
	System.out.println("sum of odd numbers: "+Sum3); //sum of all odd numbers
	
	
	
	
	
	
	
}
}
