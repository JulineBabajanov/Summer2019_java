package day04_variables2;

public class PrimativeDataTypes2 {
public static void main (String[]args) {
	
/*
 *Primatives: byte, short, int, long, float, double, boolean, char	
 *
 *boolean : delcared only as a true or false
 *takes all boolean expressions and returns true or false
 *
 *
 *char: ASCII Table: is a universal system that is recognized by all computers. each characters in ASCI 
 *table have a corresponding number to represent it. (American Standard Code for Information Inter charge)
 * www.asciitable.com
 * char is declared with in the single quote ' '; and only single characters allowed in single quote.
 * 
 * '' is a must when you give character value
 */
	
	boolean result = true;
	boolean result2 = false;
	boolean result3 = 9>3; //anything that can return either true or false, can be initizlized to boolean
	
	
	System.out.println(result); //true
	System.out.println(result2); //false
	System.out.println(result3); //true
	
	char character1 = 'a';
	System.out.println(character1);
	char char2 = 116;
	System.out.println(char2);
	char char3 = '#';
	System.out.println(char3);
	char char4 = '9';
	System.out.println(char4);
	System.out.println("\n");
	// char with numbers then you dont need the single quote
	char char5 = 37;
	System.out.println(char5);
	System.out.println("\t");
	char char6 = 123;
	System.out.println("\t"+char6);
	char char7 = '{';
	System.out.println(char7);
	
	
	
	
	char MyChar1 = 'b';
	int MyInt = 'b'; //the number that represents b is initialized to the int
	System.out.println(MyInt);
	System.out.println(MyChar1);
	
	byte MyByte = 'b';
	System.out.println(MyByte);
	
	float floatNum2 = 'b';
	System.out.println(floatNum2);
	
	double double1 = MyChar1;
	System.out.println(double1);
	
	//char can be assigned to byte, short, int, long, float, double
	
	byte a = 'a';
	short b = 'b';
	int c = 'c';
	long d = 'd';
	float f = 'f';
	double e = 'e';
	System.out.println(d); //result will be corresponding numbers of those characters from ASCII table
	//java is case sensitive : A does not equal to a
	
	char myCharValue = 205;
	System.out.println(myCharValue);
	
	
	
	
	
	
	
	
	
	
	
}
}
