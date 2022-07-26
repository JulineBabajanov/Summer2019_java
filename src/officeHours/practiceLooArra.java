package officeHours;

import java.util.Arrays;

public class practiceLooArra {
public static void main(String[] args) {
	
	int[] numbers = {32, 45, 12, 0, 54};
	      //         0   1    2  3   4
	System.out.println(numbers[0]);
	
	System.out.println(numbers.toString()); //prints out a hashcode
	System.out.println(Arrays.toString(numbers)); //prints out in brackets with numbers
	String converted = Arrays.toString(numbers);
	System.out.println("Converted: "+converted); //converted data type to a STRING
	
	for(int i = 4; i>=0; i--) {  //reversed the index numbers
		System.out.print(i+" ");
	}
	//create a temporary variable : arrays name
	//for each loop
	System.out.println();
	for(int num : numbers) {
		System.out.println(num+" for each loop");
	}
	System.out.println();
	String[]words= {"abs", "er", "gdf"};
	for(String w : words) {
		System.out.print(w+" words ");
	}
	
}
}
