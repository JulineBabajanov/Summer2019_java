package day10_ifStatement;

public class without_CurlyBrace {
public static void main(String[] args) {
	
	/*  single if statement:
	 * if(condition)
	 *        //only a single line of statement
	 * 
	 */
	
	if(false)
		System.out.println("Helloooo");
	    System.out.println("How are you");
	
	
	    if(false)
	    	System.out.println("Hello");
	    else
	    	System.out.println("Hola");
	    
	    
	    if(false)
	    	System.out.println("if block");
	    else if (false)
	         System.out.println("else-if block");
	    else
	    	System.out.println("else block");
	    // else block is not mandatory BUT else if block IS mandatory
}
}
