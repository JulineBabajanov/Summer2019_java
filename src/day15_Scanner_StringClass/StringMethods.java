package day15_Scanner_StringClass;

public class StringMethods {
public static void main(String[] args) {
	
	String str = "Cybertek";
//index num       012345678
	//charAt(index):
	System.out.println(str.charAt(7));
	
	char ch = str.charAt(4);
	
	System.out.println(ch);
	/*String methods:
	 * charAt (indexnum): it takes the index number and returns
	 * its character as char value.
	 * 
	 * String is immutable... it is unchanging and can not modify it.
	 */
	String str2 = "Muhtar";
	System.out.println(str2.charAt(2));
	
	//length():
	String name = "DonaldJTrump";
	System.out.println(name.length()  );
	
	//Concat method:  concat():
	/*
	 * concat(str): it takes a String and concats it to the String variable,
	 * and then returns a new String Value
	 */
	String s1 = "Cybertek";
	//s1.concat("School");//attempting to modify STring s1
	System.out.println(s1); //String is immutable, Cybertek
	s1 = s1.concat(" School");//modifying s1 by giving a variable.
	System.out.println(s1);
	
	//toUpperCase(): converts to upper case, and returns it as a brand new String Value
	
	String N = "cybertek";
	N = N.toUpperCase();
	System.out.println(N);
	
	String M = "CYBERTEK";
	M=M.toLowerCase();
	System.out.println(M);
	
	String name1 = "JULINE";
	name1 = name1.toLowerCase();
	System.out.println(name1);
	
	//charAt Method which takes index number
	//length()
	//concat which takes a string
	//toUpperCase and toLowerCase
	
	String a = "Batch 12 Javengers"; //18 characters
	
	char ch1 = a.charAt(9);
	System.out.println(ch1 );
	
	/*charAt() methods extracts a specific character for them String
	 * and returns it as char value.
	 * 
	 * 
	 * 
	 */
	
	int Length = a.length();
	System.out.println(Length);
	
	int HighestIndexNum = a.length()-1;
	System.out.println(HighestIndexNum);
	//conclusion of length method returns the total number of characters in the String as an int value.
	
	String b = "Cybertek";
	  //  b.concat(" Batch12 Javengers");
	    
	  //  System.out.println(b); //"Cybertek", string is immutable.
	    
	 //  String c = b.concat(" Batch12 Javengers");
	  // System.out.println(c);
	    
	    b = b.concat(" Batch12 Javengers");
	    System.out.println(b);
	
	
	
	String d = "book";
	d.toUpperCase();
	//System.out.println(d.toUpperCase());
	
	d = d.toUpperCase();
	
	System.out.println(d); //BOOK
	/*toUpperCase() method converts the String value to uppercase adn returns the value
	 * to a NEW string.
	 * 
	 * 
	 */
	
	String e = "JAVA IS FUN";
	e.toLowerCase();
	String f = e.toLowerCase();
	System.out.println(f);
	/*toLowerCase() method converts Strings value to lower case and
	 * returns it as a NEW String value
	 * 
	 * 
	 */
	
	
	
}
}
