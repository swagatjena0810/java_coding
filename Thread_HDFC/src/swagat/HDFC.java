package swagat;

public class HDFC {
	double balance;
	
	public HDFC(double balance) {
		this.balance=balance;
	}
	
	public synchronized void Withdraw(double withdrawAmount) {
		this.balance-=withdrawAmount;
	}
	public synchronized void Deposit(double depositAmount) {
		this.balance+=depositAmount;
	}
}
