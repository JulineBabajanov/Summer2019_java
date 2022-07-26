package day24_JavaRecap;

public class ArraysClass {
public static void main(String[] args) {
	/*Arrays declarations:
	 *1.) DataType[] VariableName={1,2, 3, 4}
	 * 2.) DataType Variable Name[]={1, 2, 3}
	 * 
	 * Arrays have index numbers, in order to retrieve a value from an array. 
	 *     VariableName[indexNum of Value]
	 *     
	 *     Arrays size is fixed and must be initizlized
	 *     We can initizlize two ways the arrays size.
	 *     
	 *     first way: by giving a value   int [] arr ={1,2,3};
	 *     it also initizlizes the size and at the same time it gives value to the index of array
	 *     second way: By new keyword...   int[] arr = new int[size number];
	 *     it inizalizes only size and not the value
	 */
	int a = 10;
	int [] arr = {10, 20, 30};
	int arr2 []= {10, 20, 30};
	
	char [] arr3 = {'A', 'B', 'C'};
	
	String [] arr4 = {"Ibrahim", "Filiz", "Aysel"};
	// index numbers   0           1         2
	String name = arr4[2];
	System.out.println(name);
	//System.out.println(arr4[1]);
	
	/*
	 * initialize the size of an array:
	 * int[] arr = new int [size]
	 */
	System.out.println();
	String [] MyNumbers = new String[5];
	for(int i = 0; i<MyNumbers.length; i++ ) {
		System.out.print(MyNumbers[i]+" ");
	}
	/*
	 * default values:
	 * int, byte, short, long: 0
	 * double float: 0.0
	 * boolean==false
	 * char==(empty) space
	 * String ==> null
	 */
//assign values
	System.out.println();
	int ch[] = new int[3];
	ch[0]=10;
	ch[1]=20;
	ch[2]=30;
	System.out.print(ch[2]);
	System.out.println();
	
	ch= new int [4]; //re initialize values so it prints out 5, 10, 15, 20... previous arrays size is lost
	ch[0]=5;
	ch[1]=10;
	ch[2]=15;
	ch[3]=20;
	for(int i = 0; i<ch.length; i++) {
		System.out.print(ch[i]+" ");
	}
	System.out.println();
	
	int[] array1= {1, 2, 3, 9};
	int[] array2= {4, 5, 6, 7};
	
	int [] array3= new int [array1.length + array2.length]; // now this array has enough capacity to contain all the elements of array1 and array2
	
	for(int i = 0; i<array1.length; i++) {
		array3[i]= array1[i];
		
	}
	for(int i =0; i<array2.length;i++) {
		array3[i+array1.length]=array2[i];
	}
	
	for(int i = 0; i<array3.length; i++) {
		System.out.print(array3[i]+" ");
	}
	
}
}
