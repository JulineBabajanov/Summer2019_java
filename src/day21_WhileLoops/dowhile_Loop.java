package day21_WhileLoops;

public class dowhile_Loop {
public static void main(String[] args) {
	
	boolean A = false;
	while(!A) {
		System.out.println("Hello");
		break;
	}
	
	/* do while loop:....
	 * do{
	 * statements;
	 * }while(condition);
	 * 
	 */
	int x = 1;
	do {
		if(x%2==1) {
			System.out.print(x+" ");
		}
		x++;
	}while(x<=100);
	System.out.println();
	
	
	
	do {
		System.out.println("Hello");
		//break;
		System.out.println("Hello Cybertek");
	}while(true);
	
	
	
	
}
}
