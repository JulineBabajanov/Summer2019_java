package day21_WhileLoops;

public class warm_Up {
public static void main(String[] args) {
	
	String sentence = "I like books, I have books, I need books";
	int count = 0;
	
	for(int i = 0; i<sentence.length()-3; i++ ) {
		if(sentence.substring(i,  i+4).equals("book")) {
			count++;
		}
	}
	
	System.out.println(count);
	
	String words = "Cybertek is school, Cybertek is great, I love Cybertek";
	
	int nTimes = 0;
	
	for(int l = 0; l<words.length()-5-2; l++) {
		if(words.substring(l, l+8).equals("Cybertek")) {
			
			nTimes++;
			
		}
		
		
		
	}
	
	String s1 = "aabbcc";
	String result =""; //abc
	
	for(int i =0; i <s1.length(); i++) {
		if(!result.contains(""+s1.charAt(i))) {
			result+=s1.substring(i, i+1);
		}
	}
	
	
	System.out.println(result);
	
}
}
