package day06_ArithmeticOperators;

public class ArithOperator {
public static void main(String[] args) {
	
	/*  % remainder or module = returns remainder from the division 
	 * 
	 */
	
	
	int a = 100;
	int b = a - 400;
	System.out.println(b); //-300
	
	int c = a + b;    //100+ -300 = -200
	System.out.println(c);
	
	int X = 3, Y = 5, Z = X * Y;
	System.out.println(Z);
	
	double length = 100, Width = 10, Area = length*Width;
	System.out.println(Area);
	
	System.out.println(3+5+4-2);
	
    double Number1 = 10.0/2.0;
	System.out.println(Number1);
	
	System.out.println(12+6/3);
	
	int output = 12 + 6 / 3;
	System.out.println(output);
	
	System.out.println(5 + 2 * 4); //13
	System.out.println(10 / 2 - 3); //2
	System.out.println(8+12*2-4);//28
	System.out.println(4+17%2-1); //4
	System.out.println(6-3*2+7-1);//6
	
	/*Remainder from math perspective 10/3 = 3 with the remainder of 1
	 *                                12/5 = 2 with the remainder of 2 (12 - (5*2) )
	 * 
	 */
	
	
	int result1 = 10%3;
	System.out.println(result1);
	
	System.out.println(12%5);
	System.out.println(20/3.0); //6
	
	
	int oddNum1 = 20% 2;
	System.out.println(oddNum1); //even number because remainder of zero
	int Num45 = 45% 2;
	System.out.println(Num45);//odd because there is a remainder of one
	int Num65 = 65%2;
	System.out.println(Num65); //odd bc there is a remainder of 1 ...... 65 - 32 * 2
	int Num67 = 67%2;
	System.out.println(Num67);
	int num68 = 68%2;
	System.out.println(num68);

	System.out.println(3 + 4 * 4 + 5 * (4+3) - 1); //53
	
	//10/4 == 2 with remainder of 2*4=8.......10-8=2
	
	System.out.println(10%4);
	
	System.out.println((4+17) % 2 - 1 ); //0
	
	short firstNumber = 10;
	short secondNumber = 20;
	short thirdNumber=30;
	System.out.println(firstNumber + secondNumber);
	
	int pies = 10, people = 4;
	double piesPerson = (double) pies/people;
	System.out.println(piesPerson);
	
	System.out.println( 7.9 + 6.7);
	
	System.out.println((2+3+9)/3);
	
	System.out.println(2*5.5*3.15);
	
	int x = 8;
	int y = x--;
	System.out.println(y);
	
	int a = 1;
	
	
	
	
	
	
}
}
