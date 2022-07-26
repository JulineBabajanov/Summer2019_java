package day05_Recap;

public class PrimReview {
public static void main (String []args) {
	
	/*Primitivies:
	 *       byte: only take whole numbers
	 *       short: only take whole numbers
	 *       int: only take whole numbers
	 *       long: only take whole numbers
	 *       float: Can only take decimals (must have F or f at the end)
	 *       double: Can only take decimals
	 *       boolean: true or false boolean expressions
	 *       char: character within single quote ' '
	 * 
	 */
	byte bNum = 127;
	short sNum = 32767;
	int iNum = 2_000_000_000;
	sNum = bNum;
	System.out.println(sNum);
	
    float fNum = 10;
    float fNum2 = 10.5f;
    short a1 = 10; byte b1 = 20; short c1 = 30; int d1 = 40;
    
    float Floats = b1;
    
    boolean result = true;
    boolean result1 = 9>10;
    System.out.println(result1);
	
    // char: takes characters and must be declared in a single quote with a single character
    char character1 = 'A';
    System.out.println(character1);
    char character3 = 65;
    System.out.println(character3);
    
    int num3 = 'B';
    System.out.println(num3);
    
    float fnum = num3;
    System.out.println(fnum);
    
    float fnum2 = 5.5f;
    System.out.println(fnum2);
    
    char specialChar = 500;
    System.out.println(specialChar);
	
	
}
}
