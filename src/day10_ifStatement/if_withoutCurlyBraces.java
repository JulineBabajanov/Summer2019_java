package day10_ifStatement;

public class if_withoutCurlyBraces {
public static void main (String[]args) {
	
	if (false) {
		System.out.println("Today is friday");
		System.out.println("Tomorrow is day off");
		System.out.println("There is no java class tomorrow");
	}
	
	if(true)
		System.out.println("Today is FRiday");
	System.out.println("Tomorrow there is no class");
	
	if(true)
		System.out.println("if block");
	else if(false)
		System.out.println("else-if block");
	else
		System.out.println("else bock");
}
}
