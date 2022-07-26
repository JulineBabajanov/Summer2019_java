package day18_StringMethodsCont;

import java.util.Scanner;

public class lastIndexOf {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	/*lastIndexOf(): returns the last occured character index number as and Int value
	 * 
	 * 
	 * 
	 */
	
	String str = "ABCDABCD";
	int n2 = str.indexOf("B");
	int n3 = str.lastIndexOf("B");
	System.out.println(n2);
	System.out.println(n3);
	
	
	String myEmail = "Myemail.school@gmail.com";
	int Begin = myEmail.indexOf("@")+1;
	int End = myEmail.lastIndexOf(".");
	String myEmailType =myEmail.substring(Begin, End);
	System.out.println(myEmailType);
	
	String email = "JBabajanov@yahoo.com";
	int Begin1 = email.indexOf("@")+1;
	int End1 = email.lastIndexOf(".");
	String email1 = email.substring(Begin1, End1);
	System.out.println(email1);
	
	System.out.println("Enter a word");
	String two = input.nextLine();
	System.out.println("Enter a word");
	String two1 = input.nextLine();
	int Beg = two.indexOf(ch)
	
	
	
}
}
