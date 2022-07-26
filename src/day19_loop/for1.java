package day19_loop;

public class for1 {
public static void main(String[] args) {
	
	//for(int i = 1; i<=10; i++) {
		//System.out.println("The square of "+ i +" is: "+ (i*i));
	//}
	
	
	for(int i = 1; i <=32; i++) {
		if(i%2!=0) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	for(int i = 1; i<=32;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	String str = "Java";
	str = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	System.out.println(str);
	
	String Rev2 = "";
	
	for(int i = 3;i>=0;i--) {
	Rev2+=str.charAt(i);
	}
	System.out.println(str);
	
}
}
