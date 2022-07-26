package day26_ForEach;

import java.util.Arrays;

public class ForEachLoop {
	public static void main(String[] args) {
		//For each loop used to access the value in a collection of values.
		/*
		 * for each loop is a loop thats already been iterated. for each loop can Never be infinite. 
		 * syntax for each loop: for(DataType VariableName: VariableNameOfCollection){
		 * }
		 * variable name "each" represents each values of the array
		 * 
		 * Number of times execution of the loop depends on the length of the array
		 * 
		 * When we use a for each loop when we don't need to create the index variables. 
		 */
		
		int[] arr= {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			
			
		}
		for(int each: arr) {
			System.out.print(each);
		}
		
		String [] str1= {"A", "B", "C"	}; //length +1
		for(String each: str1 ) {
			System.out.println(each);
		}
		
		char[] ch= {'z', 'y', 'x', 'c', 'a', 'b'};
		Arrays.sort(ch);
		for(char charzzz :  ch ) {
			System.out.print(charzzz);
		}
		int[] arr1= {1,2,3,4,5,6,7,8,9,10};
		for(int varname: arr1) {
			if(varname %2!=0)
			System.out.print(varname+ " ");
			
		}
		
		
		
		
		
		
		
			
		}

}
