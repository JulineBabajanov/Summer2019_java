package shorts;

public class doWhile {
public static void main(String[] args) {
	int i = 0;
	do {
		System.out.println("Hello");
		i++;
	}while(i<10);
	
	
	int apples = 0;
	
	do {
		System.out.println("Eating an apple "+ apples);
		apples++;
	}while(apples<=10);
	System.out.println("Total of apples you ate: "+ apples);
	
	
	int number =1;
	int until =10;
	do {
		System.out.println(number+", ");
		number++;
	}while(++number<=until);
	
	
}
}
