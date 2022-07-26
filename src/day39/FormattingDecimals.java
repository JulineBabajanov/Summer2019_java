package day39;

import java.text.DecimalFormat;

public class FormattingDecimals {
	
	public static void main(String[] args) {
		
	
	/*DecimalFormatter class: presented in "java.text"
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	DecimalFormat format= new DecimalFormat("0.00");
	
	double b= 23.12345233231213;
	
	//format(double): formats the decimals and returns string value
	String num1= format.format(b);
	System.out.println(num1);
	
	double c=45.56789;
	
	System.out.println( format.format(c) +1  ); 
	
	c=Double.parseDouble(format.format(c));
	
	System.out.println(c+1);
	
	
	
	}
	
	
	

}
