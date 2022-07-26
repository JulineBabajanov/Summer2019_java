package day16_Review;

public class AssesmentQuiz {
public static void main(String[] args) {
	
	//Quiz4
	
	//question 1 compile error at line 3
	
	//q2 compile error
	
	//q3 compilation fails
	
	//q4 compilation error
	
	//q5 A replace the boolean
	
 /*    String OPT = true;
	switch (OPT) {
	case "true": 
		System.out.println("True");
		break;
		
	}
	System.out.println("Done");
/*
 * 	
 */
	
	//Q6 //13480
	
	float f1 = (12345.1 > 123_45.0) ? 12456 : 12456.02f;
	                //true  
	float f2 = f1 + 1024;
	System.out.println(f2);
	
	
	//Q7  //10
	
	float f4 = (1_560.00 > 12_60.00) ? 10:20;
	//                true
	System.out.println(f4);
	
	
	//Q8 10 : 22 : 22
	
	int i = 10;
	int j = 20;
	
	int k = j+=i/5;
	//k=j+=2;
	    //j+2==>j= j+2=22
	//k=22
	System.out.println(i + ":"+j+":"+k);
	
	//Q9 remove d & e.... correct ones are A B F 
    String B = "1";
	switch(B) {
	case "1":
		System.out.println("One");
		break;
	
	}
	
	//Q10 m-t-f
	
	int z = 10;
	switch(z) {
	
	case 10:System.out.println("Monday");
	case 11:System.out.println("Tuesday");
	default: System.out.println("FRiday");
	
	}
	//Q11 Compile error
	
	//Q12
	
	
	
	
	
	
	
	
	
}
}
