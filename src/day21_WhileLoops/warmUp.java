package day21_WhileLoops;

public class warmUp {
	public static void main(String[] args) {
		/*write a java program that can count how many times the word "book" appeared in a String.
		 * Ex: input: I like books, I have books, I need book
		 * output: 3
		 * 
		 */
		String sentence = "book book book book book";
	    int count = 0;
	    for(int z = 0; z<sentence.length()-3; z++) {
	    	if(sentence.substring(z, z+4).equals("book")) {
	    		count++;
	    		//System.out.println(count);
			}
		}
	System.out.println(count);
		
		
		
		String words = "Cybertek is school, Cybertek is great, I love Cybertek";
		//              i, i+7
		//substring (i, 
		int nTimes = 0;
		for(int i = 0; i < words.length()-7; i++) {
			if(words.substring(i, i+8).equals("Cybertek")) {
				//   highest of i can be 54,  
				nTimes++;
			}
		}
		System.out.println(nTimes);
		
		
		/*write a java program that can remove duplicated values from string
		 * ex input: aabbcc
		 * output: abc
		 * 
		 */
		String s1 = "aabbcceeeffffggghhh";
		//a:(0,1)
		String result=""; //abc  //to store the new string value that does not have duplicates
		for(int i=0; i<s1.length(); i++) {
			if(!result.contains(s1.substring(i, i+1))) {
				result+=s1.substring(i, i+1);
			}
		}
		
		System.out.println(result);
		
		
		
		String s2= "aabbccdddeeeeffffggghhhiiijjjkkklllmmnnoopppp";
		String result2="";
		
		for(int n=0; n<s2.length(); n++) {
			if(!result2.contains(s2.substring(n, n+1))) {
				result2+=s2.substring(n, n+1);
			}
		}
		
		System.out.println(result2);
		
		
		
		String s3="gggghhhjjjjiiiikllllkkkk";
		String result3="";
		
		for(int p=0;p<s3.length(); p++) {
			if(!result3.contains(s3.substring(p,  p+1))) {
				result3+=s3.substring(p, p+1);
			}
		}
		System.out.println(result3);
		
		String s4="ddddxxxxxxlllllxxxxxllllleeeeetuuuuttttvvvv";
		String result4="";
		
		for(int f=0; f<s4.length();f++) {
			if(!result4.contains(s4.substring(f, f+1))) {
				result4+=s4.substring(f, f+1);
			}
		}
		System.out.println(result4);
	}

}
