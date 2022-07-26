package day10_ifStatement;

public class tas03 {
public static void main(String[] args) {
	
	int n1 = 10000, n2 = 5000000, n3 = 700000;
	int maximum = 0;
	String result = "The maximum number between " +n1+", "+n2+", "+n3+" is: "+maximum;
	
	
	if (n1 > n2 && n1 > n3) {
		maximum+=n1;
		
	}
	
	if(n2 > n1 && n2 > n3) {
		maximum+=n2;
	
		
	}
	if(n3 > n1 && n3 > n2) {
		maximum+=n3;
		
	}
	
	System.out.println("The maximum number between " +n1+", "+n2+", "+n3+" is: "+maximum);
}
}
