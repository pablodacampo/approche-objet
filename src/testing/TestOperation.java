package testing;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		
		Operation operations[] = new Operation[8];
		
		operations[0] = new Credit("01/01/2020", 200.01);
		operations[1] = new Credit("01/03/2020", 100.01);
		operations[2] = new Credit("01/05/2020", 300.01);
		operations[3] = new Credit("25/06/2020", 50.01);
		
		
		operations[4] = new Debit("01/01/2020", 30.11);
		operations[5] = new Debit("01/03/2020", 70.21);
		operations[6] = new Debit("01/05/2020", 100.31);
		operations[7] = new Debit("25/06/2020", 60.66);
		
		
		double balance = 0;
		for(int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);
			
			if(operations[i].getType().equals("ACC. CREDIT : ")) {
				balance += operations[i].getAmount();
						
			}	else {
				
				balance -= operations[i].getAmount();
			}
		}
		

		System.out.println("The Account Balance is : " + balance );
		
	}

}
