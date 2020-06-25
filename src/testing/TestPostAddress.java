package testing;

import entities.Address;
import entities.Person;

public class TestPostAddress {

	public static void main(String[] args) {
		
		Address address1 = new Address();
		
		address1.streetNumber = 5;
		address1.streetName = "Telford Way";
		address1.postCode = 34000;
		address1.city = "Montpellier";
		
		Person person1 = new Person();
		
		person1.surname = "Davies";
		person1.prename = "Tom";
		person1.address = address1;
		
		Address address2 = new Address();
		
		address2.streetNumber = 10;
		address2.streetName = "Chester Way";
		address2.postCode = 75000;
		address2.city = "Paris";	
		
		Person person2 = new Person();
		
		person2.surname = "Pickford";
		person2.prename = "Joe";
		person2.address = address2;

	}

}
