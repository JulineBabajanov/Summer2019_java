package day12_SwitchStatement;

public class Warm {
public static void main(String[] args) {
	
	
	int n1 = 4, n2 = 5, n3 = 6;
	
	if (n1 == n2 && n1!=n3 ) {
		System.out.println(n1 +" n1 and n2 "+n2+ " are equal");
	}else if(n1 == n3 && n1 != n2) {
		System.out.println(n1 +" n1 and n3 "+n3+ " are equal");
	}else if(n2 == n3 && n2 !=n1) {
		System.out.println(n2 +" n2 and n3 "+n3+ " are equal");
	}else if(n1 ==n2 && n2 == n3 && n1 == n3) {
		System.out.println("All are equal");
	}else {
		System.out.println("None are equal");
	}
	
	//second solution
	
	int num1 =1, num2 = 9, num3 = 9;
	
	if (num1 == num2 && num2 == num3 ) {
		System.out.println("All are equal");
	}else if(num1 == num2) {
		System.out.println("num1 and num2 are equal");
	}else if(num2 == num3) {
		System.out.println("num2 and num3 are equal");
	}else if(num1 == num3) {
		System.out.println("num1 and num3 are equal");
	}else {
		System.out.println("None are equal");
	}
	//third way. nested if condition
	
	int A = 10, B = 20, C = 30;
	
	if(A==B && B==C) {
		System.out.println("All are equal");
	}else {
		
	}
	System.out.println("\n\n\n");
	int grade = 110;
	
	if(grade>=0 && grade <=100) {
		if(grade >=90 && grade <= 100) {
			System.out.println("A");
		}else if(grade <90 && grade >=80) {
			System.out.println("B");
		}else if(grade >=70 && grade <80) {
			System.out.println("C");
		}else if(grade >=60 && grade < 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
	else {
		System.out.println("Invalid number");
	}
	
	
	
	
	
	
	
}
}
