package day24_JavaRecap;

public class CombineTwoArrays {
public static void main(String[] args) {
	
	int [] array1= {1,2,3};
	int [] array2= {3,4,5,6, 7};
	
	int[] array3= new int [array1.length + array2.length];
	
	for(int i = 0; i<array1.length; i++) {
		array3[i]=array1[i];
		//assigning all values of array1 to array3 (first 3 index)
	}
	for(int i = 0; i<array2.length; i++) {
		array3[i+array1.length]=array2[i];
		//assigning all the values of array2 to arrays3 (remaining index)
		
	}
	for(int i=0; i<array3.length;i++) {
		System.out.print(array3[i]+" ");
	}
	
	
	
}
}
