package officeHours;

public class forLoop {
public static void main(String[] args) {
	

	//0-3
	for(int t=0;t<=3;t++) {
		System.out.print(t+" ");
	}
	System.out.println();
	
	
	for(int i = 1; i<=10; i++) {
		if(i%2==1) {
			System.out.println("odd numbers 1-11 are "+i);	
		}
		
	}
	
	for(int l=1; l<=10;l++) {
		if(l%2==0) {
			System.out.print(l+ " ");
		}
	}
	System.out.println();
	
	for(int p=100; p>=97;p--) {
		System.out.println(p);
	}
	
	//5 day, 10 times jumping each day
	
	for(int day=1; day<=5; day++) {
		
		for(int jump=1;jump<=10;jump++) {
			System.out.println("day "+day+" with "+jump+" jump(s) ");
		}
	}
	
	String language = "java";
	System.out.print(language.charAt(0));
	System.out.print(language.charAt(1));
	System.out.print(language.charAt(2));
	System.out.print(language.charAt(3));
	
	System.out.println();
	
	for(int i = 0; i<=3;i++) {
		System.out.print(language.charAt(i));
	}

	
	
	String word1="JAVA";
	for(int b=0;b>=3;b--) {
		System.out.print(word1);
	}
}
}
