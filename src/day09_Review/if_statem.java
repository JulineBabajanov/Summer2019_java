package day09_Review;

public class if_statem {
public static void main (String [] args) {
	
	
	/* single if statement :
	 *   if(boolean expression){
	 *   some codes to run          // if block gets executed if the condition is true
	 *   }
	 * 
	 * 
	 * 
	 * 
	 */
	
	if(true) {
		System.out.println("Hello\n\n ");
		System.out.println("Happy Friday\n\n");
	}
	
	if(9<10) {
		System.out.println("Today is Friday"+"\t\t\t"+" So have a great weekend! \n\n");
	}

	int X = 987654321;
	
	if(X%2==0) {
		System.out.println(X + " is an even number \n\n");
	}
	
	if(X%2 != 0) {
		
		System.out.println(X+ " is an odd number \n");
	}
	
	int Y = 2345675;
	
	if(Y%5==0 ) {
		System.out.println(Y+" is divided evenly by 5 \n");
	}
	
	if(Y%5!=0) {
		System.out.println(Y+" can not be divided by 5 evenly \n");
	}
	
	String CEO = "Main boss";
	String Kuzzat = "Main boss";
	
	System.out.println(CEO == Kuzzat+"\n");
	
	if(Kuzzat == CEO) {
		System.out.println("Nice person\n");
	}
	if(Kuzzat != CEO) {
		System.out.println("Cool guy");
	}
	
	int TotalNumber = 100;
	boolean Cybertek = true;
	boolean BestSchool = true;
	
	if (Cybertek == BestSchool) {
		TotalNumber+=500;
	}
	
	System.out.println(TotalNumber);
	
	
	/*1. Declare a variable and initialize user age
	 * 2. write a program if user is eligible to vote 
	 * 
	 */
	
	byte UserAge = 19;
	byte voteAge = 18;
	if(UserAge >=voteAge) {
		System.out.println("User is Eligible to vote because they are "+UserAge+" years old");
	}
	
	if(UserAge < voteAge) {
		System.out.println("User is not eligble to vote because they are younger than "+voteAge+" years old");
	}
	
	
}
}
