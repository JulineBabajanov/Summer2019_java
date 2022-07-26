package day12_SwitchStatement;

public class switchState {
public static void main(String[] args) {
	
	/* switch statement does similar thing like multi branch 
	 * 
	 * switch(Expression){
	 * case CaseValue:
	 *      statement1:
	 *      statement2:
	 */
	
	int score = 1;
	
	switch (score) {
	
	case 1:
		System.out.println("1");
	break;
	case 2:
		System.out.println("2");
		break;
	default:
		System.out.println("Invalid entry");
		
	}
	
	
	String str = "Java";
	
	switch(str) {
	
	case "C#":
		System.out.println("C# programming");
		break;
	case "Python":
		System.out.println("Python programming");
	     break;
	case "Java":
		System.out.println("Java programming");
		break;
	default:
		System.out.println("Invalid");
		break;
		
	}
	
	
	char grade = 'B';
	
	switch(grade) {
	
	case 'B':
		System.out.println("Passed with a B");
	break;
	case 'C':
	System.out.println("C");
	break;
	
	}
	
	int age =151;
	if(age>=0 && age <=150){
	if(age >= 18) {
		if(age>=70) {
			System.out.println("can vote three times");
		}else if(age >=50) {
			System.out.println("You can vote two times");
		}else {
			System.out.println("You can vote one time");
		}
	}else {
		System.out.println("not eligible to vote");
	}
	
	}else {
		System.out.println("Not a valid age");
	}
	
	
	
	
}
}
