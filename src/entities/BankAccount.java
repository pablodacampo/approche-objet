package entities;

public class BankAccount {
	
	private String numAccount;
	private double balance;
	private Person person;

	public BankAccount(String numAccount, double balance, Person person) {
		this.numAccount = numAccount;
		this.balance = balance;
		this.person = person;
	}
	
	public double creditAmount(double amount) {
	    this.balance += amount;
	    return balance;
	}
	
	public double debitAmount(double amount) {
	    this.balance -= amount;
	    return balance;
	}
	
	public String toString() {
		return "Your Account Number is : " + numAccount + " & " + "Your Current Balance is : €" + balance;
	}

	public String getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(String numAccount) {
		this.numAccount = numAccount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

		
	

}
