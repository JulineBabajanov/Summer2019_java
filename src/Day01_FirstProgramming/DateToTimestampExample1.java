package Day01_FirstProgramming;
import java.sql.Timestamp;    
import java.util.Date;  
public class DateToTimestampExample1 {
	 public static void main(String args[]){
	//import java.sql.Timestamp;    
	//import java.util.Date;    
	   
	      // public static void main(String args[]){    
	                Date date = new Date();  
	                Timestamp ts=new Timestamp(date.getTime());  
	                System.out.println(ts); 
	
}
}