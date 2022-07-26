package day10_ifStatement;

public class task03 {
public static void main(String[] args) {
	
	int n1 = 1000, n2 = 5000, n3 = 900;
	int max = 0;
	if( n1 > n2 && n1 >n3) {
	max += n1;	
	}
	
	if(n2 > n1 && n2 > n3) {
		max += n2;
	}
	
	if(n3 > n1 && n3 > n2) {
		max+=n3;
	}
	String conclusion = "The numbers between "+n1+" and "+n2+" and "+n3+" the maximum number "+max +" is greatest number";
	System.out.println(conclusion);
}
}
