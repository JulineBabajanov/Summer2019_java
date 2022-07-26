package day22_nestedLoop;

public class warmUp {
public static void main(String[] args) {
	
	/*write a program which prints out the numbers from 1 to 30:
	 * 1. for numbers which are divisible by 3, print "FIN" instead of the number.
	 * 2. for numbers which are divisible by 5, print "RA" instead of the number
	 * 3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number DO NOT USE FOR LOOP
	 * 
	 * ***write a program that can check if the String is plaindrome. if its print "true", otherwise print "false" DO NOT USE FOR LOOP
	 * 1 2 FIN 4 RA FIN ..... FINRA
	 */
	/*String str="";
	int l = 1;
	while(l<=30 ) {
	if(l % 3 == 0 && l % 5 == 0) {
		str+="FINRA ";
	}else if(l % 3 == 0) {
			str+="FIN ";
		}else if(l % 5 == 0) {
			str+="RA ";	
		}else {
			str+=l+" ";
		}
	
		l++;
	}
*///System.out.println(str);
	
	
	//for(int i =1; i<=30; i++) {
		//System.out.println();
	//}
String str="";
int l = 1;
while(l<=30) {

     str += (l % 3 == 0 && l % 5 == 0)?  "FINRA ":
            (l%3==0)?"FIN " : (l%5==0)? "RA ": l+" ";

    l++;
}
System.out.println(str);
}
}
