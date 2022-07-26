package day26_ForEach;

import java.util.Arrays;

public class WarmUp {
	
	public static void main(String[] args) {
		/*
		Warm up:
		    1. write a program that can check if two Strings are build out of same letters
		    Ex: 
		        if str1 = "aabbbc";  str2 ="cab";
		        output: true
		        if str1 ="abcd";  str2 ="abc";
		        output: false
 */
		
String a="aabbbc", b="cabbccaabbbaa";
//a=abc if we remove duplicates and sb=cab

String a1=""; // to store all the non duplicated values from a thats why this was created

for(int j=0; j<a.length(); j++) {
	

for(int i=0; i<a.length(); i++) {
	
	if(!a1.contains("a") ) {
		a1+= a.substring(j, j+1);
	}	
	}
}

//b="cabbccaabbbaa"
System.out.println(a1);
String b1="";
for(int i=0; i<b.length (); i++) {
	if(! b1.contains ( b.substring(i, i+1))){
		b1+=b.substring(i, i+1);
	}
}
System.out.println(b1);

char[] ch1 =a1.toCharArray();
//String str1= Arrays.deepToString(a)
System.out.println(Arrays.toString(ch1));

char[] ch2=b1.toCharArray();
System.out.println(Arrays.toString(ch2));
Arrays.sort(ch1);
Arrays.sort(ch2);

System.out.println(Arrays.toString(ch1));
System.out.println(Arrays.toString(ch2));

String str1=Arrays.toString(ch1);
String str2=Arrays.toString(ch2);





		
		
		
		
		
	}

}
