package day22_nestedLoop;

public class NestedLoop1 {
public static void main(String[] args) {
	System.out.println();
	
	int A=1;
	while(A<=7) {
		
		int B=1;
		while(B<=A) {
			System.out.print("*");
			B++;
		}
		System.out.println();
		A++;
	}
	  for(int i =1; i<=20;i++) {
	  for(int j = 1; j<=i; j++) {
		  System.out.print("*");
	  }
	  System.out.println();
	
	
	  }
	  
	  int x =1;
	  while(x<=5) {
		  
		  for(int f=1;f<=x;f++) {
			  System.out.print("*");
	  }
	System.out.println();
	x++;
	  }
	
	int i =1;
	do {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		i++;
		
	}while(i<=5);	
}
}
