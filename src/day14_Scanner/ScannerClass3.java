package day14_Scanner;

import java.util.Scanner;

public class ScannerClass3 {
public static void main(String[] args) {
	  
	Scanner input = new Scanner (System.in);
	  
	  System.out.println("Enter a Byte Value");
	byte byteNum = input.nextByte();
	  
	  System.out.println("You have entered: "+byteNum);
	  System.out.println("Enter another byte Value");
	 byte byteNum2 = input.nextByte();
	 System.out.println("You have entered "+byteNum2+"... your first byte times yours second byte is "+byteNum*byteNum2);
	  
	  
	  
}
	 
	
	
	
	
	
	
}
