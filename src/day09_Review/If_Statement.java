package day09_Review;

public class If_Statement {
	public static void main(String[] args) {
		
		
		/*Single if statement: key word starts with if
		 * if(must take a boolean expression){
		 * in this body you have codes. this if block gets executed if boolean is true
		 * 
		 * }
		 * 
		 * 
		 */
		
		
		if(9<10) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
		
		}
  int a=1000;
  if(true) {
	  a=2000;
	  System.out.println("A is increased");
	  
  }	
		System.out.println(a);
		
		/*if statement:
		 *     single if:
		 *        if(condition){
		 *        some codes to run
		 *        }
		 *   if block only gets executed if statement is true
		 */
		
		int X=987654320;
		if(X%2==0) {
			System.out.println(X);
			System.out.println("X is even");
		}
		
		if(X%2!=0) {
			System.out.println(X);
			System.out.println("Its and odd number\n\n");
		}
		
		int Y= 2345678;
		if(Y%5==0) {
			System.out.println(Y);
			System.out.println("it can be divided as a whole\n\n");
		}
		if(Y%5!=0) {
			System.out.println(Y);
			System.out.println(Y+" \tcan not be divided by a whole\n\n");
		}
		
		
		
	String CEO="Main Boss";
	String Kuzzat="Main Boss";
	System.out.println(CEO==Kuzzat);
		
	if(Kuzzat==CEO) {
		System.out.println("Great person in the world");
		System.out.println("First if block");
	}
		if (Kuzzat!=CEO) {
			System.out.println("Kuzzat will be bad person");
			System.out.println("Second if block");
		}
		
		double TotalNumber=100;
		boolean Cybertek=true;
		boolean BestSchool=true;
		 
		if(Cybertek==BestSchool) {
			TotalNumber +=500;
		}
		if(Cybertek!=BestSchool) {
			TotalNumber -=50;
		}
		
		
		System.out.println("The new total number will be "+ "$"+TotalNumber);
		
		
		byte PersonAge=8;
		byte voteAge=18;
		
		if(PersonAge<=voteAge) {
		  System.out.println("Yes you are eligible to vote");
		  System.out.println("You are atleats 18 or older");
		}
		if(PersonAge>voteAge) {
			System.out.println("You are not ellegible to vote yet.");
			System.out.println("Mayb in a few more years");
		}
		
		int numberOfWaterMelon=40;
		boolean lotsOfWaterMelon=false;
		
		if(numberOfWaterMelon>=20) {
			System.out.println("I have more than 20 watermelon");
			lotsOfWaterMelon=true;
			
		}
		if(lotsOfWaterMelon) {
			System.out.println("Good job");
		}
		if(lotsOfWaterMelon==false) {
			System.out.println("I need more watermelon");
		}
		boolean coldOutside=true;
		if(!coldOutside) {
		System.out.println("Wear a coat");
		}
		if(coldOutside){
			System.out.println("Wear a t-shirt");
		}
		
		if (9>8) {
			System.out.println("Nine is greater than eight");
		}
		if (9<8) {
			System.out.println("9 is less than 8");
		}
		System.out.println("TEst completed");
		
		
		int grade2=85;
		if (grade2>60 ) {
			System.out.println("D");
		}
		else if(grade2>=70) {
			System.out.println("C");
		}
		else if(grade2>=80) {
			System.out.println("B");	
			}
			else if(grade2>=90) {
				System.out.println("A");
			}
			else {
				System.out.println("F");
			
		
			}
	}
}


