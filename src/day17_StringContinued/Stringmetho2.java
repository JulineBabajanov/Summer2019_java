package day17_StringContinued;

public class Stringmetho2 {
public static void main(String[] args) {
	
	/*replace(old char, new char)
	 * replaces all the old char values with the given new char value in the String and returns it as New String Value.
	 * 
	 */
	
	String str1 = "Java is fun programming language";
	str1 = str1.replace('a', '8');
	System.out.println(str1);
	
	String str2 = "Today is gonna be a great day to learn java";
	str2 = str2.replace("Today", "Tomorrow");
	System.out.println(str2);
	
	str2 = str2.replace("java", "");
	System.out.println(str2);
	
	//replaceFirst
	
	String str3 = "Java is fun, Java is good";
	str3 = str3.replaceFirst("Java", "Python");
	System.out.println(str3);
	
	String s2 = "Java is programming language, Java is Java";
	s2 = s2.replace("Java is Java", "C# is Java");
	System.out.println(s2);
	
	
	
	
	
}
}
