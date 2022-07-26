package day09_Review;

public class Review {
public static void main(String[] args) {
	
	
	/*relational:
	 * > : greater
	 * >=: greater or equal
	 * < : less
	 * <=: less than or equal
	 * ==: equal
	 * != : not equal
	 * 
	 * logical operators:  &&: and || or
	 * 
	 */
	
	System.out.println('Z' > 'A'); //True
	System.out.println('Z' >= 'A');//True
	System.out.println('a'>='A'); //true
	System.out.println('a'<'A');//false
	System.out.println('A'<= 'A');//true
	System.out.println('A'<='a'); //true
	
	System.out.println( true == true && false != true);
	//                  true         && true ==> true
	
	
	System.out.println( true != true || false == true); // false
	System.out.println("Monday"=="Funday" || true == !false);//true bc as long as one condition is true then answer is true
	
	
	
}
}
