package day23_Arrays;

public class WarmUp2Again {

	public static void main(String[] args) {
		
		String str="HELLO HOW ARE YOU TODAY AND ALL THE LETTERS";
		String unique="";
		
		for(int j= 0; j<str.length();j++) {
			int count=0;
			for(int i =0; i<str.length();i++) {
				if(str.substring(i, i+1).equals(""+str.charAt(j))) {
					                         //str.substring(j, j+1)
					count++;
				}
			}
			if(count==1) {
				unique+=""+str.charAt(j);
			}
		}
		System.out.println(unique);
		
	}	
}
