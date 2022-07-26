package day17_StringContinued;

public class StringMethods2 {
public static void main(String[] args) {
	
	/* replace (old char, new char);
	 *        replaces all the old char values with the
	 *         given new char value in the String and returns it as 
	 *         a NEW String value.
	 * 
	 */
	
	    String str1 = "Java is Fun Programming Language";
	           str1 = str1.replace('a', 'e');
	           System.out.println(str1);
	           
	    String name = "Amina Aziza and Abraham are brother and sisters!";
	    		name = name.replace('A', 'B');
	    		System.out.println(name);
	    		
	   /* replace (old str, new str)
	    *      replace all the old str values with the given new str values
	    * 
	    *  
	    *  		
	    */
	    		
	    	String str2 = "Today is gonna be a great day to learn java";
	    	       str2 = str2.replace("Today", "Tomorrow");
	    	       System.out.println(str2);
	    	       str2 = str2.replace("java", "");//deleted java
	    	       System.out.println(str2);
	    	       
	        String sit = "Today we will sit down and relax";
	               sit = sit.replace("Today", "Never");
	               System.out.println(sit);
	               
	         String down = "Down went the boy on the slide and Down went his sister after him then Down went their friend";
	                down = down.replace("Down", "Over");
	                System.out.println(down);
	    	       
	    	       /* replaceFirst();
	    	        *    it replaces the first ouccured old str
	    	        *    with the new str in the String and returns it as a NEW String value.
	    	        * 
	    	        * 
	    	        */
	    	       
	    	       String s1 = "Java is fun, Java is good"; //Python is fun, Java is good
	    	       //                              S G
	    	       s1 = s1.replaceFirst("Java", "Python");
	    	       System.out.println(s1);
	    	       s1 = s1.replace("is good", "iS GooD");
	    	       System.out.println(s1);  //Python is fun, Java is GooD
	    	       
	    	       String s3 = "Hello World, How are you?";
	    	       s3 = s3.replaceFirst("Hello", "Holllla");
	    	       System.out.println(s3); //Holla World, How are you
	    	      
	    	       String prac = "Practice is important and Practice is good";
	    	             prac = prac.replaceFirst("Practice", "practice");
	    	             System.out.println(prac); //practice is important and Practice is good
	    	       		
	    	       String prac1 = "the world is going Round and round";
	    	             prac1 = prac1.replaceFirst("world", "WORLD");
	    	             System.out.println(prac1);
	    	     
	    	    String prac2 = "Today is going to be a good is day";         
	    		 prac2 = prac2.replaceFirst("is", "");
	    		System.out.println(prac2);
	    		
	    String s2 = "Java is programming language, Java is Java";
	           s2 = s2.replaceFirst("Java is J", "C# is J");
	           System.out.println(s2);
	    		
	    	String q4 = "Hello How are you doing today, I just wanted to know";
	    	      q4 = q4.replaceFirst("Hello", "Hola!");
	    	      System.out.println(q4);
	    		
	    		
	    		
	    		
	    		
}
}
