package day18_StringMethodsCont;

public class StringMethods_Boolean {
public static void main(String[] args) {
	
	/*isEmpty(): checks if the String is empty
	 *  returns boolean expressions
	 * empty==> true, !empty ==> false
	 */
	
	String str = "Cybertek";
    boolean R1 = str.isEmpty(); //false
    System.out.println(R1);     //false
      
    String str2 = "";
       if(!str2.isEmpty()) {
    	   //!str2 == not empty
    	   //str2 == empty
    	   System.out.println("its empty String"); 
    	   
       }else {
    	   System.out.println("it's not empty");
       }
       
       /*equals(str): checks if the two Strings visible text 
        * are equal or not then returns boolean expression
        * equal==true !equal==false
        */
          String A1 = "Cybertek";
          String A2 = new String("Cybertek");
          System.out.println(A1 == A2); //two different objects because A1 is in string pool and A2 is in java heap
       
     boolean R2 = A1.equals(A2); //.equals checks only visible text and == checks memory
     System.out.println(R2);
	 System.out.println("java".equals("Java")); //false bc of case sensitivity
	 
	 /*equalsIgnoreCase(str):
	  *Case sensitivity does not matter when you use equals method
	  * 
	  */
	 
	 String s1 = "JAVA";
	 String s2 = new String("java");
	 System.out.println(s1==s2); //false case sensitivty and different memories
	 System.out.println(s1.equals(s2)); //false, case sensitity
	 System.out.println(s1.equalsIgnoreCase(s2));// doesnt check memory location. only visible text.  //true
	 
	 /*.contains(str): checks if str is contained in string or not, then returns boolean expression
	  * 
	  * contained ==> true    !contained ==>false
	  * 
	  */
	 String name = "Muhtar";
	 boolean Result =  name.contains("uh"); //false
	  System.out.println(Result);
	 
	 /*startsWith("str");  checks if the String is started with the str or not
	  * then returns boolean expressions
	  * 
	  * startedwith ==> true      !startedwith == false
	  */
	 
	 String Today = "Java";
	 Today.startsWith("j");
	 boolean Result2 = Today.startsWith("J"); //true
	 System.out.println(Result2);
	
	 String names = "Cybertek School is great place to learn java";
	 System.out.println(names.startsWith("Cybertek School")); //true
	 System.out.println(names.endsWith("learn java"));
	 System.out.println(names.contains("ace"));
	 
	 /*endsWith(str); checks if the String is ending with the given str or not,
	  *  then returns boolean expression
	  * ends with == true  !endswith==false
	  */
	 
	 String B1 = "Muhtar";
	 System.out.println(B1.endsWith("r"));
	 String B2 = new String("muhtar");
	// B2 = B1.equalsIgnoreCase(B2);
	
	 
	 
	 
	 
	 
	 
	 

}
}
