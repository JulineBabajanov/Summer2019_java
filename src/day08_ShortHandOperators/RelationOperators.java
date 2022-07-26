package day08_ShortHandOperators;

public class RelationOperators {
public static void main (String[]args) {
	
	/* Relational Operators: returns boolean expressions
	 * > : greater than the other number that is given
	 * >= : greater than or equal
	 * < : less than
	 * <= : less than or equal
	 * == : equal
	 * = : assigning to a variable
	 * != : not equal
	 * ! : Exclamation mark in java means the logical opposite
	 */
	System.out.println(10 > 9); //true
	boolean resultA = 10 > 9;
	System.out.println(resultA); //true
	
	System.out.println(10 >= 9); //true
	
	boolean resultB = 10 >= 9;
	System.out.println(resultB); // true
	
	boolean resultC = 10 <= 9;
	System.out.println(resultC); //false
	
	boolean resultD = 1100 < 1200; 
	System.out.println(resultD); //true
	
	boolean resultE = 1000 < 1000;
	System.out.println(resultE); //false
	
	boolean resultF = 1000 <= 1000;
	System.out.println(resultF); // true
	
	boolean resultG = 19 == 19;
	System.out.println(resultG); //true
	
	boolean resultH = 20 != 20;
	System.out.println(resultH); //false
	
	boolean A = true == !false;  //not false == true
	System.out.println(A);//true
	
	boolean AA = ! false;
	System.out.println(AA); //true
	
	boolean B = !true;
	System.out.println(B); //false
	
	/*in java true == true, false == false
	 * ! false == true, ! true == false
	 * 
	 * !false does not equal to !true
	 * 
	 */
	
	boolean C = !false != !true;
	System.out.println(C);//true
	
	boolean D = true == !false;
	System.out.println(D); //true
	
	boolean E = !(!true);
	System.out.println(E);// true 
	
	
	boolean F = 10 > 9 == 9<10;
	System.out.println(F); //true == true
	
	// ! = opposite
	boolean g = false;
	System.out.println(!g);
	
	boolean h = "Batch 12" == "Batch13"; 
	System.out.println(h); //false
	
	System.out.println("batch12"=="Batch12");//false bc of case sensitivity
	
	System.out.println("cybertek"!="club");//true
	
	System.out.println("Kuzzat" == "bad guy"); //false
	
	System.out.println("Assistant teachers in class" != "Awesome");
	
	int num = 198;
	System.out.println(num%2); //even bc gives a zero
	
	byte ByteNum = 30;
	int INum = 20;
	int hello = INum+=ByteNum;
	System.out.println(hello);
}
}
