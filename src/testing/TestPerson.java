package testing;

import entities.Address;
import entities.Person;

public class TestPerson {

	public static void main(String[] args) {

		Address address1 = new Address( 5, "Telford Way", 34000, "Montpellier" );
		
		Address address2 = new Address( 10, "Chester Way", 75000, "Paris" );
		
		Person person1 = new Person( "Davies", "Tom", address1 );		
	
		Person person2 = new Person( "Pickford", "Joe", address2 );
		
		String id1 = person1.getName();
		String id2 = person2.getName();
		
		System.out.println(id1);
		System.out.println(id2);		
		
		person1.setSurname("Champion");
		System.out.println(person1.getName());
		
		Address addPerson2 = person2.getAddress();
		
		System.out.println(addPerson2);

	
		

	}

}
