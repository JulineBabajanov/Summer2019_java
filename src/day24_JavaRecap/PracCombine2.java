package day24_JavaRecap;

public class PracCombine2 {
public static void main(String[] args) {
	
	int [] array1= {0, 1, 2, 3, 4};
	int [] array2= {5,6,7,8,9};
	
	int [] array3 = new int [array1.length+ array2.length];
	
	for(int i = 0; i<array1.length;i++) {
		array3[i]=array1[i];
	}
	for(int i = 0; i<array2.length; i++) {
		array3[i+array1.length]=array2[i];
	}
	
	for(int i = 0; i<array3.length; i++) {
		System.out.print(array3[i]+" ");
	}
	
}
}
