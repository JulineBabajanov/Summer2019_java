package day25_ArraysContinue;

import java.util.Arrays;

public class acsendingOrder {
	public static void main(String[] args) {
		
	int[]arr2= {99,10,200,300,40,50,5000}; 
	Arrays.sort(arr2);// array will be sorted in acsending order
	
	int[] Decending=new int [arr2.length];
	   Decending[0]=arr2[6];
	   Decending[1]=arr2[5];
	   Decending[2]=arr2[4];
	   Decending[3]=arr2[3];
	   Decending[4]=arr2[2];
	   Decending[5]=arr2[1];
	   Decending[6]=arr2[0];
	   
	   int z=0;
	   for(int i=arr2.length-1; i>=0; i--);
	   Decending[z]=arr2[i];
	   z++;
	   System.out.println(Arrays.toString(arr2));
	   System.out.println(Arrays.toString(Decending));
	
	
	}

}
