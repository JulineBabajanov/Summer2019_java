package day10_ifStatement;

public class greaterNum {
public static void main (String [] args) {
	
	int n1 = 50, n2 = 50, n3 = 500;
	
	if (n1 > n2 && n1 > n3) {
		System.out.println(n1+" is the bigger number");
	}else if (n2>n1 && n2 > n3) {
		System.out.println(n2 +" is the greater number");
	}else if(n3 >n2 && n3> n1) {
		System.out.println(n3 +" is the bigger number");
	}else if(n3==n2 && n3>n1) {
		System.out.println(n3+" and "+n2+" are the bigger number");
	}else if(n2==n1 && n2 >n3) {
		System.out.println(n2+" and "+n1+" are the bigger numbers");
	}else if(n3==n1 && n3 > n2) {
		System.out.println(n3+" and "+n1+" are the bigger numbers");
	}else {
			System.out.println("All of them are equal");
		}
	
	
	
	
	
}
}
