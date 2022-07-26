package day17_StringContinued;

import java.util.Scanner;

public class StringMethods {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	/*String is an object
	 * There are two ways we can create String class object
	 * 1. String literals-first you declare String then give a value in the double quote; String str="Cybtertek";
	 * 2. by using "new" keyword:
	 *    String str = new String ("Cybertek");
	 *    Java Heap: a memory location where all the objects will be saved at
	 *    String pool: located in the java heap memory. its a very special memory location for String literals. 
	 *                  one memory location can be shared by multiple variables
	 *   
	 *   Everytime if the String object is created by String literals that object will be saved in the String pool.
	 * 
	 *   Everytime if the String object is created by using "new" keyword the object will be saved in the Heap memory,
	 *   outside the String pool.
	 */
	    String str1="Hello Javengers";
	    String str2="Hello Javengers";
	    boolean R1=str1==str2;
	    System.out.println(R1); //true...both belong into String pool. value is same String literals
	    
	    String str3 = new String("public pool");
	    String str4 = new String("public pool");
	    boolean R2 = str3==str4;
	    System.out.println(R2);//false because they are in different locations in the memory heap.
	    
	    boolean R3 = str1 == str3; //false
	    System.out.println(R3);
	    
	    /*            METHODS OF THE STRING CLASS:
	     *  1. concat, 2. Length 3. charAt, 4. toUpperCase, 5. toLowerCase
	     * 
	     * 
	     */
	    
	    //concat(str): it takes a string and combines two Strings and returns it as a new string value.
	    //String is immutable: can not be modified.
	    String a="Cybertek";
	    a.concat("School"); // "Cybertek School" //gave us a brand new String Value
	    System.out.println(a);
	     a = a.concat(" School"); //a= "Cybertek School"
	     System.out.println(a);
	
	   String A="hello", B="hello ";
	   System.out.println(A==B); // false because B has an extra space
	   String C="Hello", D="hello";
	   System.out.println(C==D);//false , bc of case sensitivity
	   
	   /*length(): it returns the total number of the characters as an int value.
	    * 
	    */
	    
	
	    String LongName= "ABCDEFGHIJKLMN";
	    int num = LongName.length();
	    System.out.println(num);
	
	    /* charAt(indexNum):it returns the character of that index number as a char value
	     *  String represents the Sequence of Characters: Each character in the String, has index number.
	     * index number starts from 0.
	     * String str="Cybertek";   length: 8   highest index num: length()-1
	     * index num:  01234567
	     * "sadasd"  'A'
	     * 
	     * 
	     */
	    
	    String name1 = "Muhtar";
	    //index:        012345
	    char ch= name1.charAt(3);
	    System.out.println(ch); //t
	    
	    /*toUpperCase(): converts string value to upper case
	     *  and returns it as a new string value
	     * toLowerCase(): converts string value to lower case
	     * 
	     */
	    
	    String name2="cybertek";
	    name2.toUpperCase(); //wasnt re assigned
	    System.out.println(name2);
	    name2= name2.toUpperCase();// upper case now bc it was reassigned a variable
	    System.out.println(name2);
	   
	    String name3="CYBER";
	    name3.toLowerCase();
	   name3=name3.toLowerCase();
	   System.out.println(name3);
	   /* trim(); is used for removing unused spaces
	    * and returns a NEW string value
	    */
	    
	    String s1 ="                       hello                 ";
	    s1.trim();
	    System.out.println(s1);
	    s1=s1.trim();
	    System.out.println(s1);
	    
	    
	    String s2 = "Cybertek           School";
	    s2=s2.trim();
	    System.out.println(s2);
	   
	    String s3 = "  ";
	    s3 = s3.trim();
	    System.out.println(s3);
	    
	    
	    String s4 = "      Cybertek      School";
	    s4 = s4.trim();
	    System.out.println(s4);
	    
	    String s5 = "            Turtles          ";
	    s5=s5.trim();
	    System.out.println(s5);
	    
	    /*      substring method
	     *      substring(beginning index); 
	     *            it creates sub value of the string from
	     *             the beginning index till the last index
	     *            returns it as a NEW String value
	     */
	    
	         String Str = "Cybertek School";  
	    //                 0123456789
	          Str = Str.substring(5);
	        		 System.out.println(Str);
	    
	          String Address = "Mclean VA 22000";
	          String zipcode = Address.substring(10);
	          System.out.println(zipcode);
	    
	/*    System.out.println("Please enter your address");
	    String add = scan.nextLine();
	    String add2 = add.substring(15);
	    System.out.println("Your zipcode from your address is "+add2);
	    
	 */  
	  /*substring(beginning index, last index num);
	   *          it creates the sub value of the String from the
	   *          beginning index till the ending index
	   *           (end index num will be excluded.)
	   *           then it returns it as a new String value
	   *   
	   */
	    String Name = "Hello Cybertek School";
	         Name = Name.substring(6, 14);
	           System.out.println(Name);
	           
	    String fullName = "Cybertek School Batch12";
	    String middleName = fullName.substring(9, 15);
	    System.out.println(middleName);
	    
	    String park ="Kennywood Amusement Park";
	    String middle = park.substring(10, 19);
	    System.out.println("Your going to an "+middle+" park");
	    
	    String animals = "Dog Cat Zebra Lion";
	    String animal2 = animals.substring(4 ,7 );
	    System.out.println(animal2);
	    
	    /*    REPLACE( old char, new char);
	     *     replaces all 
	     * 
	     * 
	     * 
	     */
	    
	    
	    
}
}
