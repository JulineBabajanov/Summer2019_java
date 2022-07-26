package day22_nestedLoop;

public class NestLop {
public static void main(String[] args) {
	
	for(int L = 1; L<=6; L++) {
		
	for(int i = 1; i <=L; i++) {
		System.out.print("*");
	}
	System.out.println();
	
	}
	
	for(int t = 6; t >=0; t--) {
		
	for( int P = 1; P <=t; P++) {
		System.out.print("*");
	}
	
	System.out.println();	
}
	}
}
