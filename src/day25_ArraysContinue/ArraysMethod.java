package day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethod {
	
	public static void main(String[] args) {
		

		int num1 = 10;
		System.out.println(num1);
		
		System.out.println();
		
		int [] arr = {1, 2, 3};
		System.out.print(arr);
		
		// to print entire Array as a whole we need to convert it to String... to String method
		
		/*Arrays utiltities....
		 * Arrays.toString(VariableName): used for converting single dimentional arrays to a String value
		 * 
		 * Arrays class: Utility of all the arrays, 
		 *      Arrays class is presented in "Java.util" package
		 *      Arrays.toString(Variable); it converts an array to String value
		 *      
		 *      Arrays class is presented in "java.util" package
		 */
		System.out.println();
		String str = Arrays.toString(arr);
		System.out.print(str);
		System.out.println();
		
		String [] names = {"Elvira", "Bibish", "Tural", "Dualet", "Hakan"};
		System.out.println(Arrays.toString(names));
	
		/*
		 * Arrays.sort(variableName): sorts values of array in acsending order(from smallest to largest)
		 */
		int [] Numbers = {9,8,100, 3000, 4, 5, 6, 9, 8};
		System.out.println(Arrays.toString(Numbers));
		Arrays.sort(Numbers); // sorts all the values of the array in acsending order
		System.out.println(Arrays.toString(Numbers));
		
		System.out.println("Maximum: "+Numbers[Numbers.length-1]);
		System.out.println("Minimum: "+Numbers[0]);
		
		String [] NameLists = {"Alma", "Enes", "Myra", "Smith", "Sarah", "Lexi", "Abc"};
		Arrays.sort(NameLists); //alphabetical order
		System.out.println(Arrays.toString(NameLists));
		
		char [] ch = {'0' , '1', '9' , '8' , '1' , '2' , '3'};
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		int [] nums = {2000, 90, 89, 78, 65, 5555, 444, -5};
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println("Minimum number: "+nums[0]);
		System.out.println("Max number: "+nums[nums.length-1]);
		System.out.println("Second maximum number: "+nums[nums.length-2]);
		System.out.println("Second min number "+nums[1]);
		
		/*
		 * write a program that can sort the arrays in Decending order (largest to smallest)
		 */
		int [] MyNumbers = {99, 10, 200, 3000, 40, 50, 5000};
		 //                 0    1   2    3     4  5    6
		Arrays.sort(MyNumbers);
		System.out.print(Arrays.toString(MyNumbers));
		
		System.out.println();
		String result = "[";
		for(int i = MyNumbers.length-1; i>= 0; i--) {
			result+=MyNumbers[i]+", ";
			//System.out.print(MyNumbers[i]+", ");
		}
		System.out.println();
		result = result.trim().substring(0,  result.length()-2)+"]";
		
		System.out.println(result);
		
		int [] arr2 = {99, 10, 200, 3000, 40, 50, 5000};
		Arrays.sort(arr2);
		int [] arr3 = new int [arr2.length];
		
		int z = 0;
		for(int i = arr2.length-1; i>=0; i--) {
			arr3[z]=arr2[i];
			z++;
		}
		System.out.println("Acsending order is: "+Arrays.toString(arr2));
		System.out.println("Decsending order is: "+Arrays.toString(arr3));
		
		int [] arr4 = {99, 100, 50, 200, 300, 5000};
		Arrays.sort(arr4); // array will be printed in acsending order
		int [] Decending = new int [arr4.length];
	/*
		Decending[1]=arr4[5];
		Decending[2]=arr4[4];
		Decending[3]=arr4[3];
		Decending[4]=arr4[2];
		Decending[5]=arr4[1];
		*/
		int Z = 0;
		for(int i = arr4.length-1; i>=0; i--) {
			Decending[Z]=arr2[i];
			Z++;
		}
		System.out.println(Arrays.toString(arr4));
		System.out.println("Decending: "+Arrays.toString(Decending));
		
		String [] arr9 = {"D", "B", "C"};
	//	String str9 = Arrays.sort(arr9);
		
	
		
		
		
	}
}
