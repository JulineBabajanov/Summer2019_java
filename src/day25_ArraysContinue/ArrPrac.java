package day25_ArraysContinue;

import java.util.Arrays;

public class ArrPrac {
public static void main(String[] args) {
	/*2 methods in string that have connection to the array. 1. split(str) 2. toCharArray():
	 * 
	 * split(str): you will provide a String value for split method. splits the string by given value and returns it as a String array.
	 * 
	 */
   String sentence = "Today is great day Good day to learn java";
  String [] arr = sentence.split(" ");
  
	System.out.println(Arrays.toString(arr));
	
	String email = "FirstName_LastName";
	String [] arr2 = email.split("_");
	
	String str = Arrays.toString(arr2);
	System.out.println(str.replace("[", "").replace("]","").replace(",", "")); 
	
	//System.out.println(Arrays.toString(arr2));
	//System.out.println(arr2.length);
	
   String fullname = "Cybtertek School Batch12";
    String [] array1 = fullname.split(" ");
    System.out.println(Arrays.toString(array1));
    
    String Java = " Java I love Java and Java is fun, Java Java is Life Java ";
    //              |    I love  |    and |  is fun,   |  is Life
      String [] array2 = Java.split("Java");
  System.out.println(Arrays.toString(array2));
  System.out.println(array2.length-1); //java has occured 4 times in the sentence
  System.out.println(Arrays.toString(array2).replace("[", "").replace("]", "").replace(",", "").trim().replace(" ", ""));
  
  String Python = "Python is good, I love Python, Python is life";
         //       [ |     is good, I love  |        |    is life]
  String [] array3 = Python.split("Python");
  System.out.println(array3.length-1);// returns total number of Python in the String
  System.out.println(Arrays.toString(array3).replace("[", "").replace("]", "").trim().replace(",", "").replace(" ", ""));
  
  String emailAddress = "Cybertek.school.batch12@Gmail.com";
  emailAddress = emailAddress.substring(0, emailAddress.indexOf("@"));
  String [] array = emailAddress.split("\\.");
  System.out.println(Arrays.toString(array));
  
  String word = "ABCDEFG";
        String [] ABC = word.split(""); //when you give an empty to the split method it will return all the characters to the string as an array
                //splits the string character by character
        System.out.println(Arrays.toString(ABC).replace(",", "").replace("[", "").replace("]", ""));
        
   /* toCharArray(): this method returns a char array from the String
    * char only has one single character within a single quote
    *     String represents the sequence of characters 
    */
        
      String Str = "Java";  
       char [] ch = Str.toCharArray();
       System.out.println(Arrays.toString(ch).replace(",", "").replace("[", "").replace("]", ""));
        
        
        
        /*
         * String methods: split(str): splits the String by given value and returns it as a String array
         * example :
         * String words = "Java is fun";
         *  String [] arr = words.split(" ");
         *  arr --> {"java", "is", "fun"}
         *  
         *  
         *  toCharArray(): returns the String value as char Array
         *  Example:
         *  String str = "Java";
         *  char [] ch = str.toCharArray();
         *  ch --> {'J', 'a', 'v', 'a'}
         */
        
        
  
  
  
  
 
}

}
