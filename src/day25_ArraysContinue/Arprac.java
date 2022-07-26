package day25_ArraysContinue;

public class Arprac {
public static void main(String[] args) {
	
	int [] arr = {1, 1, 2, 2, 3, 4, 5, 1, -1};
	
	for(int j = 0; j<arr.length; j++) {
	
		int count = 0; // to find out how many times a value is appeared in the array
	    for(int i = 0; i <arr.length; i++) {
		if(arr[i]==arr[j]) { // compares each index of the array with the given value
			count++; //every time if the value is occurred in the array, count will be increased by one
		}
	}
	    if(count == 1) { //if only appeared once, we will print the value out
	    	System.out.println(arr[j]);
	    }
	    
	    
	    
	}
}
}
