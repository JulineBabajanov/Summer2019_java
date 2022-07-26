package day18_StringMethodsCont;

public class StringMethod_Boolean2 {
public static void main(String[] args) {
	
	/* isEmpty():
	 *  checks if the String is empty and returns boolean expressions
	 * 
	 * 
	 * 
	 */
	
	String str = "Cybertek";
	boolean R1  = str.isEmpty();
	System.out.println(R1);
	
	String str2 = "hello";
	
	if(str2.isEmpty()) {
		System.out.println("it's empty String"+str2);
	}else {
		System.out.println("it's not empty"+" "+str2);
	}
	
	/* equals(str): checks if the two String face values are equal or not
	 * 
	 */
	
	String A1 = "Cybertek";
	String A2 = new String("Cybertek");
	System.out.println(A1==A2);
	
	boolean R2 = A1.equals(A2);
	System.out.println(R2);
	
	System.out.println("java".equals("Java"));
	
	/* equalsIgnorecase()
	 * 
	 */
	
	String s1 = "JAVA";
	String s2 = new String ("java");
	System.out.println(s1==s2);//false, different locations
	System.out.println(s1.equals(s2)); //false, case sensitivity
	System.out.println(s1.equalsIgnoreCase(s2)); //true, does not check location
	
	/* contains(str): checks if the str is in the String or not... then returns a boolean expression
	 * contained ==true
	 * !contained== false
	 * 
	 */
	String name = "Muhtar";
	   boolean Result = name.contains("good guy");
	       System.out.println(Result);
	       
	 String name2 = "Marufjon";
	 System.out.println(name2.contains("m")); //false, case sensitive
	 
	 /* startsWith(str): checks if the String started with the str or not, then returns boolean expressions
	  * 
	  */
	
	 String Today = "Java";
	boolean Result2 = Today.startsWith("J");
	 System.out.println(Result2);
	 
	 String names = "Cybertek School is a great place to learn java";
	 System.out.println(names.startsWith("Cybertek School"));
	 
	 /* endsWith(str): checks if the String is ended with the given str or not, then returns boolean expressions
	  * 
	  */
	 String B1 = "Muhtar";
	 System.out.println(B1.endsWith("r"));
	 
}
}
