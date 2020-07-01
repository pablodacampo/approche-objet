package fr.diginamic.banque.entites;

public class Compte {

		private String numAccount;
		private double balance;
		
		public Compte(String numAccount, double balance) {
			this.numAccount = numAccount;
			this.balance = balance;
		}
		
		public String toString() {
			return "Your Account Number is : " + numAccount + " & " + "Your Current Balance is : €" + balance;
		}

		String getNumAccount() {
			return numAccount;
		}

		void setNumAccount(String numAccount) {
			this.numAccount = numAccount;
		}

		double getBalance() {
			return balance;
		}

		void setBalance(double balance) {
			this.balance = balance;
		}
	}


