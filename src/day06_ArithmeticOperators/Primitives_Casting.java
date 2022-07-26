package day06_ArithmeticOperators;

public class Primitives_Casting {
public static void main(String[] args) {
	
	/*casting: converting larger primitive to a smaller size
	 * primitives: bytes, short, int, long float, double
	 * 
	 * datatype variablename =(datatype) value
	 * int a = 10
	 * byte by = (byte) a;
	 * 
	 * 2 types of castings: either explicit OR implicit
	 * 
	 * casting converts the larger primitive to a smaller size
	 * Explicit is used when we are converting from larger type to smaller type
	 */
	//casting primitives: byte(less than 127), short, int, long, float, double
	
	//explicit casting. converting larger size to a smaller size
	
	int a = 10;
	byte b = (byte) a; //explicit casting
	//System.out.println(b);
	
	double DecimalNum = 10.5;
	float FloatNum = (int) DecimalNum;
	System.out.println(FloatNum);  //convert to a smaller size to a float
	
	long LongNum = 300L;
	int intNum = (int) LongNum;
	
	System.out.println(intNum);
	
	//implicit casting: Automatic casting from smaller primitive type into larger primitive Type
	/*imlicit:
	 * 
	 *   automatically casts
	 * 
	 */
	
	byte ByteNum = 120;
	int IntNum3 = ByteNum;   //same with: int IntNum = (int) ByteNum;
	System.out.println(IntNum3);
	
	short ShortNum = 32000;
	long LongNum6 = ShortNum;
	System.out.println(LongNum6);
	
	//More Explicit Casting Practices
	double LargestNumber = 100.8765;
	byte ByteNumber = (byte) LargestNumber;
	
	float FloatValue = (float) LargestNumber;
	float FloatValue2 = (long) LargestNumber;
	float FloatValue3 = (int) LargestNumber;
	float FloatValue4 = (short)LargestNumber;
	float FloatValue5 = (byte) LargestNumber;
	
	System.out.println(FloatValue);
	
	float FloatNumber2 = 500.67F;
	int myNumber = (int) FloatNumber2; //can convert to short or int
	
	/*
	 * explicit must be done mannually --larger to smaller type
	 * 
	 * implicit automatically casts from smaller primitive type to larger.
	 */
	
	
	//int Num1 = 100;
	//int Num2 = 200;
	//int Num3 = 300;
	
	int Num1 = 100, Num2 = 200, Num3 = 300;
	
	boolean result = 8<9;
	System.out.println(result);
	//Local variables: must be defined and initialized before used. 
	char Character1 = 'A';
	System.out.println(Character1);
	
	boolean result1 = true, result2 = false, result3= true;
	System.out.println("\t"+result2+"\t"+ result1+"\t"+result3);
	
	
	
}
}
