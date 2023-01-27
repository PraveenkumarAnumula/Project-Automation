package call_by_reference;

import practice.CallbyValue;

public class Product 
{
	
public String name="ONEPLUS";
public double price=40000.00;
public void Select() 
{
	System.out.println("the product has been selected");
}
public String Getdetails() 
{
	return "64gb, 8gb ram";

}
public CallbyValue name() {
	return new CallbyValue();
		}

	
}

