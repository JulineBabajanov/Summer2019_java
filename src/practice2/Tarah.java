package practice2;

import java.util.Scanner;

public class Tarah {
public static void main(String[] args) {
	// Loops with scanner:
	    
	    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Starting number");
        
        int start = scan.nextInt(); //10
        
        System.out.println("ending number");
        int end = scan.nextInt(); //100
        
        
        //for loop:
        
        /*
        for(int k= start; k <= end; k++) {
            if(k%2==0) {
                System.out.print(k+" ");
            }
        }
        */
        System.out.println();
        
        
        //while loop:
        
        /*
        
         Scanner scan = new Scanner(System.in);
        
        System.out.println("Starting number");
        
        int start = scan.nextInt(); //10
        
        System.out.println("ending number");
        int end = scan.nextInt(); //100
        
         */
        
        int m = start;
        while(m<=end) {
            if(m%2==0) {
                System.out.print(m+" ");
            }
            m++;
        }
}
}
