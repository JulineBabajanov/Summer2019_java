package shorts;

import java.util.Scanner;

public class whileLooppract {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	int total=0;
	System.out.println("Enter a positive integer");
	int positive=scan.nextInt();
	while(positive>0) {
		total=total+positive;
		positive=scan.nextInt();
	}
	System.out.println("Sum of all numbers: "+total);
}
}
