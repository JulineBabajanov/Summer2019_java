package day05_Recap;

public class Concatenation {
public static void main(String []args) {
	
	/*String : Represents sequence of characters. It is used for storing text.
	 *       String values are surrenedered by a double quote
	 *       
	 *   Concatenation: Combining and linking things together and creates a string value
	 *     achieved by using  + operator
	 *     
	 *     we can concat any value to String
	 * 
	 */
	String str = "any text goes here";
	
	System.out.println(str);
	
	String str2 = "1";
	System.out.println(str2);
	
	
	String Hello = "Hello World";
	System.out.println(Hello);
	
	String myName = "Cybertek" + " School";
	System.out.println(myName);
	
	String Year = "This is "+ 2019;
	
	System.out.println(Year);
	
	//Example:
	String name = "Juline";
	System.out.println("My name is "+ name);
	
	/*
	 * cucumber is variable $
	 * Tomator is variablename $
	 */
	
	int cucumber = 3;  int tomato = 5;
	System.out.println("Cucumber is $"+ cucumber+ " dollars");
	System.out.println("Tomator is $"+ tomato);
	
	String newStr = "100"+10;
	System.out.println(newStr);
	
	System.out.println(1+2+3);
	System.out.println("1"+(2+3));
	System.out.println(11-3);
	
	System.out.println("Batch 12"+1+2);
	
	System.out.println(2-1+1+"4");
	System.out.println("Batch 12"+ (1+2));
	
	System.out.println(1+"123"+4+5); //112345
	System.out.println("123"+(4+5));
	System.out.println(1+("1"+2));
	
	System.out.println(1+"123"+(4+5)); //11239
	
	
	System.out.println(4+3 - (9+3));
	                  // 7 -   12
	
	System.out.println((1+2)+"3");
	
	//String: char sequences, declared in "" used for storing texts
	//concatenation: linking things together or combining
	
	//System.out.println((1+2)-"3"); compile error
	
	
	
	
	
	
	
	
	
	
	
	
}
}
