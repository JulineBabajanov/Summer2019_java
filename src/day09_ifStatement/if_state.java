package day09_ifStatement;

public class if_state {
public static void main (String [] args) {
	
	/*   single if statement: 
	 * 
	 *     starts with if (boolean expression){
	 *       // codes run if boolean expression is true
	 *     }
	 * 
	 */
	
	if (9<10) {
		System.out.println("Hello" + "\n"+ "hi");
		System.out.println("Happy Friday");
		System.out.println("Tomorrow will be a good day!");
	}
	
	
	
	int a = 1000;
	
	if(true) {
	a = 2000;	
	System.out.println("a is increased");
	}
	System.out.println(a+"\n\n\n");
	
	
    int x = 987654320;
    
    if (x%2==0) {
    	System.out.println(x+ " is even");
    }
	
	
    if(x%2 !=0) {
    	System.out.println(x);
    	System.out.println("its a odd number ");
    }
	
	int Y = 2345678;
	
	if (Y%5==0) {
		System.out.println(Y+" can be divided by 5");
	}
	
	if (Y%5 !=0) {
		System.out.println(Y+ " cantt be divided by 5");
		System.out.println("\n\n\n\n");
	}
	
	String CEO = "Main Boss";
	String Kuzzat = "Main Boss";
	
	if(Kuzzat == CEO) {
	System.out.println("Great person in the world");
	System.out.println("First if block");
	
	}
	
	if(Kuzzat != CEO) {
		System.out.println("gREAT pERSON IN THE WORLD");
		System.out.println("second block");
	}
	System.out.println("\n\n\n");
	int TotalNumber = 100;
	boolean Cybertek = true;
	boolean BestSchool = true;
	
	if (Cybertek == BestSchool) {
		TotalNumber +=500;
	}
	if (Cybertek != BestSchool) {
		TotalNumber -= 50;
	}
	System.out.println(TotalNumber+"\n\n");
	
	/* declare a variable and initialize user age
	 * write a program if user is eligible to vote
	 * 18 voters age
	 */
	byte PersonAge = 18;
	byte voteAge = 18;
	    
	if (PersonAge >= voteAge) {
		System.out.println("Yes you are eligible to vote");
		
		
	}
	if(PersonAge < voteAge) {
		System.out.println("You are not old enough to vote");
	}
	
	int numberOfWaterMelon;
	boolean lotsOfwaterMelon;
	lotsOfwaterMelon =false;
	
	numberOfWaterMelon = 40;
	
	if (numberOfWaterMelon >=20) {
		System.out.println("I have more than 20 watermelon");
		lotsOfwaterMelon = true;
	}
	
	if(lotsOfwaterMelon) {
		System.out.println("Good job");
	}
	if(lotsOfwaterMelon==false) {
		System.out.println("I need more watermelon");
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
