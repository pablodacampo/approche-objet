package banque;

public class Credit extends Operation {

	public Credit(String date, double amount) {
		super(date, amount);		
	}
	
	@Override
	public String getType() {
		return "ACC. CREDIT : ";
	}
	
	@Override
	public String toString() {
		return getType() + " Date of Action : " + getDate() + ", Amount of Action : " + getAmount();
	}
	
}
