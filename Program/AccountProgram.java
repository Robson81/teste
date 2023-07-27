package Program;

import Entities.Account;
import Entities.BusinesAccount;
import Entities.SavingAccount;

public class AccountProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*Account acc = new Account("Alex Green ", 1001, 0.0);
	
	BusinesAccount bacc = new BusinesAccount("Maria Brow", 1002 , 0.0, 500.0);
	
	//UPCASTING
	
	Account acc1 = bacc;
	Account acc2 = new BusinesAccount("Bob Snow", 1003, 0.0, 200.0);
	Account acc3 = new SavingAccount("Ana Stark", 1004, 0.0, 0.01);
	
	//DOWNCASTING
	
	BusinesAccount acc4 = (BusinesAccount)acc2;
	
	acc4.loanLimit(100.0);
	
	if(acc3 instanceof BusinesAccount) {
		
		BusinesAccount acc5 = (BusinesAccount)acc3;
		acc5.loanLimit(200.0);
		
		System.out.println("Loan!");
	}
	
if(acc3 instanceof SavingAccount) {
		
	SavingAccount acc5 = (SavingAccount)acc3;
		acc5.updateBalance();
		
		System.out.println("Update!");
	}*/
	
	Account acc1 = new Account("Alex", 1001, 1000.0);
	
	acc1.withDraw(200.0);
	System.out.println(acc1.getBalance());
	
	Account acc2 = new SavingAccount("Maria", 1002, 1000.0, 0.01);
	
	acc2.withDraw(200.0);
	System.out.println(acc2.getBalance());
	
	Account acc3 = new BusinesAccount("Bob", 1002, 1000.0, 0.01);
	
	acc3.withDraw(200.0);
	System.out.println(acc3.getBalance());
	}

}
