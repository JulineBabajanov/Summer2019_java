package day08_ShortHandOperators;

public class RelationOperator {
public static void main(String[] args) {
	
	/* 
	 * Relational operators return boolean expression
	 * >
	 * >=
	 * <
	 * <=
	 * == equal
	 * != not equal
	 * ! Exclamation mark in java mean sthe logical opposite
	 */
	
	System.out.println( 10 > 9);
	boolean resultA = 10 > 9;
	System.out.println(resultA);
	
	System.out.println(10 >= 9);
	
	boolean resultC = 10 <= 9;
	System.out.println(resultC);
	
	boolean resultD = 1000 <= 1000;
	System.out.println(resultD);
	
	// ==
	System.out.println( 19 == 19);
	
	boolean resultG = 20 == 19;
	System.out.println(resultG);
	
	boolean resultH = 20 != 20;
	System.out.println(resultH);
	
	boolean A = true == !false;
	System.out.println(A);
	
	boolean B = !true;
	System.out.println(B);
	
	/*in java true == true, false == false
	 * !false equal to true, !true equal to false
	 * so there fore:
	 * !flase does not equal !true
	 * 
	 */
	
	boolean C = !false != !true;
	System.out.println(C);
	
	boolean D  = true == ! false;
	System.out.println(D);
	
	boolean E = !(!true);
	System.out.println(E);
	
	// ! (not)
	
	boolean g = false;
	System.out.println(!g);
	
	
	int z = 198;
	System.out.println(198%2);
	
	byte a = 30;
	int b = 10;
	 b = b+= a;
	
	System.out.println(b); //
	
	String str3 = "Result A" + 7 % 2;
	System.out.println(str3);
	

	
	
}
}
