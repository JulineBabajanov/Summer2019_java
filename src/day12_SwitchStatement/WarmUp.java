package day12_SwitchStatement;

public class WarmUp {
public static void main(String[] args) {
	
	int n1=6, n2=4, n3=2;
	
	
	if (n1 == n2 && n1 != n3 ) {
		System.out.println("n1 & n2 are equal");
	}else if (n2 == n3 && n2!=n1) {
		System.out.println("n2 and n3 are equal");
	}
	else if (n3==n1&& n1!=n2) {
		System.out.println("n3 and n1 are equal");
	}else if(n1==n2 && n2==n3 && n1==n3) {
		System.out.println("all are equal");
	}
	else {
		System.out.println("none are equal");
	}
	
	//second solution:
	int num1=5, num2=5, num3=5;
	
	if(num1==num2 && num2==num3 ) {
		System.out.println("all are equal");
	}else if(num1==num2) {
			System.out.println("num1 and num2 are equal");
		}else if(num2==num3) {
			System.out.println("num2 and num3 are equal");
		}else if(num1==num3) {
				System.out.println("num1 and num3 are equal");
		}else  {
			System.out.println("none of them are equal");
		}
	
	
	
		}
		}
	
