package day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		
		/*two methods that will be useful
		 * 
		 *  
		 * split(str): splits the string by the given value, and returns it as a String array
		 * toCharArray();
		 * 
		 */
		
		String sentence = "Today is great day Good day to learn java";
	
		String [] arr = sentence.split(" ");
		//System.out.println(Arrays.toString(arr));
		String str2 = Arrays.toString(arr);
		System.out.println(str2.replace("[", "").replace("]", ""));
		
		
		String email ="FirstName_LastName";
		String [] arr2 = email.split("_");
		String str = Arrays.toString(arr2);
		System.out.println(str.replace("[", "").replace("]", ""));
		
		String fullname = "Cybertek School Batch12";
		String [] array1 = fullname.split(" ");
		String school = Arrays.toString(array1);
		System.out.println(school.replace("[", "").replace("]", ""));
		
		String Java = "I love Java and Java is fun, Java is Life";
		String [] array2 = Java.split("Java");
		System.out.println(Arrays.toString(array2));
		System.out.println(array2.length-1);
		
		
		
		
		
		
		
		
		
		
	}

}
