package day20_Review;

import java.util.Scanner;

public class stringRev {
public static void main(String[] args) {
	
	
	/*  substring, indexOf, lastIndexOf, replace, replaceFirst, equals, 
	 * 
	 * equalIgnoreCase, contains, startsWith, endsWith, charAt, trim
	 *  
	 *  length, concat, isEmpty, toUpperCase, toLowerCase
	 * 
	 */
	
	
	//substring- creating a sub value of the String
	
	String str = "Cybertek School"; //string literals . all string is object
	
	str = str.substring(0,str.indexOf("k")+1);
	System.out.println(str);
	
	
	String str2 = "Cybertek School";
	
	str2 = str2.substring(str2.indexOf("S"), str2.indexOf("l")+1);
	
	
	System.out.println(str2);
	
	String s1 = "Java is a fun language, I Love java, java";
	
	System.out.println(s1.indexOf("ag"));
	
    System.out.println(s1.lastIndexOf("ava"));
	
	System.out.println(s1.indexOf("ava,"));
	
	String name = "Cybertek School Batch 12";
	
	int length = name.length();
	System.out.println(length);
	
	name = name.replace("e", "a");
	System.out.println(name);
	
	//name = name.replace(" ", "");
	System.out.println(name);
	
	name = name.replace("School", "Family");
	System.out.println(name);
	
	String A1 = "Java is Fun, Java is object oriented, Java is cool";
	
	A1 = A1.replaceFirst("Java", "C++");
	
	System.out.println(A1);
	
	
	String R1 = "Cybertek";  // string pool
	String R2 = new String ("cybertek");  //heap memory
	System.out.println(R1 == R2);
	
	System.out.println(R1.equalsIgnoreCase(R2));
	
	
	String spaces = "                                      ";
	
	System.out.println(spaces.trim());
	
	
	
	
	String C1 = "Cybertek";
	
	char ch = C1.charAt(4);
	System.out.println(ch);
	
	
	String C2 = " Please do more and more java practices tomorrow";
	
	char ch2 = C2.charAt(C2.lastIndexOf("w"));
	System.out.println(ch2);
	
	
	String sentences = "ABCDEFGHIJKLMN";
	System.out.print(sentences.charAt(0)+" ");
	System.out.print(sentences.charAt(sentences.length()-1 ) );
	System.out.println();
	
	String result = ""+ sentences.charAt(0)+sentences.charAt(sentences.length()-1);
	System.out.println(result);
	
	String Gmail = "cybertekSchool@gmail.com";
	
	boolean R = Gmail.endsWith("@gmail.com");
	System.out.println(R);
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Please enter your email address");
	
	String GmailAddress = scan.nextLine().toLowerCase();
	
	if(GmailAddress.endsWith("@gmail.com")) {
		System.out.println("It's a valid gmail address");
	}else {
		System.out.println("Invalid gmail address");
	}
	
	
	System.out.println("Enter a web address");
	String URL = scan.nextLine().toLowerCase();
	
	if(URL.startsWith("www.")&& URL.endsWith(".com")) {
		System.out.println("It is a valid web address");
	}else {
		System.out.println("It is an invalid web address");
	}
	
	
	String salary = "1000$";
	
	boolean result2 = salary.contains("$");
	
	System.out.println(result2);
	
	String SchoolName = "Cybertek";
	SchoolName = SchoolName.concat(" School");
	System.out.println(SchoolName);
	
	String school = "Cybertek "+1231;
	
	school = school.concat(" School1");
	System.out.println(school);
	
	
}
}
