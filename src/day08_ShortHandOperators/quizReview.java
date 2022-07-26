package day08_ShortHandOperators;

public class quizReview {
public static void main(String[] args) {
	
	/*Assesment quiz 02:
	 * 
	 */
	
	//Question 1:
	int ivar = 100;
	double dvar = 200;
	float fvar = 300;
	//ivar = fvar;
	dvar = fvar;

	String str3 = "Result A"+7*2;
	System.out.println(str3);
	
	String str4 = "Result A"+1+2;
	System.out.println(str4);
	
	//Question 4
	
	long L = 30L;
	long L2 = (short) L;
	System.out.println(L2);
	
	double J=4, K, P;
	System.out.println(J);
	
	
}
}
