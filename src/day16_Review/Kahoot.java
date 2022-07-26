package day16_Review;

public class Kahoot {
public static void main(String[] args) {
	
	int Batch = 12;
	switch (Batch) {
	case 14:
		System.out.println("Cybertek");
		break;
		
	case 12: 
		System.out.println("Best");
	break;
		
	default:
		System.out.println(" Batch");
	
	}
	
	
	char ch = 'E';
	switch (ch) {
	
	case 'a':
		break;
	case 'A':
		System.out.println(ch);
		break;
	case 'b':
	case 'B':
		System.out.println(ch);
		break;
	case 'c':
	case 'C':
		System.out.println(ch);
		break;
	case 'd':
	case 'D':
		System.out.println(ch);
	default:
		System.out.println("There is no char here!");
		
		}
	
	int day = 4;
	switch (day) {
	
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
	
	case 5:
		System.out.println("Friday");
	
	default:
		System.out.println("Weekend");
		
	}
	
	int x = 5, y = 19;
	
	int num = y-x > x-y ? y-x : x- y;
	//        14 > -14  ? 14   : -14
	System.out.println(num);
	
	int sum = 2, price = 100;
	
	sum *= price >= 100 ? price *=2 : price;
	//    100    >= 100 ? 200       :100
	//          true       
	System.out.println(sum + " : "+price);
	
	
	//Q10
	
	//int d = (10>9) ? 10 : (11<10) ? 9; compiler error bc 2 ? and only 1 :... always has to be equal ammount
	
	
	
	
	
	
}
}
