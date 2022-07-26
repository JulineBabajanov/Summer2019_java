package day22_nestedLoop;

public class NestedLoop {
public static void main(String[] args) {
	/*Nested if statement if the condition contains another if statement
	 * Nested Loop: loop inside a loop==nested loop
	 * for(5){
	 *      for(5){
	 *      "Hello";
	 *      }  //repeats 25 times
	 *    }
	 *    we use nested loop when we need to repeat some steps inside the loops body
	 */
	
	
	//repeat 5 times 12345 12345 12345 12345 12345
   for(int z =0; z<5;z++) {
	for(int i = 1; i<=5; i++) {
	   System.out.print(i);
	  
   }
	
	System.out.println();
   }
   
   /* *****
    * *****
    * *****
    * *****
    * *****
    */
   int z = 5;
   while(z>=0) {
      int t = 1;
     while(t<=5) {
    	 System.out.print("*");
    	 t++;	
     }
   System.out.println();
   z--;
   }
  
   System.out.println("\n\n");
   
   
   
  for(int p =1; p<=7; p++) {
	 for(int j=1; j<=p; j++) {
		 System.out.print("*");
	 }
	 System.out.println();
  }
  System.out.println();
  
  for(int c=1; c<=10;c++) {
  for(int n=1;n<=c;n++) {
	  System.out.print("*");
  }
  System.out.println();
  
  }
  
  System.out.println();
 
  int A =1;
  while(A<=7) {
	  int B=1;
	 while(B<=A) {
		 
	  System.out.print("*");
	  
	  
	  B++;
  }
	 System.out.println();
	 A++;
}
  
   
  
  
  
  
  
  
}
}
