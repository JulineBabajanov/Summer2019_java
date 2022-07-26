package day19_loop;

public class ReversedPrac {
public static void main(String[] args) {
	
	String str = "Abraham Babajanov";
	String Rev="";
	for(int i =16;i>=0;i--) {
		Rev+=str.charAt(i);
	}
	System.out.println(Rev);
}
}
