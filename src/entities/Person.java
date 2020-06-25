package entities;

public class Person {
	
	public String surname;
	public String prename;
	public Address address;
	
	public Person( String newSurname, String newPrename, Address newAddress) {
		
		this.surname = newSurname;
		this.prename = newPrename;
		this.address = newAddress;
		
	}

	
}
