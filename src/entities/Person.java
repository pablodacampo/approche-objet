package entities;

public class Person {
	
	public String surname;
	public String prename;
	public Address address;
	
	public static String race = "Human";
	
	public Person( String newSurname, String newPrename, Address newAddress) {
		
		this.surname = newSurname;
		this.prename = newPrename;
		this.address = newAddress;
		
	}


	public String getName() {
		return race + " " + prename + " " + surname.toUpperCase();
	}	
	
	public void setSurname(String modS) {
		this.surname = modS;		
		
	}	
	
	public void setPrename(String modP) {
		this.prename = modP;		
		
	}
	
	public void setAddress(Address modA) {
		this.address = modA;		
		
	}	
	
	public String getSurname() {
		return surname;	
		
	}	
	
	public String getPrename() {
		return prename;		
		
	}
	
	public Address getAddress() {
		return address;		
		
	}
}

/** public class Method {
	
	String display( String prename, String surname ) {
		String d = "String prename " + "String surname.toUpperCase";
	}
	
}	

public class TestMethod {
	
	public static void main(String[] args) {
		Method m = new Method();
		String result = m.display(prename, surname)
				
		System.out.println(result);
	}
} */