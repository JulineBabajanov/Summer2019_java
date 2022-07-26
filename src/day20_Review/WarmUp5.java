package day20_Review;

public class WarmUp5 {
public static void main(String[] args) {
	/*Print all lower case and upper case alphabets from the ASCII table a-z A-Z
	 * 
	 */
	
	for(char ch= 'a'; ch<='z'; ch++) {
		System.out.print(ch +" ");
	}
	System.out.println();
	
	for(char ch1 = 'A'; ch1<='Z'; ch1++) {
		System.out.print(ch1+" ");
	}
	System.out.println();
	for(int i = 1; i<=10; i++) {
		System.out.print(i+" ");
	}
}
}
