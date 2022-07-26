package day22_nestedLoop;

import java.util.Scanner;

public class warm_up {
public static void main(String[] args) {
	
	for(int i = 0; i >=10; i+=2) {
		System.out.println("Hello "+i);
	}
	
	
	System.out.println("\n\n\n"+"Hello"+"\t\t\t"+"Hello");
	
     for(int t = 0; t<=2;t++) {
    	 System.out.println("Happy New Year Friends!");
     }
     
     int apples = 1;
     
     while(apples<=3) {
    	 System.out.println("Eating an apple: "+apples);
    	apples++;
     }
     
     System.out.println("No more apples:(");
     
     int count = 1;
     
     while(count<=10) {
    	 System.out.print(count+", ");
    	 count++;
     }
     System.out.println("Thats all!");
     
     int number, cont;
     
     Scanner keyboard = new Scanner(System.in);
     System.out.println("Enter a number");
     number = keyboard.nextInt();
     
     cont = 1;
     while(cont<=number) {
    	 System.out.println(cont+", ");
    	 cont+=5;
     }
     
     
}
}
