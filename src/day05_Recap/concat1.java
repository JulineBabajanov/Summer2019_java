package day05_Recap;

public class concat1 {
public static void main (String []args) {
	
	/* String: represents the sequence of characters. Used for storing texts.
	 *       String values are surrendered by a double quote.
	 *       
	 * Concatenation: combining, linking things together ==> creates a String value with a plus sign +
	 * We can concat any value to String 
	 */
	String str = "any text goes here";
	System.out.println(str);
	
	String str2 = "1";
	System.out.println(str2);
	String Hello = "Hello World";
	System.out.println("Hello");
	
	String myName = "Cybertek"+ "School";
	System.out.println(myName);
	
	String Year = "This is "+ 2019;
	System.out.println(Year);
	
	String name = "Juline";
	System.out.println("My name is "+name);
	
	/*
	 * cucumber is variable $
	 * Tomato is variable name $
	 */
	
	
	int cucumber = 3;   int tomato = 5;
	System.out.println("Cucumber is $"+cucumber+'$');
	System.out.println("Tomato is "+'$'+tomato);
	
	String newStr = "100"+10;
	
	System.out.println(newStr);
	
	System.out.println(1+2+3);
	System.out.println(2-1+1+"4");
	System.out.println("Batch 12"+(1+2));
	System.out.println(1+"123"+4+5);
	System.out.println("123"+(4+5));
	System.out.println(1+("1"+2));
	
	/*concatenation is combining or linking things together
	 * 
	 */
	
	System.out.println();
	
	String BookName = "I like the book called \'Game of throne\'";
	System.out.println(BookName);
	
	String MyInfo = " My name is: \n\tCybertek";
	System.out.println(MyInfo);
	System.out.println('3'+3);
}
}
