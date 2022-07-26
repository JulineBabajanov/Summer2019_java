package FridayReview;

public class Class {
public static void main(String[] args) {
	
	//Write a program that can return the maximum value from an int array
	//Write a program that can retrun the second maximum value from an int array
	
	//int[] arr= {20, 200, 30, 40, 50, 500};
	
	//int maximum=0; //max=20, max=200
	
//	for(int i=0; i < arr.length; i++) {
		//if(arr[i]>maximum) {
		//	maximum=arr[i];
		
	
	//System.out.println("Maximum number is: "+ maximum);
	
	int[] arr= {100,2,2,3,4,5,6, -1, -2};
	   int min=999999999;
	   for(int i=0; i<arr.length; i++) {
		   if(arr[i]<min) {
			   min=arr[i];
		   }
	   }
	   System.out.println("minimum number is: "+min);
	
	
	
	
	
	
}
}
