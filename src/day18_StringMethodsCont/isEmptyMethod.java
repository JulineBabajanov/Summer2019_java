package day18_StringMethodsCont;

public class isEmptyMethod {
public static void main(String[] args) {
	
	/* isEmpty(): returns if String is empty, returns a boolean expressions
	 * 
	 */
	
	String str = "Cybertek";
	
    boolean result1 = str.isEmpty();
	
	
	System.out.println(result1);
	
	
	String str2 = "";
	if(str2.isEmpty()) {
		System.out.println("Is Empty String");
	}else {
		System.out.println("it's not empty");
	}
	
	//equals(str): checks if the two Strings are equal (only the face(visible text) value)
	
	String A1 = "Cybertekk";
	String A2 = new String ("Cybertek");
	
	System.out.println(A1 == A2);
	System.out.println(A1.equals(A2));
	boolean R2 = A1.equals(A2);
	System.out.println(R2);
	
	System.out.println("java".equalsIgnoreCase("Java"));
	System.out.println("\n\n\n");
	String s1 = "JAVA";
	String s2 = new String ("java");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2)); //true
	
	//contains(str): checks if the str is contained in the String or not, then returns boolean expression
	
	String name = "Muhtar";
	    boolean Result = name.contains("A");
	    System.out.println(Result);
	String name2 = "Marufjon";
	System.out.println(name2.contains("m"));//false, case sensitive
	
	/*
	 * startsWith(str): checks if the String is started with the str or not, then returns a boolean expression
	 */
	
	String Today= "Java";
	  boolean Result2 = Today.startsWith("J");
	  System.out.println(Result2);
	
	String names = "Cybertek School is great place to learn java";
	System.out.println(names.startsWith("Cybertek School"));
	
	String name3 = "Cybertek school is great place to learn selenium";
	System.out.println(name3.endsWith("to learn selenium"));
	
	
	String B1 = "Muhtar";
	System.out.println(B1.endsWith("r"));
	System.out.println(B1.length());
	
	
}
}
