package day16_Review;

public class Kahot {
public static void main(String[] args) {
	
	
	int Batch = 12;
	switch(Batch) {
	case 122:
		System.out.println("Cybertek");
		break;
	case 3:
		System.out.println("Cydeo");
	default:
		System.out.println("Not common");
	}
	
	
	int x = 5, y = 19;
	
	int num = y-x > x-y ? y-x : x-y;
	
	System.out.println(num);
	
	
	
	int i = 10;
	int j = 20;
	
	int k = j += i/5;
	
	System.out.println(i+" "+j+" "+k);
	
	
	
	
	
	
	
}
}
