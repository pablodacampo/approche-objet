package testing;

import entities.Address;
import entities.Person;

public class TestPerson {

	public static void main(String[] args) {

		Address address1 = new Address( 5, "Telford Way", 34000, "Montpellier" );
		
		Address address2 = new Address( 10, "Chester Way", 75000, "Paris" );
		
		Person person1 = new Person( "Davies", "Tom", address1 );		
	
		Person person2 = new Person( "Pickford", "Joe", address2 );
		
		System.out.println(person1);
		System.out.println(person2);
		

	}

}
