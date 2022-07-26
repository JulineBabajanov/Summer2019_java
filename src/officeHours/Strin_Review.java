package officeHours;

import java.util.Scanner;

public class Strin_Review {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String name1 = "Python";
	String word = "java is fun to learn!";
	String name = "java";
	int lengthOfName = name.length();
	System.out.println(name.charAt(lengthOfName));
	System.out.println(word.charAt(0)+word.charAt(1));
	                           //  j     +    a
	                          //char     +   char  = number ascis tables number will be 203 total of j + a
	char ch = 'j';
	char ch2 = word.charAt(0);
	System.out.println(ch==ch2);
	
	//length(): int short long double
	
	
	String word2 = "java";
	
	int len = word2.length();
	System.out.println(word2.charAt(len-2));
	//System.out.println(name1.charAt(len.length());
	
}
}
