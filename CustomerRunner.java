package com.siddhi.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line1", "Aurangabad", "8562");
		Customer ob = new Customer("Siddhi", homeAddress);
		
		//System.out.println(ob);
		
		Address workAddress = new Address("line2", "Pune", "85624");
		ob.setWorkAddress(workAddress);
		
		System.out.println(ob);
	}

}
