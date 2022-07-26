package day25_ArraysContinue;

import java.util.Arrays;

public class Practice_2DArray {
	public static void main(String[] args) {
		
		int [][] arr2D= {{1,2}, {3,4,5,6,7}, {8,9} };
		//length method:
		
		int length=arr2D.length; //2
		
		for(int i=0; i < arr2D.length; i++) {
			
			System.out.println(Arrays.toString(arr2D[i] ) );
		}
		for(int i=0; i < arr2D.length; i++) {
		System.out.println(arr2D[i][1]);
		
		}
		
		
		
		
	}

}
