package day14_Scanner;

public class Ternary {
public static void main(String[] args) {
	
	int num=0;
	if(true) {
		num=100;
		
	}else {
		num=50;
	}
	int n = (false)? 100 : 50; //ternary returns a value
	int z= false ? 101 : 55;
	System.out.println(true? 200 : 300);//you can type ternary like this without the first step.
	System.out.println(num);
	System.out.println(n); //50
	System.out.println(z);
	/*if(condition)===> in ternary you give (Condition)?
	 * else       ===>            :
	 * else if(Condition)   ====> :(Condition)?          
	 * in ternary's body we can only give a single value.
	 * ternary MUST be initialized to a variable(or printed out), MUST return a value. 
	 * () is not required in ternary
	 */
	
	String Schoolname="";
	boolean Batch12=true;
	if(Batch12) {
		Schoolname="Cybertek";
	}else {
		Schoolname="Invalid";
	}
	
	
	System.out.println(Batch12 ? "Cybertek" : "Invalid");
	String BestSchool=Batch12 ? "Cybertek" : "Invalid";
	
			System.out.println("BestSchool");
	// total number of ? and : have to be equal in ternary
	double d= 10;
	if(false) {
		d=10.5;
	}else {
		System.out.println("not true");
	}
	double t= true ? 10.5 : 0;
	System.out.println(t);
	
	double interestRate=0;
	boolean GoodCredit= true;
	
	interestRate=(GoodCredit) == true ? 0.4 : 0.9;
	System.out.println(interestRate);
	System.out.println(GoodCredit? 0.5 : 0.9);
	
	byte grade=90;
	boolean Passed= grade>=60 ? true : false;
	System.out.println(Passed);
	
	char FinalGrade='C';
	String Group="";
	/*if(FinalGrade=='A') {
		Group="As Early bird";
	}else if(FinalGrade=='B') {
		Group="Group1";
	}else {
		Group="After Group 1";
	}
			
	*/		
			
	Group=(FinalGrade== 'A' )? "Early bird" : (FinalGrade=='B')? "Group 1" : "After Group 1";	
			System.out.println(Group);
			
	
	int n1=100, n2=300, n3=400;
	
	int max = (n1 > n2 && n1 > n3) ? n1
			: (n2 > n1 && n2 > n3)? n2
					:n3;
	System.out.println(max);
	
	
	int score = 90;
	char Finals = ' ';
	
	
	Finals =   (score >= 90 && score <=100) ? 'A'
			 : (score >= 80 && score <= 89) ? 'B' 
			 : (score >= 70 && score <= 79) ? 'C' 
		     : (score >= 60 && score <= 59) ? 'D' 
		     : (score >=0 && score <=59) ? 'F' 
		     :  '?';
	
	
	System.out.println(Finals);
	
	
	

}
}
