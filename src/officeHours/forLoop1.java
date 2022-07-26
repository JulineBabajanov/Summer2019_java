package officeHours;

public class forLoop1 {
public static void main(String[] args) {
	
	String word="JAVA";
	for(int i = 3; i>=0;i--) {
		System.out.print(word.charAt(i));
	}
	//System.out.println(word.charAt(i));
	System.out.println();
	String word1="java";
	for(int h=3;h>=0;h--) {
		System.out.print(word.charAt(h));
	}
	System.out.println();
	//int n;
	for(int n=1;n<=10;n++) {
		System.out.print(" * ");
	}
	System.out.println();
	
	for(int j=10;j>=0;j--) {
		System.out.println(j+", ");
	}
	System.out.println();
	for(int g =0;g<50;g++) {
		if(g%2==1) {
			System.out.print(g+" ");
		}
	}
	
	System.out.println();
	String[]fruits=new String[3];
	fruits[0]="apples";
	fruits[1]="pears";
	fruits[2]="oranges";
	
	for(int i=0;i<3;i++) {
		System.out.println(fruits[i]);
	}
	
}
}
