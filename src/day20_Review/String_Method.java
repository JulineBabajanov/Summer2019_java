package day20_Review;

import java.util.Scanner;

public class String_Method {
public static void main(String[] args) {
	/*methods: substring, indexOf, lastIndexOf, replace, replaceFirst, equals
	 * equalsIgnoreCase, contains, startsWith, endsWith, charAt, trim, length, concat, isEmpty
	 * toUpperCase, toLowerCase
	 */
	/*substring method is used to create the sub value of the String
	 * 
	 */
	
	String str = "Cybertek School";//string literals
	
	str = str.substring(0,  str.indexOf(" "));
	
	System.out.println(str);
	
	String str2 = "Cybertek School";
	
	str2 = str2.substring(str2.indexOf("S"));
	System.out.println(str2);
	
	
	String s1 = "Java is a fun language, I Love java";
	System.out.println(s1.indexOf("ag"));
	s1 = s1.substring(s1.indexOf("L"));
	System.out.println(s1);
	
	//lastIndexOf(): returns the last occurred chars index num
	
	System.out.println(s1.lastIndexOf("ov"));
	
	//replace: replaces the old value with the new one
	String name = "Cybertek School Batch 12";
	System.out.println(name.length());
	
	//name = name.replace(" ", "");
	System.out.println(name.length());
	name = name.replace("e", "a");
	System.out.println(name);
	
	name = name.replace("School", "Family");
	
	System.out.println(name);
	
	//replaceFirst used to replace the first occurred old character with the new character value
	
	String A1 = "Java is Fun, Java is object oriented";
	
	A1 = A1.replaceFirst("Java", "C++");
	System.out.println(A1);
	
	String R1 = "Cybertek";
	String R = "Cybertek";
	String R2 = new String ("Cybertek");
	System.out.println(R1 == R2);
	System.out.println(R == R1);
	
	String spaces = "      M       ";
	System.out.println(spaces.trim());
	
	String N1 = "            ";
	N1 = N1.trim();
	System.out.println(N1.isEmpty());
	
	String N2 = "Tomorrow is gonna be a great day to do repl.its";
	N2 = N2.replace(" ", "");
	System.out.println(N2);
	
	//charAt(): returns a specific character from the String
	
	String C1 = "Cybertek";
	char ch = C1.charAt(4);
	System.out.println();
	
	String sentences = "ABCDEFGHIJKLMN";
	
	System.out.println(sentences.charAt(0));
	System.out.println(sentences.charAt(sentences.length()-1));
	
	String result = ""+sentences.charAt(0)+sentences.charAt(sentences.length()-1);

	System.out.println(result);
	
	String Gmail = "cybertekSchool@gmail.com";
	boolean T = Gmail.endsWith("@gmail.com");
	
	System.out.println(T);
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Please enter your email address");
	String GmailAddress = scan.nextLine().toLowerCase();
	
	if(GmailAddress.endsWith("@gmail.com")) {
		System.out.println("A valid email address");
	}else {
		System.out.println("Invalid gmail address");
	}
	
	System.out.println("Enter a web address");
	String URL = scan.nextLine().toLowerCase();
	
	if(URL.startsWith("www.")&& URL.endsWith(".com")) {
		System.out.println("it's a valid web address");
	}else {
		System.out.println("it's invalid web address");
	}
	//contains method is used for : checks if the given value is contained in the String or not
	
	String salary = "1000$";
	boolean result2 = salary.contains("$");
	System.out.println(result2);
	
	
	//concat: concats two String values
	
	String SchoolName = "Cybertek";
	SchoolName = SchoolName.concat(" School");
	System.out.println(SchoolName);
	
	
	
}
}
