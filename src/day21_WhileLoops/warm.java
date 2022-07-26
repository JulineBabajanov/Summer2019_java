package day21_WhileLoops;

public class warm {
public static void main (String [] args) {
	
	String sentence = "I like book, I have book, I need book, books book book book";
	
	int count = 0;
	
	for(int i = 0; i<sentence.length()-3;i++) {
		if(sentence.substring(i, i+4).equals("book")) {
			count++;
		}
	}
	
	
	System.out.println(count);
	
	
	
	String words = "Cybertek is school, Cybertek is great, I love Cybertek";
	
	int nTimes = 0;
	
	
	for(int i = 0; i <words.length()-7; i++ ) {
		if(words.substring(i, i+8).equals("Cybertek")) {
			nTimes++;
		}
	}
	
	System.out.println(nTimes);
	
	
	
	
	String s1 = "aabbcc";
	String result = "";
	
	
	for(int i = 0; i<s1.length();i++) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
