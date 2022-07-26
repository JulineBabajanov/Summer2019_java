package day18_StringMethodsCont;

import java.util.Scanner;

public class WarmUp2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	/*mUhTaR
	 * cYBerTek
	 * output: Muhtar Cybertek
	 * 
	 * 
	 */
   /*  System.out.println("Please enter first your name");
	 
     String firstName = scan.nextLine();
	         //mUhtAr
     firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
     System.out.println(firstName);
    
     System.out.println("Please Enter your last name");
     String lastName = scan.nextLine();
     lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
     
     String fullName = firstName+" "+lastName;
	System.out.println("Your full name is: "+fullName);
	
	System.out.println("Enter your moms first name");
	String name1 = scan.nextLine();
	System.out.println("Enter your moms last name");
	String name2 = scan.nextLine();
	name1 = name1.substring(0,1).toUpperCase()+name1.substring(1).toLowerCase()+" "+name2.substring(0,1).toUpperCase()+name2.substring(1).toLowerCase();
	
	System.out.println("Your moms name is: "+name1);
	*/
	/*System.out.println("Enter your daughters first name");
	String Fname = scan.nextLine();
	Fname = Fname.substring(0,1).toUpperCase()+Fname.substring(1).toLowerCase();
	System.out.println("Enter your daughters last name");
	String Lname = scan.nextLine();
	Lname = Lname.substring(0,1).toUpperCase()+Lname.substring(1).toLowerCase();
	String FLName = Fname+" "+Lname;
	System.out.println(FLName);
			
	System.out.println("Enter your dads first name");
	String first = scan.nextLine();
	first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
	System.out.println("Please enter your dads last name");
	String last = scan.nextLine();
	last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
	String both = first+" "+last;
	System.out.println(both+" is your dads full name");
	
	System.out.println("Enter your own first name");
	String own = scan.nextLine();
	own = own.substring(0,1).toUpperCase()+own.substring(1).toLowerCase();
	System.out.println("Enter your own last name");
	String own1 = scan.nextLine();
	own1 = own1.substring(0,1).toUpperCase()+own1.substring(1).toLowerCase();
	String own2 = own+" "+own1;
	System.out.println(own2);
	
	System.out.println("Enter your neighbors first name");
	String neighbor = scan.nextLine();
	neighbor = neighbor.substring(0,1).toUpperCase()+neighbor.substring(1).toLowerCase();
	String neighbor1 = scan.nextLine();
	 neighbor1 = neighbor1.substring(0,1).toUpperCase()+neighbor1.substring(1).toLowerCase();
	String neighborFull = neighbor+" "+neighbor1;
	System.out.println(neighborFull+" is your next door neighbor!");
	*/
	System.out.println("Please enter your first name");
	String name = scan.nextLine();
	name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
	System.out.println("Enter your last name");
	String name1 = scan.nextLine();
	name1 = name1.substring(0,1).toUpperCase()+name1.substring(1).toLowerCase();
	String name2 = name+" "+name1;
	System.out.println(name2+" is your full name");
	
	System.out.println("Enter your sons first name");
	String first = scan.nextLine();
	first = first.substring(0,1).toUpperCase();
	System.out.println("Enter your last name");
	String first1 = scan.nextLine();
	first1 = first1.substring(0,1).toUpperCase();
	String first3 = first+"."+first1+".";
	System.out.println(first3);
	
	
	
	
}
}
