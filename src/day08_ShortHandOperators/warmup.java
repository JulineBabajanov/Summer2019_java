package day08_ShortHandOperators;

public class warmup {
public static void main(String[] args) {
	
	/* write a java program that converts gallons to liters
	 * 1 gallon = 3.785 liters
	 * 
	 * write a java program that converts liters to gallons
	 * 
	 */
	
	int gallon = 2;
	double liters = gallon * 3.785; //converts gallons to liters
	
	System.out.println(gallon+" gallons equals to "+liters+" liters");
	
	double L = 1;
	double G = L / 3.785;
	System.out.println(L+" Liters is equal to "+G+" gallons"); //converts 1 LITER  into GALLONS
	
	
	//Task 1
	int x = 2;
	int y = x++; //2
	
	int x2 = 2;
	System.out.println(x2++); //2
	System.out.println(x2);  //3
	
	int x3 = 2; 
	System.out.println(--x3); //1
	
	int x4 = 8;
	int y4 = x4--;
	System.out.println(y4); //8
	System.out.println(x4); //7
	
	
	
	
	
}
}
