package s14_heranca_polimorfismo;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

//import entities.BusinessAccount;

public class UpcastingDowncasting {

	public static void main(String[] args) {
		Account myAccount = new Account(1000, "ximbas", 23.0);
		BusinessAccount myBAccount = new BusinessAccount(3000, "xongas", 0.55, 600.0);
		
		// upcasting (subclasse para superclasse)
		Account mySecondAccount = myBAccount;
		Account myThirdAccount = new BusinessAccount(4000, "xin", 0.0, 200.0);
		Account myFourthAccount = new SavingsAccount(4000, "xen", 0.0, 200.0);
		
		// downcasting (superclasse para subclasse) - precisa de casting
		BusinessAccount myFifthAccount = (BusinessAccount)myAccount;
		// não pode haver casting para outra subclasse (a linha abaixo dá erro)
		BusinessAccount mySixthAccount = (BusinessAccount)myFourthAccount;
	}

}
