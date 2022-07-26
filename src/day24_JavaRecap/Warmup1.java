package day24_JavaRecap;

public class Warmup1 {
public static void main(String[] args) {
	/*write a program that can return the maximum value from an int array
	 * 
	 */
	int[] arr = {20, 200, 30, 40, 50, 500};
	int maximum = 0;
	for(int i =0; i<=arr.length-1; i++) { // counts the index numbers 0 1 2 3 4 5
		if(arr[i]>maximum) { // finds the highest number 20 200 30 40 50 500
			maximum = arr[i];
		}
	}
	System.out.println("The maximum number is: "+maximum);
	
	int secondMax = 0;
	for(int j=0; j<arr.length;j++) {
		if(arr[j]>secondMax && arr[j]!=maximum);{
			secondMax=arr[j];
		}
	}
	System.out.println("Second maximum number is: "+secondMax);
	
	
}
}
