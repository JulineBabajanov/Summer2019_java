package day08_ShortHandOperators;

public class Relational_Operators {
public static void main(String[] args) {
	
	/*  > : greater than
	 *  >=  greater than or equal
	 *  <   less than
	 *  <=   less than or equal
	 *   ==   equal
	 *   !=   not equal
	 *   = assign a variable
	 *   ! Exclamation mark in java means the logical opposite
	 * 
	 */
	System.out.println(10 > 9);
	boolean result = 10>9;
	System.out.println(result);
	
	boolean resultB = 10 >= 9;
	System.out.println(resultB);
	
	boolean resultD = 1100 < 1200;
	System.out.println(resultD);
	
	boolean resultE = 1000 < 1000;
	System.out.println(resultE);
	
	boolean resultF = 1000<= 1000;
	System.out.println(resultF);
	
	// ==
	boolean resultG = 19 == 19;
	System.out.println(resultG);
	
	// !
	boolean resultH = 20!=20;
	System.out.println(resultH);
	
	boolean A = true == !false; //true
	System.out.println(A);
	
	boolean B = !true;
	System.out.println(B); // false
	
	/*in java true == true and false == false
	 * !false equal to true, !true equal to false
	 * so therefore:
	 * !false does not equal !true
	 * 
	 * 
	 */
	boolean C = !false != !true; //true
	System.out.println(C);
	boolean D = true == !false;
	System.out.println(D);
	
	boolean E = !(!true);  //!true = false !(!true)==true
	System.out.println(E);
	
	boolean F = 10 > 9 == 9 < 10;
	System.out.println(F);
	boolean g = false;
	System.out.println(!g);
	System.out.println(!true==false); // false ==false ==true
	boolean h = "Batch12"=="Batch13";
	System.out.println(h);
	System.out.println("batch12"=="Batch12"); //false due to case sensitivity
	System.out.println("cybvertek"!="club");
	System.out.println("Kuzzat"=="bad guy");
	System.out.println("Assistant teacher in class"=="Awesome");
	int num = 198;
	System.out.println(num%=2);
	byte a = 30;
	int b =b+=a; //must give value to local variable
	
	
}
}
