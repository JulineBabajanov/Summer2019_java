package day24_JavaRecap;

public class Quiz05 {
public static void main(String[] args) {
	//Q1
	String str=" ";
	str.trim();
	boolean A= str.isEmpty();
	System.out.println(A); //false because str was never reinitalized
	
	//Q2
	String ta="A";
	ta = ta.concat("B"); //ta=AB
	String tb="C";
	ta=ta+tb; //ABC
	ta.replace('C', 'D');//ignored bc not reassigned
	ta=ta+tb; //ABCC
	System.out.println(ta);
	
	//Q3
	String str8="Hello World";
	str8.trim();
	int z = str8.indexOf(" ");
	System.out.println(z);
	
	//Q4
	String str1 ="Java";
	String str2= new String ("java");
	/*Line 1*/ { //if(str1.equalsIgnoreCase(str2))
	System.out.println("Equal");
	//}else{
		System.out.println("Not Equal");
	}
	//Q5
	String str5="Batch 12";
	int Z = str5.trim().length();
	System.out.println(Z); //returns as an int
	
	//Q6
	String str6="Batch 12";
	String str3= "Batch 12";
	if(str6==str3)
		System.out.println("Cybertek");
	else
		System.out.println("Java Batch");
	
	//Q7
	String s1 ="abc";
	String s2 ="abc";
	System.out.println("s1==s2: "+s1==s2);//if in parenthesis then would give s1==s1: true
	//  it concats since the s1==s2 are not in paranthesis
	//                  "s1==s2: ABC"=="ABC" ?FALSE
	
	//Q8 what method is used to read String input===> next() nextLine()
	//                                              next takes one word  and nextLine takes entire sentence
	
	//Q9 What package do you need to import to use Scanner class in Java? ==> java.util
	
	//Q10 valid import statement
	//package Tests
	//import java.util.*
	//public class test{   }
	
	
}
}
