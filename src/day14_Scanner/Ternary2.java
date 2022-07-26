package day14_Scanner;

public class Ternary2 {
public static void main(String[] args) {
	
	
	
	
	
	
	int num = 0;
	/*
	if(true) {
		num=100;
	}else {
		num=50;
	}
	*/
   num = (true)? 100 : 50;	//ternary returns a value
	
	System.out.println(num);
	/* if(condition)            ==>  (Condition)?
	 * else                     ==     :
	 * else if(condition)       ==>     :(Condition)?
	 * 
	 */
	
	
	String Schoolname = "";
	boolean Batch12 = true;
	
	if(Batch12) {
	   Schoolname= "Cybertek";
	}else {
		Schoolname="Invalid";
	}
	
	Schoolname = Batch12 ? "Cybertek" : "Invalid";
	
	
	System.out.println(Schoolname);
	
	
	double interestRate = 0;
	
	boolean GoodCredit = true;
	
 interestRate = (GoodCredit) ? 0.1 : 0.9;
 System.out.println(interestRate);
 
 
	if(!GoodCredit) {
		System.out.println("0.1");
	}else {
		System.out.println("0.9 and above");
	}
	
	
	byte grade = 50;
	boolean Passed = grade >=60 ? true : false;
	System.out.println(Passed);
	
	char FinalGrade = 'D';
	String Group = "";
	/*
	if(FinalGrade=='A') {
		Group = "Early bird";
	}else if(FinalGrade=='B') {
		Group= "Group 1";
	}else if(FinalGrade == 'C'){
	 Group="Group 2";	
	}else {
		Group="After Group 1";
		
	}
	*/
	
	Group = (FinalGrade == 'A') ? "Early Bird" : (FinalGrade=='B') ?  
			"Group 1" : (FinalGrade=='C') ? "Group 2" : "After Group 2"; 
	System.out.println(Group);
	
	int score = 50;
	char Finals = ' ';
	/*
	if(score >=80 && score <=100)
		Finals = 'A';
	else if(score>=80 && score <=89)
	   Finals = 'B';
	else if (score>=70 && score <=79)
	     Finals = 'C';
	else if (score >=60 && score <=69)
		Finals='D';
		else if(score >=0 && score <=59)
			Finals='F';
		else 
			Finals = ' ';
	
	*/
	System.out.println( (score >=80 && score <=100)? 'A' : (score>=80 && score <=89) ? 'B' : 
		(score>=70 && score <=79) ? 'C' : (score >=60 && score <=69) ? 'D' : 
			(score >=0 && score <=59) ? 'F' : "incorrect");
	
	int n1 =10000, n2 =3000, n3 =400;
	
	int max = (n1 > n2 && n1 > n3)? n1 
			: (n2 > n1 && n2 > n3)? n2
		    :  n3;
	System.out.println(max);
	
	
	
	
	
	}
	
	
	

}
