package day24_JavaRecap;

public class warmU2 {
public static void main(String[] args) {
	
	//write a program that return the min value from an int array
	//write a program that return the second min value from an int array
	
	int [] arr = {100, 2, 2, 3,4, 5, 6};
	   int min = 999999999;
	   
	   for(int i = 0; i <arr.length; i++) {
		   if(arr[i]<min) {
			   min = arr[i];
		   }
	   }
	
	System.out.println("minimum number is: "+min);
	
	
	int secondMinimum = 999999999;
	
	for(int j = 0; j<arr.length; j++) {
		if(arr[j]<secondMinimum && arr[j]!=min) {
			secondMinimum = arr[j];
		}
	}
	
	System.out.println("Second minimum is: "+secondMinimum);
	
	
	
	
}
}
