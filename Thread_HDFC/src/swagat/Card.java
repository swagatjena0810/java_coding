package swagat;

public class Card extends Thread {
	HDFC account;
	public Card(HDFC account) {
		this.account=account;
	}
	@Override
	public void run() {
		System.out.println("Card");
		account.Withdraw(2000);
	}

}
