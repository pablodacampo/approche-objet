package fr.diginamic.banque.entites;

public class SavingsAccount extends Compte{

	private double tax;
	
	public SavingsAccount(String numAccount, double balance, double tax) {
		super(numAccount, balance);
		this.tax = tax;
	}
	
		public String toString() {
		return super.toString() + " Your Tax interest is : €" + tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
