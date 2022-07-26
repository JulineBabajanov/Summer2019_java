package day08_ShortHandOperators;

public class LogicalOper {
public static void main(String[] args) {
	
	/*   && : And logic .... true & true     other wise false
	 *   || : or  logic .... 
	 *   
	 *             true || false == > true
	 *             true || true == > true
	 *             false || false == > false
	 *             if both conditions are false then will return false otehrwise will return true for OR logic.
	 */
	
	
	boolean ResultA = 9 ==0 && "Muhtar" == "good";
	//                 false            false / false
	System.out.println(ResultA);
	
	boolean ResultB = 8> 5 && 7 == (8-2+1);
	System.out.println(ResultB);
	
	boolean ResultC = !false !=true && !false == !(!true);
	                  // true  true       true       true
	               //        false           true
	
	System.out.println(ResultC);
	
	boolean B = true || false;
	System.out.println(B);
	
	boolean C = !(8 > 5) || !("Today" != "friday");
	
	            //!true           !true
	System.out.println(C);
	
	// || && :
	boolean D = true && false || false;
	System.out.println(D);
	boolean E = !(7> 5 && 6 != 5) && (9 >5 || 10 > 4);
	//           true       true          true   true
	System.out.println(E);//false
	
	
	
	
}
}
