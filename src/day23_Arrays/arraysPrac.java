package day23_Arrays;

import java.util.Scanner;

public class arraysPrac {
public static void main(String[] args) {
	
	String [] AllStudents = {"Ibrahim", "Zuleyha", "Elina"};
	
	AllStudents[0] = "Marufjon";
	System.out.println(AllStudents[0]);
	
	int [] array = new int [4]; // this array can contain four values. its length is four
	System.out.println(array.length);
	Scanner scan = new Scanner (System.in);
	int [] Inputs = new int [5];
	for(int i = 0; i <Inputs.length; i++) {
	System.out.println("Enter a number");
        Inputs[i] = scan.nextInt();
	}
	for(int i = 0; i <Inputs.length; i++) {
		System.out.print(Inputs[i]+" ");
	}
	
	String [] AllStudentsNames = new String [358];
	
	// new keyword in array is used to give the size of the array only
	
	
	}
}

