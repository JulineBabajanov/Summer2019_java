package day06_ArithmeticOperators;

public class prime {
public static void main(String[] args) {
	
	/*casting:casting a larger primitive to a smaller size primitive
	 * 
	 *   datatype veriableName = (dataType) value;
	 * 
	 */
	
	int a = 10;
	byte b = (byte) a;
	System.out.println(b);
	
	
	double DecimalNumber = 10.5;
	float FloatNumber = (int) DecimalNumber;
	System.out.println(FloatNumber);
	
	long LongNum = 300L;
	int intNum = (short) LongNum;
	System.out.println(intNum);
	
	byte ByteNum = 100;
	int intNumm = ByteNum;
	System.out.println(intNumm);
	
	short shortNum = 1_000;
	long LongNumm = shortNum;
	System.out.println(LongNumm);
	
	//explicit
	
	double LargestNumber = 100.8765;
	int byteNumm = (int) LargestNumber;
	System.out.println(byteNumm);
	
	int x = 3, y = 5, z = x*y;
	System.out.println(z);
	
	int length = 100, width = 10, area = length*width;
	
	System.out.println(area);
	
	double resultName = 10%9;
	System.out.println(resultName);
	
	int outcome = 12+6/3;
	System.out.println(outcome);
	
	System.out.println(5+2*4); //13
	System.out.println(10/2-3);//2
	System.out.println(8+12*2-4);//28
	System.out.println((4+17)%2-1);//0
	System.out.println(6-3*2+7-1);//6
	
	System.out.println(12/5);
	
	System.out.println(3 + 4 * 4 + 5 * (4+3)  );
	
}
}
