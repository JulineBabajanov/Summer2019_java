package day25_ArraysContinue;

public class WarmUp1 {
public static void main(String[] args) {
	
	
	/* Write a program that can print out the unique values from an Array
	 * 
	 */
	
	int [] arr = {1, 1, 2, 2, 2, 2, 3, 4, 4, 5};
	
	for(int j = 0; j<arr.length; j++) {
	
		int count = 0;
	for(int i = 0; i<arr.length; i++) {
		if(arr[i] == arr[j]) {
			count++;
		}
	}
	if(count==1) {
		System.out.println(arr[j]);
	}
	}
}
}
