package day24_JavaRecap;

public class arrayClass {
public static void main(String[] args) {
	
	/*Array declaration:
	 * DataType [] VariableName = { 1, 2, 3, 4 };
	 * 
	 * Arrays have index numbers, in order to retrieve a single value from array. You give Variable [index value]
	 * 
	 * Arrays size is fixed, Arrays size must be initialized. There are two ways to initizalize Arrays size.
	 *  1) By giving a value
	 *      int [] arr = {1 , 2, 3}
	 *   2)   
	 */
	
	int [] arr = {10, 20, 30};
	
	int arr1 [] = {10, 20, 30};
	
	char [] arr3 = {'A', 'B', 'C'};
	
	String [] arr4 = {"Ibrahim", "Filiz", "Aysel"};
	
	String name = arr4[2];
	System.out.println(name);
	System.out.println(arr4[0]);
	
	String [] MyNumbers = new String [10];
	for(int i = 0; i<MyNumbers.length; i++) {
		System.out.println(MyNumbers[i]);
	}
	int [] ch = new int [3];
	ch[0]=10;
	ch[1]=20;
	ch[2]=30;
	
	ch =new int[4];
	for(int i =0; i<ch.length;i++) {
		System.out.println(ch[i]);
	}
	int [] array1 = {1,2,3};
	int [] array2 = {4,5,6};
	
	int [] array3 = new int [array1.length + array2.length];
	
	for(int i = 0; i < array1.length; i++) {
		array3[i]=array1[i];
		//System.out.print(array3[i]+" ");
	}
	System.out.println();
	for(int i = 0; i<array2.length; i++) {
		array3[i+array1.length]=array2[i];
		//System.out.print(array3[i]+" ");
	}
	
	for(int i = 0; i<array3.length; i++) {
		System.out.print(array3[i]+" ");
	}
	
	
	
	
	
	
}
}
