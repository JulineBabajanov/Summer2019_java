package day15_Scanner_StringClass;

import java.util.Scanner;

public class StringMethodsNew {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	
	String str = "Cybertek";
	//index num:  01234567
	
	//charAt(index): takes the index number and returns the character as char value (can either print it out or assign it as char)
	System.out.println(str.charAt(7));
	
	char ch = str.charAt(4);
	System.out.println(ch);
	
String str2 = "Mu htar";

System.out.println(str2.charAt(3));

String str3 = "Hello";
char ch3 = str3.charAt(4);
System.out.println(ch3);


//length(): method == returns the total number of characters as an int value

String name = "Donald J Trump";
System.out.println(name.length());

//concat():  used to concat two strings together
/* concat(str): it takes a String and concats it to the String variable, 
 * and then returns a NEW String value
 * 
 */

String s1 = "Cybertek";
s1.concat(" School");
System.out.println(s1);//Cybertek , because String is immutable

s1 = s1.concat(" School"); //assigning a new value Cybertek School
System.out.println(s1);

//toUpperCase():  converts all characters to upper case

String N = "cybertek";
N.toUpperCase();
System.out.println(N); //string is immutable returns it as a new string value in all lower case.

//need to re assign variable 

N = N.toUpperCase();
System.out.println(N); //since re assigned now its all upper case CYBERTEK

//toLowerCase(): converts all characters to all lower case 

String M = "Juline Babajanov";
M=M.toLowerCase();
System.out.println(M);
M=M.toUpperCase();
System.out.println(M);

String name1 = "ABDURAHMAN";
name1 = name1.toLowerCase();
System.out.println(name1);


String a = "Batch 12 Javengers";
char ch6 = a.charAt(9);

System.out.println(ch6);
System.out.println(a.charAt(11));

System.out.println(a.length());

int  Length= a.length();
System.out.println(Length);
int HighestIndexNumber = a.length()-1;
System.out.println(HighestIndexNumber);

//length() returns the total number of characters in the String as an int value


String b = "Cybertek";
b = b.concat(" Batch12 Javengers");
System.out.println(b);

String d = "book";
System.out.println(d.toUpperCase());


String e = "JAVA IS FUN";
e.toLowerCase();
System.out.println(e);
String f = e.toLowerCase();
System.out.println(f);

























}
}
