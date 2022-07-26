package day16_Review;

import java.util.Scanner;

public class Practice2 {
public static void main(String[] args) {
	Scanner comp = new Scanner (System.in);
	
	System.out.println("What is your name?");
	String name =comp.next();
	
	System.out.println("How are you today "+name+"?");
	String age=comp.next();
	
	System.out.println("When is your birthday "+name+"??");
	String birthday = comp.next();
	
	System.out.println("I enjoyed getting to know you "+name+" enjoy the rest of your evening!");
}
}
