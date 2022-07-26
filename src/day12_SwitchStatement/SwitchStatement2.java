package day12_SwitchStatement;

public class SwitchStatement2 {
public static void main(String[]args) {
	
	/*  
	 *  switch statement does the similar thing like multi brnach if statement does
	 * 
	 *   switch(Expression){
	 *   case CaseValue: 
	 *        statement1
	 *        statement2
	 *        break;
	 *   }
	 * 
	 */
	
	int score =1;
	
	if(score==1) {
		System.out.println("1");
	}else if(score==2) {
		System.out.println("2");
	}else {
		System.out.println("invalid");
	}
	// switch statement you can have as many cases as you want and only one default
	//if there is no break in the switch then the switch continues. if there is a break then it exits the switch statement
	switch(score) { //Must give an expression: data
	case 1: 
		System.out.println("1");
		//break;
	case 2:
		System.out.println("2");
		//break;
		
	default:
		System.out.println("invalid 2");
		//break;
	}
	 
	String str="Java";
	switch(str) {
	
	case "C#":
		System.out.println("C# is programming language");
	
	case "python":
		System.out.println("python programming langauge.");
		
	default:
		System.out.println("invalid 3");
	}
	char grade = 'F';
	
	switch(grade) {
	
	case 'B':
		System.out.println("Passed with a B");
		break;
	case 'C':
		System.out.println("Average with a C");
		break;
	case 'A':
		System.out.println("Passed with an A");
	    break;
	case 'D':
		System.out.println("Passed with a D");
		break;
    default:
    	System.out.println("Failed");
	}
	
	int age = -50;
	if(age>=0 && age <=150) {
	if(age>=18) {
		if(age>=70) {
			System.out.println("Can vote three times");
		}else if(age>=50) {
			System.out.println("you can vote two times");
		}else {
			System.out.println("Can vote one time");
	
		}
} else {
	System.out.println("not eligible to vote");
	
}

	
}else {
	System.out.println("Invalid entry, enter a proper age");
}
}
	
	
}

