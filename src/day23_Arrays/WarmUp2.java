package day23_Arrays;

public class WarmUp2 {

	public static void main(String[] args) {
		
		//2. Write a program that can find the unique characters from a String.
		/*
		 * ex:
		 * input:
		 * AAABCDEEFF
		 * 
		 * output:
		 * BCD
		 */
		
		String str="ALL THE LETTERS";
		String Unique=""; //to store all of the unique characters from str
		for(int j=0; j<str.length();j++) {
		
		int count=0; //this counts how many times the character is appeared
		for(int i =0;i<str.length();i++) {
			//highest value of i: str.length()-
			if(str.substring(i,i+1).equals( ""+str.charAt(j) )) {
				count++;
			}
		}
		if(count==1) {
			Unique+=""+str.charAt(j);
		}
		
	}
		System.out.println(Unique);
		}
}
