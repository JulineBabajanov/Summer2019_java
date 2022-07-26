package day17_StringContinued;

public class stringMethod4 {
public static void main(String[] args) {
	
	String str1 = "Hello Javengers";
	String str2 = "Hello Javengers";
	String str3 = new String ("Hello Javengers");
	boolean R1 = str1 == str3;
	System.out.println(R1);
	
	
	String a = "Cybertek";
	System.out.println(a);
	a=a.concat(" School");
	System.out.println(a);
	
	String longName ="ABCDEFGHIJKLMN";
	int num = longName.length();
	System.out.println(num);
	
	//charAt();
	String name1 = "Muhtar";
	char ch = name1.charAt(5);
	System.out.println(ch);
	
	//toUpperCase: converts the String value to uppercase and returns it as a new String
	//toLowerCase: converts String value to new String lowercase
	
	String name2 = "Juline";
	name2 = name2.toUpperCase();
	System.out.println(name2);
	
	String name3 = "JULINE";
	name3 = name3.toLowerCase();
	System.out.println(name3);
	
	//trim();
	
	String s1 = "                  Cybertek        ";
	s1 = s1.trim();
	System.out.println(s1);
	
	String s3 = "    ";
	s3 = s3.trim();
	System.out.println(s3);
	
	
	String s4 = "              Cybertek         School";
	s4 = s4.trim();
	System.out.println(s4);
	
	
	String Str = "Cybertek School";
	 //           0123456789
	
	String Str2 = Str.substring(10);
	System.out.println(Str2);
	
	String Address = "Mclean VA 22000"; 
	String zipcode = Address.substring(10);
	System.out.println(zipcode);
	
	
	//substring (beginning index, ending index);
	
	String Name = "Hellp Cybertek School";
	      Name = Name.substring(6, 14);
	       System.out.println(Name);
	
	
	String fullname = "Cybertek School Batch12";
	String middleName = fullname.substring(9, 15);
	System.out.println(middleName);
	
	
}
}
