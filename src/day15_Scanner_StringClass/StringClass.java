package day15_Scanner_StringClass;

public class StringClass {
public static void main(String[] args) {
	/*String class: 
	 * 1. String is an object.
	 *       there are two ways to create object from 
	 *       String class:
	 *          1. String literals--- saved in string pool when object is created by String literals, 
	 *             that object will be saved at String pool.... does not take duplicates
	 *           2. new object is saved String str2 = new String("Cybertek") is saved in String HEAP
	 * 
	 * when the String object is created by using the "new" keyword its memory location is created in the java heap memory.
	 * 
	 */
	
	String str="Cybertek";
	String A="Cybertek";
	String B="Cybertek";
	System.out.println(str==B); //true bc same memory locations in string literals are stored at the string pool
			
	String str2 = new String ("Cybertek");
	System.out.println(str==str2); //false bc of different memory locations
	
	String str3 = new String("Cybertek"); //false bc if created new its always in the java heap memory but in seperate spots.
	System.out.println(str2==str3);
	
    String s1 = "cat";
    String s2 = "cat";
    System.out.println(s2==s1);
    
    String s3 = new String("Cat");
    String s4 = new String("Cat");
    System.out.println(s3 == s4);
    /*String object represents the sequences of characters. ==> "ABCDEFG"
     * each character in String has its own index number. index number starts from zero.
     * String is immutable: once you declare it, you can not modify it.
     * String methods: charAt(indexnum):
     */
	
	String str8 = "Cybertek"; // 7 index numbers.. starts at 0
	
	
	
	
	
}
}
