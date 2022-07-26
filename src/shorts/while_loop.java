package shorts;

import java.util.Scanner;

public class while_loop {
public static void main(String[] args) {
	
    Scanner scan = new Scanner(System.in);

  /*  int apples=1;
	while(apples<=10) {
		System.out.println("Eating an apple "+apples);
		apples++;
	}
	System.out.println("No more appleas:(");
   */ System.out.println();
	//System.out.println("Enter a number");
	//int number = scan.nextInt();
	
	//int count =1;
	//while(count<=number) {
		
	//System.out.print(count+", ");
//	count+=2;
	//}
	
	System.out.println("Please enter a positive number");
	
	int total = 0;
	int positive=scan.nextInt();
	while(positive>0) {
		total=total+positive;
		positive=scan.nextInt();
	}
	
	
	
	
	
}
}
