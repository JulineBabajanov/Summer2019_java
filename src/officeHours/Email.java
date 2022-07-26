package officeHours;

import java.util.Scanner;

public class Email {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter your e-mail");
	String email = scan.next();
	
	int indexOfAt = email.indexOf('@');
	String id = email.substring(0, indexOfAt);
	String domain = email.substring(indexOfAt+1);
			
	System.out.println(id+" and domain is "+domain);
	
	
	System.out.println("Please enter another email");
	String yahoo = scan.next();
	
	int index = yahoo.indexOf('@');
	String id4 = yahoo.substring(0, index);
	String domain4 = yahoo.substring(index);
	System.out.println("Your email id is "+id4+" your domain is "+domain4);
	
	
	System.out.println("Enter an email");
	String email1 = scan.next();
	
	int Index = email1.indexOf('@');
	String id9 = email1.substring(0, Index);
	String dom = email1.substring(Index);
	System.out.println("Your domain is: "+dom+" your id is: "+id9);
	
	System.out.println("Print and email");
	String email8 = scan.next();
	
	int Inde = email8.indexOf('@');
	String ideee = email8.substring(0, Inde);
	String doma = email8.substring(Inde+1);
	System.out.println(ideee+" is your id "+" your domain is "+doma);
	
	System.out.println("email please");
	String mail = scan.next();
	
	int ind = mail.indexOf('@');
	String id10 = mail.substring(0, ind);
	String domy = mail.substring(ind+1);
	
	System.out.println(id10+" is id "+domy+" is domain");
}
}
