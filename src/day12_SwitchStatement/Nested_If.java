package day12_SwitchStatement;

public class Nested_If {
	public static void main(String[] args) {
		
		int A=20, B=20, C=20;
		
		if(A==B && B==C) { //if all are equal
			System.out.println("All are equal");
		}
		else {
			if(A==B) { //if a and b are equal
				System.out.println("A and B are equal");
			}
			else if(A==C) { //if a and c are equal
				System.out.println("A and C are equal");
			}else if(B==C) { //if b and c are equal
				System.out.println("B & C ARE EQUAL");
			}else { //if none of them are equal you will get this output
				System.out.println("None of them are equal");
			}
		}
		
		
		int grade=101;
		if(grade>=0 && grade<=100) {
			
		}
		if(grade>=60) {
			if(grade>=90) {
				System.out.println("A");
			}else if(grade>=80) {
				System.out.println("B");
			}else if(grade>=70) {
				System.out.println("C");
					
				}else {
					System.out.println("D");
				}	
				}else {
					System.out.println("Failed");{
					
					else {
						System.out.println("Invalid Entry");
					}
					}
				}
			}
		
		

		
		
		
		
		
	}


