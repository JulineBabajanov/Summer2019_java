package day23_Arrays;

public class arraysClas1 {
public static void main(String[] args) {
	
	/*Arrays : a variable that we can store multiple values in.
	 * 
	 * 
	 * regular variable int a = 10; which you can only store ONE value in regular variable.
	 *  
	 *  in an array each value (elements) have their own index numbers
	 * Arrays:
	 * int [] VariableName= {10, 20, 30, 40, 50}
	 * index#:               0    1   2   3   4
	 * 
	 * to retrieve the data from the array VariableName [indexNum of data]:
	 */
	int a = 20;
	int []     arr = {1, 2 };
//  datatype   variable name	
	
	String [] names = {"Nigar", "Sumeyya", "Madina", "Juline"};
	// index numbers    0          1          2          3
	
	System.out.println(names[0]);
	System.out.println(names[1]);
	String str1 = names[2];
	String str2 = names [3];
	System.out.println(str1+" and "+str2);
	
	/*Array is immutable and Arrays size is fixed
	 * 
	 */
	//System.out.println(names[4]); out of bounds
	
	double [] myArray = {1, 2, 3, 4, 5, 8, 0, 2};
	//                   0  1  2  3  4  5  6  7
	
	for(int i = 0; i<=7; i++) {
		System.out.print(myArray[i]+" ");
	}
	System.out.println();
	
	String str = "ABC";
	int A = str.length();
	System.out.println(A);
	
	
	int [] Numbers = {12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    int B = Numbers.length;
	System.out.println(B);
	int HighestIndexNum = Numbers.length -1;
	System.out.println(HighestIndexNum);
	
	for(int i = 0; i<Numbers.length; i++) {
	int s1 = Numbers [i];
	System.out.print(s1+", ");
	}
	System.out.println();
	
	System.out.println("Hello");
	
	
	
	char [] myChars = {'A', 'B', 'C', 'D'};
	int ch1 = myChars.length-1;
	System.out.println(ch1);
	
	
}
}
