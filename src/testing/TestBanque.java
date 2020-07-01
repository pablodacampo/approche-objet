package testing;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.SavingsAccount;

class TestBanque {

	public static void main(String[] args) {
		
		Compte[] arrayAccount = new Compte[2];
		arrayAccount[0] = new Compte("4632A1000FR", 500.57);
		arrayAccount[1] = new SavingsAccount("0032A1000FR", 20.57, 0.15);
		
		for(int i = 0; i <= arrayAccount.length-1; i++) {
			System.out.println(arrayAccount[i]);
		}
		
	}

}
