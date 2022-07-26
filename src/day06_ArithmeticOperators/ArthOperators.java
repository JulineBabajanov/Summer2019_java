package day06_ArithmeticOperators;

public class ArthOperators {
public static void main (String []args) {
	
	/* +: addition = adds 2 or more numbers together
	 * - subtraction , subtracts a number from another number
	 * * multiplication , multiplies
	 * division, divides
	 * % remainder, returns the remainder from the division
	 */ 
	 int X = 3, Y = 5, Z = X*Y;
	 System.out.println(Z);
	
	double length = 100, Width = 10, Area = length*Width;
	System.out.println(Area);
	System.out.println(3+5+4-2);
	
	/*Arithmetic operators 
	 * 
	 * 
	 */
	double Number1 = 10.0/3.0;
	System.out.println(Number1);
	
	int outcome = 12 + 6 / 3;
	System.out.println(outcome);
	
	System.out.println(5+2*4);//13
	System.out.println(10/2-3);//2
	System.out.println(8+12*2-4);//28
	System.out.println(4+17%2-1);//4
	System.out.println(6-3*2+7-1);//6
	
	int result1 = 10%3;
	System.out.println("remainder of "+result1); //1
	
	
	/*20, 45, 65, 67, 68
	 * even : can be divided by 2 wihtout a remainder
	 * odd: divided by 2, will have remainder
	 * 
	 */
	System.out.println(68%2);//even 
	
	int Number20 = 20%2;//even
	int Number45 = 45%2;//odd
	int Number65 = 65%2;//odd    (65 - 32 * 2) = 1
	int Number67 = 67%2;//odd
	int Number68 = 68%2;//even  
	
	System.out.println(3+4*4+5*(4+3));
	//                 3+4*4+5 *  7
	//                 3+16+35
	//                19+35= 54
	
	System.out.println(10%4);
	
	System.out.println((4+17)%2-1);
	//                  21%2-1==0
	
	System.out.println((6-3)*(2+7)/3);
	               //   3*    9 /3=9
	
}
}
