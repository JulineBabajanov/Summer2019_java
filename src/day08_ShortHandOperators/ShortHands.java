package day08_ShortHandOperators;

public class ShortHands {
public static void main(String[] args) {
	
	/*
	 *  += addition assignment x+=y 
	 *  -= subtraction assignment
	 *  *= multiplication assignment x * y ==> x*y
	 *   /= division
	 * 
	 */
	
	int a = 9;
	   //a = a+3;
	    a+=3;//a= a+3
	    System.out.println(a);
	
	int b = a+=5;            //a = 34, c = 34, b = 17
	//    17+=17 = 34
	System.out.println(b);
	System.out.println(a);
	int c = a+=b;
	System.out.println(c);
	
   int d = a+=c; // a = 68, d = 68, c = 34, b = 17
   //        34+34
   System.out.println(d);
   
   int e = (d += b) * 2;
   //      68 + 17
   System.out.println(e);// d = 85, b =  17, e = 170
   System.out.println(d);
   System.out.println(c);
   System.out.println(b);
   
   int f = b+=d * 2;
   System.out.println(f); //187
   
   System.out.println(d);
   
   System.out.println("=====================subtraction=================================");
   
   int g = 101;
   int h = g-=1;  // g = 100 , h = 100
   System.out.println(h);
   
   int i = g+=h+5;
   System.out.println(i); // g = 205, h = 100, i = 205
   System.out.println(i+" "+h);
   
   int j = h += g% i;
   System.out.println(j);
   
   int k = j -= h * 2 % 5; // j=100
             //  200%5
         // 100-=0
   System.out.println(k);
   
   System.out.println("================multiplication================");
   
   
   int A = 100;
   A*=200;
   System.out.println(A);
   
   int B = 100;
   B*=100 / 10;
   System.out.println(B); //1000
   
   B*= B-=1000;
   System.out.println(B);
   
   
   System.out.println("=======division======================");
   
   int C = 1000;
   System.out.println(C);
   
   int D = 10;
   
  // C/= D-10;
   System.out.println(D);
   
   
   C /=D+5;
   System.out.println(C);
   
   System.out.println("=========================Remainder==================");
   
   // How to check your division problem.... 
   
   int z = 10%3; //===> 10/3 =3 .... remainder check... 10 - 3*3 =1
   System.out.println(10- 3*3 );
   
   int E = 10;
   E %= 2;
   System.out.println(E);
   
   System.out.println(10.5%3);
   
   int J = 300;
   int K = 10;
   
   J += J%=K;
   System.out.println(J);
   
	
}
}
