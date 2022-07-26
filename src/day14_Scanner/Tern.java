package day14_Scanner;

public class Tern {
public static void main(String[] args) {
	
	int num = 0;
	/*if(true) {
		num = 100;
	}else {
			num = 50;
	}
	System.out.println(num);*/
	
	num = (true)? 100 : 50;
	System.out.println(num); //in ternararys body we can only give a single value. must be initialized to a variable and must return a value.
	
	int grade = 90;
	grade = (true)? 5000 : 70;
	System.out.println(grade);
	String Schoolname = "";
	boolean Batch12 = true;
	if(Batch12) {
		Schoolname = "Cybertek";
	}else {
		Schoolname = "Invalid";
	}
	
	System.out.println( Batch12 ? " Cybertek" : "Invalid");
	
   String BestSchool = Batch12 ? " Cybertek" : "Invalid";
   System.out.println(BestSchool);
	
	double interestRate = 0;
	boolean GoodCredit = true;
	
	interestRate = (GoodCredit == true) ? 0.5 : 0.9;
	
	System.out.println(interestRate);
	
	
	byte grade1 = 60;
	boolean Passed = grade1 >= 60 ? true : false;
	System.out.println(Passed);
	
	char FinalGrade = 'C';
	String Group = "";
	
	Group = (FinalGrade == 'A') ? "Early Bird": (FinalGrade =='B') ? "Group 1" : (FinalGrade == 'C') ? "Group 2 ": "Last Group";
	
	System.out.println(Group);
	
	int score = 900;
	char Finals = ' ';
	Finals = (score >= 90 && score <= 100) ? 'A' : (score >=80 && score < 90) ? 'B': (score >= 70 && score < 79) ? 'C': 
		     (score >=60 && score < 70) ? 'D' : (score >=0 && score < 60) ? 'F': '!';
	
	System.out.println(Finals);
}
	
}

