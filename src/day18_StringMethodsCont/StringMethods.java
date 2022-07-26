package day18_StringMethodsCont;

public class StringMethods {
public static void main(String[] args) {
	/*indexOf(): returns the index number of the first character in the given String
	 *           as an int value
	 *           
	 * 
	 * 
	 */
	
	String A1 = "Batch 12 is a great batch";
	
	int num = A1.indexOf("g");
	System.out.println(num);
	
	int num2 = A1.indexOf("at ");
	System.out.println(num2);
	
	String B1 = "today is tuesday, today we have class in the afternoon";
	
	int num3 = B1.indexOf("te");
	System.out.println(num3);
	
	String Address = "7925 Jones Branch Dr, Mclearn, VA 22003";
	int beginIndex = Address.indexOf("M");
	System.out.println(beginIndex);
	int endingIndex = Address.indexOf(", V");
	System.out.println(endingIndex);
	String cityName = Address.substring(beginIndex, endingIndex);
	System.out.println(cityName);
	
	String emailAddress = "RandomEmails@gmail.com";
	int beginIndex2 = emailAddress.indexOf("@")+1;
	System.out.println(beginIndex2);
	int endIndex2 = emailAddress.indexOf(".com");
	System.out.println(endIndex2);
	String email = emailAddress.substring(beginIndex2, endIndex2);
	System.out.println(email);
	
}
}
