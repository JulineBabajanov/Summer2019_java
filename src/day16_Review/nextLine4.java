package day16_Review;
import java.util.Scanner;
public class nextLine4 {
public static void main (String []args) {
		
		
Scanner input = new Scanner (System.in);

System.out.println("Enter zip code");
int zip = input.nextInt();

input.nextLine();

System.out.println("Enter your City");
String city = input.nextLine();

		
System.out.println("Enter your state");		
String state = input.nextLine();


System.out.println("Enter your phone number");
int phone = input.nextInt();

System.out.println("Your zip code is "+zip+", your city is "+ city+", your state is "+state+", and your phone number is "+phone);
		
		
	}

}
