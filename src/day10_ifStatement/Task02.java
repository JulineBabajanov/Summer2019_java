package day10_ifStatement;

public class Task02 {
public static void main(String[] args) {
	
	/* write a program that:
	 * 1. 0~12 ==> good morning
	 * 2. 12-15 ==> good afternoon
	 * 3. 15-23 ==> good night
	 * 
	 */
	
	
	int time = 22;
	
	if (time >=0 && time<12 ) {
		System.out.println("Good morning");
	}else if(time > 12 && time <=15) {
		System.out.println("Good afternoon");
	}else if (time >15 && time <=23) {
		System.out.println("Good night");
	}else {
		System.out.println("noon");
	}
}
    int num1 = 30;
    int num2 = 300;
    int num3 = 200;
    
    
    if (num1> num2 && num1 >num3) {
    	System.out.println(num1+" is the bigger number");
    }else if (num2>num1 && num2 > num3) {
    	System.out.println(num2+" is the bigger number");
    }else if (num3 > num1 && num3 > num2) {
    	System.out.println(num3+" is the bigger number");
    }else if ( num3==num2 && num3 >num1) {
    	System.out.println(num3 +" and "+num2+" are the bigger number");
    }else if (num3==num1 && num3 > num2) {
    	System.out.println(num3+" and "+num1+" are bigger");
    }else if (num2 == num1 && num2 > num3){
    	System.out.println(num2+" and "+num1+" are the bigger numbers");
    }else {
    	System.out.println("all of them are equal");
    }
    
    
    
    


}
