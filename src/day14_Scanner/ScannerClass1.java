package day14_Scanner;

import java.util.Scanner;

public class ScannerClass1 {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner (System.in);
	               System.out.println("Enter byte number");
	               byte num = input.nextByte();
	               
	               System.out.println("Enter a short value");          
	               short num2 = input.nextShort();
	     
	               System.out.println("Enter an int value");
	               int num3 = input.nextInt();
	               
	               System.out.println("Enter a long value");
	               long num4 = input.nextLong();
	               
	               System.out.println("Enter a boolean");
	               boolean result = input.nextBoolean();
	               
	               System.out.println("Enter a float value");
	               float num5 = input.nextFloat();
	               
	               System.out.println("Enter a double");
	               double num6 = input.nextDouble();
	              
	               
	               System.out.println("You entered "+num+" and "+num2+" and "+num3+" and "+num4+" and "+ result+" and "+num5+" and "+num6);  
	                 
	                 

}
}
