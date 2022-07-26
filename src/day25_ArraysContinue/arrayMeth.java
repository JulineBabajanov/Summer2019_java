package day25_ArraysContinue;

import java.util.Arrays;

public class arrayMeth {
public static void main(String[] args) {
	
	int [] arr = {10, 5, 8, 20, 1, 6};
	
	Arrays.sort(arr);
    Arrays.toString(arr);
    
	String result = "[";
	
	for(int i = result.length(); i>=0; i--) {
		result+=arr[i]+",";
	}
	
	result = result.trim().substring(0, result.length())+"]";
	
	
	System.out.println(result);
	
	
}
}
