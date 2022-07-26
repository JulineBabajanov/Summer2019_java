package day26_ForEach;
import java.util.Arrays;
public class ForEach_Multi {
public static void main(String[] args) {
	
	int [] arr1D= {1,2,3,4};
	for(int each: arr1D) {
		System.out.print(each +" ");
	}
	System.out.println();
	
	int [] [] arr2D= { {1,2,3,4,} , {5,6,7,8, 9} };
	
	for(int i=0; i<arr2D.length;i++){
		for (int j=0; j< arr2D[i].length; j++)
			System.out.print(arr2D[i][j]+ " ");
	}
	
	String[][] str2D= {{"Syfo", "Bibish"}, {"Syfoooo", "Julia"}  };
	
	for(String[] each1DArrays : str2D ) {
		System.out.println(Arrays.toString(each1DArrays)  );
		
		for(String EachValues : each1DArrays) {
			System.out.print(EachValues+ " ");
		}
	}
	int 
	
	
}
}
