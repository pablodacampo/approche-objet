package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, double amount) {
		super(date, amount);	
	}
		
	@Override
	public String getType() {
		return "ACC. DEBIT : ";
	}
	
	@Override
	public String toString() {
		return getType() + " Date of Action : " + getDate() + ", Amount of Action : " + getAmount();
	}
}
