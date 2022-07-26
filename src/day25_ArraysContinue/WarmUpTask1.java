package day25_ArraysContinue;

public class WarmUpTask1 {
	
	public static void main(String[] args) {
		/*
		 * Write a program that can print out the unique values from an int Array (a variable that can contain multiple values)
		 * if arr-->{1, 1, 2, 3, 3}
		 * out put 2
		 * if arr --> {1, 2, 2, 3, 4, 4}
		 * out put: 1, 3
		 */
		
		int[] arr= {1, 1,  2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 4, 8, 7, 9}; 
		
	for(int j=0; j<arr.length; j++) {
		
	
		int count=0;
		for (int i = 0; i<arr.length; i++) {
			if(arr[i]== arr[j]) {
				count++;
			}
			
		}
	
		if (count==1) {
			System.out.print(arr[j]+" ");
			}
	}
		
	}

}
