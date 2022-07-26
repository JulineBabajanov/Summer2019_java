package day08_ShortHandOperators;

public class logicalOperator {

	
	public static void main(String[] args) {
		
		
		boolean ResultC = !false != true && !false ==!(!true);
		//   true is not equal to true &&    true == !false
		//            false             &&          true   //false
		
		
		boolean A = "Monday" =="Fun-day" || 6==6;
		System.out.println(A);
		
		
		boolean B = true || false;
		System.out.println(B);
		
		
		boolean C = !(8>5) || ("Today" != "friday");
		System.out.println(C);
		
		
		boolean D = true && true || false;
		
		System.out.println(D);
		
		boolean E = !(7>5 && 6 !=5) && ( 9>5 || 10 >4);
		//             f        f         t      t
		System.out.println(E);
		
		
		
		
	}
	
	
	
	
	
}
