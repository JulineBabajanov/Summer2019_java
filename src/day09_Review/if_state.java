package day09_Review;

public class if_state {
public static void main (String []args) {
	
	/*if statesments:
	 * 
	 * single if statement: 
	 * 
	 *     if(boolean expression) {
	 *     //some codes to run only gets executed if boolean expression is true
	 *     }
	 * 
	 */
	//if block gets executed if the condition is true
	if(9 < 10) {
		System.out.println("Hello");
		System.out.println("Happy Friday");
		System.out.println("Tomorrow is day off");
	}
	
	
	int a = 1000;
	
	if (true) {
		a = 2000;
		System.out.println("a is increased");
	}
	System.out.println(a);
	
	int X = 987654320;
	
	if(X%2 == 0) {
		System.out.println(X);
		System.out.println(X+" is an even number");
		
	}
	
	if(X%2 !=0) {
		System.out.println(X+" is an odd number");
	}
	
	//
	int Y = 23456780;
	if(Y%5 ==0) {
		System.out.println(Y+" CAN be divided by 5");
	}
	if(Y % 5 !=0) {
		System.out.println(Y +" Can't be divided by 5");
	}
	
	
	String CEO = "Main Boss";
	String Kuzzat = "Main Boss";
	System.out.println(CEO == Kuzzat);
	
	if(Kuzzat == CEO) { //true
		System.out.println("Greatest person in the world");
		System.out.println("First if block");
	}
	if(Kuzzat != CEO) { //false
		System.out.println("Great Person Ever");
		System.out.println("Second if block");
	}
	
	int TotalNumber = 100; 
	boolean Cybertek = true;
	boolean BestSchool = true;
	
	if(Cybertek != BestSchool) {
		TotalNumber+=500;
	}
	if(Cybertek == BestSchool) {
		TotalNumber -=50;
	}
	
	System.out.println(TotalNumber);
	byte PersonAge = 78;
	byte voteAge = 18;
	if(PersonAge >= voteAge) {
		System.out.println("Voter Can Vote");
		System.out.println(PersonAge);
	}
	if (PersonAge < voteAge) {
		System.out.println("Not eligble to vote");
	}
	
	
	
	
	
}
}
