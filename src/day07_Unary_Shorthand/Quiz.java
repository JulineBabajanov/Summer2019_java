package day07_Unary_Shorthand;

public class Quiz {
public static void main(String[] args) {
	
	
	int a1 = 30;
	int b2 = (byte)a1;
	System.out.println(b2);
	
	
	int a = 200;
	int b = 2;
	System.out.println(a+b-a*b+a/b);
	
     System.out.println((3+2)*2/3%2); //1
     
   double result1 = 10/3.0;
   System.out.println(result1);
   
   String str = "10.5";
   
   int I1 = 10, I2= 20, I3 = 30;
       I1 = I1% 5;
       I2 = I2 % 5;
       I3 = I1*I2;
       
       System.out.println(I1+"\t"+I2+"\t"+I3);
   
   
   
   
   
}
}
