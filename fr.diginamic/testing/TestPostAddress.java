package testing;

import entities.Address;

public class TestPostAddress {

	public static void main(String[] args) {
		
		Address address1 = new Address( 5, "Telford Way", 34000, "Montpellier" );
		
		Address address2 = new Address( 10, "Chester Way", 75000, "Paris" );
		
		 System.out.println(address1);
		 System.out.println(address2);

	}

}
