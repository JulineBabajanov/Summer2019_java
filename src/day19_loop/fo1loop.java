package day19_loop;

public class fo1loop {
public static void main(String[] args) {
	
	//reverse string
	
	String str = "Java";
	String Rev = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	System.out.println(Rev);
	
	String Rev2="";
	for(int i = 3; i >=0; i--) {
		Rev2+=str.charAt(i);
	}
	System.out.println(Rev);
	System.out.println(Rev2);
	
}
}
