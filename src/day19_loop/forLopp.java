package day19_loop;
import java.util.Scanner;
public class forLopp {
  
	public static void main (String [] args) {
		
		Scanner	scan = new Scanner(System.in);
	
	for( int i = 1; i<=11;i+=2) {
		System.out.println("Hello World "+i);
	}
		
	/* 
	 * 	
	 */
	
	for (int j = 1; j<=32; j++) {
		if(j%2==0) {
		System.out.print("Even "+" "+j+", ");
		}
	}
	System.out.println();
	for(int j = 1; j<=32; j++) {
		if(j%2!=0) {
			System.out.print("odd "+j+", ");
		}
	}
	System.out.println();
	String str = "Java";
	//            avaJ
    String Rev = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	
	System.out.print(Rev);
	
	}
	String Rev2="";
	for(int i = 3; i>=0;i--) {
		Rev2+=str.charAt(i);
	}

  System.out.println(Rev);

	}
	
}
