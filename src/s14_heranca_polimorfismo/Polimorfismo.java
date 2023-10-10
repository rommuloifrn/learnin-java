package s14_heranca_polimorfismo;

import entities.Account;
import entities.SavingsAccount;

public class Polimorfismo {

	public static void main(String[] args) {
		Account myAccount = new Account(4000, "xin", 1000.00);
		Account mySecondAccount = new SavingsAccount(4000, "xen", 1000.00, 0.01);
		
		myAccount.withdraw(50.0);
		mySecondAccount.withdraw(50.0);
		
		// resultados diferentes!
		System.out.println(myAccount.getBalance());
		System.out.println(mySecondAccount.getBalance());
	}

}
