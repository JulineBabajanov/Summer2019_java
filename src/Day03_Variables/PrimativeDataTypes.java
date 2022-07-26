package Day03_Variables;

public class PrimativeDataTypes {
public static void main(String[] args) {
	/*PRIMITIVE TYPES
	 * byte: we can assign integers.. no decimals and only whole numbers allowed -128 to 127
	 * short: only whole numbers and range is -32768 - 32767
	 * int : mostly used and only whole numbers. Must be in range of -2147483648 - 2147483647
	 * long : we can only assign whole numbers. Must be within -9223372036854775808 - 
	 * float: we can assign decimals ( decimals must have f or F letter at the end)
	 * double: (used more often) we can assign decimals.
	 */
	
	byte length = 3;
	System.out.println(length);
	byte Width = 4;
	System.out.println(Width);
	System.out.println(length*Width);
	/*variable name RULES: 
	 * 1.must start with an alphabet A-Z or a-z
	 * 2. variable name can only contain _ or $ and no other special characters
	 * 3. variable name must be unique
	 *.4. there are some words reserved by java so you can not use the java reserved words by java for a variable 
	 *
	 *smaller one can always be assigned to bigger one
	 */
	//  byte < short < int < long < 
	
	byte byteNumer = 10;
	short shortNumber = byteNumer;
	
	//byte byteNumber2 = shortNumber;  short is greater than byte so it can not go into a byte
	
	int intNumber = -19876;
	long longNumber2 = intNumber;  
	
	short shortNumber3 = -30000;
	int intNumber2 = shortNumber3;
	
	
	
	byte num2 = 91;
	byte Public = 10;
	
	short num3= 10000;
	int hello = 2_000_000_000; //easier to read with underscores _
	
	System.out.println(Public + num2);
	
	long longNum = 10L;
	long longnum1 = 13l;
	int intNum = 10;
	
	//int example = 10.5; int is only whole number not decimals
	float example2 = 10.5f;
	float example3 = 20.5F;
	float example4 = 15.0f;
	
	double doubleNumber = 10.5;
	double doubleNum = 11;
	double doubleNumber2 = 30.5;
	//float floatNumber = doubleNumber2; double data type is larger than float so it won't accept it
	// the variables dataType must be larger in order to contain another dataType
	
	byte bNum = 10;
	short sNum = 20;
	int iNum=30;
	long lNum = 40;
	System.out.println(bNum);
	System.out.println(sNum);
	System.out.println(iNum);
	System.out.println(lNum);
	float fNum = bNum;
	float fNum2 = sNum;
	float fNum3 = iNum;
	float fNum4 = lNum;
	
	System.out.println(fNum);
	System.out.println(fNum2);
	System.out.println(fNum3);
	System.out.println(fNum4);
	float fNum5 = 10f;
	System.out.println(fNum5);
	
	double dNum = bNum;
	System.out.println(dNum);
	
	
	
	
	
}
}
