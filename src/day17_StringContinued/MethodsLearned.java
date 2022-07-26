package day17_StringContinued;

import java.util.Scanner;

public class MethodsLearned {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your full name");		
     String first=input.nextLine().toUpperCase();
     String last=input.nextLine().toUpperCase();
     String both=first.concat(last);
     int num1=both.length();
     System.out.println("Your names contain "+first+" "+last+" "+num1);
     int lastIndex=both.length()-11;
     System.out.println(both.charAt(lastIndex));
     
     System.out.println("Enter to fruits");
     String fruit1=input.nextLine();
     String fruit2=input.nextLine();
     String bothFruits=fruit1+fruit2;
     int num9=bothFruits.length();
     System.out.println(num9);
     int lastIndex1=bothFruits.length()-2;
     System.out.println(bothFruits.charAt(lastIndex1));
    // System.out.println(lastIndex1.charAt(index));
     
    input.close();
}
}
