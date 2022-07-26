package day25_ArraysContinue;

import java.util.Arrays;

public class Practice2DArray {
public static void main(String[] args) {
	
	
	int [][] arr2D = {  {1, 2}, {3, 4, 5, 6, 7} ,{8, 9} };
	
	// length method:
	   int length = arr2D.length;
	     System.out.println(length);
	
	     for(int i = 0; i<length; i++) {
	    	 System.out.println(Arrays.toString(arr2D[i]));
	     }
	     
	   for(int i = 0; i<arr2D.length; i++) { // checks each index of 1d array
		   for(int j = 0; j<arr2D[i].length; j++ ) { // checks the each index of ELEMENTS
			   
		   System.out.print(arr2D[i][j]+", ");
	   }
} 
	   System.out.println();
	     
	    char [][] ch2D = { {'A', 'B', 'C', 'D'}, {'C', 'D'}, {'E','F'} }; 
	    for(int i = 0; i<ch2D.length; i++) {
	    	
	    	for(int j = 0; j<ch2D[i].length; j++) {
	    		System.out.print(ch2D[i][j]+", ");
	    	}
	    }
	     
	     System.out.println();
	     
	     int [][] arrs = { {1, 2}, {3,4}, {4,5}, {6,7, 8, 9, 10} };
	     for(int i = 0; i<arrs.length; i++) {
	    	 for(int j= 0; j<arrs[i].length;j++) {
	    		 System.out.print(arrs[i][j]+", ");
	    	 }
	     }
	     
	     
	     
}
}
