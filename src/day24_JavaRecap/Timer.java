package day24_JavaRecap;

import java.util.Scanner;

public class Timer {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter the minutes");
	int minutes = scan.nextInt();
	
	for(int i = minutes; i>0;--i) {
		if(i<0)
			break;
		
		for(int z = 59; z>0; --z) {
			System.out.println((i-1)+" minutes and "+z+" seconds left");
			try {
				Thread.sleep(100);
			}catch(Exception e) {}
		}
	}
	System.out.println(" \n \t \t********************************************* ");
    System.out.println("  \t \t***                                       *** ");
    System.out.println("   \t \t***  You didn't finish cleaning your room? *** ");
    System.out.println("    \t \t***                                       *** ");
    System.out.println("     \t \t********************************************* "); 
	
}
}