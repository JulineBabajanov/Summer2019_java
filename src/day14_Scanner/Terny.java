package day14_Scanner;

public class Terny {
public static void main(String[] args) {
	
	int num = 0;

	
 num = (true) ?  100 : 50;

System.out.println(num);

String SchoolName = "";

   boolean Batch12 = true;

  String BestSchool = Batch12 ? "Cybertek" : "Invalid";
   
   System.out.println(BestSchool);

 
   
   
   
   double interestRate = 0;
   boolean GoodCredit =true;
   
   
 interestRate = (GoodCredit == true) ? 0.5 : 0.9;
  System.out.println(interestRate);

byte grade = 50;

boolean Passed = grade >= 60? true: false;
   

System.out.println(Passed);

char FinalGrade = 'C';
String Group ="";

  if(FinalGrade == 'A') {
	  Group = "As early bird";
  
  }else if(FinalGrade =='B') {
	  Group = "Group 1";
  }
  else if(FinalGrade == 'C'){
	  Group = "Group 2";
  } 
  else {
  
	 Group = "After Group 1"; 
  }

System.out.println(Group);



 Group = (FinalGrade == 'A') ? "Eearly Bird": (FinalGrade == 'B') ? "Group 1": "No group";



System.out.println(Group);

	
      






}
}
