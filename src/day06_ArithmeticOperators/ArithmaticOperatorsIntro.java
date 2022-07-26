package day06_ArithmeticOperators;

public class ArithmaticOperatorsIntro {
	public static void main(String[] args) {
		
		/* +: addition, adds two numbers together
		 * -: subtraction, subtracts a number from another number
		 * *: multiplication, multiplies
		 * 
		 *   /: :  division, divides
		 *   % remainder, returns the ramainder from the division
		 * 
		 */
		 
		int a = 100;
		int b = a - 400; // -300
		System.out.println(b);
		
		int c = a + b;
		System.out.println(c); //100+ -300 = -200
		
		int X = 3, Y = 5, Z = X * Y;
		System.out.println(Z);
		
		double length = 100,
			Width = 10,
			Area = length/Width;
		System.out.println(Area);  //10.0
		System.out.println(3+5+4-2); //10
		
		
		//double resultNum9 = 9/0; //denominator can not be zero
		//System.out.println(resultNum9);
		
		double Number1 = 10/3f;
		System.out.println(Number1);
		
		int outcome = 12+6/3;
		             //  12 + 2 = 14 divide first
		System.out.println(outcome);  //14
		
		System.out.println(5+2*4); //13
		System.out.println(10/2-3); //2
		System.out.println(8+12*2-4); //28
		System.out.println(4+17%2-1); //4
		System.out.println(6-3*2+7-1); //6
		System.out.println(8+12*2); //32
		
		/*remainder %:
		 * 
		 * 10/3 ==> 3 with remainder of 1
		 * 12/5 ==> 2 with remainder of ( 12- (5*2) )
		 * 
		 */
		
		int result1 = 10%3; //1
		System.out.println(result1);
		
		System.out.println(12%5); //2
		
		//even number: can be divided by 2 without a remainder
		// odd: divided by 2, will have a remainder
		int Number20 = 20 % 2; // even number
		int Number45 = 45 % 2;
		System.out.println(Number45); //1, odd
		int Number65 = 65%2; //odd   (65 - 32 * 2 ) = 1
		System.out.println(Number65);
		
		System.out.println(1+2-2+3); //4
		System.out.println(1 + 2 - (2+3));
		//                  3 -  5 = -2
		
		//average = (a+b+c+d) /4.0;
		
		System.out.println(3+4*4+5*(4+3)-1); 
		//                   3+4*4+5*7-1
		//                    3+16+35-1
		//                    = 53
		
		
		 /*
		  * 10/4 ==> 2 with remainder of (10- 2*4) =2
		  * 
		  */
		
		System.out.println(10%4); //2 left over after 8
		System.out.println(4+17%2-1);
		//                   4+1-1=4
		    
		double percentage = 10/100; //10% 0.1
		
		
	}

}
