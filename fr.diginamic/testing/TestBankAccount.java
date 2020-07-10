package testing;

import entities.Address;
import entities.BankAccount;
import entities.Person;

public class TestBankAccount {

	public static void main(String[] args) {
		

		Address rueD = new Address(50, "Rue Doris", 34000, "Montpellier");
		
		Person daveJ = new Person("Jones", "Dave", rueD );
		
		BankAccount bankAccount = new BankAccount("FR0124578M", 200.01, daveJ);
		
		System.out.println(bankAccount.toString());
		
		System.out.println("Your new balance is : "+ bankAccount.creditAmount(90));
				
		System.out.println("Your new balance is : "+ bankAccount.debitAmount(50));
		
		System.out.println(bankAccount.toString());

	}

}
