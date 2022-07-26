package day21_WhileLoops;

public class whileLoop1 {
public static void main (String [] args){
	
	
	/* while(condition){
	 *  statements;            loop gets executed as long as condition is true
	 * }
	 * 
	 */
	int a = 9;
	while(8<=a) {
		System.out.println("Hello");
	   a--;
	}
	String sentence = "I like book, I read book";
	int count = 0;
	
	if(sentence.contains("book")) {
		count++;
	}
	System.out.println(count);
	
	
	while(true) {
		System.out.println("Hello");
		break;
	}
	
	
	
	
	
	
}
}
