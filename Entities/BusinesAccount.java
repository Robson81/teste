package Entities;

public class BusinesAccount extends Account {

private Double loanLimit;

public BusinesAccount() {
	super();
}

public BusinesAccount(String holder, Integer number, Double balance, Double loanLimit) {
	super(holder, number, balance);
	this.loanLimit = loanLimit;
}

public Double getLoanLimit() {
	return loanLimit;
}

public void setLoanLimit(Double loanLimit) {
	this.loanLimit = loanLimit;
}
public void loanLimit(double amount) {
	if(amount<=loanLimit) {
		balance += amount - 10; 
		
	}
}

@Override
public void withDraw(double withDraw) {
	super.withDraw(withDraw);
	balance -= 2.0;
}



}
