package day06_ArithmeticOperators;

public class PracticeArithmaticOperators {
public static void main (String[]args) {
	
	System.out.println((5+2)*4);// 28
	System.out.println(10/(5-3));//5
	System.out.println(8+12*(6-2));//56
	System.out.println((4+17)%2-1);//0
	System.out.println((6-3)*(2+7)/3); //9
	
	int num1 = 46;
	int num2 = 90;
	int sum = num1+num2;
	System.out.println(sum);//136

	double perimeter = 2*5.5*3.14;
	System.out.println(perimeter);
	
	double area = 5.5*5.5*3.14;
	System.out.println(area);
	
	double average = ((20+30+50)/3);
	System.out.println(average);
	
	//Task1
	
	int pies = 10, people = 4;
	double piesPerson;
	piesPerson = pies/people;
	System.out.println(piesPerson); //2.0
	
	//Task2
	int pies1 = 10, people1=4;
	double piesPerson1;
	piesPerson1=(double)pies1/people1;
	System.out.println(piesPerson1); //2.5
	
	System.out.println((int)(7.9)+(int)(6.7));	
	System.out.println((int)(7.9+6.7));
	
	
	int firstNumber = 10;
	int secondNumber = 20;
	int thirdNumber;
	thirdNumber = firstNumber + secondNumber;
	System.out.println(thirdNumber);
	
	System.out.println("Result A"+0+1);
	System.out.println("Result B"+1+2);
	
	
	
	
	
	
}
}
