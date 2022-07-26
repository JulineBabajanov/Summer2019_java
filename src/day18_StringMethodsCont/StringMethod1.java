package day18_StringMethodsCont;

import officeHours.Email;

public class StringMethod1 {
public static void main(String[] args) {
	
	
	/*   index(str): returns the index number of the first character in the given String as an int value
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	String A1 = "Batch 12 is a great batch";
	         int num = A1.indexOf("eat");
	           System.out.println(num);
	
	
	String B1 = "today is tuesday, today we have class in the afternoon";
	
	int num1 = B1.indexOf("te");
	System.out.println(num1);
	
	String Address = "7925 Jones Branch Dr, Mclearn, VA 22003";
	int beginIndex = Address.indexOf("M");
	//System.out.println(beginIndex);
	int endIndex = Address.indexOf("n,")+1;
	//System.out.println(endIndex);
	String cityName = Address.substring(beginIndex, endIndex);
	System.out.println(cityName);
	
	String emailAddress = "RandomEmails@gmail.com";
	
	int begin = emailAddress.indexOf("@")+1;
	int end = emailAddress.indexOf("l.")+1;
	String account = emailAddress.substring(begin, end);
	System.out.println(account);
	
	
	
	String email2 = "julinebabajanov@yahoo.com";
	int begin1 = email2.indexOf("@")+1;
	int end2 = email2.indexOf("o.")+1;
	
	String account2 = email2.substring(begin1, end2);
	System.out.println(account2);

	
	//lastIndexOf:
	
	
	String str = "ABCDABCD";
	
	int num4 = str.lastIndexOf("B");
	
	System.out.println(num4);
	
	String myEmail = "Myemail.school@hotmail.com";
	
	int type = myEmail.indexOf("@")+1;
	int type1 = myEmail.lastIndexOf(".");
	
	String myEmailType = myEmail.substring(type, type1);
	System.out.println(myEmailType);
	
	
	
	/*isEmpty(): checks if the String is empty..... returns a boolean expression
	 * 
	 */
	
	
	
	
	
	
	
}
}
