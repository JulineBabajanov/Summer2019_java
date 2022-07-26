package day25_ArraysContinue;

import java.util.Arrays;
import java.util.Scanner;

public class arrayMethod {
public static void main(String[] args) {
	
	//to print the entire array whole, you need to convert it to String
	/*to String method
	 *Arrays.toString (VariableName): used for converting single dimentional arrays to String value
	 *
	 *arrays class: is the utilities of all of the arrays class
	 *Arrays class is presented in "Java.util" package
	 */
	

	
	int [] arr = {1, 2, 3};
	
	String str = Arrays.toString(arr);
	System.out.println(str);
	
	
	String [] names = {"Elvira", "Bibish", "Tural", "Daulet", "Hakan"};
	Arrays.sort(names);
	String numbers = Arrays.toString(names);
	
	System.out.println(numbers);
	
	String [] animals = {"Cow", "Horse", "Kitten", "Dog"};
	System.out.println(Arrays.toString(animals));
	
/* Arrays class is presented in the "java" util
 * Arrays.sort(variableName): sorts the values of the arrrays in accending order (smallest to largest)
 */
	Scanner scan = new Scanner (System.in);
	
	int [] Numbers = {9, 8, 100, 3000, 4, 6, 5};
	System.out.println(Arrays.toString(Numbers));
	
	Arrays.sort(Numbers);
	System.out.println(Arrays.toString(Numbers));
	
	System.out.println("Maximum: "+Numbers[Numbers.length-1]);
	System.out.println("Minimum: "+Numbers[0]);
	
	
	String [] Namelists = {"Alma", "Enes", "Myra", "Smith", "Sarah", "Lexi"};
	Arrays.sort(Namelists);
	
	System.out.println(Arrays.toString(Namelists));
	
	char [] ch = {'0', '9', '8', '5', '3', '2', '1'};
	
	Arrays.sort(ch);
	System.out.println(ch);
	System.out.println(Arrays.toString(ch));
	
	int [] nums = {2000, 90, 89, 78, 65, 5555, 444, -5 };
	
	Arrays.sort(nums);
	
	System.out.println(Arrays.toString(nums));
	System.out.println("Minimum: "+nums[0]);
	System.out.println("Maximum: "+nums[nums.length-1]);
	System.out.println("Second max number is "+nums[nums.length-2]);
	System.out.println("Second minimum number is: "+nums[1]);
	
	/*
	 * write a program that can sort the arrays in Decending order
	 */
	
	int [] MyNumbers = {99, 10, 200, 3000, 40, 50, 5000};
	
	Arrays.sort(MyNumbers);
	System.out.println(Arrays.toString(MyNumbers));
	String result = "[";
	for(int i = MyNumbers.length-1; i>=0; i--) {
		result+=MyNumbers[i]+", ";
		
	}
	//System.out.println();
	
	result = result.trim().substring(0, result.length()-2)+"]";
	System.out.println(result);
	
	int [] arr2 = {99, 10, 200, 3000, 40, 50, 5000};
	Arrays.sort(arr2);
	int [] arr3 = new int [arr2.length];
	int z = 0;
	for(int i = arr2.length-1; i>=0; i--) {
		arr3[z] = arr2[i];
		z++;
	}
	System.out.println(Arrays.toString(arr2));
	System.out.println(Arrays.toString(arr3));
}
}
