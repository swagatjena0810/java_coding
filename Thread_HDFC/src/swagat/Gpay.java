package swagat;

public class Gpay extends Thread{
	HDFC account;
	Gpay(HDFC account){
		this.account=account;
	}
	@Override
	public void run() {
		
		System.out.println("Gpay Thread");
		account.Deposit(8000);
	}
}
