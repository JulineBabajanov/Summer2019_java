package day17_StringContinued;

public class StringMethodsAgain {
public static void main(String[] args) {
	
	String str1 = "Hello Javengers";
	String str2 = "Hello Javengers";
	boolean R1 = str1 == str2; // true because value is same and second == checks memory then face value. both are same so true 
	System.out.println(R1);
	
	
	
	String str3 = new String ("public pool"); //false because everytime we use new keyword gets saved into java heap. private pool. 
	String str4 = new String ("public pool");// can only be saved as one memory location for each new keyword
	boolean R2 = str3==str4;
	System.out.println(R2);
	
	boolean R3 = str1 == str3; //false
	System.out.println(R3);
	
	
	/*  String class methods
	 * 1. Concat, 2. Length, 3. charAt, 4. toUpperCase, 5. toLowerCase
	 * 
	 * 
	 * 
	 */
	
	//concat method(): it takes a String and combines two Strings. It returns it as a new string value
	String a = "Cybertek";
	
	a= a.concat(" School"); //can not just print Cybertek school unless it is initizlized and re assigned as a new string value
	System.out.println(a); //cybertek school
	
	String b = "Juline";
	System.out.println(b);
	b = b.concat(" Babajanov");
	System.out.println(b);
	
	String A = "hello", B ="hello ";
	System.out.println(A==B); //false due to space
	
	String C = "Hello", D = "hello";
	System.out.println(C==D); //false case sensitivity
	
	//length(); it returns the total number of characters as an int value .... length starts from 1
	
     String LongName = "ABCDEFGHIJKLMN";
   int num =  LongName.length();

    System.out.println(num);
    
    String full = "How are you doing today?";
    int num2 = full.length();
    System.out.println(num2);

 //charAt(indexNum); String represents sequence of Characters "absdedfhijk
    // each character in the String, has index number. index starts from 0
    //returns the character of the index number
    String name1 = "Muhtar";
   char ch = name1.charAt(5);
    
    System.out.println(ch);
    
    //toUpperCase(): converts the String value to Uppercase and returns it as NEW String value
    //toLowerCase(): converts the String value to Lowercase and returns it as NEW String value
    
    String name2 = "cybertek";
    name2.toUpperCase();
    System.out.println(name2);
    name2 = name2.toUpperCase();
    System.out.println(name2);
    
    String name3 = "CYBERTEK";
    name3 = name3.toLowerCase();
    System.out.println(name3);
    
    //trim(): its used for removing the unused spaces.
    
    String s1 = "                  hello           ";
    s1 = s1.trim();
    System.out.println(s1);
    
    String s3 = "    ";
   s3 = s3.trim();
    System.out.println(s3);
    
    String s4 = "       Cybertek     School";
    s4 = s4.trim();
    System.out.println(s4);
    
    /* substring(beginning index): it creates sub value of the String from
     *                             the beginning index till the last index
     *                            and returns it as a NEW String value.
     * 
     * 
     * 
     * 
     */
    
    String Str = "Cybertek School";
//                0123456789
    
    String Str2 = Str.substring(9);
    System.out.println(Str2);
    
    String Address = "Mclean VA 22000";
    //                0123456789
    String zipCode = Address.substring(10);
    System.out.println(zipCode);
    
    /* substring ( beginning index, ending index):
     *             it creates the sub value of the String from the
     *             beginning index till the ending index
     *             (end index num will be excluded)
     *             then returns it as a NEW String value
     * 
     */
    
    String Name = "Hello Cybertek School";
           Name = Name.substring(6, 14);
           System.out.println(Name);
    
    String fullName = "Cybertek School Batch12";
    String middleName = fullName.substring(9, 15);
    System.out.println(middleName);
    
 
    
    /* replace (old char, new char):
     *
     */
    
    String sentence = "Hello how are you doing today?";
    sentence = sentence.replace("Hello", "Hiya");
    System.out.println(sentence);
    
    
}
}
