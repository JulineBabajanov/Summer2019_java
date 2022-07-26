package day07_Unary_Shorthand;

public class UnaryOperators {
public static void main (String []args) {
	
	
	/* + positive
	 * - negative
	 * ++ increment
	 * -- decrement
	 * for + & -:
	 * +- = -
	 * -- = +
	 * ++ = +
	 * -+=-
	 * 
	 * increment: increases the value by 1 and can either be post increment or pre increment
	 *
	 * pre increment: operator is placed before the variable int num1 = 100;
	 *
	 * decrement: decreases the value by 1
	 * 
	 */
	
	int num1 = 100;
	System.out.println(++num1); //num1 + 1 = 101
    int num2 = ++num1; // ++(101) ==> 102
    System.out.println(num2);
	
	int a = 10;
	int b = -10;
	System.out.println(b);
	
	int c = +b;  //-10
	
	int d = -c; // 
	
//post increment where the operator is placed after the variable. It will pass its current value first then it will be incremented by 1
    
    int IntNum = 100;
    System.out.println(IntNum ++);
    System.out.println(IntNum);
    
   int IntNum2 = IntNum++;
   System.out.println(IntNum2); //101
   System.out.println(IntNum);
   
   int x = 100;
   int y = x++ -1;
   System.out.println(y);
   
   //decrement : decreases the value by 1... post and pre
   //pre decrement: operator is placed before the variable(decreases the value by 1 immediately)
   // and post is placed after the variable
   int Z = 100;
   --Z;
   System.out.println(--Z); //98
   
   /*
    * Post decrememnet: operator is placed after the variable and will pass the current value first and the decrememnt
    * 
    * 
    */
   
    int Y = 95;
    System.out.println(Y--); //95
    System.out.println(Y--); //94
    System.out.println(Y); //93
    System.out.println(Y); //93
    
    int inc = 25;
    System.out.println(++inc); //26
    System.out.println(--inc); //25
    
    int T = 25;
    System.out.println(++T); //26
    System.out.println(--T); //25
    
    int A = 50;
   // A = --A + A++ + A-- + A++;
        // 49    49   50    49  
    //    PRE   POST POST   POST
    
    int P = 50;
    System.out.println(--P); //49
    System.out.println(P++);  //49
    System.out.println(P--); //50
    System.out.println(P++); //49
    System.out.println(P);  //50
    
    int L = 1; // 0 
    L = -L-- + L++ / -L-- * --L;
    //  post   post  post   pre
    //   -1     0  / - 1   * -1
    System.out.println(L);
  
    
    int X = 4;
    
    int C = X * 4 - X++;
    System.out.println(C); //12
    
    
    int all = 50; //49, 50, 49
    all = --all + all++ + all-- + all++;
    System.out.println(all);
    
	short Snum = 4; //16 - 3
	int R = Snum * 4 - Snum--;
	
	System.out.println(R);
	System.out.println(Snum);
	
	int W = 1;
	W = - W-- + W++ / -W-- * --W;
	//     -1 + 0  /   -1  *   -1
	System.out.println(W);
	
	int t = 4;
	
	int p = t * 4 - t++;
	
	System.out.println(p);
	
	int z = 198;
	System.out.println(z%2);
	
	
}
}
