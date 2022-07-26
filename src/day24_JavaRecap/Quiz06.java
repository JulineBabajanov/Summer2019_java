package day24_JavaRecap;

public class Quiz06 {
public static void main(String[] args) {
	
	//Q1 true
	
	//Q2 false
	
	//Q3 exits the loop immediately
	
	//Q4 
	int a = 0;
	while(a<=6) { //a= 2 4 6 8
		a+=2;
	}
	System.out.print(a);
	System.out.println();
	
	//Q5
	int num = 5;
	do {
		System.out.print(--num+" ");
	}while(num==0);//answer is 4
	
	//Q6
	System.out.println();
	int I; 
	int J=7; 
	for(I=0; I<J-1; I+=2) {
		//I started from 0; I<6; I++
		System.out.print(I+" "); //0 2 4
	}
	System.out.println();
	//Q7
	for(int Y=0; Y<=4;) {
		Y++;
		System.out.print(Y+" ");
		//Y++;
	}
	System.out.println();
	//Q8 string is immutable
	String str8="Cybertek";
	str8.concat("School");
	str8.toLowerCase();
	System.out.println(str8); //answer is still the same.... Cybertek
	
	String s1="Hello";
	s1=s1.toUpperCase();
	System.out.println(s1);
	
	//Q9
	//for(int i =0; i<5;i--) {
		//System.out.println("Hello Cybertek");  infinite loop
	//}
	
	//Q 10
	int z = 5; // 
	for(int i=5;i>0;i--) {
		z+=i;
	}
	
	System.out.println(z);
	
	
	
	
}
}
