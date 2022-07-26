package day08_ShortHandOperators;

public class LogOper {
public static void main(String[] args) {
	
	boolean ResultA = 9==0 && "Muhtar" == "Good";
	
	System.out.println(ResultA);//false
	
	boolean ResultB = 8 > 5 && 7 == (8-2+1);
	//                true      true
	System.out.println(ResultB); //true
	
	boolean ResultC = !false !=true && ! false == !(!true);
	System.out.println(ResultC);
	
	boolean A = "Monday"=="Fun-day" || 6==6;
	System.out.println(A);
	
	boolean B = true || false;
	System.out.println(B);
	
	boolean C = !(8>5) || !("Today" != "friday");
	
	System.out.println(C);
	
	boolean D = true && true || false;
	System.out.println(D);
	
	boolean E = !(7>5 && 6 !=5) && (9>5 || 10 >4);
	//                              true
	System.out.println(E);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
