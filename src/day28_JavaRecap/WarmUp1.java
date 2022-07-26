package day28_JavaRecap;

public class WarmUp1 {



/* w. write a method that can convert km to miles
 * 1 km=0.612 miles
 * 
 * 2 write a method that can convert gallons to litters
 * 1 G=3.75L
 */
public static void main(String[] args) {
	//KmToMiles();// not enough infor for the method to persofm its tasks
	KmToMiles(1000); //KmToMiles(10.0);
	
}

public static void KmToMiles(double KM) {
	//KmToMiles(); //

	double Miles=KM *0.612;
	System.out.println(KM+" equals to " +Miles+ " miles");

}









}