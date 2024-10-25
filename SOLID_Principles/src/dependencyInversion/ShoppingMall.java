package dependencyInversion;

public class ShoppingMall {
	private Payment payment;
	
	public ShoppingMall(Payment payment) {
		this.payment=payment;
	}
	
	public void doPurchase(Long amount) {
		payment.doPayment(amount);
	}
	
	public static void main(String[] args) {
		Payment payment=new DebitCard();
		ShoppingMall mall=new ShoppingMall(payment);
		mall.doPurchase(5000l);
	}
}
