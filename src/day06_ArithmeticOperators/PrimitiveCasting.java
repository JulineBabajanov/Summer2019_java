package day06_ArithmeticOperators;

public class PrimitiveCasting {

public static void main (String[]args) {
	
	/*Casting: converting a larger primitive to a smaller size 
	 * primitives: byte short int long float double
	 * 
	 * datatype variable name = (datatype)value
	 * 
	 * 2 types of casting explicit and implicit
	 * 
	 * explicit casting : used when converting large datatype into a smaller datatype
	 * 
	 */
	double DecimalNumber = 10.5;
	float FloatNumber = (int) DecimalNumber;
	System.out.println(FloatNumber);
	
	int a = 10;
	byte b = (byte)a; //explicit casting
	
	System.out.println(b);
	
	long LongNum = 300L;
	int intNum = (int) LongNum;  //short can also be used
	
	System.out.println(intNum);
	
	/*implicit casting: automatic casting from the smaller primitive type into a larger primitive 
	 * 
	 */
	byte ByteNum = 100; 
	int IntNum2 = ByteNum;
	System.out.println(IntNum2);
	
	
	double LargestNumber = 100.8765;
	byte ByteValue = (byte) LargestNumber;
	
	float FloatValue = (byte)LargestNumber;
	System.out.println(FloatValue);
	
	float FloatNumber2 = 500.67F;
	int myNumber = (int) FloatNumber2;  //short and int
	System.out.println(myNumber);
	
	/*int Num1 = 100;
	 * int Num2 = 200;
	 * int Num3 = 300;
	 * same as below 
	 */
	
	int Num1 = 100, Num2 = 200, Num3 = 300;
	
	/*Local variables are variables declared within the method
	 * LOCAL VARIABLES MUST BE DEFINED/INITIALIZED BEFORE USE
	 * 
	 */
	
	boolean result;
	//System.out.println(result);
	
	char Character1 = 65; 
	System.out.println(Character1);
	
	boolean result1, 
	        result2, 
	        result3;
	
}
}
