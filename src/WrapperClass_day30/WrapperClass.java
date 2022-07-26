package WrapperClass_day30;

public class WrapperClass {

}
/*every primitives in java has a class thats designed to it
 * 
 * primitives: byte, short, int, long, float, double, boolean, char
 * 
 * wrapper classes: Byte, short, integer, long, float, double, boolean, character
 * 
 * all wrapper class presented in "java.lang" package
 * String class is also presented in "java.lang" package
 * 
 * primitives                       wrapper classes
 * byte                                Byte  null
 * short          autoboxing           Short  null
 * int              ====>              Integer null
 * long                                Long     null
 * float           unboxing            Float    null
 * double           <=====             Double    null
 * boolean                             Boolean  null
 * char                                Character  null
 * 
 * Auto boxing: converting primitive values to Wrapper class
 * UnBoxing:
 * default values of primitives: byte, short, int, long ==>0;
 * double, float==> 0.0
 * boolean==>false
 * char==>space
 */
 public static void main (String[] args) {
	 int numInt=10;
	 Integer numInteger=10;
	 
	 double numdouble=5.5;
	 Double numDouble=5.5;
	 
	 long numlong=20L;
	 Long numLong=numlong;
 }