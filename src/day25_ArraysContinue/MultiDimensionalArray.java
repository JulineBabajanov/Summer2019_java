package day25_ArraysContinue;

import java.util.Arrays;

public class MultiDimensionalArray {
public static void main(String[] args) {
	
/* n dimensional array contains multiple (n-1) dimensional array
 * 
 */
	int [] arr1D = {1, 2, 3}; //1 dimensional array and contains multiple values
	
	//2 dimensional array : array that contains multiple (2-1) dimensional array 
	
	int  [][] arr2D = { {1, 2, 3} , {4, 5, 6} };
	
	String [] arr = {"A", "B"};
	    //                   0    1     0      1
	String [] [] str2D = { {"A", "B"}, {"C", "D", "E"} };
	              //          0            1
	// [represents the index number of 1 dimensional arrays] [represents the index number of the values] 
	
	System.out.println(str2D[0][0]); // print A
	System.out.println(str2D[1][1]); //print D
	System.out.println(str2D[1][2]); //print E
System.out.println(Arrays.toString(str2D[0]));//print out first one dimensional array [A, B]
System.out.println(Arrays.toString(str2D[1]).replace("[", "").replace("]", "")); //print out C, D, E
	
//Arrays.deepToString(variableName) converts multi dimensional arrays to String value

System.out.println(Arrays.deepToString(str2D).replace("[", "").replace("]", "")); //in order to print multi dimensional arrays use deepToString

//to print single dimensional arrays Arrays.toString(str2D)
//                       0,1    0,1    0,1
int [] [] Numbers2D = { {1,2}, {3,4}, {5,6, 7, 8, 9, 10} }; //2d array contains multiple single dimensional arrays
//contains 3 index       0      1       2
System.out.println(Numbers2D[2][1]); //print 6
System.out.println(Numbers2D[2][5]); // print 10
System.out.println(Arrays.toString(Numbers2D[2]));
System.out.println(Arrays.deepToString(Numbers2D).replace("[", "").replace("]", "")); // print the entire 2D array

// 3 dimensional array contains multiple 2 (n-1) dimensional arrays
int [][] Array2D = {{1,2}, {3,4} };

int [][][] Array3D = { {{1,2}, {3,4} } , {{5,6}, {7,8} }  }; //3D array
//                        0                    1           
// [index numbers of 2D array] [index number of 1D array] [index number of value]
System.out.print(Array3D[0][1][1]+", ");
System.out.print(Array3D[1][1][0]+", ");
System.out.print(Array3D[0][0][1]);
System.out.println();
System.out.println(Array3D[1][1][1]);
System.out.println(Array3D[1][0]);
System.out.println(Arrays.toString(Array3D[1][0]).replace("[", "").replace("]", "").replace(",", ""));
System.out.println(Array3D[1]);
System.out.println(Arrays.deepToString(Array3D[1]));
System.out.println(Arrays.deepToString(Array3D));


int [][][] numbers33D = {{{100,200}, {300,400} } , {{500,600}, {700,800} }};

System.out.println(Arrays.deepToString(numbers33D).replace("[", "").replace("]", ""));
//n dimensional array contains multiple (n-1) dimensional array

//4  dimensional array contains multiple 3 dimensional arrays                               
int [][][][] numbers4D = { { {  {1,2} }  ,{ {3,4} }}   , { { {4,2} } ,{   { 3,6} } } };
System.out.println(Arrays.deepToString(numbers4D[1][1]));




	
	
	
	
}
}
