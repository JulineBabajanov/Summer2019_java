package day05_Recap;

public class Primitives_Review {
public static void main (String [] args) {
	
	
	/*Primitives:
	 * byte: only takes whole numbers
	 * short: only takes whole numbers
	 * int: only takes whole numbers
	 * long: only takes whole numbers
	 * 
	 * float: can take decimals Must have F or f at the end)
	 * double: can take decimals
	 * 
	 * boolean: true or false boolean expressions
	 * char: characters within single quote ' ' also takes numbers
	 * 
	 */
	
	byte bNum = 127;
	//bytes range is -128 - 127 and only whole numbers
	
	short sNum = -32_768;
	
	sNum = bNum;
	System.out.println(sNum); //127
	
	
	int intNum = 100;
	short shortNum=105;
	intNum = shortNum;
	System.out.println(intNum);
	
	long longNum = 100l;
	long longNum2 = 100L;
	
//	byte ByteNum3 = longNum; long is greater than byte, short and int so it will give compiler error
  // short ShortNum3 = longNum;
    //int IntNum3 = longNum;
	
	byte a = 10;
	int b = 30;
	short c = 40;
	
	long LongNumber = a;
	long LongNumber2 = b;
	long LongNumber3 = c;
	System.out.println(LongNumber3);
	
	float floatNumber = 10.5f;//must give a f when declaring a float
	float floatNumber2 = 20.5F;
	
	
	short a1 = 10;
	byte b1 = 20;
	short c1 = 30;
	int d1 = 40;
	
	float Floats = a1;
	float Floats2 = b1;
	float Floats3 = c1;
	float floats4 = d1;
	System.out.println(Floats3);
	
	double DoubleNum1 = 10L; //long is smaller than double
	double DoubleNum2 = 10.5F;
	//double takes all the whole and decimal primitives
	
	boolean result = true;
	boolean result2 = false;
	boolean result3 = 9>10;
	System.out.println(result3);
	
	//char takes a character,  and must be declared within a single quote ' '... only a single character can be declared
	//char value can also be assigned to other primitives
	char character1 = 'A';  //prints an A
	System.out.println(character1);
	
	char charValue = 98;
	System.out.println(charValue);  //prints a b
	
	int num3 = 'B';
	System.out.println(num3);
	
	float fnum = 'B';
	System.out.println(fnum); //66.0
	
	byte bValue = 'B';
	System.out.println(bValue);
	
	float fnum2 = 5.5f;   //5.5
	float fnum3 = 5;  // 5.0
	
	
	char specialCharacter = 'z';
	System.out.println(specialCharacter);
	
	//practices assigning
	/*
	 * 8, 9, #, @, 8.5, 5.5f, 128, 40000, true, false
	 */
	
	// 8 can be assigned to byte, short, int, long, float, double, char
	byte bNum6 = 8; short Snum = 8; int INum = 8; long LNum = 8L; float Fnum = 8f; double Dnum = 8; char character = '#';
	System.out.println(character);
	
	
	
}
}
