package day10_ifStatement;

public class singleIfState {
public static void main(String[] args) {
	
	if (9 > 8) {
		System.out.println("9 is greater than 8");
	}
	
	if (9<8) {
		System.out.println("8 is greater than 9");	
	}
	System.out.println("Test completed");
	
	
	int num1 = 500, num2 = 100, max= 0;
	
	if (num1 > num2) { //num1 is greater than num2
		max = num1;
		System.out.println("Block 1");
	}
	if (num2 > num1) {
		max = num2;
		System.out.println("Block2");
	}
	
	if(num1==num2) {
		max = num2;
		System.out.println("both numbers are equal");
	}
	
	System.out.println("Maximum number between "+num1+" and "+num2+" is "+max);
	
	
	//task 2
	System.out.println("\n");
	
	int hour = 12;
	int minute = 60;
	int seconds = 33;
	
	String PMorAm = "PM";
	System.out.println(hour+":"+minute+":"+seconds+" "+PMorAm+"\n");
	
	
	if(hour > 24 || minute  >60 || seconds > 60) {
		System.out.println("invalid time");
	}
	
	else System.out.println("Great Timing");
	
	//task 3
	System.out.println("\n\n");
	int n1 = 1000, n2 = 400, n3 = 700;
	
	int maximum = 0;
	//String result = "Maximum number between "+n1+", "+ n2+", and " + n3 + "is "+ maximum;
	if (n1 > n2 && n1 > n3 ) {
		 maximum=n1;
		System.out.println(maximum+ " is equal to "+n1);
	}if(n2 > n1 && n2 > n3) {
		maximum = n2;
	}
	if (n3 > n1 && n3 > n2) {
		maximum = n3;
	}
	String result = "Maximum number between "+n1+", "+ n2+", and " + n3 + " is "+ maximum;
	//System.out.println("The maximum number between "+n1+", "+ n2+", and "+n3+" is "+maximum);
	System.out.println(result);
	/* in order for n1 to be the maximum: n1 > n2 && n1 > n3
	 * in order for n2 to be the maximum: n2 > n1 && n2 > n3
	 * in order for n3 to be the maximum n3 > n1 && n3 > n2
	 */
	
	double B;
	if(true) {
		B=100;
		System.out.println(B);
	}
	
	//Task4
	
	int StatusCode = 200;
	String finalResult ="";
	
	if (StatusCode==200) {
		finalResult="OK";
	}
	if(StatusCode==201) {
		finalResult="Created";
	}
	if(StatusCode==202) {
		finalResult="Accepted";
	}
	if(StatusCode==301) {
		finalResult="Moved Permantly";
	}
	if(StatusCode==303) {
		finalResult="See other";
	}
	if(StatusCode==304) {
		finalResult="Not modified";
	}
	if(StatusCode==307) {
		finalResult="temporary Redirect";
	}
	if(StatusCode==400) {
		finalResult="Bad request";
	}
	if(StatusCode==401) {
		finalResult="Unauthorized";
	}
	if(StatusCode==403){
		finalResult="Forbidden";
	}
	if(StatusCode==404) {
	finalResult="Not found";
	}
	if(StatusCode==410) {
	finalResult="Gone";
	}
	if(StatusCode==500) {
		finalResult="Internal Server Error";
	}
	if(StatusCode==503) {
		finalResult="Service Unavailable";
	}
	System.out.println("Status Code "+StatusCode+" is: "+finalResult);
	
	
}
}
