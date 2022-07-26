package day17_StringContinued;

public class methods5 {
public static void main(String[] args) {
	
	//replace(old char, new char)
	//replaces the old char value with the given new char value in the String and returns it as NEW string value
	
	String str1 = "Java is Fun Programming Language";
	 str1 = str1.replace('a', 'A');
	 System.out.println(str1);
	
	
	String str2 = "Today is going to be a great day to learn java";
	str2 = str2.replace("Today", "Tomorrow");
	System.out.println(str2);
	
	str2 = str2.replace("java", "");
	System.out.println(str2);
	
	
	String s1 = "Java is fun, Java is good";
	s1 = s1.replaceFirst("Java", "Python");
	System.out.println(s1);
	
	s1 = s1.replaceFirst("is good", "iS Good");
	System.out.println(s1);
	
	String s2 = "Java is programming language, Java is Java";
	s2 = s2.replace(" Java " , " C# ");
	System.out.println(s2);
	
	
	
}
}
