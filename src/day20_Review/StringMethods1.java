package day20_Review;

import java.util.Scanner;

public class StringMethods1 {
public static void main(String[] args) {
	
	/*
	 * methods: substring, indexOf, lastIndexOf, replace, replaceFirst, 
	 * equals, equalIgnoreCase, contains, startsWith, endsWith, charAt,
	 *  trim, length, concat, toUpperCase, toLowerCase
	 */
	//subString method: creating the sub value of the String
	
	String str = "Cybertek School"; //String literals
    str.substring(0, str.indexOf("k")+1);
   
    System.out.println(str);// Cybertek School, string is immutable
    
    str= str.substring(0, str.indexOf("k")+1);
    System.out.println(str); //cybertek
    
    
    String str2 = "Cybertek School";
    str2 = str2.substring(str2.indexOf("S"));
    System.out.println(str2);
    
    //index of:
    String s1 = "Java is a fun language, I Love java, java,";
    System.out.println(s1.indexOf("a"));
    System.out.println(s1.indexOf("an"));
    System.out.println(s1.indexOf("ag"));
    System.out.println(s1.lastIndexOf("Ja"));
    
    //lastIndexOf: returns the last occurred char's index num
    
    System.out.println(s1.lastIndexOf("ava"));
    System.out.println(s1.indexOf(", java,"));
    
    //replace method: replaces the old value with a new value
    
    String name ="Cybertek School Batch 12";
    int length = name.length();
    System.out.println(length);
    
   // name = name.replace(" ", "");
    System.out.println(name);
    System.out.println(name.length());
    
    name = name.replace("e", "a");
    System.out.println(name);
    
    name = name.replace("School", "family");
    System.out.println(name);
    
    //replaceFirst: used for replacing the first occured old character with a new character
    
    String A1 = "Java is Fun, Java is object oriented, Java is cool";
    A1 = A1.replaceFirst("Java is o", "C++ is o");
    A1 = A1.replace("d, Java", "d, C#");
    System.out.println(A1);
    
    A1 = A1.replaceFirst(" ", "");
    System.out.println(A1);
    
    /*
     * ==, .equals, equalsIgnoreCase for String equality
     */
    String R1 = "Cybertek";//String literal goes to the String Pool
    String R2 = new String ("Cybertek");//heap
    String R3 = new String ("cybertek");
    System.out.println(R1==R2);//false, different locations
    System.out.println(R1.equals(R2));//true, it only checks the visible text only and they are the same
    System.out.println(R1.equals(R3));//false because case sensitivity
    System.out.println(R1.equalsIgnoreCase(R3));//true, ignores case sensitivity and checks only visible text without checking case sensitivty 
    
    
    String yes = "Hello";
   yes= yes.replace("Hel", "Yel");
    System.out.println(yes);
    String no = "Hello";
   // no=no.equals(no);
    String no1 ="Hello";
    System.out.println(no.equalsIgnoreCase(no1));
    System.out.println(no==no1);
    System.out.println(no.equals(no1));
    System.out.println(no.equalsIgnoreCase(yes));
	
    //trim(): method is used for unused spaces. 
    String  spaces = "          M        ";
   spaces= spaces.trim();
   System.out.println(spaces);
   
   String N1="      ";
   N1=N1.trim();
   System.out.println(N1.isEmpty());
   
   String N2 = "Tomorrow is gonna be a great day to do repl.its";
   N2 = N2.trim();
   System.out.println(N2);
   N2 = N2.replace(" ", "");
   System.out.println(N2);
	
	//charAt(index): returns a specific character from a string
   
   String C1 = "Cybertek";
   //           01234567
  char ch = C1.charAt(4);
   System.out.println(ch);
   String C2 = "Please do more and more java practices tomorrow";
   char ch2 = C2.charAt(C2.lastIndexOf("o")+1);
   System.out.println(ch2);
	
	String sentences = "Tomorrow we do not have class";
	System.out.println(sentences.charAt(0));
	System.out.println(sentences.charAt(sentences.length()-1));
	String result =""+sentences.charAt(0)+" "+
			sentences.charAt(sentences.length()-1);
	System.out.println(result);
	
	String test = "Tomorrow will be a good day";
	System.out.println(test.charAt(0));
	System.out.println(test.charAt(test.length()-1));
	String result1 = test.charAt(0)+" "+test.charAt(test.length()-1);
	System.out.println(result1);
	
	String test1 = "How will you go to the grocery store, by car or bus?";
	System.out.println(test1.charAt(0));
	System.out.println(test1.charAt(test1.length()-1));
	String result2 = test1.charAt(0)+" "+test1.charAt(test1.length()-1);
	System.out.println(result2);
	
	//startsWith with and endsWith: Returns boolean, checks the starting and ending values
	
	
	String Gmail ="cybertekSchool@gmail.com";
    boolean R = Gmail.endsWith("@gmail.com");
    System.out.println(R);
	
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your email address");
    
    String GmailAddress = scan.nextLine().toLowerCase();
    
    if(GmailAddress.endsWith("@gmail.com")) {
    	System.out.println("It's a valid gmail address");
    }
    else {
    	System.out.println("Invalid gmail address");
    }
	
	//starts with www. && ends with
    System.out.println("Enter a web Address");
    String URL = scan.nextLine().toLowerCase();
    
    if(URL.startsWith("www.")&& URL.endsWith(".com")) {
    	System.out.println("it's a valid web address");
    }else {
    	System.out.println("Its an invalid URL");
    }
    
	//contains: checks if the given value is contained in the String or not...BOOLEAN
    
    String salary ="10$00";
    boolean result5 = salary.contains("$");
  
    System.out.println(result5);
    
    //concat: concates two String values
    String SchoolName="Cybertek";
    SchoolName= SchoolName.concat(" School");
   System.out.println(SchoolName);
    
	
	
	
	
	
	
	
	
	
	
	
}
}
