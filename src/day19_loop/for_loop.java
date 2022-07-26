package day19_loop;

public class for_loop {
public static void main(String[] args) {
	
	//for(int i =1; i<=100; i++) {
		//System.out.println("The square of "+i+" is: "+(i*i) +"\n");
	//}
	
	for (int i = 1; i <=32; i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
		
	}
	System.out.println();
	for (int i = 1; i <=32; i++) {
		if(i%2!=0) {
			System.out.print(i+" ");
		}
		
	}
	System.out.println();
	
	//String str = "Java";
	//String rev = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	
	//System.out.println(rev);
	
	String str = "Hello Amina! How are you doing today?!?!?!?";
	String Reversed="";
	
	for(int i = str.length()-1; i>=0; i--) {
	Reversed += str.charAt(i);
	}
	
	System.out.print(Reversed);
	
	
	
	
}
}
