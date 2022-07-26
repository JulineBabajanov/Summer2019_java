package officeHours;

public class printEachLetter {
public static void main(String[] args) {
	
	String[] cars= {"audi", "bmw", "toyota"};
	 //              0123    012    012345 //inner variable
	//               0        1      2  //i variable
	//System.out.println();
	for(int i =0; i<=cars.length-1; i++) {
		System.out.println(cars[i]+" ");
		//System.out.println();
		for(int inner=0; inner<=cars[i].length()-1;inner++) {
			System.out.print(cars[i].charAt(inner)+" ");
		}
		System.out.println();
	}
}
}
