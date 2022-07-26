package day20_Review;

public class warm_up {
public static void main(String[] args) {
	
	/* 1. find the sum of all the numbers between 1 to 1000
	 * 2. find the sum of all the even numbers between 1 to 1000
	 * 3. find the sum of all the odd numbers between 1 to 1000
	 * for(initialization,; condition; iterator)
	 */
	//task1
	int sum = 0;
	for (int i = 1; i<=1000; i++) {
		sum+=i;
	}
	
	System.out.println("Sum of all numbers: "+sum);
	
	int sum2 = 0;
	for(int i =1; i <=1000; i++) {
		if(i%2==0) {
			sum2+=i;
		}
	}
	System.out.println("sum of all even nums: "+sum2);
	
	int Sum2 = 0;
	for(int i = 2; i <=1000; i+=2) {
		Sum2 += i;
	}
	
	System.out.println(Sum2);
	
	//task3
	
	int sum3 = 0;
	for(int i = 1; i <1000; i++) {
		if(i %2 ==1) {
			sum3 +=i;
		}
	}
		
		System.out.println(sum3);
		
		
		
	int Sum3 = 0;
	for (int i = 1; i<=1000; i+=2) {
		Sum3+=i;
	}
		
		System.out.println(Sum3);
		
		
		
		
		
	
}
}
