package com.java.program;

class Address{
	private int pincode;
	private String name;
public int getPincode() {
	return pincode;
}
public  void setPincode(int pincode){
	this.pincode = pincode;
}
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
	
}
}

public  class P030_EncapsulationProgram extends Address{
	
	public static void main(String [] args) {
		Address obj = new Address();
		obj.setPincode(639006);
		obj.setName("Allan");
		System.out.println(obj.getPincode());
		System.out.println(obj.getName());
		
	}
	
	}



