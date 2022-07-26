package day18_StringMethodsCont;

public class StringMethod {
public static void main(String[] args) {
	
  /*indexOf(str): returns the index number of the first character in the given string as an int value.
   * 
   */
	
	String A1 = "Batch 12 is a great batch";
	int num = A1.indexOf("g");
	System.out.println(num);
	
	int num2 = A1.indexOf("ea");
	System.out.println(num2);
	
	String B1 = "today is tuesday, today we have class in the afternoon";
	
	int n1 = B1.indexOf("te");
	System.out.println(n1);
     
	String Address = " 7925 Jones Branch Dr, Mclearn, VA 22003";
	int beginIndex = Address.indexOf("M");
	int endingIndex = Address.indexOf("V");
	String cityName = Address.substring(23, 30);
	System.out.println(beginIndex+" "+endingIndex);
	System.out.println(cityName);
	
	String email = "RandomEmails@gmail.com";
	int begin = email.indexOf("@");
	int end = email.indexOf(".com");
	System.out.println(begin);
	String emailType = email.substring(13, 18);
	System.out.println(emailType);
	
	
	//lastIndexOf: returns the last occured character index number as an INT value.
	
	String str = "ABCDABCD";
	
	int n2 = str.indexOf("B");
	int n3 = str.lastIndexOf("B");
	System.out.println(n2);
	System.out.println(n3);
	
	String myEmail = "Myemail.school@yahoo.com";
	int begin1 = myEmail.indexOf("@")+1;
	int last1 = myEmail.lastIndexOf(".");
	//System.out.println(begin1+" "+last1);
	
	String myEmail1 = myEmail.substring(begin1, last1);
	System.out.println(myEmail1);
	
	
	
	
	
	
	
	
	
	
}
}
