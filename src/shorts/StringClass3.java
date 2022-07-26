package shorts;

import java.util.Scanner;

public class StringClass3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


   System.out.println("Please enter your country");
   String country = input.nextLine();
   country = country.substring(0,1).toUpperCase()+country.substring(1).toLowerCase();
    System.out.println(country);

    System.out.println("Please enter your name");
    String firstName = input.nextLine();
    System.out.println("Please enter your last name");
    String lastName = input.nextLine();
    
    firstName = firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
    lastName = lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase();
    System.out.println(firstName+" "+lastName);
    
    System.out.println("Please enter a city");
    String city = input.nextLine();
    city = city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
    System.out.println(city);
    
    String name = "Java";
    name.toUpperCase();
    String name2 = name.toLowerCase();
    System.out.println(name2);
    
    
    
    
}
}
