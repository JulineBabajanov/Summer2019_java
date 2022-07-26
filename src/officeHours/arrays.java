package officeHours;

public class arrays {
	public static void main(String[] args) {
		
	String [] cars= {"BMW", "WV", "audi"};
	
	String[] words = new String[5];
		//System.out.println(words[0]); null...bc 0 was not assigned yet
		words[0]="java";
		words[1]="jc++";
		words[2]="ruby";
	
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		words = new String[3];
		words[2]="python";
		System.out.println(words[2]); // null again bc not re assigned yet but then re assigned to python
		//null null null
		// 0   1     2
	}

}
