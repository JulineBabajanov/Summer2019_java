package day06_ArithmeticOperators;

public class PrimCastPrac {

	public static void main (String [] args) {
		
		/* Casting: converting the larger primitive to a smaller size.
		 * datatype variableName = (datatype) value
		 * (primitives byte short int long float double)
		 * castings are either Explicit or implicit
		 * Explicit casting is used when converting a larger data type into a smaller data type.
		 * Implicit casting is automatic casting from smaller primitive type into larger primitie type.
		 * example:
		 * byte b = 10;
		 * int a = b; //10
		 * 
		 */
		
		
		int a = 10;
		byte b = (byte) a; //explicit casting
		System.out.println(b);
		
		double DecimalNumber = 10.5;
		float FloatNumber = (float) DecimalNumber;
		System.out.println(FloatNumber);
		
		long LongNum = 300L;
		int intNum = (int) LongNum;
		System.out.println(intNum);
		
		//implicit casting
		
		byte ByteNum = 100;
		
		int intNum2 = ByteNum;
		
		int IntNum3 = (int) ByteNum; 
		
		System.out.println(IntNum3);
	
		short ShortNum = 200;
		long LongNum2 = ShortNum;
		System.out.println(ShortNum); 
		
		double LargestNum = 100.8765;
		byte smallestNum = (byte) LargestNum;
		System.out.println(smallestNum);
		
		int Num1 = 100;
		int Num2 = 200;
		int Num3 = 300;
		
		int Num4 = 100, Num5 = 200, Num6 = 300;
		
		System.out.println(Num5);
		
	}
}
