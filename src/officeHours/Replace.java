package officeHours;

public class Replace {
public static void main(String[] args) {
	String word = "Java";
	System.out.println(word.replace("Java", "Cava"));
	
	
	String word1 = "Java is a lot of fun";
	System.out.println(word1.replace("fun", "not fun"));
	
	String word2 = "java and cava";
	System.out.println(word2.replace('a', 'b')); //replace all a to the b 
	
	String word4 = "JAVa";
	String word5 = "Java";
	System.out.println(word4.equalsIgnoreCase(word5));
	// word4.equalsIgnoreCase(word5);
	
	String wird4 = "java"; //pool
	String wird5 = new String ("java"); //heap
	System.out.println(wird4.equals(wird5)); //checking char just the letters
	
	System.out.println(wird4 == wird5); //false bc 2 differenct locations
	
}
}
