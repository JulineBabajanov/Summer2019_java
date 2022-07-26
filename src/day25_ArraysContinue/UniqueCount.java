package day25_ArraysContinue;

public class UniqueCount {
public static void main(String[] args) {
	
	int [] arr = {1, 1, 2, 2, 3, 4, 8, 9, -1};
	//index:        0  1  2  3  4  5  6  7
	for(int j =0; j<arr.length;j++) {
	
	int count = 0; //to find out how many times a value is appeared in the array
	for( int i = 0; i<arr.length;i++) {
		if(arr[i]==arr[j]) { // compares each index of the array with the given value
			count++;//everytime if the value is occured in the array the count will go up
		}
	}
  if (count==1) {// if only apeared once we will print that value out
	  System.out.print(arr[j]+" ");
  }
	
}
}
}