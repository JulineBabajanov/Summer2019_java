package day07_Unary_Shorthand;

public class UnOps {
public static void main(String[] args) {
	
	
	/*++ incrememnt
	 * --decrement
	 * +- ==-
	 * -- == +
	 * ++ == +
	 *  imcrement : increases the value by one. 
	 *  1. pre increment: 
	 */
	
	int a = 10;
	int b = -10; 
	System.out.println(b);
	int c = -b;
	System.out.println(c);
	
	//Pre Incrememnet: operator is placed before the variable. Increases the value by one immediately
	int num1 = 100;
	++num1;
	System.out.println(num1); //101
	
	int num2 = ++num1;
	System.out.println(num2);//++101 ==> 102
	
	//Post incrememnt : operator is placed after the variable. It will pass the current value first then it will be incremented by 1.
	
	int IntNum = 100;
	System.out.println(IntNum++);
	
	System.out.println(IntNum);
	
	int IntNum2 = IntNum++;
	System.out.println(IntNum2);
	System.out.println(IntNum);
	
	
	
	int x = 100;
	int y = x++ - 1;
	System.out.println(y);
	
	
	int z = 100;
	--z;
	System.out.println(--z-2);
	
	//post decrement operator is placed after the variable. it will pass the current value and then decrease
	
	int Y = 95;
	System.out.println(Y--);
	System.out.println(Y--);
	int A = 25;
	System.out.println(++A);//26
	System.out.println(--A);//25
	
	
	int T = 25;
	System.out.println(++T);
	
	System.out.println(--T);
	
	System.out.println(T--);
	System.out.println(T++);
	
	int L = 50;
	
	L = --L + L++ + L-- + L++;
	System.out.println(L);
	
	int X = 4;
	int p = X * 4 - X++;
	System.out.println(p);
	
	short Snum = 4;
	int R = Snum * 4 - Snum--;
	//      16       - 4
	
	System.out.println(R);
	
	int W = 1;
	
	W = -W-- + W++ / -W-- * --W;
	
	//   -1     0  /  -1   *  -2    
	
	System.out.println(W);
	
	x = 8;
	y = x--;
	System.out.println(y);
	
	
	
	
	
	
	
}
}
