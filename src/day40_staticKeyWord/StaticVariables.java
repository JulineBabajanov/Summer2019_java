package day40_staticKeyWord;

public class StaticVariables {
	
	static String name;
	
	public static void main(String[] args) {
		
		staticVariables obj1= new staticVariables();
		     obj1.name="Omer";
		     System.out.println(obj1.name);
		   
		staticVariables obj2=new staticVariables();
		obj2.name="Khurshed";
		System.out.println(obj2.name);
		
		System.out.println(obj1.name);
		
		
	}

}
