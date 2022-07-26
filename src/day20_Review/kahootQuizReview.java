package day20_Review;

import java.util.Scanner;

public class kahootQuizReview {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	
	
	//Q1:
	String str = "Hello World";
	//            012345678910
	//answer a
	System.out.println(str.substring(0,5));
	System.out.println(str.substring(10%2*3/2, 10*2/4));
	// answer b                      0,           5
	int a1=5;
	System.out.println(str.substring(a1-=a1/1, a1+=5));
	//                  a1=a1-5
	//                  a1=0,      a1 =5
	
	//answer c
	int a2=5;
	System.out.println(str.substring((++a2 - a2--) % 1, 11%6));
	//                                 6 -   6%1 , 5
	
	//answer d
	int a3=5;
	System.out.println(str.substring(a3*a3%a3, a3));
	//                                25%5,    5
	//                                  0,     5
	//******************* end of question 1******************
	
	
	//q3
	String s1 = "Java";
	String s2 = "java";
	
	System.out.println(s1.contentEquals(s2)); //false
	System.out.println(s1.equalsIgnoreCase(s2)); //true, checks visible text
	
	//Q4
	String str2 = " ";
	System.out.println(str2.trim().isEmpty());
	//now this string is a value of empty and a new string location"" //true
	
	System.out.println(str2.isEmpty()); //false
	
	str2 = str2.trim(); // str2="";
	System.out.println(str2.isEmpty()); //true
	
	//Q5
	
	String s3="java"; //string pool
	String s4=new String ("java");//heap location
	
	System.out.println(s3==s4);//false, not in the same memory location.
	System.out.println(s3.equals(s4)); // true, same visible text only checks
	
	//Q6
	String B1 = "Cybertek"; //string pool location 
	
	String B2 = new String (B1); //heap memory location
	String B3 = B2; //share the same memory location, heap
	String B4 = "Cybertek";
	
	System.out.println(B3 == B2);
	
	String name1 = "Cybertek";
	String name2 = new String(name1);
	String name3 = name2; //true, true
	
	System.out.println(name2==name3);
	System.out.println(" "+name3.equals(name2));
	
	
	//question 9
	
	//for(int i = 0; i<5; i--) { //i continues to decrease so it will never meet up to 5. will never be false so loop continues to run
	//	System.out.println("Hello Cybertek");
	//}//infinite loop is the answer
	
	
	//Question 10
	int z = 5;
	for(int i = 5; i>0; i--) {
		z+=i;
	}
	System.out.println(z); // i: 5, 4, 3, 2, 1
	
	
	
	
	
	//Q11
	/* (initialization; condition; iterator)
	 * 
	 */
	/*int t = 0;
	
	for(int i = 5; i<10; ) {
		i+=2;
	}	
*/	
	
	//int z=0;
	for(int j= 1; j<5; ) {
	    j++;
	  System.out.print(j+" ");
	}
	
	
}
}
