package sets;

public class TestEquals {	

		public static void main(String[] args) {
	
			Country c1 = new Country("", 66000000, 43000);
			Country c2 = new Country("", 66000000, 43000);			
			
			System.out.println(c1.equals(c2));
			
			
		}
	
}
