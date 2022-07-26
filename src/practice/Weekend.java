package practice;

public class Weekend {
public static void main(String[] args) {
    
	
	int start=0;
    int sum=0;
	while(start <= 10) {
		if(start %2 == 0 ) {
			sum=sum+start; //sum+=start  //sum 30    start 11
		}
		start++ ;
	}
	
	System.out.println(sum);
	System.out.println(start);
	
}
	
	
	
}
