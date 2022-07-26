package day18_StringMethodsCont;

import java.util.Scanner;

public class StringMetho {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	
	/*
	 *  indexOf(str): returns the index number of the first occured character in the given String as an int value
	 * 
	 * 
	 */
	
	String A1 = "Batch 12 is a great batch";
	int num = A1.indexOf("ea");
	System.out.println(num);
	
	String B1 = "today is tuesday, today we have class in the afternoon";
	int num1 = B1.indexOf("te");
	System.out.println(num1);
	
	String Address = " 7925 Jones Branc Dr, Mclearn, VA 22003";
	
	//String cityName = Address.substring(22, 29);
	int beginIndex = Address.indexOf("M");
	System.out.println(beginIndex);
	//System.out.println(cityName);
	
	String email = "RandomEmails@gmail.com";
	int begin2 = email.indexOf("g");
	int end2 = email.indexOf(".com");
	String emailType = email.substring(begin2, end2);
	System.out.println(emailType);
	
	/* lastIndexOf(): returns the last occured character index number as an int value.
	 * 
	 */
	
	String str = "ABCDABCD";
	int n2 = str.lastIndexOf("D");
	System.out.println(n2);
	
	String myEmail = "Myemail.school@hotmail.com";
	int Begin = myEmail.indexOf("@")+1;
	int End = myEmail.lastIndexOf(".");
	String EmailType = myEmail.substring(Begin, End);
	System.out.println(EmailType);
	
	
	
}
}
