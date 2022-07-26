package day18_StringMethodsCont;

public class StringMotheds_boolean {
public static void main(String[] args) {
	
	String str = "Cybertek";
	boolean R1 = str.isEmpty();
	System.out.println(R1);
	
	String str2 = "";
	if(!str2.isEmpty()) {
		System.out.println("it's empty String");
	}else {
		System.out.println("it's not empty");
	}
	
	//equals(str):checks if two Strings FACE values are equal or not
	
	String A1 = "Cybertek";
	String A2 = new String ("Cybertek");
	System.out.println(A1 == A2); //false
	boolean R2 = A1.contentEquals(A2);
	System.out.println(R2);
	
	System.out.println("java".equals("Java"));
	
	//equals ignore case
	
	System.out.println("java".equalsIgnoreCase("Java"));
	String s1 = "JAVA";
	String s2 = new String ("java");
	System.out.println(s1==s2);//false
	System.out.println(s1.equals(s2));//false
	System.out.println(s1.equalsIgnoreCase(s2));//true
	
	
	//contains(str) : checks if the str is contained in the String or not, then returns boolean expression 
	
	String name = "Muhtar";
	boolean Result = name.contains("Muh");
    System.out.println(Result);
	
    String name2 = "Marufjon";
    System.out.println(name2.contains("u"));
	
    
    //startsWith(str): checks if String started with str or not, then returns boolean expressions
    
    
    String Today = "Java";
   boolean Result2 = Today.startsWith("J");
    System.out.println(Result2);
    
    String names = "Cybertek School is a great place to learn java";
    boolean Result3 = names.startsWith("Cyb");
    System.out.println(Result3);
    
    //ends with 
    
    String B1 = "Muhtar";
    System.out.println(B1.endsWith("r"));
	System.out.println(B1.endsWith("ar"));
	
	
}
}
