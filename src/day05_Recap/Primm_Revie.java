package day05_Recap;

public class Primm_Revie {
public static void main(String[] args) {
	
	/* Primitives:
	 * byte, short, int, long, == takes whole numbers
	 *  float, double, ==takes decimals but float must have f or F at the end
	 *  boolean, == true or false boolean expressions 
	 *  char == character within single quote and also takes numbers
	 * 
	 * 
	 */
	
	
	byte bNum = 127; //bytes range -128 to 127
	//byte bNum2 = 125.0; //byte only takes whole numbers
	
	short sNum = 20_000; //only takes whole numbers as well
	
	int iNum = 2_147_483_640;// only takes whole numbers and used more often
	
	long lNum = 905l;
	System.out.println(lNum);
	
	long lNum2 = 900L;
	System.out.println(lNum2);
	
	float floatNumber = 10.5f; //must declare f or F when declaring a float value
	
	
	boolean result = true;
	boolean result2 = false;
	boolean result3 = 9>10;
	boolean result4 = 10>13;
	System.out.println(result4);
	
	char character1 = 'A';
	System.out.println(character1);
	char character2 = 34;
	System.out.println(character2);
	System.out.println("There will be snow on \nThursday\nwhich is Christmas Day");
	
	int num3 = 'B';
	System.out.println(num3);
	float fnum = 'c';
	System.out.println(fnum);
	byte bValue = '5';
	System.out.println(bValue);
	
	float fnum3 = 5.2f;
	System.out.println(fnum3);
	
	double DNum = 8;
	System.out.println(DNum);
	char ch1 = 56;
	System.out.println(ch1);
	
	
	
}
}
