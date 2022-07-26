package Day01_FirstProgramming;

public class cities {
public static void main (String[]args) {
	int city1 = 2345673;
	int city2 = 5688944;
	int city3 = 16189445;
	 
	System.out.println(city1+" "+city2+" "+city3);
	System.out.println("\n"+city1+"\n\n"+city2+"\n\n"+city3);
	
	
	int num1 = 46;
	int num2 = 90;
	int sum = num1+num2;
	System.out.println(sum);
	
	double radius = 5.5;
	double pi = 3.14;
	double perimeter = 2*radius*pi;
	double area = radius * radius * pi;
	System.out.println("The perimeter is: "+perimeter+"\n"+"and the area is: "+area);
	
	double width = 4.5;
	double height = 7.9;
	double area1 = width * height;
	System.out.println("The area of the rectangle is: "+area1);
	
	int number1 = 10, number2 = 20, number3 = 40;
	int average = (number1+number2+number3)/3;
	System.out.println("The average between 10, 20 and 40 is: "+average);
	
	int pies = 10, people = 4;
	double piesPerson;
	piesPerson = (double)(pies/people);
	System.out.println(piesPerson);
	
	
	System.out.println((double)(7.9)+(double)+(6.7));
	
	int hour = 12;
	int minute = 24;
	int second = 33;
	String amOrPm = "PM";
	String time =hour+":"+minute+":"+second+amOrPm; 
	//System.out.println(hour+":"+minute+":"+second+amOrPm);
	
	System.out.println(time);
	
	System.out.println(198%2);
	
	
	
	
}
}
