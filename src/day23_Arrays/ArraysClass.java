package day23_Arrays;

public class ArraysClass {
	
	public static void main(String[] args) {
		
		//Arrays: a variable that we can store multiple values
		/*
		 * regular variable: int a=10; can only have one value
		 * Arrays:
		 * int[] arr = {10, 20, 30, 40};
		 * int is dataType  && arr is variableName
		 * 
		 * 
		 * each values (Elements) in an array have their own index numbers: index starts from 0
		 * int[] VariableName={10, 20, 30, 40, 50};
		 *   own index numbers 0    1   2  3    4
		 *    bracket represents index number when given with variable name 
		 *    ****brackets are called the body of the array. must strore array numbers inside brackets
		 *    to retrieve the data from the array give the variable name and the bracket. 
		 *    inside bracket give indexNumber of data: VariableName[3] ==>returns the value of the index number which is 40
		 *    VariableName[0]==>10
		 *    
		 *    Array is immutable and Arrays size is fixed
		 */
		
		int[] arr= {1, 2};
		System.out.println(arr[0]);
		
		String [] names = { "Nigar", "Sumeyya", "Madina", "Juline"} ;
		//      index numbers 0        1          2          3
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		String str1= names[2];
		String str2= names[3];
		
		System.out.println(str1);
		System.out.println(str2);
	
		double [] myArray = {1, 2, 3, 4, 5, 8, 0, 2};
		// indexes           0   1 2  3  4  5  6  7
		for (int i=0; i<8; i++) {
			System.out.print(myArray[i]+" ");
		}
	
		System.out.println();
		
		//length of Array: 
				 String str="ABC";
				 int A=str.length();
				 System.out.println(A); //gives me total numbers of letters
		
		int [] Numbers= {12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int B=Numbers.length; //gives me total numbers of elements
		System.out.println(B);
		int HighestIndexNum = Numbers.length-1; //13
		System.out.println(HighestIndexNum);
		
		for(int i = 0; i<Numbers.length;i++) {
			System.out.print(Numbers[i]+" ");
			//|| int s1 = Numbers[i];
			//System.out.print(s1+" ");
		}
		
		System.out.println();
		
		/*
		 * arrays size is immutable and fixed
		 */
		
		char[] myChars = {'A', 'B', 'C', 'D'};
		int HighestIndexNum2 = myChars.length-1;
		System.out.println(HighestIndexNum2);
		
		
		
		
	}

}
