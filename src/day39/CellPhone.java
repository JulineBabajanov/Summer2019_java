package day39;

public class CellPhone {
/* instance variable: created and declared outside any methods, within the class it must be created. Storing data within the (object)
 *                    instance variables are also called fields.
 * instance methods: methods that does not have static specifier. You must have a return type. Should be called through the (object)
 * 
 * local variables: created within the methods. Not visible outside the methods. can only be used within the method.
 */ this. : used for calling instance variable
	String brand;
	double price;
	String color;
	double screensize;
	String model;
	
	public CellPhone() { //set up default values for attributes of the class
		
		
	}
	
	public CellPhone(String brand, double price, String color, double screensize, String model) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.screensize=screensize;
		this.model=model
	}
	
	public void cal(long PhoneNumber) {
		System.out.println(brand+" "+model+" is calling "+PhoneNumber);
	}
	public void SendMessage (long PhoneNumber) {
		System.out.println("Sending messages to "+PhoneNumber);
	}
	
	public void getInfo() {
		System.out.println(brand+" "+model+" "+color+" "+screensize+" $"+price);
		
		
	}
}
