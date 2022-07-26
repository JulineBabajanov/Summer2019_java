package day10_ifStatement;

public class time {
public static void main(String[]args) {
	
	
	byte time = -20;
	
	if(time >=0 && time <=12) {
		System.out.println("Goodmorning");
	}else if(time >12 && time <=15) {
		System.out.println("Good Afternoon");
	}else if (time>15 && time<=23) {
		System.out.println("Goodnight");
	}else
		System.out.println("This is not an accurate time");
	
	
}
}
