package day24_JavaRecap;

import java.util.Scanner;

public class ArraysPrac {
public static void main(String[] args) {
	
	  int [] numbers = new int [5];
	Scanner scan = new Scanner (System.in);
	
	for(int i=0; i<numbers.length; i++) {
		System.out.println("Enter a number");
		numbers [i] = scan.nextInt();
	}
	int sum = 0;
	for(int i = 0; i <numbers.length;i++) {
		//System.out.print(numbers[i]+" ");
		sum+=numbers[i];
		
	}
   
	System.out.println(sum);
     
	String [] names = {"Seyfo", "Asiya", "Myra", "Keteryna", "Daulet", "Jakhongir and Juline Babajanov"};
	
	int max = 0;
	String LongestName = "";
	
	for(int i =0; i <names.length; i++) {
		if(names[i].length() > max) {
			max = names[i].length();
			LongestName = names[i];
		}
	}
	System.out.println(max+" "+LongestName);
}
}
