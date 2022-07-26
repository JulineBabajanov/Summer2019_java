package day15_Scanner_StringClass;

public class StringCl {
public static void main(String[] args) {
	
	//String methods.
	String str = "Cybertek";
	//index num   01234567	each index represents a character
	
	System.out.println( str.charAt(0) );
	
	char ch = str.charAt(4);
	System.out.println(ch);
	
	String str2 = "Mu htar";
	
	System.out.println(str2.charAt(3));
	
	
	//length String str = "Cybertek";   str.length()==>8
	
	String name = "Donald J Trump";
	System.out.println(name.length());
	
	//concat(str): concats linking or combining two strings together. 
	
	
	String s1 = "Cybertek";
	      s1 = s1.concat(" School"); //modifying s1 by making it equal to s1. and returns you a brand new string.
	     
	       System.out.println(s1);
	
	       //toUpperCase to modify and converts value to upper case. 
	       
	       String N ="cybertek";
	      N = N.toUpperCase();
	      System.out.println(N);
	       
	  //toLowerCase():
	      
	      N = N.toLowerCase();
	      System.out.println(N);
	      
	      String name1 = "JAKHONGIR";
	     name1 = name1.toLowerCase();
	      System.out.println(name1);
	      
	    /*charAt(index#), length(), concat(Str), toUpperCase(), toLowerCase()
	     * char at method extraxts a specific character from the string and returns it as char value
	     */
	      
	     String a = "Batch 12 Javengers";
	     System.out.println(a.charAt(11));
	    char ch1 =  a.charAt(11);
	     System.out.println(ch1);
	      
	     int Length = a.length();
	     System.out.println(Length);
	      
	     int HighestIndexNum = a.length();
	     System.out.println(HighestIndexNum-1);
	      
	      //concat
	     
	     String b = "Cybertek";
	 String C =  b.concat(" Batch12 Javengers");
	      System.out.println(C);
	      
	      String d = "book";
	      System.out.println(d.toUpperCase());
	      d = d.toUpperCase();
	      System.out.println(d);
	      
	   String e = "JAVA IS fun";
	  e = e.toLowerCase();
	   System.out.println(e);
	      
	      
	      
	      
	      
	
}
}
