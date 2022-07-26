package day12_SwitchStatement;

public class IfStatement_WithoutCurly {
public static void main (String[]args) {
	
	if (true) {
		System.out.println("Hello");
		System.out.println("Hello");
	}else {
		System.out.println("World");
	}
	
	
	
	if(true) {
		System.out.println("yes");
		System.out.println("why");
	}
	
	if(true)
		System.out.println("Yes");
	else
		System.out.println("No");
	
	
	if(true)
	   if(false)
    	System.out.println("Hello world");
	   else
		   System.out.println("Hello Cybertek");
	
	int grade1 = 80;
	
	if (grade1 >= 90) {
		System.out.println("A");
	}else if(grade1>=80) {
		System.out.println("B");
	}else if (grade1>=70) {
		System.out.println("C");
	}
	
	
	
}
}
