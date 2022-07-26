package day21_WhileLoops;

import java.util.Scanner;

public class do_While {
public static void main(String[] args) {
	
	/*do-while:
	 * do{
	 * statements;
	 * }while(condition);
	 * 
	 * compiler executes the do block first. and then checks the condition. if the condition is true then it continues to execute
	 * otherwise it exits the loop
	 * 
	 * while loop never gets exectuted if the condition is false
	 * 
	 * do-while loop gets executed at least once, regardless of condition
	 */
	//boolean A=true;
	
	//while(A) {
		//System.out.println("Hello");
	//}
	
	//do {
		//System.out.println("Hey-Hey");
	//}while(A);

	
	int x=1;
     do {
    	 if(x%2==0) {
    		 System.out.print(x+" "); 
    	 }
    x++;
     }while(x<=100);
	System.out.println();
	
	do {
		System.out.println("hello");
		break;
		//System.out.println("Hello Cybertek"); //already out of the loop because it came after the break; statement
		
	}while(true);
	
	
	
}
}
