package day20_Review;

public class Warm {
public static void main(String[] args) {
	
	/* 1) find the sum of all the numbers between 1 to 1000
	 * 2) find the sum of all even numbers between 1 to 1000
	 * 3) find the sum of all odd numbers between 1 to 1000
	 */
	
	int sum = 0;
	
	for( int i = 1; i<=1000; i++) {
		sum+=i;
	}
	
	
	System.out.println("Sum of all numbers is: "+sum);
	
	
	int sum2 = 0;
	for(int i = 1; i<=1000; i++) {
		if(i%2==0) {
			sum2+=i;
		}
	}
	
	System.out.println("sum of all even numbers "+sum2);
	
	
	int Sum2 = 0;
	
	for(int i = 2; i<=1000; i+=2) {
		Sum2+=i;
	}
	System.out.println(Sum2);
	
	
	//Task3
	
	int sum3=0;
	
	for(int i =1; i<=1000; i+=2) {
		sum3+=i;
	}
	
	System.out.println(sum3);
}
}
