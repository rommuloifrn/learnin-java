package s14_heranca_polimorfismo;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Override {

	public static void main(String[] args) {
		
		Account myAccount = new Account(1001, "xong", 1000.0);
		myAccount.withdraw(200.0);
		System.out.println(myAccount.getBalance());
		
		Account mySecondAccount = new SavingsAccount(1002, "ximbas", 1000.0, 00.01);
		mySecondAccount.withdraw(200.0);
		System.out.println(mySecondAccount.getBalance());
		
		Account myThirdAccount = new BusinessAccount(1003, "betin", 1000.0, 500.0);
		myThirdAccount.withdraw(200.0);
		System.out.println(myThirdAccount.getBalance());
	}

}
