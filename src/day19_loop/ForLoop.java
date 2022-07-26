package day19_loop;

public class ForLoop {
public static void main(String[] args) {
	
	/*For Loop continutisly loops for conitnuous steps
	 * for(initialization; condition; increment/iterator){
	 *     statements that we wants to repeat
	 * }
	 */
	/*
	 * loop: used for repeating actions, repeats the steps multiple times.
	 * statements within loops body is repeated until condition becomes false
	 * 
	 * initialization(starting point): usually the times of the number that we wanna execute the loop
	 * 
	 * condition: based on initialization... condition is created based on the initialiation
	 *  Ex: int i = 0; 
	 *  i < 10
	 *  ITERATOR: co-related to the condition. needs to be apable enough to make the condition false.
	 *  for(initizalization;condition;incrememnt);{ and 2 curly braces to define loop code block (body)
	 *  
	 *  if the condition of the loop is true, the loop will be executed.
	 *  }
	 *  //statements you want to repeat
	 */
	
	//for (int i = 1; i <= 10; i++ ) {
		//System.out.println("It is snowing!!! "+i);
	//}
	//System.out.println("I love winter!!!!!!!!!!!!!!!!!!!!!");
	//for (int number = 1; number < 7; number +=2) {
	 //System.out.println("Helo World "+number);
	//}
	
	//for(int i = 2 ; i>=2; ++i) {
		//System.out.println("Hello World");
	//}
	/*
	for(int i = 654800 ; i>0 ; i-- ) {
		System.out.println("Value of i is: "+ i);
	}
	*/
	/*for(int i =1; i<=10; i--) {
		System.out.println("You are probably this age: "+i);
	}
	
	*/
	//Task 2***
	//Write a program that displays each even numbers between 1 to 32.
	// Write a program that displays each odd numbers between 1 and 32.
	//Write a program that the user to declare a positive integer. it should then print the mult table of that number.
	
	for(int i = 1; i<33; i++ ) {
		if(i % 2 == 0) {
		System.out.print(i+" ");
	
	}
	}
	System.out.println();
	
	//TASK 3
	for (int i = 1; i<=32; i++) {
		if(i%2 ==1) {
			System.out.print(i+" ");} 
	}
	
	System.out.println();
	
	String str = "Java";
	String Rev=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	
	String Rev2="";
	   for(int i = 3; i>=0; i--) {
		  Rev2 += str.charAt(i); 
	   }
	      System.out.println(Rev);
	      
	      String name1 = "Juline";
	      String Reversed ="";
	      for (int j = name1.length()-1; j>=0; j--){
	    	  Reversed += name1.charAt(j);
	      }
	      System.out.println(Reversed);
	      
	      
	      
	String name2 = "Abraham";
	String reversed ="";
	for(int k=name2.length()-1;k>=0;k--) {
		reversed+=name2.charAt(k);
	}
	System.out.println(reversed);
	
	
	String name3 = "Amina";
	String reversed1="";
	for(int x=name3.length()-1;x>=0; x--) {
		reversed1+=name3.charAt(x);
	}
	System.out.println(reversed1);
}
}


