package day08_ShortHandOperators;

public class ShortHand {
public static void main(String[] args) {
	
	/*short hand operators
	 * +=: addition assignment    x+=y
	 * -= subtraction assignment  x-=y
	 * *= multiplication assignment x *= y ==> x* y
	 * = division assignment : x /= y ==>x
	 * %= : Remainder assignment: x%=y    ==>  x = x%y;
	 */
	 
	
	//addition 
	
	int a = 9;
	   // a = a+3; //12
	    
	    a+=3;
	    System.out.println(a); //12
	
	    int b = a+=5; //17.0
	          //  12+=5==> 12+5=17
	    System.out.println(b); 
	    
	    int c = a+=b;
	    //   17+17     a= 34, c= 34, b = 17
	    System.out.println(c); //34
	    
	    int d = a+=c; // a=68, d=68 c=34 b= 17
	           // 34+=34
	    System.out.println(d);
	    
	    int e = d+=b * 2;
	    System.out.println(e); // d= 85, b = 17, e = 170 c=34
	    
	    int f = b+=85 * 2; //187   f==187  
	    System.out.println(f);
	    System.out.println(b);
	  
	    //subtraction
	    
	    int g = 101;
	    int h = g-=1;
	        // 101-1=100
	    System.out.println(h); //g = 100, h = 100
	    
	    int i = g+=h+5;
	           //100+100+5=205
	    System.out.println(i); // i = 205 g= 205 h =100
	    
	    
	    int j = h += g % i;
	    //      100+205=305%205
	    System.out.println(j); // j = 100 h=100
	    
	  int k = j -=h * 2 % 5;
	  System.out.println(j); //100     k = 100 j == 100
	  
	    //multiplication 
	  
	  int A = 100;
	  A *= 200;
	  System.out.println(A);
	  
	  int B = 100;
	      B*=100 / 10;
	      System.out.println(B); //1000
	      
	      B*= B-=1000;
	      System.out.println(B);
	      
	   //   /= division assignment
	      
	      
	      int C = 1000;
	      C/=5;
	      System.out.println(C); //200
	      
	      int D = 10;
	      C/=D;
	      System.out.println(D);
	    
	    C/=D+10; // C/20 ==> 10
	    System.out.println(C);
	    
	    // % remainder assignment
	    
	    int z = 10%2;
	    System.out.println(z); //0
	    
	    int Z = 10%3;
	    System.out.println(Z);//remainder of 1.... 10-3*3=1
	    
	    int E = 10; 
	    E %=2; //0    
	    
	    int F = 100;
	    F %=2;
	    System.out.println(F);  //even number
	    
	    
	    
	
}
}
