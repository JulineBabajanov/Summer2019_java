package day19_loop;

public class rev2 {
public static void main(String[] args) {
	
	String rev = "Amina Abraham Aziza Jakhongir";
	
	for(int i = 28; i>=0;i--) {
		System.out.print(rev.charAt(i));
	}
	System.out.println();
	String str1 = "Hello how are you doing today? It is nice to meet you very much!";
	String Reversed = "";
	for(int i = str1.length()-1;i>=0; i--) {
		Reversed+=str1.charAt(i);
	}
	
	System.out.print(Reversed);
}
}
