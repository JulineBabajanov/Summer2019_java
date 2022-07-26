package day20_Review;

import java.util.Scanner;

public class StringMethods {
public static void main(String[] args) {
	/*methods: substring, index of, lastIndexOf replace, replaceFirst
	 * equalIgnoreCase, equal, contains, startsWith, endsWith
	 * charAt, trim, length, concat, isEmpty, toUpperCase, toLowerCase
	 */
	
	

//subString: creating a sub value of the String
	String str ="Cybertek School"; // string is object and called string literals
    
	 str.substring(0, str.indexOf("k")+1 );
	System.out.println(str);
	str = str.substring(0, str.indexOf("k")+1);
	System.out.println(str);
	
	
	String str2 = "Cybertek School";
	str2 = str2.substring(str2.indexOf("S"));
	System.out.println(str2);
	
	//index of:
	
	String s1= "Java is a fun language, I Love java";
	
	System.out.println(s1.indexOf("ag"));
	
	//lastIndexof(); returns the last occured chars index num
	System.out.println(s1.lastIndexOf("a"));
	
  //replace: replaces the old value with the new one
	
	String name ="Cybertek School Batch12";
	int length = name.length();
	System.out.println(length);
	name = name.replace(" ", "");
	System.out.println(name.length());
	
	
	String A1 = "Java is Fun, Java is object oriented";
	A1 = A1.replace("Java", "C++");
	System.out.println(A1);
	
	String R1 = "Cybertek";//string pool
	
	String R2 = new String("Cybertek");//heap
	String R3 = new String("cybertek");
	System.out.println(R1==R2);//false, different locations
	System.out.println(R1.equals(R2)); //true, only visible texts are same
	System.out.println(R1.equals(R3));// false, case sensitivity
	System.out.println(R1.equalsIgnoreCase(R3));//true, it checks visible text w/o case sensitvity
	
	//trim method... trim(): to remove the unused spaces.
	
	String spaces = "     M        ";
	spaces = spaces.trim(); //returns just M
	System.out.println(spaces);
	
	String N1 ="    ";
	N1 = N1.trim();
	System.out.println(N1.isEmpty());
	
	String N2 = "Tomorrow is gonna be a great day to do repl.its";
	N2 = N2.trim();
	System.out.println(N2);
	
	N2 = N2.replace(" ", "");
	System.out.println(N2);
	
	//charAt(): returns a specific character from the String
	String C1 ="Cybertek";
	char ch = C1.charAt(2);
	System.out.println(ch);
	
	String c1 = "Kennywood";
	char ch1 = c1.charAt(5);
	System.out.println(ch1);
	
	String C2 = "Please do more and more java practice tomorrow";
	char ch2 = C2.charAt(C2.lastIndexOf("w"));
	System.out.println(ch2);
	
	String sentences = "ABCDEFGHIJKLMN";
	
	System.out.println(sentences.charAt(0));
	System.out.println(sentences.charAt(sentences.length()-1));
	
	String result = "" + sentences.charAt(0)+" " +sentences.charAt(sentences.length()-1);
	System.out.println(result);
	
	
	String word = "hello world how are you doing today";
	
	System.out.println(word.charAt(0));
	System.out.println(word.charAt(word.length()-1));
	String result1 =""+ word.charAt(0)+word.charAt(word.length()-1);
	
	System.out.println(result1);
	
	String class1 = "Tomorrow we do not have class";
	System.out.println(class1.charAt(0));
	System.out.println(class1.charAt(class1.length()-1));
	
	String result2 = class1.charAt(0)+ " "+class1.charAt(class1.length()-1);
	
	System.out.println(result2);
	
	String Gmail = "cybertekSchool@gmail.com";
	boolean R = Gmail.endsWith("@gmail.com");
	System.out.println(R);
	
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your email address");
	String GmailAddress = scan.nextLine();
	
	if (GmailAddress.endsWith("@gmail.com")) {
		System.out.println("Its a valid email address");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
