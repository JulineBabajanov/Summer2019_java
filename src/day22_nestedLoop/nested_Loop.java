package day22_nestedLoop;



public class nested_Loop {
public static void main(String[] args) {
	
	/* Nested if statement. if the if condition contains another if statement
	 * 
	 * Nested Loop : loop inside a loop
	 * 
	 */
	for(int z = 0; z<5; z++) {
	for(int i = 1; i<=5; i++) {
		System.out.print(i+" ");
	}
	
	System.out.println();
	
	
	}
	

	for(int j = 0; j<5;j++) {
		for(int l = 1; l<=5; l++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	int t = 1;
	while(t<=5) {
		System.out.print("&");
		t++;
	}
	System.out.println();
	//System.out.println();
	//System.out.println();
	
	for(int b = 1; b<=7; b++) {
		for(int j = 1; j<=b; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	int A = 1;
	while (A<=7) {
		int B = 1;
		while(B<=A) {
			System.out.print("@");
			B++;
		}
		System.out.println();
		A++;
	}
	
	
	int C = 1;
	while(C<=7) {
		for(int D = 1; D<=C; D++) {
			System.out.print("@");
		}
		System.out.println();
		C++;
	}
	
	
	
	
	
	
}
}
