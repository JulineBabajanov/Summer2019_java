package day08_ShortHandOperators;

public class shortHander {

	public static void main(String[] args) {
		
		
		int a = 9;
		
		a += 3;
		System.out.println(a);
		
		int b = a += 5;
		
		
		//subtraction : -=:
		
		int g = 101;
		
		int h = g-=1;
		System.out.println(h); //100 
		
		
		int i = g+=h+5; // // 205
		
		int j = h+=g % i; //0
		
		System.out.println(j);
		
		
		
		int A = 100; 
		
		A*=200; //20,000
		
		int B = 100;
		B*=100/10;
		
		
		
		int J = 300;
		int K = 10;
		
		J+=J%=K;
		
		
		
		
		
		
		
	}
	
	
}
