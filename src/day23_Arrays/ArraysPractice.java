package day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {
public static void main(String[] args) {
	
	
	String student1= "Ibrahim";
	String student2= "Zuleyha";
	String student3= "Elina"; //when storing with strings you store in each individual string
	//when saving data in an array you can create all arrays in 1 variable
	String [] AllStudents= {"Ibrahim", "Zuleyha", "Elina"};
	             //            0           1          2
	AllStudents[0]="Marufjon";
	//AllStudents[3]="Muhtar"; Arrays size is fixed already
     System.out.println(AllStudents.length);
	/*arrays size must be initilized, there are two ways we can initilize. 1. giving values int[] a ={1,2,3};
	 *  2. giving the size only 
	 *     int[] a= new int [LengthNumber]
	 * 
	 */
    	//System.out.println(AllStudents[0]);
	
	//initilize the size only without giving a value:
	int[] array = new int[4];// we havent given values to the array 
	//this array can contain four values... its length is 4
	
	System.out.println(array.length);
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
	//give values to the array:
	array[1]= 100;
	array[0]=200;
	System.out.println(array[1]);
	System.out.println(array[0]);
	
	
	array[3]=500;
	System.out.println(array[3]);
	//int [] array2;
	//System.out.println(array2[0]); //arays size must be initilized first
	
	Scanner scan = new Scanner(System.in);
	int[] Inputs = new int [5]; // in this array we can store 10 elements with the highest number of index is 9
	for(int i = 0; i<Inputs.length; i++) {
	System.out.println("Please enter a number");
	Inputs[i] = scan.nextInt();
	
	}
	
	for(int i=0; i<Inputs.length; i++) {
		System.out.print(Inputs[i]+" ");
	}
	String[] AllStudentsNames = new String [358]; // the new keyword in array is used to give the size of the array only
	             AllStudentsNames = new String[1000];                                 // now you can ask the user to enter 358 names to the loop
}
}

