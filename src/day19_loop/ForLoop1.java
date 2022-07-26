package day19_loop;

public class ForLoop1 {
public static void main(String[] args) {
	
	/*for (initialization; condition; iterator){
	 *   statements that want to be repeated
	 *   }
	 */
	/*for(int i = 0; true; i++) {
		System.out.println(" ~It is cold outside");
		System.out.println(" Hello");
		}
	*/
	//loop is used for repeating actions. if condition is "true" then there will be no false and will keep repeating.
	//initialization- usually the times of the number that we wanna execute the loop ex int i=0;
	//condition- condition is created based on initialization(starting point) ex:i<10 || true;
	//iterator- co-related to the condition i++... it should run long enough and either increases or decreases the value of initilization.
	//then eventually the condition comes false. EX: i++, i+=2, ++i, i-- 
	//iterator is not mandatory 
	
	for(int i = 0; i<=10; i+=2 ) {
		System.out.println("Value of i is: "+i);
}
	System.out.println("Winter is here");
}
}