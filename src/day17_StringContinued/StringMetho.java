package day17_StringContinued;

public class StringMetho {
public static void main(String[] args) {
	
	String str1 = "Hello Javengers";
	String str2 = "Hello Javengers";
	
	boolean R1 = str1 == str2;
	System.out.println(R1);
	
	String str3 = new String("Hello Javengers");
	boolean R2 = str1 == str3;
	System.out.println(R2);
	
	String str4 = new String ("Hello Javengers");
	boolean R3 = str3 == str4;
	System.out.println(R3);
	
	boolean R4 = str1 == str3;
	System.out.println(R4);
	
	/*
	 * Methods of String Class
	 * 1. concat 2. length 3. charAt 4. toUpperCase 5. toLowerCase
	 */
	
	
	//concat(str) it takes String and combines two strings as new string value
	
	String a = "Cybertek";
	String b = a.concat(" School");
	
	System.out.println(b);
	
	// returns the total number of characters as an int value
	
	String LongName = "ABCDEFGHIJKLMN";
	int num = LongName.length();
	
	System.out.println(num);
	
	//charAt(): String is Sequence of Characters.... ' ' single quote is only one character
	
	String name1 = "Muhtar";
	
	char ch = name1.charAt(0);
	
	System.out.println(ch);
	
	String name2 = "cybertek";
	String name3 = name2.toUpperCase();
	System.out.println(name3);
	
	String name4 = "CYBERTEK";
	String name5 = name4.toLowerCase();
	System.out.println(name5);
	
	
	/* trim() its used to removing the unused spaces
	 * 
	 */
	
	String s1 = "                       hello hello";
	s1 = s1.trim();
	
	System.out.println(s1);
	String s2 = "                    Cybertek                 School";
	s2 = s2.trim();
	System.out.println(s2);
	
	String s3 = "   ";
	s3 = s3.trim();
	System.out.println(s3);
	
	String s4 = "                Cybertek        School";
	s4 = s4.trim();
	System.out.println(s4);
	
	
	/*substring(beginning index, it creates sub value of the String and returns it as a NEW String value
	 * 
	 */
	String Str = "Cybertek School";
	//            0123456789
	
	String Str2 = Str.substring(9);
	System.out.println(Str2);
	
	String Address = "McLean Va 22000";
	System.out.println(Address.length());
	String zipcode = Address.substring(10) ;
	System.out.println(zipcode);
	
	String Name = "Hello Cybertek School";
	
	Name = Name.substring(6, 13+1);
	
	System.out.println(Name);
	
	
	String fullName = "Cybertek School Batch12";
	String middleName = fullName.substring(9, 15);
	
	System.out.println(middleName);
	

	
	
}
}
