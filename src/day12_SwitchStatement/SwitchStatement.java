package day12_SwitchStatement;

public class SwitchStatement {
	public static void main(String[] args) {
		
		/*switch statement does the similiar thing like multi branch if statements
		 * switch(expression){
		 * case CaseValue:
		 *    statement1
		 *    statement2
		 *    break;
		 *    default: 
		 *    statement
		 *  
		 *    }
		 * 
		 */
		
		int score=1;
		if(score==1) { //Must give boolean expression
			System.out.println("1");
		}
		else if(score==2) {
			System.out.println("2");
		}else {
			System.out.println("invalid");
		}
		
		/* we can have as many cases as we want in the switch statement
		 * 
		 * we can only have one default section in a switch statement
		 * 
		 * default does not have to be at the end of the statement. 
		 * 
		 * break is for exiting the switch statement. just like break to exit a classroom...its considered the closing statement
		 * 
		 * if you do not have a break it will not exit the switch statement. it will exit until it finds a break or closing curly brace
		 */
		
		
		
		
		switch(score) { //Must give an Expression: must be a data
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
			switch(score) { //Must give an Expression: must be a data
			case 1:
				System.out.println("1");
				
			case 2:
				System.out.println("2");
				
			default:
				System.out.println("Invalid");
				
		
			
		
			}
			
			String str="Java";
			
			switch (str) {
			
			case "C#":
				System.out.println("C# programming language");
				break;
			case "Python":
				System.out.println("Python programming language");
			   break;
			case "Java":
				System.out.println("Java programming language");
				break;
			default:
				System.out.println("INvalid");
				break;
			}
			
			
			char grade='A';
			
			switch(grade) {
			
			
			case 'B':
				System.out.println("Passed with B");
			default:
				System.out.println("Failed");
			case 'C':
			   System.out.println("Passed with A");
			   
	/*vote age:
	 * age>=70==> can vote three times
	 * 70>age>=50==>can vote twice
	 * 50>age>=18==>can vote one time
	 * 
	 * 
	 * 
	 */
			int age=155;
			if(age>=0 && age<=150) {
				
			
			if(age>=18) {
				if(age>=70) {
					System.out.println("can vote three times");
				} else if(age>=50) {
					System.out.println("can vote two times");
				}
			else {
				System.out.println("can vote one time");
			}
			}else {
				System.out.println("not eligible to vote");
			}
			} else {
				System.out.println("Invalid Entry");
			}
			
			
			}
			
			
			
			
			
			
			
			
		
	}
	}
		
		
