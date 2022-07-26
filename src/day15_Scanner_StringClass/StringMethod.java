package day15_Scanner_StringClass;

public class StringMethod {
public static void main(String[] args) {
	
	String str = "Cybertek";
	//index num:  01234567 charAt(index):
	
	System.out.println(str.charAt(4));
	char ch = str.charAt(4);
	System.out.println(ch);
	
	String str2 = "Mu htar";
	
	System.out.println(str2.charAt(5));
	
	String name = "Juline Marie Babajanov";
	System.out.println(name.length());
	
	//concat method
	
	String s1 = "Cybertek";
	s1 = s1.concat(" School");
	System.out.println(s1);
	
	//toUpperCase
	
	String s2 = "juline babajanov";
	s2 = s2.toUpperCase();
	System.out.println(s2);
	
	s2 = s2.toLowerCase();
	System.out.println(s2);
	
	String name1 = "jakhONGIR";
	System.out.println(name1);
	name1 = name1.toLowerCase();
	System.out.println(name1);
	
	String a = "Batch 12 Javengers";
	
	System.out.println(a.charAt(4));
	
	char ch1 = a.charAt(9);
	System.out.println(ch1);
	
	int Length = a.length();
	System.out.println(Length);
	
	String b = "cybertek";
	b=b.concat(" Batch12 Javengers");
	System.out.println(b);
	
}
}
