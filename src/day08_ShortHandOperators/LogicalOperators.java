package day08_ShortHandOperators;

public class LogicalOperators {
public static void main(String[] args) {
	
	/*
	 *   && ===> true && true == true, if both conditions are true will return true
	 *   || true or false ==> true
	 *   true or true ==> true
	 *   false or false ==> false
	 *   if both conditions are false it will return false, other wise return true
	 * 
	 * 
	 */
	
	boolean ResultA= 9 ==0 && "Muhtar"=="good";
	                 // false      false ==>false
	                		  System.out.println(ResultA);
	                		  
	boolean ResultB = 8>5 && 7== (8-2+1);
	System.out.println(ResultB);
	
	boolean ResultC = !false != true && !false == !(!true);
	   System.out.println(ResultC);
	
	   
	   boolean A = "Monday"=="Funday" || 6==6;
	   System.out.println(A);
	   
	   boolean B = true ||false;
	   System.out.println(B);
	   
	   boolean C = !(8>5)|| ("Today"!="friday");
	   //        !ture    ||  !true !=
	   
	   boolean D = true && true || false; //true
	   
	   boolean E = !(7>5 && 6 !=5) && (9>5 || 10 >4);
	          //      false             true
	   //
	   System.out.println(E);
	
}
}
