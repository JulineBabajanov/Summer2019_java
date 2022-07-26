package day08_ShortHandOperators;

public class Warm1 {
public static void main(String[] args) {
	
	int int1 = 5;
	int int2 = 3;
	boolean answer = int1 > int2;
	System.out.println(answer);
	System.out.println(int1 + " is greater than "+int2);
	
	int ApplesCount = 20;
	int OrangesCount = 30;
	int PearsCount = 30;
	
	boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
	System.out.println(comp);
	
	
	String OutsideWeather;
	int Degree;
	OutsideWeather = "Shiny";
	Degree = 70;
	boolean comp2 = (!(OutsideWeather == "Rainy"||Degree == 70));
	
	System.out.println(comp2);
	
	int b = 2;
	boolean res = ++b == 2 || --b == 2 && --b == 2;
	System.out.println(res);
	
	boolean x = true , z = true;
	int y = 20;
	x = (y!=10)|| (z=false);
	System.out.println(x);
	
	/*
	 * write a java program that converts gallons to liters... 1 gallon = 3.785 liters
	 */
	
	
	int gallons = 1;
	double liters = gallons * 3.785;
	System.out.println(gallons + " gallons equal to "+liters+" liters");
	
	
 int L = 4;
 double G = L/3.785;
 System.out.println(L+" liters are in "+G+" gallons");
	
	
	int x1 = 2;
	int y1 = x1++;
	System.out.println(y1+" "+x1);
	
	int x2 = 2;
	System.out.println(x2++);
	System.out.println(x2);
	
	int x3 = 2;
	System.out.println(--x3);
	
	int x4 = 8;
	int y4 = x4--;
	System.out.println(y4);
	System.out.println(x4);	
	
	
	
	
	
	
	
}
}
