package day10_ifStatement;

public class Task3 {
public static void main(String[] args) {
	
	int n1 = 100000;
	int n2 = 20000;
	int n3 = 40_000;
	int max = 0;
	
	
	if(n1 > n2 && n1 > n3) {
		max = n1;
		
	}
	if(n2 > n1 && n2 > n3) {
		max = n2;
		
		
	}
	if(n3 > n1 && n3 > n2) {
		
		max = n3;
		
		
	}

	String result = "The maximum number between: "+n1+", "+n2+", "+n3+" is "+ max;
	System.out.println(result);
}
}
