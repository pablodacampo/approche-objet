
package banque;

public abstract class Operation {	


	private String date;
	private double amount;

	public Operation(String date, double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}	
	
	public abstract String getType();

	@Override
	public String toString() {
		return "Operation [date=" + date + ", amount=" + amount + "]";
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
