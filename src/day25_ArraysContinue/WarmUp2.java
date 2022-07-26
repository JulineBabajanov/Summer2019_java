package day25_ArraysContinue;

public class WarmUp2 {
	public static void main(String[] args) {
		/*Write a program that can print out the unique values from String Array
		 * 
		 * 
		 */
		String []arr= {"A", "A", "A", "B", "C", "C", "d"};
		for(int j=0; j<arr.length;j++) {
		
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals(arr[j])) {
				count++;
			}
		
		}
		if(count == 1) {
			System.out.print(arr[j]+" ");
		}
		}
	
	
	}
}

