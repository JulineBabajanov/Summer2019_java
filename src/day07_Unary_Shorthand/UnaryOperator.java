package day07_Unary_Shorthand;

public class UnaryOperator {
public static void main (String[]args) {
	
	/*   +: positive
	 *   -: negative
	 *   ++Increment: ==> increases the value by 1 in stored memory.
	 *      increments are post increment or/
	 *       pre increment: operator is placed before the variable; 
	 *   --decrement:==> decreases the value by 1 in stored memory.
	 * 
	 * 
	 */
	int num1 = 100;
	System.out.println(++num1); //num1+1==101
	
	int num2 = ++num1;
	System.out.println(num2);
	
	//post increment: operator is placed after the variable: it will pass the current value first then it will be incremented by 1
	int IntNum = 100;
	System.out.println(IntNum ++);
	System.out.println(IntNum);
	
	int IntNum2 = IntNum++;
	System.out.println(IntNum2);
	System.out.println(IntNum);
	
	int x = 100;
	int y = x++ - 1;
	System.out.println(y);
	System.out.println(y);
	
	// decrement: decreases the value by 1.
	         // pre -- decrememnt : operator is placed before the variable
	                     // decreases the value by 1 immediately.
	int Z = 100;
	   --Z;
	    System.out.println(Z);
	    
	    //Post- decrement : operator is placed after the variable;
	      // it will pass the current value, and then decrease it by 1.
	    
	    int Y = 95;
	    System.out.println(Y--);
	    System.out.println(Y);//94
	    
	    int a = 25;
	    System.out.println(++a); //26
	    System.out.println(--a); //25
	    
	    int C = 50;
	    C = --C + C++ + C-- + C++;
	    System.out.println(C);
	    
	    
	    short Snum = 4;
	    int R = Snum * 4 - Snum--;//12
	    System.out.println(R);//3
	    
	    int L = 1;//0 
	    L =  -L-- + L++ / -L-- * --L;
	      // post  post   post    pre
	     //  -1     
	    
	    System.out.println(L);
	    
	    x = 2;
	    y = x++;
	    System.out.println(y);
	    
	  
	    
	    
	    
	    
	
	
	
	
	
}
}
