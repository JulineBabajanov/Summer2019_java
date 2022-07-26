package day24_JavaRecap;

public class quiz1 {
public static void main(String[] args) {
	
	int x;
	int y = 5;
	for(x=0; x<y; x++) {
		System.out.println((x+=2)+" ");
	}
	
	for(int a = 0; a<5; a++) {
		System.out.print(a+" Hello");
		break;
	}
	System.out.println();
	
	String str = "Java";
	String str2 = new String (str); //"Java" 
	System.out.println(str.equals(str2)); // true, only checks visible text
	System.out.println(str==str2); //false, different memory 
	
	int count = 10;
	
	do {
		count+=2;
	}while(str==str2);
	
	System.out.println(count); //12
	
	
	int count1 = 12;
	while(str==str2) {
		count1+=2;
	}
	
	System.out.println(count1);
	
	int a = 0;
	while(a<=6) {
		a+=2;
	}
	System.out.println(a);
	
	String s1 = "Cybertek";
	s1 = s1.toUpperCase();
	System.out.println(s1);
	
	
	
	String S1 = "ABC";
	String S2 = "ABC";
	System.out.println("S1==S2: "+(S1==S2));
	
	
	
	int z = 5;
	for(int p = 5; p >0; p--) {
		z+=p;
	}
	System.out.println(z);
	
	
	
	
	
}
}
