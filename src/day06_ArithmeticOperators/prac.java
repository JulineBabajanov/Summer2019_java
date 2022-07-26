package day06_ArithmeticOperators;

public class prac {
public static void main(String[] args) {
	
	int a = 10;
	int b = 15;
	//System.out.println(a+"\n"+b);  //a = 10, b = 15
	
	//a = a+b;  //a = 25
	//b = a-b;  // b = 10
	//a = a-b;
	//System.out.println(a+"\n"+b); // a = 15 b = 10
	a = b-a; //5
	b = a+a; //10
	System.out.println(b); //10
	a = b+a;
	System.out.println(a); //15
	
}
}
