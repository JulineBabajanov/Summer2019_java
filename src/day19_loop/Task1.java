package day19_loop;

public class Task1 {
public static void main(String[] args) {
	
	/*
	 * for(initialization; condition; iterator){
	 *         statements that we wants to repeat
	 * }
	 */
	
	for( int i = 1; i<=32; i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	
	for(int i = 1; i<=32; i++) {
		if(i%2 !=0) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	
	String str = "Java";
	//"avaJ"
	String Rev = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	String Rev2 = "";
	for(int i = 3; i>=0; i--) {
		Rev2+= str.charAt(i);
	
	}
	
	System.out.println(Rev);
	System.out.println(Rev2);
String str3="Juline";	
String Reversed ="";
for(int i = str3.length()-1; i>=0; i--) {
	Reversed+=str3.charAt(i);
}
System.out.println(Reversed);
	
	
	
	
	
}
}
