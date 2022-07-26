package day24_JavaRecap;

public class KahootQuiz {
public static void main(String[] args) {
	
	//whats the value of the following code fragment
	
	boolean A=true, B=false;
	while(true) {
		if(A!=!B) {  //its saying true A does not equal true !B
			System.out.println("Hello Cybertek");
			break;
		}else {
			System.out.println("Hello World");
			break;
		}
	}
	
	int i = 5;
	do {
		i--; //ends at 0
		System.out.print(i+" "); //4 3 2 1 0
		//i--; ends at 1
		//i++; 4 will be printed infinite times
	}while(i>0);
	
	int x;
	int y=5;
	for(x=0; x<y; x++) {  // x = 3, x=6;
		System.out.println((x+=2) +" ");
		//                  2
		//                  5
		
	}
	int[]arr= {1,2,3,4,5};
	for(int j = 1;j<arr.length; j++) {
		System.out.println(arr[j]);
		break;
	}
	
	System.out.println();
	
	int X = 10;
	for(int t = 0; t<=5; t++) { //t: 0 1 2 3 4 5
		X+=t;
	}
	System.out.println(X);
	System.out.println();
	
	for(int a = 0; a<5; a++) {
		System.out.print(a+" ");
		break;
	}
	
	for(int J = 5;J<16 ;J++) {
		System.out.print(J+" ");
	}
	System.out.println();
	
	String str = "Java";
	String str2= new String(str);
	System.out.println(str==str2); //false checks the location... locations have different memory
	System.out.println(str.equals(str2)); //true, checks only visible text for face value
	int count2 = 10;
	
	do {
		count2+=2;
	}while(str==str2);
	System.out.print(count2);
	System.out.println();
	
	int count=10;
	while(str==str2) {
		count+=2;
	}
	System.out.print(count);
	
	
	
	
	
}
}
